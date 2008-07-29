package mypkg;



import java.awt.Toolkit;



import ymsg.network.event.SessionChatEvent;
import ymsg.network.event.SessionConferenceEvent;
import ymsg.network.event.SessionErrorEvent;
import ymsg.network.event.SessionEvent;
import ymsg.network.event.SessionExceptionEvent;
import ymsg.network.event.SessionFileTransferEvent;
import ymsg.network.event.SessionFriendEvent;
import ymsg.network.event.SessionListener;
import ymsg.network.event.SessionNewMailEvent;
import ymsg.network.event.SessionNotifyEvent;

public class MySessionListener implements SessionListener 
{
	private YahooClient yahooClient;
	public MySessionListener(YahooClient yahooClientIncoming)
	{
		this.yahooClient = yahooClientIncoming;
	}
	
	public void buzzReceived(SessionEvent ev)
	{		 
		Toolkit.getDefaultToolkit().beep();
	}
        
        public void chatCaptchaReceived(SessionChatEvent ev)
	{
	}
        
        

	public void chatConnectionClosed(SessionEvent ev)
	{
	}
	public void conferenceInviteReceived(SessionConferenceEvent ev) 
	{
		
	}
	public void conferenceLogoffReceived(SessionConferenceEvent ev) 
	{
	}
	public void conferenceLogonReceived(SessionConferenceEvent ev)
	{
		 
	}
	public void conferenceMessageReceived(SessionConferenceEvent ev) 
	{
	}
	public void connectionClosed(SessionEvent ev) 
	{
	    System.out.println("Connection Closed");
	    yahooClient.handleConnectionClosed();
	}
	public void contactRejectionReceived(SessionEvent ev) 
	{
	}
	public void contactRequestReceived(SessionEvent ev)
	{
	}
	public void errorMessageReceived(SessionErrorEvent ev) 
	{
		System.out.println("Error Message Received");
	}
	public void fileTransferReceived(SessionFileTransferEvent ev) 
	{
	}
	public void friendAddedReceived(SessionFriendEvent ev) 
	{
	}
	public void friendRemovedReceived(SessionFriendEvent ev) 
	{
	}
	public void friendsUpdateReceived(SessionFriendEvent ev)
	{
	}
	public void inputExceptionThrown(SessionExceptionEvent ev)
	{
		System.out.println("Input Exception Thrown");
	} 
	public void listReceived(SessionEvent ev) 
	{
	}
	public void messageReceived(SessionEvent ev)
	{
		Toolkit.getDefaultToolkit().beep();		
	}
	public void newMailReceived(SessionNewMailEvent ev) 
	{
	}
	public void notifyReceived(SessionNotifyEvent ev)
	{
	}
	public void offlineMessageReceived(SessionEvent ev)
	{
		 
	}
	public void errorPacketReceived(SessionErrorEvent sev)
	{
		System.out.println("Error Packet Received");
	}

    public void conferenceInviteDeclinedReceived(SessionConferenceEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void chatLogonReceived(SessionChatEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void chatLogoffReceived(SessionChatEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void chatMessageReceived(SessionChatEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void chatUserUpdateReceived(SessionChatEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
	
	

}
