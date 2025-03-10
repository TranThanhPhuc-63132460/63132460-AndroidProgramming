package cntt.edu.ex5_addsubmuldiv_var;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timdieukhien();
        //gắn các bộ lắng nghe
        btncong.setOnClickListener(bolangnghe_xulycong);
        btntru.setOnClickListener(bolangnghe_xulytru);
        btnnhan.setOnClickListener(bolangnghe_xulynhan);
       // btnchia.setOnClickListener(bolangnghe_xulychia);
        ///ẩn danh
        btnchia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code xử lý chia
            String so_a = editTextsoa.getText().toString();
            String so_b = editTextsob.getText().toString();

            float a = Float.parseFloat(so_a);
            float b = Float.parseFloat(so_b);

            float thuong = a/b;
            String kq = String.valueOf(thuong);
            textViewkq.setText(kq);

            }
        });
    }
    //tạo bộ lắng nghe và xử lý sự kiện
    View.OnClickListener bolangnghe_xulycong = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //code xử lý cộng
            String so_a = editTextsoa.getText().toString();
            String so_b = editTextsob.getText().toString();

            float a = Float.parseFloat(so_a);
            float b = Float.parseFloat(so_b);

            float tong = a+b;
            String kq = String.valueOf(tong);
            textViewkq.setText(kq);
        }
    };
    View.OnClickListener bolangnghe_xulytru = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //code xử lý cộng
            String so_a = editTextsoa.getText().toString();
            String so_b = editTextsob.getText().toString();

            float a = Float.parseFloat(so_a);
            float b = Float.parseFloat(so_b);

            float hieu = a-b;
            String kq = String.valueOf(hieu);
            textViewkq.setText(kq);
        }
    };
    View.OnClickListener bolangnghe_xulynhan = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //code xử lý cộng
            String so_a = editTextsoa.getText().toString();
            String so_b = editTextsob.getText().toString();

            float a = Float.parseFloat(so_a);
            float b = Float.parseFloat(so_b);

            float tich = a*b;
            String kq = String.valueOf(tich);
            textViewkq.setText(kq);
        }
    };
//    View.OnClickListener bolangnghe_xulychia = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            //code xử lý cộng
//            String so_a = editTextsoa.getText().toString();
//            String so_b = editTextsob.getText().toString();
//
//            float a = Float.parseFloat(so_a);
//            float b = Float.parseFloat(so_b);
//
//            float thuong = a/b;
//            String kq = String.valueOf(thuong);
//            textViewkq.setText(kq);
//        }
//    };

    //////////////////////////////////////////////////////////////////////////////
    //khia báo đối tượng
    EditText editTextsoa;
    EditText editTextsob;
    TextView textViewkq;
    Button btncong, btntru, btnnhan, btnchia;
    void timdieukhien(){
        editTextsoa = findViewById(R.id.edta);
        editTextsob = findViewById(R.id.edtb);
        btncong = findViewById(R.id.btncong);
        btntru = findViewById(R.id.btntru);
        btnnhan = findViewById(R.id.btnnhan);
        btnchia = findViewById(R.id.btnchia);
        textViewkq = findViewById(R.id.twkq);
    }
}