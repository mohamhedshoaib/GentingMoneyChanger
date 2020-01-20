package com.shoaib.springBoot.service;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.stereotype.Service;

import com.shoaib.springBoot.model.Currency;

@Service
public class TodoService {
   private static  List<Currency> todos = new ArrayList();
   private static int todoCount = 3;

   public List<Currency> retrieveTodos() {
      List<Currency> filteredTodos = new ArrayList();
      Iterator var3 = todos.iterator();

      while(var3.hasNext()) {
         Currency todo = (Currency)var3.next();
            filteredTodos.add(todo);
             }

      return filteredTodos;
   }
   
   public Currency addQuestion(String sgdAmt) {
		
	   BigDecimal userVal = new BigDecimal(sgdAmt);
	   BigDecimal retVal = null;
	   retVal = userVal.multiply(new BigDecimal(0.742164));
	   System.out.println("return val is " + retVal);

	   Currency currency = new Currency();
	   currency.setId(1);
	   currency.setName("SGD TO USD");
	   currency.setExchnageRate(new BigDecimal(0.742164));
	   currency.setExchangeAmount(retVal);
		
		return currency;
	}
   
   static {
      todos.add(new Currency(1, "SGD", new BigDecimal(0.742164),new BigDecimal(19000.00)));
      todos.add(new Currency(2, "USD", new BigDecimal(1.34782),new BigDecimal(1000)));
      
   }
}