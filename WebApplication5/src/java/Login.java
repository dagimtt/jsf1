


import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
@ManagedBean
@SessionScoped
public class Login implements Serializable {
  private String usern;
    private String pass;
   
  
  
    public String getUsern() {
        return usern;
    }

    public void setUsern(String usern) {
        this.usern = usern;
    }
  
     public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String method1() throws SQLException, ClassNotFoundException {
        boolean num = Dagim(usern, pass);
        if (num) {
              DBConnection dbcon = new DBConnection();
              Connection con = dbcon.connMethod();
            PreparedStatement ps = con.prepareStatement("select TYPE from ADUSER where USERNAME=?");
            ps.setString(1, usern);       
            ResultSet rs = ps.executeQuery();
            rs.next();
            String userType =rs.getString(1);
            if ("Ad".equals(userType)) {
                return "homePage";
            } else {
                return "user";
            }
        } else {
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Incorrect Username and Passowrd",
                            ""));
            return "admin";
        }
    }


 public static boolean Dagim(String name, String password) {
        boolean status = false;
        try {
            DBConnection obj = new DBConnection();
            Connection conn = obj.connMethod();
            PreparedStatement ps = conn.prepareStatement("select * from ADUSER where USERNAME=? and PASSWORD=?");
            ps.setString(1, name);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            status = rs.next();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
         
        }
        return status;
    }
}
