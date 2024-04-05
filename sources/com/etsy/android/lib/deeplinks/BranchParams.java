package com.etsy.android.lib.deeplinks;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class BranchParams {

    /* renamed from: a */
    public final Boolean f19029a;

    public BranchParams() {
        this((Boolean) null, 1, (DefaultConstructorMarker) null);
    }

    public BranchParams(@C17402n(name = "+match_guaranteed") Boolean bool) {
        this.f19029a = bool;
    }

    public final BranchParams copy(@C17402n(name = "+match_guaranteed") Boolean bool) {
        return new BranchParams(bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BranchParams) && C19383o.m32792b(this.f19029a, ((BranchParams) obj).f19029a);
    }

    public final int hashCode() {
        Boolean bool = this.f19029a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("BranchParams(matchGuaranteed=");
        h.append(this.f19029a);
        h.append(')');
        return h.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BranchParams(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool);
    }
}
