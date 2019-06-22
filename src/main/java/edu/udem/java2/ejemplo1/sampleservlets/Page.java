package edu.udem.java2.ejemplo1.sampleservlets;

public class Page {
	
	public static final String html = "<!DOCTYPE html>\r\n" + 
			"<html>\r\n" + 
			"<head>\r\n" + 
			"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
			"<style>\r\n" + 
			"body {\r\n" + 
			"  font-family: Arial, Helvetica, sans-serif;\r\n" + 
			"  background-color: black;\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"* {\r\n" + 
			"  box-sizing: border-box;\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"/* Add padding to containers */\r\n" + 
			".container {\r\n" + 
			"  padding: 16px;\r\n" + 
			"  background-color: white;\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"/* Full-width input fields */\r\n" + 
			"input[type=text], input[type=password] {\r\n" + 
			"  width: 100%;\r\n" + 
			"  padding: 15px;\r\n" + 
			"  margin: 5px 0 22px 0;\r\n" + 
			"  display: inline-block;\r\n" + 
			"  border: none;\r\n" + 
			"  background: #f1f1f1;\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"input[type=text]:focus, input[type=password]:focus {\r\n" + 
			"  background-color: #ddd;\r\n" + 
			"  outline: none;\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"/* Overwrite default styles of hr */\r\n" + 
			"hr {\r\n" + 
			"  border: 1px solid #f1f1f1;\r\n" + 
			"  margin-bottom: 25px;\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"/* Set a style for the submit button */\r\n" + 
			".registerbtn {\r\n" + 
			"  background-color: #4CAF50;\r\n" + 
			"  color: white;\r\n" + 
			"  padding: 16px 20px;\r\n" + 
			"  margin: 8px 0;\r\n" + 
			"  border: none;\r\n" + 
			"  cursor: pointer;\r\n" + 
			"  width: 100%;\r\n" + 
			"  opacity: 0.9;\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			".registerbtn:hover {\r\n" + 
			"  opacity: 1;\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"/* Add a blue text color to links */\r\n" + 
			"a {\r\n" + 
			"  color: dodgerblue;\r\n" + 
			"}\r\n" + 
			"\r\n" + 
			"/* Set a grey background color and center the text of the \"sign in\" section */\r\n" + 
			".signin {\r\n" + 
			"  background-color: #f1f1f1;\r\n" + 
			"  text-align: center;\r\n" + 
			"}\r\n" + 
			"</style>\r\n" + 
			"</head>\r\n" + 
			"<body>\r\n" + 
			"\r\n" + 
		
			"<form action=\"FirstServlet\" method = \"POST\"\r\n" + 
			"  <div class=\"container\">\r\n" + 
			"    <h1>Register</h1>\r\n" + 
			"    <p>Please fill in this form to create an account.</p>\r\n" + 
			"    <hr>\r\n" + 
			"\r\n" + 
			"    <label for=\"email\"><b>Name</b></label>\r\n" + 
			"    <input type=\"text\" placeholder=\"Enter Name\" name=\"name\" required>\r\n" + 
			"\r\n" + 
			"    <label for=\"email\"><b>Email</b></label>\r\n" + 
			"    <input type=\"text\" placeholder=\"Enter Email\" name=\"email\" required>\r\n" + 
			"\r\n" + 
			"    <label for=\"psw\"><b>Password</b></label>\r\n" + 
			"    <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\r\n" + 
			"\r\n" + 
			"    <label for=\"psw-repeat\"><b>Repeat Password</b></label>\r\n" + 
			"    <input type=\"password\" placeholder=\"Repeat Password\" name=\"psw-repeat\" required>\r\n" + 
			"    <hr>\r\n" + 
			"    <p>By creating an account you agree to our <a href=\"#\">Terms & Privacy</a>.</p>\r\n" + 
			"\r\n" + 
			"    <button type=\"submit\" class=\"registerbtn\">Register</button>\r\n" + 
			"  </div>\r\n" + 
			"  \r\n" + 
			"  <div class=\"container signin\">\r\n" + 
			"    <p>Already have an account? <a href=\"#\">Sign in</a>.</p>\r\n" + 
			"  </div>\r\n" + 
			"</form>\r\n" + 
			"\r\n" + 
			"</body>\r\n" + 
			"</html>";
}
