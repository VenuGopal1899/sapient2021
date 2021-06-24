/**
 * 
 */
package trainingweb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author admi
 *
 */
@WebServlet("/memberServlet")
public class MemberServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1167177567744081860L;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		/**
		int employeeId = Integer.parseInt(req.getParameter("employeeId"));
		employeeService.removeEmployee(employeeId);

		List<Employee> allEmployees = employeeService.findAllEmployees();
		req.setAttribute("allEmployees", allEmployees);
		RequestDispatcher dispatcher = req.getRequestDispatcher("employee.jsp");
		dispatcher.forward(req, resp);
		**/
	}


}
