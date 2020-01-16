import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

/**
 * @author huanmao.sjc
 * @version $Id: ProxyTest, v 0.1 2019-02-01 11:56 AM th1s Exp $
 */
public class ProxyTest {

    public static void main(String[] args){

        Object[] elements = new Object[1000];

//        for(int i = 0; i < elements.length; i++){
//            Integer value = i + 1;
//            InvocationHandler handler = new TraceHandler(value);
//            Class[] interfaces = new Class[] { Comparable.class };
//            Object proxy = Proxy.newProxyInstance(null, interfaces, handler);
//            elements[i] = proxy;
//        }
//
//        Integer key = new Random().nextInt(elements.length) + 1;
//        int result = Arrays.binarySearch(elements, key);
//
//        if (result > 0){
//            System.out.println(elements[result]);
//        }

        String motto = "A contented mind is the greatest blessing a man can enjoy in this world";
        InvocationHandler handler = new TraceHandler(motto);
        Class[] interfaces = new Class[] { Comparable.class };
        Comparable proxy = (Comparable)Proxy.newProxyInstance(null, interfaces, handler);
        System.out.println(proxy);
//        String mottoB = (String)proxy;
    }

}

class TraceHandler implements InvocationHandler{

    private Object target;

    public TraceHandler(Object t){
        target = t;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{

        System.out.print(target);
        System.out.print("." + method.getName() + "(");

        if (args != null){
            for (int i = 0; i < args.length; i++){
                System.out.print(args[i]);
                if (i < args.length - 1) {
                    System.out.print(",");
                }
            }
        }

        System.out.println(")");

        return method.invoke(target, args);
    }
}
