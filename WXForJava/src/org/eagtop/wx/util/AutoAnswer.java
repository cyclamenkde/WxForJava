package org.eagtop.wx.util;

import java.util.Map;

public class AutoAnswer {

	public static String receive(Map<String, String> requestMap) {
		switch (requestMap.get("Content"))
		{
		case "1": 
			return "��������ԭ";
		case "2":
			return "���������";
		case "3":
			return "����ɽ����";
        case "4":
        	return "����������";
        default:
        	return "���³���ɽ\r\n��ã�ƺ���\r\n���缸����\r\n�������Ź�\r\n���°׵ǵ�\r\n�����ຣ��\r\n������ս��\r\n�������˻�\r\n����������\r\n˼������\r\n��¥����ҹ\r\n̾ϢδӦ��";

		}

	}

}
