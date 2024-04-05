package com.etsy.android.p327ui.user.addresses;

import android.support.p013v4.media.C0072d;
import com.etsy.android.extensions.UnexpectedResultException;
import com.etsy.android.p327ui.user.addresses.C11463z;
import com.google.android.gms.internal.measurement.C14720l8;
import com.google.android.gms.measurement.internal.C14941c2;
import com.google.android.gms.measurement.internal.C14950d2;
import com.google.android.gms.measurement.internal.C14959e2;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p287xp.C8339g;

/* renamed from: com.etsy.android.ui.user.addresses.h */
public final class C11416h implements C8339g, C14941c2 {

    /* renamed from: b */
    public static final C11416h f25158b = new C11416h();

    /* renamed from: c */
    public static final /* synthetic */ C11416h f25159c = new C11416h();

    public Object apply(Object obj) {
        C19383o.m32797g(obj, "item");
        C11463z.C11470g gVar = (C11463z.C11470g) (!(obj instanceof C11463z.C11470g) ? null : obj);
        if (gVar != null) {
            return gVar;
        }
        StringBuilder h = C0072d.m201h("Expected value of type ");
        h.append(C11463z.C11470g.class.getSimpleName());
        h.append(", but it was ");
        h.append(obj.getClass().getSimpleName());
        throw new UnexpectedResultException(h.toString());
    }

    public Object zza() {
        List<C14950d2<?>> list = C14959e2.f33393a;
        return Long.valueOf(C14720l8.f32933c.zza().mo50697m());
    }
}
