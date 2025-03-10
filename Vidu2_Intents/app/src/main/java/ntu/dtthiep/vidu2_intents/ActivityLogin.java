package ntu.dtthiep.vidu2_intents;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityLogin extends AppCompatActivity {
    EditText edtuser;
    EditText edtpw;
    EditText edtmail;
    Button btnxacnhan;
    TextView tvthongbao;
    void timdieukhien(){
        edtuser = findViewById(R.id.edtuser);
        edtpw = findViewById(R.id.edtpw);
        edtmail = findViewById(R.id.edtemail);
        btnxacnhan = findViewById(R.id.btnxacnhan);
        tvthongbao = findViewById(R.id.tvthongbaoloi);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        timdieukhien();
        btnxacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = edtuser.getText().toString();
                String pw = edtpw.getText().toString();
                String mail = edtmail.getText().toString();
                if(user.equals("maicuongtho")&&pw.equals("123")&& checkEmail(mail)){
                    Intent intent = new Intent(ActivityLogin.this,ActivityHome.class);
                    intent.putExtra("userName",user);
                    startActivity(intent);

                }
                else
                    tvthongbao.setText("Thông tin đăng nhập không hợp lệ.");
            }
        });

    }
    boolean checkEmail(String email){
        return !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }
}
