import java.time.LocalTime;
public class first {
    // List of primitive types
    byte byte_data = 127;
    short short_number = 2; // up to 16 bits
    int integer_number = 100; // up to 32 bits
    long long_number = 1024; // up to 64 bits
    float float_number = 0.23f; // up to 32 bits
    double double_number = 19.200; //ip to 64 bits
    boolean bool_data = true; // 1 bit


    //methods

    public void main(){
        greetings("This is my  first time writing JAVA code.");
        timeStamp();
    }

    public void greetings(String userText){
        System.out.println(userText);
    }

    public  void timeStamp(){
        LocalTime date = LocalTime.now();
        int hours = date.getHour();
        System.out.println(hours);
    }https://github.com/GustavoFerreir4/projetos-em-JAVA.git


}

