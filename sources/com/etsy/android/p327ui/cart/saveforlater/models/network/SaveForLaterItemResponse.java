package com.etsy.android.p327ui.cart.saveforlater.models.network;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.cart.saveforlater.models.network.SaveForLaterItemResponse */
public final class SaveForLaterItemResponse {

    /* renamed from: a */
    public final SaveForLaterListingResponse f20649a;

    /* renamed from: b */
    public final SaveForLaterShopResponse f20650b;

    public SaveForLaterItemResponse() {
        this((SaveForLaterListingResponse) null, (SaveForLaterShopResponse) null, 3, (DefaultConstructorMarker) null);
    }

    public SaveForLaterItemResponse(@C17402n(name = "listing") SaveForLaterListingResponse saveForLaterListingResponse, @C17402n(name = "shop") SaveForLaterShopResponse saveForLaterShopResponse) {
        this.f20649a = saveForLaterListingResponse;
        this.f20650b = saveForLaterShopResponse;
    }

    public final SaveForLaterItemResponse copy(@C17402n(name = "listing") SaveForLaterListingResponse saveForLaterListingResponse, @C17402n(name = "shop") SaveForLaterShopResponse saveForLaterShopResponse) {
        return new SaveForLaterItemResponse(saveForLaterListingResponse, saveForLaterShopResponse);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveForLaterItemResponse)) {
            return false;
        }
        SaveForLaterItemResponse saveForLaterItemResponse = (SaveForLaterItemResponse) obj;
        return C19383o.m32792b(this.f20649a, saveForLaterItemResponse.f20649a) && C19383o.m32792b(this.f20650b, saveForLaterItemResponse.f20650b);
    }

    public final int hashCode() {
        SaveForLaterListingResponse saveForLaterListingResponse = this.f20649a;
        int i = 0;
        int hashCode = (saveForLaterListingResponse == null ? 0 : saveForLaterListingResponse.hashCode()) * 31;
        SaveForLaterShopResponse saveForLaterShopResponse = this.f20650b;
        if (saveForLaterShopResponse != null) {
            i = saveForLaterShopResponse.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SaveForLaterItemResponse(listing=");
        h.append(this.f20649a);
        h.append(", shop=");
        h.append(this.f20650b);
        h.append(')');
        return h.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SaveForLaterItemResponse(SaveForLaterListingResponse saveForLaterListingResponse, SaveForLaterShopResponse saveForLaterShopResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : saveForLaterListingResponse, (i & 2) != 0 ? null : saveForLaterShopResponse);
    }
}
