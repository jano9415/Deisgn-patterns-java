package facade;

import java.util.List;

public class HelperFacade {
	
	public static String select(DbTypes dbType, String tableName, List<String> columns) {
		String connectionObject = null;
		
		switch(dbType) {
		case MSSQL:
			connectionObject = MsSqlHelper.getConnection();
			MsSqlHelper msSqlHelper = new MsSqlHelper();
			return msSqlHelper.select(columns, tableName, connectionObject);
		case PSSQL:
			connectionObject = PsSqlHelper.getConnection();
			PsSqlHelper psSqlHelper = new PsSqlHelper();
			return psSqlHelper.select(columns, tableName, connectionObject);
		}
		return null;
	}
	
	public static enum DbTypes{
		MSSQL,PSSQL;
	}
	

}
