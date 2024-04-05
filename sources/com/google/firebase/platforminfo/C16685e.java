package com.google.firebase.platforminfo;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.persistence.C6591i;
import p649pm.C18396b;
import p649pm.C18409l;

/* renamed from: com.google.firebase.platforminfo.e */
public final class C16685e {

    /* renamed from: com.google.firebase.platforminfo.e$a */
    public interface C16686a<T> {
        /* renamed from: c */
        String mo3367c(Context context);
    }

    /* renamed from: a */
    public static C18396b<?> m27654a(String str, String str2) {
        C16683c create = C16683c.create(str, str2);
        C18396b.C18397a<C16683c> a = C18396b.m31103a(C16683c.class);
        a.f40469d = 1;
        a.f40470e = new C6591i(create);
        return a.mo69935b();
    }

    /* renamed from: b */
    public static C18396b<?> m27655b(String str, C16686a<Context> aVar) {
        C18396b.C18397a<C16683c> a = C18396b.m31103a(C16683c.class);
        a.f40469d = 1;
        a.mo69934a(new C18409l(1, 0, Context.class));
        a.f40470e = new C16684d(str, aVar);
        return a.mo69935b();
    }
}
