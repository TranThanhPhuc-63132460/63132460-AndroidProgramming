package cntt.edu.ex4_addsubmuldiv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
//khia bao cac doi tuong gan voi dieu khien tuong ung
    EditText editText1;
    EditText editText2;
    EditText editTextkq;
    Button nutcong, nuttru, nutnhan, nutchia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timdieukhien();
    }
    void timdieukhien(){
        editText1 = findViewById(R.id.edtsomot);
        editText2 = findViewById(R.id.edtsohai);
        editTextkq = findViewById(R.id.edtkq);
        nutcong = (Button) findViewById(R.id.btncong);
        nuttru = (Button) findViewById(R.id.btntru);
        nutnhan = (Button) findViewById(R.id.btnnhan);
        nutchia = (Button) findViewById(R.id.btnchia);
    }

    public void xulycong(View view) {

        // lấy dữ liệu từ 2 điều khiển
       String so_1 = editText1.getText().toString();
       String so_2 = editText2.getText().toString();
       //chuyển dữ liệu từ chuỗi sang số
       float so_a = Float.parseFloat(so_1);
       float so_b = Float.parseFloat(so_2);
       // tính toán
       float tong = so_a+so_b;
        //chuẩn bị dữ liệu
        String chuoikq = String.valueOf(tong);
        //gắn kết quả
        editTextkq.setText(chuoikq);
    }

    public void xulytru(View view) {
// lấy dữ liệu từ 2 điều khiển
        String so_1 = editText1.getText().toString();
        String so_2 = editText2.getText().toString();
        //chuyển dữ liệu từ chuỗi sang số
        float so_a = Float.parseFloat(so_1);
        float so_b = Float.parseFloat(so_2);
        // tính toán
        float hieu = so_a-so_b;
        //chuẩn bị dữ liệu
        String chuoikq = String.valueOf(hieu);
        //gắn kết quả
        editTextkq.setText(chuoikq);

    }

    public void xulynhan(View view) {
        // lấy dữ liệu từ 2 điều khiển
        String so_1 = editText1.getText().toString();
        String so_2 = editText2.getText().toString();
        //chuyển dữ liệu từ chuỗi sang số
        float so_a = Float.parseFloat(so_1);
        float so_b = Float.parseFloat(so_2);
        // tính toán
        float tich = so_a*so_b;
        //chuẩn bị dữ liệu
        String chuoikq = String.valueOf(tich);
        //gắn kết quả
        editTextkq.setText(chuoikq);
    }

    public void xulychia(View view) {
        // lấy dữ liệu từ 2 điều khiển
        String so_1 = editText1.getText().toString();
        String so_2 = editText2.getText().toString();
        //chuyển dữ liệu từ chuỗi sang số
        float so_a = Float.parseFloat(so_1);
        float so_b = Float.parseFloat(so_2);
        // tính toán
        float thuong = so_a/so_b;
        //chuẩn bị dữ liệu
        String chuoikq = String.valueOf(thuong);
        //gắn kết quả
        editTextkq.setText(chuoikq);
    }
}