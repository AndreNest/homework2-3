public class HotBeverageVendingMachine implements VendingMachine {
    @Override
    public void connect() {
        System.out.println("Connecting to external system...");
        // code for connecting to external system goes here
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from external system...");
        // code for disconnecting from external system goes here
    }

    public HotBeverageWithTemperature getProduct(String name, int volume, int temperature) {
        // code for getting product with given name, volume, and temperature goes here
        return new HotBeverageWithTemperature(name, volume, temperature);
    }
}