public class Main {
    public static void main(String[] args) {
        HotBeverageVendingMachine machine = new HotBeverageVendingMachine(); // Change the type to HotBeverageVendingMachine
        machine.connect();
        HotBeverageWithTemperature beverage = machine.getProduct("Coffee", 200, 80);
        if (beverage != null) {
            System.out.println("Here is your beverage!");
        }
        machine.disconnect();
    }
}