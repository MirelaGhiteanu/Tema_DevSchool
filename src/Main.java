public class Main {
    public static void main (String[] args) {

        Dog d1 = new Dog();
        Sum s1 = new Sum();
        Calendar c1 = new Calendar();
        Vehicle v1 = new Vehicle("1234566ABC","345A", "4");
        Car car1 = new Car("1234566ABC","345A", "4");
        Logan l1 = new Logan("1234566ABCc","345Ad", "4");

        System.out.println(d1.bark(true,1));
        System.out.println(d1.bark(false,2));
        System.out.println(d1.bark(true,8));
        System.out.println(d1.bark(true,-1));

        System.out.println(s1.hasEqualSum(1,1, 1));
        System.out.println(s1.hasEqualSum(1,1, 2));
        System.out.println(s1.hasEqualSum(1,-1, 0));

        c1.printYearsandDays(561600);
        v1.increaseSpeed(35);
        car1.changeGear(2,3);
        l1.changeGear(3,4);
        l1.increaseSpeed(64);
    }
}
