package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.DeptDAO;
import com.dto.Dept;

//@Component("xxx")
@Service("xxx")
public class DeptService {

	@Autowired
	DeptDAO dao;

	// 로직처리
	public List<Dept> list() {
		return dao.list();
	}

	public void insert(Dept dto) {
		dao.insert(dto);
	}

	public void update(Dept dto) {
		dao.update(dto);
	}

	public void delete(int deptno) {
		dao.delete(deptno);
	}
	public Dept select(int deptno){
		return dao.select(deptno);
	}
}


