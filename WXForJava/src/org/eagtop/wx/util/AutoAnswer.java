package org.eagtop.wx.util;

import java.util.Map;

public class AutoAnswer {

	public static String receive(Map<String, String> requestMap) {
		switch (requestMap.get("Content"))
		{
		case "1": 
			return "霸气傲中原";
		case "2":
			return "王者扬风烟";
		case "3":
			return "力拨山河天";
        case "4":
        	return "宏威征凯旋";
        default:
        	return "明月出天山\r\n苍茫云海间\r\n长风几万里\r\n吹度玉门关\r\n汉下白登道\r\n胡窥青海湾\r\n由来征战地\r\n不见有人还\r\n戍客望边邑\r\n思归多苦颜\r\n高楼当此夜\r\n叹息未应闲";

		}

	}

}
