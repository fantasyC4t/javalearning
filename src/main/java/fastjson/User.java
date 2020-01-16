package fastjson;

import java.util.Map;

/**
 * @author huanmao.sjc
 * @version $Id: User, v 0.1 2020-01-02 12:06 PM th1s Exp $
 */
public class User {
    private Long   id;
    private String name;

    public User() {
        System.out.println("无参构造函数调用");
    }

    public User(String a) {
        System.out.println("有参构造函数不会被调用");
    }

    public Long getId() {
        System.out.println("getId方法调用");
        return id;
    }
    public void setId(Long id) {
        System.out.println("setId方法调用");
        this.id = id;
    }
    public String getName() {
        System.out.println("getName方法调用");
        return name;
    }
    public void setName(String name) {
        System.out.println("setName方法调用");
        this.name = name;
    }

    public Map getNames() {
        System.out.println("带有get的非get函数调用");
        return null;
    }
}
