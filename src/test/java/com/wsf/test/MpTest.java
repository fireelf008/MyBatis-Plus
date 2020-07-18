package com.wsf.test;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wsf.mp.MpApplication;
import com.wsf.mp.entity.User;
import com.wsf.mp.mapper.UserMapper;
import com.wsf.mp.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {MpApplication.class})
public class MpTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @Test
    public void test() {
//        List<User> userList = this.userMapper.findAll();
//        List<User> userList = this.userMapper.selectList(null);
//        userList.stream().forEach(u -> {
//            System.out.println(u.getUserId());
//        });
        User user = this.userMapper.selectById(1284368940768763906L);
        user.setStationId(12L);
        user.setStationName("测试服务站");
//        this.userService.insert(user);
//        this.userMapper.insert(user);
        user.updateById();
//        this.userMapper.realDelete(user.getId());

//        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
//        userQueryWrapper.like("station_name", "宝安区");
//
//        Page<User> userPage = new Page<>(1, 10);
//
//        userMapper.selectPage(userPage, userQueryWrapper);
//        userPage.getRecords().stream().forEach(u -> {
//            System.out.println(u.getUserId());
//        });
    }
}
