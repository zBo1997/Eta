package com.momo.eta.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * <p>
 *  文章状态
 * </p>
 *
 * @author zhubo
 * @since 2023-06-12
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ArticleStatus {
    /**
     * 上架
     */
    SHELF(0),
    /**
     * 下架
     */
    OFF_SHELF(1),
    /**
     * 审核中
     */
    AUDIT(2);

    private Integer code;
}