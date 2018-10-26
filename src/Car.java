public class Car extends Vehicle{
    public String RegNo;
    public String model;
    public String WheelsNo;

    public Car(String r, String m, String w) {
        super(r, m, w);
    }


    public void changeGear(int gear, int change){

        super.changeGear(gear, change);
        System.out.println("The gear was changed for the car");
    }

    public void increaseSpeed(int speed){
        super.increaseSpeed(speed);
        System.out.println("The speed was increased for the car");
    }

    public void decreaseSpeed(int speed){
        super.decreaseSpeed(speed);
        System.out.println("The speed was decreased for the car");
    }
}
