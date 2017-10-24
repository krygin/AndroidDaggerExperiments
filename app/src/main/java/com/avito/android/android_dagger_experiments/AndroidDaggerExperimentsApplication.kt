package com.avito.android.android_dagger_experiments

import android.app.Application
import com.avito.android.android_dagger_experiments.di.DaggerAppComponentWithDependentComponents
import com.avito.android.android_dagger_experiments.di.DaggerDependentComponent
import com.avito.android.android_dagger_experiments.di.DependentComponentModule
import javax.inject.Inject

class AndroidDaggerExperimentsApplication : Application() {

    @Inject lateinit var o: SimpleDependency

    override fun onCreate() {
        super.onCreate()
        val dependentComponent = DaggerDependentComponent
                .builder()
                .dependentComponentModule(DependentComponentModule())
                .build()

        val appComponent = DaggerAppComponentWithDependentComponents
                .builder()
                .dependentComponent(dependentComponent)
                .build()

        dependentComponent.inject(this)
    }
}