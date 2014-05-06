
package com.example.lib;

import javax.inject.Inject;

import com.ztestlib.R;

import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    @Inject
    AppConfig mAppConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((TextView) findViewById(R.id.title)).setText(mAppConfig.getTitle());
    }

}
