// Generated by Dagger (https://dagger.dev).
package com.example.viacep.di;

import com.example.viacep.data.api.ServiceApi;
import com.example.viacep.network.ServiceProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataModule_ProvidesServiceApiFactory implements Factory<ServiceApi> {
  private final DataModule module;

  private final Provider<ServiceProvider> serviceProvider;

  public DataModule_ProvidesServiceApiFactory(DataModule module,
      Provider<ServiceProvider> serviceProvider) {
    this.module = module;
    this.serviceProvider = serviceProvider;
  }

  @Override
  public ServiceApi get() {
    return providesServiceApi(module, serviceProvider.get());
  }

  public static DataModule_ProvidesServiceApiFactory create(DataModule module,
      Provider<ServiceProvider> serviceProvider) {
    return new DataModule_ProvidesServiceApiFactory(module, serviceProvider);
  }

  public static ServiceApi providesServiceApi(DataModule instance,
      ServiceProvider serviceProvider) {
    return Preconditions.checkNotNullFromProvides(instance.providesServiceApi(serviceProvider));
  }
}
