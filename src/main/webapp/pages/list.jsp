<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="../shared/global.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>AdminLTE 2 | Blank Page</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <%@ include file="../shared/importCss.jsp" %>

</head>
<body class="hold-transition skin-blue sidebar-mini">
<!-- Site wrapper -->
<!-- Content Wrapper. Contains page content -->
<!-- Content Header (Page header) -->
<section class="content-header">
    <h1>
        系统首页
        <small>统计信息</small>
    </h1>
</section>

<!-- Main content -->
<section class="content">
    <!-- Default box -->
    <div class="box">
        <div class="box-header with-border">
            <h3 class="box-title">操作</h3>

            <div class="box-tools pull-right">
                <button type="button" class="btn btn-box-tool" data-widget="collapse" data-toggle="tooltip"
                        title="Collapse">
                    <i class="fa fa-minus"></i></button>
                <button type="button" class="btn btn-box-tool" data-widget="remove" data-toggle="tooltip"
                        title="Remove">
                    <i class="fa fa-times"></i></button>
            </div>
        </div>
        <div class="box-body">
            <form class="layui-form" action="">
                <div class="layui-inline">
                    <div class="layui-input-inline">
                        <input type="text" value="" placeholder="请输入关键字" class="layui-input search_input">
                    </div>
                    <div class="layui-input-inline">
                        <input type="text" value="" placeholder="请输入关键字" class="layui-input search_input">
                    </div>
                    <div class="layui-input-inline">
                        <input type="text" name="number" lay-verify="required|number" autocomplete="off"
                               class="layui-input">
                    </div>
                    <div class="layui-input-inline">
                        <select name="city" lay-verify="required">
                            <option value=""></option>
                            <option value="0">北京</option>
                            <option value="1">上海</option>
                            <option value="2">广州</option>
                            <option value="3">深圳</option>
                            <option value="4">杭州</option>
                        </select>
                    </div>
                    <div class="layui-input-inline">
                        <select name="interest" lay-filter="aihao" lay-search lay-write>
                            <option value=""></option>
                            <option value="0">写作</option>
                            <option value="1">阅读</option>
                            <option value="2">游戏</option>
                            <option value="3">音乐</option>
                            <option value="4">旅行</option>
                            <option value="5">读书</option>
                        </select>
                    </div>
                    <a class="layui-btn layui-btn-normal search_btn">查询</a>
                </div>
                <div class="layui-inline">
                    <a class="layui-btn layui-btn-normal newsAdd_btn">添加文章</a>
                </div>
                <div class="layui-inline">
                    <a class="layui-btn recommend" style="background-color:#5FB878">推荐文章</a>
                </div>
                <div class="layui-inline">
                    <a class="layui-btn audit_btn">审核文章</a>
                </div>
                <div class="layui-inline">
                    <a class="layui-btn layui-btn-danger batchDel">批量删除</a>
                </div>
                <%--<div class="layui-btn-group">
                    <button class="layui-btn">增加</button>
                    <button class="layui-btn">编辑</button>
                    <button class="layui-btn">删除</button>
                    <button class="layui-btn">增加</button>
                    <button class="layui-btn">编辑</button>
                    <button class="layui-btn">删除</button>
                    <button class="layui-btn">增加</button>
                    <button class="layui-btn">编辑</button>
                    <button class="layui-btn">删除</button>
                </div>--%>
            </form>
        </div>
        <!-- /.box-footer-->
    </div>
    <!-- /.box -->

    <div class="box">
        <div class="box-header with-border">
            <h3 class="box-title">用户列表</h3>
            <div class="pull-right box-tools">
                <!-- button with a dropdown -->
                <div class="btn-group">
                    <button type="button" class="btn btn-sm dropdown-toggle"
                            data-toggle="dropdown">
                        <i class="fa fa-bars"></i></button>
                    <ul class="dropdown-menu pull-right" role="menu">
                        <li><a href="#">Add new event</a></li>
                        <li><a href="#">Clear events</a></li>
                        <li class="divider"></li>
                        <li><a href="#">View calendar</a></li>
                    </ul>
                </div>
                <button type="button" class="btn btn-sm" data-widget="collapse"><i
                        class="fa fa-minus"></i>
                </button>
                <button type="button" class="btn btn-sm" data-widget="remove"><i
                        class="fa fa-times"></i>
                </button>
            </div>
        </div>
        <!-- /.box-header -->
        <div class="box-body">
            sdasfg
        </div>
        <div class="box-footer">
            <div class="layui-tab layui-tab-brief" lay-filter="docDemoTabBrief">
                <ul class="layui-tab-title">
                    <li class="layui-this">所有</li>
                    <li>已同步</li>
                    <li>未同步</li>
                    <li>已收款</li>
                    <li>未收款</li>
                </ul>
                <div class="layui-tab-content no-padding">
                    <table class="layui-table"
                           lay-data="{url:'${staticPath }/commons/json/demo2.json?v=2', page: true, limit: 6, limits:[6]}">
                        <thead>
                        <tr>
                            <th lay-data="{field:'username', width:150}" rowspan="2">联系人</th>
                            <th lay-data="{align:'center'}" colspan="3">地址</th>
                            <th lay-data="{field:'amount', width:120}" rowspan="2">金额</th>
                        </tr>
                        <tr>
                            <th lay-data="{field:'province', width:120}">省</th>
                            <th lay-data="{field:'city', width:120}">市</th>
                            <th lay-data="{field:'zone', width:200}">区</th>
                        </tr>
                        </thead>
                    </table>
                </div>
            </div>
        </div>
    </div>

</section>


<script src="${staticPath}/layui/layui.js"></script>
<script>
    layui.config({
        dir: '${staticPath }/layui/' //layui.js 所在路径（注意，如果是script单独引入layui.js，无需设定该参数。），一般情况下可以无视
        , version: false //一般用于更新模块缓存，默认不开启。设为true即让浏览器不缓存。也可以设为一个固定的值，如：201610
        , debug: false //用于开启调试模式，默认false，如果设为true，则JS模块的节点会保留在页面
        , base: '${staticPath }/commons/js/' //设定扩展的Layui模块的所在目录，一般用于外部模块扩展
    });
    layui.use(['form', 'element', 'laydate', 'table'], function () {
        var form = layui.form,
            element = layui.element,
            table = layui.table;
    })
</script>
</body>
</html>
