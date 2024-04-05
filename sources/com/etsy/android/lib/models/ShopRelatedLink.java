package com.etsy.android.lib.models;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class ShopRelatedLink {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String FACEBOOK_TITLE = "facebook";
    public static final String INSTAGRAM_TITLE = "instagram";
    public static final String PINTEREST_TITLE = "pinterest";
    public static final String SHOP_BLOG_TITLE = "shop-blog";
    public static final String SHOP_WEBSITE_TITLE = "shop-website";
    public static final String TWITTER_TITLE = "twitter";
    private final String title;
    private final String url;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ShopRelatedLink() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public ShopRelatedLink(String str, String str2) {
        C19383o.m32797g(str, "title");
        C19383o.m32797g(str2, "url");
        this.title = str;
        this.url = str2;
    }

    public static /* synthetic */ ShopRelatedLink copy$default(ShopRelatedLink shopRelatedLink, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shopRelatedLink.title;
        }
        if ((i & 2) != 0) {
            str2 = shopRelatedLink.url;
        }
        return shopRelatedLink.copy(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.url;
    }

    public final ShopRelatedLink copy(String str, String str2) {
        C19383o.m32797g(str, "title");
        C19383o.m32797g(str2, "url");
        return new ShopRelatedLink(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopRelatedLink)) {
            return false;
        }
        ShopRelatedLink shopRelatedLink = (ShopRelatedLink) obj;
        return C19383o.m32792b(this.title, shopRelatedLink.title) && C19383o.m32792b(this.url, shopRelatedLink.url);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ShopRelatedLink(title=");
        h.append(this.title);
        h.append(", url=");
        return C0391c.m1057c(h, this.url, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShopRelatedLink(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
