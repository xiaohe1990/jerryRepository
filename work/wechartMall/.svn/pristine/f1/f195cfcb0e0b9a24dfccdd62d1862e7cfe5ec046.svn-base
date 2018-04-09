 
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<title>${token.nickname?default('未设置')} —个人中心</title>
<link rel="stylesheet" href="${basePath}/common/layui/css/layui.css">
<link rel="stylesheet" href="${basePath}/sys/css/sys.index.css">
<link href="${basePath}/js/common/bootstrap/3.3.5/css/bootstrap.min.css?${_v}" rel="stylesheet"/>
<link href="${basePath}/css/common/base.css?${_v}" rel="stylesheet"/>
<style type="text/css">
  
</style>
</head>
<body style="height: 100%">
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">创想商城后台管理</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    <!-- <ul class="layui-nav layui-layout-left">
      <li class="layui-nav-item"><a href="">是</a></li>
      <li class="layui-nav-item"><a href="">商品管理</a></li>
      <li class="layui-nav-item"><a href="">用户</a></li>
      <li class="layui-nav-item">
        <a href="javascript:;">其它系统</a>
        <dl class="layui-nav-child">
          <dd><a href="">邮件管理</a></dd>
          <dd><a href="">消息管理</a></dd>
          <dd><a href="">授权管理</a></dd>
        </dl>
      </li>
    </ul>-->
    <ul class="layui-nav layui-layout-right">
    <li class="layui-nav-item">
<a href="">消息中心<span class="layui-badge">9</span></a>
</li>
<li class="layui-nav-item">
<a href="">个人中心<span class="layui-badge-dot"></span></a>
</li>
      <li class="layui-nav-item">
        <a href="javascript:;">
          <img src="${basePath}/sys/img/04.jpg" class="layui-nav-img">
         ${token.nickname?default('未设置')}
        </a>
        <dl class="layui-nav-child">
          <dd><a href="">基本资料</a></dd>
          <dd><a href="">安全设置</a></dd>
        </dl>
      </li>
      <li class="layui-nav-item"><a  href="javascript:void(0);" onclick="logout();">退出</a></li>
    </ul>
  </div>
  
  <div class="layui-side layui-bg-black layadmin-side-shrink">
    <div class="layui-side-scroll">
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
      <ul class="layui-nav layui-nav-tree"  lay-filter="test">
        <li class="layui-nav-item layui-nav-itemed">
          <a class="" href="javascript:;">商品管理中心</a>
          <dl class="layui-nav-child">
            <dd><a href="javascript:tabAdd('类目管理','${basePath}/goods/g_classify.shtml',3);">类目管理</a></dd>
            <dd><a href="javascript:;">品牌管理</a></dd>
            <dd><a href="javascript:;">供应商管理</a></dd>
            <dd><a href="javascript:;">属性管理</a></dd>
            <dd><a href="javascript:;">库存管理</a></dd>
          </dl>
        </li>
         <li class="layui-nav-item">
          <a href="javascript:;">订单管理中心</a>
            <dl class="layui-nav-child">
             <dd><a href="javascript:;">订单列表</a></dd>
            </dl>
         </li>
          <li class="layui-nav-item">
          <a href="javascript:;">系统用户管理</a>
            <dl class="layui-nav-child">
             <dd><a href="javascript:;">架构管理</a></dd>
             <dd><a href="javascript:;">用户管理</a></dd>
             <dd><a href="javascript:;">角色管理</a></dd>
             <dd><a href="javascript:;">权限管理</a></dd>
            </dl>
         </li>
          <li class="layui-nav-item">
          <a href="javascript:;">会员管理中心</a>
            <dl class="layui-nav-child">
             <dd><a href="javascript:;">会员信息管理</a></dd>
            </dl>
         </li>
        <li class="layui-nav-item">
        <a href="javascript:;">客服管理中心</a>
          <dl class="layui-nav-child">
            <dd><a href="javascript:;">售后服务管理</a></dd>
            <dd><a href="javascript:;">在线客服管理</a></dd>
          </dl>
        </li>
        <li class="layui-nav-item">
        <a href="javascript:;">风险预警管理</a>
          <dl class="layui-nav-child">
            <dd><a href="javascript:;">预警消息管理</a></dd>
          </dl>
        </li>
         <li class="layui-nav-item">
          <a href="javascript:;">系统配置</a>
          <dl class="layui-nav-child">
            <dd><a href="javascript:;">系统设置</a></dd>
            <dd><a href="javascript:;">个人面板</a></dd>
            
          </dl>
        </li>
        
      </ul>
    </div>
  </div>
  
  <div class="layui-body">
    <!-- 内容主体区域 -->
    <div style="padding: 15px;">
    
    <!---layui-tab-card-->
    <div class="layui-tab  layui-tab-brief "  lay-filter="demo"  lay-allowclose="true">
<ul id="tabTitle" class="layui-tab-title" >
<li class="layui-this" lay-id="1"> 
<i class="layui-icon" style="font-size:20px; font-weight:bold; margin-right:10px;">&#xe68e;</i>系统首页</li>

</ul>
<div class="layui-tab-content">
<div class="layui-tab-item layui-show">
<div class="col-md-10">
	<div class="row">
				<div class="col-md-10">
					<h2>个人资料</h2>
					<hr>
					<table class="table table-bordered">
						<tr>
							<th>昵称</th>
							<td>${token.nickname?default('未设置')}</td>
						</tr>
						<tr>
							<th>帐号</th>
							<td>${token.username?default('未设置')}</td>
						</tr>
						<tr>
							<th>手机号</th>
							<td>${token.phonenum?default('未设置')}</td>
						</tr>
						<tr>
							<th>Email</th>
							<td>${token.email?default('未设置')}</td>
						</tr>
						<tr>
							<th>创建时间</th>
							<td>${token.createTime?string('yyyy-MM-dd HH:mm')}</td>
						</tr>
						<tr>
							<th>最后登录时间</th>
							<td>${token.lastLoginTime?string('yyyy-MM-dd HH:mm')}</td>
						</tr>
					</table>
				</div>
			</div>
			<#--/row-->
</div>
</div>


</div>
</div>
    </div>
  </div>
  
</div>
<script src="${basePath}/common/layui/layui.js"></script>

<script src="${basePath}/common/jquery1.8.3.min.js"></script>
<script baseUrl="${basePath}" src="${basePath}/sys/js/user.login.js"></script>
<script src="${basePath}/common/util.js"></script>
<script src="${basePath}/sys/js/sys.index.js"></script>
<script>
/**layui.config({
  base: 'sys/js/' //你存放新模块的目录，注意，不是layui的模块目录
  ,version: false //一般用于更新模块缓存，默认不开启。设为true即让浏览器不缓存。也可以设为一个固定的值，如：201610
}).use('index'); //加载入口
**/
layui.use('layer', function(){
	  var layer = layui.layer;
	  
	  layer.msg('hello');
	});    
</script>  
 
</body>
</html>
