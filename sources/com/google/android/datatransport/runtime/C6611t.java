package com.google.android.datatransport.runtime;

import android.content.Context;
import androidx.profileinstaller.C3068j;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6573i;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6575k;
import p108fh.C6821e;
import p132hh.C6963a;

/* renamed from: com.google.android.datatransport.runtime.t */
public final class C6611t implements C6560s {

    /* renamed from: e */
    public static volatile C6544h f14589e;

    /* renamed from: a */
    public final C6963a f14590a;

    /* renamed from: b */
    public final C6963a f14591b;

    /* renamed from: c */
    public final C6821e f14592c;

    /* renamed from: d */
    public final C6573i f14593d;

    public C6611t(C6963a aVar, C6963a aVar2, C6821e eVar, C6573i iVar, C6575k kVar) {
        this.f14590a = aVar;
        this.f14591b = aVar2;
        this.f14592c = eVar;
        this.f14593d = iVar;
        kVar.f14537a.execute(new C3068j(kVar, 1));
    }

    /* renamed from: a */
    public static C6611t m12979a() {
        C6544h hVar = f14589e;
        if (hVar != null) {
            return hVar.f14481f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: b */
    public static void m12980b(Context context) {
        if (f14589e == null) {
            synchronized (C6611t.class) {
                if (f14589e == null) {
                    context.getClass();
                    Class<Context> cls = Context.class;
                    f14589e = new C6544h(context);
                }
            }
        }
    }
}
