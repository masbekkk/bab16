public class Mahasiswa extends User{	
	private Dosen dosenWali;
	private String kelas;
	
	Mahasiswa(){
		this.kelas = "2 D3 IT A";
	}
	
	Mahasiswa(String username, String password){
		super(username, password);
	}
	
	void setUsername(String username){
		super.username = username;
	}
	
	void setPassword(String password){
		super.password = password;
	}
	
	void setPhone(String phone){
		super.phone = phone;
	}
	
	
	
}
