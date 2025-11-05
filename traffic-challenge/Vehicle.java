public abstract class Vehicle implements Drivable{

    private float fuel;
    private float speed;
    private boolean isMoving;
    private int year;
    private String model;
    private String brand;
    private float drivenDistance;



    public Vehicle(){
        this.fuel = 100f;        
        this.speed = 0f;
        this.isMoving = false;
        this.year = 2025;
        this.model = "Default";
        this.brand = "Default";
    }

    public Vehicle(String model, String brand, int year){
        this.fuel = 100f;        
        this.speed = 0f;
        this.isMoving = false;
        this.year = year;
        this.model = model;
        this.brand = brand;
        
    }


    public abstract void speedUp(float speedIncrement);
    public abstract void slowDown(float speedDecrement);
    public abstract void park();

    public float getFuel() {
        return fuel;
    }
    public void setFuel(float fuel) {
        this.fuel = fuel;
    }
    public float getSpeed() {
        return speed;
    }
    public void setSpeed(float speed) {
        this.speed = speed;
    }
    public boolean isMoving() {
        return isMoving;
    }
    public void setMoving(boolean isMoving) {
        this.isMoving = isMoving;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getDrivenDistance() {
        return drivenDistance;
    }

    public void setDrivenDistance(float drivenDistance) {
        this.drivenDistance += drivenDistance;
    }

    
}