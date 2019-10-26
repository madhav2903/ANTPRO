package com.nk2164.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nk2164.domain.Customer;
import com.nk2164.domain.Order;
import com.nk2164.services.AccountsService;
import com.nk2164.services.CustomerNotFoundException;

/**
 * This class is used by our Spring WebFlow XML.
 * @author Dick Chesterwood
 */
@Component
public class OrderFlowActions  
{
	@Autowired
	private AccountsService accounts;
	
	public Customer findCustomer(String id) throws CustomerNotFoundException
	{
			Customer requiredCustomer = accounts.findCustomer(id);
			return requiredCustomer;

	}
}
