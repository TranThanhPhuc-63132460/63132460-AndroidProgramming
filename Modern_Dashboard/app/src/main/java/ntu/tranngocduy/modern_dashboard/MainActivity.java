package ntu.tranngocduy.modern_dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import ntu.tranngocduy.modern_dashboard.ClothingActivity;
import ntu.tranngocduy.modern_dashboard.R;

public class MainActivity extends AppCompatActivity {

    CardView clothingCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clothingCard = findViewById(R.id.clothingCard);

        clothingCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ClothingActivity.class);
                startActivity(intent);
            }
        });
    }
}