<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,minimum-scale=1,user-scalable=no">
    <meta name="app-mobile-web-app-capable" content="yes">
    <meta name="app-mobile-web-app-status-bar-style" content="black">
    <meta name="format-detection" content="telephone=no">
    <meta name="format-detection" content="email=no">
    <link rel="stylesheet" href="../common/css/bootstrap.min.css">
    <link rel="stylesheet" href="../style/sys/login.css">
	<title>登录</title>
</head>
<body>
	<!--登录框-->
	<div class="panel panel-primary fe-login">
		<div class="panel-heading login_head">
			<div class="panel-title text-center">标书在线后台管理系统</div>
		</div>
		<div class="panel-body">
			<form class="text-center">
				<div class="input-group input-group-lg">
					<span class="input-group-addon">账<s style="opacity:0;">号</s>号</span>
					<input type="text" class="form-control" placeholder="请输入(邮箱/电话号码)">
				</div>
				<div class="input-group input-group-lg">
					<span class="input-group-addon">密<s style="opacity:0;">码</s>码</span>
					<input type="password" class="form-control" placeholder="请输入密码">
				</div>
				<div class="input-group input-group-lg">
					<span class="input-group-addon">验证码</span>
					<input type="text" class="form-control">
                    
				</div>
				<div class="input-group input-group_btnBox">
					<span class="btn btn-primary btn-lg login_btn">登录</span>
				</div>
			</form>
		</div>
		<div class="panel-footer text-right">

		</div>
	</div>
	<div class="fe-login_canvasBg"></div>
	<!--背景墙-->
  	<canvas id="canvas"></canvas>
<script src="../common/js/jquery-3.2.1.min.js"></script>
<script>
$(function(){
	var win=$(window);
	var canvasBg=$('.fe-login_canvasBg');
	canvasBg.css({
		'width':win.outerWidth(),
		'height':win.outerHeight()
	});
	win.on('resize',function(){
		canvasBg.css({
			'width':win.outerWidth(),
			'height':win.outerHeight()
		});
	}).on('keydown',function(ev){
		if(ev.which===122){
			canvasBg.css({
				'width':win.outerWidth(),
				'height':win.outerHeight()
			});
		}
	});
//宇宙特效
"use strict";
var canvas = document.getElementById('canvas'),
  ctx = canvas.getContext('2d'),
  w = canvas.width = window.innerWidth,
  h = canvas.height = window.innerHeight,

  hue = 217,
  stars = [],
  count = 0,
  maxStars = 1300;//星星数量

var canvas2 = document.createElement('canvas'),
  ctx2 = canvas2.getContext('2d');
canvas2.width = 100;
canvas2.height = 100;
var half = canvas2.width / 2,
  gradient2 = ctx2.createRadialGradient(half, half, 0, half, half, half);
gradient2.addColorStop(0.025, '#CCC');
gradient2.addColorStop(0.1, 'hsl(' + hue + ', 61%, 33%)');
gradient2.addColorStop(0.25, 'hsl(' + hue + ', 64%, 6%)');
gradient2.addColorStop(1, 'transparent');

ctx2.fillStyle = gradient2;
ctx2.beginPath();
ctx2.arc(half, half, half, 0, Math.PI * 2);
ctx2.fill();

// End cache

function random(min, max) {
  if (arguments.length < 2) {
    max = min;
    min = 0;
  }

  if (min > max) {
    var hold = max;
    max = min;
    min = hold;
  }

  return Math.floor(Math.random() * (max - min + 1)) + min;
}

function maxOrbit(x, y) {
  var max = Math.max(x, y),
    diameter = Math.round(Math.sqrt(max * max + max * max));
  return diameter / 2;
  //星星移动范围，值越大范围越小，
}

var Star = function() {

  this.orbitRadius = random(maxOrbit(w, h));
  this.radius = random(60, this.orbitRadius) / 8; 
  //星星大小
  this.orbitX = w / 2;
  this.orbitY = h / 2;
  this.timePassed = random(0, maxStars);
  this.speed = random(this.orbitRadius) / 50000; 
  //星星移动速度
  this.alpha = random(2, 10) / 10;

  count++;
  stars[count] = this;
}

Star.prototype.draw = function() {
  var x = Math.sin(this.timePassed) * this.orbitRadius + this.orbitX,
    y = Math.cos(this.timePassed) * this.orbitRadius + this.orbitY,
    twinkle = random(10);

  if (twinkle === 1 && this.alpha > 0) {
    this.alpha -= 0.05;
  } else if (twinkle === 2 && this.alpha < 1) {
    this.alpha += 0.05;
  }

  ctx.globalAlpha = this.alpha;
  ctx.drawImage(canvas2, x - this.radius / 2, y - this.radius / 2, this.radius, this.radius);
  this.timePassed += this.speed;
}

for (var i = 0; i < maxStars; i++) {
  new Star();
}

function animation() {
  ctx.globalCompositeOperation = 'source-over';
  ctx.globalAlpha = 0.5; //尾巴
  ctx.fillStyle = 'hsla(' + hue + ', 64%, 6%, 2)';
  ctx.fillRect(0, 0, w, h)

  ctx.globalCompositeOperation = 'lighter';
  for (var i = 1, l = stars.length; i < l; i++) {
    stars[i].draw();
  };

  window.requestAnimationFrame(animation);
}

animation();
});
</script>
</body>
</html>