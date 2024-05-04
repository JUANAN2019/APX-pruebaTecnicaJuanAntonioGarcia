package com.bbva.wikj;

import com.bbva.wikj.dto.ejemploselect.CustomerIn;
import com.bbva.wikj.dto.ejemploselect.CustomerOut;
import com.bbva.wikj.lib.r123.WIKJR123;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * ejemplo select
 *
 */
public class WIKJT12301ESTransaction extends AbstractWIKJT12301ESTransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJT12301ESTransaction.class);


	/**
	 * The execute method...
	 */
	@Override
	public void execute() {
		WIKJR123 wikjR123 = this.getServiceLibrary(WIKJR123.class);

		CustomerIn customer = this.getCustomerin();

		int result = wikjR123.executeInsert(customer);
		if(result == 0){
			setCustomerout(null);
		}else{

			CustomerOut customerOut = wikjR123.executeSelect(customer.getId());
			setCustomerout(customerOut);
		}
	}

}
