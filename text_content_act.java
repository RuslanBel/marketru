package com.example.marketru;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class text_content_act extends AppCompatActivity {
    private TextView text_content;
    private ImageView iContent;
    private int category;
    private int position;
    private int [] arraymen = {R.string.men_1,R.string.men_2,R.string.ho1,R.string.ho2};
    private int [] array_image = {R.drawable.aaa,R.drawable.s,R.drawable.aaa,R.drawable.s};
    private int [] array_men2 = {R.string.ho1,R.string.ho2,R.string.ho1,R.string.ho2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_contect);
        text_content = (TextView) findViewById(R.id.textView33);

        Toolbar toolbar2 = findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar2.setTitle("Назад");
        toolbar2.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                onBackPressed();// возврат на предыдущий activity
                }});
        iContent = findViewById(R.id.imageView2);
        reciveIntent();

    }
    private void reciveIntent(){
    Intent i = getIntent();
    if(i != null){
        category = i.getIntExtra("category",0);
        position = i.getIntExtra("position",0);
    }
    switch (category){
        case 0:

            iContent.setImageResource(array_image[position]);
            text_content.setText(arraymen[position]);
            break;
        case 1:

            iContent.setImageResource(array_image[position]);
            text_content.setText(array_men2[position]);
            break;

    }
    }




}
