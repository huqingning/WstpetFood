package com.wst.wstfoodsever.service;

import com.wst.wstfoodsever.dao.Document;
import com.wst.wstfoodsever.dao.Product;
import com.wst.wstfoodsever.mapper.DocumentMapper;
import com.wst.wstfoodsever.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service("productService")
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
    @ExceptionInspect(name = "测试哈哈哈哈",id = "productService.testAop.Product")
    public boolean testAop(Product product) {
        System.out.println("方法1");
        return true;
    }

    @Override
    @ExceptionInspect(name = "测试哈哈哈哈1",id = "2")
    @Transactional
    public boolean testAop1(Product product) {
        System.out.println("方法2");
        productMapper.insertSelective(product);

        return true;
    }

    @Override
    @ExceptionInspect(name = "测试哈哈哈哈2",id = "3" )
    public boolean testAop2(Product product) {
        System.out.println("方法3");
//        int i = 1/0;
        return true;
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
