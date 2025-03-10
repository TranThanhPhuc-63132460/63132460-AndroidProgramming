package ntu.dtthiep.vidu2_intents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class ActivityHome extends AppCompatActivity {
    TextView userName;
    Button btn1, btn2;
    void timdiuekhien(){
        userName = findViewById(R.id.tvUserName);
        btn1 = findViewById(R.id.btnquiz1);
        btn2 = findViewById(R.id.btnquiz2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        timdiuekhien();

        String name = getIntent().getStringExtra("userName");
        userName.setText(name);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ActivityHome.this,MainActivity.class);
                startActivity(intent1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(ActivityHome.this, ActivityLogin.class);
                startActivity(intent2);
            }
        });
    }
}
