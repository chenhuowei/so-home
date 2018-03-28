package com.socode.service.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.socode.dao.UserDao;
import com.socode.entity.UserEntity;
import com.socode.service.UserService;



@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public Page<UserEntity> listByPage(int page, int size) {

		Pageable pageable = PageRequest.of(page-1, size);
		return userDao.findAll(new Specification<UserEntity>() {
			
			public Predicate toPredicate(Root<UserEntity> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				return null;
			}
		}, pageable);
		
	}
	
	
	
}
