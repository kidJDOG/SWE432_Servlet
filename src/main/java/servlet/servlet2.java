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

@WebServlet(name = "servlet2", urlPatterns = {"/servlet2"})
public class servlet2 extends HttpServlet{
  //@Override
  protected void doPost  (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

    res.setContentType("text/html; charset=UTF-8");
    PrintWriter out = res.getWriter();

    String sortedOrderString = req.getParameter("Sorted Order String");
		
    // If the string is blank, print error msg
    // Compare with the sortedOrderString since this list gets rid of whitespace, 'String input' does not
    if (sortedOrderString.equals("")) {
        out.println("<h2>String Input:</h2><p> No input was provided</p>");
    }
    // Else, print the string 
    else {
        // Display the string input
        String input = req.getParameter("String Input");
        out.println("<h2>String Input:</h2><p> " + input + "</p>");
    }
    
    // Display the first random string
    String randomString = req.getParameter("Random String");
    out.println("<h2>Random String:</h2><p> " + randomString + "</p>");		

    // Display the second random string
    String randomStringTwo = req.getParameter("Random String #2 Without Replacement");
    out.println("<h2>Random String #2 Without Replacement:</h2><p> " + randomStringTwo + "</p>");
    
    // Display the sorted order string
    out.println("<h2>Sorted Order String:</h2><p> " + sortedOrderString + "</p>");

    // Display the reversed order string 
    String reverseOrderString = req.getParameter("Reverse Order String");
    out.println("<h2>Reverse Order String:</h2><p> " + reverseOrderString + "</p>");

  }
}