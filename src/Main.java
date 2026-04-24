public class Main {
    public static void main(String[] args) {

        Car gasCar = CarFactory.createCar("gas");
        gasCar.start();
        gasCar.accelerate();
        gasCar.accelerate();
        gasCar.brake();

        System.out.println("------");

        Car electricCar = CarFactory.createCar("electric");
        electricCar.start();
        electricCar.accelerate();

        System.out.println("------");

        Car hybridCar = CarFactory.createCar("hybrid");
        hybridCar.start();

        for (int i = 0; i < 5; i++) {
            hybridCar.accelerate();
        }

        hybridCar.brake();

        System.out.println("------ Engine replacement ------");

        hybridCar.replaceEngine(new GasolineEngine());
        hybridCar.accelerate();
    }
}