package pojoRequest;

public class CreateResource {
	public String title;
	public String body;
	public String userId;

	/**
	* No args constructor for use in serialization
	*
	*/
	public CreateResource() {
	}

	/**
	*
	* @param title
	* @param body
	* @param userId
	*/
	public CreateResource(String title, String body, String userId) {
	super();
	this.title = title;
	this.body = body;
	this.userId = userId;
	}
}
