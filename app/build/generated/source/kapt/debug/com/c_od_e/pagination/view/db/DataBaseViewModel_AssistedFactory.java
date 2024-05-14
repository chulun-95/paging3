package com.c_od_e.pagination.view.db;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.c_od_e.pagination.data.CatsRepository;
import java.lang.Override;
import javax.inject.Inject;
import javax.inject.Provider;

public final class DataBaseViewModel_AssistedFactory implements ViewModelAssistedFactory<DataBaseViewModel> {
  private final Provider<CatsRepository> repository;

  @Inject
  DataBaseViewModel_AssistedFactory(Provider<CatsRepository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public DataBaseViewModel create(SavedStateHandle arg0) {
    return new DataBaseViewModel(repository.get());
  }
}
