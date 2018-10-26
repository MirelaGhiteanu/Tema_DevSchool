public class Calendar {
    public void printYearsandDays(int minutes){

        int years = 0;
        int days = 0;

        if (minutes < 0){

            System.out.println("Invalid value!");
        }

        else{

            years = minutes/525600;
            days = (minutes%525600)/ 1440;
        }

        System.out.println(minutes+" min = "+years+" y and "+days+" d");

    }
}
