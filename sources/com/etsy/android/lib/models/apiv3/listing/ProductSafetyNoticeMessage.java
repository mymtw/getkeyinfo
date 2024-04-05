package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class ProductSafetyNoticeMessage {
    public static final int $stable = 0;
    private final String text;
    private final ProductSafetyNoticeType type;

    public enum ProductSafetyNoticeType {
        DISCLAIMER,
        WARNING
    }

    public ProductSafetyNoticeMessage(@C17402n(name = "message_type") ProductSafetyNoticeType productSafetyNoticeType, @C17402n(name = "message_text") String str) {
        C19383o.m32797g(productSafetyNoticeType, "type");
        C19383o.m32797g(str, "text");
        this.type = productSafetyNoticeType;
        this.text = str;
    }

    public static /* synthetic */ ProductSafetyNoticeMessage copy$default(ProductSafetyNoticeMessage productSafetyNoticeMessage, ProductSafetyNoticeType productSafetyNoticeType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            productSafetyNoticeType = productSafetyNoticeMessage.type;
        }
        if ((i & 2) != 0) {
            str = productSafetyNoticeMessage.text;
        }
        return productSafetyNoticeMessage.copy(productSafetyNoticeType, str);
    }

    public final ProductSafetyNoticeType component1() {
        return this.type;
    }

    public final String component2() {
        return this.text;
    }

    public final ProductSafetyNoticeMessage copy(@C17402n(name = "message_type") ProductSafetyNoticeType productSafetyNoticeType, @C17402n(name = "message_text") String str) {
        C19383o.m32797g(productSafetyNoticeType, "type");
        C19383o.m32797g(str, "text");
        return new ProductSafetyNoticeMessage(productSafetyNoticeType, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductSafetyNoticeMessage)) {
            return false;
        }
        ProductSafetyNoticeMessage productSafetyNoticeMessage = (ProductSafetyNoticeMessage) obj;
        return this.type == productSafetyNoticeMessage.type && C19383o.m32792b(this.text, productSafetyNoticeMessage.text);
    }

    public final String getText() {
        return this.text;
    }

    public final ProductSafetyNoticeType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.text.hashCode() + (this.type.hashCode() * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ProductSafetyNoticeMessage(type=");
        h.append(this.type);
        h.append(", text=");
        return C0391c.m1057c(h, this.text, ')');
    }
}
