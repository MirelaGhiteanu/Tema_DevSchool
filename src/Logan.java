public class Logan extends Car {

    public String RegNo;
    public String model;
    public String WheelsNo;

    public Logan(String r, String m, String w) {
        super(r, m, w);
    }

    public void changeGear(int gear, int change){

        super.changeGear(gear, change);
        System.out.println("The Logan's gear was changed");
    }

    public void increaseSpeed(int speed){
        super.increaseSpeed(speed);
        System.out.println("The Logan's speed was increased");
    }

    public void decreaseSpeed(int speed){
        super.decreaseSpeed(speed);
        System.out.println("The Logan's speed was decreased");
    }
}
