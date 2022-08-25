package cn.itcast.mapper;


import cn.itcast.pojo.Brand;

import java.util.List;

public interface BrandMapper {
    /**
     * 查询 所有
     */
    List<Brand> selectAll();
}
