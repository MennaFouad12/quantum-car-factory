class GasolineEngine implements Engine {
    private int engineSpeed = 0;

    @Override
    public void increase() {
        engineSpeed++;
    }

    @Override
    public void decrease() {
        if (engineSpeed > 0) engineSpeed--;
    }

    @Override
    public void handleSpeed(int carSpeed) {
        System.out.println("Gas Engine handling speed: " + carSpeed);
    }
}