
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculateTax")
public class CalculateTax extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CalculateTax() {
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        double salary = Double.parseDouble(request.getParameter("salary"));
        double deduction = Double.parseDouble(request.getParameter("deduction"));
        double incomeTax = (salary - deduction) * 0.2;

        response.getWriter().append("\nName: " + name).append("\nGender: " + gender).append("\nSalary: " + salary)
                .append("\nDeduction: " + deduction).append("\nIncomeTax: " + incomeTax);

        String newFile = new File("data.txt").getAbsolutePath();
        System.out.println("File:" + newFile);

        PrintWriter pw = new PrintWriter("data.txt");
        pw.println("Name: " + name);
        pw.println("Gender: " + gender);
        pw.println("Salary: " + salary);
        pw.println("Deduction: " + deduction);
        pw.println("IncomeTax: " + incomeTax);

        pw.close();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
