package br.alura.com.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//oi
@WebServlet(urlPatterns="/oi")
public class OiMundoServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2829400422532929638L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("oi mundo servlet");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("Servlet executado com sucesso");
	}
	
}
