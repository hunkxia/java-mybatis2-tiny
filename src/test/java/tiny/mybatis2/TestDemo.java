package tiny.mybatis2;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tiny.mybatis2.mapper.IUserMapper;
import tiny.mybatis2.models.User;
import tiny.mybatis2.utils.SqlSessionUtils;

import java.util.List;

public class TestDemo {
    @Test
    public void testFindAll() {
        SqlSession session = SqlSessionUtils.getSqlSession();
        IUserMapper userMapper = session.getMapper(IUserMapper.class);
        //测试数据
        List<User> users = userMapper.findAll();
        for(User item: users){
            System.out.println(item.toString());
        }
        session.close();
    }

    @Test
    public void testFindOne() {
        SqlSession session = SqlSessionUtils.getSqlSession();
        IUserMapper userMapper = session.getMapper(IUserMapper.class);
        User user = userMapper.findOne("10010680");
        if(user != null){
            System.out.println(user);
        }else{
            System.out.println("result is empty");
        }
    }
}
