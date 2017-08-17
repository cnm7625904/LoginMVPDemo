package jljt.wangs.com.loginmvpdemo.Contracts;

/**
 * Created by tckj03 on 2017/8/16.
 * 契约类基类
 */

public interface BaseView<T> {
  void setPresenter(T presenter);
}
