import java.time.LocalTime;
import java.lang.Math;
public class first {
    // List of primitive types
    private byte byte_data = 127; // one byte
    private short short_number = 2; // up to 16 bits
    private int integer_number = 2147483647; // up to 32 bits
    private long long_number =  Math.powExact(integer_number, integer_number); // up to 64 bits
    private float float_number = 0.23f; // up to 32 bits
    private double double_number = 19.200; //ip to 64 bits
    private boolean bool_data = true; // 1 bit


    //methods

    public void main(){
        greetings("This is my  first time writing JAVA code.");
        timeStamp();
        System.out.println("");
        System.out.println(stringFyVariables());
    }

    public void greetings(String userText){
        System.out.println(userText);
    }

    public  void timeStamp(){
        LocalTime date = LocalTime.now();
        int hours = date.getHour();
        System.out.println(hours);
    }

    public String stringFyVariables(){
        String varString = "Byte:" + Byte.toString(byte_data);
        varString += " Float: " + Float.toString(float_number);
        varString += " Short: " + Short.toString(short_number);
        varString += " Long: " + Long.toString(long_number);
        varString += " Integer: " + Integer.toString(integer_number);
        varString += " Double: " + Double.toString(double_number);
        varString += " Boolean: " + Boolean.toString(bool_data) ;
        return varString;
    }

}

