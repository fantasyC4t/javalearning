/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */

import org.junit.Test;
import org.jvnet.tiger_types.Lister;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author th1s
 * @version $Id: CommonTest.java, v 0.1 2020Äê07ÔÂ20ÈÕ 11:58 AM th1s Exp $
 */
public class CommonTest {

    @Test
    public void test() {
        //Class sampleClazz = SampleClass.class;
        //Method[] methods = sampleClazz.getMethods();
        //for (Method method : methods) {
        //    Type[] genericParameterTypes = method.getGenericParameterTypes();
        //    Class<?>[] parameterTypes = method.getParameterTypes();
        //    for (int i = 0; i < genericParameterTypes.length; i++) {
                Lister l = Lister.create(test.class, test.class);
                if (l!=null) {
                    System.out.println(l.itemType);
                }
        //    }
        //}
    }
}