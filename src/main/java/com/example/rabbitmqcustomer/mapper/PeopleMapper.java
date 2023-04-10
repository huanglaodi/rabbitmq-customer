package com.example.rabbitmqcustomer.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.rabbitmqcustomer.model.People;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PeopleMapper extends BaseMapper{

      People selectByName(@Param("name") String name);
}
