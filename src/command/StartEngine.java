package command;

public class StartEngine implements Command {
    private Engine engine;

    public StartEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void execute() {
        engine.start();
    }
}
