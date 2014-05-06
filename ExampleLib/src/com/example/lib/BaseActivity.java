
package com.example.lib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import dagger.ObjectGraph;

public class BaseActivity extends Activity {

    private ObjectGraph mActivityGraph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        BaseApplication application = (BaseApplication) getApplication();
        mActivityGraph = application.getApplicationGraph().plus(getModules().toArray());

        mActivityGraph.inject(this);
    }

    @Override
    protected void onDestroy() {
        mActivityGraph = null;

        super.onDestroy();
    }

    protected List<Object> getModules() {
        return new ArrayList<Object>(Arrays.<Object> asList(new ActivityModule()));
    }

    public void inject(Object object) {
        mActivityGraph.inject(object);
    }
}
