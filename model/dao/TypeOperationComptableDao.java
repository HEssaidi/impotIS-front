package com.example.ImpotIS.model.dao;

import org.springframework.stereotype.Repository;

import com.example.ImpotIS.bean.TypeOperationComptable;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TypeOperationComptableDao extends JpaRepository <TypeOperationComptable,Long> {
	public TypeOperationComptable findByCode(Long code);

}
