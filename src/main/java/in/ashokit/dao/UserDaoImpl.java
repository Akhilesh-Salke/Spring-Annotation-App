package in.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao{
	
	public UserDaoImpl() {
		System.out.println("UserDaoImpl :: Constructor");
	} 

	public String getNameById(int id) {
		if(id==100) {
			return "John";
		}else {
			return "Karan";
		}
	}

	
}
