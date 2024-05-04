package com.bbva.wikj;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.wikj.dto.ejemploselect.CustomerIn;
import com.bbva.wikj.dto.ejemploselect.CustomerOut;

/**
 * In this class, the input and output data is defined automatically through the setters and getters.
 */
public abstract class AbstractWIKJT12301ESTransaction extends AbstractTransaction {

	public AbstractWIKJT12301ESTransaction(){
	}


	/**
	 * Return value for input parameter customerIn
	 */
	protected CustomerIn getCustomerin(){
		return (CustomerIn)this.getParameter("customerIn");
	}

	/**
	 * Set value for CustomerOut output parameter customerOut
	 */
	protected void setCustomerout(final CustomerOut field){
		this.addParameter("customerOut", field);
	}
}
