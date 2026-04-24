class MixedHybridEngine implements Engine {
    private GasolineEngine gas = new GasolineEngine();
    private ElectronicEngine electric = new ElectronicEngine();

    @Override
    public void increase() {
        gas.increase();
        electric.increase();
    }

    @Override
    public void decrease() {
        gas.decrease();
        electric.decrease();
    }

    @Override
    public void handleSpeed(int carSpeed) {
        if (carSpeed < 50) {
            System.out.println("Hybrid uses ELECTRIC mode");
            electric.handleSpeed(carSpeed);
        } else {
            System.out.println("Hybrid uses GAS mode");
            gas.handleSpeed(carSpeed);
        }
    }
}