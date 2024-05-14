package com.c_od_e.pagination.view.network;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.c_od_e.pagination.data.CatsRepository;
import java.lang.Override;
import javax.inject.Inject;
import javax.inject.Provider;

public final class NetworkOnlyViewModel_AssistedFactory implements ViewModelAssistedFactory<NetworkOnlyViewModel> {
  private final Provider<CatsRepository> repository;

  @Inject
  NetworkOnlyViewModel_AssistedFactory(Provider<CatsRepository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public NetworkOnlyViewModel create(SavedStateHandle arg0) {
    return new NetworkOnlyViewModel(repository.get());
  }
}
