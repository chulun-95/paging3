package com.c_od_e.pagination.view.db;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = DataBaseViewModel.class
)
public interface DataBaseViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.c_od_e.pagination.view.db.DataBaseViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(DataBaseViewModel_AssistedFactory factory);
}
