package com.momo.eta.handler;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.momo.eta.entity.Article;
import com.momo.eta.enums.ArticleStatus;
import com.momo.eta.service.ArticleService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  抽象文章处理器
 * </p>
 *
 * @author zhubo
 * @since 2023-06-12
 */
@Component
public class ArticleHandler {

  @Resource
  private Map<String,ArticleService> articleServiceMap;


  /**
   * 根据类型获取对应类型的Bean
   * @param nameType 名字类型
   * @return articleService 服务
   */
  public ArticleService getArticleBean(String nameType){
    return articleServiceMap.get(nameType);
  }

  /**
   * 获取具体问获取方法
   * @param articleService 文章服务类
   * @return 返回文章集合
   */
  public List<Article> execute(ArticleService articleService){
    return articleService.getArticle();
  }

  /**
   * 获取所有的文章数量
   * @return 获取所有的文章数量
   */
  @Cacheable("articleCount")
  public String getArticleCount(){
    var queryWrapper = new LambdaQueryWrapper<Article>();
    queryWrapper.eq(Article::getArticleStatus, ArticleStatus.SHELF.getCode());
    long popular = articleServiceMap.get("Popular").count(queryWrapper);
    return String.valueOf(popular);
  }

}