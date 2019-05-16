import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class NameSearch
 */
@WebServlet("/NameSearch")
public class NameSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static Connection connection;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NameSearch() {
        super();
        // TODO Auto-generated constructor stub
        try {
        	Class.forName(Constants.driver);
        	connection = (Connection) DriverManager.getConnection(Constants.host, Constants.user, Constants.pass);
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String query = "SELECT * FROM phonebook WHERE name='" +name+ "'";

		try {
			Statement stmt = (Statement) connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			if ( rs.isBeforeFirst() ){
				response.getWriter().append("Name\tNumber\tAddress\tCompany\tZipcode\n");
				while(rs.next()){
					response.getWriter()
						.append("\n" + rs.getString("name"))
						.append("\t" + rs.getLong("phno"))
						.append("\t" + rs.getString("address"))
						.append("\t" + rs.getString("company"))
						.append("\t" +rs.getInt("zipcode"));
				}
			}
			else
				response.getWriter().append("No entry in phonebook for given Name\n");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
