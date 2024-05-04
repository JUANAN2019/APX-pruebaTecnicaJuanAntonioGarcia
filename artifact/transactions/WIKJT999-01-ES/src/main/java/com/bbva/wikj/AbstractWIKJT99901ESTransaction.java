package com.bbva.wikj;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.wikj.dto.ejemplo.DtoIn;
import com.bbva.wikj.dto.ejemplo.DtoOut;

/**
 * In this class, the input and output data is defined automatically through the setters and getters.
 */
public abstract class AbstractWIKJT99901ESTransaction extends AbstractTransaction {

	public AbstractWIKJT99901ESTransaction(){
	}


	/**
	 * Return value for input parameter dtoIn
	 */
	protected DtoIn getDtoin(){
		return (DtoIn)this.getParameter("dtoIn");
	}

	/**
	 * Set value for DtoOut output parameter dtoOut
	 */
	protected void setDtoout(final DtoOut field){
		this.addParameter("dtoOut", field);
	}
}
