package com.etsy.android.shophome;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.shophome.e */
public final class C8991e {

    /* renamed from: a */
    public final List<String> f19849a;

    public C8991e(ArrayList arrayList) {
        this.f19849a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8991e) && C19383o.m32792b(this.f19849a, ((C8991e) obj).f19849a);
    }

    public final int hashCode() {
        return this.f19849a.hashCode();
    }

    public final String toString() {
        return C0070b.m186i(C0072d.m201h("ListingMemberDataSpecs(listingIds="), this.f19849a, ')');
    }
}
