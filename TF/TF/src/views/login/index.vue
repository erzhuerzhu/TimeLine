<template>
  <div>
    <div class="biggestdiv">
      <!-- <el-image :src="url"></el-image> -->
      <el-image v-bind:src="url"></el-image>
      <!-- 这里就是又以当前文件按为根路径开始路由了 -->
      <router-view></router-view>
      <!-- <router-link to="indexpath"></router-link> -->
    </div>
  </div>
</template>
<script>
export default {
  name: "index",
  data() {
    return {
      //   url:
      // "https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg"
      // 这里就是加载图片，下面是本地加载，上面是用链接
      // url: require("@/assets/login/May.jpg"),
      url: "",
      indexpath: "/index/login"
    };
  },
  created() {
    this.ChoosePicture();
  },
  methods: {
    ChoosePicture() {
      let date = new Date();
      let month = date.getMonth();
      // month = 0;
      this.url = "../static/login/" + month + ".jpg";
      // console.log(this.url);
    }
  }
};
</script>
<style scoped>
.el-image {
  width: 45%;
  height: auto;
  margin-left: -50px;
  margin-top: -8px;
  float: left;
}
.biggestdiv {
  min-width: 1500px;
}
.createaccounttext,
.tosignin {
  text-align: center;
  border-top: 0.5px solid #dcdfe6;
  padding-top: 1%;
}
.fristpassword {
  margin-bottom: 5%;
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
  margin: 0 10%;
  /* transform: translate(0px, 120px); */
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
  transform: translateY(20%);
}
.labenemail,
.labelpassword {
  margin-top: 5%;
}
.el-link {
  text-align: center;
}
</style>
