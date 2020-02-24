package capgemini.online_payment_wallet.signup_signin.dao;
public interface Wallet {

	public void Users(int UserId ,String UserName ,String Password ,String PhoneNumber ,String LoginName );
	
	public void userRegistration();
	public void register();
	public void loginUser();
	
}
