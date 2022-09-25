package com.dev.thossen.service;

import com.dev.thossen.model.UserDtls;

public interface UserService {

	public UserDtls createUser(UserDtls user);

	public boolean checkEmail(String email);

}