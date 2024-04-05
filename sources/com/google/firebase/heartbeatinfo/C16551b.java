package com.google.firebase.heartbeatinfo;

import android.content.Context;
import p722ym.C18895a;

/* renamed from: com.google.firebase.heartbeatinfo.b */
public final /* synthetic */ class C16551b implements C18895a {

    /* renamed from: a */
    public final /* synthetic */ Context f36733a;

    public /* synthetic */ C16551b(Context context) {
        this.f36733a = context;
    }

    public final Object get() {
        C16554e eVar;
        Context context = this.f36733a;
        C16554e eVar2 = C16554e.f36737b;
        synchronized (C16554e.class) {
            if (C16554e.f36737b == null) {
                C16554e.f36737b = new C16554e(context);
            }
            eVar = C16554e.f36737b;
        }
        return eVar;
    }
}
