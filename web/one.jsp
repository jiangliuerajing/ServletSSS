<%--
  Created by IntelliJ IDEA.
  User: jing
  Date: 2017/10/9
  Time: 19:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>首页</title>
</head>
<link rel="stylesheet" href="<%=basePath%>/static/css/bootstrap.min.css">
<script src="<%=basePath%>/static/js/jquery-3.2.1.min.js" type="text/javascript"></script>

<body>
<div class="IN">
    <div class="content-IN">
        <section class="content-header">
            <h1>管理员</h1>
        </section>
        <div class="container">
            <div class="row">
                <div class="tool-bar">
                    <span title="添加">
                        <a  id="add">添加</a>
                    </span>
                    <span title="删除" id="delete">
                        <a >删除</a>
                    </span>
                    <span title="更改" id="update">
                        <a >更新</a>
                    </span>
                    <span title="查找" id="query">
                        <a >查找</a>
                    </span>
                </div>
            </div>
            <div class="row">
                <div class="col-xs-12">
                    <div class="box">
                        <div class="box-body">
                            <table class="table table-hover table-bordered table-condensed customer-font-size">
                                <thead>
                                <tr class="info">
                                    <th>#</th>
                                    <th>编号</th>
                                    <th>姓名</th>
                                </tr>
                                </thead>
                                <tbody></tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
<!--else-->
    <script src="<%=basePath%>/static/js/one.js" type="text/javascript"></script>
</div>
</form>
</body>
</html>
