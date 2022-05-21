public class Digital_Watch {

        public boolean open_status = false;
        public boolean timer_status = false;
        public float timer = 0;

        public String powerOn(){
            if(!open_status){
                open_status = true;
                return "Watch has been turned on!";
            }
            else{
                return "Watch already turned on";
            }
        }
        public String setTimer(float time){
            if(open_status){
                timer = time;
                timer_status = true;
                return "Timer set successfully";
            }
            else{
                return "Watch is turned off";
            }
        }
        public String doOperation(){
            if(timer_status){
                return "Wait for timer";
            }
            else{
                return "Accepted Operation";
            }
        }
        public String powerOff(){
            if(open_status){
                open_status = false;
                return "Watch has been turned off";
            }
            else{
                return "Error";
            }
        }
}
