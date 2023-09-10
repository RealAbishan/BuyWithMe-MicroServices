package com.buywithme.productservice.service;

import com.buywithme.productservice.dto.ProductRequestDto;
import com.buywithme.productservice.dto.responses.ProductResponse;

import java.util.List;

public interface ProductService {
    void createProduct(ProductRequestDto productRequest);

    List<ProductResponse> getAllProducts();
}
