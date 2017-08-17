package jljt.wangs.com.loginmvpdemo.Model;

import java.io.Serializable;

/**
 * Created by tckj03 on 2017/8/16.
 * 账号模型
 */

public class UserAccountModel implements Serializable{
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    private String id;
    private String account;
    private String password;
}
