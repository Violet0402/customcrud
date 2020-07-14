package com.sumaojin.dao;

import com.sumaojin.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    /**
     * 查询所有
     * @return
     */
    @Select("select * from user")
    List<User> findAll();

    @Select("select * from user where mobile = #{mobile} and password = #{password}")
    User login(@Param("mobile") String mobile, @Param("password") String password);

    @Delete("delete from user where id = #{id}")
    void deleteUser(String id);

    @Select("select * from user where id = #{id}")
    User findById(String id);

    @Update("update user set mobile = #{mobile}, password = #{password}, sex = #{sex}, birthdate = #{birthdate}, address = #{address}, email = #{email}, state = #{state}, create_time = #{create_time}, update_time = #{update_time} where id = #{id}")
    void update(User user);

    @Insert("insert into user values(#{id}, #{mobile}, #{password}, #{sex}, #{birthdate}, #{address}, #{email}, #{state}, #{create_time}, #{update_time})")
    void save(User user);
}
