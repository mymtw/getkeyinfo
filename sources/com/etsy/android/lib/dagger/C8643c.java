package com.etsy.android.lib.dagger;

import androidx.compose.foundation.text.C0956j;
import com.etsy.android.lib.util.CrashUtil;
import com.google.firebase.perf.config.C16594a;
import dagger.internal.C17555d;
import p560en.C17726a;
import p568fn.C17782b;

/* renamed from: com.etsy.android.lib.dagger.c */
public final class C8643c implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f19002a;

    /* renamed from: b */
    public final Object f19003b;

    public /* synthetic */ C8643c(Object obj, int i) {
        this.f19002a = i;
        this.f19003b = obj;
    }

    public final Object get() {
        switch (this.f19002a) {
            case 0:
                ((C0956j) this.f19003b).getClass();
                CrashUtil a = CrashUtil.m17307a();
                C17782b.m29841G(a);
                return a;
            default:
                ((C17726a) this.f19003b).getClass();
                C16594a e = C16594a.m27423e();
                C17782b.m29838E(e);
                return e;
        }
    }
}
