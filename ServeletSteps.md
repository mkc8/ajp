# Servlet Experiment

## Step-by-Step Guide

1. **Open Eclipse IDE**

2. **Create a Dynamic Web Project**

   * Go to: `File → New → Dynamic Web Project`
   * Enter **Project Name**
   * Click **Next**
   * Click **Next** again

3. **Important Step**

   * Check  **Generate web.xml most important**
   * Click **Finish**

4. **Create Servlet**

   * Right-click on project → `New → Servlet`
   * Enter **Class Name: Login**
   * Click **Next**
   * Click **Next** again
   * Select:

     *  `init()`
     *  `doDelete()`
   * Click **Finish**

5. **Write Servlet Code**

   * Open `Login.java`
   * Paste your servlet code

6. **Create HTML File**

   * Go to `WebContent` (or `webapp`) folder
   * Right-click → `New → HTML File`
   * Name it: `index.html`
   * Paste your login form code

7. **Run the Project**

   * Right-click on `Login.java`
   * Click **Run As → Run on Server**
   * Select **Apache Tomcat v9.0**
   * Click **Finish**

8. **Access the Application**

   * Right-click `index.html`
   * Run as → **Run on Server**

9. **Result**

   * Login form will open in browser
   * Enter username & password
   * You will see the output displayed

---

## Notes

* Make sure Tomcat is properly configured in Eclipse
* Project should be deployed on **localhost**
* URL will look like:
  `http://localhost:8080/ProjectName/index.html`

---




## ⚠️ Common Errors

* 404 Error → Wrong URL
* Servlet not found → Wrong mapping
* Server not started → Start Tomcat
