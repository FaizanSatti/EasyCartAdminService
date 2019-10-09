package com.org.tmb.productservice.resource;

import com.org.tmb.productservice.mapper.Mapper;
import com.org.tmb.productservice.model.Admin;
import com.org.tmb.productservice.model.Product;
import com.org.tmb.productservice.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MyController {
    @Resource
    private Mapper userMapper;

    @GetMapping("/getAll")
    public List<Product> getAll() {
        return userMapper.getAll();
    }

    @GetMapping("/getProducts")
    public List<Product> getProducts() {
        return userMapper.getProducts();
    }

    @GetMapping("/getCategories")
    public List<Product> getCategories() {
        return userMapper.getCategories();
    }

    @RequestMapping(value = "/insertProduct", method = RequestMethod.POST)
    public int insertProduct(@RequestBody Product product) {
        return userMapper.insertProduct(product);
    }

    @RequestMapping(value = "/updateProduct", method = RequestMethod.PUT)
    public int updateProduct(@RequestBody Product product) {
        return userMapper.updateProduct(product);
    }

    @RequestMapping(value = "/deleteProduct", method = RequestMethod.DELETE)
    public int deleteProduct(@RequestBody Product product) {
        return userMapper.deleteProduct(product);
    }

}


