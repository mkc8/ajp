import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor
     */
    public Login() {
        super();
    }

    /**
     * Handles GET request
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.getWriter()
                .append("Served at: ")
                .append(request.getContextPath());
    }

    /**
     * Handles POST request
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        String uname = request.getParameter("username");
        String pass = request.getParameter("password");

        response.getWriter().println("<h2>Username: " + uname + "</h2>");
        response.getWriter().println("<h2>Password: " + pass + "</h2>");
    }

    /**
     * Handles DELETE request
     */
    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Not implemented
    }
}

<!DOCTYPE html>
<html>
<head>
    <title>Login Form</title>
</head>
<body>

    <h2>Login Form</h2>

    <form action="Login" method="post">
        <label>Username:</label>
        <input type="text" name="username"><br><br>

        <label>Password:</label>
        <input type="password" name="password"><br><br>

        <input type="submit" value="Login">
    </form>

</body>
</html>
