package com.etsy.android.p327ui.cart.saveforlater.models.network;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.cart.saveforlater.models.network.SaveForLaterShopResponse */
public final class SaveForLaterShopResponse {

    /* renamed from: a */
    public final Long f20663a;

    /* renamed from: b */
    public final String f20664b;

    public SaveForLaterShopResponse() {
        this((Long) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public SaveForLaterShopResponse(@C17402n(name = "shop_id") Long l, @C17402n(name = "shop_name") String str) {
        this.f20663a = l;
        this.f20664b = str;
    }

    public final SaveForLaterShopResponse copy(@C17402n(name = "shop_id") Long l, @C17402n(name = "shop_name") String str) {
        return new SaveForLaterShopResponse(l, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveForLaterShopResponse)) {
            return false;
        }
        SaveForLaterShopResponse saveForLaterShopResponse = (SaveForLaterShopResponse) obj;
        return C19383o.m32792b(this.f20663a, saveForLaterShopResponse.f20663a) && C19383o.m32792b(this.f20664b, saveForLaterShopResponse.f20664b);
    }

    public final int hashCode() {
        Long l = this.f20663a;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.f20664b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SaveForLaterShopResponse(shopId=");
        h.append(this.f20663a);
        h.append(", shopName=");
        return C0391c.m1057c(h, this.f20664b, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SaveForLaterShopResponse(Long l, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str);
    }
}
