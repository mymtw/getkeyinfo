package com.etsy.android.p327ui.user.addresses;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.addresses.i */
public final class C11418i {

    /* renamed from: a */
    public final String f25166a;

    /* renamed from: b */
    public final AddressFormatType f25167b;

    public C11418i(String str, AddressFormatType addressFormatType) {
        C19383o.m32797g(addressFormatType, "type");
        this.f25166a = str;
        this.f25167b = addressFormatType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11418i)) {
            return false;
        }
        C11418i iVar = (C11418i) obj;
        return C19383o.m32792b(this.f25166a, iVar.f25166a) && this.f25167b == iVar.f25167b;
    }

    public final int hashCode() {
        String str = this.f25166a;
        return this.f25167b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("AddressFormat(format=");
        h.append(this.f25166a);
        h.append(", type=");
        h.append(this.f25167b);
        h.append(')');
        return h.toString();
    }
}
