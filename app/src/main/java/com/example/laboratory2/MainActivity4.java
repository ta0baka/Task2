package com.example.laboratory2;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button button = findViewById(R.id.button_activity4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GradientDrawable drawable = new GradientDrawable();
                drawable.setColor(Color.GREEN);
                drawable.setCornerRadius(60f);
                drawable.setStroke((int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 1, getResources().getDisplayMetrics()), Color.parseColor("#505050"));
                button.setBackground(drawable);
            }
        });
    }
}