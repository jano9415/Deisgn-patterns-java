package facade;

import java.util.List;

public class MsSqlHelper {
	
	//A kapcsolódáshoz szükséges objektum elkérése
	public static String getConnection() {
		return "This is the connection object for microsoft sql server";
	}
	
	//Select utasítása
	public String select(List<String> columns, String tableName, String connectionObject) {
		//Kapcsolódás az adatbázishoz, select utasítás végrehajtása, eredmény visszaadása
		//select id, firstname, age from Employee
		return "This is the result of the select query from mssql -> many employee objects";
	}
	
	//Insert utasítás
	public String insert(List<String> columns, List<String> values, String tableName, String connectionObject) {
		//Kapcsolódás az adatbázishoz, insert utasítás végrehajtása, eredmény visszaadása
		//insert into Employee (firstname, lastname, age) values ('László', 'Nagy', 25)
		return "Insert query was success to mssql";
	}

}
