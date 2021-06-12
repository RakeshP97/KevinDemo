import org.junit.Test;

/**
 * Add Classpath env variable
 * %JAVA_HOME%\lib;%JRE_HOME%\lib;C:\Data\DEMO\KevinMaven\libraires;
 *
 *
 * Compile by using
 * C:\Data\DEMO\KevinMaven>javac -cp "C:\Data\DEMO\KevinMaven\libraires\*" src\test\java\CmdTest.java
 *
 * Running a test class
 *
 *C:\Data\DEMO\KevinMaven>java -jar -Durl=https://amazon.com -DuserName=Kevin -Dpassword=dias123 C:\Data\DEMO\KevinMaven\libraires\junit-platform-console-standalone-1.6.2.jar --class-path src\test\java --scan-class-path
 */
public class CmdTest {


    @Test
    public void test_cmd(){
        String url = System.getProperty("url");
        String userName = System.getProperty("userName");
        String password = System.getProperty("password");

        System.out.println("Requested URL::"+ url);
        System.out.println("User trying to loggin ::"+ userName);
        System.out.println("Password used::"+ password);
    }


    @Test
    public void test_cmd2(){
        String url = System.getProperty("url");
        String userName = System.getProperty("userName");
        String password = System.getProperty("password");

        System.out.println("Requested URL::"+ url);
        System.out.println("User trying to loggin ::"+ userName);
        System.out.println("Password used::"+ password);
    }
}
