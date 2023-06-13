package com.momo.eta.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *  轮播图
 * </p>
 *
 * @author zhubo
 * @since 2023-06-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("eta_carousel")
public class Carousel implements Serializable {

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
