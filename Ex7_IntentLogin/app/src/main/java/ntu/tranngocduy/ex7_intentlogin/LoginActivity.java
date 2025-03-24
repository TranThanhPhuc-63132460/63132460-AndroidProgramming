package ntu.tranngocduy.ex7_intentlogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        Button btnXacNhan = (Button) findViewById(R.id.btnOK);

        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Xu li dang nhap
                //Lay du lieu
                //B1: Tim tham chieu den dk
                EditText edTenDN = (EditText) findViewById(R.id.editUsername);
                EditText edPass = (EditText) findViewById(R.id.edtPass);
                //b2: Lay du lieu
                String tenDangNhap = edTenDN.getText().toString();
                String mk = edPass.getText().toString();
                //Kiem tra Mat khau
                if( tenDangNhap.equals("tranngocduy") && mk.equals("123") ) //Mk đúng
                {   //Chuyen sang man hinh home
                    Intent iQuiz = new Intent(LoginActivity.this, HomeActivity.class);
                    //Goi du lieu vao iQuiz, dạng key, value; key được dùng để bên kia lạc ra dữ liệu
                    iQuiz.putExtra("ten_dang_nhap", tenDangNhap);
                    iQuiz.putExtra("mk_dang_nhap", mk);
                    //Gửi đi
                    startActivity(iQuiz);
                }
                else {
                    Toast.makeText(LoginActivity.this, "Bạn Đăng Nhập Sai Thông Tin", Toast.LENGTH_LONG);
                }
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}