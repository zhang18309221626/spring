<%--
  Created by IntelliJ IDEA.
  User: jack
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8"/>
    <title></title>
    <style>
        div {
            width: 900px;
            margin: 20px auto;
        }

        table {
            width: 900px;
            margin: 10px auto;
            border-collapse: collapse;
        }

        thead th {
            border: 2px solid black;
            background: blue;
            color: white;
            padding: 5px;
        }

        tbody td {
            border: 1px solid black;
            text-align: center;
            padding: 5px;
        }
    </style>
    <script src="/statics/js/vue2.6.10.js"></script>
    <!--网上远程地址-->
    <script src="https://unpkg.com/axios/dist/axios.min.js"></script>

</head>



<body>
<div id="f1">
    <div>
        <input type="hidden" id="sid" v-model="student.sid"/>
        姓名：<input type="text" id="sname" v-model="student.sname"/>
        性别：<input type="number" id="ssex" v-model="student.ssex"/>
        生日：<input type="text" id="sbirthday" v-model="student.sbirthday"/>
        <input type="button" v-if="flag" @click="addStudent()" value="添加" />
        <input type="button" v-if="!flag" @click="update()" value="修改" />
    </div>
    <table>
        <thead>
        <th>编号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>生日</th>
        <th>操作</th>
        </thead>

        <tbody id="nnn">
        <tr v-for="s in studentList">
            <td>{{s.sid}}</td>
            <td>{{s.sname}}</td>
            <td>{{s.ssex}}</td>
            <td>{{s.sbirthday}}</td>
            <td>
                <a href="#" @click="findStudentById(s.sid)">修改|</a>
                <a href="#" @click="deleteStudent(s.sid)">删除</a>
            </td>
        </tr>
        </tbody>
    </table>
</div>
<script src="/statics/js/student.js"></script>
</body>
</html>
