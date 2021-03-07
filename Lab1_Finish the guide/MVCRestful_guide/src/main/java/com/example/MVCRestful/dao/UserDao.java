package com.example.MVCRestful.dao;

import java.util.List;

import com.example.MVCRestful.model.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Integer> {
	// by default, CrudeRepository already supports basic query such as save or
	// findbyId

	// also supports many auto query by fields
	List<User> findByNationlity(String nationlity); // by default, Spring will support findBy<Attribute>

	List<User> findByEidGreaterThan(int eid);

	// also supports writing your own query
	@Query("from User where nationality = ?1 order by name ")
	List<User> findByNationlitySorted(String nationlity);

}