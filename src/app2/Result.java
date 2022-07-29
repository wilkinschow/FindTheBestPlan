package app2;

import java.util.*;

public class Result implements Comparable<Result>{
	
	public List<String> combinedPlans;
	public Long combinedPrice;
	public List<String> combinedServices;
	public Result(String combinedPlans, Long combinedPrice, String[] combinedServices) {
		super();
		this.combinedPlans = new ArrayList<String>(Arrays.asList(combinedPlans));
		this.combinedPrice = combinedPrice;
		this.combinedServices = new ArrayList<String>(Arrays.asList(combinedServices));
	}
	@Override
	public String toString() {
		//return "Result [combinedPrice=" + combinedPrice + ", combinedPlans=" + combinedPlans + ", combinedServices=" + combinedServices + "]" + System.lineSeparator();
		return combinedPrice+", "+combinedPlans.toString()
	    .replace("[", "")  //remove the right bracket
	    .replace("]", "")  //remove the left bracket
	    .trim();
	}
	public void addPlan(String planName, Long price, String service) {
		//Check if the selected service is already in the pool, if it contains the plan but not the svc, add it for free.
		if(!(this.combinedServices.contains(service))) {
			if(!(this.combinedPlans.contains(planName))){
				this.combinedPlans.add(planName);
				this.combinedPrice+=price;
			}
			this.combinedServices.add(service);
		}
	}
	@Override
	public int compareTo(Result u) {
		if (this.combinedPrice == null || u.combinedPrice == null){
		  return 0;
		}
		return this.combinedPrice.compareTo(u.combinedPrice);
	}
}
