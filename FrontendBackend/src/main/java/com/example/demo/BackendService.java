package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class BackendService {
@Autowired
JdbcTemplate jt;
public int insertdata(FormData ob) {
	return jt.update("insert into login values("+ob.getName()+","+ob.getEmail()+")");
}



}
