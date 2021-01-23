class Login{
	public static void main(String args[]){
		System.out.println("Login functionality has to be developed");
		//merged code to master
		String username ="admin";
		String password ="admin";
		verifyLogin(username,password)
	}

	public boolean verifyLogin(String username, String password){
		if(username.equals("admin")&& password.equals("admin")){
		return true;
	}
	return false;
	}
}
