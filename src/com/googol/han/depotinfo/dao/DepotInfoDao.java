package com.googol.han.depotinfo.dao;

import java.util.List;
import java.util.Map;

import com.googol.han.depotinfo.entity.DepotInfo;


public interface DepotInfoDao {
		//��ѯ��ҳ
		List<Map> depotInfoListPage(String sql);
		//��ѯ��Ʒ��Ϣ
		List<Map> queryGoods();
		//��ѯ����
		List<Map> depotInfoQueall();
		//��ѯ���
		List<Map> depotInfoQueId(DepotInfo depotinfo);
		//�޸�
		Integer depotInfoUpd(DepotInfo depotinfo);
		//ɾ��
		Integer depotInfoDel(String depotinfoId);
		//����
		Integer depotInfoAdd(DepotInfo depotinfo);
		//��ѯ���ID
	    Integer findmaxid();
	    //ģ����ѯ
	  	List<Map> depotInfoQuery(String temp);
	  	//����id��ѯ����
	  	List<Map> depotInfoQueById(String depotinfoId);
	   
}
