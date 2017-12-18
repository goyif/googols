<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.text.SimpleDateFormat"%>

<%@page import="java.util.Date"%>
<%
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	String date = format.format(new Date());
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>



<head>

  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
  <meta name="description" content="">
  <meta name="author" content="ThemeBucket">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script type="text/javascript" src="libraries/jquery/jquery-3.2.1.js"></script>

<script src="libraries/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
<link href="libraries/bootstrap-3.3.7-dist/css/bootstrap.css"
	rel="stylesheet" />

<script src="libraries/bootstrap-table-develop/src/bootstrap-table.js"></script>
<link rel="stylesheet" href="libraries/bootstrap.min.css">

<link href="libraries/bootstrap-3.3.7-dist/css/bootstrap.min.css.map"
	rel="stylesheet" />
	
<link href="libraries/bootstrap-3.3.7-dist/css/bootstrap.css"
	rel="stylesheet" />
<link href="libraries/bootstrap-3.3.7-dist/css/bootstrap.css.map"
	rel="stylesheet" />
<!-- <link href="libraries/bootstrap-3.3.7-dist/css/bootstrap-editable.css"
	rel="stylesheet" />	 -->
	

<script src="libraries/bootstrap-table-develop/src/locale/bootstrap-table-zh-CN.js"></script>
<script src="libraries/bootstrap-3.3.7-dist/js/bootbox.js"></script>
<script src="libraries/bootstrap-3.3.7-dist/js/bootstrap-table-export.js"></script>	
<script src="libraries/bootstrap-3.3.7-dist/js/bootstrap-table-editable.js"></script>
<script src="libraries/bootstrap-3.3.7-dist/js/bootstrap-editable.min.js"></script>
<script src="libraries/bootstrap-3.3.7-dist/js/bootstrap-editable.js"></script>

<title>Insert title here</title>
</head>
<!--点击保存触发的  -->
<script>

/* function submitForm(){
	$('#form_data').form('submit', {        
	    onSubmit: function(){    
			alert("提交之前做的事！");
	    },    
	    success:function(data){    
	        if(data=="true"){
	        	
	        	$("#gg").dialog("close");
	        	 $('#dd').datagrid('reload');
	        }
	    }    
	}); 
}
 */
</script>


<body>
	<!--------------------------添加/修改信息的弹出层---------------------------->

   
                
<a href="login.do">返回</a>
        <div id="toolbar" class="btn-group">
            <button id="btn_add" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
            </button>
           <!--  <button id="btn_edit" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
            </button> -->
            <button id="btn_delete" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
            </button>
        </div>
						<table id="tb_infos" border="1" bordercolor="#000"></table>
		</div>



					<!-- 新增div -->
					
     <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times; </button>
                   	<h4 class="modal-title" id="myModalLabel">新增</h4>
						</div>
						<form id="form_data" action="depotinfo/depotInfoAdd.do" method="post">
						<div class="modal-body">
                                                     <!--   进货单号 <input type="text" name="depotinfoId " class="form-control" id="depotinfoId" placeholder="进货单号"/>  -->
						        日期<input type="text" name="depotDate " class="form-control" id="depotDate" placeholder="日期" value="<%=date%>" />
						        备注<input type="text" name="deptInfoExplain " class="form-control" id="deptInfoExplain" placeholder="备注">
						        商品信息 <input type="text" name="goodId " class="form-control" id="goodId" placeholder="商品信息">
						        商品名字<input type="text" name="goodName " class="form-control" id="goodName" placeholder="商品名字">
					                商品数量 <input type="text" name="goodNumber " class="form-control" id="shuliang" onchange="sum();" placeholder="商品数量">
				                        商品进价 <input type="text" name="goodBidPrice " class="form-control" id="jinjia" onchange="sum();" placeholder="商品进价">
					                商品金额<input type="text" name="goodallPrice " class="form-control" id="jine"placeholder="商品金额">
					                仓库名<input type="text" name="depotName" class="form-control" id="depotName" placeholder="仓库名">
					                经手人ID<input type="text" name="userId" class="form-control" id="userId" placeholder="经手人ID">
					               仓库ID<input type="text" name="depotId" class="form-control" id="depotId" placeholder="仓库ID">
					               物品说明 <input type="text" name="goodExplain" class="form-control" id="goodExplain" placeholder="物品说明">
					          
					  <div>
		            </div>
                   <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-floppy-remove" aria-hidden="true"></span>关闭</button>
                    <button type="button"   id="formbut"  data-dismiss="modal" class="btn btn-default" ><span class="glyphicon glyphicon-floppy-saved" aria-hidden="true"></span>保存</button>
                 </div>
                 </div>
                 </form>
           </div><!-- /.modal-content -->
        </div><!-- /.modal -->
    </div>
				
	
					<!-- 修改div -->
					
     <div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"> &times; </button>
                   	<h4 class="modal-title" id="myModalLabel">修改</h4>
						</div>
						<form id="form_data" action="depotinfo/depotInfoAdd.do" method="post">
						<div class="modal-body">
                                                        进货单号 <input type="text"  readonly="readonly" name="depotinfoId " value=${depotinfoId } class="form-control" id="depotinfoId" placeholder="进货单号"/>
						        日期<input type="text" name="depotDate " value="${depotDate }"   class="form-control" id="depotDate" placeholder="日期" value="<%=date%>" />
						        备注<input type="text" name="deptInfoExplain "  value="${deptInfoExplain }" class="form-control" id="deptInfoExplain" placeholder="备注">
						        商品信息 <input type="text" name="goodId " value="${goodId }" class="form-control" id="goodId" placeholder="商品信息">
						        商品名字<input type="text" name="goodName " value="${goodName }" class="form-control" id="goodName" placeholder="商品名字">
					                商品数量 <input type="text" name="goodNumber " value="${goodNumber }" class="form-control" id="shuliang" onchange="sum();" placeholder="商品数量">
				                        商品进价 <input type="text" name="goodBidPrice " value="${goodBidPrice }" class="form-control" id="jinjia" onchange="sum();" placeholder="商品进价">
					                商品金额<input type="text" name="goodallPrice " value="${goodallPrice }" class="form-control" id="jine"placeholder="商品金额">
							
		         <div>
		         </div>
                   <div class="modal-footer">
                   <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-floppy-remove" aria-hidden="true"></span>关闭</button>
                   <button type="button"   id="formbut2"  data-dismiss="modal" class="btn btn-default" ><span class="glyphicon glyphicon-floppy-saved" aria-hidden="true"></span>保存</button>
                   </div>
                </div>
                </form>
             </div><!-- /.modal-content -->
        </div><!-- /.modal -->
    </div>
			
	
	
	
	
	
	
	
	
	
	
				
</body>
<script type="text/javascript">
$(function () {
    $('#username').editable({
        type: "text",                //编辑框的类型。支持text|textarea|select|date|checklist等
        title: "用户名",              //编辑框的标题
        disabled: false,             //是否禁用编辑
        emptytext: "空文本",          //空值的默认文本
        mode: "inline",              //编辑框的模式：支持popup和inline两种模式，默认是popup
        validate: function (value) { //字段验证
            if (!$.trim(value)) {
                return '不能为空';
            }
        }
    });

});

</script>
<!-- 删除 -->




<!-- 添加提价的AJAX-->
<script type="text/javascript">

//增加
$("#formbut").click(function() {
	alert(JSON.stringify({
		depotinfoId:$("#depotinfoId").val(), 
		depotDate:$("#depotDate").val(),
		deptInfoExplain:$("#deptInfoExplain").val(),
		goodId:$("#goodId").val(),
		goodName:$("#goodName").val(),
		goodNumber:$("#shuliang").val(),
		goodBidPrice:$("#jinjia").val(),
		goodallPrice:$("#jine").val(),
		depotName:$("#depotName").val(),
		userId:$("#userId").val(),
		depotId:$("#depotId").val(),
		goodExplain:$("#goodExplain").val()
		
    
})

	);
        $.ajax({
    		url:"depotinfo/depotInfoAdd.do",
            type : "post",
            dataType : "json",
            contentType : "application/json;charset=UTF-8",
            data : JSON.stringify({
                                    depotinfoId:$("#depotinfoId").val(),  
        	                        depotDate:$("#depotDate").val(),
        	                        deptInfoExplain:$("#deptInfoExplain").val(),
        	                        goodId:$("#goodId").val(),
        	                        goodName:$("#goodName").val(),
        	                        goodNumber:$("#shuliang").val(),
        	                        goodBidPrice:$("#jinjia").val(),
        	                        goodallPrice:$("#jine").val(),
        	                        depotName:$("#depotName").val(),
        	                        userId:$("#userId").val(),
        	                        depotId:$("#depotId").val(),
        	                        goodExplain:$("#goodExplain").val()
            })
            
         });
    });

 
   
   //删除按钮
 $("#btn_delete").click(function () {
	 //获取所有被选中的记录  
   var rows = $("#tb_infos").bootstrapTable('getSelections');  
   if (rows.length== 0) {  
       alert("请先选择要删除的记录!");  
       return;  
   }  
   var ids = '';  
   for (var i = 0; i < rows.length; i++) {  
       ids += rows[i]['DEPOTINFOID'] + ",";  
   }  
   ids = ids.substring(0, ids.length - 1);  
   deleteUser(ids);  
});

function deleteUser(ids) {  
   var msg = "您真的确定要删除吗？";  
   if (confirm(msg) == true) {  
       $.ajax({  
           url: "depotinfo/depotInfoDel.do",  
           type: "post",  
           data: {  
        	   cids: ids  
           },  
           success: function (data) {  
               alert("删除成功");  
               //重新加载记录  
               //重新加载数据  
              $("#tb_infos").bootstrapTable('refresh', {url: '${pageContext.request.contextPath}/depotinfo/depotInfoListPage.do'});  
           }  
       });  
   }  
}   

  
   
   

   


	//进价*数量=金额
	function sum() {
		var num1 = document.getElementById("jinjia").value;
		var num2 = document.getElementById("shuliang").value;
		document.getElementById("jine").value = new Number(num1)
				* new Number(num2);
	}
	//新增弹出
	$("#btn_add").click(function () {
            $("#myModalLabel").text("新增");
            $('#myModal').modal();
        });
	
	
	
	$("#btn_edit").click(function () {
        $("#myModalLabel2").text("新增");
        $('#myModal').modal();
    });
	
	

	$(function() {
		//1.初始化Table
		var oTable = new TableInit();
		oTable.Init();
		//2.初始化Button的点击事件
		var oButtonInit = new ButtonInit();
		oButtonInit.Init();
	});

	var TableInit = function() {
		var oTableInit = new Object();
		//初始化Table
		oTableInit.Init = function() {
			$('#tb_infos').bootstrapTable(
							{
								url : '${pageContext.request.contextPath}/depotinfo/depotInfoListPage.do', //请求后台的URL（*）
								method : 'get', //请求方式（*）
								toolbar : '#toolbar', //工具按钮用哪个容器
								striped : true, //是否显示行间隔色
								cache : false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
								pagination : true, //是否显示分页（*）
								sortable : false, //是否启用排序
								sortOrder : "asc", //排序方式
								
								queryParamsType : '', //默认值为 'limit' ,在默认情况下 传给服务端的参数为：offset,limit,sort
								// 设置为 ''  在这种情况下传给服务器的参数为：pageSize,pageNumber
								//queryParams: oTableInit.queryParams,//传递参数（*）
								sidePagination : "server", //分页方式：client客户端分页，server服务端分页（*）
								pageNumber : 1, //初始化加载第一页，默认第一页
								pageSize : 10, //每页的记录行数（*）
								pageList : [ 5, 10, 15, 20 ], //可供选择的每页的行数（*）
								search : false, //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
								strictSearch : true,
								showColumns : true, //是否显示所有的列
								showRefresh : true, //是否显示刷新按钮
						        minimumCountColumns : 2, //最少允许的列数
								clickToSelect : true, //是否启用点击选中行
								//height : 500, //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
								uniqueId : "DEPOTINFOID", //每一行的唯一标识，一般为主键列
								showToggle : true, //是否显示详细视图和列表视图的切换按钮
								cardView : false, //是否显示详细视图
								showExport: true,//是否显示导出
								
								exportDataType: "basic",              //basic', 'all', 'selected'.
								detailView : false, //是否显示父子表
								columns : [ {
									checkbox : true
								}, {
									field : 'DEPOTINFOID',
									title : '进货单号',
									  editable:{
										type:'text',
										title:'进货单号',
										validate:function (v){
											if(!v) return'编号不能为空';
										}
										
									}  
								}, {
									field : 'DEPOTDATE',
									title : '日期',
									 editable:{
										type:'text',
										title:'日期',
										validate:function (v){
											if(!v) return'编号不能为空';
										}
									}  
								}, {
									field : 'DEPTINFOEXPLAIN',
									title : '备注',
							         editable:{
											type:'text',
											title:'备注',
											validate:function (v){
												if(!v) return'编号不能为空';
											}
										}  
								}, {
									field : 'GOODID',
									title : '商品信息',
									 	 editable:{
											type:'text',
											title:'GOODID',
											validate:function (v){
												if(!v) return'编号不能为空';
											}
										}  
									  
								}, {
									field : 'DEPOTNAME',
									title : '仓库名',
									 	 editable:{
											type:'text',
											title:'DEPOTNAME',
											validate:function (v){
												if(!v) return'编号不能为空';
											}
										}  
									  
								}, {
									field : 'GOODEXPLAIN',
									title : '经手人ID',
									 	 editable:{
											type:'text',
											title:'GOODEXPLAIN',
											validate:function (v){
												if(!v) return'编号不能为空';
											}
										}  
									  
								},{
									field : 'USERID',
									title : '经手人ID',
									 	 editable:{
											type:'text',
											title:'USERID',
											validate:function (v){
												if(!v) return'编号不能为空';
											}
										}  
									  
								},{
									field : 'DEPOTID',
									title : '仓库ID',
										 editable:{
											type:'text',
											title:'DEPOTID',
											validate:function (v){
												if(!v) return'编号不能为空';
											   }
										}  
									
								},{
									field : 'GOODNAME',
									title : '商品名',
										 editable:{
											type:'text',
											title:'GOODNAME',
											validate:function (v){
												if(!v) return'编号不能为空';
											   }
										}  
									
								}, {
									field : 'GOODNUMBER',
									title : '商品数量',
										  editable:{
											type:'text',
											title:'商品数量',
											validate:function (v){
												if(!v) return'编号不能为空';
											}		
										}  
								}, {
									field : 'GOODBIDPRICE',
									title : '商品进价',
										  editable:{
											type:'text',
											title:'商品进价',
											validate:function (v){
												if(!v) return'编号不能为空';
												
											}
										}  
								}, {
									field : 'GOODALLPRICE',
									title : '商品金额',
										  editable:{
											type:'text',
											title:'商品金额',
											validate:function (v){
												if(!v) return'编号不能为空';
											}							
								}  
					     }  ],  

							 	 onEditableSave: function (field, row, oldValue, $el) {
					            	var data = {  
					            			depotinfoId:row.DEPOTINFOID, 
					            			depotDate :row.DEPOTDATE,
					            			deptInfoExplain :row.DEPTINFOEXPLAIN,
					            			goodId :row.GOODID,
					            			goodName :row.GOODNAME, 
					            			goodNumber :row.GOODNUMBER,
					            			goodBidPrice :row.GOODBIDPRICE, 
					            			goodallPrice :  row.GOODALLPRICE
					            			
					                }  
					                $.ajax({
					                   
					                    type : "POST", 
					                    url: "depotinfo/depotInfoUpd.do",
					                    type : "POST", 
					                    data : JSON.stringify(data), //转JSON字符串  
					                    dataType: 'json',  
					                    contentType:'application/json;charset=UTF-8', 
					                    success: function (data, status) {
					                        if (status == "success") {
					                            alert('提交数据成功');
					                        }
					                    },
					                    error: function () {
					                        alert('编辑失败');
					                    },
					                    complete: function () {

					                    }
					                });
					            }
					        });
					    }; 
			              

		//得到查询的参数
	 	oTableInit.queryParams = function(params) {
			var temp = { //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
				limit : params.limit, //页面大小
				offset : params.offset, //页码
				//order: params.order,
				//ordername: params.sort,
				keywords : $("#txt_search_txt_search_keywords").val(),
			};
			return temp;
		};
		return oTableInit;
	};
 
	var ButtonInit = function() {
		var oInit = new Object();
		var postdata = {};
		oInit.Init = function() {
			//初始化页面上面的按钮事件
		};
		return oInit;
	};
</script>
</html>