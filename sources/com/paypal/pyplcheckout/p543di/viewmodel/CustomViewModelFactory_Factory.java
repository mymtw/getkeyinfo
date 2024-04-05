package com.paypal.pyplcheckout.p543di.viewmodel;

import androidx.lifecycle.C2866i0;
import dagger.internal.C17555d;
import java.util.Map;
import p740eq.C19011a;

/* renamed from: com.paypal.pyplcheckout.di.viewmodel.CustomViewModelFactory_Factory */
public final class CustomViewModelFactory_Factory implements C17555d<CustomViewModelFactory> {
    private final C19011a<Map<Class<? extends C2866i0>, C19011a<C2866i0>>> viewModelsMapProvider;

    public CustomViewModelFactory_Factory(C19011a<Map<Class<? extends C2866i0>, C19011a<C2866i0>>> aVar) {
        this.viewModelsMapProvider = aVar;
    }

    public static CustomViewModelFactory_Factory create(C19011a<Map<Class<? extends C2866i0>, C19011a<C2866i0>>> aVar) {
        return new CustomViewModelFactory_Factory(aVar);
    }

    public static CustomViewModelFactory newInstance(Map<Class<? extends C2866i0>, C19011a<C2866i0>> map) {
        return new CustomViewModelFactory(map);
    }

    public CustomViewModelFactory get() {
        return newInstance(this.viewModelsMapProvider.get());
    }
}
