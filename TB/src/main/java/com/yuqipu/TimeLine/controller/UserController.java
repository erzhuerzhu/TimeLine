package com.yuqipu.TimeLine.controller;

import com.yuqipu.TimeLine.domain.ResultJson;
import com.yuqipu.TimeLine.domain.User;
import com.yuqipu.TimeLine.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

//@Controller 必须配合模板(Spring boot 官用Thymeleaf)来使用，不然有可能回报错
//@RestController是@Responsebody 和@ Controller的结合(以前返回json需要这样使用）
@RestController
public class UserController {

    //    @Autowired对类成员变量，方法以及够着函数进行标注，自动完成装配的工作，消除get，set方法
    @Autowired
    private IUserService UserService;
    //    @GetMapping是简化的缩写，是@RequestMapping(Method= RequestMethod.GET)的缩写，将该注解http get
//    映射到特定的处理方法上

//   @RequestMapping(value="/register",method = RequestMethod.GET)

    //什么时候用post ，什么时候用get？
//    表单提交时默认的Content-Type就是application/x-www-form-urlencoded，当报文的这个首部是这个值时，控制器方法中的参数不用配置就可以接收。
//    但当报文的Content-Type首部不是application/x-www-form-urlencoded时一般要给参数添加@RequestBody注解。
//    比如要提交json数据给后台时，发送的报文Context-Type首部为application/json，这时必须要给参数添加@RequestBody注解，这个参数才可以接收报文主体中的json数据。
    @ResponseBody
    @PostMapping("/register")
    public ResultJson register(@RequestBody Map<String, String> request) {
        User user = new User();

        user.setEmail(request.get("email"));
        user.setPassword(request.get("password"));
        UserService.Register(user);
        return new ResultJson(500);
    }


}
