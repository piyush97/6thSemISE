import java.io.IOException;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;;

/**
 * Servlet implementation class Tshirt
 */
@WebServlet("/Tshirt")
public class Tshirt extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static Connection connection;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Tshirt() {
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
		// TODO Auto-generated method stub
		String tag = request.getParameter("tag");
		String colour = request.getParameter("colour");
		String[] accessories = request.getParameterValues("acc");
		int pocket = Integer.parseInt(request.getParameter("pocket"));

		String acc = "";
		for (String x : accessories )
			acc = acc + x + " ";

		try {
			PreparedStatement stmt;
			stmt = (PreparedStatement) connection.prepareStatement("insert into tshirt values(?,?,?,?,?)");
			stmt.setInt(1,0);
			stmt.setString(2, acc);
			stmt.setString(3, tag);
			stmt.setInt(4, pocket);
			stmt.setString(5, colour);
			stmt.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("display.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
