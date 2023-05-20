package facade;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<String> columns = new ArrayList<>();
		columns.add("id");
		columns.add("firstname");
		columns.add("age");
		
		String tabaleName = "Employee";
		
		//Select utasítás küldése egy mssql szervernek, facade osztály nélkül.
		String connectionObject = MsSqlHelper.getConnection();
		MsSqlHelper msSqlHelper = new MsSqlHelper();
		System.out.println(msSqlHelper.select(columns, tabaleName, connectionObject));
		
		//Select utasítás küldése egy mssql szervernek, facade osztály használatával.
		System.out.println(HelperFacade.select(HelperFacade.DbTypes.MSSQL, tabaleName, columns));
		
		
		
	}

}
