package com.googol.han.depotinfo.service;

import java.util.List;
import java.util.Map;

import com.googol.han.depotinfo.entity.DepotInfo;


public interface DepotInfoService {
			//��ҳ��ѯ
	        public List depotInfoListPage(String pageno,String pagesize);
			//��ѯ��Ʒ��Ϣ
			List<Map> queryGoods();
			//��ѯ����
			List<Map> depotInfoQueall();
			//����
			Integer depotInfoAdd(DepotInfo depotinfo);
			//�޸�
			Integer depotInfoUpd(DepotInfo depotinfo);
			//ɾ��
			Integer depotInfoDel(String depotinfoId);
			Integer findmaxid();
			 //ģ����ѯ
		  	List<Map> depotInfoQuery(String temp);
		  	//����id��ѯ����
		  	List<Map> depotInfoQueById(String depotinfoId);
}
