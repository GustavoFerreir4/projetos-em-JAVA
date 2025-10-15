
import java.util.Arrays;


public class ArrayStudy {

    //We can either define arrays by their size or values:
    public String[] arrayStrings = {"Gustavo", "Isabelle", "Erica", "Agatha", "Joaldo"};
    public String[] arrayIntegers = {"19", "19", "39", "3","40"};
    public Object[][] multidimensionalArray = new Object[arrayStrings.length][2];


    public void main(String args[]){
        int counter = 0;

        while ( counter < multidimensionalArray.length){
            multidimensionalArray[counter][0] = arrayStrings[counter];
            multidimensionalArray[counter][1] = arrayIntegers[counter];
            counter++;
        }

        System.out.println("Users and their ages: " + getStringForMultidimensionalArray());
        
        space();
        printArrayStrings();
        printArrayIntegers();

        space();
        System.out.println("Array of user Names: " + getStringForArrayStrings());
        space();
        System.out.println("Users ages: " + getStringForArrayIntegers());
    }

    private void space() {
        System.out.println("");
    
    }

    public void printArrayStrings(){
        String strArr = Arrays.toString(arrayStrings);
        System.out.println(strArr);
    }

    public void printArrayIntegers(){
        String strArr = Arrays.toString(arrayIntegers);
        System.out.println(strArr);
    }
    
    public String getStringForArrayStrings(){
        String strArr = Arrays.toString(arrayStrings);
        return strArr;
    }

    public String getStringForArrayIntegers(){
        String strArr = Arrays.toString(arrayIntegers);
        return strArr;
    }

    public String getStringForMultidimensionalArray(){
        String[] rawStringArray = new String[5];
        for (int i = 0 ; i < rawStringArray.length ; i++){
            rawStringArray[i] = Arrays.toString(multidimensionalArray[i]);
        }

        String strArr = Arrays.toString(rawStringArray);
        return strArr;
    }
    
}   