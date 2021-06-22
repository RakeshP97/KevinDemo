import org.junit.Test;
import org.junit.jupiter.api.Order;


/**
 *javac -cp "C:\Data\DEMO\KevinMaven\libraires\*" C*.java
 * 
 * java -jar -Durl=https://amazon.com -DuserName=Kevin -Dpassword=dias123 C:\Data\DEMO\KevinMaven\libraires\junit-platform-console-standalone-1.6.2.jar -cp . --scan-class-path --reports-dir=reports
 */
public class CmdTest {

    private static String agentNo;

    @Test
    @Order(1)
    public void test_setup(){
        String url = System.getProperty("url");
        String userName = System.getProperty("userName");
        String password = System.getProperty("password");

        System.out.println("Requested URL::"+ url);
        System.out.println("User trying to loggin ::"+ userName);
        System.out.println("Password used::"+ password);
    }

    @Test
    @Order(2)
    public void test_agentCreate(){
        String persist = System.getProperty("persist");
        System.out.println("Persisted agent::"+ persist);

        String file = System.getProperty("file");
        System.out.println("Persisted agent::"+ file);

        String network = System.getProperty("network");
        System.out.println("Persisted agent::"+ network);

        agentNo="222";
        //System.setProperty("agentNo", agentNo);
        System.out.println("Persisted agentNo::" +agentNo);
    }

    public static String getAgentNo() {

        return agentNo;
    }

}
