package jljt.wangs.com.loginmvpdemo.Presenter;

import android.os.Handler;

import jljt.wangs.com.loginmvpdemo.Contracts.LoginContract;
import jljt.wangs.com.loginmvpdemo.Model.Resluts;

/**
 * Created by tckj03 on 2017/8/16.
 * 登录业务逻辑
 */

public class LoginPresenter implements LoginContract.loginPresenter{
    private LoginContract.loginView view;

    public LoginPresenter(LoginContract.loginView view) {
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void start() {
        startLogin();
    }

    @Override
    public void startLogin() {
        final String account=view.getAccount_Text();//获取的账号
        final String password=view.getPassword_Text();//获取密码
        String token=view.getToken();//获取token或者你需要的参数
        view.showLoginProgressBar();//展示加载框
        final Resluts resluts=new Resluts();
        //模拟登陆或其它耗时业务
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
              if(account.equals("admin")&&password.equals("123456"))
              {
                  resluts.setData("返回了详细数据");
                  resluts.setMsg("请求成功");
                  resluts.setReslutcode("0001");
                  view.loginSuccess();
                  view.returnData(resluts);
                  view.disMissProgressBar();


              }
              else {
                  resluts.setData("我是空的");
                  resluts.setMsg("请求失败");
                  resluts.setReslutcode("0002");
                  view.returnData(resluts);
                  view.disMissProgressBar();
                  view.loginFailure();
              }

            }
        },3000);
    }
}
