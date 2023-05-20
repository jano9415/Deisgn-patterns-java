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
		
		//Select utas�t�s k�ld�se egy mssql szervernek, facade oszt�ly n�lk�l.
		String connectionObject = MsSqlHelper.getConnection();
		MsSqlHelper msSqlHelper = new MsSqlHelper();
		System.out.println(msSqlHelper.select(columns, tabaleName, connectionObject));
		
		//Select utas�t�s k�ld�se egy mssql szervernek, facade oszt�ly haszn�lat�val.
		System.out.println(HelperFacade.select(HelperFacade.DbTypes.MSSQL, tabaleName, columns));
		
		
		
	}

}
