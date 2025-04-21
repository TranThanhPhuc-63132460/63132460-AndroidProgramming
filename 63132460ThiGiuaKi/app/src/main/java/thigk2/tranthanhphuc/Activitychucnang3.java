package thigk2.tranthanhphuc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Activitychucnang3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_activitychucnang3);

        ListView listView = findViewById(R.id.listMe);
        String[] items = {"Tin học đại cương", "Lập trình java", "Phát triển ứng dụng web", "Khai thác dữ liệu lơn", "kinh tế chính trị"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            String selectedItem = items[position];
            // Xử lý sự kiện khi người dùng chọn một mục trong ListView
            Intent intent = new Intent(Activitychucnang3.this, Activitychucnang4.class);
            intent.putExtra("selectedItem", selectedItem);
            startActivity(intent);
        });
        }
    }