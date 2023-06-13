package com.momo.eta.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.momo.eta.entity.Carousel;
import java.util.List;

/**
 * <p>
 *  Service 接口
 * </p>
 *
 * @author zhubo
 * @since 2023-06-12
 */
public interface CarouselService extends IService<Carousel> {

  /**
   * 获取轮播图
   * @return
   */
  List<Carousel> getCarousel();
}
