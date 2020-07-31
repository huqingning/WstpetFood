package com.wst.wstfoodsever.service;

import com.wst.wstfoodsever.dao.Document;
import com.wst.wstfoodsever.dao.Product;

import java.util.List;

public interface ProductService {

    void indexUpdate(Document document);

    void productAdd(Product product);

    void productUpdate(Product product);

    boolean testAop(Product product);

    boolean testAop1(Product product);

    boolean testAop2(Product product);

    List<Document> indexInfo();

    List<Product> productList(Integer typeId);

}
