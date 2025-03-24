package ntu.tranngocduy.lvngonngulaptrinh;

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
    ListView listViewNNLT;
    ArrayList<String> dsNgonNguLT;

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

        listViewNNLT = findViewById(R.id.lvNNLT);

        // Chuẩn bị dữ liệu, hard-code
        dsNgonNguLT = new ArrayList<String>();
        dsNgonNguLT.add("Python");
        dsNgonNguLT.add("Php");
        dsNgonNguLT.add("Java");
        dsNgonNguLT.add("C");
        dsNgonNguLT.add("C++");

        // B2: Khởi tạo adapter
        ArrayAdapter<String> adapterNNLT = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_dropdown_item_1line,
                dsNgonNguLT
        );

        // B3: Gắn Adapter
        listViewNNLT.setAdapter(adapterNNLT);

        // B4: Gắn bộ lắng nghe và xử lý sự kiện
        listViewNNLT.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Lấy giá trị của item được click
                String giaTriDuocChon = dsNgonNguLT.get(i);

                // Hiển thị giá trị được chọn lên Toast
                Toast.makeText(MainActivity.this, giaTriDuocChon, Toast.LENGTH_LONG).show();
            }
        });
    }
}
