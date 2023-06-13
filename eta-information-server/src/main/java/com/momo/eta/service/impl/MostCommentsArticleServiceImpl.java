package com.momo.eta.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.momo.eta.entity.Article;
import com.momo.eta.mapper.ArticleMapper;
import com.momo.eta.service.ArticleService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
* @author zhubo
* @description 最多评论文章服务类
* @createDate 2023-06-12 16:49:12
*/
@Service("Comments")
public class MostCommentsArticleServiceImpl extends ServiceImpl<ArticleMapper, Article>
    implements ArticleService {

  @Override
  public List<Article> getArticle() {
    var queryWrapper = new LambdaQueryWrapper<Article>();
    queryWrapper.orderByDesc(Article::getPostNum);
    queryWrapper.last("limit 6");
    List<Article> list = this.list(queryWrapper);
    return list;
  }
}




