package cntt.edu.ex5_addsubmuldiv_anynomous;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextsoa;
    EditText editTextsob;
    EditText editTextKq;
    Button btncong, btntru, btnnhan, btnchia;
    void timdieukhien(){
        editTextsoa= findViewById(R.id.edta);
        editTextsob = findViewById(R.id.edtb);
        btncong = findViewById(R.id.btncong);
        btntru = findViewById(R.id.btntru);
        btnnhan = findViewById(R.id.btncnhan);
        btnchia = findViewById(R.id.btnchia);
        editTextKq = findViewById(R.id.edtkq);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timdieukhien();
        //gắn bộ láng nghe sự kiện và code xử lý cho từng nút
        btncong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               xuly_cong();
            }
        });
        btntru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               xuly_tru();
            }
        });
        btnnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               xuly_nhan();
            }
        });
        btnchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               xuly_chia();
            }
        });
    }
    void xuly_cong(){
        //xử lý cộng
        String so_a = editTextsoa.getText().toString();
        String so_b = editTextsob.getText().toString();

        float soa = Float.parseFloat(so_a);
        float sob = Float.parseFloat(so_b);

        float tong = soa+sob;
        String kq = String.valueOf(tong);
        editTextKq.setText(kq);
    }
    void xuly_tru(){
        //xử lý trừ
        String so_a = editTextsoa.getText().toString();
        String so_b = editTextsob.getText().toString();

        float soa = Float.parseFloat(so_a);
        float sob = Float.parseFloat(so_b);

        float hieu = soa - sob;
        String kq = String.valueOf(hieu);
        editTextKq.setText(kq);
    }
    void xuly_nhan(){
        //xử lý nhân
        String so_a = editTextsoa.getText().toString();
        String so_b = editTextsob.getText().toString();

        float soa = Float.parseFloat(so_a);
        float sob = Float.parseFloat(so_b);

        float tich = soa * sob;
        String kq = String.valueOf(tich);
        editTextKq.setText(kq);
    }
    void xuly_chia(){
        //xử lý chia
        String so_a = editTextsoa.getText().toString();
        String so_b = editTextsob.getText().toString();

        float soa = Float.parseFloat(so_a);
        float sob = Float.parseFloat(so_b);

        float thuong = soa / sob;
        String kq = String.valueOf(thuong);
        editTextKq.setText(kq);
    }

}