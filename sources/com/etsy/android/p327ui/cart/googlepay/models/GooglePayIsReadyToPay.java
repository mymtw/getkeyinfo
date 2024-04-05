package com.etsy.android.p327ui.cart.googlepay.models;

import android.support.p013v4.media.C0069a;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import com.squareup.moshi.C17414y;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.cart.googlepay.models.GooglePayIsReadyToPay */
public final class GooglePayIsReadyToPay {

    /* renamed from: a */
    public final int f20552a;

    /* renamed from: b */
    public final int f20553b;

    /* renamed from: c */
    public final Boolean f20554c;

    /* renamed from: d */
    public final List<GooglePayPaymentMethods> f20555d;

    public GooglePayIsReadyToPay(@C17402n(name = "apiVersion") int i, @C17402n(name = "apiVersionMinor") int i2, @C17402n(name = "existingPaymentMethodRequired") Boolean bool, @C17402n(name = "allowedPaymentMethods") List<GooglePayPaymentMethods> list) {
        C19383o.m32797g(list, "allowedPaymentMethods");
        this.f20552a = i;
        this.f20553b = i2;
        this.f20554c = bool;
        this.f20555d = list;
    }

    public final GooglePayIsReadyToPay copy(@C17402n(name = "apiVersion") int i, @C17402n(name = "apiVersionMinor") int i2, @C17402n(name = "existingPaymentMethodRequired") Boolean bool, @C17402n(name = "allowedPaymentMethods") List<GooglePayPaymentMethods> list) {
        C19383o.m32797g(list, "allowedPaymentMethods");
        return new GooglePayIsReadyToPay(i, i2, bool, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePayIsReadyToPay)) {
            return false;
        }
        GooglePayIsReadyToPay googlePayIsReadyToPay = (GooglePayIsReadyToPay) obj;
        return this.f20552a == googlePayIsReadyToPay.f20552a && this.f20553b == googlePayIsReadyToPay.f20553b && C19383o.m32792b(this.f20554c, googlePayIsReadyToPay.f20554c) && C19383o.m32792b(this.f20555d, googlePayIsReadyToPay.f20555d);
    }

    public final int hashCode() {
        int a = C0069a.m170a(this.f20553b, Integer.hashCode(this.f20552a) * 31, 31);
        Boolean bool = this.f20554c;
        return this.f20555d.hashCode() + ((a + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    public final String toString() {
        String json = new C17414y(new C17414y.C17415a()).mo68556a(GooglePayIsReadyToPay.class).toJson(this);
        C19383o.m32796f(json, "adapter.toJson(this)");
        return json;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GooglePayIsReadyToPay(int i, int i2, Boolean bool, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? null : bool, list);
    }
}
