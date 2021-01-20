/**
 * @author huanmao.sjc
 * @version $Id: testfather, v 0.1 2019-02-21 6:54 PM th1s Exp $
 */
public class testfather {

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     *
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    private String name;

    private Object sex;

    private TestSon testSon;

    /**
     * Getter method for property <tt>testSon</tt>.
     *
     * @return property value of testSon
     */
    public TestSon getTestSon() {
        return testSon;
    }

    /**
     * Setter method for property <tt>testSon</tt>.
     *
     * @param testSon value to be assigned to property testSon
     */
    public void setTestSon(TestSon testSon) {
        this.testSon = testSon;
    }

    //public testfather(Object sex) {
    //    System.out.println("123");
    //}
    //
    //public testfather(){
    //    this.name = "testfather";
    //}
}
