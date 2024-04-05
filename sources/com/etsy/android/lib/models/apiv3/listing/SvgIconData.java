package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class SvgIconData {
    public static final int $stable = 8;
    private final List<PaymentIcon> paymentIcons;

    public SvgIconData(@C17402n(name = "payment_icons") List<PaymentIcon> list) {
        this.paymentIcons = list;
    }

    public static /* synthetic */ SvgIconData copy$default(SvgIconData svgIconData, List<PaymentIcon> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = svgIconData.paymentIcons;
        }
        return svgIconData.copy(list);
    }

    public final List<PaymentIcon> component1() {
        return this.paymentIcons;
    }

    public final SvgIconData copy(@C17402n(name = "payment_icons") List<PaymentIcon> list) {
        return new SvgIconData(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SvgIconData) && C19383o.m32792b(this.paymentIcons, ((SvgIconData) obj).paymentIcons);
    }

    public final List<PaymentIcon> getPaymentIcons() {
        return this.paymentIcons;
    }

    public int hashCode() {
        List<PaymentIcon> list = this.paymentIcons;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return C0070b.m186i(C0072d.m201h("SvgIconData(paymentIcons="), this.paymentIcons, ')');
    }
}
