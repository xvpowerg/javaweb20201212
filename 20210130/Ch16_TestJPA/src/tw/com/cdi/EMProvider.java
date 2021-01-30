package tw.com.cdi;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class EMProvider {
	//EntityManager 交給容器維護交易
	@PersistenceContext
	@Produces
	private EntityManager em; 
}
