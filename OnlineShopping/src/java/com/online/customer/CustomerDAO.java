
package com.online.customer;

import com.online.utility.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CustomerDAO {

    private Connection conn = null;
    private PreparedStatement ps = null ;
    private ResultSet rs = null;
    private String query = "";
    private CustomerBean bean;
    public CustomerDAO() {
    }
public boolean registration(CustomerBean bean)
{
    boolean flag=false;
    if(conn == null)
    {
        conn= MyConnection.getMyConnection();
    }
    try {
        query="insert into customer (uname, pswd, emailid, name, mobile, city, state, country, idtype, idno) values(?,?,?,?,?,?,?,?,?,?)";
        ps=conn.prepareStatement(query);
         ps.setString(1, bean.getUname());
            ps.setString(2, bean.getPswd());
            ps.setString(3, bean.getName());
            ps.setString(4, bean.getEmailid());
            ps.setString(5, bean.getMno());
            ps.setString(6, bean.getCity());
            ps.setString(7, bean.getState());
            ps.setString(8, bean.getCountry());
            ps.setString(9, bean.getIdtype());
            ps.setString(10, bean.getIdno());
        if(ps.executeUpdate()>0)
        {
            flag=true;
        }
    } catch (Exception e) {
    
        System.out.println("Customer registation failed" + e);
    }

    finally{
        query="";//order SHOULD BE SAME
        ps=null;
        conn=null;
        
    }
    
    return flag;
}
 
public ArrayList<CustomerBean> getAllCustomers(){
    
    ArrayList<CustomerBean> al = new ArrayList<CustomerBean>();
    if(conn==null)
    {
        conn=MyConnection.getMyConnection();
        
    }
    try {
        query="select * from customer";
        ps=conn.prepareStatement(query);
        rs=ps.executeQuery();
        while(rs.next())
        {
         bean = new CustomerBean();
                bean.setCid(rs.getInt("cid"));
                bean.setUname(rs.getString("uname"));
                bean.setName(rs.getString("name"));
                bean.setMno(rs.getString("mno"));
                bean.setEmailid(rs.getString("emailid"));
                bean.setCity(rs.getString("city"));
                bean.setState(rs.getString("state"));
                bean.setCountry(rs.getString("country"));
                bean.setIdtype(rs.getString("idtype"));
                bean.setIdno(rs.getString("idno"));
                al.add(bean);    
            
        }
        if(bean==null)
        {
            al=null;  //Doubt***
        }
        
    } catch (Exception e) {
        System.out.println("get all customers failed");
    }
     finally{
        query="";//order SHOULD BE SAME
        ps=null;
        conn=null;
        
    }
 return al;
}
    
}
