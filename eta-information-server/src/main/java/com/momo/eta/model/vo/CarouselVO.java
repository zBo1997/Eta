package com.momo.eta.model.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * <p>
 *  轮播图VO类
 * </p>
 *
 * @author zhubo
 * @since 2023-06-12
 */
@Data
@EqualsAndHashCode
@ToString
public class CarouselVO {


  /**
   * 主键
   */
  private Integer id;

  /**
   * 标题
   */
  private String title;

  /**
   * 介绍文字
   */
  private String introduce;

  /**
   * 按钮
   */
  private String buttonText;

  /**
   * 图片
   */
  private String imgUrl;

}
