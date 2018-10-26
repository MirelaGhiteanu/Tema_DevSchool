public class Sum {
    public boolean hasEqualSum(int first, int second, int third){

        boolean right = false;
        int sum = first + second;

        if (sum  == third){

            right = true;
        }

        else{

            right = false;
        }

        return right;


    }
}
