package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu); //метод, который берёт данные из ресурсов меню и преобразует их в пункты меню на экране.
        return true;
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        TextView infoTextView = (TextView) findViewById(R.id.Texxt1);
        switch (id) {
            case R.id.di1:
                infoTextView.setText("Тираннозавр");
                return true;
            case R.id.di2:
                infoTextView.setText("Стегозавр");
                return true;
            case R.id.di3:
                infoTextView.setText("Диплодок");
                return true;
            case R.id.di4:
                infoTextView.setText("Цератопс");
                return true;
            case R.id.di5:
                infoTextView.setText("Целофиз");
                return true;
            case R.id.dd1:
                infoTextView.setText("информация");
                return true;
            case R.id.dd2:
                infoTextView.setText("картинки");
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
