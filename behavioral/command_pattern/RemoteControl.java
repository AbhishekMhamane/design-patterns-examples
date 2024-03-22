package behavioral.command_pattern;

public class RemoteControl {

  int size = 0;
  Command[] onCommands;
  Command[] offCommands;
  Command[] undoCommands;

  public RemoteControl(int size){

    this.size = size;

    onCommands = new Command[size];
    offCommands = new Command[size];
    undoCommands = new Command[size];

    Command noCommand = null;
    for(int i=0; i<size; i++){
      onCommands[i] = noCommand;
      offCommands[i] = noCommand;
      undoCommands[i] = noCommand;
    }
  }

  public void setCommand(int slot, Command onCommand, Command offCommand){
    onCommands[slot] = onCommand;
    offCommands[slot] = offCommand;
  }

  public void onButtonPushed(int slot){
    onCommands[slot].execute();
    undoCommands[slot] = onCommands[slot];
  }

  public void offButtonPushed(int slot){
    offCommands[slot].execute();
    undoCommands[slot] = offCommands[slot];
  }

  public void undoButtonPushed(int slot){
    undoCommands[slot].undo();
  }

}
