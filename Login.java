class Login{
	public static void main(String args[]){
		//added comment to get merge conflict	
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
