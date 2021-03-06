package com.devSam.springMvcThymleaf.Service;

import com.devSam.springMvcThymleaf.Entity.Product;
import com.devSam.springMvcThymleaf.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl  {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> ListAll(){
        return productRepository.findAll();
    }
    public void save(Product product){
        productRepository.save(product);
    }
    public Product get(Long id){
       return productRepository.findById(id).get();
    }
    public void delete(Long id){
        productRepository.deleteById(id);
    }
}
