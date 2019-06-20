package dateTime;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DateTime extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DateTime() {
        super();

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
    	PrintWriter pr = response.getWriter();
    	
    	Date d = new Date();
    	
    	System.out.println("Current Date = "+d);
    	
    	//out.println("<html><body>Good Morning Raghvendra</body></html>");

    	response.sendRedirect("DateTime.jsp");
    	
	}

}
