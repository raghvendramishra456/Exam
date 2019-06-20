package singerServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import singClass.Singer;
import singerDao.SingerDao;
import singerDao.SingerDaoImp;


public class SingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		PrintWriter pr = response.getWriter();
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String dob = request.getParameter("dob");
		String address = request.getParameter("address");
		
		
		Singer s = new Singer(firstname,lastname,dob,address);
		
		SingerDao sd = new SingerDaoImp();

		if(sd.insert(s)) {
			
			System.out.println("Record Inserted");
		}else {
			
			System.out.println("Record Not Inserted");
		}
		doGet(request, response);
	}

}
