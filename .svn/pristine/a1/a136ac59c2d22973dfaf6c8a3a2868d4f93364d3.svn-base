package com.googol.han.depotinfo.service.imp;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.googol.han.depotinfo.dao.DepotInfoDao;
import com.googol.han.depotinfo.entity.DepotInfo;
import com.googol.han.depotinfo.service.DepotInfoService;
import com.sun.org.apache.regexp.internal.recompile;

import sun.security.provider.certpath.CertId;

@Service("depotinfoservice")
public class DepotInfoServiceImpl implements DepotInfoService{
	private static final long serialVersionUID = -5432009344247633240L;
	@Autowired
    DepotInfoDao depotdao;
	
	@Override
	public List<Map> depotInfoQueall() {
		// TODO Auto-generated method stub
		return depotdao.depotInfoQueall();
	}

	@Override
	public Integer depotInfoAdd(DepotInfo depotinfo) {
		
		/*List<Map> list=depotdao.depotInfoQueId(depotinfo);
		
		Integer i=depotdao.depotInfoQueId(depotinfo).size();
        if(i==0) {
			
			return depotdao.depotInfoAdd(depotinfo);
		}else {
			
			return null;
		}*/
		return depotdao.depotInfoAdd(depotinfo);
	}

	@Override
	public List<Map> queryGoods() {
		// TODO Auto-generated method stub
		return depotdao.queryGoods();
	}
	
	@Override
	public List depotInfoListPage(String pageno, String pagesize) {
		String tablename="GOOGOL_DEPOTINFO";
		String sql="select * from ( SELECT ROWNUM AS LIMITNUM,T.*  FROM "+tablename+" T  ) WHERE LIMITNUM BETWEEN ("+pageno+"-1)*"+pagesize+" AND "+pageno+"*"+pagesize;
		System.out.println(sql);
		return depotdao.depotInfoListPage(sql);
	}

	@Override
	public Integer depotInfoUpd(DepotInfo depotinfo) {
		// TODO Auto-generated method stub
		return depotdao.depotInfoUpd(depotinfo);
	}

	@Override
	public Integer depotInfoDel(String depotinfoId) {
		// TODO Auto-generated method stub
		return depotdao.depotInfoDel(depotinfoId);
	}

	@Override
	public Integer findmaxid() {
		
		return depotdao.findmaxid();
	}

	@Override
	public List<Map> depotInfoQuery(String temp) {
		// TODO Auto-generated method stub
		return depotdao.depotInfoQuery(temp);
	}

	@Override
	public List<Map> depotInfoQueById(String depotinfoId) {
		// TODO Auto-generated method stub
		return depotdao.depotInfoQueById(depotinfoId);
	}
	



}
