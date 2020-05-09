<template>
  <div class="biggestdiv">
    <el-image :src="url"></el-image>
    <div class="login">
      <el-container>
        <div class="websitenname">
          <span>TimeLine</span>
          <!-- <el-header>TimeLine</el-header> -->
        </div>
        <el-main>
          <div class="emailinput">
            <div class="labenemail">
              <el-tag type="info">email</el-tag>
            </div>
            <el-input
              placeholder="请输入邮箱"
              suffix-icon="el-icon-message"
              v-model="emailinput"
            >
            </el-input>
          </div>
          <div class="passwordinput">
            <div class="labelpassword">
              <div class="passwordtext">
                <el-tag type="info">password</el-tag>
              </div>
              <div class="forgetpaswordtext">
                <el-link type="primary">forget password?</el-link>
              </div>
            </div>
            <el-input
              placeholder="请输入密码"
              suffix-icon="el-icon-lock"
              v-model="passworfinput"
              show-password
            >
            </el-input>
          </div>
          <div class="chooseeare">
            <el-switch
              v-model="value"
              active-color="#13ce66"
              inactive-color="#ccc4cc"
              active-text="remember me"
            >
            </el-switch>
            <el-button round>sign in </el-button>
            <div class="createaccounttext">
              <el-link type="primary"
                >dont't have a account? create one here</el-link
              >
            </div>
          </div>
        </el-main>
      </el-container>
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      //   url:
      // "https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg"
      // 这里就是加载图片，下面是本地加载，上面是用链接
      url: require("@/assets/login/May.jpg"),
      emailinput: "",
      passworfinput: "",
      value: true
    };
  }
};
</script>
<style scoped>
.createaccounttext{
  text-align:right;
  border-top:0.5px solid #dcdfe6;
  padding-top:1%;
}
.el-button {
  display: table;
  margin: 5% auto ;
  font-size: 1rem;
}
.el-switch {
  display: block;
  margin-top: 5%;
}
.passwordtext {
  float: left;
  text-align: left;
}
.forgetpaswordtext {
  float: right;
  text-align: right;
  margin-top: 3%;
}
.login {
  float: right;
  width: 55%;
}
.biggestdiv {
  min-width: 1500px;
}
.websitenname {
  text-align: center;
  font-size: 2.5rem;
  font-family: "Courier New", Courier, monospace;
  margin-top: 7%;
}
.el-header {
  background-color: #f8f8f8;
  color: #333;
  text-align: center;
  line-height: 60px;
  /* width: 45%; */
  display: table;
  margin: 0 auto;
  padding: 0 151px;
  transform: translate(0px, 120px);
}
.el-tag {
  background-color: #ffffff;
  font-size: 1rem;
  color: #ccc4cc;
  border-style: none;
  padding: 0px;
}
.el-main {
  background-color: #ffffff;
  color: #333;
  text-align: left;
  /* line-height: 160px; */
  display: table;
  margin: 0 auto;
  /* transform: translate(0px, 120px); */
}
.el-image {
  width: 45%;
  height: auto;
  margin-left: -50px;
  margin-top: -8px;
  float: left;
}
.el-container {
  border: 1px;
  /* border-color: ; */
  /* margin-bottom: 40px; */
  border-radius: 2px;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.12), 0 0 6px rgba(0, 0, 0, 0.04);
  /* display: table; */
  margin: 0 auto;
  width: 45%;
  flex-direction: column;
  transform: translateY(30%);
}
.labenemail,
.labelpassword {
  margin-top: 5%;
}
</style>
