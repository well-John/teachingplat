package com.dgut.utils;

import java.util.Date;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 */
public class SendMailUtil {

	public static final String HOST = "smtp.163.com";
	public static final String PROTOCOL = "smtp";
	public static final int PORT = 25;
	public static final String SENDER = "18676042181@163.com";
	public static final String SENDERPWD = "zhouxin36";

	public static Session getSession() {
		Properties props = new Properties();
		props.put("mail.smtp.host", HOST);
		props.put("mail.store.protocol", PROTOCOL);
		props.put("mail.smtp.port", PORT);
		props.put("mail.smtp.auth", true);

		Authenticator authenticator = new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(SENDER, SENDERPWD);
			}
		};
		Session session = Session.getDefaultInstance(props, authenticator);
		return session;
	}

	public static void send(String receiver, String content) {
		Session session = getSession();
		try {
			System.out.println("-------发送中-------");
			Message msg = new MimeMessage(session);
			Address address =new InternetAddress(SENDER);
			msg.setFrom(address);
			InternetAddress[] addrs = { new InternetAddress(receiver) };
			msg.addRecipients(Message.RecipientType.CC, InternetAddress.parse(SENDER));
			msg.addRecipients(Message.RecipientType.TO, addrs);
			msg.setSubject("zhouxin");
			msg.setSentDate(new Date());
			msg.setText("Hello");
			msg.setContent(content, "text/html;charset=utf-8");
			msg.saveChanges();
			Transport.send(msg);
			System.out.println("-------发送完成-------");
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
}
