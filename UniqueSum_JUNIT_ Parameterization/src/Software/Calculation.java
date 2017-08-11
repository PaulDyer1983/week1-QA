package Software;

public class Calculation {

    private int num1;
    private int num2;
    private int num3;
    private int sum;

    public Calculation(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int uniqueNumber(){
        if(num1 == num2){
            sum = num3;
            return sum;
        }
        else if(num1 == num3){
            sum = num2;
            return sum;
        }
        else if(num2 == num3){
            sum = num1;
            return  sum;
        }
        else{
            sum = (num1 + num2 + num3);
            return sum;
        }
    }
}
