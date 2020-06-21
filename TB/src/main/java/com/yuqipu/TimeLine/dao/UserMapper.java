package com.yuqipu.TimeLine.dao;

import com.yuqipu.TimeLine.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;


//@Mapper可以把这个dao交给Spring管理,可以不用写xml文件
//@MapperScan可以指定要扫描的Mapper类的包的路径
@Mapper
public interface UserMapper {
//    如果插入失败了怎么操作，在其间的任何一个阶段都有可能操作失误，如何防止或是恢复？
    @Insert("insert into user (userid,email,password) value (#{userid},#{email},#{password})")
    public int  insertUser(User user);
}
