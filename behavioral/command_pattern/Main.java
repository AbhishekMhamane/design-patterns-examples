package behavioral.command_pattern;

public class Main {
 public static void main(String[] args) {
    Light light = new Light();
    Command lightOnCommand = new LightOnCommand(light);
    Command lightOffCommand = new LightOffCommand(light);
    RemoteControl remoteControl = new RemoteControl(1);
    remoteControl.setCommand(0, lightOnCommand, lightOffCommand);

    remoteControl.onButtonPushed(0);
    remoteControl.offButtonPushed(0);

   remoteControl.undoButtonPushed(0);

 }
}
