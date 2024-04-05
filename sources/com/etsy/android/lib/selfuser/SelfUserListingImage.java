package com.etsy.android.lib.selfuser;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class SelfUserListingImage {

    /* renamed from: a */
    public final String f19494a;

    /* renamed from: b */
    public final Integer f19495b;

    /* renamed from: c */
    public final Integer f19496c;

    /* renamed from: d */
    public final Integer f19497d;

    public SelfUserListingImage(@C17402n(name = "url_fullxfull") String str, @C17402n(name = "hue") Integer num, @C17402n(name = "saturation") Integer num2, @C17402n(name = "brightness") Integer num3) {
        this.f19494a = str;
        this.f19495b = num;
        this.f19496c = num2;
        this.f19497d = num3;
    }

    public final SelfUserListingImage copy(@C17402n(name = "url_fullxfull") String str, @C17402n(name = "hue") Integer num, @C17402n(name = "saturation") Integer num2, @C17402n(name = "brightness") Integer num3) {
        return new SelfUserListingImage(str, num, num2, num3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelfUserListingImage)) {
            return false;
        }
        SelfUserListingImage selfUserListingImage = (SelfUserListingImage) obj;
        return C19383o.m32792b(this.f19494a, selfUserListingImage.f19494a) && C19383o.m32792b(this.f19495b, selfUserListingImage.f19495b) && C19383o.m32792b(this.f19496c, selfUserListingImage.f19496c) && C19383o.m32792b(this.f19497d, selfUserListingImage.f19497d);
    }

    public final int hashCode() {
        String str = this.f19494a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f19495b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f19496c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f19497d;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SelfUserListingImage(url=");
        h.append(this.f19494a);
        h.append(", hue=");
        h.append(this.f19495b);
        h.append(", saturation=");
        h.append(this.f19496c);
        h.append(", brightness=");
        return C0023f.m109j(h, this.f19497d, ')');
    }
}
