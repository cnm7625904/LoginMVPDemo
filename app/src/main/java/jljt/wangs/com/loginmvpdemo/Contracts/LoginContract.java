package jljt.wangs.com.loginmvpdemo.Contracts;

import jljt.wangs.com.loginmvpdemo.Model.Resluts;
import jljt.wangs.com.loginmvpdemo.Presenter.BasePresenter;

/**
 * Created by tckj03 on 2017/8/16.
 * 登录契约类
 */

public interface LoginContract {
    interface loginView extends BaseView<loginPresenter>{
        void showLoginProgressBar();//开始登陆加载框
        void disMissProgressBar();//关闭对话框
        void loginSuccess();//登陆成功
        void loginFailure();//登陆失败
        String getAccount_Text();//账号
        String getPassword_Text();//密码
        String getToken();//验证
        void returnData(Resluts resluts);//模拟返回json
    }

    interface loginPresenter extends BasePresenter{
        void startLogin();//初始化方法
    }
}
