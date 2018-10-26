public class Vehicle {

    public String RegNo;
    public String model;
    public String WheelsNo;

    public String getRegNo() {
        return RegNo;
    }

    public void setRegNo(String regNo) {
        this.RegNo = regNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String getWheelsNo() {
        return WheelsNo;
    }

    public void setWheelsNo(String wheelsNo) {
        WheelsNo = wheelsNo;
    }


    public Vehicle(String r, String m, String w){

        this.RegNo = r;
        this.model = m;
        this.WheelsNo = w;
    }

    public void changeGear(int gear, int change){

        gear = change;

    }

    public void increaseSpeed(int speed){

        speed ++;

    }

    public void decreaseSpeed(int speed){

        speed = speed - 1;
    }

}
