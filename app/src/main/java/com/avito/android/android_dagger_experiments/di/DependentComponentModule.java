package com.avito.android.android_dagger_experiments.di;

import com.avito.android.android_dagger_experiments.SimpleDependency;

import dagger.Module;
import dagger.Provides;

@Module
public class DependentComponentModule {

    @Provides
    public SimpleDependency provideObject() {
        return new SimpleDependency();
    }
}
