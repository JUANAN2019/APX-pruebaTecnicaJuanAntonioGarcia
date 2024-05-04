package com.bbva.wikj;

import com.bbva.wikj.dto.ejemplo.DtoIn;
import com.bbva.wikj.dto.ejemplo.DtoOut;
import com.bbva.wikj.lib.r999.WIKJR999;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class WIKJT99901ESTransaction extends AbstractWIKJT99901ESTransaction {
	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJT99901ESTransaction.class);
	@Override
	public void execute() {
		WIKJR999 wikjr999 = this.getServiceLibrary(WIKJR999.class);
		DtoIn dto = this.getDtoin();
		DtoOut dtoOut = wikjr999.execute(dto);
		this.setDtoout(dtoOut);
	}
}
