package com.etsy.android.lib.models;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class GiftCardAmountValues {
    public static final int $stable = 8;
    private final String type;
    private final List<Integer> values;

    public GiftCardAmountValues(String str, List<Integer> list) {
        C19383o.m32797g(str, "type");
        C19383o.m32797g(list, ResponseConstants.VALUES);
        this.type = str;
        this.values = list;
    }

    public static /* synthetic */ GiftCardAmountValues copy$default(GiftCardAmountValues giftCardAmountValues, String str, List<Integer> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = giftCardAmountValues.type;
        }
        if ((i & 2) != 0) {
            list = giftCardAmountValues.values;
        }
        return giftCardAmountValues.copy(str, list);
    }

    public final String component1() {
        return this.type;
    }

    public final List<Integer> component2() {
        return this.values;
    }

    public final GiftCardAmountValues copy(String str, List<Integer> list) {
        C19383o.m32797g(str, "type");
        C19383o.m32797g(list, ResponseConstants.VALUES);
        return new GiftCardAmountValues(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftCardAmountValues)) {
            return false;
        }
        GiftCardAmountValues giftCardAmountValues = (GiftCardAmountValues) obj;
        return C19383o.m32792b(this.type, giftCardAmountValues.type) && C19383o.m32792b(this.values, giftCardAmountValues.values);
    }

    public final String getType() {
        return this.type;
    }

    public final List<Integer> getValues() {
        return this.values;
    }

    public int hashCode() {
        return this.values.hashCode() + (this.type.hashCode() * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("GiftCardAmountValues(type=");
        h.append(this.type);
        h.append(", values=");
        return C0070b.m186i(h, this.values, ')');
    }
}
