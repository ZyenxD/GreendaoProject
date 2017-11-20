package com.personal.neycasilla.greendaoproject.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.personal.neycasilla.greendaoproject.ItemDao;
import com.personal.neycasilla.greendaoproject.MyApp;
import com.personal.neycasilla.greendaoproject.R;
import com.personal.neycasilla.greendaoproject.models.Item;

import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ItemDao itemDao = ((MyApp)(getApplication())).getDaoSession().getItemDao();
        Item item = new Item();
        item.name = "algo";
        item.description = "d";
        item.date = new Date();


        long insert = itemDao.insert(item);
        Log.d("Main","ID " + insert);
//        List<Item> items = itemDao.queryBuilder().where(ItemDao.Properties.Id);
//        Log.d("Main","List "+ items);
    }
}
