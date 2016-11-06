<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>故事集</title>
<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=GLGkqttQSFiMBvmjdKkDOP9rHCIcPCFK"></script>
<style type="text/css">
	body, html,#allmap {width: 100%;height: 100%;overflow: hidden;margin:0;font-family:"微软雅黑";}
	</style>
</head>
<body>
 <div id="allmap"></div>
</body>
<script type="text/javascript">
	//百度地图API功能
	var map = new BMap.Map("allmap");
	var point = new BMap.Point(116.331398,39.897445);
	map.centerAndZoom(point,12);
	//ip定位
	function gps(result){
		var cityName = result.name;
		map.setCenter(cityName);
	}
	var myCity = new BMap.LocalCity();
	myCity.get(gps);
	map.enableScrollWheelZoom(true);     //开启鼠标滚轮缩放
</script>
</html>
