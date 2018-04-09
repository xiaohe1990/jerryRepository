<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<title>上墙管理</title>
<link rel="stylesheet" href="${basePath}/common/layui/css/layui.css">
</head>

<body>
<table class="layui-table" id="classify_table" lay-filter="scplist" lay-size="sm"></table>
 
<script type="text/html" id="barDemo">
  <a class="layui-btn layui-btn-primary layui-btn-mini" lay-event="detail">查看</a>
  <a class="layui-btn layui-btn-mini" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-mini" lay-event="del">删除</a>
</script>



<script src="${basePath}/common/jquery1.8.3.min.js"></script>
<script src="${basePath}/common/layui/layui.js"></script>
<script>
layui.config({
  base: '${basePath}/sys/js/' //你存放新模块的目录，注意，不是layui的模块目录
  ,version: true //一般用于更新模块缓存，默认不开启。设为true即让浏览器不缓存。也可以设为一个固定的值，如：201610
}).extend({ //扩展模块名称
	g_classify:'g_classify'
}).use('g_classify'); //加载入口
</script>  

</body>
</html>
