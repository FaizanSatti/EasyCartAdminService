package com.org.tmb.productservice.mapper;

import com.org.tmb.productservice.model.Product;
import org.apache.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface Mapper {

//    @Select("select email from admin")
//    String findAdminEmail();
//
//    @Select("select password from admin")
//    String findAdminPassword();

    @Select("select * from product")
    List<Product> getAll();

    @Select("select * from product where type_id = 4")
    List<Product> getProducts();

    @Select("select * from product where type_id = 3")
    List<Product> getCategories();

    @Insert("INSERT INTO product(product_name,parent_id,description,type_id,comment_id,icon_id,promotion_id,total_products,in_stock_products,price) VALUES (#{product_name},#{parent_id},#{description},#{type_id},#{comment_id},#{icon_id},#{promotion_id},#{total_products},#{in_stock_products},#{price})")
    int insertProduct(Product product);

    @Delete("DELETE FROM product WHERE id = #{id}")
    int deleteProduct(Product product);

    @Update("update product set product_name=#{product_name},parent_id=#{parent_id},type_id=#{type_id},price=#{price},description=#{description}, icon_id=#{icon_id}, promotion_id=#{promotion_id}, total_products=#{total_products},in_stock_products=#{in_stock_products} where id=#{id}")
    int updateProduct(Product product);


}
