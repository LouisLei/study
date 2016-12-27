<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html style="height: 100%">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<script type="text/javascript" src="../static/js/chart.js"></script>
<script type="text/javascript" src="../static/js/bmap.min.js"></script>
<script type="text/javascript" src="../static/js/china.js"></script>
<script type="text/javascript" src="../static/js/dataTool.min.js"></script>
<script type="text/javascript" src="../static/js/echarts-all-3.js"></script>
<script type="text/javascript" src="../static/js/world.js"></script>
<script type="text/javascript" src="../static/js/jquery.min.js"></script>

<title>终端分布页面</title>

</head>
<body style="height: 100%; margin: 0">
	<div style="margin-top: 25px;margin-left: 10px;margin-bottom: 20px;font-size: 20px">
		APP_ID：<input type="text" id="appId" name="appId" /> <input
			type="button" onclick="queryByAppId()" value="查询" />
	</div>
	<div id="container" style="height: 90%"></div>

</body>
</html>