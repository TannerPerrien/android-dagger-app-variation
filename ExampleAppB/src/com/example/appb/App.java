
package com.example.appb;

import java.util.List;

import com.example.lib.BaseApplication;

public class App extends BaseApplication {

    protected List<Object> getModules() {
        List<Object> modules = super.getModules();
        modules.add(new ConfigModule());
        return modules;
    }

}
