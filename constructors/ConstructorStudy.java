
import java.lang.reflect.Constructor;
import java.util.Time;

public class ConstructorStudy {

    private String name;
    private String nasc;
    private boolean isEnrolled;
    private float moneyInWallet;


    public ConstructorStudy(){
        this.name = "unnamed";
        this.moneyInWallet = 0.0f;
        this
    }

    
    public ConstructorStudy(String name){
        this.name = name;
        this.moneyInWallet = 0.0f;
        }

    public ConstructorStudy(String name, float moneyInWallet) {
        this.name = name;
        this.moneyInWallet = moneyInWallet;
    }
    
    public void main(String[] args){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getNasc() {
        return nasc;
    }

    public void setNasc(String nasc) {
        this.nasc = nasc;
    }

    public boolean isIsEnrolled() {
        return isEnrolled;
    }

    public void setIsEnrolled(boolean isEnrolled) {
        this.isEnrolled = isEnrolled;
    }

    public float getMoneyInWallet() {
        return moneyInWallet;
    }

    public void setMoneyInWallet(float moneyInWallet) {
        this.moneyInWallet = moneyInWallet;
    }

    public void status(){
        System.out.println("Nome do aluno: " + this.name);
        System.out.println("Está matriculado: " + Boolean.toString(isEnrolled));
        System.out.println("Dinheiro na carteira: " + Float.toString(moneyInWallet));
    }
}
