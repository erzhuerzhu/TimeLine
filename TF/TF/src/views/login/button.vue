<template>
  <el-button round v-on:click="btnClick">{{msg}} </el-button>
</template>
<script>
export default {
  name: "button",
  props: {
    msg: {
      defalut: "sign in"
    }
  },
  methods: {
    btnClick: function() {
      // alert(this.msg);
      this.$emit("btnClick");
    }
  }
};
</script>
<style scoped>
.el-button {
  display: table;
  margin: 5% auto;
  font-size: 1rem;
}
</style>
