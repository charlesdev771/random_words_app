package com.example.wordsofday;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] words = {
      "Good borning","Good evening","Good afternoon","Salve!","Ave!",
    };
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
    }


    public void generate_all_text(View view)
    {

        TextView text = findViewById(R.id.result_text);
        String textResult = "";
        for (String word: words)
        {
            textResult = textResult + word + "\n";
        }

        text.setText(textResult);
                //btn_generate, btn_generate_all,result_text
    }

    public void generate_one_text(View view)
    {



        TextView text = findViewById(R.id.result_text);
        int random_number = new Random().nextInt(6);
        String word = words[random_number];
        text.setText(word);
        //btn_generate, btn_generate_all,result_text
    }

}