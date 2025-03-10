package cntt.edu.ex_6_listviewdemo;

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

    ListView lvBaiHat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timDK();

        dsBH = new ArrayList<String>();
        dsBH.add("Nha Trang thu");
        dsBH.add("Gần lắm Trường Sa");
        dsBH.add("Mùa thu Hà Nội");

        arrayAdapterBH = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, dsBH);
        lvBaiHat.setAdapter(arrayAdapterBH);

        lvBaiHat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String chuoitb = "Bạn chọn bài, "+ dsBH.get(position);
                Toast.makeText( MainActivity.this,chuoitb,Toast.LENGTH_SHORT).show();

            }
        });
    }
    void timDK(){
        lvBaiHat= findViewById(R.id.loibaihatyeuthich);
    }


}