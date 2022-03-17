package strategy;

public class AudiA3 extends Car {
    public AudiA3(){
        setDrivable(new RearWheelDrive());
    }
}
