package com.yuanwj.demo.mapper;

import com.yuanwj.demo.model.PhoneImei;
import java.util.List;

public interface PhoneImeiMapper {
    int deleteByPrimaryKey(Long imeiId);

    int insert(PhoneImei record);

    PhoneImei selectByPrimaryKey(Long imeiId);

    List<PhoneImei> selectAll();

    int updateByPrimaryKey(PhoneImei record);
}