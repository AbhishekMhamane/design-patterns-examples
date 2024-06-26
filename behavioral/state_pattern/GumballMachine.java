package behavioral.state_pattern;

public class GumballMachine {

  private State soldOutState;
  private State noQuarterState;
  private State hasQuarterState;
  private State soldState;
  private State winnerState;

  private State state;

  private int count = 0;

  public GumballMachine(int numberGumballs){
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    winnerState = new WinnerState(this);

    this.count = numberGumballs;

    if(numberGumballs > 0){
      state = noQuarterState;
    }else{
      state = soldOutState;
    }
  }

  public void insertQuarter(){
    state.insertQuarter();
  }

  public void ejectQuarter(){
    state.ejectQuarter();
  }

  public void turnCrank(){
    state.turnCrank();
    state.dispense();
  }

  public void releaseBall() {
    System.out.println("A gumball comes rolling out the slot...");
    if (count > 0) {
      count = count - 1;
    }
  }


  public State getSoldOutState() {
    return soldOutState;
  }

  public void setSoldOutState(State soldOutState) {
    this.soldOutState = soldOutState;
  }

  public State getNoQuarterState() {
    return noQuarterState;
  }

  public void setNoQuarterState(State noQuarterState) {
    this.noQuarterState = noQuarterState;
  }

  public State getHasQuarterState() {
    return hasQuarterState;
  }

  public void setHasQuarterState(State hasQuarterState) {
    this.hasQuarterState = hasQuarterState;
  }

  public State getSoldState() {
    return soldState;
  }

  public void setSoldState(State soldState) {
    this.soldState = soldState;
  }

  public State getWinnerState() {
    return winnerState;
  }

  public void setWinnerState(State winnerState) {
    this.winnerState = winnerState;
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }
}
