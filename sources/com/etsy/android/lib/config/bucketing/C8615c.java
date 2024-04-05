package com.etsy.android.lib.config.bucketing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.config.bucketing.NativeConfig;
import com.etsy.android.lib.logger.C8677e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.lib.config.bucketing.c */
public final class C8615c implements C8677e.C8678a {

    /* renamed from: a */
    public final NativeConfig f18926a;

    /* renamed from: b */
    public final boolean f18927b;

    /* renamed from: c */
    public final boolean f18928c;

    /* renamed from: d */
    public final ArrayList f18929d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8615c(NativeConfig nativeConfig, boolean z, int i) {
        this(nativeConfig, z, (NativeConfig.C8609b.C8610a) null, (i & 8) != 0);
    }

    /* renamed from: a */
    public final String mo21123a() {
        return null;
    }

    /* renamed from: b */
    public final String mo21124b() {
        return "w";
    }

    /* renamed from: c */
    public final String mo21125c() {
        StringBuilder h = C0072d.m201h("native_bucketing.android.");
        h.append(this.f18926a.f18917a);
        return h.toString();
    }

    /* renamed from: e */
    public final String mo21126e() {
        return this.f18927b ? "on" : "off";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8615c)) {
            return false;
        }
        C8615c cVar = (C8615c) obj;
        if (!C19383o.m32792b(this.f18926a, cVar.f18926a) || this.f18927b != cVar.f18927b) {
            return false;
        }
        cVar.getClass();
        return C19383o.m32792b((Object) null, (Object) null) && this.f18928c == cVar.f18928c;
    }

    /* renamed from: f */
    public final List<C8677e.C8678a> mo21128f() {
        return this.f18929d;
    }

    public final int hashCode() {
        int hashCode = this.f18926a.hashCode() * 31;
        boolean z = this.f18927b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (((hashCode + (z ? 1 : 0)) * 31) + 0) * 31;
        boolean z3 = this.f18928c;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("NativeConfigBucketingResult(nativeConfig=");
        h.append(this.f18926a);
        h.append(", isBucketed=");
        h.append(this.f18927b);
        h.append(", variant=");
        h.append((Object) null);
        h.append(", trackResult=");
        return C0391c.m1058d(h, this.f18928c, ')');
    }

    public C8615c(NativeConfig nativeConfig, boolean z, NativeConfig.C8609b.C8610a aVar, boolean z2) {
        C19383o.m32797g(nativeConfig, "nativeConfig");
        this.f18926a = nativeConfig;
        this.f18927b = z;
        this.f18928c = z2;
        this.f18929d = new ArrayList();
    }
}
