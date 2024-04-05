package com.etsy.android.lib.models.apiv3.search;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class SearchLandingSuggestions {
    public static final int $stable = 8;
    private final List<TaxonomyNode> categories;
    private final List<GiftGuide> giftGuides;
    private final List<Query> popularSearches;
    private final PurchaseGiftCard purchaseGiftCard;
    private final List<Query> recentSearches;
    private final List<RecentlyViewed> recentlyViewed;
    private final List<SavableSearchQuery> savedSearches;

    @C17403o(generateAdapter = true)
    public static final class PurchaseGiftCard {
        public static final int $stable = 0;
        private final boolean eligible;
        private final String imageUrl;

        public PurchaseGiftCard(@C17402n(name = "eligible") boolean z, @C17402n(name = "image") String str) {
            C19383o.m32797g(str, "imageUrl");
            this.eligible = z;
            this.imageUrl = str;
        }

        public static /* synthetic */ PurchaseGiftCard copy$default(PurchaseGiftCard purchaseGiftCard, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = purchaseGiftCard.eligible;
            }
            if ((i & 2) != 0) {
                str = purchaseGiftCard.imageUrl;
            }
            return purchaseGiftCard.copy(z, str);
        }

        public final boolean component1() {
            return this.eligible;
        }

        public final String component2() {
            return this.imageUrl;
        }

        public final PurchaseGiftCard copy(@C17402n(name = "eligible") boolean z, @C17402n(name = "image") String str) {
            C19383o.m32797g(str, "imageUrl");
            return new PurchaseGiftCard(z, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PurchaseGiftCard)) {
                return false;
            }
            PurchaseGiftCard purchaseGiftCard = (PurchaseGiftCard) obj;
            return this.eligible == purchaseGiftCard.eligible && C19383o.m32792b(this.imageUrl, purchaseGiftCard.imageUrl);
        }

        public final boolean getEligible() {
            return this.eligible;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public int hashCode() {
            boolean z = this.eligible;
            if (z) {
                z = true;
            }
            return this.imageUrl.hashCode() + ((z ? 1 : 0) * true);
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("PurchaseGiftCard(eligible=");
            h.append(this.eligible);
            h.append(", imageUrl=");
            return C0391c.m1057c(h, this.imageUrl, ')');
        }
    }

    @C17403o(generateAdapter = true)
    public static final class RecentSearch {
        public static final int $stable = 0;
        private final String query;

        public RecentSearch(@C17402n(name = "query") String str) {
            C19383o.m32797g(str, "query");
            this.query = str;
        }

        public static /* synthetic */ RecentSearch copy$default(RecentSearch recentSearch, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = recentSearch.query;
            }
            return recentSearch.copy(str);
        }

        public final String component1() {
            return this.query;
        }

        public final RecentSearch copy(@C17402n(name = "query") String str) {
            C19383o.m32797g(str, "query");
            return new RecentSearch(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RecentSearch) && C19383o.m32792b(this.query, ((RecentSearch) obj).query);
        }

        public final String getQuery() {
            return this.query;
        }

        public int hashCode() {
            return this.query.hashCode();
        }

        public String toString() {
            return C0391c.m1057c(C0072d.m201h("RecentSearch(query="), this.query, ')');
        }
    }

    @C17403o(generateAdapter = true)
    public static final class RecentlyViewed {
        public static final int $stable = 0;
        private final Image img;
        private final boolean is_favorite;
        private final String listing_id;
        private final String title;

        @C17403o(generateAdapter = true)
        public static final class Image {
            public static final int $stable = 0;
            private final String url;

            public Image(String str) {
                C19383o.m32797g(str, "url");
                this.url = str;
            }

            public static /* synthetic */ Image copy$default(Image image, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = image.url;
                }
                return image.copy(str);
            }

            public final String component1() {
                return this.url;
            }

            public final Image copy(String str) {
                C19383o.m32797g(str, "url");
                return new Image(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Image) && C19383o.m32792b(this.url, ((Image) obj).url);
            }

            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                return this.url.hashCode();
            }

            public String toString() {
                return C0391c.m1057c(C0072d.m201h("Image(url="), this.url, ')');
            }
        }

        public RecentlyViewed(String str, boolean z, String str2, Image image) {
            C19383o.m32797g(str, "listing_id");
            C19383o.m32797g(str2, "title");
            C19383o.m32797g(image, ResponseConstants.IMG);
            this.listing_id = str;
            this.is_favorite = z;
            this.title = str2;
            this.img = image;
        }

        public static /* synthetic */ RecentlyViewed copy$default(RecentlyViewed recentlyViewed, String str, boolean z, String str2, Image image, int i, Object obj) {
            if ((i & 1) != 0) {
                str = recentlyViewed.listing_id;
            }
            if ((i & 2) != 0) {
                z = recentlyViewed.is_favorite;
            }
            if ((i & 4) != 0) {
                str2 = recentlyViewed.title;
            }
            if ((i & 8) != 0) {
                image = recentlyViewed.img;
            }
            return recentlyViewed.copy(str, z, str2, image);
        }

        public final String component1() {
            return this.listing_id;
        }

        public final boolean component2() {
            return this.is_favorite;
        }

        public final String component3() {
            return this.title;
        }

        public final Image component4() {
            return this.img;
        }

        public final RecentlyViewed copy(String str, boolean z, String str2, Image image) {
            C19383o.m32797g(str, "listing_id");
            C19383o.m32797g(str2, "title");
            C19383o.m32797g(image, ResponseConstants.IMG);
            return new RecentlyViewed(str, z, str2, image);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecentlyViewed)) {
                return false;
            }
            RecentlyViewed recentlyViewed = (RecentlyViewed) obj;
            return C19383o.m32792b(this.listing_id, recentlyViewed.listing_id) && this.is_favorite == recentlyViewed.is_favorite && C19383o.m32792b(this.title, recentlyViewed.title) && C19383o.m32792b(this.img, recentlyViewed.img);
        }

        public final Image getImg() {
            return this.img;
        }

        public final String getListing_id() {
            return this.listing_id;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.listing_id.hashCode() * 31;
            boolean z = this.is_favorite;
            if (z) {
                z = true;
            }
            return this.img.hashCode() + C0023f.m105e(this.title, (hashCode + (z ? 1 : 0)) * 31, 31);
        }

        public final boolean is_favorite() {
            return this.is_favorite;
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("RecentlyViewed(listing_id=");
            h.append(this.listing_id);
            h.append(", is_favorite=");
            h.append(this.is_favorite);
            h.append(", title=");
            h.append(this.title);
            h.append(", img=");
            h.append(this.img);
            h.append(')');
            return h.toString();
        }
    }

    public SearchLandingSuggestions() {
        this((List) null, (List) null, (List) null, (List) null, (PurchaseGiftCard) null, (List) null, (List) null, 127, (DefaultConstructorMarker) null);
    }

    public SearchLandingSuggestions(@C17402n(name = "categories") List<TaxonomyNode> list, @C17402n(name = "recent_searches") List<Query> list2, @C17402n(name = "popular_searches") List<Query> list3, @C17402n(name = "gift_guides") List<GiftGuide> list4, @C17402n(name = "purchase_gift_card") PurchaseGiftCard purchaseGiftCard2, @C17402n(name = "recently_viewed") List<RecentlyViewed> list5, @C17402n(name = "saved_searches") List<SavableSearchQuery> list6) {
        C19383o.m32797g(list, "categories");
        this.categories = list;
        this.recentSearches = list2;
        this.popularSearches = list3;
        this.giftGuides = list4;
        this.purchaseGiftCard = purchaseGiftCard2;
        this.recentlyViewed = list5;
        this.savedSearches = list6;
    }

    public static /* synthetic */ SearchLandingSuggestions copy$default(SearchLandingSuggestions searchLandingSuggestions, List<TaxonomyNode> list, List<Query> list2, List<Query> list3, List<GiftGuide> list4, PurchaseGiftCard purchaseGiftCard2, List<RecentlyViewed> list5, List<SavableSearchQuery> list6, int i, Object obj) {
        if ((i & 1) != 0) {
            list = searchLandingSuggestions.categories;
        }
        if ((i & 2) != 0) {
            list2 = searchLandingSuggestions.recentSearches;
        }
        List<Query> list7 = list2;
        if ((i & 4) != 0) {
            list3 = searchLandingSuggestions.popularSearches;
        }
        List<Query> list8 = list3;
        if ((i & 8) != 0) {
            list4 = searchLandingSuggestions.giftGuides;
        }
        List<GiftGuide> list9 = list4;
        if ((i & 16) != 0) {
            purchaseGiftCard2 = searchLandingSuggestions.purchaseGiftCard;
        }
        PurchaseGiftCard purchaseGiftCard3 = purchaseGiftCard2;
        if ((i & 32) != 0) {
            list5 = searchLandingSuggestions.recentlyViewed;
        }
        List<RecentlyViewed> list10 = list5;
        if ((i & 64) != 0) {
            list6 = searchLandingSuggestions.savedSearches;
        }
        return searchLandingSuggestions.copy(list, list7, list8, list9, purchaseGiftCard3, list10, list6);
    }

    public final List<TaxonomyNode> component1() {
        return this.categories;
    }

    public final List<Query> component2() {
        return this.recentSearches;
    }

    public final List<Query> component3() {
        return this.popularSearches;
    }

    public final List<GiftGuide> component4() {
        return this.giftGuides;
    }

    public final PurchaseGiftCard component5() {
        return this.purchaseGiftCard;
    }

    public final List<RecentlyViewed> component6() {
        return this.recentlyViewed;
    }

    public final List<SavableSearchQuery> component7() {
        return this.savedSearches;
    }

    public final SearchLandingSuggestions copy(@C17402n(name = "categories") List<TaxonomyNode> list, @C17402n(name = "recent_searches") List<Query> list2, @C17402n(name = "popular_searches") List<Query> list3, @C17402n(name = "gift_guides") List<GiftGuide> list4, @C17402n(name = "purchase_gift_card") PurchaseGiftCard purchaseGiftCard2, @C17402n(name = "recently_viewed") List<RecentlyViewed> list5, @C17402n(name = "saved_searches") List<SavableSearchQuery> list6) {
        C19383o.m32797g(list, "categories");
        return new SearchLandingSuggestions(list, list2, list3, list4, purchaseGiftCard2, list5, list6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchLandingSuggestions)) {
            return false;
        }
        SearchLandingSuggestions searchLandingSuggestions = (SearchLandingSuggestions) obj;
        return C19383o.m32792b(this.categories, searchLandingSuggestions.categories) && C19383o.m32792b(this.recentSearches, searchLandingSuggestions.recentSearches) && C19383o.m32792b(this.popularSearches, searchLandingSuggestions.popularSearches) && C19383o.m32792b(this.giftGuides, searchLandingSuggestions.giftGuides) && C19383o.m32792b(this.purchaseGiftCard, searchLandingSuggestions.purchaseGiftCard) && C19383o.m32792b(this.recentlyViewed, searchLandingSuggestions.recentlyViewed) && C19383o.m32792b(this.savedSearches, searchLandingSuggestions.savedSearches);
    }

    public final List<TaxonomyNode> getCategories() {
        return this.categories;
    }

    public final List<GiftGuide> getGiftGuides() {
        return this.giftGuides;
    }

    public final List<Query> getPopularSearches() {
        return this.popularSearches;
    }

    public final PurchaseGiftCard getPurchaseGiftCard() {
        return this.purchaseGiftCard;
    }

    public final List<Query> getRecentSearches() {
        return this.recentSearches;
    }

    public final List<RecentlyViewed> getRecentlyViewed() {
        return this.recentlyViewed;
    }

    public final List<SavableSearchQuery> getSavedSearches() {
        return this.savedSearches;
    }

    public int hashCode() {
        int hashCode = this.categories.hashCode() * 31;
        List<Query> list = this.recentSearches;
        int i = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Query> list2 = this.popularSearches;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GiftGuide> list3 = this.giftGuides;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        PurchaseGiftCard purchaseGiftCard2 = this.purchaseGiftCard;
        int hashCode5 = (hashCode4 + (purchaseGiftCard2 == null ? 0 : purchaseGiftCard2.hashCode())) * 31;
        List<RecentlyViewed> list4 = this.recentlyViewed;
        int hashCode6 = (hashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<SavableSearchQuery> list5 = this.savedSearches;
        if (list5 != null) {
            i = list5.hashCode();
        }
        return hashCode6 + i;
    }

    public final boolean isEmpty() {
        PurchaseGiftCard purchaseGiftCard2;
        if (this.categories.isEmpty()) {
            List<Query> list = this.recentSearches;
            if (list == null || list.isEmpty()) {
                List<Query> list2 = this.popularSearches;
                if (list2 == null || list2.isEmpty()) {
                    List<GiftGuide> list3 = this.giftGuides;
                    if ((list3 == null || list3.isEmpty()) && ((purchaseGiftCard2 = this.purchaseGiftCard) == null || !purchaseGiftCard2.getEligible())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SearchLandingSuggestions(categories=");
        h.append(this.categories);
        h.append(", recentSearches=");
        h.append(this.recentSearches);
        h.append(", popularSearches=");
        h.append(this.popularSearches);
        h.append(", giftGuides=");
        h.append(this.giftGuides);
        h.append(", purchaseGiftCard=");
        h.append(this.purchaseGiftCard);
        h.append(", recentlyViewed=");
        h.append(this.recentlyViewed);
        h.append(", savedSearches=");
        return C0070b.m186i(h, this.savedSearches, ')');
    }

    @C17403o(generateAdapter = true)
    public static final class SavableSearchQuery {
        public static final int $stable = 8;
        private final Map<String, String> filters;
        private final String filtersDisplayValue;
        private final boolean isFavorite;
        private int newResultsCount;
        private final String query;
        private final long savedSearchId;
        private final String type;

        public SavableSearchQuery(@C17402n(name = "query") String str, @C17402n(name = "is_favorite") boolean z, @C17402n(name = "type") String str2, @C17402n(name = "filters_display_value") String str3, @C17402n(name = "saved_search_id") long j, @C17402n(name = "filters") Map<String, String> map, @C17402n(name = "new_results_count") int i) {
            C19383o.m32797g(str, "query");
            C19383o.m32797g(str2, "type");
            C19383o.m32797g(str3, "filtersDisplayValue");
            C19383o.m32797g(map, "filters");
            this.query = str;
            this.isFavorite = z;
            this.type = str2;
            this.filtersDisplayValue = str3;
            this.savedSearchId = j;
            this.filters = map;
            this.newResultsCount = i;
        }

        public static /* synthetic */ SavableSearchQuery copy$default(SavableSearchQuery savableSearchQuery, String str, boolean z, String str2, String str3, long j, Map map, int i, int i2, Object obj) {
            SavableSearchQuery savableSearchQuery2 = savableSearchQuery;
            return savableSearchQuery.copy((i2 & 1) != 0 ? savableSearchQuery2.query : str, (i2 & 2) != 0 ? savableSearchQuery2.isFavorite : z, (i2 & 4) != 0 ? savableSearchQuery2.type : str2, (i2 & 8) != 0 ? savableSearchQuery2.filtersDisplayValue : str3, (i2 & 16) != 0 ? savableSearchQuery2.savedSearchId : j, (i2 & 32) != 0 ? savableSearchQuery2.filters : map, (i2 & 64) != 0 ? savableSearchQuery2.newResultsCount : i);
        }

        public final String component1() {
            return this.query;
        }

        public final boolean component2() {
            return this.isFavorite;
        }

        public final String component3() {
            return this.type;
        }

        public final String component4() {
            return this.filtersDisplayValue;
        }

        public final long component5() {
            return this.savedSearchId;
        }

        public final Map<String, String> component6() {
            return this.filters;
        }

        public final int component7() {
            return this.newResultsCount;
        }

        public final SavableSearchQuery copy(@C17402n(name = "query") String str, @C17402n(name = "is_favorite") boolean z, @C17402n(name = "type") String str2, @C17402n(name = "filters_display_value") String str3, @C17402n(name = "saved_search_id") long j, @C17402n(name = "filters") Map<String, String> map, @C17402n(name = "new_results_count") int i) {
            C19383o.m32797g(str, "query");
            C19383o.m32797g(str2, "type");
            C19383o.m32797g(str3, "filtersDisplayValue");
            Map<String, String> map2 = map;
            C19383o.m32797g(map2, "filters");
            return new SavableSearchQuery(str, z, str2, str3, j, map2, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SavableSearchQuery)) {
                return false;
            }
            SavableSearchQuery savableSearchQuery = (SavableSearchQuery) obj;
            return C19383o.m32792b(this.query, savableSearchQuery.query) && this.isFavorite == savableSearchQuery.isFavorite && C19383o.m32792b(this.type, savableSearchQuery.type) && C19383o.m32792b(this.filtersDisplayValue, savableSearchQuery.filtersDisplayValue) && this.savedSearchId == savableSearchQuery.savedSearchId && C19383o.m32792b(this.filters, savableSearchQuery.filters) && this.newResultsCount == savableSearchQuery.newResultsCount;
        }

        public final Map<String, String> getFilters() {
            return this.filters;
        }

        public final String getFiltersDisplayValue() {
            return this.filtersDisplayValue;
        }

        public final int getNewResultsCount() {
            return this.newResultsCount;
        }

        public final String getQuery() {
            return this.query;
        }

        public final long getSavedSearchId() {
            return this.savedSearchId;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode = this.query.hashCode() * 31;
            boolean z = this.isFavorite;
            if (z) {
                z = true;
            }
            int b = C0071c.m190b(this.savedSearchId, C0023f.m105e(this.filtersDisplayValue, C0023f.m105e(this.type, (hashCode + (z ? 1 : 0)) * 31, 31), 31), 31);
            return Integer.hashCode(this.newResultsCount) + ((this.filters.hashCode() + b) * 31);
        }

        public final boolean isFavorite() {
            return this.isFavorite;
        }

        public final void setNewResultsCount(int i) {
            this.newResultsCount = i;
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("SavableSearchQuery(query=");
            h.append(this.query);
            h.append(", isFavorite=");
            h.append(this.isFavorite);
            h.append(", type=");
            h.append(this.type);
            h.append(", filtersDisplayValue=");
            h.append(this.filtersDisplayValue);
            h.append(", savedSearchId=");
            h.append(this.savedSearchId);
            h.append(", filters=");
            h.append(this.filters);
            h.append(", newResultsCount=");
            return C0073e.m208h(h, this.newResultsCount, ')');
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SavableSearchQuery(String str, boolean z, String str2, String str3, long j, Map map, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z, str2, str3, j, map, (i2 & 64) != 0 ? 0 : i);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SearchLandingSuggestions(java.util.List r6, java.util.List r7, java.util.List r8, java.util.List r9, com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions.PurchaseGiftCard r10, java.util.List r11, java.util.List r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L_0x0006
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.INSTANCE
        L_0x0006:
            r14 = r13 & 2
            r0 = 0
            if (r14 == 0) goto L_0x000d
            r14 = r0
            goto L_0x000e
        L_0x000d:
            r14 = r7
        L_0x000e:
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0014
            r1 = r0
            goto L_0x0015
        L_0x0014:
            r1 = r8
        L_0x0015:
            r7 = r13 & 8
            if (r7 == 0) goto L_0x001b
            r2 = r0
            goto L_0x001c
        L_0x001b:
            r2 = r9
        L_0x001c:
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0022
            r3 = r0
            goto L_0x0023
        L_0x0022:
            r3 = r10
        L_0x0023:
            r7 = r13 & 32
            if (r7 == 0) goto L_0x0029
            r4 = r0
            goto L_0x002a
        L_0x0029:
            r4 = r11
        L_0x002a:
            r7 = r13 & 64
            if (r7 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r0 = r12
        L_0x0030:
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r1
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions.<init>(java.util.List, java.util.List, java.util.List, java.util.List, com.etsy.android.lib.models.apiv3.search.SearchLandingSuggestions$PurchaseGiftCard, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
