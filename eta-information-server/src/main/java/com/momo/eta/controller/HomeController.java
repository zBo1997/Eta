package com.momo.eta.controller;

import cn.hutool.core.bean.BeanUtil;
import com.momo.eta.handler.ArticleHandler;
import com.momo.eta.model.vo.ArticleVO;
import com.momo.eta.model.vo.CarouselVO;
import com.momo.eta.service.CarouselService;
import com.momo.theta.Result;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * HomeController
 * </p>
 *
 * @author zhubo
 * @since 2023-06-12
 */
@Slf4j
@RestController
@RequestMapping("/homePage")
public class HomeController {

  private CarouselService carouselService;

  private ArticleHandler articleHandler;


  @Autowired
  public void setCarouselService(CarouselService carouselService) {
    this.carouselService = carouselService;
  }

  @Autowired
  public void setArticleService(ArticleHandler articleHandler) {
    this.articleHandler = articleHandler;
  }

  /**
   * 首页轮播图
   *
   * @return 首页轮播图查询
   */
  @GetMapping("getCarousel")
  public Result<List<CarouselVO>> getCarousel() {
    log.info("首页轮播图查询");
    var disCarouselList = carouselService.getCarousel();
    var carouselVOList = BeanUtil.copyToList(disCarouselList, CarouselVO.class);
    return Result.success(carouselVOList);
  }

  /**
   * 获取首页文章
   *
   * @param queryType 请求体
   * @return 首页文章查询查询类型
   */
  @GetMapping("getArticle/{queryType}")
  public Result<List<ArticleVO>> getArticle(@PathVariable("queryType") String queryType) {
    log.info("首页文章查询查询类型:{}", queryType);
    var articleBean = articleHandler.getArticleBean(queryType);
    var execute = articleHandler.execute(articleBean);
    return Result.success(BeanUtil.copyToList(execute, ArticleVO.class));
  }

  /**
   * 获取首页文章数量
   *
   * @return 获取首页文章数量
   */
  @GetMapping("getArticleCount")
  public Result<String> getArticle() {
    log.info("获取首页文章数量");
    var articleCount = articleHandler.getArticleCount();
    return Result.success(articleCount);
  }
}
