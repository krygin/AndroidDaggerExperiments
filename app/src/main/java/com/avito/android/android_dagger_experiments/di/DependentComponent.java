package com.avito.android.android_dagger_experiments.di;

import com.avito.android.android_dagger_experiments.AndroidDaggerExperimentsApplication;

import dagger.Component;

@Component(modules = DependentComponentModule.class)
public interface DependentComponent {
    void inject(AndroidDaggerExperimentsApplication application);

}
