package com.system.design.seckil.graphql.service;

import com.system.design.seckil.graphql.CommonIndex;
import org.springframework.stereotype.Service;

/**
 * @author 程征波
 * @date 2021/11/13
 */
@Service
public class ProductImpl extends IAbstractService {

    @Override
    public String getIndex() {
        return CommonIndex.PRODUCT_INDEX;
    }
}