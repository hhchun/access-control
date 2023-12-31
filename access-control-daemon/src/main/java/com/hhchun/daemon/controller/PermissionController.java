package com.hhchun.daemon.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hhchun.daemon.entity.domain.PermissionEntity;
import com.hhchun.daemon.service.PermissionService;
import com.hhchun.daemon.common.utils.R;


/**
 * 权限
 *
 * @author hhchun
 * @email 12487489@qq.com
 * @date 2023-07-03 06:53:50
 */
@RestController
@RequestMapping("/permission")
public class PermissionController {
    @Autowired
    private PermissionService permissionService;


    /**
     * 保存
     */
    @RequestMapping("/save")
    public R<?> save(@RequestBody PermissionEntity permission) {
        permissionService.save(permission);

        return R.success();
    }

}
