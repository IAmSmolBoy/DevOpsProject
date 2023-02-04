package servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class usersServlet
 */
@WebServlet("/usersServlet")
public class usersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public usersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    SQLConnection sqlQueries = new SQLConnection();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
        	request.setAttribute("rooms", sqlQueries.getTable("users"));
        	request.getRequestDispatcher("/rooms.jsp").forward(request, response);
        } catch(SQLException e) {
        	e.printStackTrace();
    	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try {
			Map<String, String[]> params = request.getParameterMap();
			if (sqlQueries.addToTable("users", params) > 0) doGet(request, response);
			else {
				response.getWriter().println("<h1 style='color: red'>An error occurred when saving the data to the database</h1>");
			}
		} catch (Exception exception) {
			System.out.println(exception);
			response.getWriter().println("<h1 style='color: red'>An error has occured</h1>");
		}
	}

}
