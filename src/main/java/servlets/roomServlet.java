package servlets;

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
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class roomServlet
 */
@WebServlet("/roomServlet")
public class roomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public roomServlet() {
        super();
    }
    
    SQLConnection sqlQueries = new SQLConnection();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
        	request.setAttribute("rooms", sqlQueries.getTable("rooms"));
        	request.getRequestDispatcher("/rooms.jsp").forward(request, response);
        } catch(SQLException e) {
        	e.printStackTrace();
    	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try {
			Map<String, String[]> params = request.getParameterMap();
			if (sqlQueries.addToTable("rooms", params) > 0) doGet(request, response);
			else {
				response.getWriter().println("<h1 style='color: red'>An error occurred when saving the data to the database</h1>");
			}
		} catch (Exception exception) {
			System.out.println(exception);
			response.getWriter().println("<h1 style='color: red'>An error has occured</h1>");
		}
	}

}
