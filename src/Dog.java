public class Dog {
    public boolean bark(boolean barking, int hourOfDay){

        boolean wakeUp = false;

        if (barking == true) {

            if (((hourOfDay < 8) && (hourOfDay > 0)) || ((hourOfDay > 22) && (hourOfDay < 23))) {

                wakeUp = true;
            }

            else {

                wakeUp = false;
            }

        }

        return wakeUp;
    }
}
