package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class ProductSafetyNotice {
    public static final int $stable = 8;
    private final String message;
    private final List<ProductSafetyNoticeMessage> messages;
    private final String title;

    public ProductSafetyNotice(@C17402n(name = "title") String str, @C17402n(name = "message") String str2, @C17402n(name = "messages") List<ProductSafetyNoticeMessage> list) {
        C19383o.m32797g(str, "title");
        C19383o.m32797g(list, ResponseConstants.MESSAGES);
        this.title = str;
        this.message = str2;
        this.messages = list;
    }

    public static /* synthetic */ ProductSafetyNotice copy$default(ProductSafetyNotice productSafetyNotice, String str, String str2, List<ProductSafetyNoticeMessage> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productSafetyNotice.title;
        }
        if ((i & 2) != 0) {
            str2 = productSafetyNotice.message;
        }
        if ((i & 4) != 0) {
            list = productSafetyNotice.messages;
        }
        return productSafetyNotice.copy(str, str2, list);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.message;
    }

    public final List<ProductSafetyNoticeMessage> component3() {
        return this.messages;
    }

    public final ProductSafetyNotice copy(@C17402n(name = "title") String str, @C17402n(name = "message") String str2, @C17402n(name = "messages") List<ProductSafetyNoticeMessage> list) {
        C19383o.m32797g(str, "title");
        C19383o.m32797g(list, ResponseConstants.MESSAGES);
        return new ProductSafetyNotice(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductSafetyNotice)) {
            return false;
        }
        ProductSafetyNotice productSafetyNotice = (ProductSafetyNotice) obj;
        return C19383o.m32792b(this.title, productSafetyNotice.title) && C19383o.m32792b(this.message, productSafetyNotice.message) && C19383o.m32792b(this.messages, productSafetyNotice.messages);
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<ProductSafetyNoticeMessage> getMessages() {
        return this.messages;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.message;
        return this.messages.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ProductSafetyNotice(title=");
        h.append(this.title);
        h.append(", message=");
        h.append(this.message);
        h.append(", messages=");
        return C0070b.m186i(h, this.messages, ')');
    }
}
