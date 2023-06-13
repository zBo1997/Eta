package com.momo.eta.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.momo.eta.entity.Article;
import java.util.List;

/**
* @author zhubo
* @description 针对表【eta_article】的数据库操作Service
* @createDate 2023-06-12 16:49:12
*/
public interface ArticleService extends IService<Article> {

  /**
   * 首页文章获取
   * @return 文章集合
   */
  List<Article> getArticle();

}
