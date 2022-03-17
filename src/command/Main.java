package command;
import java.util.*;

public class Main {
    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl(); //создаем пулт управления
        Engine engine = new Engine();   // создаем двигатель
        StartEngine startEngine = new StartEngine(engine); //создаем команду для запуска двигателя
        Conditioner condition = new Conditioner(); //создаем кондиционер
        StartConditioner startCondition = new StartConditioner(condition); //создаем команду для запуска кондиционера

        List commands = new ArrayList(); // список для хранения последовательности команд
        commands.add(startEngine); // добавляем команду запуска двигателя
        commands.add(startCondition); //добавляем команду для запуска кондиционера

        CompoundCommand compCom = new CompoundCommand(commands);

        // назначаем команду запуска двигателя на кнопку 0  на пульте
        remoteControl.setCommand(0, startEngine);
        // назначаем команду запуска двигателя и прогрева салона на кнопку 1 на пульте
        remoteControl.setCommand(1, compCom);
        remoteControl.buttonPress(1); //нажимаем кнопку

    }
}
