package life.richard.community.mapper;

import life.richard.community.model.User;
import life.richard.community.model.UserExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbg.generated Tue May 12 16:09:29 CST 2020
     */
    long countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbg.generated Tue May 12 16:09:29 CST 2020
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbg.generated Tue May 12 16:09:29 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbg.generated Tue May 12 16:09:29 CST 2020
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbg.generated Tue May 12 16:09:29 CST 2020
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbg.generated Tue May 12 16:09:29 CST 2020
     */
    List<User> selectByExampleWithRowbounds(UserExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbg.generated Tue May 12 16:09:29 CST 2020
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbg.generated Tue May 12 16:09:29 CST 2020
     */
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbg.generated Tue May 12 16:09:29 CST 2020
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbg.generated Tue May 12 16:09:29 CST 2020
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbg.generated Tue May 12 16:09:29 CST 2020
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER
     *
     * @mbg.generated Tue May 12 16:09:29 CST 2020
     */
    int updateByPrimaryKey(User record);
}