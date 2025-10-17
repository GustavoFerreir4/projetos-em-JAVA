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
    }

    public byte getByte_data() {
        return byte_data;
    }

    public void setByte_data(byte byte_data) {
        this.byte_data = byte_data;
    }

    public short getShort_number() {
        return short_number;
    }

    public void setShort_number(short short_number) {
        this.short_number = short_number;
    }

    public int getInteger_number() {
        return integer_number;
    }

    public void setInteger_number(int integer_number) {
        this.integer_number = integer_number;
    }

    public long getLong_number() {
        return long_number;
    }

    public void setLong_number(long long_number) {
        this.long_number = long_number;
    }

    public float getFloat_number() {
        return float_number;
    }

    public void setFloat_number(float float_number) {
        this.float_number = float_number;
    }

    public double getDouble_number() {
        return double_number;
    }

    public void setDouble_number(double double_number) {
        this.double_number = double_number;
    }

    public boolean isBool_data() {
        return bool_data;
    }

    public void setBool_data(boolean bool_data) {
        this.bool_data = bool_data;
    }


}

