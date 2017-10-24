package com.avito.android.android_dagger_experiments.di;

import com.avito.android.android_dagger_experiments.AndroidDaggerExperimentsApplication;

import dagger.Component;

@Component(dependencies = DependentComponent.class)
public interface AppComponentWithDependentComponents {

}
