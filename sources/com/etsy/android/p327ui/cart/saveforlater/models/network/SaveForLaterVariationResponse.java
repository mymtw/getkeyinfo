package com.etsy.android.p327ui.cart.saveforlater.models.network;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.cart.saveforlater.models.network.SaveForLaterVariationResponse */
public final class SaveForLaterVariationResponse {

    /* renamed from: a */
    public final Long f20665a;

    /* renamed from: b */
    public final Long f20666b;

    /* renamed from: c */
    public final String f20667c;

    /* renamed from: d */
    public final String f20668d;

    /* renamed from: e */
    public final Boolean f20669e;

    public SaveForLaterVariationResponse() {
        this((Long) null, (Long) null, (String) null, (String) null, (Boolean) null, 31, (DefaultConstructorMarker) null);
    }

    public SaveForLaterVariationResponse(@C17402n(name = "property_id") Long l, @C17402n(name = "value_id") Long l2, @C17402n(name = "formatted_name") String str, @C17402n(name = "formatted_value") String str2, @C17402n(name = "is_valid") Boolean bool) {
        this.f20665a = l;
        this.f20666b = l2;
        this.f20667c = str;
        this.f20668d = str2;
        this.f20669e = bool;
    }

    public final SaveForLaterVariationResponse copy(@C17402n(name = "property_id") Long l, @C17402n(name = "value_id") Long l2, @C17402n(name = "formatted_name") String str, @C17402n(name = "formatted_value") String str2, @C17402n(name = "is_valid") Boolean bool) {
        return new SaveForLaterVariationResponse(l, l2, str, str2, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveForLaterVariationResponse)) {
            return false;
        }
        SaveForLaterVariationResponse saveForLaterVariationResponse = (SaveForLaterVariationResponse) obj;
        return C19383o.m32792b(this.f20665a, saveForLaterVariationResponse.f20665a) && C19383o.m32792b(this.f20666b, saveForLaterVariationResponse.f20666b) && C19383o.m32792b(this.f20667c, saveForLaterVariationResponse.f20667c) && C19383o.m32792b(this.f20668d, saveForLaterVariationResponse.f20668d) && C19383o.m32792b(this.f20669e, saveForLaterVariationResponse.f20669e);
    }

    public final int hashCode() {
        Long l = this.f20665a;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f20666b;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f20667c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20668d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f20669e;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SaveForLaterVariationResponse(propertyId=");
        h.append(this.f20665a);
        h.append(", valueId=");
        h.append(this.f20666b);
        h.append(", formattedName=");
        h.append(this.f20667c);
        h.append(", formattedValue=");
        h.append(this.f20668d);
        h.append(", isValid=");
        h.append(this.f20669e);
        h.append(')');
        return h.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SaveForLaterVariationResponse(java.lang.Long r5, java.lang.Long r6, java.lang.String r7, java.lang.String r8, java.lang.Boolean r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.cart.saveforlater.models.network.SaveForLaterVariationResponse.<init>(java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
