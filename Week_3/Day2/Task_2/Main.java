abstract class Telephone {
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telephone {
    @Override
    void ring() {
        System.out.println("Smartphone is ringing...");
    }

    @Override
    void lift() {
        System.out.println("Smartphone call is answered.");
    }

    @Override
    void disconnect() {
        System.out.println("Smartphone call is disconnected.");
    }
}

public class Main {
    public static void main(String[] args) {
        Telephone phone = new SmartTelephone(); // Polymorphism
        phone.ring();
        phone.lift();
        phone.disconnect();
    }
}

