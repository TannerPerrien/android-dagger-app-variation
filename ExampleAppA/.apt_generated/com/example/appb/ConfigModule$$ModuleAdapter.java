// Code generated by dagger-compiler.  Do not edit.
package com.example.appb;

import dagger.internal.BindingsGroup;
import dagger.internal.ModuleAdapter;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

/**
 * A manager of modules and provides adapters allowing for proper linking and
 * instance provision of types served by {@code @Provides} methods.
 */
public final class ConfigModule$$ModuleAdapter extends ModuleAdapter<ConfigModule> {
  private static final String[] INJECTS = { "members/com.example.appb.App", };
  private static final Class<?>[] STATIC_INJECTIONS = { };
  private static final Class<?>[] INCLUDES = { };

  public ConfigModule$$ModuleAdapter() {
    super(com.example.appb.ConfigModule.class, INJECTS, STATIC_INJECTIONS, false /*overrides*/, INCLUDES, true /*complete*/, true /*library*/);
  }

  @Override
  public ConfigModule newModule() {
    return new com.example.appb.ConfigModule();
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getBindings(BindingsGroup bindings, ConfigModule module) {
    bindings.contributeProvidesBinding("com.example.lib.AppConfig", new ProvideAppConfigProvidesAdapter(module));
  }

  /**
   * A {@code Binding<com.example.lib.AppConfig>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Being a {@code Provider<com.example.lib.AppConfig>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideAppConfigProvidesAdapter extends ProvidesBinding<com.example.lib.AppConfig>
      implements Provider<com.example.lib.AppConfig> {
    private final ConfigModule module;

    public ProvideAppConfigProvidesAdapter(ConfigModule module) {
      super("com.example.lib.AppConfig", NOT_SINGLETON, "com.example.appb.ConfigModule", "provideAppConfig");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.example.lib.AppConfig>}.
     */
    @Override
    public com.example.lib.AppConfig get() {
      return module.provideAppConfig();
    }
  }
}
