import java.util.Scanner;

public class ArraySum {
    public static Scanner kbListener = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("How many items are you looking forward to including?");
        float itemAmout = kbListener.nextFloat();
        float[] values = new float[(int) itemAmout];
        for(int i = 0; i<itemAmout; i++){
            System.out.println("The " + (
                i + 1) + "° value shall be: ");
            values[i] = kbListener.nextFloat();
        }   

        System.out.println("The sum of all the typed values is: " + calculate(values));
    
    }

    public static float calculate(float[] args){
        float total = 0f;
        for(float item : args){
            total += item;
        }
        return total;
    }


}
