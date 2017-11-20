package com.personal.neycasilla.greendaoproject;

import android.app.Application;

import org.greenrobot.greendao.database.Database;

/**
 * Created by Ney Casilla on 8/12/2017.
 */

public class MyApp extends Application{

    public DaoSession getDaoSession() {
        return daoSession;
    }

    private DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this,"example-db");
        Database database = helper.getWritableDb();
        daoSession = new DaoMaster(database).newSession();
    }


}
