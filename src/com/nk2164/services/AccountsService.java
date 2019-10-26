package com.nk2164.services;

import java.util.List;

import com.nk2164.domain.Book;
import com.nk2164.domain.Customer;
import com.nk2164.domain.Order;

public interface AccountsService 
{
	public void raiseInvoice(Book requiredBook);
	
	public Customer findCustomer(String id) throws CustomerNotFoundException;
}
