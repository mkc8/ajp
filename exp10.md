# Calculator Servlet Project Setup

## Step-by-Step Guide

1. **Open Eclipse IDE**

2. **Create a Dynamic Web Project**

   * Go to: `File → New → Dynamic Web Project`
   * Enter **Project Name**
   * Click **Next**
   * Click **Next** again

3. **Important Step**

   * Check  **Generate web.xml deployment descriptor**
   * Click **Finish**

4. **Create Servlet**

   * Right-click project → `New → Servlet`
   * Enter **Class Name: CalculatorServlet**
   * Click **Next**
   * Click **Next** again
   * Select:

     *  `doGet()`
   * Click **Finish**

---

## 5. **Write Servlet Code (CalculatorServlet.java)**

```java
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Calculator</title></head><body>");

        String n1Str = request.getParameter("txtN1");
        String n2Str = request.getParameter("txtN2");
        String opr = request.getParameter("opr");

        // Validation
        if (n1Str == null || n2Str == null || opr == null ||
            n1Str.isEmpty() || n2Str.isEmpty()) {

            out.println("<h2 style='color:red;'>Please enter all values and select operation</h2>");
            out.println("</body></html>");
            return;
        }

        double n1 = Double.parseDouble(n1Str);
        double n2 = Double.parseDouble(n2Str);
        double result = 0;

        switch (opr) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                if (n2 == 0) {
                    out.println("<h2 style='color:red;'>Cannot divide by zero</h2>");
                    out.println("</body></html>");
                    return;
                }
                result = n1 / n2;
                break;
        }

        out.println("<h1>Result = " + result + "</h1>");
        out.println("</body></html>");
    }
}
```

---

## 6. **Create HTML File**

* Go to `WebContent` (or `webapp`) folder
* Right-click → `New → HTML File`
* Name it: `index.html`

---

## 7. **Write Code in index.html**

```html
<html>
<head>
    <title>Calculator App</title>
</head>
<body>

<h2>Simple Calculator</h2>

<form action="CalculatorServlet" method="get">
    Enter First Number:
    <input type="text" name="txtN1"><br><br>

    Enter Second Number:
    <input type="text" name="txtN2"><br><br>

    Select Operation:<br>
    <input type="radio" name="opr" value="+"> Addition<br>
    <input type="radio" name="opr" value="-"> Subtraction<br>
    <input type="radio" name="opr" value="*"> Multiply<br>
    <input type="radio" name="opr" value="/"> Divide<br><br>

    <input type="reset" value="Reset">
    <input type="submit" value="Calculate">
</form>

</body>
</html>
```

---

## 8. **Run the Project**

* Right-click on `CalculatorServlet.java`
* Click **Run As → Run on Server**
* Select **Apache Tomcat v9.0**
* Click **Finish**

---

## 9. **Run HTML File**

* Right-click `index.html`
* Run As → **Run on Server**

---

## Notes

* Uses `doGet()` (form default method)
* Validation added to prevent errors
* Division by zero handled
* Always open via `index.html`, not servlet directly
* URL format:

  ```
  http://localhost:8080/ProjectName/index.html
  ```

---
