package org.eagtop.wx.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eagtop.wx.util.*;

/**
 * ������������
 * 
 *  @author LiuJun
 * @date 2013-05-18
 */
public class CoreServlet extends HttpServlet {
	private static final long serialVersionUID = 4440739483644821986L;

	/**
	 * ȷ����������΢�ŷ�����
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ΢�ż���ǩ��
		String signature = request.getParameter("signature");
		//System.out.println(signature);
		// ʱ���
		String timestamp = request.getParameter("timestamp");
		//System.out.println(timestamp);
		// �����
		String nonce = request.getParameter("nonce");
		//System.out.println(nonce);
		// ����ַ���
		String echostr = request.getParameter("echostr");
		//System.out.println(echostr);

		PrintWriter out = response.getWriter();
		// ͨ������signature���������У�飬��У��ɹ���ԭ������echostr����ʾ����ɹ����������ʧ��
		if (SignUtil.checkSignature(signature, timestamp, nonce)) {
			out.println(echostr);
		}
		out.close();
		out = null;
	}

	/**
	 * ����΢�ŷ�������������Ϣ
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ��������Ӧ�ı��������ΪUTF-8����ֹ�������룩  
		request.setCharacterEncoding("UTF-8");  
		response.setCharacterEncoding("UTF-8");  

		// ���ú���ҵ���������Ϣ��������Ϣ  
		String respMessage = CoreService.processRequest(request);  
		  
		// ��Ӧ��Ϣ  
		PrintWriter out = response.getWriter();  
		out.print(respMessage);  
		out.close(); 

	}

}
