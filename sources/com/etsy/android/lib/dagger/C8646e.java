package com.etsy.android.lib.dagger;

import androidx.compose.foundation.text.C0956j;
import com.google.firebase.installations.C16563d;
import dagger.internal.C17555d;
import p252u2.C8129j;
import p560en.C17726a;
import p568fn.C17782b;

/* renamed from: com.etsy.android.lib.dagger.e */
public final class C8646e implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19005a;

    /* renamed from: b */
    public final Object f19006b;

    public /* synthetic */ C8646e(Object obj, int i) {
        this.f19005a = i;
        this.f19006b = obj;
    }

    public final Object get() {
        C8129j jVar;
        switch (this.f19005a) {
            case 0:
                ((C0956j) this.f19006b).getClass();
                synchronized (C8129j.f17760l) {
                    jVar = C8129j.f17758j;
                    if (jVar == null) {
                        jVar = C8129j.f17759k;
                    }
                }
                if (jVar != null) {
                    return jVar;
                }
                throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
            default:
                C16563d dVar = ((C17726a) this.f19006b).f38528b;
                C17782b.m29838E(dVar);
                return dVar;
        }
    }
}
