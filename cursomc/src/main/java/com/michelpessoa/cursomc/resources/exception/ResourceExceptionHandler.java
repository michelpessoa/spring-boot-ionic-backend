package com.michelpessoa.cursomc.resources.exception;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.michelpessoa.cursomc.services.exceptions.DataIntegrityException;
import com.michelpessoa.cursomc.services.exceptions.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
			
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardErro> objectNotFound(ObjectNotFoundException e, HttpServletRequest request){
		
		StandardErro err = new StandardErro(HttpStatus.NOT_FOUND.value(), e.getMessage(), new Date());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
	
	@ExceptionHandler(DataIntegrityException.class)
	public ResponseEntity<StandardErro> dataIntegrity(DataIntegrityException e, HttpServletRequest request){
		
		StandardErro err = new StandardErro(HttpStatus.BAD_REQUEST.value(), e.getMessage(), new Date());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
	}
	 
}
