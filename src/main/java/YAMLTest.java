import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import deserialize.Test;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.IOException;

/**
 * @author huanmao.sjc
 * @version $Id: YAMLTest, v 0.1 2020-06-03 8:44 PM th1s Exp $
 */
public class YAMLTest {

    public static void main(String[] args) {
        // 找到new函数时就会执行的类即可。
//        String malicious = "name: {testfather: ";
//        Yaml yaml = new Yaml();            // Unsafe instance of Yaml that allows any constructor to be called.
//        Object obj = yaml.load(malicious); // Make request to http://attacker.com
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        try {
//            String yamlString = mapper.writeValueAsString(new test());
//            System.out.println(yamlString);
            Object object = mapper.readValue("name:\n" +
                    "  name: \"testfather\"", test.class);
        } catch (IOException e) {
            throw new RuntimeException("Parse yaml file failed, e={}", e);
        }
    }
}
