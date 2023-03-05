public class Car {
    public  void start(){
        startElectricity();
        startCommand();
        startFuelSystem();
    }
    private void startElectricity() {
        System.out.println("Electricity" +
                "\n----------------------");
    }
    private void startCommand() {
        System.out.println("Command" +
                "\n----------------------");
    }
    private void startFuelSystem() {
        System.out.println("Fuel System" +
                "\n----------------------");
    }
}
