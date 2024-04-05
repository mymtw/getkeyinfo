package com.etsy.android.p327ui.cart.saveforlater.models.network;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.cart.saveforlater.models.network.SaveForLaterCartResponse */
public final class SaveForLaterCartResponse {

    /* renamed from: a */
    public final Integer f20646a;

    /* renamed from: b */
    public final Integer f20647b;

    /* renamed from: c */
    public final List<SaveForLaterItemResponse> f20648c;

    public SaveForLaterCartResponse() {
        this((Integer) null, (Integer) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    public SaveForLaterCartResponse(@C17402n(name = "saved_count") Integer num, @C17402n(name = "cart_count") Integer num2, @C17402n(name = "sfl_listings") List<SaveForLaterItemResponse> list) {
        this.f20646a = num;
        this.f20647b = num2;
        this.f20648c = list;
    }

    public final SaveForLaterCartResponse copy(@C17402n(name = "saved_count") Integer num, @C17402n(name = "cart_count") Integer num2, @C17402n(name = "sfl_listings") List<SaveForLaterItemResponse> list) {
        return new SaveForLaterCartResponse(num, num2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveForLaterCartResponse)) {
            return false;
        }
        SaveForLaterCartResponse saveForLaterCartResponse = (SaveForLaterCartResponse) obj;
        return C19383o.m32792b(this.f20646a, saveForLaterCartResponse.f20646a) && C19383o.m32792b(this.f20647b, saveForLaterCartResponse.f20647b) && C19383o.m32792b(this.f20648c, saveForLaterCartResponse.f20648c);
    }

    public final int hashCode() {
        Integer num = this.f20646a;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f20647b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<SaveForLaterItemResponse> list = this.f20648c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SaveForLaterCartResponse(savedCount=");
        h.append(this.f20646a);
        h.append(", cartCount=");
        h.append(this.f20647b);
        h.append(", listings=");
        return C0070b.m186i(h, this.f20648c, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SaveForLaterCartResponse(Integer num, Integer num2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : list);
    }
}
