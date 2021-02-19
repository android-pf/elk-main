package com.pf.export.main;

import android.util.Log;

import com.alibaba.android.arouter.launcher.ARouter;
import com.pf.export.main.bean.MainInfo;
import com.pf.export.main.router.MainRouter;
import com.pf.export.main.service.ICartService;

/**
 * 购物车组件服务工具类
 * 其他组件直接使用此类即可：页面跳转、获取服务。
 *
 * @author hufeiyang
 */
public class MainARouterService {

    /**
     * 跳转到 xx页面
     *
     * @param param1
     * @param param2
     */
    public static void navigateMain(String param1, String param2) {
        Log.i("login", "export_main");
    }

    /**
     * 获取服务
     *
     * @return
     */
    public static ICartService getService() {
        return (ICartService) ARouter.getInstance().build(MainRouter.PATH_LOGIN_SERVICE).navigation();
    }

    /**
     * 获取 数量
     *
     * @return
     */
    public static MainInfo getCartProductCount() {
        return getService().getProductCountInCart();
    }

}
