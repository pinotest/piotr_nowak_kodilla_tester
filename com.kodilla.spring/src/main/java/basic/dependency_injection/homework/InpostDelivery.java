package basic.dependency_injection.homework;

public class InpostDelivery implements DeliveryService{
    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            System.out.println("Package too heavy for Inpost");
            return false;
        }
        System.out.println("Delivering in progress from Inpost...");
        return true;
    }
}
