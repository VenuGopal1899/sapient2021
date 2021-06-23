/**
 * 
 */
package jpatraining.app;

import jpatraining.dao.MemberDAO;
import jpatraining.dao.MemberDAOImpl;

/**
 * @author admi
 *
 */
public class MemberApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberDAOImpl memberDao =  new MemberDAOImpl();
		boolean isMemberAvailable;
		isMemberAvailable=memberDao.isMemberAvailable(11111);

	}

}
