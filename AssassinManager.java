import java.util.*;

public class AssassinManager {
    // YOUR CODE GOES HERE
	Node killring;
	Node graveyard;
	
	public AssassinManager(List<String> names) {
		for(String i : names)
		{
			if(killring==null)
				killring = new Node(i);
			else
				killring = new Node(i,killring);
		}
		
	}
	
	public String killRing() {
		String f="";
		Node current = killring;
		while(current!=null) {	
			
			f+=current.name+" ";
			
			current= current.next;
		}
		return f;
	}
	
	public String graveyard() {
		String f="";
		Node current = graveyard;
		while(current!=null) {	
			
			f+=current.name+" ";
			
			current= current.next;
		}
		return f;
	}
	
	public boolean killRingContains(String name) {
		return false;
	}
	
	public boolean graveyardContains(String name) {
		
		return false;
	}
	
	public boolean isGameOver() {
		return false;
	}
	
	public String winner() {
		return "";
	}
	
	public void kill(String name) {
		return;
	}

}
