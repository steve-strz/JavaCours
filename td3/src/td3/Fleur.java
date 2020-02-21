package td3;

public class Fleur {
	private String type = "";
	private double cost = 0.00;
	
	public Fleur(String type_, double cost_){
		type = type_;
		cost = cost_;
	}
	
	public double getCost(){
		return this.cost;
	}

	@Override
	public String toString() {
		return "Fleur [type=" + type + ", cost=" + cost + "]";
	}
}
