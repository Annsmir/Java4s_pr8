package command;

public class StartConditioner implements Command{
    private Conditioner condition;

    public StartConditioner(Conditioner condition){
        this.condition = condition;
    }

    public void execute(){
        condition.start();
    }
}
