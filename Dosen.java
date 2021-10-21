public class Dosen extends User{
	private String pangkat, golongan, key;
	
	public Dosen(){
		this.pangkat = "Dosen Wali";
		this.golongan = "Tiga";
		this.key = "012345";
	}
	
	public Dosen(String username, String password){
		super(username, password);
	}
	
	protected boolean login(String username, String password){
		if(username == this.username && password == this.password) return true;
		else return false;
	}
	
	protected boolean login(String username, String password, String key){
		if(username == this.username && password == this.password && this.key == key) return true;
		else return false;
	}
	
	protected boolean login2(String phone, String password){
		if(phone == this.phone && password == this.password) return true;
		else return false;
	}
	
	protected boolean login3(String key, String password){
		if(key == this.key && password == this.password) return true;
		else return false;
	}
	
	void setKey(String key){
		this.key = key;
	}
	
}
