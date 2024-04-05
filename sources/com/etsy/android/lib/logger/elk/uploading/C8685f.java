package com.etsy.android.lib.logger.elk.uploading;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p340ea.C12663d;

/* renamed from: com.etsy.android.lib.logger.elk.uploading.f */
public final class C8685f {

    /* renamed from: a */
    public final List<C12663d> f19084a;

    public C8685f(List<C12663d> list) {
        this.f19084a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8685f) && C19383o.m32792b(this.f19084a, ((C8685f) obj).f19084a);
    }

    public final int hashCode() {
        return this.f19084a.hashCode();
    }

    public final String toString() {
        return C0070b.m186i(C0072d.m201h("ElkLogUploadSpec(logs="), this.f19084a, ')');
    }
}
