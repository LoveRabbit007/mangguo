package com.mangguo.goods.feign;

import com.mangguo.entity.Result;
import com.mangguo.goods.pojo.Category;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "goods")
public interface CategoryFeign {

    @GetMapping("/category/{id}")
    public Result<Category> findById(@PathVariable("id") Integer id);
}
