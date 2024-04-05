package com.etsy.android.p327ui.favorites.recommendations;

import android.graphics.drawable.StateListDrawable;
import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.favorites.C9895t;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.favorites.recommendations.c */
public final class C9873c {

    /* renamed from: a */
    public final String f21789a;

    /* renamed from: b */
    public final StateListDrawable f21790b;

    /* renamed from: c */
    public final C9895t f21791c;

    public C9873c() {
        this((String) null, (StateListDrawable) null, 7);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9873c(String str, StateListDrawable stateListDrawable, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : stateListDrawable, (C9895t) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9873c)) {
            return false;
        }
        C9873c cVar = (C9873c) obj;
        return C19383o.m32792b(this.f21789a, cVar.f21789a) && C19383o.m32792b(this.f21790b, cVar.f21790b) && C19383o.m32792b(this.f21791c, cVar.f21791c);
    }

    public final int hashCode() {
        String str = this.f21789a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        StateListDrawable stateListDrawable = this.f21790b;
        int hashCode2 = (hashCode + (stateListDrawable == null ? 0 : stateListDrawable.hashCode())) * 31;
        C9895t tVar = this.f21791c;
        if (tVar != null) {
            i = tVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("CollectionTab(title=");
        h.append(this.f21789a);
        h.append(", stateListDrawable=");
        h.append(this.f21790b);
        h.append(", onUpdateCollectionListener=");
        h.append(this.f21791c);
        h.append(')');
        return h.toString();
    }

    public C9873c(String str, StateListDrawable stateListDrawable, C9895t tVar) {
        this.f21789a = str;
        this.f21790b = stateListDrawable;
        this.f21791c = tVar;
    }
}
