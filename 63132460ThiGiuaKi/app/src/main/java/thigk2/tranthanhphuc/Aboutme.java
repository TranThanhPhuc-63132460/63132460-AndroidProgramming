package thigk2.tranthanhphuc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Aboutme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_aboutme);
        ListView listView = findViewById(R.id.listMe);
        String[] items = {" lớp 63.MTT", "Thích nghe nhạc", "Đam mê ca hát", "chụp ảnh và ngắm cảnh"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            String selectedItem = items[position];
            // Xử lý sự kiện khi người dùng chọn một mục trong ListView
            Intent intent = new Intent(Aboutme.this, Activitychucnang4.class);
            intent.putExtra("selectedItem", selectedItem);
            startActivity(intent);
        });
    }
}