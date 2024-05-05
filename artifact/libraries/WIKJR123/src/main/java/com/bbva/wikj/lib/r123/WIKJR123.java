package com.bbva.wikj.lib.r123;

import com.bbva.wikj.dto.ejemploselect.CustomerIn;
import com.bbva.wikj.dto.ejemploselect.CustomerOut;


public interface WIKJR123 {
	int  executeInsert(CustomerIn customerIn);
	CustomerOut executeSelect(String id);
}
