package com.etsy.android.p327ui.cart.googlepay.models;

import android.support.p013v4.media.C0069a;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import com.squareup.moshi.C17414y;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.cart.googlepay.models.GooglePayPaymentDataRequest */
public final class GooglePayPaymentDataRequest {

    /* renamed from: a */
    public final int f20557a;

    /* renamed from: b */
    public final int f20558b;

    /* renamed from: c */
    public final GooglePayMerchantInfo f20559c;

    /* renamed from: d */
    public final List<GooglePayPaymentMethods> f20560d;

    /* renamed from: e */
    public final GooglePayTransactionInfo f20561e;

    public GooglePayPaymentDataRequest(@C17402n(name = "apiVersion") int i, @C17402n(name = "apiVersionMinor") int i2, @C17402n(name = "merchantInfo") GooglePayMerchantInfo googlePayMerchantInfo, @C17402n(name = "allowedPaymentMethods") List<GooglePayPaymentMethods> list, @C17402n(name = "transactionInfo") GooglePayTransactionInfo googlePayTransactionInfo) {
        C19383o.m32797g(list, "allowedPaymentMethods");
        this.f20557a = i;
        this.f20558b = i2;
        this.f20559c = googlePayMerchantInfo;
        this.f20560d = list;
        this.f20561e = googlePayTransactionInfo;
    }

    public final GooglePayPaymentDataRequest copy(@C17402n(name = "apiVersion") int i, @C17402n(name = "apiVersionMinor") int i2, @C17402n(name = "merchantInfo") GooglePayMerchantInfo googlePayMerchantInfo, @C17402n(name = "allowedPaymentMethods") List<GooglePayPaymentMethods> list, @C17402n(name = "transactionInfo") GooglePayTransactionInfo googlePayTransactionInfo) {
        C19383o.m32797g(list, "allowedPaymentMethods");
        return new GooglePayPaymentDataRequest(i, i2, googlePayMerchantInfo, list, googlePayTransactionInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePayPaymentDataRequest)) {
            return false;
        }
        GooglePayPaymentDataRequest googlePayPaymentDataRequest = (GooglePayPaymentDataRequest) obj;
        return this.f20557a == googlePayPaymentDataRequest.f20557a && this.f20558b == googlePayPaymentDataRequest.f20558b && C19383o.m32792b(this.f20559c, googlePayPaymentDataRequest.f20559c) && C19383o.m32792b(this.f20560d, googlePayPaymentDataRequest.f20560d) && C19383o.m32792b(this.f20561e, googlePayPaymentDataRequest.f20561e);
    }

    public final int hashCode() {
        int a = C0069a.m170a(this.f20558b, Integer.hashCode(this.f20557a) * 31, 31);
        GooglePayMerchantInfo googlePayMerchantInfo = this.f20559c;
        int i = 0;
        int g = C13983i.m21488g(this.f20560d, (a + (googlePayMerchantInfo == null ? 0 : googlePayMerchantInfo.hashCode())) * 31, 31);
        GooglePayTransactionInfo googlePayTransactionInfo = this.f20561e;
        if (googlePayTransactionInfo != null) {
            i = googlePayTransactionInfo.hashCode();
        }
        return g + i;
    }

    public final String toString() {
        String json = new C17414y(new C17414y.C17415a()).mo68556a(GooglePayPaymentDataRequest.class).toJson(this);
        C19383o.m32796f(json, "adapter.toJson(this)");
        return json;
    }
}
