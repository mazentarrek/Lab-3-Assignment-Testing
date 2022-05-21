public class ATM_machine {

    public float accountBalance = 0;
    public boolean iscardAuthentic = false;
    public boolean iscardValid = true;
    public boolean ispasswordValid = true;
    
    public String enterCard(){
        if(iscardValid){
            return "Card Validated";
        }
        else{
            return "Card Invalid";
        }
    }
    public String enterPassword(){
        if(iscardValid){
            System.out.println("Enter  your password");
            if(ispasswordValid){
                iscardAuthentic = true;
                return "Login Unsuccessful";
            }
            else{
                return "Login Unsuccessful";
            }
        }
        else{
            return "Enter card first";
        }
    }
    public String deposit_Money(float money){
        if(iscardAuthentic){
            if(money >= 50 && money <=50000){
                accountBalance += money;
                return "Deposit successfully made";
            }
            else{
                return "Enter valid amount";
            }
        }
        else{
            return "Invalid Transaction";
        }
    }
    public String withdraw_Money(float amount){
        if(iscardAuthentic){
            if(amount <= accountBalance){
                accountBalance -= amount;
                return "Withdraw made successfully";
            }
            else{
                return "Insufficient balance";
            }
        }
        else{
            return "Invalid Transaction";
        }
    }
    public String removeCard(){
        if(iscardValid){
            return "Card removed";
        }
        else{
            return "Invalid Transaction";
        }
    }

}
