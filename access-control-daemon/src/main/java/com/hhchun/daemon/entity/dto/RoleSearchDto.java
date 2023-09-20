package com.hhchun.daemon.entity.dto;

import com.hhchun.daemon.common.utils.PageArguments;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 角色
 *
 * @author hhchun
 * @email 12487489@qq.com
 * @date 2023-07-03 06:53:50
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class RoleSearchDto extends PageArguments implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    private Long id;
    /**
     * 角色标识
     */
    private String symbol;
    /**
     * 角色名
     */
    private String name;
    /**
     * 描述/备注
     */
    private String des;
}
