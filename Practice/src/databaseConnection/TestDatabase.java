package databaseConnection;

import java.util.ArrayList;
import java.util.List;

public class TestDatabase {
	
	 public static void main(String[] args) throws Exception {
	        //ConnectDatabase.readDatabaseTableColumn("movieinfo","movieTitle");
	        //ConnectDatabase.directDatabaseQueryExecution("select * from movieinfo","movieTitle");
	        List<String> mobileBrandList = new ArrayList<>();
	        mobileBrandList.add("iPhone");
	        mobileBrandList.add("Samsung");
	        mobileBrandList.add("LG");
	        mobileBrandList.add("NOKIA");

//	        for (String st:mobileBrandList){
//	        ConnectDatabase.insertDataFromStringToTable(st,"mobileinfo","mobileBrand");
//	        }

//	        for (String st:mobileBrandList){
//	            ConnectDatabase.insertDataFromStringToTable(st,"movieinfo","mobilebrand");
//	        }


	        List<Integer> mobilePhoneNumberList = new ArrayList<>();
	        mobilePhoneNumberList.add(46546546);
	        mobilePhoneNumberList.add(47546546);
	        mobilePhoneNumberList.add(48546546);
	        mobilePhoneNumberList.add(45546546);
	        mobilePhoneNumberList.add(44546546);
	        ConnectDatabase.insertIntegerDataFromArrayListToSQLTable("amirInfo", "phoneNumber", mobilePhoneNumberList);

	        List<String> itemList = new ArrayList<>();
	        itemList.add("Soccer");
	        itemList.add("Football");
	        itemList.add("cricket");
	        itemList.add("Hockey");
	        ConnectDatabase.insertStringDataFromArrayListToSQLTable("iddirInfo", "items", itemList);
	        ConnectDatabase.insertStringDataFromArrayListToSQLTable1("MahmudInfo", "id", "ItemDetails", itemList);

	        ConnectDatabase.insertDataInMultipleColumn("celiasInfo", "cl1", "cl2", itemList, mobileBrandList);

	        ConnectDatabase.insertDataInMultipleColumn1("tahminasInfo", "cl1", "cl2");



	        // old codes

	        //ConnectDatabase.readDataBase("movie", "title");
	        // ConnectDatabase.readDataBase("movie","id","title"); // Not working as expected

	        int[] number = {201, 202, 203, 204, 205, 206, 207};

	        //ConnectDatabase.insertDataFromArrayToSqlTable(number,"stInfo","stNumber");

	        //ConnectDatabase.readDataBase("stInfo", "stNumber");
	        // ConnectDatabase.insertDataFromStringToSqlTable("Pakistan","countries","countryName");
	        // ConnectDatabase.insertProfileToSqlTable("countries","countryName","countryCode","Bangladesh",88);

	        //String query = "select * from movie";
	        //ConnectDatabase.directDatabaseQueryExecute(query, "title");

	        List<String> stName = new ArrayList<>();
	        stName.add("Junaid");
	        stName.add("Akbar");
	        stName.add("Hashem");
	        stName.add("Sharif");
	        List<String> emailList = new ArrayList<>();
	        emailList.add("junaid@gmail.com");
	        emailList.add("akbar@gmail.com");
	        emailList.add("hashem@gmail.com");
	        emailList.add("sharif@gmail.com");

	        // Have Issue on below two methods
	        // ConnectDatabase.insertDataFromArrayListToSqlTable(stName, emailList, "StudentInformation", "studentName", "studentEmail");
	        //ConnectDatabase.insertDataFromArrayListToSqlTable3(stName,"StudentInformation","studentName");

	        Students student1=new Students("jack","cohen","230","1");
	        Students student2=new Students("jack1","cohen1","330","2");
	        Students student3=new Students("jack2","cohen2","430","3");

	        List<Students> student1s=new ArrayList<>();
	        student1s.add(student1);
	        student1s.add(student2);
	        student1s.add(student3);

	        ConnectDatabase.insertDataFromArrayListToSqlTable2(student1s,"emailtable","stEmailList");

	        //ConnectDatabase.readUserProfileFromSqlTable("movie");


	    }


}
