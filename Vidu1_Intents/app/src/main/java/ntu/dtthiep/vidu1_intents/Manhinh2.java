package ntu.dtthiep.vidu1_intents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Manhinh2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manhinh2);
        Button btnquayve = findViewById(R.id.btn2);
        btnquayve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Manhinh2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
