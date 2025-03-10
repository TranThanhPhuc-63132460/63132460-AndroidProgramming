package cntt.edu.ex_6cong_listviewthemxoasua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> dsBH;
    ArrayAdapter<String> arrayAdapterBH;
    ArrayList<String> dsBHFormatted;
    ListView lvBaiHat;
    EditText edtinf;
    EditText edittenmoi;
    int select = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timDK();

        dsBH = new ArrayList<String>();
        dsBH.add("Nha Trang thu");
        dsBH.add("Gần lắm Trường Sa");
        dsBH.add("Mùa thu Hà Nội");
        dsBHFormatted = new ArrayList<String>();

        for (int i = 0; i < dsBH.size(); i++) {
            String formattedSong = (i + 1) + ". " + dsBH.get(i);
            dsBHFormatted.add(formattedSong);
        }

        arrayAdapterBH = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, dsBHFormatted);


        lvBaiHat.setAdapter(arrayAdapterBH);

        lvBaiHat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String chuoitb = "Bạn chọn bài, "+ dsBH.get(position);
                Toast.makeText( MainActivity.this,chuoitb,Toast.LENGTH_SHORT).show();
                select = position;
                edtinf.setText(dsBH.get(position));

            }
        });
    }
    void timDK(){
        lvBaiHat= findViewById(R.id.loibaihatyeuthich);
        edtinf = findViewById(R.id.edtnhapten);
    }

    public void ThemPhantu(View view) {
        edittenmoi = findViewById(R.id.edtnhapten);
        String tennhap = edittenmoi.getText().toString();
        if (tennhap.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập tên bài hát", Toast.LENGTH_SHORT).show();
            return;
        }
        dsBH.add(tennhap);
        String formattedSong = (dsBH.size()) + ". " + tennhap;
        dsBHFormatted.add(formattedSong);
        arrayAdapterBH.notifyDataSetChanged();


    }

    public void XoaPhantu(View view) {

        if (select == -1) {
            Toast.makeText(this, "Vui lòng chọn một bài hát để xóa", Toast.LENGTH_SHORT).show();
        }
        else {
            dsBH.remove(select);
            dsBHFormatted.remove(select);
            for (int i = 0; i < dsBHFormatted.size(); i++) {
                String formattedSong = (i + 1) + ". " + dsBH.get(i);
                dsBHFormatted.set(i, formattedSong);
            }
            arrayAdapterBH.notifyDataSetChanged();
            select = -1;
        }
    }

    public void suaphantu(View view) {
        edittenmoi = findViewById(R.id.edtnhapten);
        String tenmoi = edittenmoi.getText().toString();
        if (select == -1) {
            Toast.makeText(this, "Vui lòng chọn một bài hát để sửa", Toast.LENGTH_SHORT).show();
            return;
        }
        dsBH.set(select, tenmoi);
        String formattedSong = (select + 1) + ". " + tenmoi;
        dsBHFormatted.set(select, formattedSong);
        arrayAdapterBH.notifyDataSetChanged();
        select = -1;
        edittenmoi.setText("");
    }
}