package com.pm.dsis.em.mapper;

import com.pm.dsis.em.dto.HousekeeperBuildingInfo;
import java.util.List;

import com.pm.dsis.mm.dto.UserInfo;
import org.apache.ibatis.annotations.Param;

public interface HousekeeperBuildingInfoMapper {

    /**
     * 添加员工信息
     * @param housekeeperBuildingInfo
     * @return
     */
    int insertHouseInfo(HousekeeperBuildingInfo housekeeperBuildingInfo);

    /**
     * 更新员工信息
     * @param housekeeperBuildingInfo
     * @return
     */
    int updateHouseInfoById(HousekeeperBuildingInfo housekeeperBuildingInfo);

    /**
     * 根据id查询员工信息
     * @param hbId
     * @return
     */
    HousekeeperBuildingInfo selectHouseInfoById(Long hbId);


    /**
     * 根据条件查询所有的员工信息
     * @param hb
     * @return
     */
    List<HousekeeperBuildingInfo> selectHbByCondtion(HousekeeperBuildingInfo hb);

    /**
     * 还回最大的员工编号
     * @return
     */
    long selectBigNumber ();

    /**
     * 查询登录信息
     * @param housekeeperBuildingInfo
     * @return
     */
    HousekeeperBuildingInfo selectLoginInfo(HousekeeperBuildingInfo housekeeperBuildingInfo);


    /**
     * 查询账号是否存在
     * @param hbAccount
     * @return
     */
    HousekeeperBuildingInfo selectAccount(String hbAccount);

    /**
     * 重置密码
     * @param userId
     * @param oldPwd
     * @param newPwd
     * @return
     */
    int resetPwd(@Param("userId") Long userId, @Param("oldPwd") String oldPwd, @Param("newPwd") String newPwd);

    /**
     * 查询登录信息通过电话
     * @return
     */
    HousekeeperBuildingInfo selectAccountByPhone(@Param("phone") String phone, @Param("account") String account);

    /**
     * 根据登录名更改密码
     * @param account
     * @return
     */
    int updateByAccount(@Param("account") String account, @Param("newPwd") String newPwd);






    int deleteByPrimaryKey(Long hbId);

    int insert(HousekeeperBuildingInfo record);

    int insertSelective(HousekeeperBuildingInfo record);

    HousekeeperBuildingInfo selectByPrimaryKey(Long hbId);

    int updateByPrimaryKeySelective(HousekeeperBuildingInfo record);

    int updateByPrimaryKey(HousekeeperBuildingInfo record);
}