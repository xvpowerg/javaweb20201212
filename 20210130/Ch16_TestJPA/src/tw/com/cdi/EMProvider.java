package tw.com.cdi;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class EMProvider {
	//EntityManager �浹�e�����@���
	@PersistenceContext
	@Produces
	private EntityManager em; 
}
