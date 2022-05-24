package com.emailjavaapi;

import java.io.File;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "preparing to send the message" );
        String  message="Heloo Dear, this is a message for security check";
        String subject = "CodesArea: confirmation";
        String to = "tusharsyadavs@gmail.com";
        String from ="createEmailTestToTry@gmail.com";
        // only for use simple message sendEmail(message,subject,to,from);
        
        sendAttach(message,subject,to,from);
    }
    // this is responsible send the message with attachment
         private static void sendAttach(String message, String subject, String to, String from) {
		// TODO Auto-generated method stub
        	// variable  for gmail host
     		String host = "smtp.gmail.com";
     		// get the system properties
     		Properties properties = System.getProperties();
     		System.out.println(properties);
     		// setting important information to properties object
     		
     		// host set
     		properties.put("mail.smtp.host",host);		
     		properties.put("mail.smtp.port","465");
     		properties.put("mail.smtp.ssl.enable","true");// ssl=secure socket layer
     		properties.put("mail.smtp.auth","true");// authentication enable
     		
     		
     		//step 1.get the session object
     		
     		Session session = Session.getInstance(properties, new Authenticator() {

     			@Override
     			protected PasswordAuthentication getPasswordAuthentication() {
     				// TODO Auto-generated method stub
     				return new PasswordAuthentication("createEmailTestToTry@gmail.com", "Rajeev@#12");
     			}
     			
     			
     		});
     	session.setDebug(true);
     		// step2: compose the message[text,multimedia]
     	
     		    MimeMessage mm = new MimeMessage(session);
     		    
     		    // from email
     		   try {
     			mm.setFrom(from);
     			//adding receipent  to message
     			mm.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
     			
     			// adding subject to message
     			mm.setSubject(subject);
     			
     			// adding aatachment ...
     			// file path
     			String path = "C:\\Users\\tushary\\Downloads\\pic1.jpg";
     			MimeMultipart mimeMultipart = new MimeMultipart();
     			//text
     			//file
     			 MimeBodyPart textMime = new MimeBodyPart();
     			 MimeBodyPart fileMime = new MimeBodyPart();
     			 try {
     				 textMime.setText(message);
     				File file= new File(path);
     				fileMime.attachFile(file);
     				mimeMultipart.addBodyPart(textMime);
     				mimeMultipart.addBodyPart(fileMime);
     				 
     			 }catch(Exception e)
     			 {
     				 e.printStackTrace();
     			 }
     			 
     			 mm.setContent(mimeMultipart);
     			
     			// step 3 send the message using transport class
     			Transport.send(mm);
     			System.out.println("send success...");
     		} catch (MessagingException e) {
     			
     			e.printStackTrace();
     		}
     		
		
	}
		private static MimeBodyPart setText(String message) {
		// TODO Auto-generated method stub
		return null;
	}
		// this is responsible to send email...
	private static void sendEmail(String message, String subject, String to, String from) {
		// variable  for gmail host
		String host = "smtp.gmail.com";
		// get the system properties
		Properties properties = System.getProperties();
		System.out.println(properties);
		// setting important information to properties object
		
		// host set
		properties.put("mail.smtp.host",host);		
		properties.put("mail.smtp.port","465");
		properties.put("mail.smtp.ssl.enable","true");// ssl=secure socket layer
		properties.put("mail.smtp.auth","true");// authentication enable
		
		
		//step 1.get the session object
		
		Session session = Session.getInstance(properties, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// TODO Auto-generated method stub
				return new PasswordAuthentication("createEmailTestToTry@gmail.com", "Rajeev@#12");
			}
			
			
		});
	session.setDebug(true);
		// step2: compose the message[text,multimedia]
	
		    MimeMessage mm = new MimeMessage(session);
		    
		    // from email
		   try {
			mm.setFrom(from);
			//adding receipent  to message
			mm.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			
			// adding subject to message
			mm.setSubject(subject);
			// adding text to message
			mm.setText(message);
			
			// step 3 send the message using transport class
			Transport.send(mm);
			System.out.println("send success...");
		} catch (MessagingException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
