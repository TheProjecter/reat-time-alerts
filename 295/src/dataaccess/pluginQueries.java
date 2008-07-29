/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pojo.User;
import rtnsutil.*;

/**
 *
 * @author priyankgandhi
 */
public class pluginQueries {
    
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement stmt = null;
    
    public pluginQueries()
    {
        con = Util.getConnection();
//        System.out.println("Hello" + con);
    }
    
    public int[] checkTimeStamp()
    {
        int index = 0;
        int count = 0;
        int[] id = null;
        try
        {
            stmt = con.prepareStatement("SELECT keyword_id FROM keyword_timestamp WHERE search_time > publish_time;");
            stmt.executeQuery();
            rs = stmt.getResultSet();
            rs.last();
            id =new int[rs.getRow()];
            rs.beforeFirst();
            while (rs.next())
            {
                id[index] = rs.getInt("keyword_id");
//                System.out.println("Record found...." + id[index]);
                index++;
            }
            rs.close();
            stmt.close();
        }
        catch (SQLException ex)
        {
        }
        return id;
    }
    
    public User getUserInfo(int kid)
    {
       int index = 0;
       int i = 0;
       int[] user_id = null;
       String[] messenger_id = null;
       User user = new User();
       
       //System.out.println("keyword: "+kid);
       try
        {
            stmt = con.prepareStatement("SELECT u.messenger_id, uk.user_id, uk.keyword_id FROM user_keyword as uk JOIN users as u on u.user_id = uk.user_id WHERE keyword_id = ? GROUP BY user_id;");
            stmt.setInt(1, kid);
            stmt.executeQuery();
            rs = stmt.getResultSet();
            rs.last();
            user_id =new int[rs.getRow()];
            messenger_id = new String[rs.getRow()];
            rs.beforeFirst();
            //System.out.println("keyword id: "+kid);
            //System.out.println("total users "+user_id.length);
            
            while (rs.next())
            {
                user_id[index] = rs.getInt("user_id");
                messenger_id[index] = rs.getString("messenger_id");
//                System.out.println("User found...." + user_id[index]+" and " + messenger_id[index] + " for kid " + kid);
                index++;
            }
            user.setUser_id(user_id);
            user.setMessenger_id(messenger_id);
            user.setKid(kid);
            
            rs.close();
            stmt.close();
            return user;
            }
        catch (SQLException ex)
        {
            return null;
        }
        
        }
    
    public String getKeywordFromKid(int kid)
    {
        try
        {

            stmt = con.prepareStatement("SELECT keyword_name FROM keywords WHERE keyword_id = ?");
            stmt.setInt(1,kid);
            stmt.executeQuery();
            rs = stmt.getResultSet();
            String key = "";
            if (rs.next())
            {
            key = rs.getString("keyword_name");
            }
            return key;
        }
        catch (SQLException ex) {
            return null;
        }
    }
  }


