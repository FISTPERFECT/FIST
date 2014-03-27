package com.fist.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author fist
 *
 */
@Controller
@RequestMapping("/email.do")
public class EmailProcessingController {

	@Autowired
	private JavaMailSender mailSender;
	
	/**
	 * @param request
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String sendMail(HttpServletRequest request) {
		String sendEmailTo = request.getParameter("email");
		String subject = "Welcome";
		String message = "Thank you for registering with us. Dude you are busted! expect spams!!";
		
		SimpleMailMessage email = new SimpleMailMessage();
		email.setTo(sendEmailTo);
		email.setSubject(subject);
		email.setText(message);
		
		mailSender.send(email);
		
		return "done";
	}
}