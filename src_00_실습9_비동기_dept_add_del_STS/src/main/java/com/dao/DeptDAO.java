package com.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.dto.Dept;

//@Component("yyy")
@Repository("yyy")
public class DeptDAO {

	@Autowired
	SqlSessionTemplate template;
	
	//로직처리
	public List<Dept> list(){
		return template.selectList("DeptMapper.selectAll");
	}
	public void insert(Dept dto) {
		template.insert("DeptMapper.insert",dto);
	}
	public void update(Dept dto) {
		template.update("DeptMapper.update", dto);
	}
	public void delete(int deptno) {
		template.delete("DeptMapper.delete",deptno);
	}
	
	public Dept select(int deptno){
		return template.selectOne("DeptMapper.selectByDeptno" , deptno);
	}
	
}





