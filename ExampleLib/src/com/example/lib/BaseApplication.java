
package com.example.lib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.app.Application;
import dagger.ObjectGraph;

public class BaseApplication extends Application {

    private ObjectGraph mApplicationGraph;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationGraph = ObjectGraph.create(getModules().toArray());

        mApplicationGraph.inject(this);
    }

    public ObjectGraph getApplicationGraph() {
        return mApplicationGraph;
    }

    protected List<Object> getModules() {
        return new ArrayList<Object>(Arrays.<Object> asList(new AppModule()));
    }

}
