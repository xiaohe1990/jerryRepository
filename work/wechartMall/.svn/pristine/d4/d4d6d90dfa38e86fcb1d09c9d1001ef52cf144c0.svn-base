//加载所需使用模块
layui.use(['laydate', 'laypage', 'layer', 'table', 'carousel', 'upload', 'element'], function(){
  var laydate = layui.laydate //日期
  ,laypage = layui.laypage //分页
  layer = parent.layer //弹层
  ,table = layui.table //表格
  ,carousel = layui.carousel //轮播
  ,upload = layui.upload //上传
  ,element = layui.element; //元素操作
  
//初始化分类列表
  table.render({
    elem: '#classify_table'
    //,height: 315
    ,where: {token: 'sasasas', id: 123} //如果无需传递额外参数，可不加该参数
    ,skin: 'line' //行边框风格
    ,even: true //开启隔行背景
    ,size: 'sm' //小尺寸的表格	
    ,method:'post'
   // ,contentType: "application/json" //必须有  
    //,dataType: "json"//表示返回值类型，不必须  
    ,url: '../goods/getClassifyList.shtml' //数据接口
    ,page: true //开启分页
    ,cols: [[ //表头
       {field: 'id', title: 'ID', width:80, sort: true, fixed: 'left'}
      ,{field: 'username', title: '用户名', width:80}
      ,{field: 'sex', title: '性别', width:80, sort: true}
      ,{field: 'city', title: '城市', width:80} 
      ,{field: 'sign', title: '签名', width: 177}
      ,{field: 'experience', title: '积分', width: 80, sort: true}
      ,{field: 'score', title: '评分', width: 80, sort: true}
      ,{field: 'classify', title: '职业', width: 80}
      ,{field: 'wealth', title: '财富', width: 135, sort: true}
      ,{fixed: 'right', width:160, align:'center', toolbar: '#barDemo'}
    ]]
  });
  
  
});