package com.bbva.wikj.lib.r123.impl;

import com.bbva.wikj.dto.ejemploselect.CustomerIn;
import com.bbva.wikj.dto.ejemploselect.CustomerOut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * The WIKJR123Impl class...
 */
public class WIKJR123Impl extends WIKJR123Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJR123Impl.class);



	@Override
	public int executeInsert(CustomerIn customerIn) {
		Map<String, Object> args = new HashMap<>();
		args.put("id", customerIn.getId());
		args.put("nuip", customerIn.getNuip());
		args.put("phone", customerIn.getPhone());
		args.put("address", customerIn.getAddress());
		args.put("full_name", customerIn.getFullName());

		return this.jdbcUtils.update("query.insert",args);

	}

	@Override
	public CustomerOut executeSelect(String id) {
		Map<String,Object> result = new HashMap<>();
		result = this.jdbcUtils.queryForMap("query.select",id);
		CustomerOut customerOut = new CustomerOut();
		customerOut.setId(String.valueOf(result.get("id")));
		customerOut.setNuip(String.valueOf(result.get("nuip")));
		customerOut.setPhone(String.valueOf(result.get("phone")));
		customerOut.setAddress(String.valueOf(result.get("address")));
		customerOut.setFullName(String.valueOf(result.get("full_name")));

		return customerOut;
	}



}
