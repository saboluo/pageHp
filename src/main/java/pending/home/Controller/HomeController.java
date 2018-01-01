package pending.home.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pending.home.entity.User;
import pending.home.service.UserService;
import pending.interceptors.pageplugin.Page;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by li on 2017/12/27.
 */
@Controller
public class HomeController {

    @Autowired
    private DataSource druidDataSource;

    @Autowired
    UserService userService;

    @RequestMapping("/")
    @ResponseBody
    public String home(){
        return "hello world!";
    }

    @RequestMapping("/user")
    @ResponseBody
    public String getUser(Integer id){
        System.out.println( druidDataSource );
        if( id == null ){
            return "未传入id";
        }
        return userService.findById(id).toString();
    }

    @RequestMapping("/findByPage")
    @ResponseBody
    public String getUsers(Integer pageNo){
        Page page = new Page();
        page.setPageNo(pageNo);
        List<User> userList = userService.findByPage("ww",page);
        return  userList.toString();

    }
}
