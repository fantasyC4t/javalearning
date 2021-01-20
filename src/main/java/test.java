import com.alibaba.fastjson.JSONArray;
import jvmtest.JVMTest;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author huanmao.sjc
 * @version $Id: test, v 0.1 2019-02-21 6:54 PM th1s Exp $
 */
public class test {

    private Object name;

    public test() {
        System.out.println("test");
    }

    public String toString() {
        System.out.println("hello");
        return "hello";
    }

    public void readObject(ObjectInputStream inputStream) {
        System.out.println("readObject invoke");
    }

    public static void main(String[] args) {
        System.out.println(JVMTest.class.getName());
    }


    public Object getName() {
        System.out.println("get");
        return name;
    }

    public void setName(Object name) {
        System.out.println("set");
        this.name = name;
    }
}
