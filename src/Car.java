class Car {
    private Engine engine;
    private int speed = 0;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        speed = 0;
        System.out.println("Car started at speed 0");
        engine.handleSpeed(speed);
    }

    public void stop() {
        while (speed > 0) {
            brake();
        }
        System.out.println("Car stopped");
    }

    public void accelerate() {
        if (speed + 20 <= 200) {
            speed += 20;
        }
        engine.handleSpeed(speed);
    }

    public void brake() {
        if (speed - 20 >= 0) {
            speed -= 20;
        } else {
            speed = 0;
        }
        engine.handleSpeed(speed);
    }

    public void replaceEngine(Engine newEngine) {
        this.engine = newEngine;
        System.out.println("Engine replaced");
    }
}