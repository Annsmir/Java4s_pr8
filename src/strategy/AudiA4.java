package strategy;

public class AudiA4 extends Car {
    public AudiA4(){
        setDrivable(new FullWheelDrive());
    }
}
