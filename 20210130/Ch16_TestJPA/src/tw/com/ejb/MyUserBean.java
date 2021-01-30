package tw.com.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import tw.com.entity.MyUser;

@Stateless
public class MyUserBean implements MyUserBeanLocal {
	@Inject
	private EntityManager em;
	@Override
	public boolean createUser(MyUser myuser) {
		// TODO Auto-generated method stub
		try {
			//未進入persist之前為New
			//Entity進入persist狀態變為merge
			//merge 的狀態修改Bean會修改Table
			//呼叫detach(arg0) 函數 將Entity帶入會變為detach
			//em.remove 刪除 盡量不要再使用此Entity 將刪除的Entity設為null
			em.persist(myuser);//Insert	
			System.out.println(myuser);
			//myuser.setAccount("Lucy");
			//em.merge(arg0) 
			//em.detach(arg0)
			//em.remove(arg0)//delete
		}catch(Exception ex) {
			System.out.println(ex);
			return false;
		}		
		return true;
	}

	@Override
	public MyUser findMyUser(String account, String password) {
		// TODO Auto-generated method stub
		 TypedQuery<MyUser> query =  em.createNamedQuery("findMyUser",MyUser.class);
		 query.setParameter("account", account);
		 //query.getResultList()//多筆時
		 MyUser myUser = query.getSingleResult();//單筆資料		 
		return myUser.getPassword().equals(password)?myUser:null;
	}
	
}
