/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class NewJSFManagedBean {

    String iname;
    String idep;
    String email;
    String sub;

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    public String getIdep() {
        return idep;
    }

    public void setIdep(String idep) {
        this.idep = idep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }
     private String instractor;
    List<String> instractorList;

    public String getInstractor() {
        return instractor;
    }

    public void setInstractor(String instractor) {
        this.instractor = instractor;
    }

    public List<String> getInstractorList() {
        return instractorList;
    }

    public void setInstractorList(List<String> instractorList) {
        this.instractorList = instractorList;
    }
    
    
    private String evaluate1;
    List<String> evaluate1list;
      private String evaluate2;
    List<String> evaluate2list;
      private String evaluate3;
    List<String> evaluate3list;
 private String evaluate4;
    List<String> evaluate4list;
     private String evaluate5;
    List<String> evaluate5list;

    public String getEvaluate5() {
        return evaluate5;
    }

    public void setEvaluate5(String evaluate5) {
        this.evaluate5 = evaluate5;
    }

    public List<String> getEvaluate5list() {
        return evaluate5list;
    }

    public void setEvaluate5list(List<String> evaluate5list) {
        this.evaluate5list = evaluate5list;
    }

    public String getEvaluate4() {
        return evaluate4;
    }

    public void setEvaluate4(String evaluate4) {
        this.evaluate4 = evaluate4;
    }

    public List<String> getEvaluate4list() {
        return evaluate4list;
    }

    public void setEvaluate4list(List<String> evaluate4list) {
        this.evaluate4list = evaluate4list;
    }
    public String getEvaluate3() {
        return evaluate3;
    }

    public void setEvaluate3(String evaluate3) {
        this.evaluate3 = evaluate3;
    }

    public List<String> getEvaluate3list() {
        return evaluate3list;
    }

    public void setEvaluate3list(List<String> evaluate3list) {
        this.evaluate3list = evaluate3list;
    }

    public String getEvaluate2() {
        return evaluate2;
    }

    public void setEvaluate2(String evaluate2) {
        this.evaluate2 = evaluate2;
    }

    public List<String> getEvaluate2list() {
        return evaluate2list;
    }

    public void setEvaluate2list(List<String> evaluate2list) {
        this.evaluate2list = evaluate2list;
    }

    public String getEvaluate1() {
        return evaluate1;
    }

    public void setEvaluate1(String evaluate1) {
        this.evaluate1 = evaluate1;
    }

    public List<String> getEvaluate1list() {
        return evaluate1list;
    }

    public void setEvaluate1list(List<String> evaluate1list) {
        this.evaluate1list = evaluate1list;
    }
 
    
    
    public NewJSFManagedBean() {
        
        
       instractorList = new ArrayList<>();
       evaluate1list = new  ArrayList<>();
       evaluate1list.add("5");
       evaluate1list.add("4");
       evaluate1list.add("3");
       evaluate1list.add("2");
       evaluate1list.add("1");
       
       evaluate2list = new ArrayList<>();
       evaluate2list.add("5");
       evaluate2list.add("4");
       evaluate2list.add("3");
       evaluate2list.add("2");
       evaluate2list.add("1");
       
      evaluate3list = new ArrayList<>();
       evaluate3list.add("5");
       evaluate3list.add("4");
       evaluate3list.add("3");
       evaluate3list.add("2");
       evaluate3list.add("1");
       
       evaluate4list = new ArrayList<>();
       evaluate4list.add("5");
       evaluate4list.add("4");
       evaluate4list.add("3");
       evaluate4list.add("2");
       evaluate4list.add("1");
       
       evaluate5list = new ArrayList<>();
       evaluate5list.add("5");
       evaluate5list.add("4");
       evaluate5list.add("3");
       evaluate5list.add("2");
       evaluate5list.add("1");
       
       
       
       
       instractorList.add("mr habtamu");
       instractorList.add("mr adugna");
       instractorList.add("mr kolona");
       instractorList.add("mr assembly");
       
       
    }
    
    public void rtInsert() {
        
        try {
            
             DBConnection db = new DBConnection();
              Connection con = db.connMethod();
     String sql = "Insert into RATING(INSTRACTOR,STATEMENT_1,STATEMENT_2,STATEMENT_3,STATEMENT_4,STATEMENT_5) values(?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, instractor);
            ps.setString(2, evaluate1);
            ps.setString(3, evaluate2);
            ps.setString(4, evaluate3);
            ps.setString(5, evaluate4);
            ps.setString(6, evaluate5);
            ps.executeUpdate();
         
        } catch (ClassNotFoundException | SQLException e) {
        }
    }
    
    public void toInsert(){
        try{
        
            DBConnection db = new DBConnection();
              Connection con = db.connMethod();
              String sql = "Insert into INSTRACTOR(E_MAIL,NAME,DEPARTMENT,SUBJECT) values(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, iname);
            ps.setString(3, idep);
             ps.setString(4, sub);
            ps.executeUpdate();
           
        } catch (ClassNotFoundException | SQLException e) {
        }
    }
}
