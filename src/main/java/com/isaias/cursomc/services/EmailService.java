package com.isaias.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.isaias.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
