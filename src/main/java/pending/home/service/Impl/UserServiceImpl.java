package pending.home.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pending.home.dao.UserMapper;
import pending.home.entity.User;
import pending.home.service.UserService;
import pending.interceptors.pageplugin.Page;

import java.util.List;

/**
 * Created by li on 2017/12/28.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(int id) {
        return userMapper.findById(id);
    }

    @Override
    public List<User> findByPage(String name, Page page) {
        return  userMapper.findByPage(name,page);
    }
}