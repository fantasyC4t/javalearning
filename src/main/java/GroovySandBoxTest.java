import com.mybank.security.groovy.GroovySandboxExpressionChecker;
import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyObject;
import org.codehaus.groovy.control.CompilerConfiguration;

/**
 * @author huanmao.sjc
 * @version $Id: GroovySandBoxTest, v 0.1 2020-04-29 1:50 PM th1s Exp $
 */
public class GroovySandBoxTest {

    public static void main(String[] args) throws Exception {
        CompilerConfiguration config = new CompilerConfiguration();
        config.addCompilationCustomizers(GroovySandboxExpressionChecker.getSecureASTCustomizer());
        GroovyClassLoader loader =  new GroovyClassLoader(Thread.currentThread().getContextClassLoader(),config);

        Class clazz = loader.parseClass("def cycle(def number){\n" +
                "           String[] datas = new String[2];\n" +
                "           List<String[]> result = new ArrayList<String[]>();\n" +
                "           datas[0] = 1;" +
                "           datas[1] = 2;" +
                "           result.add(datas);\n" +
                "    }");

        GroovyObject instance = (GroovyObject) clazz.newInstance();
        instance.invokeMethod("cycle",100);
    }
}
