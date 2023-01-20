package change_value_to_reference;

public class Client {
    public static void main(String[] args) {
        SmartPhone iPhone11_1 = SmartPhone.create("Apple", "iPhone 11");
        SmartPhone iPhone11_2 = SmartPhone.create("Apple", "iPhone 11");
        System.out.println("iPhone 11 (1) equals iPhone 11 (2): " + iPhone11_1.equals(iPhone11_2));

        SmartPhone galaxy22_1 = SmartPhone.create("Samsung", "Galaxy s22");
        SmartPhone galaxy22_2 = SmartPhone.create("Samsung", "Galaxy s22");
        System.out.println("Galaxy s22 (1) equals Galaxy s22 (2): " + galaxy22_1.equals(galaxy22_2));
    }
}
