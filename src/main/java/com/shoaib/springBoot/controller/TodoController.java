package com.shoaib.springBoot.controller;
import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.shoaib.springBoot.model.Currency;
import com.shoaib.springBoot.service.TodoService;


@RestController
public class TodoController {

	@Autowired
   TodoService todoService;

   @RequestMapping(value = {"/list-currencies"},method = {RequestMethod.GET})
   public List<Currency> showListTodos() {
      System.out.println(" in show list todos ");
      todoService.retrieveTodos();
      return todoService.retrieveTodos();
   }

     @RequestMapping(
      value = {"/get-USD/{SGDAmount}"},
      method = {RequestMethod.POST}
   )
     
 	@GetMapping("/currnecies/getUSDFromSGD/{sgdAmt}")
 	public ResponseEntity<Currency> getSGDFromUSD(
 			@PathVariable String sgdAmt) {
 		System.out.println("****  ");
 		Currency userReqCurrency = todoService.addQuestion(sgdAmt);

 		if (userReqCurrency == null)
 			return ResponseEntity.noContent().build();

 		// Success - URI of the new resource in Response Header
 		// Status - created
 		// question.getQuestionId()
 		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
 				"/{sgdAmt}").buildAndExpand(userReqCurrency.getExchangeAmount()).toUri();

 		// Status
 		return ResponseEntity.created(location).build();
 	}


}