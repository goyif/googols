package com.googol.han.depotinfo.dao.imp;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.googol.han.depotinfo.dao.DepotInfoDao;
import com.googol.han.depotinfo.entity.DepotInfo;
@Repository
public class DepotInfoDaoImpl implements DepotInfoDao{
	private static final long serialVersionUID = -5214331034214587916L;
		
	@Autowired
	SqlSessionFactory sqlSessionFactory;
	
	@Override
	public List<Map> queryGoods() {
		// TODO Auto-generated method stub
		return sqlSessionFactory.openSession().selectList("queryGoods");
	}

	@Override
	public List<Map> depotInfoQueall() {
		// TODO Auto-generated method stub
		return sqlSessionFactory.openSession().selectList("depotInfoQueall");
	}

	@Override
	public Integer depotInfoAdd(DepotInfo depotinfo) {
		// TODO Auto-generated method stub
		
		return sqlSessionFactory.openSession().insert("depotInfoAdd",depotinfo);
	}

	@Override
	public List<Map> depotInfoListPage(String sql){
		
		return sqlSessionFactory.openSession().selectList("depotInfoListPage",sql);
	}

	@Override
	public Integer depotInfoUpd(DepotInfo depotinfo) {
		// TODO Auto-generated method stub
		return sqlSessionFactory.openSession().update("depotInfoUpd",depotinfo);
	}

	@Override
	public Integer depotInfoDel(String depotinfoId) {
		// TODO Auto-generated method stub
		return sqlSessionFactory.openSession().delete("depotInfoDel",depotinfoId);
	}

	@Override
	public List<Map> depotInfoQueId(DepotInfo depotinfo) {
		// TODO Auto-generated method stub
		return sqlSessionFactory.openSession().selectList("depotInfoQueId",depotinfo);
	}

	@Override
	public Integer findmaxid() {
		
		return sqlSessionFactory.openSession().selectOne("finmaxid");
	}

	@Override
	public List<Map> depotInfoQuery(String temp) {
		// TODO Auto-generated method stub
		return sqlSessionFactory.openSession().selectList("depotInfoQuery",temp);
	}

	@Override
	public List<Map> depotInfoQueById(String depotinfoId) {
		// TODO Auto-generated method stub
		return sqlSessionFactory.openSession().selectList("depotInfoQueById",depotinfoId);
	}

}
