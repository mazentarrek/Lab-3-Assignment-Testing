import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATM_machine_machineTest {

        @Test
        public void test1(){
            ATM_machine a = new ATM_machine();
            a.iscardValid = false;
            assertEquals("Card Invalid",a.enterCard());
        }
        @Test
        public void test2(){
            ATM_machine a = new ATM_machine();
            assertEquals("Card Validated",a.enterCard());
        }
        @Test
        public void test3(){
            ATM_machine a = new ATM_machine();
            assertEquals("Login Unsuccessful",a.enterPassword());
        }
        @Test
        public void test4(){
            ATM_machine a = new ATM_machine();
            assertEquals("Card Validated",a.enterCard());
            a.ispasswordValid = false;
            assertEquals("Login Unsuccessful",a.enterPassword());
        }
        @Test
        public void test5(){
            ATM_machine a = new ATM_machine();
            assertEquals("Card Validated",a.enterCard());
            assertEquals("Login Unsuccessful",a.enterPassword());
            assertEquals("Enter valid amount",a.deposit_Money(20));
            assertEquals("Insufficient balance",a.withdraw_Money(10));
        }
        @Test
        public void test6(){
            ATM_machine a = new ATM_machine();
            assertEquals("Card Validated",a.enterCard());
            assertEquals("Login Unsuccessful",a.enterPassword());
            assertEquals("Deposit successfully made",a.deposit_Money(100));
            assertEquals("Withdraw made successfully",a.withdraw_Money(50));
        }
        @Test
        public void test7(){
            ATM_machine a = new ATM_machine();
            assertEquals("Card Validated",a.enterCard());
            assertEquals("Login Unsuccessful",a.enterPassword());
            assertEquals("Deposit successfully made",a.deposit_Money(500));
            assertEquals("Withdraw made successfully",a.withdraw_Money(10));
        }
        @Test
        public void test8(){
            ATM_machine a = new ATM_machine();
            assertEquals("Card Validated",a.enterCard());
            assertEquals("Login Unsuccessful",a.enterPassword());
            assertEquals("Deposit successfully made",a.deposit_Money(3000));
            assertEquals("Withdraw made successfully",a.withdraw_Money(1500));
            assertEquals("Withdraw made successfully",a.withdraw_Money(1500));
        }
        @Test
        public void test9(){
            ATM_machine a = new ATM_machine();
            assertEquals("Card Validated",a.enterCard());
            assertEquals("Login Unsuccessful",a.enterPassword());
            assertEquals("Deposit successfully made",a.deposit_Money(2000));
            assertEquals("Withdraw made successfully",a.withdraw_Money(1000));
            assertEquals("Insufficient balance",a.withdraw_Money(1001));
        }
}

