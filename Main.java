// Class Vehicle sebagai superclass
class Vehicle {
    // Attribute
    protected int wheels;

    // Method
    public void moveForward() {
        System.out.println("Mobil bergerak ke depan.");
    }

    public void turn() {
        System.out.println("Mobil belok.");
    }
}

// Class Car yang menginherit dari Vehicle
class Car extends Vehicle {
    // Attribute tambahan untuk mobil
    private int fuelCapacity;
    private String transmissionType;

    // Constructor
    public Car(int wheels, int fuelCapacity, String transmissionType) {
        this.wheels = wheels;
        this.fuelCapacity = fuelCapacity;
        this.transmissionType = transmissionType;
    }

    // Method tambahan untuk mobil
    public void refuel(int amount) {
        System.out.println("Mobil diisi bahan bakar sebanyak " + amount + " liter.");
    }

    // Override method moveForward
    @Override
    public void moveForward() {
        System.out.println("Mobil bergerak maju dengan kecepatan tinggi.");
    }
}

// Contoh subclass yang menginherit dari Car
class HondaJazz extends Car {
    // Attribute tambahan untuk Honda Jazz
    private String model;

    // Constructor
    public HondaJazz(int fuelCapacity, String transmissionType, String model) {
        super(4, fuelCapacity, transmissionType);
        this.model = model;
    }

    // Method tambahan untuk Honda Jazz
    public void playMusic() {
        System.out.println("Memutar musik di sistem audio Honda Jazz.");
    }
}

// Contoh subclass yang menginherit dari Car
class ToyotaFortuner extends Car {
    // Attribute tambahan untuk Toyota Fortuner
    private boolean offRoadCapable;

    // Constructor
    public ToyotaFortuner(int fuelCapacity, String transmissionType, boolean offRoadCapable) {
        super(4, fuelCapacity, transmissionType);
        this.offRoadCapable = offRoadCapable;
    }

    // Method tambahan untuk Toyota Fortuner
    public void engage4WD() {
        System.out.println("Toyota Fortuner masuk ke mode 4WD.");
    }
}

// Contoh subclass yang menginherit dari Car
class SuzukiKatana extends Car {
    // Attribute tambahan untuk Suzuki Katana
    private boolean isConvertible;

    // Constructor
    public SuzukiKatana(int fuelCapacity, String transmissionType, boolean isConvertible) {
        super(4, fuelCapacity, transmissionType);
        this.isConvertible = isConvertible;
    }

    // Method tambahan untuk Suzuki Katana
    public void openRoof() {
        System.out.println("Membuka atap pada Suzuki Katana.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek HondaJazz
        HondaJazz jazz = new HondaJazz(40, "Automatic", "Honda Jazz RS");
        jazz.moveForward();
        jazz.playMusic();
        jazz.refuel(10);

        // Membuat objek ToyotaFortuner
        ToyotaFortuner fortuner = new ToyotaFortuner(80, "Manual", true);
        fortuner.moveForward();
        fortuner.engage4WD();
        fortuner.refuel(20);

        // Membuat objek SuzukiKatana
        SuzukiKatana katana = new SuzukiKatana(30, "Manual", true);
        katana.moveForward();
        katana.openRoof();
        katana.refuel(15);
    }
}
