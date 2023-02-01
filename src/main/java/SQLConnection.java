import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SQLConnection {
	
    protected Connection connect() {
    	Connection con = null;
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
//    		con = DriverManager.getConnection(url + dbName, userName, password);
    		con = DriverManager.getConnection("jdbc:mysql://3.219.159.250:3306/hotelsdb", "admin", "password");
    		System.out.print(con);
    		if (con == null) {
        		System.out.print("Connection timed out");
    		}
    	} catch(SQLException e) {
    		e.printStackTrace();
    	} catch(ClassNotFoundException e) {
    		e.printStackTrace();
    	}
    	return con;
    }
    
    protected PreparedStatement addToPS(String sql, Map<String, String[]> params) throws SQLException, IOException, ServletException {
    	Connection con = connect();
    	PreparedStatement ps = null;
    	if (con != null) {
	    	ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			int i = 1;
			for (Map.Entry<String, String[]> entry : params.entrySet()) {
				String entryStr = entry.getValue()[0];
				try {
					ps.setInt(i, Integer.parseInt(entryStr));
			    } catch (NumberFormatException nfe) {
					ps.setString(i, entryStr);
			    }
				i++;
			}
    	}
		return ps;
    }
    
    public ArrayList<Map<String, Object>> getTable(String dbName) throws SQLException, IOException, ServletException {
    	ArrayList<Map<String, Object>> tableList = new ArrayList<Map<String, Object>>();
    	Connection con = connect();
    	if (con != null) {
    		try (PreparedStatement ps = con.prepareStatement("select * from " + dbName)) {
	    		ResultSet rs = ps.executeQuery();
	    		ResultSetMetaData md = rs.getMetaData();
	    		int columns = md.getColumnCount();
	    		while (rs.next()) {
	    			Map<String, Object> row = new HashMap<String, Object>(columns);
	    		    for (int i = 1; i <= columns; ++i) {
	    		    	 row.put(md.getColumnName(i), rs.getObject(i));
			     	}
	    		    tableList.add(row);
				}
	    	} catch(SQLException e) {
	    		System.out.println(e.getMessage());
	    	}
    	}
    	return tableList;
    }
    
    public int addToTable(String dbName, Map<String, String[]> params) throws SQLException, IOException, ServletException {
    	StringJoiner strJoiner = new StringJoiner(",");
    	for (int i = 0; i < params.size(); i++) strJoiner.add("?");
    	return addToPS("insert into " + dbName + " values (" + strJoiner.toString() + ")", params).executeUpdate();
    }
    
    public int editElement(String dbName, Map<String, String[]> params) throws SQLException, IOException, ServletException {
    	StringJoiner strJoiner = new StringJoiner(",");
    	for (Map.Entry<String, String[]> entry : params.entrySet()) strJoiner.add(entry.getKey() + " = ?");
    	return addToPS("update " + dbName + " set " + strJoiner.toString(), params).executeUpdate();
    }
    
    public int deleteFromTable(String dbName, Map<String, String[]> params) throws SQLException, IOException, ServletException {
    	String paramKey = (String) params.keySet().toArray()[0];
    	return addToPS("delete from " + dbName + " where " + paramKey + " = " + params.get(paramKey), params).executeUpdate();
    }

}