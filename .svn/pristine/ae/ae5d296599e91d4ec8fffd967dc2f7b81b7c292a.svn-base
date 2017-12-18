package com.googol.han.depotinfo.dao;

import java.util.List;
import java.util.Map;

import com.googol.han.depotinfo.entity.DepotInfo;


public interface DepotInfoDao {
		//查询分页
		List<Map> depotInfoListPage(String sql);
		//查询商品信息
		List<Map> queryGoods();
		//查询所有
		List<Map> depotInfoQueall();
		//查询编号
		List<Map> depotInfoQueId(DepotInfo depotinfo);
		//修改
		Integer depotInfoUpd(DepotInfo depotinfo);
		//删除
		Integer depotInfoDel(String depotinfoId);
		//新增
		Integer depotInfoAdd(DepotInfo depotinfo);
		//查询最大ID
	    Integer findmaxid();
	    //模糊查询
	  	List<Map> depotInfoQuery(String temp);
	  	//根据id查询订单
	  	List<Map> depotInfoQueById(String depotinfoId);
	   
}
