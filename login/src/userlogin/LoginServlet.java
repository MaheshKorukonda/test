package userlogin;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSessionFactory;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		String firstname=request.getParameter("Firstname");
		String lastname=request.getParameter("Lastname");
		String username=request.getParameter("Uname");
		String pswd1=request.getParameter("pswd1");
		String month=request.getParameter("MONTH");
		String day=request.getParameter("DAY");
		String year=request.getParameter("YEAR");
		System.out.println(year);
		String message=null;
		String pnumber=request.getParameter("phonenumber");
		String dob=day+"/"+month+"/"+year;
		System.out.println(dob);
		LoginBean bean=new LoginBean();
		bean.setFirstName(firstname);
		bean.setLastName(lastname);
		bean.setUserName(username);
		bean.setDob(dob);
		bean.setPassword(pswd1);
		bean.setPhonenumber(pnumber);
		request.setAttribute("login",bean);
		
		SqlSessionFactory factory;
		factory=SessionFactory.sessionBuilder();
		LoginDao logindao=new LoginDao();
		logindao.setFactory(factory);
		int c=logindao.getCount(bean);
		if(c>=1)
		{
			message="user name already existed";
			request.setAttribute("message", message);
			request.getRequestDispatcher("/Login.jsp").forward(request, response);
		}
		else
		{
			int n=logindao.insertUserDetails(bean);
			System.out.println(n);
			if(n>0)
			{
				request.getRequestDispatcher("/welcome.jsp").forward(request, response);
			}
			
		 }
		
		}

}
