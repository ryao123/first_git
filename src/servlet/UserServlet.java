package servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
/**
 *	 �����û���Ϣservlet
 * 
 */
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.User;
import service.UserService;
import service.impl.UserServiceImpl;

//  ���÷��ʵ�URL��Ϣ    , ע��
@WebServlet("/Add")
public class UserServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		//�����������ݵı���
		req.setCharacterEncoding("UTF-8");
		//��servlet ��ȥ����service�е�����
		UserService us=new UserServiceImpl();
		User user =new User();
		//���ҳ���ϵ�����
		String name=req.getParameter("name");
		//ҳ���ϻ�õ��������ݶ���String���ͣ� ��������int����
		//����������Ҫ����ǿת����װ�ࣩ
		int age=Integer.parseInt(req.getParameter("age"));
		
		//����ʵ�����е�setter  ����Ϊ˽�е����Ը�ֵ
		user.setName("����");
		user.setAge(20);
		us.save(user);
		
		
		
		
		
	}

	
	
	
}
