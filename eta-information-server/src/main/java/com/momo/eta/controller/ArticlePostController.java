package com.momo.eta.controller;

import cn.hutool.core.bean.BeanUtil;
import com.momo.eta.model.vo.ArticleVO;
import com.momo.eta.service.ArticleService;
import com.momo.theta.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * ArticlePostController
 * </p>
 *
 * @author zhubo
 * @since 2023-06-16
 */
@Slf4j
@RestController
@RequestMapping("/article")
public class ArticlePostController {

  private ArticleService articleService;

  /**
   * 这里默认按照Fresh来获取文章
   * @param articleService 文章服务类
   */
  @Autowired
  public void setArticleService(@Qualifier("Fresh") ArticleService articleService) {
    this.articleService = articleService;
  }

  /**
   * 首页轮播图
   *
   * @return 首页轮播图查询
   */
  @GetMapping("getArticleById/{articleId}")
  public Result<ArticleVO> getCarousel(@PathVariable("articleId")String articleId) {
    log.info("文章详情获取编号：{}", articleId);
    var article = articleService.getById(articleId);
    var articleVO = BeanUtil.copyProperties(article, ArticleVO.class);
    return Result.success(articleVO);
  }

}
