package com.momo.eta.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.momo.eta.entity.Carousel;
import com.momo.eta.mapper.CarouselMapper;
import com.momo.eta.service.CarouselService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * <p>
 * CarouselService 接口
 * </p>
 *
 * @author zhubo
 * @since 2023-06-12
 */
@Service
@Slf4j
public class CarouselServiceImpl extends ServiceImpl<CarouselMapper, Carousel> implements
    CarouselService {


  @Override
  @Cacheable(value = "carousel")
  public List<Carousel> getCarousel() {
    var queryWrapper = new LambdaQueryWrapper<Carousel>();
    List<Carousel> list = this.list(queryWrapper);
    log.info("首页轮播图数据：{}", JSONObject.toJSONString(list));
    return list;
  }

}
