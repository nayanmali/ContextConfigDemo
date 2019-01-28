package in.ac.adit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextConfigDemo extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		ServletContext context = getServletContext();
		ServletContext context1 = getServletConfig().getServletContext();
		
		String contextValue = (String) context.getInitParameter("WEBAPP");
		String contextValue1 = (String) context1.getInitParameter("WEBAPP");
		
		out.println(contextValue);
		out.println(contextValue1);

		ServletConfig config = getServletConfig();
	
		String configValue = config.getInitParameter("CONFIGNAME");
		out.println(configValue);
	}

}
