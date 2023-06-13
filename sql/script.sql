DROP TABLE IF EXISTS `eta_carousel`;
create table eta_carousel
(
    `id`               varchar(64)  null comment '主键',
    `button_text`      varchar(6)   not null comment '按钮文案',
    `img_url`          varchar(200) not null comment '轮播图图片地址',
    `title`            varchar(200) not null comment '标题',
    `introduce`        varchar(200) not null comment '介绍文案',
    `create_date_time` datetime     not null default current_timestamp comment '创建时间',
    `update_date_time` datetime     not null on update current_timestamp comment '更新时间',
    constraint eta_carousel_id_uindex
        unique (`id`)
);

DROP TABLE IF EXISTS `article`;
CREATE TABLE `eta_article`
(
    `id`               varchar(64)               null comment '主键',
    `title`            varchar(255)                       DEFAULT NULL COMMENT '文章标题',
    `full_title`       varchar(255)                       DEFAULT NULL COMMENT '完整标题',
    `subhead`          varchar(255)                       DEFAULT NULL COMMENT '副标题',
    `intro`            varchar(255)                       DEFAULT NULL COMMENT '简介',
    `content`          longtext COMMENT '文章内容',
    `author`           varchar(20)                        DEFAULT NULL COMMENT '作者',
    `copy_by`          varchar(20)                        DEFAULT NULL COMMENT '来源',
    `http_url`         varchar(255)                       DEFAULT NULL COMMENT '转向连接',
    `keyword`          varchar(255)                       DEFAULT NULL COMMENT '关健字',
    `hits`             int                                DEFAULT NULL COMMENT '点击数',
    `post_num`         int                                DEFAULT NULL COMMENT '评论数',
    `love_num`         int                                DEFAULT NULL COMMENT '喜欢数',
    `comment_switch`   int                                DEFAULT NULL COMMENT '是否评论',
    `top_switch`       int                                DEFAULT NULL COMMENT '是否顶制',
    `elite_switch`     int                                DEFAULT NULL COMMENT '是否推荐',
    `delete_flag`      int                                DEFAULT NULL COMMENT '是否删除',
    `last_post`        datetime                           DEFAULT NULL COMMENT '最后评论时间',
    `owner_remark`     varchar(1024)                      DEFAULT NULL COMMENT '自定义备注',
    `thumb`            varchar(255)                       DEFAULT NULL COMMENT '缩略图地址',
    `status`           varchar(25)                        DEFAULT NULL COMMENT '生成状态',
    `article_status`   int(10) unsigned zerofill NOT NULL COMMENT '文章状态身份',
    `create_date_time` datetime                  NOT NULL default current_timestamp comment '创建时间',
    `update_date_time` datetime                  NOT NULL on update current_timestamp comment '更新时间',
    `create_by`        varchar(20)                        DEFAULT NULL COMMENT '录入者',
    constraint eta_article_id_uindex
        unique (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb3