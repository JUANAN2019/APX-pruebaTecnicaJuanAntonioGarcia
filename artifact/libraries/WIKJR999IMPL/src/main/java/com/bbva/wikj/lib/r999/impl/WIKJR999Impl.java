package com.bbva.wikj.lib.r999.impl;

import com.bbva.wikj.dto.ejemplo.DtoIn;
import com.bbva.wikj.dto.ejemplo.DtoOut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class WIKJR999Impl extends WIKJR999Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJR999Impl.class);

	@Override
	public DtoOut execute(DtoIn dtoIn) {
		DtoOut dtoOut = new DtoOut();
		Map<String, Object> args = new HashMap<>();
		args.put("name", dtoIn.getName());
		args.put("surname", dtoIn.getSurname());
		Map<String, Object> get = this.jdbcUtils.queryForMap("", args);
		dtoOut.setName((String) get.get("name"));
		dtoOut.setSurname(dtoIn.getSurname());
		return dtoOut;
	}
}
