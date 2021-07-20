new Vue({
        //vue绑定的jsp区域
        el: "#f1",
        //参数
        data: {
            studentList:[],
            student:{sid:"",sname:"",ssex:"",sbirthday:""},
            flag:true
        },

        //方法
        methods:{
            //查询的方法
            findAll:function () {
                var _this = this;
                axios.get("/student/getAll").then(function (value) {
                    _this.studentList = value.data;
                }).catch(function (reason) {  });
            },
            //添加的方法
            addStudent:function () {
                var _this = this;
                axios.post("/student/getStudent",{
                    sname:_this.student.sname,
                    ssex:_this.student.ssex,
                    sbirthday:_this.student.sbirthday
                }).then(function (value) {
                    _this.student.sname="";
                    _this.student.ssex="";
                    _this.student.sbirthday="";
                    _this.findAll();
                }).catch(function (reason) {  })
            },

            //修改的方法
            findStudentById:function (id) {
                var _this = this;
                _this.flag = false;
                axios.get("/student/selectStudent?id="+id).then(function (value) {
                    _this.student.sid = value.data.sid;
                    _this.student.sname = value.data.sname;
                    _this.student.ssex = value.data.ssex;
                    _this.student.sbirthday = value.data.sbirthday;
                }).catch(function (reason) {  })
            },
            update:function () {
                var _this = this;
                axios.post("/student/updateStudent",this.student).then(function (value) {
                    _this.student.sname="";
                    _this.student.ssex="";
                    _this.student.sbirthday="";
                    _this.flag = true;
                    _this.findAll();
                }).catch(function (reason) {  })
            },

            //删除的方法
            deleteStudent:function (id) {
                var _this = this;
                //确认是否删除
                var f =  window.confirm("你确定要删除此条数据吗？");
                if(f){
                    axios.get("/student/deleteStudent?id="+id).then(function (value) {
                        _this.findAll();
                    }).catch(function (reason) {  })
                }

            }

        },
        //类似于构造方法
        created:function () {
            this.findAll()
        }
});