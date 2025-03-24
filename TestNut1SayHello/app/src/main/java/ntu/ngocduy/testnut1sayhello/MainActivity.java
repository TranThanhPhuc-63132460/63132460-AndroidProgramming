package ntu.ngocduy.testnut1sayhello;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView operand1TextView, operand2TextView, resultTextView, scoreTextView;
    private EditText resultEditText;  // Thêm EditText để nhập kết quả
    private int operand1 = 0, operand2 = 0;
    private boolean isFirstOperand = true;
    private int kqDung;
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operand1TextView = findViewById(R.id.operand1TextView);
        operand2TextView = findViewById(R.id.operand2TextView);
        resultTextView = findViewById(R.id.resultTextView);
        scoreTextView = findViewById(R.id.scoreTextView);
        resultEditText = findViewById(R.id.editTextResult);  // Khởi tạo EditText

        generateQuestion(); // Tạo phép toán đầu tiên

        // Gán sự kiện onClick cho các nút số
        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);
        findViewById(R.id.button6).setOnClickListener(this);
        findViewById(R.id.button7).setOnClickListener(this);
        findViewById(R.id.button8).setOnClickListener(this);
        findViewById(R.id.button9).setOnClickListener(this);

        // Gán sự kiện onClick cho nút "Kiểm tra" và "Reset"
        findViewById(R.id.btnKiemtra).setOnClickListener(this);
        findViewById(R.id.btnReset).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Button button = (Button) v;
        String buttonText = button.getText().toString();

        if (v.getId() == R.id.btnKiemtra) {
            checkAnswer(); //Check kết quả
        } else if (v.getId() == R.id.btnReset) {
            resetGame();  //reset
        } else {
            // Xử lý các nút số
            if (isFirstOperand) {
                operand1 = Integer.parseInt(buttonText);
                operand1TextView.setText(buttonText);
                isFirstOperand = false;
            } else {
                operand2 = Integer.parseInt(buttonText);
                operand2TextView.setText(buttonText);
            }
        }
    }

    private void generateQuestion() {
        int a = (int) (Math.random() * 5);
        int b = (int) (Math.random() * 5);
        kqDung = a + b;
        operand1TextView.setText(String.valueOf(a));
        operand2TextView.setText(String.valueOf(b));
        resultTextView.setText(""); // Xóa kết quả cũ
        operand1 = 0;
        operand2 = 0;
        isFirstOperand = true;
        resultEditText.setText("");  // Xóa nội dung trong EditText
    }

    private void checkAnswer() {
        String resultString = resultEditText.getText().toString();
        if (!resultString.isEmpty()) {
            int result = Integer.parseInt(resultString);
            if (result == kqDung) {
                score++;
                scoreTextView.setText("Điểm: " + score);
                resultTextView.setText("Đúng!");
            } else {
                resultTextView.setText("Sai!");
            }
            generateQuestion(); // Tạo câu hỏi mới sau khi kiểm tra
        } else {
            resultTextView.setText("Vui lòng nhập kết quả!");
        }
    }

    private void resetGame() {
        score = 0;
        scoreTextView.setText("Điểm: 0");
        generateQuestion(); // Tạo câu hỏi mới
    }
}
