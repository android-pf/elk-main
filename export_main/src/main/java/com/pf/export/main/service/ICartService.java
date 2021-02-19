package com.pf.export.main.service;


import com.alibaba.android.arouter.facade.template.IProvider;
import com.pf.export.main.bean.MainInfo;

/**
 * 组件对外暴露的服务
 */
public interface ICartService extends IProvider {

    /**
     * 获取购物车中商品数量
     * @return
     */
    MainInfo getProductCountInCart();
}
