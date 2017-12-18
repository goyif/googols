package com.googol.han.depotinfo.service;

import java.util.List;
import java.util.Map;

import com.googol.han.depotinfo.entity.DepotInfo;


public interface DepotInfoService {
			//分页查询
	        public List depotInfoListPage(String pageno,String pagesize);
			//查询商品信息
			List<Map> queryGoods();
			//查询所有
			List<Map> depotInfoQueall();
			//新增
			Integer depotInfoAdd(DepotInfo depotinfo);
			//修改
			Integer depotInfoUpd(DepotInfo depotinfo);
			//删除
			Integer depotInfoDel(String depotinfoId);
			Integer findmaxid();
			 //模糊查询
		  	List<Map> depotInfoQuery(String temp);
		  	//根据id查询订单
		  	List<Map> depotInfoQueById(String depotinfoId);
}
