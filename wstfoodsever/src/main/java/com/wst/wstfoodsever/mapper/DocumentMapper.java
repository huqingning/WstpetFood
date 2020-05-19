package com.wst.wstfoodsever.mapper;

import com.wst.wstfoodsever.dao.Document;

public interface DocumentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Document record);

    int insertSelective(Document record);

    Document selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Document record);

    int updateByPrimaryKeyWithBLOBs(Document record);

    int updateByPrimaryKey(Document record);
}