package arithmeticoperator;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Arithmeticopertorservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Arithmeticopertorservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    int result;
    String a = request.getParameter("num1");
    String s=request.getParameter("opsymbol");
    String b = request.getParameter("num2");
   int  x = Integer.parseInt(a);
   int  y = Integer.parseInt(b);
   char ch=s.charAt(0);
   switch(ch) {
   case '+':
	   result=x+y;
	   response.getWriter().write("sum of "+  x +  "and"  +  y  +  "is"  +  result);
	   break;
   case '-':
	   result=x-y;
	   response.getWriter().write("subtraction of "+  x  +  "and"  +  y  +  "is"  +  result);
	    
	   break;
   case '*':
	   result=x*y;
	   response.getWriter().write("multiplicatin of " +  x  +  "and"  +  y  +  "is"  +  result);
	   break;
   case '/':
	   result=x/y;
	   response.getWriter().write("division 0f " +  x  +  "and"  +  y  +  "is"  +  result);
	   break;
   }
  
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
