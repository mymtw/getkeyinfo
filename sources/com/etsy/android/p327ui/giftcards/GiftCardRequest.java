package com.etsy.android.p327ui.giftcards;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.appsflyer.AppsFlyerProperties;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.giftcards.GiftCardRequest */
public final class GiftCardRequest {

    /* renamed from: a */
    public final int f21857a;

    /* renamed from: b */
    public final String f21858b;

    /* renamed from: c */
    public final String f21859c;

    /* renamed from: d */
    public final boolean f21860d;

    /* renamed from: e */
    public final Integer f21861e;

    /* renamed from: f */
    public final String f21862f;

    /* renamed from: g */
    public final String f21863g;

    /* renamed from: h */
    public final String f21864h;

    public GiftCardRequest(@C17402n(name = "amount") int i, @C17402n(name = "recipient_name") String str, @C17402n(name = "sender_name") String str2, @C17402n(name = "is_email") boolean z, @C17402n(name = "design_id") Integer num, @C17402n(name = "recipient_email") String str3, @C17402n(name = "message") String str4, @C17402n(name = "currency_code") String str5) {
        C19383o.m32797g(str, "recipientName");
        C19383o.m32797g(str2, "senderName");
        C19383o.m32797g(str3, "recipientEmail");
        C19383o.m32797g(str4, "message");
        C19383o.m32797g(str5, AppsFlyerProperties.CURRENCY_CODE);
        this.f21857a = i;
        this.f21858b = str;
        this.f21859c = str2;
        this.f21860d = z;
        this.f21861e = num;
        this.f21862f = str3;
        this.f21863g = str4;
        this.f21864h = str5;
    }

    public final GiftCardRequest copy(@C17402n(name = "amount") int i, @C17402n(name = "recipient_name") String str, @C17402n(name = "sender_name") String str2, @C17402n(name = "is_email") boolean z, @C17402n(name = "design_id") Integer num, @C17402n(name = "recipient_email") String str3, @C17402n(name = "message") String str4, @C17402n(name = "currency_code") String str5) {
        C19383o.m32797g(str, "recipientName");
        C19383o.m32797g(str2, "senderName");
        String str6 = str3;
        C19383o.m32797g(str6, "recipientEmail");
        String str7 = str4;
        C19383o.m32797g(str7, "message");
        String str8 = str5;
        C19383o.m32797g(str8, AppsFlyerProperties.CURRENCY_CODE);
        return new GiftCardRequest(i, str, str2, z, num, str6, str7, str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftCardRequest)) {
            return false;
        }
        GiftCardRequest giftCardRequest = (GiftCardRequest) obj;
        return this.f21857a == giftCardRequest.f21857a && C19383o.m32792b(this.f21858b, giftCardRequest.f21858b) && C19383o.m32792b(this.f21859c, giftCardRequest.f21859c) && this.f21860d == giftCardRequest.f21860d && C19383o.m32792b(this.f21861e, giftCardRequest.f21861e) && C19383o.m32792b(this.f21862f, giftCardRequest.f21862f) && C19383o.m32792b(this.f21863g, giftCardRequest.f21863g) && C19383o.m32792b(this.f21864h, giftCardRequest.f21864h);
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f21859c, C0023f.m105e(this.f21858b, Integer.hashCode(this.f21857a) * 31, 31), 31);
        boolean z = this.f21860d;
        if (z) {
            z = true;
        }
        int i = (e + (z ? 1 : 0)) * 31;
        Integer num = this.f21861e;
        return this.f21864h.hashCode() + C0023f.m105e(this.f21863g, C0023f.m105e(this.f21862f, (i + (num == null ? 0 : num.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("GiftCardRequest(amount=");
        h.append(this.f21857a);
        h.append(", recipientName=");
        h.append(this.f21858b);
        h.append(", senderName=");
        h.append(this.f21859c);
        h.append(", isEmail=");
        h.append(this.f21860d);
        h.append(", designId=");
        h.append(this.f21861e);
        h.append(", recipientEmail=");
        h.append(this.f21862f);
        h.append(", message=");
        h.append(this.f21863g);
        h.append(", currencyCode=");
        return C0391c.m1057c(h, this.f21864h, ')');
    }
}
