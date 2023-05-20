package facade;

import java.util.List;

public class PsSqlHelper {
	
	//A kapcsol�d�shoz sz�ks�ges objektum elk�r�se
	public static String getConnection() {
		return "This is the connection object for postgres sql server";
	}
	
	//Select utas�t�sa
	public String select(List<String> columns, String tableName, String connectionObject) {
		//Kapcsol�d�s az adatb�zishoz, select utas�t�s v�grehajt�sa, eredm�ny visszaad�sa
		//select id, firstname, age from Employee
		return "This is the result of the select query from pssql -> many employee objects";
	}
	
	//Insert utas�t�s
	public String insert(List<String> columns, List<String> values, String tableName, String connectionObject) {
		//Kapcsol�d�s az adatb�zishoz, insert utas�t�s v�grehajt�sa, eredm�ny visszaad�sa
		//insert into Employee (firstname, lastname, age) values ('L�szl�', 'Nagy', 25)
		return "Insert query was success to pssql";
	}

}
