package com.example.FirstRoboGuiceAndroidApp;

import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.inject.Inject;
import roboguice.activity.RoboActivity;
import roboguice.inject.InjectResource;
import roboguice.inject.InjectView;

import java.util.Date;

public class MyActivity extends RoboActivity {

    @InjectView(R.id.text)
    TextView name;

    @InjectView(R.id.imageView1)
    ImageView thumbnail;

    @InjectResource(R.drawable.ic_launcher)
    Drawable icon;

    @InjectResource(R.string.app_name)
    String myName;

    // system service
    @Inject
    LocationManager loc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        StringBuilder currentTime = new StringBuilder();
        currentTime.append("Hello World!");
        currentTime.append("\n");
        currentTime.append(currentTime().toString());
        name.setText(currentTime);
    }

    private Date currentTime() {
        return new Date();
    }
}