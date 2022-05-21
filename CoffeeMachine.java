public class CoffeeMachine {

    public boolean power_status = false;
    public boolean illumination = false;
    public boolean isbusy = false;
    public float money;
    private final float price = 20;

    public String insertMoney(float money) {

        if (power_status) {
            this.money = money;
            return "You successfully added money into the machine";
        } else {
            return "Machine is turned off. Please turn on";
        }

    }
    public String OpenCoffeeMachine() {
        if (!power_status) {
            power_status = true;
            illumination = true;
            return "Power on" + "Lights on";
        } else {
            return "Error!";
        }
    }
    public String closeMachine() {
        if (power_status) {
            illumination = false;
            power_status = false;
            return  "Power off" + "Lights off";
        } else {
            return "Machine is already closed";
        }
    }
    public String makeCoffee(int coffeeAmount) {
        if (power_status) {
            int i = 0;
            if (money >= price) {
                while (money >= price && coffeeAmount > 0) {
                    money -= price;
                    isbusy  = true;
                    coffeeAmount--;
                    i++;
                }
            }
            else{
                return "Not enough balance";
            }
            isbusy  = false;
            return i + "Coffee was successfully made";
        } else {
            return "Machine is turned off. Please turn on";}
    }
}


