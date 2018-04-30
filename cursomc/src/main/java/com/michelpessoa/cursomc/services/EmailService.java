package com.michelpessoa.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.michelpessoa.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
