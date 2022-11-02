package tiny.mybatis2.mapper;

import tiny.mybatis2.models.User;

import java.util.List;

public interface IUserMapper {
    /**
     * 获取所有用户
     * @return
     */
    List<User> findAll();

    /**
     * 获取某个用户
     * @param uid
     * @return
     */
    User findOne(String uid);
}
