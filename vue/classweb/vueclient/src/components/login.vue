<template>
    <div class="backlogin">
        <div class="login_box">
            <div class="title">后台登陆</div>
            <div>
                <input type="text" class="myinput" placeholder="请输入手机号/邮箱" v-model="username" />
            </div>
            <div>
                <input type="password" class="myinput" placeholder="口令" v-model="password" @keyup.13="login"/>
            </div>
            <div>
                <a href="javascript:;">找回密码</a>
                <input type="checkbox" id="remenberme" /><label for="remenberme">记住我</label>
            </div>
            <button :disabled="disablebtn" class="login" @click="login">{{loginText}}</button>
        </div>
    </div>
</template>
<script>
export default {
    name:'backlogin',
    data(){
        return {
            "username": "admin",
            "password": "123456",
            "loginText": "登录",
            "disablebtn": false,
        }
    },methods:{
        login:function(){
            var _this = this;
            this.disablebtn = true;
            this.loginText='登录中'
            console.log('登录');
            _this.$router.push({path:'/index/'});
            //this.$reqs就访问到了main.js中绑定的axios
            /*this.$reqs.post("/users/login",{
                    username:this.username,
                    password:this.password
            }).then(function(result){ 
                //成功
                console.log(result)
                _this.disablebtn = false;
                _this.loginText = "登录";
                
            }).catch(function (error) {
                //失败
                _this.disablebtn = false;
                _this.loginText = "登录"
            });*/
        }
    }
}
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
    .header{
        height: 60px;
        box-shadow: 0 1px 5px rgba(13,62,73,0.2) ;
    }
    .header img{
        width: 170px;
        margin-top: 12px;
        margin-left: 15px;
        float: left;
    }
    .header span{
        float: left;
        color: #566a80;
        margin: 21px 0 0 20px;
    }
    .login_box{
        width: 320px;
        margin: 50px auto;
    }
    .login_box .myinput{
        width: 100%;
        border: 1px solid #cad3de;
        height: 40px;
        line-height: 40px;
        margin: 5px 0 10px;
        border-radius: 3px;
        padding: 0 10px;
        outline: none;
        box-sizing: border-box;
    }
    .login_box .myinput:focus{
        border: 1px solid #4289dc;
    }
    .login_other{
        overflow: hidden;
    }
    
    .login_other a{
        float: right;
        color: #727f8f;
    }
    .login_other a:hover{
        color: #273444;
    }
    .login_other input, .login_other label{
        float: left;
        color: #727f8f;
    }
    .login_other input{
        margin: 4px 5px 0 0;
    }
    .login{
        box-sizing: border-box;
        border: none 0;
        height: 44px;
        line-height: 44px;
        width: 100%;
        background:#4187db;
        font-size: 16px;
        border-radius: 3px;
        margin-right: 40px;
        transition: all 0.5s ease;
        cursor: pointer;
        outline: none;
        color: #fff;
        margin-top: 15px;
    }
    .login:hover{
        background: #2668b5;
    }
    .login[disabled]{
        opacity: 0.8;
    }
    .login[disabled]:hover{
        background:#4187db;
    }
    .title{
        color: #273444;
        font-size: 1.5em;
        text-align: center;
        margin: 0 0 20px 0;
    }
    
    @media only screen and (max-width: 768px) {
        .login_box{
            width: 280px;
            margin: 50px auto;
        }
    }
</style>