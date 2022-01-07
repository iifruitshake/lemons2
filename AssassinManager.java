public class AssassinManager {
    // YOUR CODE GOES HERE
	AssassinNode killring;
	AssassinNode graveyard;
	
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
		public String killRing() {
		kill = "";
		current = killring;
		follow = killring;
		while(current!=null) {
			kill+= "  " + follow + " is stalking " + follow.next;
			follow = current;
			current = current.next;
		}
		
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
		
	}
	
	public boolean graveyardContains(String name) {
		
	}
	
	public boolean isGameOver() {
		
	}
	
	public String winner() {
		
	}
	
	public void kill(String name) {
		
	}

}
