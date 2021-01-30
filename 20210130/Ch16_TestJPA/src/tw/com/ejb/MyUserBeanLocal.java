package tw.com.ejb;

import javax.ejb.Local;

import tw.com.entity.MyUser;

@Local
public interface MyUserBeanLocal {
		boolean createUser(MyUser myuser);
		MyUser findMyUser(String account,String password);
}
