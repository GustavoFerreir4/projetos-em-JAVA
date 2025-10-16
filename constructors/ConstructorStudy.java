import java.time.LocalTime;

public class ConstructorStudy {

    private String name;
    private String nasc;
    private boolean isEnrolled;
    private float moneyInWallet;
    private String createdAt;


    public ConstructorStudy(){
        this.name = "unnamed";
        this.moneyInWallet = 0.0f;
        this.createdAt = LocalTime.now().toString();
    }

    
    public ConstructorStudy(String name){
        this.name = name;
        this.moneyInWallet = 0.0f;
        this.createdAt = LocalTime.now().toString();
        }

    public ConstructorStudy(String name, float moneyInWallet) {
        this.name = name;
        this.moneyInWallet = moneyInWallet;
        this.createdAt = LocalTime.now().toString();
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

    public String getCreatedAt() {
        return createdAt;
    }

    public void status(){
        System.out.println("Nome do aluno: " + this.name);
        System.out.println("Está matriculado: " + Boolean.toString(isEnrolled));
        System.out.println("Dinheiro na carteira: " + Float.toString(moneyInWallet));
        System.out.println("Objeto criado em: " + this.createdAt);
    }
}
