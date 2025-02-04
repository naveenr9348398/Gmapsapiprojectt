package Resources;

public enum Apiresources {
	
	Addplaceapi("/maps/api/place/add/json"),
	Getplaceapi("/maps/api/place/get/json"),
	Deleteplaceapi("/maps/api/place/delete/json");

	private String resources;
	
	Apiresources(String resources) {
		this.resources = resources;
	}
	
	public String getresources() {
		return resources;
	}

}
