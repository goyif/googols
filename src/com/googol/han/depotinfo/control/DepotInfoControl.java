package com.googol.han.depotinfo.control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.googol.han.depotinfo.entity.DepotInfo;
import com.googol.han.depotinfo.service.DepotInfoService;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
@Controller
@RequestMapping("/depotinfo")
public class DepotInfoControl {
	private static final long serialVersionUID = -5214331034214587916L;
	@Autowired
    DepotInfoService depotinfoservice;
	
		// 分页
		@RequestMapping("/depotInfoListPage")
		@ResponseBody
		public void depotInfoListPage1(HttpServletRequest request, HttpServletResponse response, Integer pageSize, Integer pageNumber,
				String searchText) throws IOException {
			
			System.out.println("进入分页方法");
			response.setCharacterEncoding("UTF-8");
			if (null != searchText) {
				try {
					searchText = new String(searchText.getBytes("ISO-8859-1"), "UTF-8");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			Integer total = depotinfoservice.depotInfoQueall().size();
			int i;
			List<Map> list = new ArrayList<>();
			/*Map map1;*/
			list = depotinfoservice.depotInfoListPage(pageNumber.toString(), pageSize.toString());
			/*for (i = 0; i < list.size(); i++) {
				map1 = list.get(i);
				if (!map1.get("DEPOTSTATE").equals("运营中")) {
					list.remove(i);
					i--;
				}
			}*/

			Map map = new HashMap();
			map.put("total", total);// 总条目数
			map.put("rows", list);// 该页多少行数据
			// 返回数据要求必须是JSONObject类型
			JSONObject jsonArray = JSONObject.fromObject(map);
			System.out.println("JSONARRAY:" + jsonArray.toString());
			// 输出流返回的数据
			response.setContentType("text/html;charset=utf-8");
			System.out.println(jsonArray.toString());
			
			
			response.getWriter().write(jsonArray.toString());
			// return jsonArray.toString();
		}
	//测试方法，没用的
	@RequestMapping("/queryGoods")
	@ResponseBody
	public String queryGoods() throws Exception {
		ModelAndView mv = new ModelAndView();
		List<Map> list = depotinfoservice.queryGoods();	
		for (int i = 0; i < list.size(); i++) {
		      System.err.println(list.get(i));
		    }
		//JSONArray jsonarray= new JSONArray();
		JSONArray jsonarray=JSONArray.fromObject(list);
		//jsonarray.add(list);
		System.out.println(jsonarray.toString());
		return jsonarray.toString();
	}
	//查询所有
	@RequestMapping("/depotInfoQueall")
	@ResponseBody
	public String depotInfoQueall() throws Exception {
		ModelAndView mv = new ModelAndView();
		List<Map> list = depotinfoservice.depotInfoQueall();	
		for (int i = 0; i < list.size(); i++) {
		      System.err.println(list.get(i));
		    }
		//JSONArray jsonarray= new JSONArray();
		JSONArray jsonarray=JSONArray.fromObject(list);
		//jsonarray.add(list);
		System.out.println(jsonarray.toString());
		return jsonarray.toString();
	}
	

	
	//接口增加
	@RequestMapping("/depotInfoAdd")

	public ModelAndView depotInfoAdd(@RequestBody DepotInfo depotinfo) throws Exception {
		JSONObject jsonObject = new JSONObject();

		System.out.println(depotinfo.getDepotDate()+","+depotinfo.getGoodName());
		ModelAndView mv = new ModelAndView();
		Integer a= depotinfoservice.findmaxid()+1;
		String i=a.toString();
		depotinfo.setDepotinfoId(i);
		Integer map = depotinfoservice.depotInfoAdd(depotinfo);
		
		if(map!=null) {
			System.out.println("id"+depotinfo.getDepotinfoId());
			jsonObject.put("msg", true);
		}else {
			jsonObject.put("msg", false);
		}
		mv.setViewName("redirect:/Showgoogol_user.jsp");
		return mv;
	}
	
	//id查询
			@RequestMapping("/depotInfoQueById")
			@ResponseBody
			public String depotInfoQueById(String depotinfoId) throws Exception {
				ModelAndView mv = new ModelAndView();
				List<Map> list = depotinfoservice.depotInfoQueById(depotinfoId);	
				for (int i = 0; i < list.size(); i++) {
				      System.err.println(list.get(i));
				    }
				//JSONArray jsonarray= new JSONArray();
				JSONArray jsonarray=JSONArray.fromObject(list);
				//jsonarray.add(list);
				System.out.println(jsonarray.toString());
				return jsonarray.toString();
			}
			
			//模糊查询
			@RequestMapping("/depotInfoQuery")
			@ResponseBody
			public String depotInfoQuery(String str) throws Exception {
				ModelAndView mv = new ModelAndView();
				List<Map> list = depotinfoservice.depotInfoQuery(str);	
				for (int i = 0; i < list.size(); i++) {
				      System.err.println(list.get(i));
				    }
				//JSONArray jsonarray= new JSONArray();
				JSONArray jsonarray=JSONArray.fromObject(list);
				//jsonarray.add(list);
				System.out.println(jsonarray.toString());
				return jsonarray.toString();
			}
			
			
	
	//接口删除
		@RequestMapping("/depotInfoDel")
		@ResponseBody
		public  ModelAndView depotInfoDel1(HttpServletRequest request, HttpServletResponse response) throws Exception {
			System.out.println(request.getParameter("cids"));
			
			String ids=request.getParameter("cids")==null?"":request.getParameter("cids").toString();
			JSONObject jsonObject = new JSONObject();
			ModelAndView mv = new ModelAndView();
			Integer a = depotinfoservice.depotInfoDel(ids);
			if(a!=null) {
				jsonObject.put("msg", true);
			}else {
				jsonObject.put("msg", false);
			}
			mv.setViewName("redirect:/Showgoogol_user.jsp");
			return mv;
		}
		
		//接口更新
		@RequestMapping("/depotInfoUpd")
		@ResponseBody
		public String update(@RequestBody DepotInfo depotinfo) {
			System.out.println("进入修改方法");
			JSONObject jsonObject = new JSONObject();
			Integer i=depotinfoservice.depotInfoUpd(depotinfo);
			if(i!=null) {
				jsonObject.put("msg", true);
			}else {
				
				jsonObject.put("msg", false);
			}
			return jsonObject.toString();
			
		}
		
		
		/*public ModelAndView depotInfoUpd(@RequestBody DepotInfo depotinfo) throws Exception {
			
			JSONObject jsonObject = new JSONObject();
			ModelAndView mv = new ModelAndView();
			
		
			Integer map = depotinfoservice.depotInfoUpd(depotinfo);
			if(map!=null) {
				jsonObject.put("msg", true);
			}else {
				jsonObject.put("msg", false);
			}
			mv.setViewName("redirect:/Showgoogol_user.jsp");
			return mv;
		}
	*/
}
