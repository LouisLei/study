function queryByAppId(){
	
	var appId=$("#appId").val();
	if($("#appId").val()== '') {
		alert("请输入查询条件！");
	}
	
	$.ajax({
	      url: "../query/queryDecvInfo",
	      type: "GET",
	      dataType: "json",
	      data: {
	        "appId" : appId
	      },
	      async: false,
	      success:function(data){										
			
			var length = data.length;	
			var version = [];
			for (var i = 0; i < length; i++){
				console.log(data[i])
				var value = data[i].value;
				var name = data[i].name;
				console.log(value)
				console.log(name)
				version.push(name);
			}
			var dom = document.getElementById("container");
			var myChart = echarts.init(dom);
			option = null;
			option = {
			    title : {
			        text: '终端分布页面',
			        x:'center'
			    },
			    tooltip : {
			        trigger: 'item',
			        formatter: "{a} <br/>{b} : {c} ({d}%)"
			    },
			    legend: {
			        orient: 'vertical',
			        left: 'left',
			        data: version
			    },
			    series : [
			        {
			            name: appId,
			            type: 'pie',
			            radius : '55%',
			            center: ['50%', '60%'],
			            data:data,
			            itemStyle: {
			                emphasis: {
			                    shadowBlur: 10,
			                    shadowOffsetX: 0,
			                    shadowColor: 'rgba(0, 0, 0, 0.5)'
						                }
						            }
						        }
						    ]
					};
				;
				if (option && typeof option === "object") {
				    myChart.setOption(option, true);
				}
		  },
	      error: function() {
	        alert("error");
	      }
	    });
	
}