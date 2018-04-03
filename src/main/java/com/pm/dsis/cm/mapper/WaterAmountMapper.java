package com.pm.dsis.cm.mapper;


import java.util.List;

import com.pm.dsis.cm.dto.WaterAmount;
import org.apache.ibatis.annotations.Param;

public interface WaterAmountMapper {

    int insertWaterAmount(WaterAmount waterAmount);

    int updateByWaterAId(WaterAmount waterAmount);

    int deleteByWaterAId(Long waId);

    List<WaterAmount> selectWaterAByMonth(int month);

    List<WaterAmount> selectAllWaterA();

    /**
     * 根据房号和月份查询
     * @return
     */
    WaterAmount selectByRoomMonth(@Param("waMonth") int waMonth, @Param("buildingFullRoom") String buildingFullRoom);


    int insertSelective(WaterAmount record);
    WaterAmount selectByPrimaryKey(Long waId);
    int updateByPrimaryKeySelective(WaterAmount record);

}