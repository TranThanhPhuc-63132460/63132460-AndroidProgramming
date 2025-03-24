package ntu.ngocduy.nhapvapressbutton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Khai báo các đối tượng UI
    private EditText editTextInput;
    private Button buttonSayHello;
    private TextView textViewOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ các đối tượng UI
        editTextInput = findViewById(R.id.editTextInput);
        buttonSayHello = findViewById(R.id.buttonSayHello);
        textViewOutput = findViewById(R.id.textViewOutput);

        // Thiết lập sự kiện cho nút
        buttonSayHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy dữ liệu từ EditText
                String inputText = editTextInput.getText().toString();

                // Hiển thị văn bản người dùng nhập vào trên TextView
                textViewOutput.setText(inputText);
            }
        });
    }
}
