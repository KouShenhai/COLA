package com.alibaba.craftsman.gatewayimpl.database;

import com.alibaba.craftsman.gatewayimpl.database.dataobject.UserProfileDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * UserProfileMapper
 *
 * @author Frank Zhang
 * @date 2019-02-27 5:03 PM
 */
@Mapper
@Repository
public interface UserProfileMapper extends BaseMapper<UserProfileDO> {
    int create(UserProfileDO userProfileDO);

    int update(UserProfileDO userProfileDO);

    int delete(@Param("userId") String userId);

    UserProfileDO getByUserId(@Param("userId") String userId);

    List<UserProfileDO> listByDep(@Param("dep") String dep);
}
