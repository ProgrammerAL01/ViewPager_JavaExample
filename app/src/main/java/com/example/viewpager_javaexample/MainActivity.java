package com.example.viewpager_javaexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
    }

    private void bindViews() {
        ViewPager2 viewPager2 = findViewById(R.id.viewPager_2);
        List<ViewPagerModel> models = new ArrayList<>();
        models.add(new ViewPagerModel("Hi i'm Amirhossein Alizad"));
        models.add(new ViewPagerModel("I'm Android Developer"));
        models.add(new ViewPagerModel("and i work C#"));
        models.add(new ViewPagerModel("Nice to meet you and thank you for watching my project"));
        ViewPagerAdapter adapter=new ViewPagerAdapter(models);
        viewPager2.setAdapter(adapter);
    }
}