package servlet;

import com.google.gson.Gson;

import java.io.PrintWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "EchoServlet", urlPatterns = {"/echo"})
public class EchoServlet extends HttpServlet{
  @Override
   protected void doPost  (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

		doGet(req, res);
		
		/*
		res.setContentType ("aplication/json");
		res.setHeader("Access-Control-Allow-Origin", "*");
		res.setHeader("Access-Control-Allow-Methods", "POST");
		res.setHeader("Access-Control-Allow-Headers", "*");

		PrintWriter out = res.getWriter();

		Map<String, String[]> parameterMap = req.getParameterMap();
		Map<String, String> data = new HashMap<String, String>();
		for (String key: parameterMap.keySet()) {
		 String parameter = parameterMap.get(key)[0];
		 data.put(key, parameter);
		}
		out.print(new Gson().toJson(data));
		out.flush();
		out.close();
		*/
	
   }

    @Override
     protected void doGet  (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		 
		// req = request, and res = response
		
		res.setContentType("text/html; charset=UTF-8");
	    PrintWriter out = res.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html><head>");
		out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
		out.println("<title>SWE 432 Echo Servlet, Assignment 4</title></head>");

		out.println("<h1>SWE 432 Echo Servlet, Assignment 4</h1>");
		
		// Get all requests (name from html post) and display it as html 
		
		// Display the string input
		String input = req.getParameter("String Input");
		out.println("<h2>String Input:</h2><p> " + input + "</p>");
		
		// Display the first random string
		String randomString = req.getParameter("Random String");
		out.println("<h2>Random String:</h2><p> " + randomString + "</p>");		

		// Display the second random string
		String randomStringTwo = req.getParameter("Random String #2 Without Replacement");
		out.println("<h2>Random String #2 Without Replacement:</h2><p> " + randomStringTwo + "</p>");
		
		// Display the sorted order string
		String sortedOrderString = req.getParameter("Sorted Order String");
		out.println("<h2>Sorted Order String:</h2><p> " + sortedOrderString + "</p>");

		// Display the reversed order string 
		String reverseOrderString = req.getParameter("Reverse Order String");
		out.println("<h2>Reverse Order String:</h2><p> " + reverseOrderString + "</p>");
		
	
		/*
		res.setContentType ("text/html");
		PrintWriter out = res.getWriter ();

		out.println ("<HTML>");
		out.println ("<HEAD>");
		out.println ("<TITLE>Invalid request</TITLE>");
		out.println ("</HEAD>");

		out.println ("<BODY>");
		out.println ("<CENTER>");
		out.println (
		"<P>Invalid GET request: TEST This service only accepts POST requests</P>"
		);
		out.println ("</CENTER>");
		out.println ("</BODY>");

		out.println ("</HTML>");
		out.flush();

		out.close ();
		*/

		
	}
	 
}
