package strategy;

public class Main {
    public static void main(String[] args) {
        Car audiA3 = new AudiA3();
        audiA3.performDrive();

        Car audiA4 = new AudiA4();
        audiA4.performDrive();
        audiA4.setDrivable(new RearWheelDrive());
        audiA4.performDrive();
    }
}
