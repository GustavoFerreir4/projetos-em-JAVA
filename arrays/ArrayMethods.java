import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethods{

    static Scanner kbListener = new Scanner(System.in);
    String[] exampleArray;
    public void main(String[] args) {
        System.out.println("How many values do you wish to include?");
        int elementsAmount = kbListener.nextInt();
        String[] newArr = new String[elementsAmount]; 
        for (int i = 0 ; i < newArr.length ; i++) {
            System.out.print(Integer.toString(i+1) + "° element: ");
            String element = kbListener.next();
            newArr[i] = element;
        }
        setExampleArray(newArr);
        System.out.println(Arrays.toString(getExampleArray()));

        System.out.println("The size of the array is: " + getLength());
        System.out.println("Setting all elements to: 'James Bond' ");
        setAllElements("James Bond");
        System.out.println("New version of the array: " + Arrays.toString(getExampleArray()));
        System.out.println("Setting element in position '2' to 'Gustavo'");
        newArr[2] = "Gustavo";
        System.out.println("New version of the array: " + Arrays.toString(getExampleArray()));
        System.out.println("The 'getIndexForValue' method returns: " + Integer.toString(getIndexForValue("Gustavo")));
    }

    public String[] getExampleArray() {
        return exampleArray;
    }

    public void setExampleArray(String[] exampleArray) {
        this.exampleArray = exampleArray;
    }

    public int getLength(){
        return this.exampleArray.length;
    }

    public void setAllElements(String element){
        Arrays.fill(exampleArray, element);
    }

    public int getIndexForValue(String value){
        int index = Arrays.binarySearch(exampleArray, value);
        return index;
    }

}
