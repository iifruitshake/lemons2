import java.util.*;
public class AssassinManager {
    // YOUR CODE GOES HERE
	Node killring;
	Node graveyard;
	Node front;
	Node current;
	Node follow;
	String kill;
	
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
		kill = "";
		current = killring;
		follow = killring;
		while(current!=null) {
			kill+= "  " + follow + " is stalking " + follow.next;
			follow = current;
			current = current.next;
		}
		return kill;
		
	}
	
	public String graveyard() {
		String f="";
		Node current = killring;
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
		
	}

}
