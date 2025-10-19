public class Car extends Vehicle {
    
    public Car(){
        super();
    }

    public Car(String model, String brand, int year){
        super(model, brand, year);
    }

    @Override
    public void speedUp(float speedIncrement) {
        if(speedIncrement <= 0){
            System.out.println("Did not increase speed.");
        }else{
            setSpeed(getSpeed() + speedIncrement);
        }

    }

    @Override
    public void slowDown(float speedDecrement) {
        if(speedDecrement <= 0){
            System.out.println("Did not descrease speed.");
        }else{
           setSpeed(getSpeed() - speedDecrement);
        }
    }

    @Override
    public void park() { 
        System.out.println("Parking the car.");
        setSpeed(0f);
        setMoving(false);
    }

    @Override
    public void turnLeft(float timeInHours) {
        calculateFuel(timeInHours);
        setMoving(true);
        setDrivenDistance(timeInHours * getSpeed());
        System.out.println("Turning left for " + Float.toString(timeInHours) + " hours at " + Float.toString(getSpeed()) + "km/h");
    }

    @Override
    public void turnRight(float timeInHours) {
        calculateFuel(timeInHours);
        setMoving(true);
        setDrivenDistance(timeInHours * getSpeed());
        System.out.println("Turning right for " + Float.toString(timeInHours) + " hours at " + Float.toHexString(getSpeed()));
    }

    @Override
    public void goForward(float timeInHours) {
        calculateFuel(timeInHours);
        setMoving(true);
        setDrivenDistance(timeInHours * getSpeed());
        System.out.println("Going forward for " + Float.toString(timeInHours) + " hours at " + Float.toString(getSpeed()));
    }

    @Override
    public void goBackward(float timeInHours) {
        calculateFuel(timeInHours);
        setMoving(true);
        setDrivenDistance(timeInHours * getSpeed());
        System.out.println("Going backwards for " + Float.toString(timeInHours) + " hours at " + Float.toString(getSpeed()));
    }

    public void calculateFuel(float timeInHours){
        float distance = timeInHours * getSpeed();
        float wastedFuel = distance * 0.1f;
        setFuel(getFuel() - wastedFuel);
    }


    public String status(){
        String carInfo = getModel() + " da marca " + getBrand() + " do ano " + Integer.toString(getYear()) + "\n";
        String carStatus = "Possui " + Float.toString(getFuel()) + "% de combustível restante. \n" 
                            + "rodou " + Float.toString(getDrivenDistance()) + "km \n"
                            + "está " + (isMoving() ? "em movimento à uma velocidade de " + getSpeed() + "km/h" : "parado") + "\n";
        String fullString = carInfo + carStatus;
        return fullString;
    }

}
