package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.*;

@Service
public class UserService {

	private IUserDao userDao;
	
//	public UserService() {
//		System.out.println("UserService :: 0-Param Constructor");
//	}
//	@Autowired	
	public UserService(IUserDao userDao) {
		System.out.println("UserService :: Param Constructor");
		this.userDao = userDao;
	}
	
	public void getName() {
		String name = userDao.getNameById(100);
		
//		System.out.println(userDao);
		
		System.out.println("Name : " + name);
	}

}
