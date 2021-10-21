public class User{
	protected String id, phone, username, password;
	
	public User(){
		this.id = "1";
		this.phone = "0821321";
		this.username = "masbek";
		this.password = "masbek123";
	}
	
	public User(String username, String password){
		this.username = username;
		this.password = password;
	}
	
	protected boolean login(String username, String password){
		if(username == this.username && password == this.password) return true;
		else return false;
	}
	
	protected boolean login2(String phone, String password){
		if(phone == this.phone && password == this.password) return true;
		else return false;
	}
}
