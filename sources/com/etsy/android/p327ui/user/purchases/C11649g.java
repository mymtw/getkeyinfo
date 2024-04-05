package com.etsy.android.p327ui.user.purchases;

import android.content.res.Resources;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.currency.C8630b;
import java.text.SimpleDateFormat;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.purchases.g */
public final class C11649g {

    /* renamed from: a */
    public final Resources f25773a;

    /* renamed from: b */
    public final C8630b f25774b;

    /* renamed from: c */
    public final SimpleDateFormat f25775c;

    public C11649g(Resources resources, C8630b bVar, SimpleDateFormat simpleDateFormat) {
        C19383o.m32797g(bVar, "etsyMoneyFactory");
        this.f25773a = resources;
        this.f25774b = bVar;
        this.f25775c = simpleDateFormat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11649g)) {
            return false;
        }
        C11649g gVar = (C11649g) obj;
        return C19383o.m32792b(this.f25773a, gVar.f25773a) && C19383o.m32792b(this.f25774b, gVar.f25774b) && C19383o.m32792b(this.f25775c, gVar.f25775c);
    }

    public final int hashCode() {
        int hashCode = this.f25774b.hashCode();
        return this.f25775c.hashCode() + ((hashCode + (this.f25773a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PurchaseReceiptViewDependencies(resources=");
        h.append(this.f25773a);
        h.append(", etsyMoneyFactory=");
        h.append(this.f25774b);
        h.append(", dateFormat=");
        h.append(this.f25775c);
        h.append(')');
        return h.toString();
    }
}
