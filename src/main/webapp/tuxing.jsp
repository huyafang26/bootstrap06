<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020-09-23
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图形</title>
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script src="js/echarts.js"></script>

</head>
<body>
<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
<div id="main" style="width: 600px;height:400px;"></div>
<script type="text/javascript">
    $(function () {
        var xshangpinname=new Array();
        var yxiaoliang = new Array();
        $.ajax({
            url:"querytuxing.action",
            async:false,
            dataType:"json",
            success: function(data) {
                for (var i=0;i<data.length;i++){
                    xshangpinname.push(data[i].shangpinname);
                    yxiaoliang.push(data[i].xiaoliang);
                }
                // 基于准备好的dom，初始化echarts实例
                var myChart = echarts.init(document.getElementById('main'));
                // 指定图表的配置项和数据
                var option = {
                    title: {
                        text: 'ECharts 入门示例'
                    },
                    tooltip: {},
                    legend: {
                        data:['销量']
                    },
                    xAxis: {
                        data:xshangpinname
                    },
                    yAxis: {},
                    series: [{
                        name: '销量',
                        type: 'bar',
                        data:yxiaoliang
                    }]
                };
                // 使用刚指定的配置项和数据显示图表。
                myChart.setOption(option);
            }
        });
    });
</script>
</body>
</html>
