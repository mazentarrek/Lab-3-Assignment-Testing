import static org.junit.jupiter.api.Assertions.*;

class CoffeeMachineTest {

    @org.junit.jupiter.api.Test
    public void test1() {
        CoffeeMachine c = new CoffeeMachine();
        assertEquals("Power on" + "Lights on",c.OpenCoffeeMachine());
        assertEquals("You successfully added money into the machine",c.insertMoney(30));
    }

    @org.junit.jupiter.api.Test
    public void test2() {
        CoffeeMachine c = new CoffeeMachine();
        assertEquals("Power on" + "Lights on", c.OpenCoffeeMachine());
    }
    @org.junit.jupiter.api.Test
    public void test3() {
        CoffeeMachine c = new CoffeeMachine();
        c.power_status = true;
        assertEquals("Error!", c.OpenCoffeeMachine());
    }
    @org.junit.jupiter.api.Test
    public void test4(){
        CoffeeMachine c = new CoffeeMachine();
        assertEquals("Power on" + "Lights on",c.OpenCoffeeMachine());
        assertEquals("You successfully added money into the machine",c.insertMoney(30));
        assertEquals("Power off" + "Lights off",c.closeMachine());
    }

    @org.junit.jupiter.api.Test
    public void test5() {
        CoffeeMachine c = new CoffeeMachine();
        c.OpenCoffeeMachine();
        assertEquals("You successfully added money into the machine", c.insertMoney(30));
    }

    @org.junit.jupiter.api.Test
    public void test6() {
        CoffeeMachine c = new CoffeeMachine();
        assertEquals("Machine is turned off. Please turn on", c.insertMoney(30));
    }
    @org.junit.jupiter.api.Test
    public void test7() {
        CoffeeMachine c = new CoffeeMachine();
        c.OpenCoffeeMachine();
        c.closeMachine();
        assertEquals("Machine is turned off. Please turn on", c.insertMoney(30));
    }
    @org.junit.jupiter.api.Test
    public void test8(){
        CoffeeMachine c = new CoffeeMachine();
        assertEquals("Machine is turned off. Please turn on",c.makeCoffee(2));
    }
    @org.junit.jupiter.api.Test
    public void test9(){
        CoffeeMachine c = new CoffeeMachine();
        assertEquals("Power on" + "Lights on",c.OpenCoffeeMachine());
        assertEquals("You successfully added money into the machine",c.insertMoney(30));
        assertEquals(1+ "Coffee was successfully made",c.makeCoffee(3));
    }
    @org.junit.jupiter.api.Test
    public void test10(){
        CoffeeMachine c = new CoffeeMachine();
        assertEquals("Power on" + "Lights on",c.OpenCoffeeMachine());
        assertEquals("You successfully added money into the machine",c.insertMoney(60));
        assertEquals(3+ "Coffee was successfully made",c.makeCoffee(4));
    }
    @org.junit.jupiter.api.Test
    public void test11(){
        CoffeeMachine c = new CoffeeMachine();
        assertEquals("Power on" + "Lights on",c.OpenCoffeeMachine());
        assertEquals("You successfully added money into the machine",c.insertMoney(30));
        assertEquals(1+ "Coffee was successfully made",c.makeCoffee(1));
    }
}

