/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AddStd implements Serializable {
    String name;
    String dep;
    String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id;
    }
  String pass;
  String uname;

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
    public AddStd() {
    }
    
    
    
    public void toInsert(){
        try{
        
            DBConnection db = new DBConnection();
              Connection con = db.connMethod();
              String sql1 = "Insert into DATA1(STUDENT_ID,NAME,DEPARTMENT) values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql1);
            ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, dep);
            ps.executeUpdate();
            String sql2 = "Insert into ADUSER(USERNAME,PASSWORD,TYPE) values(?,?,?)";
            PreparedStatement ps1 = con.prepareStatement(sql2);
            ps1.setString(1,uname);
            ps1.setString(2, pass);
            ps1.setString(3, "student");
            ps1.executeUpdate();
            System.err.println("success");
        } catch (Exception e) {
        }
    }
    
}
