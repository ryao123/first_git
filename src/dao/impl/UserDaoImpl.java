package dao.impl;

import java.util.ArrayList;
import java.util.List;

import dao.UserDao;
import entity.User;
/**
 *      ʵ��Dao�ӿڷ����Ĳ�����
 * @author Effort
 *
 */
public class UserDaoImpl implements UserDao{

	@Override
	public void save(User user) {
		
		// ����һ�������������û���Ϣ
		List<User> list =new ArrayList<User>();
		list.add(user);
		for (User user2 : list) {
			System.out.println(user2.getName()+","
					+user2.getAge());
		}
		
	}

	@Override
	public void updat(User user) {
		/*
		 * for (User user1 : list) { if(user1.getName().equals(user1.getName())); }
		 */
		System.out.println("ִ���޸��û���Ϣ�Ĳ���");
		
	}

}
