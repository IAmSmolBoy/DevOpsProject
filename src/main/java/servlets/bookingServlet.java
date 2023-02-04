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
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class bookingServlet
 */
@WebServlet("/bookingServlet")
public class bookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bookingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    SQLConnection sqlQueries = new SQLConnection();
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try {
			Map<String, String[]> params = request.getParameterMap();
			if (sqlQueries.addToTable("bookings", params) > 0) {
		    	request.setAttribute("rooms", sqlQueries.getTable("rooms"));
		    	request.getRequestDispatcher("/rooms.jsp").forward(request, response);
			}
			else {
				response.getWriter().println("<h1 style='color: red'>An error occurred when saving the data to the database</h1>");
			}
		} catch (Exception exception) {
			System.out.println(exception);
			response.getWriter().println("<h1 style='color: red'>An error has occured</h1>");
		}
	}

}
