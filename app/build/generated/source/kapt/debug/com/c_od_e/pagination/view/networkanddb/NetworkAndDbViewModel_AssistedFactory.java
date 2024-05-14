package com.c_od_e.pagination.view.networkanddb;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.c_od_e.pagination.data.CatsRepository;
import java.lang.Override;
import javax.inject.Inject;
import javax.inject.Provider;

public final class NetworkAndDbViewModel_AssistedFactory implements ViewModelAssistedFactory<NetworkAndDbViewModel> {
  private final Provider<CatsRepository> repository;

  @Inject
  NetworkAndDbViewModel_AssistedFactory(Provider<CatsRepository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public NetworkAndDbViewModel create(SavedStateHandle arg0) {
    return new NetworkAndDbViewModel(repository.get());
  }
}
