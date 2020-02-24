package capgemini.online_payment_wallet.signup_signin.beans;

public class Users {
	
	int UserID;
	String UserName ;
	String Password ;
	String PhoneNumber ;
	String LoginName;
	
	public Users(int UserId ,String UserName ,String Password ,String PhoneNumber ,String LoginName ) {
		
		this.UserID=UserId;
		this.UserName=UserName;
		this.Password=Password;
		this.PhoneNumber=PhoneNumber;
		this.LoginName=LoginName;
		
	}

	public String getPassword() {
		return Password;
	}

	public String getLoginName() {
		return LoginName;
	}

	}

	

