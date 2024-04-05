package com.paypal.pyplcheckout.p543di.viewmodel;

import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2870k0;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p740eq.C19011a;

/* renamed from: com.paypal.pyplcheckout.di.viewmodel.CustomViewModelFactory */
public final class CustomViewModelFactory implements C2870k0.C2872b {
    private final Map<Class<? extends C2866i0>, C19011a<C2866i0>> viewModelsMap;

    public CustomViewModelFactory(Map<Class<? extends C2866i0>, C19011a<C2866i0>> map) {
        C19383o.m32797g(map, "viewModelsMap");
        this.viewModelsMap = map;
    }

    public <T extends C2866i0> T create(Class<T> cls) {
        T t;
        C19383o.m32797g(cls, "modelClass");
        C19011a aVar = this.viewModelsMap.get(cls);
        if (aVar == null) {
            Iterator<T> it = this.viewModelsMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (cls.isAssignableFrom((Class) ((Map.Entry) t).getKey())) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) t;
            aVar = entry == null ? null : (C19011a) entry.getValue();
            if (aVar == null) {
                throw new IllegalArgumentException("ViewModel class not recognized: " + cls);
            }
        }
        try {
            T t2 = aVar.get();
            if (t2 != null) {
                return (C2866i0) t2;
            }
            throw new NullPointerException("null cannot be cast to non-null type T of com.paypal.pyplcheckout.di.viewmodel.CustomViewModelFactory.create");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
