package com.irctc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.irctc.entity.IrctcEntity;

public interface IrctcRepository extends JpaRepository<IrctcEntity, Long> {

	@Query("SELECT i.username FROM IrctcEntity i")
	List<String> findAllUsername();
}
