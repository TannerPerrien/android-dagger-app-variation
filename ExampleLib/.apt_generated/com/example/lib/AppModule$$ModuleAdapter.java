// Code generated by dagger-compiler.  Do not edit.
package com.example.lib;

import dagger.internal.ModuleAdapter;

/**
 * A manager of modules and provides adapters allowing for proper linking and
 * instance provision of types served by {@code @Provides} methods.
 */
public final class AppModule$$ModuleAdapter extends ModuleAdapter<AppModule> {
  private static final String[] INJECTS = { };
  private static final Class<?>[] STATIC_INJECTIONS = { };
  private static final Class<?>[] INCLUDES = { };

  public AppModule$$ModuleAdapter() {
    super(com.example.lib.AppModule.class, INJECTS, STATIC_INJECTIONS, false /*overrides*/, INCLUDES, true /*complete*/, false /*library*/);
  }

  @Override
  public AppModule newModule() {
    return new com.example.lib.AppModule();
  }
}
