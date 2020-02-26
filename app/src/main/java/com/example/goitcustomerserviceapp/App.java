package com.example.goitcustomerserviceapp;
import com.parse.Parse;
import com.parse.ParseInstallation;

import android.app.Application;




public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this).applicationId("cjones-parse-server")
                    .server("http://parse-server-example-cjones.herokuapp.com/parse")
                    .build()
            );
        ParseInstallation.getCurrentInstallation().saveInBackground();
        }
    }

