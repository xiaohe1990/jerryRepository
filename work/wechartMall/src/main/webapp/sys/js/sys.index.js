// JavaScript Document

//JavaScript代码区域
 var element;
layui.use('element', function(){
   element = layui.element;
  //var device = layui.device();//获取当前环境

//触发事件
//Hash地址的定位
  var layid = location.hash.replace(/^#demo=/, '');
  element.tabChange('demo', layid);
  
  element.on('tab(demo)', function(elem){
    location.hash = 'demo='+ $(this).attr('lay-id');
  });
  
});
//添加选项卡
function tabAdd(title,url,lay_id){
	var r = $("#tabTitle").find("li");
	var count=0;
	for (var i=0;i<r.length; i++){
             var r_layid=$(r[i]).attr('lay-id');
			 if(r_layid==lay_id){ 
			     count++;
			 }
            }
			if(count>0){
				tabChange(lay_id)
			}else{
				tabAddTo(title,url,lay_id);
				tabChange(lay_id);
			}
			
	      
}
//创建选项卡
function tabAddTo(title,url,lay_id){
	 element.tabAdd('demo', {
        title: title+'' //用于演示
        ,content: '<iframe name="iframe" id="iframe'+lay_id+'" src="' +url + '" frameborder="0" style="width: 100%;height:100%;">'
        ,id: lay_id //实际使用一般是规定好的id，这里以时间戳模拟下
      })
      startInit("iframe"+lay_id, 450);
}
//选项卡选中
function tabChange(lay_id){
   //切换到指定Tab项
   element.tabChange('demo', lay_id); //切换到：用户管理
}
