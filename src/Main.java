
public class Main {

	public static void main(String[] args) {
		
		Evm s=new Evm(1,"Siolim");
		BU c1=new BU(s,"mandrekar");
		BU c5=new BU(s,"Vinod");
		
		Evm p=new Evm(2,"Ponda");
		BU c2=new BU(p,"Ravi");
		BU c3=new BU(p,"digambar");
		BU c4=new BU(p,"yash");
		
		//voters
		Voter v=new Voter(101,c1);
		c1.incrementVoteCount();
		System.out.println("Blue button pressed!! Your vote has been recorded");
		
		Voter v2=new Voter(102,c1);
		c1.incrementVoteCount();
		System.out.println("Blue button pressed!! Your vote has been recorded");
		
	
		Voter v5=new Voter(103,c1);
		c1.incrementVoteCount();
		System.out.println("Your vote has been recorded");
		

		Voter v3=new Voter(103,c3);
		c3.incrementVoteCount();
		System.out.println("Your vote has been recorded");
		
	
		Voter v4=new Voter(104,c3);
		c3.incrementVoteCount();
		System.out.println("Your vote has been recorded");
		
	
		Voter v6=new Voter(104,c2);
		c2.incrementVoteCount();
		System.out.println("Your vote has been recorded");
		
	
		Voter v7=new Voter(104,c3);
		c3.incrementVoteCount();
		System.out.println("Your vote has been recorded");
				
		
		System.out.println("");
		
		System.out.println("Total number of votes polled "+Voter.counter());

		System.out.println("");
		
		System.out.println("After closing poll:");
		System.out.print(Evm.closepoll());

		System.out.println("");
		
		System.out.println(c1.getName()+" got "+c1.getNumberOfVotes()+" number of votes from "+ s.getConstinuency());
		System.out.println(c5.getName()+" got "+c5.getNumberOfVotes()+" number of votes from "+ s.getConstinuency());

		System.out.println(c3.getName()+" got "+c3.getNumberOfVotes()+" number of votes from "+ p.getConstinuency());
		System.out.println(c2.getName()+" got "+c2.getNumberOfVotes()+" number of votes from "+ p.getConstinuency());
		System.out.println(c4.getName()+" got "+c4.getNumberOfVotes()+" number of votes from "+ p.getConstinuency());

		System.out.println("");
		
		Voter.resetCounter();
		System.out.println("Counter reset:");
		System.out.println("Total number of votes polled "+Voter.counter());
		
		
	}

}
