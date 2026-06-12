package annotation;


@ApiEndpoint (
	name = "UserService",
	version = "1.2",
	author = "Jane Forster"
)
public class UserService {
	public String getUser() {
		return "User";
	}
	public void createUser() {
		System.out.println("User created");
	}
}