import java.util.*;

public class State {
	private boolean acceptState;
	private HashMap<String, Integer> transitions;
	
	public State(boolean acpSt, HashMap<String, Integer> transitions) {
		this.acceptState = acpSt;
		this.transitions = transitions;
	}
	
	public int getNextState(String symbol) {
		return transitions.get(symbol);
	}
	
	public boolean isAcceptState() {
		return acceptState;
	}
}
