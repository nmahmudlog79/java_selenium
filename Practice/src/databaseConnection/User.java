package databaseConnection;

public class User {
	
	private String userId;
    private String userName;
    private String userDob;

    public User() {
    }

    public User(String userId) {
        this.userId = userId;
    }

    public User(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public User(String userId, String userName, String userDob) {
        this.userId = userId;
        this.userName = userName;
        this.userDob = userDob;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserDob() {
        return userDob;
    }

    public void setUserDob(String userDob) {
        this.userDob = userDob;
    }

    public void userInformation(){
        System.out.println("This is user Information");
    }
	
}
