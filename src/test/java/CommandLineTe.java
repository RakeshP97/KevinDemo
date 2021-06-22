import org.junit.jupiter.api.Test;

public class CommandLineTe {

    @Test
    public void test_agentConnected(){
        //String agentNo = System.getProperty("agentNo");
        //CmdTest1 cmdTest1 = new CmdTest1();
        String agentNo = CmdTest.getAgentNo();

        System.out.println("Assert agentNoConnected::"+ agentNo);
    }
}
