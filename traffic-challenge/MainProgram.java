public class MainProgram {
    public static void main(String[] args){
        Car gustaCar = new Car("Sportage", "KYA", 2008);
        Car joaoCar = new Car("Corolla", "Toyota", 2012);

        int count = 0;
        while(count <= 8){

            
            System.out.println(gustaCar.status());
            System.out.println("");
            System.out.println(joaoCar.status());

            gustaCar.setSpeed(70);
            joaoCar.setSpeed(60);

            gustaCar.goForward(TimeConversor.minutesToHours(25));
            joaoCar.goForward(1);
    
            count++;
        }

        gustaCar.setSpeed(0);
        gustaCar.park();

        joaoCar.setSpeed(0);
        joaoCar.park();


    
        System.out.println(gustaCar.status());
        System.out.println("");
        System.out.println(joaoCar.status());

    }
}
