<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020-09-23
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/bootstrap-select.js"></script>
    <script type="text/javascript" src="js/bootstrap-table.js"></script>
    <script type="text/javascript" src="js/bootstrap-table-zh-CN.js"></script>
    <link rel="stylesheet" href="css/bootstrap.css"/>
    <link rel="stylesheet" href="css/bootstrap-select.css">
    <link rel="stylesheet" href="css/bootstrap-table.css">
</head>
<body>

    <div class="container">
        <form class="form-inline">
            <div class="input-group">
                <span class="input-group-addon">姓名：</span>
                <input type="text" placeholder="请输入姓名" id="searchname" class="form-control">
                <div class="input-group-btn">
                    <input type="button" id="btnsearchuser" class="btn btn-primary" value="查询">
                </div>

            </div>
        </form>
        <table id="personlisttable">
        </table>
    </div>

<script type="text/javascript">
    $(function () {

        $('#personlisttable').bootstrapTable({
            url: 'queryallpersonbyCond.action',
            method: 'GET',                      //请求方式（*）
            //toolbar: '#toolbar',              //工具按钮用哪个容器
            striped: true,                      //是否显示行间隔色
            cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            pagination: true,                   //是否显示分页（*）
            sortable: true,                     //是否启用排序
            sortOrder: "asc",                   //排序方式
            sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
            pageNumber: 1,                      //初始化加载第一页，默认第一页,并记录
            pageSize: 5,                     //每页的记录行数（*）
            pageList: [5,10,25,50,100],        //可供选择的每页的行数（*）
            search: false,                      //是否显示表格搜索
            strictSearch: true,
            showColumns: true,                  //是否显示所有的列（选择显示的列）
            showRefresh: true,                  //是否显示刷新按钮
            minimumCountColumns: 1,             //最少允许的列数
            clickToSelect: true,                //是否启用点击选中行
            //height: 500,                      //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
            uniqueId: "id",                     //每一行的唯一标识，一般为主键列
            showToggle: true,                   //是否显示详细视图和列表视图的切换按钮
            cardView: false,                    //是否显示详细视图
            detailView: false,                  //是否显示父子表
            //得到查询的参数
            queryParams : function (params) {
                //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
                var temp = {
                    rows: params.limit,                         //页面大小
                    page: (params.offset / params.limit) + 1,  //页码
                    name:$("#searchname").val()
                };
                return temp;
            },
            columns: [{
                field: 'id',
                title: '编号'
            }, {
                field: 'name',
                title: '姓名'
            },
                {
                    field: 'birthday',
                    title: '出生日期'
                },
                {
                    field: 'sayary',
                    title: '工资'
                },
                {
                    field: '',
                    title: '操作',
                    formatter:function (value,row) {

                        var id =row.id;

                        return ' <button onclick=\"edituser('+id+')\" class=\"btn btn-primary\" >编辑</button>'+
                            ' <button onclick=\"deluser('+id+')\" class=\"btn btn-danger\" >删除</button>';
                    }
                    // <button class="btn btn-primary" id="btnedituser">编辑</button>
                }]
        });

        //实现条件查询
        $("#btnsearchuser").click(function () {
            $('#personlisttable ' +
                '+').bootstrapTable("refresh");
        });
    });
</script>
</body>
</html>
