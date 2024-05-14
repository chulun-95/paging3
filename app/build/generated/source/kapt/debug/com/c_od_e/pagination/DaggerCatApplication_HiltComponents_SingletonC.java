// Generated by Dagger (https://dagger.dev).
package com.c_od_e.pagination;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.c_od_e.pagination.data.CatsRepository;
import com.c_od_e.pagination.db.CatDatabase;
import com.c_od_e.pagination.di.DbModule;
import com.c_od_e.pagination.di.DbModule_ProvideDbFactory;
import com.c_od_e.pagination.di.NetworkModule;
import com.c_od_e.pagination.di.NetworkModule_ProvideAuthInterceptorFactory;
import com.c_od_e.pagination.di.NetworkModule_ProvideLoggingInterceptorFactory;
import com.c_od_e.pagination.di.NetworkModule_ProvideMoshiFactory;
import com.c_od_e.pagination.di.NetworkModule_ProvideOkHttpFactory;
import com.c_od_e.pagination.di.NetworkModule_ProvideRetrofitFactory;
import com.c_od_e.pagination.di.NetworkModule_ProvideSiliconApiFactory;
import com.c_od_e.pagination.network.CatApi;
import com.c_od_e.pagination.view.MainActivity;
import com.c_od_e.pagination.view.db.DataBaseViewModel_AssistedFactory;
import com.c_od_e.pagination.view.db.DataBaseViewModel_AssistedFactory_Factory;
import com.c_od_e.pagination.view.db.DatabaseActivity;
import com.c_od_e.pagination.view.network.NetworkOnlyActivity;
import com.c_od_e.pagination.view.network.NetworkOnlyViewModel_AssistedFactory;
import com.c_od_e.pagination.view.network.NetworkOnlyViewModel_AssistedFactory_Factory;
import com.c_od_e.pagination.view.networkanddb.NetworkAndDatabaseActivity;
import com.c_od_e.pagination.view.networkanddb.NetworkAndDbViewModel_AssistedFactory;
import com.c_od_e.pagination.view.networkanddb.NetworkAndDbViewModel_AssistedFactory_Factory;
import com.squareup.moshi.Moshi;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerCatApplication_HiltComponents_SingletonC extends CatApplication_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object moshi = new MemoizedSentinel();

  private volatile Object httpLoggingInterceptor = new MemoizedSentinel();

  private volatile Object authInterceptorInterceptor = new MemoizedSentinel();

  private volatile Object callFactory = new MemoizedSentinel();

  private volatile Object retrofit = new MemoizedSentinel();

  private volatile Object catApi = new MemoizedSentinel();

  private volatile Object catDatabase = new MemoizedSentinel();

  private DaggerCatApplication_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private Moshi moshi() {
    Object local = moshi;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = moshi;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideMoshiFactory.provideMoshi();
          moshi = DoubleCheck.reentrantCheck(moshi, local);
        }
      }
    }
    return (Moshi) local;
  }

  private HttpLoggingInterceptor httpLoggingInterceptor() {
    Object local = httpLoggingInterceptor;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = httpLoggingInterceptor;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideLoggingInterceptorFactory.provideLoggingInterceptor();
          httpLoggingInterceptor = DoubleCheck.reentrantCheck(httpLoggingInterceptor, local);
        }
      }
    }
    return (HttpLoggingInterceptor) local;
  }

  private Interceptor authInterceptorInterceptor() {
    Object local = authInterceptorInterceptor;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = authInterceptorInterceptor;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideAuthInterceptorFactory.provideAuthInterceptor();
          authInterceptorInterceptor = DoubleCheck.reentrantCheck(authInterceptorInterceptor, local);
        }
      }
    }
    return (Interceptor) local;
  }

  private Call.Factory callFactory() {
    Object local = callFactory;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = callFactory;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideOkHttpFactory.provideOkHttp(httpLoggingInterceptor(), authInterceptorInterceptor());
          callFactory = DoubleCheck.reentrantCheck(callFactory, local);
        }
      }
    }
    return (Call.Factory) local;
  }

  private Retrofit retrofit() {
    Object local = retrofit;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = retrofit;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideRetrofitFactory.provideRetrofit(moshi(), callFactory());
          retrofit = DoubleCheck.reentrantCheck(retrofit, local);
        }
      }
    }
    return (Retrofit) local;
  }

  private CatApi catApi() {
    Object local = catApi;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = catApi;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideSiliconApiFactory.provideSiliconApi(retrofit());
          catApi = DoubleCheck.reentrantCheck(catApi, local);
        }
      }
    }
    return (CatApi) local;
  }

  private CatDatabase catDatabase() {
    Object local = catDatabase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = catDatabase;
        if (local instanceof MemoizedSentinel) {
          local = DbModule_ProvideDbFactory.provideDb(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          catDatabase = DoubleCheck.reentrantCheck(catDatabase, local);
        }
      }
    }
    return (CatDatabase) local;
  }

  @Override
  public void injectCatApplication(CatApplication catApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder dbModule(DbModule dbModule) {
      Preconditions.checkNotNull(dbModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder networkModule(NetworkModule networkModule) {
      Preconditions.checkNotNull(networkModule);
      return this;
    }

    public CatApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerCatApplication_HiltComponents_SingletonC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements CatApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public CatApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends CatApplication_HiltComponents.ActivityRetainedC {
    private volatile Object lifecycle = new MemoizedSentinel();

    private ActivityRetainedCImpl() {

    }

    private Object lifecycle() {
      Object local = lifecycle;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = lifecycle;
          if (local instanceof MemoizedSentinel) {
            local = ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();
            lifecycle = DoubleCheck.reentrantCheck(lifecycle, local);
          }
        }
      }
      return (Object) local;
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycle();
    }

    private final class ActivityCBuilder implements CatApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public CatApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends CatApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<CatsRepository> catsRepositoryProvider;

      private volatile Provider<DataBaseViewModel_AssistedFactory> dataBaseViewModel_AssistedFactoryProvider;

      private volatile Provider<NetworkAndDbViewModel_AssistedFactory> networkAndDbViewModel_AssistedFactoryProvider;

      private volatile Provider<NetworkOnlyViewModel_AssistedFactory> networkOnlyViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private CatsRepository catsRepository() {
        return new CatsRepository(DaggerCatApplication_HiltComponents_SingletonC.this.catApi(), DaggerCatApplication_HiltComponents_SingletonC.this.catDatabase());
      }

      private Provider<CatsRepository> catsRepositoryProvider() {
        Object local = catsRepositoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          catsRepositoryProvider = (Provider<CatsRepository>) local;
        }
        return (Provider<CatsRepository>) local;
      }

      private DataBaseViewModel_AssistedFactory dataBaseViewModel_AssistedFactory() {
        return DataBaseViewModel_AssistedFactory_Factory.newInstance(catsRepositoryProvider());
      }

      private Provider<DataBaseViewModel_AssistedFactory> dataBaseViewModel_AssistedFactoryProvider(
          ) {
        Object local = dataBaseViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          dataBaseViewModel_AssistedFactoryProvider = (Provider<DataBaseViewModel_AssistedFactory>) local;
        }
        return (Provider<DataBaseViewModel_AssistedFactory>) local;
      }

      private NetworkAndDbViewModel_AssistedFactory networkAndDbViewModel_AssistedFactory() {
        return NetworkAndDbViewModel_AssistedFactory_Factory.newInstance(catsRepositoryProvider());
      }

      private Provider<NetworkAndDbViewModel_AssistedFactory> networkAndDbViewModel_AssistedFactoryProvider(
          ) {
        Object local = networkAndDbViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(2);
          networkAndDbViewModel_AssistedFactoryProvider = (Provider<NetworkAndDbViewModel_AssistedFactory>) local;
        }
        return (Provider<NetworkAndDbViewModel_AssistedFactory>) local;
      }

      private NetworkOnlyViewModel_AssistedFactory networkOnlyViewModel_AssistedFactory() {
        return NetworkOnlyViewModel_AssistedFactory_Factory.newInstance(catsRepositoryProvider());
      }

      private Provider<NetworkOnlyViewModel_AssistedFactory> networkOnlyViewModel_AssistedFactoryProvider(
          ) {
        Object local = networkOnlyViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(3);
          networkOnlyViewModel_AssistedFactoryProvider = (Provider<NetworkOnlyViewModel_AssistedFactory>) local;
        }
        return (Provider<NetworkOnlyViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> mapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return MapBuilder.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>newMapBuilder(3).put("com.c_od_e.pagination.view.db.DataBaseViewModel", (Provider) dataBaseViewModel_AssistedFactoryProvider()).put("com.c_od_e.pagination.view.networkanddb.NetworkAndDbViewModel", (Provider) networkAndDbViewModel_AssistedFactoryProvider()).put("com.c_od_e.pagination.view.network.NetworkOnlyViewModel", (Provider) networkOnlyViewModel_AssistedFactoryProvider()).build();
      }

      private ViewModelProvider.Factory provideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerCatApplication_HiltComponents_SingletonC.this.applicationContextModule), mapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectMainActivity(MainActivity arg0) {
      }

      @Override
      public void injectDatabaseActivity(DatabaseActivity arg0) {
      }

      @Override
      public void injectNetworkOnlyActivity(NetworkOnlyActivity arg0) {
      }

      @Override
      public void injectNetworkAndDatabaseActivity(NetworkAndDatabaseActivity arg0) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(provideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements CatApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public CatApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends CatApplication_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory provideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerCatApplication_HiltComponents_SingletonC.this.applicationContextModule), ActivityCImpl.this.mapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(provideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements CatApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public CatApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends CatApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements CatApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public CatApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends CatApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.c_od_e.pagination.view.db.DataBaseViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.dataBaseViewModel_AssistedFactory();

            case 1: // com.c_od_e.pagination.data.CatsRepository 
            return (T) ActivityCImpl.this.catsRepository();

            case 2: // com.c_od_e.pagination.view.networkanddb.NetworkAndDbViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.networkAndDbViewModel_AssistedFactory();

            case 3: // com.c_od_e.pagination.view.network.NetworkOnlyViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.networkOnlyViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements CatApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public CatApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends CatApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }
}