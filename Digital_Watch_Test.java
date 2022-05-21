import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Digital_Watch_Test {

    @Test
    void test1() {
        Digital_Watch d = new Digital_Watch();
        assertEquals("Watch has been turned on!",d.powerOn());
    }
    @Test
    public void test2(){
        Digital_Watch d = new Digital_Watch();
        assertEquals("Watch has been turned on!",d.powerOn());
        assertEquals("Watch already turned on",d.powerOn());
    }
    @Test
    public void test3(){
        Digital_Watch d = new Digital_Watch();
        assertEquals("Watch has been turned on!",d.powerOn());
        assertEquals("Watch already turned on",d.powerOn());
        assertEquals("Watch has been turned off",d.powerOff());
    }
    @Test
    public void test4(){
        Digital_Watch d = new Digital_Watch();
        assertEquals("Watch has been turned on!",d.powerOn());
        assertEquals("Timer set successfully",d.setTimer(10));
    }
    @Test
    public void test5(){
        Digital_Watch d = new Digital_Watch();
        assertEquals("Watch has been turned on!",d.powerOn());
        assertEquals("Timer set successfully",d.setTimer(10));
        assertEquals("Wait for timer",d.doOperation());
    }
    @Test
    public void test6(){
        Digital_Watch d = new Digital_Watch();
        assertEquals("Watch has been turned on!",d.powerOn());
        assertEquals("Timer set successfully",d.setTimer(10));
        d.timer_status = false;
        assertEquals("Accepted Operation",d.doOperation());
    }
    @Test
    public void test7(){
        Digital_Watch d = new Digital_Watch();
        assertEquals("Watch has been turned on!",d.powerOn());
        assertEquals("Timer set successfully",d.setTimer(10));
        d.timer_status = false;
        assertEquals("Accepted Operation",d.doOperation());
        assertEquals("Watch has been turned off",d.powerOff());
    }
}
