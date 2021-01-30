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
			//���i�Jpersist���e��New
			//Entity�i�Jpersist���A�ܬ�merge
			//merge �����A�ק�Bean�|�ק�Table
			//�I�sdetach(arg0) ��� �NEntity�a�J�|�ܬ�detach
			//em.remove �R�� �ɶq���n�A�ϥΦ�Entity �N�R����Entity�]��null
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
		 //query.getResultList()//�h����
		 MyUser myUser = query.getSingleResult();//�浧���		 
		return myUser.getPassword().equals(password)?myUser:null;
	}
	
}
