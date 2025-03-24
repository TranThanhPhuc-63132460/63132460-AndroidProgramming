package ntu.ngocduy.lvdongian;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listViewDonGian;
    ArrayList<String> dsBai;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        listViewDonGian = findViewById(R.id.lvdongian);

        // Chuẩn bị dữ liệu, hard-code
        dsBai = new ArrayList<String>();
        dsBai.add("Bài 1");
        dsBai.add("Bài 2");
        dsBai.add("Bài 3");
        dsBai.add("Bài 4");
        dsBai.add("Bài 5");

        // B2: Khởi tạo adapter
        ArrayAdapter<String> adapterNNLT = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_dropdown_item_1line,
                dsBai
        );

        // B3: Gắn Adapter
        listViewDonGian.setAdapter(adapterNNLT);

        // B4: Gắn bộ lắng nghe và xử lý sự kiện
        listViewDonGian.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Lấy giá trị của item được click
                String giaTriDuocChon = dsBai.get(i);

                // Hiển thị giá trị được chọn lên Toast
                Toast.makeText(MainActivity.this, giaTriDuocChon, Toast.LENGTH_LONG).show();
            }
        });
    }
}
