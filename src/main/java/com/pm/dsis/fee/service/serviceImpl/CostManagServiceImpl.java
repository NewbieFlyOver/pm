package com.pm.dsis.fee.service.serviceImpl;

import com.pm.dsis.cm.dto.WaterAmount;
import com.pm.dsis.cm.mapper.WaterAmountMapper;
import com.pm.dsis.fee.dto.WaterUnitPrice;
import com.pm.dsis.fee.mapper.WaterUnitPriceMapper;
import com.pm.dsis.fee.service.CostManagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2018/3/25.
 */
@Service
public class CostManagServiceImpl implements CostManagService {
    @Autowired
    private WaterUnitPriceMapper waterUnitPriceMapper;

    @Autowired
    private WaterAmountMapper waterAmountMapper;
//TODO:不在此处做计算度数分阶梯计价，直接取
    public List<WaterAmount> selectAllWaterFee(){

        //获取水价阶梯
        List<WaterUnitPrice> waterUnitPrices = waterUnitPriceMapper.selectAllWaterPrice();
        return null;

    }


}
