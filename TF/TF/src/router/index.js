import Vue from "vue";
import Router from "vue-router";
import login from "../views/login/login.vue";
import registration from "../views/login/registration.vue";

Vue.use(Router);

export default new Router({
  routes: [
    {
      path: "/",
      name: "login",
      component: login
    },
    {
      path: "/registration",
      name: "registration",
      component: registration
    }
  ]
});
