/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mypkg;

import dataaccess.pluginQueries;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import pojo.User;

/**
 *
 * @author priyankgandhi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static User user = new User();
    static int kid;
    static String key;
    static String[] messenger_id;
    static HashMap map = new HashMap();
    
    static String userName = "demo.alerts";
    static String password = "cmpe295";
    
    //static String userName = "";
    //static String password = "";
    
    
    public static void main(String args[]) {
        // TODO code application logic here
        int delay = 1000;
        int period = 10000;
       
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask(){ 
        public void run()
        {
            int[] tid;
            int c;
            int i;
            
            pluginQueries query = new pluginQueries();
            tid = query.checkTimeStamp();
            if (tid.length > 0){
            for (c = 0; c < tid.length; c++)
            {
                user = query.getUserInfo(tid[c]);
                
                messenger_id = user.getMessenger_id();
                kid = user.getKid();
                
                key = query.getKeywordFromKid(kid);
                
                String val = "";
               
                for (i=0; i<messenger_id.length; i++)
                {
                    if (map.get(messenger_id[i]) != null)
                    {
                        val = map.get(messenger_id[i]).toString();
                        //System.out.println("val was"+ val + " and key is "+key);
                        val = key +", " + val;
                        map.put(messenger_id[i],val);
                        //System.out.println("new val is"+ val);
                        //System.out.println("messenger id is " + messenger_id[i] + ": " + val);
                    }
                    else
                    {
                        val = val + key;
                        map.put(messenger_id[i],val);
                        //System.out.println("messenger id is " + messenger_id[i] + ": " + val);
                    }
                }    
            }
            }
        
        //start sendding message now.    
        Iterator iterator = map.keySet().iterator();
        
        while( iterator. hasNext() ){            
            boolean flag;
            int mapLength;
            mapLength = map.size();
            System.out.println("total no users to send message = " + mapLength);
            YahooClient yahooClient = new YahooClient();
            flag = yahooClient.login(userName,password);
            String key;//id
            String value;//message
            if (flag == true)
            {
                    key =  iterator.next().toString();
                    value = map.get(key).toString();
                    System.out.println("Log in successful");
                    System.out.println(key + " : " + value);
                    yahooClient.sendMessage(key, value);
            }
            
            //yahooClient.logout();
        }
        map.clear();
        
        
        }
        }, delay, period);
      
        
    }
    
}