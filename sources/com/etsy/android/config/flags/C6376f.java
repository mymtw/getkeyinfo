package com.etsy.android.config.flags;

import com.etsy.android.lib.logger.AnalyticsLogDatabaseHelper;
import dagger.internal.C17555d;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p409o9.C13120b;
import p514bk.C14088a;

/* renamed from: com.etsy.android.config.flags.f */
public final class C6376f implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f14202a;

    /* renamed from: b */
    public final Object f14203b;

    public /* synthetic */ C6376f(Object obj, int i) {
        this.f14202a = i;
        this.f14203b = obj;
    }

    public final Object get() {
        switch (this.f14202a) {
            case 0:
                ((C19388s) this.f14203b).getClass();
                return new C6343a(C19318k.m32620l1(C13120b.f28847a));
            default:
                ((C14088a) this.f14203b).getClass();
                AnalyticsLogDatabaseHelper instance = AnalyticsLogDatabaseHelper.getInstance();
                C19383o.m32796f(instance, "getInstance()");
                return instance;
        }
    }
}
