package com.yuqipu.TimeLine.service.impl;

import com.yuqipu.TimeLine.dao.UserMapper;
import com.yuqipu.TimeLine.domain.User;
import com.yuqipu.TimeLine.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("UserService")

public class UserServiceImpl  implements IUserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public int Register(User user) {
        user.setUserid(GenerateUserUniqueID.generateUserUniqueID());
        int x=userMapper.insertUser(user);
        return x;
    }
}
