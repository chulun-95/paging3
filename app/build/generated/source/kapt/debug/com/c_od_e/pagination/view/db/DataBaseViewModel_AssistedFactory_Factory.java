// Generated by Dagger (https://dagger.dev).
package com.c_od_e.pagination.view.db;

import com.c_od_e.pagination.data.CatsRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataBaseViewModel_AssistedFactory_Factory implements Factory<DataBaseViewModel_AssistedFactory> {
  private final Provider<CatsRepository> repositoryProvider;

  public DataBaseViewModel_AssistedFactory_Factory(Provider<CatsRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public DataBaseViewModel_AssistedFactory get() {
    return newInstance(repositoryProvider);
  }

  public static DataBaseViewModel_AssistedFactory_Factory create(
      Provider<CatsRepository> repositoryProvider) {
    return new DataBaseViewModel_AssistedFactory_Factory(repositoryProvider);
  }

  public static DataBaseViewModel_AssistedFactory newInstance(Provider<CatsRepository> repository) {
    return new DataBaseViewModel_AssistedFactory(repository);
  }
}