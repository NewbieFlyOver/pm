package com.pm.dsis.fee.service;

import com.pm.dsis.fee.dto.PmFee;

import java.util.List;

/**
 * Created by admin on 2018/3/25.
 */
public interface PmFeeService {

    /**
     * 添加下一年物业费
     * @return
     */
    void insert();

    /**
     * 添加当年剩下月份的物业费
     * @return
     */
    void insertRePmFee(String buildFullRoom);

    /**
     * 条件查询
     * @param pmFee
     * @return
     */
    List<PmFee> selectPmFee(PmFee pmFee);

    /**
     * 根据userId查询
     * @param pmFee
     * @return
     */
    List<PmFee> selectPmFeeById(PmFee pmFee);

    /**
     * 更新是否缴费状态
     * @param pmFee
     * @return
     */
    void updatePmFeeStatu(List<PmFee> pmFee);
}
