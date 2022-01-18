package databaseConnection;

public class Students {
	
	   private String stFirstName;
	    private String stLastName;
	    private String stScore;
	    private String stId;

	    public Students() {
	    }

	    public Students(String stFirstName) {
	        this.stFirstName = stFirstName;
	    }

	    public Students(String stFirstName, String stLastName) {
	        this.stFirstName = stFirstName;
	        this.stLastName = stLastName;
	    }

	    public Students(String stFirstName, String stLastName, String stScore) {
	        this.stFirstName = stFirstName;
	        this.stLastName = stLastName;
	        this.stScore = stScore;
	    }

	    public Students(String stFirstName, String stLastName, String stScore, String stId) {
	        this.stFirstName = stFirstName;
	        this.stLastName = stLastName;
	        this.stScore = stScore;
	        this.stId = stId;
	    }

	    public void studentInformation() {
	        System.out.println("This is student Information");
	    }

	    // Method Override

	    public void demo() {
	        String name = "James";
	        name.toString();
	    }

//	    @Override
//	    public String toString(){
//	        return "Student"+"("+"stId= "+stId+")";
//	    }

	    @Override
	    public String toString() {
	        return "Students{" +
	                "stFirstName='" + stFirstName + '\'' +
	                ", stLastName='" + stLastName + '\'' +
	                ", stScore='" + stScore + '\'' +
	                ", stId='" + stId + '\'' +
	                '}';
	    }


//	    @Override
//	    public String toString() {
//	        String st="Rupy";
//	        System.out.println(st);
//	        return "Students{" + "stFirstName='" + stFirstName + '\'' + '}';
//	    }


//	    public static void main(String[] args) {
//	        Students students=new Students();
//	        //students.toString();
//	        System.out.println(students.toString());
//	    }
	
	
	
	
	
	
	
	
	
	

}
