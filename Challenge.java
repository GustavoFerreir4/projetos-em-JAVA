import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
public class Challenge {
    Scanner kbListener = new Scanner(System.in);
    public void main(){
        System.out.println("Please, type in the first value.");
        int n1 = kbListener.nextInt();
        System.out.println("You may type the second value.");
        int n2 = kbListener.nextInt();
        float average = (float) (n1+n2)/2;
        System.out.println("Making the calculations...");
        System.out.println("The average the value types is:");
        System.out.println(average);
        System.out.println(getConcept(average));
    }

    public String getConcept(float avg){
        if(avg < 4){
            return "Concept D";
        }else if(avg >= 8){
            return "Concept A";
        }else if(avg >= 4 && avg < 6){
            return "Concept C";
        }else if(avg >= 6 && avg < 8){
            return "Concept B";
        }

        return "Unknown concept.";
    }
}
