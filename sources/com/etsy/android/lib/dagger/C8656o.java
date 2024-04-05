package com.etsy.android.lib.dagger;

import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2870k0;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p740eq.C19011a;

/* renamed from: com.etsy.android.lib.dagger.o */
public final class C8656o implements C2870k0.C2872b {

    /* renamed from: a */
    public final Map<Class<? extends C2866i0>, C19011a<C2866i0>> f19028a;

    public C8656o(Map<Class<? extends C2866i0>, C19011a<C2866i0>> map) {
        C19383o.m32797g(map, "viewModelsMap");
        this.f19028a = map;
    }

    public final <T extends C2866i0> T create(Class<T> cls) {
        T t;
        C19011a aVar = this.f19028a.get(cls);
        if (aVar == null) {
            Iterator<T> it = this.f19028a.entrySet().iterator();
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
            aVar = entry != null ? (C19011a) entry.getValue() : null;
            if (aVar == null) {
                throw new IllegalArgumentException("unknown model class " + cls);
            }
        }
        try {
            T t2 = aVar.get();
            C19383o.m32795e(t2, "null cannot be cast to non-null type T of com.etsy.android.lib.dagger.ViewModelFactory.create");
            return (C2866i0) t2;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
