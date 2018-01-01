package pending.home.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import pending.home.entity.User;
import pending.interceptors.pageplugin.Page;

import java.util.List;

/**
 * Created by li on 2017/12/28.
 */
@Mapper
public interface UserMapper {
    public User findById(int id);
    public List<User> findByPage(@Param("name") String name, Page page);
}
