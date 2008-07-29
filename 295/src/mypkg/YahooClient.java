package mypkg;

import java.io.IOException;
import ymsg.network.AccountLockedException;
import ymsg.network.LoginRefusedException;
import ymsg.network.Session;

public class YahooClient {
	MySessionListener mySessionListener;
	Session yahooMessengerSession = null;
	
	boolean loggedIn = false;
	boolean connectionClosed = false;
        
            
        YahooClient(){
            //String userName = "demo_rtsp";
            //String password = "cmpe295";
            //login(userName,password);
        }
        
        
	public void logout() {
		try {
			yahooMessengerSession.logout();
		} catch (IllegalStateException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		loggedIn = false;
	}

	public boolean login(String userName, String password) {
		connectionClosed = false;
		if (loggedIn == false) {
			yahooMessengerSession = new Session();
			mySessionListener = new MySessionListener(this);
			yahooMessengerSession.addSessionListener(mySessionListener);
			try 
			{
				System.out.println("Attempting login");
				yahooMessengerSession.login(userName, password);
				System.out.println("Username: " + userName);
				System.out.println("Password: " + password);
				System.out.println("ConnectionClosed" + connectionClosed);
				if (connectionClosed==false) 
				{
				//setViewable();
                                    return true;
                                    //sendMessage();
				}
				else 
				{
                                    return false;
                                  //System.out.println("login failed");
                                  //YahooClient yahooClient = new YahooClient();
				}
			} catch (IllegalStateException e1) {
				System.out.println("I am here!!! and Login Failed");
				e1.printStackTrace();
				loggedIn = false;
				connectionClosed = false;
                                return false;
			} catch (AccountLockedException e1) {
				e1.printStackTrace();
                                return false;
			} catch (LoginRefusedException e1) {
				loggedIn = false;
				e1.printStackTrace();
                                return false;
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
                                return false;
			}

		} else {
			System.out.println("Attempting logout");
			logout();
                        return false;
		}

	}

	public void sendMessage(String messageTo, String keywords) {

		System.out.println("Attempting to send message");
                String messageText = "";
		//String messageTo = "priyankgandhi"; //getMessageToField().getText(); //this value will come from database
		//String messageText = "Hi, you have received new links for <b>Cricket, Olympic</b>. Please Log in to http://app.sliderocket.com/app/sliderocket.aspx#"; //getMessageTextArea().getText(); //this value will come from database
                messageText = "Hi, you have received new links for your subscribed keywords <b>" + keywords + "</b>. Please Log in to http://twitter.com";
		try {
			yahooMessengerSession.sendMessage(messageTo, messageText);
                        logout();
		} catch (IllegalStateException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public void handleConnectionClosed() {
		System.out.println("I am in handleConnectionClosed");
		connectionClosed = true;
		loggedIn = false;
	}
}
