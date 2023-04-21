package com.icicilombard.jwtauth.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icicilombard.jwtauth.iservice.IuserService;
import com.icicilombard.jwtauth.model.User;
import com.icicilombard.jwtauth.repo.UseraaRepository;

@Service
public class UserServiceImpl implements IuserService {

	@Autowired
	private UseraaRepository useraaRepository;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return useraaRepository.save(user);
	}

}
