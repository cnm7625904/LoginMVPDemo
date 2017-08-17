package jljt.wangs.com.loginmvpdemo.Model;

/**
 * Created by tckj03 on 2017/8/16.
 * 模拟服务器返回数据
 */

public class Resluts {
    private String reslutcode;
    private String msg;
    private String data;

    public String getReslutcode() {
        return reslutcode;
    }

    public void setReslutcode(String reslutcode) {
        this.reslutcode = reslutcode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Resluts{" +
                "reslutcode='" + reslutcode + '\'' +
                ", msg='" + msg + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
