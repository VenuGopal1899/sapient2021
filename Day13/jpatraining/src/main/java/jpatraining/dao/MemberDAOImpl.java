package jpatraining.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpatraining.entities.Member;

public class MemberDAOImpl implements MemberDAO {

	
	private static EntityManagerFactory emf;
	private static EntityManager entityManager;

	static {
		emf = Persistence.createEntityManagerFactory("training");
		entityManager = emf.createEntityManager();
	}
	public boolean isMemberAvailable(int memberId) {
		// TODO Auto-generated method stub
		
		Member member =entityManager.find(Member.class, memberId);
		
		if(member == null) {
			return false;
		}
		return true;
	}

}
