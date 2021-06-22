import org.junit.Test;

public class CommandLineTest {


    @Test
    public void test_deploy(){
        System.out.println("Create a VM");
        //CmdTest1 cmdTest1 = new CmdTest1();
        String agentNo = CmdTest.getAgentNo();
        //String agentNo = System.getProperty("agentNo");
        //get agentNo;
        System.out.println("Requested agentNo::"+agentNo);
    }


}
