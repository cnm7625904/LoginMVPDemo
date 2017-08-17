package jljt.wangs.com.loginmvpdemo.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import jljt.wangs.com.loginmvpdemo.Contracts.LoginContract;
import jljt.wangs.com.loginmvpdemo.Model.Resluts;
import jljt.wangs.com.loginmvpdemo.Presenter.LoginPresenter;
import jljt.wangs.com.loginmvpdemo.R;
public class LoginActivity extends AppCompatActivity implements LoginContract.loginView{
    private EditText et_account;//账号
    private EditText et_password;//密码
    private Button btn_login;//登陆
    private ProgressBar progressBar;//进度条
    private TextView tv_data;//返回数据
    private String s_account;
    private String s_password;
    private LoginContract.loginPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_account= (EditText) findViewById(R.id.et_account);
        et_password= (EditText) findViewById(R.id.et_password);
        btn_login= (Button) findViewById(R.id.btn_login);
        progressBar= (ProgressBar) findViewById(R.id.progressBar);
        tv_data= (TextView) findViewById(R.id.tv_data);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(et_account.getText().toString().trim())||TextUtils.isEmpty(et_password.getText().toString().trim()))
                {
                    Toast.makeText(LoginActivity.this,"请输入完整的账号密码",Toast.LENGTH_SHORT).show();
                    return;
                }
                s_account=et_account.getText().toString();
                s_password=et_password.getText().toString();
                new LoginPresenter(LoginActivity.this);
                presenter.startLogin();
            }
        });
    }

    @Override
    public void setPresenter(LoginContract.loginPresenter presenter) {
        this.presenter=presenter;
    }

    @Override
    public void showLoginProgressBar() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void disMissProgressBar() {
        progressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(LoginActivity.this,"登陆成功",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginFailure() {
        Toast.makeText(LoginActivity.this,"登陆失败",Toast.LENGTH_SHORT).show();
    }

    @Override
    public String getAccount_Text() {
        return s_account;
    }

    @Override
    public String getPassword_Text() {
        return s_password;
    }

    @Override
    public String getToken() {
        return "我就是Token";
    }

    @Override
    public void returnData(Resluts resluts) {
        if(resluts!=null)
        {
            tv_data.setVisibility(View.VISIBLE);
            tv_data.setText(resluts.toString());
        }
    }
}
