import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author huanmao.sjc
 * @version $Id: MysqlClient, v 0.1 2019-12-24 12:19 PM th1s Exp $
 */
public class MysqlClient {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:33333/";

    public static void main(String[] args) {
        Connection connection = null;
        Statement stmt = null;

        try {
            Class.forName(JDBC_DRIVER);
            Properties p=new Properties();
            p.put("user","test");
            p.put("password","test");
            p.put("characterEncoding","utf-8");
//            p.put("allowLoadLocalInfile","false");
            connection = DriverManager.getConnection(DB_URL, p);
            stmt = connection.createStatement();
//            String sql = "load data local infile \"/etc/hosts\" into TABLE open_sync_biz_data;";
//            stmt.execute(sql);
        } catch (SQLException e ) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
