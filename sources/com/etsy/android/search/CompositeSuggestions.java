package com.etsy.android.search;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.search.GiftGuide;
import com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class CompositeSuggestions {

    /* renamed from: a */
    public final List<String> f19775a;

    /* renamed from: b */
    public final ShopsResponse f19776b;

    /* renamed from: c */
    public final List<GiftGuide> f19777c;

    /* renamed from: d */
    public final List<SearchLandingSuggestions.RecentlyViewed> f19778d;

    @C17403o(generateAdapter = true)
    public static final class RecentlyViewed {

        /* renamed from: a */
        public final String f19779a;

        /* renamed from: b */
        public final boolean f19780b;

        /* renamed from: c */
        public final String f19781c;

        /* renamed from: d */
        public final C8968a f19782d;

        /* renamed from: com.etsy.android.search.CompositeSuggestions$RecentlyViewed$a */
        public static final class C8968a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C8968a)) {
                    return false;
                }
                ((C8968a) obj).getClass();
                return C19383o.m32792b((Object) null, (Object) null);
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "Image(url=null)";
            }
        }

        public RecentlyViewed(String str, boolean z, String str2, C8968a aVar) {
            this.f19779a = str;
            this.f19780b = z;
            this.f19781c = str2;
            this.f19782d = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecentlyViewed)) {
                return false;
            }
            RecentlyViewed recentlyViewed = (RecentlyViewed) obj;
            return C19383o.m32792b(this.f19779a, recentlyViewed.f19779a) && this.f19780b == recentlyViewed.f19780b && C19383o.m32792b(this.f19781c, recentlyViewed.f19781c) && C19383o.m32792b(this.f19782d, recentlyViewed.f19782d);
        }

        public final int hashCode() {
            this.f19779a.hashCode();
            this.f19781c.hashCode();
            this.f19782d.getClass();
            throw null;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("RecentlyViewed(listing_id=");
            h.append(this.f19779a);
            h.append(", is_favorite=");
            h.append(this.f19780b);
            h.append(", title=");
            h.append(this.f19781c);
            h.append(", img=");
            h.append(this.f19782d);
            h.append(')');
            return h.toString();
        }
    }

    @C17403o(generateAdapter = true)
    public static final class ShopResponse {

        /* renamed from: a */
        public final String f19783a;

        /* renamed from: b */
        public final String f19784b;

        /* renamed from: c */
        public final String f19785c;

        /* renamed from: d */
        public final String f19786d;

        public ShopResponse(@C17402n(name = "shop_name") String str, @C17402n(name = "shop_owner") String str2, @C17402n(name = "shop_img") String str3, @C17402n(name = "deep_link") String str4) {
            C19383o.m32797g(str, "name");
            C19383o.m32797g(str4, "deepLink");
            this.f19783a = str;
            this.f19784b = str2;
            this.f19785c = str3;
            this.f19786d = str4;
        }

        public final ShopResponse copy(@C17402n(name = "shop_name") String str, @C17402n(name = "shop_owner") String str2, @C17402n(name = "shop_img") String str3, @C17402n(name = "deep_link") String str4) {
            C19383o.m32797g(str, "name");
            C19383o.m32797g(str4, "deepLink");
            return new ShopResponse(str, str2, str3, str4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShopResponse)) {
                return false;
            }
            ShopResponse shopResponse = (ShopResponse) obj;
            return C19383o.m32792b(this.f19783a, shopResponse.f19783a) && C19383o.m32792b(this.f19784b, shopResponse.f19784b) && C19383o.m32792b(this.f19785c, shopResponse.f19785c) && C19383o.m32792b(this.f19786d, shopResponse.f19786d);
        }

        public final int hashCode() {
            int hashCode = this.f19783a.hashCode() * 31;
            String str = this.f19784b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f19785c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return this.f19786d.hashCode() + ((hashCode2 + i) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ShopResponse(name=");
            h.append(this.f19783a);
            h.append(", owner=");
            h.append(this.f19784b);
            h.append(", imageUrl=");
            h.append(this.f19785c);
            h.append(", deepLink=");
            return C0391c.m1057c(h, this.f19786d, ')');
        }
    }

    @C17403o(generateAdapter = true)
    public static final class ShopsResponse {

        /* renamed from: a */
        public final List<ShopResponse> f19787a;

        /* renamed from: b */
        public final String f19788b;

        public ShopsResponse(@C17402n(name = "shops") List<ShopResponse> list, @C17402n(name = "more_shops_link") String str) {
            this.f19787a = list;
            this.f19788b = str;
        }

        public final ShopsResponse copy(@C17402n(name = "shops") List<ShopResponse> list, @C17402n(name = "more_shops_link") String str) {
            return new ShopsResponse(list, str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShopsResponse)) {
                return false;
            }
            ShopsResponse shopsResponse = (ShopsResponse) obj;
            return C19383o.m32792b(this.f19787a, shopsResponse.f19787a) && C19383o.m32792b(this.f19788b, shopsResponse.f19788b);
        }

        public final int hashCode() {
            List<ShopResponse> list = this.f19787a;
            int i = 0;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.f19788b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ShopsResponse(shops=");
            h.append(this.f19787a);
            h.append(", moreShopsLink=");
            return C0391c.m1057c(h, this.f19788b, ')');
        }
    }

    public CompositeSuggestions(@C17402n(name = "autosuggest") List<String> list, @C17402n(name = "shop_search") ShopsResponse shopsResponse, @C17402n(name = "gift_guides") List<GiftGuide> list2, @C17402n(name = "recently_viewed") List<SearchLandingSuggestions.RecentlyViewed> list3) {
        this.f19775a = list;
        this.f19776b = shopsResponse;
        this.f19777c = list2;
        this.f19778d = list3;
    }

    public final CompositeSuggestions copy(@C17402n(name = "autosuggest") List<String> list, @C17402n(name = "shop_search") ShopsResponse shopsResponse, @C17402n(name = "gift_guides") List<GiftGuide> list2, @C17402n(name = "recently_viewed") List<SearchLandingSuggestions.RecentlyViewed> list3) {
        return new CompositeSuggestions(list, shopsResponse, list2, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeSuggestions)) {
            return false;
        }
        CompositeSuggestions compositeSuggestions = (CompositeSuggestions) obj;
        return C19383o.m32792b(this.f19775a, compositeSuggestions.f19775a) && C19383o.m32792b(this.f19776b, compositeSuggestions.f19776b) && C19383o.m32792b(this.f19777c, compositeSuggestions.f19777c) && C19383o.m32792b(this.f19778d, compositeSuggestions.f19778d);
    }

    public final int hashCode() {
        List<String> list = this.f19775a;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        ShopsResponse shopsResponse = this.f19776b;
        int hashCode2 = (hashCode + (shopsResponse == null ? 0 : shopsResponse.hashCode())) * 31;
        List<GiftGuide> list2 = this.f19777c;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<SearchLandingSuggestions.RecentlyViewed> list3 = this.f19778d;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("CompositeSuggestions(autosuggest=");
        h.append(this.f19775a);
        h.append(", shopSearch=");
        h.append(this.f19776b);
        h.append(", giftGuides=");
        h.append(this.f19777c);
        h.append(", recentlyViewed=");
        return C0070b.m186i(h, this.f19778d, ')');
    }
}
