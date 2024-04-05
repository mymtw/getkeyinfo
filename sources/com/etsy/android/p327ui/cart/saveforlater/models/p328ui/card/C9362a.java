package com.etsy.android.p327ui.cart.saveforlater.models.p328ui.card;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.cart.saveforlater.models.p328ui.SaveForLaterViewType;
import java.util.UUID;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p308ac.C8497a;

/* renamed from: com.etsy.android.ui.cart.saveforlater.models.ui.card.a */
public final class C9362a implements C8497a {

    /* renamed from: a */
    public final String f20673a;

    /* renamed from: b */
    public final String f20674b;

    /* renamed from: c */
    public final String f20675c;

    /* renamed from: d */
    public final boolean f20676d;

    /* renamed from: e */
    public final SaveForLaterViewType f20677e = SaveForLaterViewType.CARD;

    public C9362a(String str, String str2, boolean z) {
        String uuid = UUID.randomUUID().toString();
        C19383o.m32796f(uuid, "randomUUID().toString()");
        C19383o.m32797g(str, "listingName");
        this.f20673a = uuid;
        this.f20674b = str;
        this.f20675c = str2;
        this.f20676d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9362a)) {
            return false;
        }
        C9362a aVar = (C9362a) obj;
        return C19383o.m32792b(this.f20673a, aVar.f20673a) && C19383o.m32792b(this.f20674b, aVar.f20674b) && C19383o.m32792b(this.f20675c, aVar.f20675c) && this.f20676d == aVar.f20676d;
    }

    public final String getId() {
        return this.f20673a;
    }

    public final SaveForLaterViewType getViewType() {
        return this.f20677e;
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f20675c, C0023f.m105e(this.f20674b, this.f20673a.hashCode() * 31, 31), 31);
        boolean z = this.f20676d;
        if (z) {
            z = true;
        }
        return e + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SflCardUiModel(id=");
        h.append(this.f20673a);
        h.append(", listingName=");
        h.append(this.f20674b);
        h.append(", fromShopText=");
        h.append(this.f20675c);
        h.append(", shouldShowPlusShipping=");
        return C0391c.m1058d(h, this.f20676d, ')');
    }
}
