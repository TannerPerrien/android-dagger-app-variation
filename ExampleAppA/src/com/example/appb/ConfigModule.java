
package com.example.appb;

import com.example.lib.AppConfig;

import dagger.Module;
import dagger.Provides;

@Module(library = true, injects = App.class)
public class ConfigModule {

    @Provides
    AppConfig provideAppConfig() {
        return new Config();
    }

}
