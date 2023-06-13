package com.momo.eta.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName eta_article
 */
@TableName(value ="eta_article")
@Data
public class Article implements Serializable {
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
     * 文章状态
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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Article other = (Article) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getFullTitle() == null ? other.getFullTitle() == null : this.getFullTitle().equals(other.getFullTitle()))
            && (this.getSubhead() == null ? other.getSubhead() == null : this.getSubhead().equals(other.getSubhead()))
            && (this.getIntro() == null ? other.getIntro() == null : this.getIntro().equals(other.getIntro()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getCopyBy() == null ? other.getCopyBy() == null : this.getCopyBy().equals(other.getCopyBy()))
            && (this.getHttpUrl() == null ? other.getHttpUrl() == null : this.getHttpUrl().equals(other.getHttpUrl()))
            && (this.getKeyword() == null ? other.getKeyword() == null : this.getKeyword().equals(other.getKeyword()))
            && (this.getHits() == null ? other.getHits() == null : this.getHits().equals(other.getHits()))
            && (this.getPostNum() == null ? other.getPostNum() == null : this.getPostNum().equals(other.getPostNum()))
            && (this.getLoveNum() == null ? other.getLoveNum() == null : this.getLoveNum().equals(other.getLoveNum()))
            && (this.getCommentSwitch() == null ? other.getCommentSwitch() == null : this.getCommentSwitch().equals(other.getCommentSwitch()))
            && (this.getTopSwitch() == null ? other.getTopSwitch() == null : this.getTopSwitch().equals(other.getTopSwitch()))
            && (this.getEliteSwitch() == null ? other.getEliteSwitch() == null : this.getEliteSwitch().equals(other.getEliteSwitch()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
            && (this.getLastPost() == null ? other.getLastPost() == null : this.getLastPost().equals(other.getLastPost()))
            && (this.getOwnerRemark() == null ? other.getOwnerRemark() == null : this.getOwnerRemark().equals(other.getOwnerRemark()))
            && (this.getThumb() == null ? other.getThumb() == null : this.getThumb().equals(other.getThumb()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getArticleStatus() == null ? other.getArticleStatus() == null : this.getArticleStatus().equals(other.getArticleStatus()))
            && (this.getCreateDateTime() == null ? other.getCreateDateTime() == null : this.getCreateDateTime().equals(other.getCreateDateTime()))
            && (this.getUpdateDateTime() == null ? other.getUpdateDateTime() == null : this.getUpdateDateTime().equals(other.getUpdateDateTime()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getFullTitle() == null) ? 0 : getFullTitle().hashCode());
        result = prime * result + ((getSubhead() == null) ? 0 : getSubhead().hashCode());
        result = prime * result + ((getIntro() == null) ? 0 : getIntro().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getCopyBy() == null) ? 0 : getCopyBy().hashCode());
        result = prime * result + ((getHttpUrl() == null) ? 0 : getHttpUrl().hashCode());
        result = prime * result + ((getKeyword() == null) ? 0 : getKeyword().hashCode());
        result = prime * result + ((getHits() == null) ? 0 : getHits().hashCode());
        result = prime * result + ((getPostNum() == null) ? 0 : getPostNum().hashCode());
        result = prime * result + ((getLoveNum() == null) ? 0 : getLoveNum().hashCode());
        result = prime * result + ((getCommentSwitch() == null) ? 0 : getCommentSwitch().hashCode());
        result = prime * result + ((getTopSwitch() == null) ? 0 : getTopSwitch().hashCode());
        result = prime * result + ((getEliteSwitch() == null) ? 0 : getEliteSwitch().hashCode());
        result = prime * result + ((getDeleteFlag() == null) ? 0 : getDeleteFlag().hashCode());
        result = prime * result + ((getLastPost() == null) ? 0 : getLastPost().hashCode());
        result = prime * result + ((getOwnerRemark() == null) ? 0 : getOwnerRemark().hashCode());
        result = prime * result + ((getThumb() == null) ? 0 : getThumb().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getArticleStatus() == null) ? 0 : getArticleStatus().hashCode());
        result = prime * result + ((getCreateDateTime() == null) ? 0 : getCreateDateTime().hashCode());
        result = prime * result + ((getUpdateDateTime() == null) ? 0 : getUpdateDateTime().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", fullTitle=").append(fullTitle);
        sb.append(", subhead=").append(subhead);
        sb.append(", intro=").append(intro);
        sb.append(", content=").append(content);
        sb.append(", author=").append(author);
        sb.append(", copyBy=").append(copyBy);
        sb.append(", httpUrl=").append(httpUrl);
        sb.append(", keyword=").append(keyword);
        sb.append(", hits=").append(hits);
        sb.append(", postNum=").append(postNum);
        sb.append(", loveNum=").append(loveNum);
        sb.append(", commentSwitch=").append(commentSwitch);
        sb.append(", topSwitch=").append(topSwitch);
        sb.append(", eliteSwitch=").append(eliteSwitch);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append(", lastPost=").append(lastPost);
        sb.append(", ownerRemark=").append(ownerRemark);
        sb.append(", thumb=").append(thumb);
        sb.append(", status=").append(status);
        sb.append(", articleStatus=").append(articleStatus);
        sb.append(", createDateTime=").append(createDateTime);
        sb.append(", updateDateTime=").append(updateDateTime);
        sb.append(", createBy=").append(createBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}