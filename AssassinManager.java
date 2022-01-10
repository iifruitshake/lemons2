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
		name.toLowerCase();
		Node current = killring;
		while(current!=null) {
			System.out.println(name);
			if(current.name.toLowerCase().equals(name))
				return true;
			current=current.next;
		}
		return false;
	}
	
	public boolean graveyardContains(String name) {
		String f =name.toLowerCase();
		Node current = graveyard;
		while(current!=null) {
			if(current.name.toLowerCase().equals(f))
				return true;
			current=current.next;
		}
		return false;
	}
	
	public boolean isGameOver() {
		int f=0;
		Node current= killring;
		while(current!=null)
		{
			f++;
			current=current.next;
		}
		if(f>=2)
			return false;
		return true;
	}
	
	public String winner() {
		if(isGameOver()) {
			return killring.name;
		}
		return null;
	}
	
	public void kill(String name) {
		return;
	}

}
