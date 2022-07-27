package app2;

public class ServicePlans {
	private Long id;
	private String planName;
	private Long price;
	private String services;
	
	public ServicePlans(String planName, Long price, String services) {
		super();
		this.planName = planName;
		this.price = price;
		this.services = services;
	}
	
	public ServicePlans() {
		super();
		this.planName = "";
		this.price = (long) 0;
		this.services = "";
	}

	public String getPlanName() {
		return planName;
	}

	public Long getPrice() {
		return price;
	}

	public String getServices() {
		return services;
	}

	@Override
	public String toString() {
		return "ServicePlans [id=" + id + ", planName=" + planName + ", price=" + price + ", services=" + services
				+ "]";
	}
}
