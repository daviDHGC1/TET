package application;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		DB.getConnection();
		DB.closeConnection();
		
		
	}

}
