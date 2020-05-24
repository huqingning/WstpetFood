package com.wst.wstfoodsever.service;

import com.wst.wstfoodsever.dao.Document;
import com.wst.wstfoodsever.dao.Product;
import com.wst.wstfoodsever.mapper.DocumentMapper;
import com.wst.wstfoodsever.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    DocumentMapper documentMapper;

    @Autowired
    ProductMapper productMapper;


    @Override
    public void indexUpdate(Document document) {

        documentMapper.updateByPrimaryKeySelective(document);
    }

    @Override
    public void productAdd(Product product) {
        product.setCreatetime(new Date());
        productMapper.insertSelective(product);
    }

    @Override
    public void productUpdate(Product product) {

        productMapper.updateByPrimaryKeySelective(product);
    }

    @Override
    public List<Document> indexInfo() {

        return documentMapper.selectAll();
    }

    @Override
    public List<Product> productList(Integer typeId) {
        return productMapper.selectByPrTypeId(typeId);
    }
}
