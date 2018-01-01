package pending.home.service;

import pending.home.entity.User;
import pending.interceptors.pageplugin.Page;

import java.util.List;

/**
 * Created by li on 2017/12/28.
 */
public interface UserService {
    public User findById(int id);

    public List<User> findByPage(String name, Page page);
}
