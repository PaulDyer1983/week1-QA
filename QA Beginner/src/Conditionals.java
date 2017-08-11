public class Conditionals {


    public static void main(String[] args) {
         System.out.println(method1(3,3,true));
         System.out.println(method1(3,3,false));

    }

    private static int method1(int x, int y, boolean conditional1){
        int z;
        if (conditional1){
            z = x + y;
        }
        else{
            z = x * y;
        }

        return z;
    }
}
