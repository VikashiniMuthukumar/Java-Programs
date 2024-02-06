import java.util.Scanner;

interface Stall{ 
	public void input();
	public String display();
}
class GoldStall implements Stall{
	
	private String stallName;
	private int stallCost;
	private String ownerName;
	private int numberofTVSets;
	public GoldStall(){
		
	}

	@Override
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Stall details in comma seperated (StallName,StallCost,OwnerName,NumberofTVSets)");
		String values=sc.nextLine();
		stallName=values.split(",")[0];
		stallCost =Integer.valueOf(values.split(",")[1]); 
		ownerName = values.split(",")[2]; 
		numberofTVSets = Integer.valueOf(values.split(",")[3]); 
		
	}
	public GoldStall( String stallName,int stallCost,String ownerName,int numberofTVSets) {
		this.stallName=stallName;
		this.stallCost=stallCost;
		this.ownerName=ownerName;
		this.numberofTVSets=numberofTVSets;
	}
	
	@Override
	public String display() {
		return "StallName:"+stallName+"\nCost:"+stallCost+"\nOwner Name:"+ownerName+"\nNumber of TV Sets:"+numberofTVSets;
	}

	public String getStallName() {
		return stallName;
	}

	public void setStallName(String stallName) {
		this.stallName = stallName;
	}

	public int getStallCost() {
		return stallCost;
	}

	public void setStallCost(int stallCost) {
		this.stallCost = stallCost;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getNumberofTVSets() {
		return numberofTVSets;
	}

	public void setNumberofTVSets(int numberofTVSets) {
		this.numberofTVSets = numberofTVSets;
	}
	
}


class PremiumStall implements Stall{

	private String stallName;
	private int stallCost;
	private String ownerName; 
	private int numberOfProjectors;
	public PremiumStall(){
		
	}
	
	@Override
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Stall details in comma seperated (StallName,StallCost,OwnerName,NumberOfProjectors)");
		String values=sc.nextLine();
		stallName=values.split(",")[0];
		stallCost =Integer.valueOf(values.split(",")[1]); 
		ownerName = values.split(",")[2]; 
		numberOfProjectors = Integer.valueOf(values.split(",")[3]); 
		
	}
	
	public PremiumStall( String stallName,int stallCost,String ownerName,int numberOfProjectors) {
		this.stallName=stallName;
		this.stallCost=stallCost;
		this.ownerName=ownerName;
		this.numberOfProjectors=numberOfProjectors;
	}

	@Override
	public String display() {
		return "StallName:"+stallName+"\nCost:"+stallCost+"\nOwner Name:"+ownerName+"\nNumber of Projectors:"+numberOfProjectors;
	}
	
	public String getStallName() {
		return stallName;
	}

	public void setStallName(String stallName) {
		this.stallName = stallName;
	}

	public int getStallCost() {
		return stallCost;
	}

	public void setStallCost(int stallCost) {
		this.stallCost = stallCost;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getNumberOfProjectors() {
		return numberOfProjectors;
	}

	public void setNumberOfProjectors(int numberOfProjectors) {
		this.numberOfProjectors = numberOfProjectors;
	}

}


class ExecutiveStall implements Stall{
	private String stallName;
	private int cost;
	private String ownerName; 
	private int screen;
	public ExecutiveStall(){
		
	}
	
	@Override
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Stall details in comma seperated (StallName,Cost,OwnerName,Screen)");
		String values=sc.nextLine();
		stallName=values.split(",")[0];
		cost =Integer.valueOf(values.split(",")[1]); 
		ownerName = values.split(",")[2]; 
		screen = Integer.valueOf(values.split(",")[3]); 
	}
	public ExecutiveStall(String stallName,int cost,String ownerName,int screen) {
		this.stallName=stallName;
		this.cost=cost;
		this.ownerName=ownerName;
		this.screen=screen;
	}

	@Override
	public String display() {
		return "StallName:"+stallName+"\nCost:"+cost+"\nOwner Name:"+ownerName+"\nNumber of Screen:"+screen;
	}

	public String getStallName() {
		return stallName;
	}

	public void setStallName(String stallName) {
		this.stallName = stallName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getScreen() {
		return screen;
	}

	public void setScreen(int screen) {
		this.screen = screen;
	}
	

}

public class StallType {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		GoldStall g=new GoldStall();
		PremiumStall p=new PremiumStall();
		ExecutiveStall e=new ExecutiveStall();
		System.out.println("Choose the Stall \n1)Gold Stall \n 2)Premium Stall \n3)Executive Stall");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			g.input();
			System.out.println(g.display());
			break;
		case 2:
			p.input();
			System.out.println(p.display());
			break;
		case 3:
			e.input();
			System.out.println(e.display());
			break;
		default:
			System.out.println("Invalid choice!");
		}
		

	}

}
