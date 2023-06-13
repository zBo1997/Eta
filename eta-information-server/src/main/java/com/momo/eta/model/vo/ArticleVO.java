package com.momo.eta.model.vo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * <p>
 *  首页文章实体
 * </p>
 *
 * @author zhubo
 * @since 2023-06-12
 */
@Data
public class ArticleVO implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 完整标题
     */
    private String fullTitle;

    /**
     * 副标题
     */
    private String subhead;

    /**
     * 简介
     */
    private String intro;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 作者
     */
    private String author;

    /**
     * 来源
     */
    private String copyBy;

    /**
     * 转向连接
     */
    private String httpUrl;

    /**
     * 关健字
     */
    private String keyword;

    /**
     * 点击数
     */
    private Integer hits;

    /**
     * 评论数
     */
    private Integer postNum;

    /**
     * 喜欢数
     */
    private Integer loveNum;

    /**
     * 是否评论
     */
    private Integer commentSwitch;

    /**
     * 是否顶制
     */
    private Integer topSwitch;

    /**
     * 是否推荐
     */
    private Integer eliteSwitch;

    /**
     * 是否删除
     */
    private Integer deleteFlag;

    /**
     * 最后评论时间
     */
    private Date lastPost;

    /**
     * 自定义备注
     */
    private String ownerRemark;

    /**
     * 缩略图地址
     */
    private String thumb;

    /**
     * 生成状态
     */
    private String status;

    /**
     * 文章状态身份
     */
    private Integer articleStatus;

    /**
     * 创建时间
     */
    private Date createDateTime;

    /**
     * 更新时间
     */
    private Date updateDateTime;

    /**
     * 录入者
     */
    private String createBy;

}