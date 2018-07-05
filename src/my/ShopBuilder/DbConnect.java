/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.ShopBuilder;

import com.mysql.jdbc.*;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Prashant
 */
public class DbConnect {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public DbConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/retailshop", "root", "");
            st = (Statement) con.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void addCustomer(String name,String address,int age,float salary){
        try{
        System.out.println("Inserting new Data...");
        String query = "insert into customers (NAME,ADDRESS,AGE,SALARY) VALUES ('"+name+"','"+address+"',"+age+","+salary+")";
        st.executeUpdate(query);
        System.out.println("Updated Successfully!!");
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println(name+"\t"+address);
    }
    
    public ResultSet searchById(int id){
        try{
        String query = "Select name,address,age from customers where id="+id;
        rs = st.executeQuery(query);
        }catch(Exception e){
            System.out.println(e);
        }
        return rs;
    }
    
    public void addItemsInPurchase(int c_id,String item,float price,int quant,float tot,String cust_name){
        java.util.Date date=new java.util.Date();
        java.sql.Date sqldate=new java.sql.Date(date.getTime());
        try{
            System.out.println("Inserting new Values..");
            String query = "INSERT INTO cust_items (`cust_id`, `Date`, `itemName`, `price`, `quant`,`tot`,`cust_name`) VALUES ("+c_id+",'"+sqldate+"','"+item+"',"+price+","+quant+","+tot+",'"+cust_name+"')";
            st.executeUpdate(query);
            System.out.println("Updated Successfully!!");
            
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public ResultSet getTableData(int uid){
        ResultSet rs2 = null;
        System.out.println("data search started");
        java.util.Date date = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        try{
            String query = "Select cust_name,itemName,price,quant,tot from cust_items where Date='"+sqlDate+"' and cust_id="+uid;
            rs2 = st.executeQuery(query);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("data search completed");
        return rs2;
        
    }

    public ResultSet searchItemByDate(String date) {
        ResultSet rs = null;
        try{
            String query = "Select cust_name,itemName,price,quant,tot from cust_items where Date='"+date+"'";
            rs = st.executeQuery(query);
        }catch(Exception e){
            System.out.println(e);
        }
        return rs;
    }

    public void InsertNewItem(String text, String text0) {
        try{
            String query = "Insert into itemlist (itemName,itemPrice) values ('"+text+"',"+text0+")";
            st.executeUpdate(query);
        }catch(Exception e){
            System.out.println(e);
        }
           
    }

    public ResultSet fetchItems() {
        ResultSet rs = null;
        try{
            String query = "Select * from itemlist";
            rs = st.executeQuery(query);
        }catch(Exception e){
            System.out.println(e);
        }
        return rs;
    }

    float getItemPrice(String item) {
        ResultSet rs;
        float price = 0;
        try{
            String query = "Select distinct itemPrice from itemlist where itemName='"+item+"'";
            rs=st.executeQuery(query);
            if(rs.next()==false){
                return 0;
            }else{
                price = rs.getFloat("itemPrice");
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return price;
    }

    public void setItemPrice(String item,float price) {
        try{
            String query = "update itemlist set itemPrice="+price+" where itemName='"+item+"'";
            st.executeUpdate(query);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public ResultSet fetchDetails(String item) {
        ResultSet rs = null;
        try{
            String query = "Select itemName,cust_name,price,quant,Date from cust_items where itemName='"+item+"'";
            rs = st.executeQuery(query);
        }catch(Exception e){
            System.out.println(e);
        }
        return rs;
    }

    ResultSet fetchDetailsbyID(int id) {
        ResultSet rs = null;
        try{
            String query = "Select itemName,cust_name,price,quant,Date from cust_items where cust_id="+id+"";
            rs = st.executeQuery(query);
        }catch(Exception e){
            System.out.println(e);
        }
        return rs;
    }
    
    
}
