package com.etsy.android.p327ui.search.p330v2.suggestions;

import android.view.ViewGroup;
import androidx.recyclerview.widget.C3167n;
import androidx.recyclerview.widget.C3200w;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.search.TaxonomyNode;
import com.etsy.android.p327ui.search.p330v2.suggestions.C11083w;
import com.etsy.android.p327ui.search.p330v2.suggestions.SearchSuggestionsLayout;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import p003a2.C0015b;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.search.v2.suggestions.d */
public final class C11047d extends C3200w<C11083w, C11100x> {

    /* renamed from: c */
    public final C11049b f24493c;

    /* renamed from: d */
    public final C19846a<C19394m> f24494d;

    /* renamed from: e */
    public final C11051f f24495e;

    /* renamed from: f */
    public String f24496f = "";

    /* renamed from: com.etsy.android.ui.search.v2.suggestions.d$a */
    public static final class C11048a extends C3167n.C3172e<C11083w> {

        /* renamed from: a */
        public static final C11048a f24497a = new C11048a();

        /* renamed from: a */
        public final boolean mo11900a(Object obj, Object obj2) {
            C11083w wVar = (C11083w) obj;
            C11083w wVar2 = (C11083w) obj2;
            return false;
        }

        /* renamed from: b */
        public final boolean mo11901b(Object obj, Object obj2) {
            return C19383o.m32792b((C11083w) obj, (C11083w) obj2);
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.suggestions.d$b */
    public interface C11049b {
        void onBrowseCategoriesClicked();

        void onCategoryClicked(TaxonomyNode taxonomyNode);

        void onClearRecentSearchesClicked();

        void onGiftCardsClicked();

        void onGiftGuideClicked(String str);

        void onListingClicked(String str);

        void onMoreShopsClicked(C11083w.C11093j jVar);

        void onQueryClicked(C11083w.C11089f fVar, int i);

        void onShopClicked(C11083w.C11097n nVar);

        void onSuggestionPopulationClicked(C11083w.C11089f fVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11047d(C11049b bVar, C19846a aVar, SearchSuggestionsLayout.C11037c cVar) {
        super(C11048a.f24497a);
        C19383o.m32797g(bVar, "clickListener");
        this.f24493c = bVar;
        this.f24494d = aVar;
        this.f24495e = cVar;
    }

    public final int getItemViewType(int i) {
        C11083w wVar = (C11083w) getItem(i);
        if (wVar instanceof C11083w.C11099p) {
            return R.layout.search_suggestion_small_header;
        }
        if (wVar instanceof C11083w.C11091h) {
            return R.layout.search_suggestion_large_header;
        }
        if (wVar instanceof C11083w.C11089f) {
            return R.layout.search_suggestion_item_2;
        }
        if (wVar instanceof C11083w.C11097n) {
            return R.layout.search_suggestion_shop;
        }
        if (wVar instanceof C11083w.C11093j) {
            return R.layout.search_suggestion_more_shops;
        }
        if (wVar instanceof C11083w.C11096m) {
            return R.layout.search_suggestion_no_shops;
        }
        if (wVar instanceof C11083w.C11088e) {
            return R.layout.search_suggestion_gift_guides;
        }
        if (wVar instanceof C11083w.C11098o) {
            return R.layout.list_item_mosaic_card;
        }
        if (wVar instanceof C11083w.C11087d) {
            return R.layout.search_suggestion_gift_card_redesign;
        }
        if (wVar instanceof C11083w.C11090g) {
            return R.layout.search_suggestion_item_header;
        }
        if (wVar instanceof C11083w.C11084a) {
            return R.layout.search_suggestion_category_redesign;
        }
        if (wVar instanceof C11083w.C11085b) {
            return R.layout.search_suggestion_category_with_margins_redesign;
        }
        if (wVar instanceof C11083w.C11086c) {
            return R.layout.search_suggestion_divider;
        }
        if (wVar instanceof C11083w.C11094k) {
            return R.layout.search_suggestion_recent_view;
        }
        if (wVar instanceof C11083w.C11092i) {
            return R.layout.search_suggestion_more_saved_searches;
        }
        if (wVar instanceof C11083w.C11095l) {
            return R.layout.list_item_expanded_header;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C3084b0 r14, int r15) {
        /*
            r13 = this;
            com.etsy.android.ui.search.v2.suggestions.x r14 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11100x) r14
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.C19383o.m32797g(r14, r0)
            java.lang.Object r0 = r13.getItem(r15)
            com.etsy.android.ui.search.v2.suggestions.w r0 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11083w) r0
            boolean r1 = r14 instanceof com.etsy.android.p327ui.search.p330v2.suggestions.C11063n
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 33
            if (r1 == 0) goto L_0x0155
            com.etsy.android.ui.search.v2.suggestions.n r14 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11063n) r14
            java.lang.String r1 = "null cannot be cast to non-null type com.etsy.android.ui.search.v2.suggestions.SearchSuggestionViewData.Item"
            kotlin.jvm.internal.C19383o.m32795e(r0, r1)
            com.etsy.android.ui.search.v2.suggestions.w$f r0 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11083w.C11089f) r0
            java.lang.String r1 = r13.f24496f
            java.lang.String r6 = "query"
            kotlin.jvm.internal.C19383o.m32797g(r1, r6)
            com.etsy.android.ui.search.v2.suggestions.o r6 = r0.f24560a
            boolean r7 = r6 instanceof com.etsy.android.p327ui.search.p330v2.suggestions.C11064o.C11065a
            if (r7 == 0) goto L_0x00b9
            android.widget.TextView r6 = r14.f24515c
            int r7 = r1.length()
            if (r7 <= 0) goto L_0x0036
            r7 = r3
            goto L_0x0037
        L_0x0036:
            r7 = r4
        L_0x0037:
            if (r7 == 0) goto L_0x007b
            android.text.SpannableString r7 = new android.text.SpannableString
            com.etsy.android.ui.search.v2.suggestions.o r8 = r0.f24560a
            java.lang.String r8 = r8.mo36653b()
            r7.<init>(r8)
            java.lang.CharSequence r1 = kotlin.text.C19459m.m33035H1(r1)
            java.lang.String r1 = r1.toString()
            com.etsy.android.ui.search.v2.suggestions.o r8 = r0.f24560a
            java.lang.String r8 = r8.mo36653b()
            boolean r8 = kotlin.text.C19459m.m33036e1(r8, r1, r3)
            if (r8 == 0) goto L_0x0062
            int r2 = kotlin.text.C19459m.m33043l1(r7, r1, r4, r3, r2)
            int r1 = r1.length()
            int r1 = r1 + r2
            goto L_0x0063
        L_0x0062:
            r1 = r4
        L_0x0063:
            int r2 = r7.length()
            com.etsy.android.stylekit.typefaces.StyleKitSpan$BoldSpan r8 = new com.etsy.android.stylekit.typefaces.StyleKitSpan$BoldSpan
            android.widget.TextView r9 = r14.f24515c
            android.content.Context r9 = r9.getContext()
            java.lang.String r10 = "this.query.context"
            kotlin.jvm.internal.C19383o.m32796f(r9, r10)
            r8.<init>(r9)
            r7.setSpan(r8, r1, r2, r5)
            goto L_0x0081
        L_0x007b:
            com.etsy.android.ui.search.v2.suggestions.o r1 = r0.f24560a
            java.lang.String r7 = r1.mo36653b()
        L_0x0081:
            r6.setText(r7)
            android.widget.ImageView r1 = r14.f24518f
            com.etsy.android.extensions.ViewExtensions.m12860d(r1)
            android.widget.Button r1 = r14.f24517e
            com.etsy.android.extensions.ViewExtensions.m12869m(r1)
            android.widget.Button r1 = r14.f24517e
            android.content.res.Resources r2 = r1.getResources()
            r5 = 2131951712(0x7f130060, float:1.9539846E38)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.etsy.android.ui.search.v2.suggestions.o r6 = r0.f24560a
            java.lang.String r6 = r6.mo36653b()
            r3[r4] = r6
            java.lang.String r2 = r2.getString(r5, r3)
            r1.setContentDescription(r2)
            android.widget.Button r1 = r14.f24517e
            com.etsy.android.ui.search.v2.suggestions.ItemSearchSuggestionViewHolder$bindAutosuggest$1 r2 = new com.etsy.android.ui.search.v2.suggestions.ItemSearchSuggestionViewHolder$bindAutosuggest$1
            r2.<init>(r14, r0)
            com.etsy.android.extensions.ViewExtensions.m12866j(r1, r2)
            android.widget.TextView r1 = r14.f24516d
            com.etsy.android.extensions.ViewExtensions.m12860d(r1)
            goto L_0x0149
        L_0x00b9:
            boolean r1 = r6 instanceof com.etsy.android.p327ui.search.p330v2.suggestions.C11064o.C11066b
            if (r1 == 0) goto L_0x00d7
            android.widget.TextView r1 = r14.f24515c
            java.lang.String r2 = r6.mo36653b()
            r1.setText(r2)
            android.widget.Button r1 = r14.f24517e
            com.etsy.android.extensions.ViewExtensions.m12860d(r1)
            android.widget.TextView r1 = r14.f24516d
            com.etsy.android.extensions.ViewExtensions.m12860d(r1)
            android.widget.ImageView r1 = r14.f24518f
            com.etsy.android.extensions.ViewExtensions.m12860d(r1)
            goto L_0x0149
        L_0x00d7:
            boolean r1 = r6 instanceof com.etsy.android.p327ui.search.p330v2.suggestions.C11064o.C11067c
            if (r1 == 0) goto L_0x00f4
            android.widget.TextView r1 = r14.f24515c
            java.lang.String r2 = r6.mo36653b()
            r1.setText(r2)
            android.widget.Button r1 = r14.f24517e
            com.etsy.android.extensions.ViewExtensions.m12860d(r1)
            android.widget.ImageView r1 = r14.f24518f
            com.etsy.android.extensions.ViewExtensions.m12860d(r1)
            android.widget.TextView r1 = r14.f24516d
            com.etsy.android.extensions.ViewExtensions.m12860d(r1)
            goto L_0x0149
        L_0x00f4:
            boolean r1 = r6 instanceof com.etsy.android.p327ui.search.p330v2.suggestions.C11064o.C11069e
            if (r1 == 0) goto L_0x0149
            com.etsy.android.ui.search.v2.suggestions.o$e r6 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11064o.C11069e) r6
            android.widget.Button r1 = r14.f24517e
            com.etsy.android.extensions.ViewExtensions.m12860d(r1)
            boolean r1 = r6.f24535f
            if (r1 == 0) goto L_0x011f
            android.widget.ImageView r1 = r14.f24518f
            com.etsy.android.extensions.ViewExtensions.m12869m(r1)
            android.widget.ImageView r1 = r14.f24518f
            android.content.res.Resources r2 = r1.getResources()
            r5 = 2131951717(0x7f130065, float:1.9539856E38)
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.String r8 = r6.f24530a
            r7[r4] = r8
            java.lang.String r2 = r2.getString(r5, r7)
            r1.setContentDescription(r2)
            goto L_0x0124
        L_0x011f:
            android.widget.ImageView r1 = r14.f24518f
            com.etsy.android.extensions.ViewExtensions.m12860d(r1)
        L_0x0124:
            android.widget.TextView r1 = r14.f24515c
            java.lang.String r2 = r6.f24530a
            r1.setText(r2)
            java.lang.String r1 = r6.f24532c
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0134
            goto L_0x0135
        L_0x0134:
            r3 = r4
        L_0x0135:
            if (r3 == 0) goto L_0x0144
            android.widget.TextView r1 = r14.f24516d
            java.lang.String r2 = r6.f24532c
            r1.setText(r2)
            android.widget.TextView r1 = r14.f24516d
            com.etsy.android.extensions.ViewExtensions.m12869m(r1)
            goto L_0x0149
        L_0x0144:
            android.widget.TextView r1 = r14.f24516d
            com.etsy.android.extensions.ViewExtensions.m12860d(r1)
        L_0x0149:
            android.view.View r1 = r14.itemView
            com.etsy.android.ui.search.v2.suggestions.m r2 = new com.etsy.android.ui.search.v2.suggestions.m
            r2.<init>(r14, r0, r15)
            r1.setOnClickListener(r2)
            goto L_0x07cd
        L_0x0155:
            boolean r15 = r14 instanceof com.etsy.android.p327ui.search.p330v2.suggestions.C11102z
            r1 = 2131952467(0x7f130353, float:1.9541378E38)
            r6 = 2131952326(0x7f1302c6, float:1.9541092E38)
            r7 = 2131953416(0x7f130708, float:1.9543302E38)
            if (r15 == 0) goto L_0x01d8
            com.etsy.android.ui.search.v2.suggestions.z r14 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11102z) r14
            java.lang.String r15 = "null cannot be cast to non-null type com.etsy.android.ui.search.v2.suggestions.SearchSuggestionViewData.SmallHeader"
            kotlin.jvm.internal.C19383o.m32795e(r0, r15)
            com.etsy.android.ui.search.v2.suggestions.w$p r0 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11083w.C11099p) r0
            android.view.View r15 = r14.itemView
            android.widget.TextView r2 = r14.f24583c
            com.etsy.android.ui.search.v2.suggestions.a0 r3 = r0.f24575a
            android.content.Context r15 = r15.getContext()
            android.content.res.Resources r15 = r15.getResources()
            com.etsy.android.ui.search.v2.suggestions.a0$b r4 = com.etsy.android.p327ui.search.p330v2.suggestions.C11040a0.C11042b.f24484a
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r3, r4)
            if (r4 == 0) goto L_0x018b
            java.lang.String r15 = r15.getString(r7)
            java.lang.String r1 = "res.getString(R.string.s…_item_gift_guides_header)"
            kotlin.jvm.internal.C19383o.m32796f(r15, r1)
            goto L_0x01c3
        L_0x018b:
            com.etsy.android.ui.search.v2.suggestions.a0$a r4 = com.etsy.android.p327ui.search.p330v2.suggestions.C11040a0.C11041a.f24483a
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r3, r4)
            if (r4 == 0) goto L_0x019d
            java.lang.String r15 = r15.getString(r6)
            java.lang.String r1 = "res.getString(R.string.giftcards)"
            kotlin.jvm.internal.C19383o.m32796f(r15, r1)
            goto L_0x01c3
        L_0x019d:
            com.etsy.android.ui.search.v2.suggestions.a0$d r4 = com.etsy.android.p327ui.search.p330v2.suggestions.C11040a0.C11044d.f24486a
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r3, r4)
            if (r4 == 0) goto L_0x01b2
            r1 = 2131953421(0x7f13070d, float:1.9543313E38)
            java.lang.String r15 = r15.getString(r1)
            java.lang.String r1 = "res.getString(R.string.s…estion_item_shops_header)"
            kotlin.jvm.internal.C19383o.m32796f(r15, r1)
            goto L_0x01c3
        L_0x01b2:
            com.etsy.android.ui.search.v2.suggestions.a0$c r4 = com.etsy.android.p327ui.search.p330v2.suggestions.C11040a0.C11043c.f24485a
            boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r3, r4)
            if (r3 == 0) goto L_0x01d2
            java.lang.String r15 = r15.getString(r1)
            java.lang.String r1 = "res.getString(R.string.listing_recently_viewed)"
            kotlin.jvm.internal.C19383o.m32796f(r15, r1)
        L_0x01c3:
            r2.setText(r15)
            android.view.View r14 = r14.f24582b
            com.etsy.android.ui.search.v2.suggestions.SmallHeaderSearchSuggestionViewHolder$bind$1$1 r15 = new com.etsy.android.ui.search.v2.suggestions.SmallHeaderSearchSuggestionViewHolder$bind$1$1
            r15.<init>(r0)
            com.etsy.android.extensions.ViewExtensions.m12870n(r14, r15)
            goto L_0x07cd
        L_0x01d2:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x01d8:
            boolean r15 = r14 instanceof com.etsy.android.p327ui.search.p330v2.suggestions.C11070p
            r8 = 2131951690(0x7f13004a, float:1.9539802E38)
            r9 = 2131953385(0x7f1306e9, float:1.954324E38)
            r10 = 2131165387(0x7f0700cb, float:1.794499E38)
            java.lang.String r11 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            java.lang.String r12 = "itemView"
            if (r15 == 0) goto L_0x0394
            com.etsy.android.ui.search.v2.suggestions.p r14 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11070p) r14
            java.lang.String r15 = "null cannot be cast to non-null type com.etsy.android.ui.search.v2.suggestions.SearchSuggestionViewData.LargeHeader"
            kotlin.jvm.internal.C19383o.m32795e(r0, r15)
            com.etsy.android.ui.search.v2.suggestions.w$h r0 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11083w.C11091h) r0
            com.etsy.android.ui.search.v2.suggestions.q r15 = r0.f24562a
            com.etsy.android.ui.search.v2.suggestions.q$b r0 = com.etsy.android.p327ui.search.p330v2.suggestions.C11071q.C11073b.f24538a
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r15, r0)
            r1 = 2131429595(0x7f0b08db, float:1.8480867E38)
            r2 = 2131429596(0x7f0b08dc, float:1.848087E38)
            r3 = 8
            r5 = 2131429594(0x7f0b08da, float:1.8480865E38)
            if (r0 == 0) goto L_0x024e
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r5)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r15.setText(r9)
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r5)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r0 = 2131231474(0x7f0802f2, float:1.807903E38)
            r15.setCompoundDrawablesWithIntrinsicBounds(r4, r4, r0, r4)
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r2)
            r15.setVisibility(r3)
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r1)
            r15.setVisibility(r4)
            android.view.View r15 = r14.itemView
            kotlin.jvm.internal.C19383o.m32796f(r15, r12)
            com.etsy.android.ui.search.v2.suggestions.LargeHeaderSearchSuggestionViewHolder$bind$1 r0 = new com.etsy.android.ui.search.v2.suggestions.LargeHeaderSearchSuggestionViewHolder$bind$1
            r0.<init>(r14)
            com.etsy.android.extensions.ViewExtensions.m12866j(r15, r0)
            android.view.View r15 = r14.itemView
            android.content.res.Resources r15 = r15.getResources()
            int r15 = r15.getDimensionPixelSize(r10)
            r14.mo36669e(r15)
            goto L_0x07cd
        L_0x024e:
            com.etsy.android.ui.search.v2.suggestions.q$c r0 = com.etsy.android.p327ui.search.p330v2.suggestions.C11071q.C11074c.f24539a
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r15, r0)
            if (r0 == 0) goto L_0x0280
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r5)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r15.setText(r9)
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r5)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r15.setCompoundDrawablesWithIntrinsicBounds(r4, r4, r4, r4)
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r2)
            r15.setVisibility(r3)
            android.view.View r14 = r14.itemView
            android.view.View r14 = r14.findViewById(r1)
            r14.setVisibility(r3)
            goto L_0x07cd
        L_0x0280:
            com.etsy.android.ui.search.v2.suggestions.q$a r0 = com.etsy.android.p327ui.search.p330v2.suggestions.C11071q.C11072a.f24537a
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r15, r0)
            if (r0 == 0) goto L_0x02bf
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r5)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r15.setText(r8)
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r5)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r15.setCompoundDrawablesWithIntrinsicBounds(r4, r4, r4, r4)
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r2)
            r15.setVisibility(r3)
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r1)
            r15.setVisibility(r3)
            android.view.View r15 = r14.itemView
            android.content.res.Resources r15 = r15.getResources()
            int r15 = r15.getDimensionPixelSize(r10)
            r14.mo36669e(r15)
            goto L_0x07cd
        L_0x02bf:
            com.etsy.android.ui.search.v2.suggestions.q$e r0 = com.etsy.android.p327ui.search.p330v2.suggestions.C11071q.C11076e.f24541a
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r15, r0)
            if (r0 == 0) goto L_0x02f4
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r5)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r15.setText(r7)
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r5)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r15.setCompoundDrawablesWithIntrinsicBounds(r4, r4, r4, r4)
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r2)
            r15.setVisibility(r3)
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r1)
            r15.setVisibility(r3)
            r14.mo36669e(r4)
            goto L_0x07cd
        L_0x02f4:
            com.etsy.android.ui.search.v2.suggestions.q$f r0 = com.etsy.android.p327ui.search.p330v2.suggestions.C11071q.C11077f.f24542a
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r15, r0)
            if (r0 == 0) goto L_0x035f
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r5)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r15.setText(r7)
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r5)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r15.setCompoundDrawablesWithIntrinsicBounds(r4, r4, r4, r4)
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r2)
            r15.setVisibility(r3)
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r1)
            r15.setVisibility(r3)
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r5)
            android.widget.TextView r15 = (android.widget.TextView) r15
            android.view.View r0 = r14.itemView
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131165398(0x7f0700d6, float:1.7945012E38)
            int r0 = r0.getDimensionPixelSize(r1)
            android.view.View r14 = r14.itemView
            android.content.res.Resources r14 = r14.getResources()
            r1 = 2131165392(0x7f0700d0, float:1.7945E38)
            int r14 = r14.getDimensionPixelSize(r1)
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            kotlin.jvm.internal.C19383o.m32795e(r15, r11)
            android.view.ViewGroup$MarginLayoutParams r15 = (android.view.ViewGroup.MarginLayoutParams) r15
            int r1 = r15.getMarginEnd()
            r15.setMarginStart(r0)
            r15.topMargin = r14
            r15.setMarginEnd(r1)
            r15.bottomMargin = r4
            goto L_0x07cd
        L_0x035f:
            com.etsy.android.ui.search.v2.suggestions.q$d r0 = com.etsy.android.p327ui.search.p330v2.suggestions.C11071q.C11075d.f24540a
            boolean r15 = kotlin.jvm.internal.C19383o.m32792b(r15, r0)
            if (r15 == 0) goto L_0x07cd
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r5)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r15.setText(r6)
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r5)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r15.setCompoundDrawablesWithIntrinsicBounds(r4, r4, r4, r4)
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r2)
            r15.setVisibility(r3)
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r1)
            r15.setVisibility(r3)
            r14.mo36669e(r4)
            goto L_0x07cd
        L_0x0394:
            boolean r15 = r14 instanceof com.etsy.android.p327ui.search.p330v2.suggestions.C11101y
            if (r15 == 0) goto L_0x03f8
            com.etsy.android.ui.search.v2.suggestions.y r14 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11101y) r14
            java.lang.String r15 = "null cannot be cast to non-null type com.etsy.android.ui.search.v2.suggestions.SearchSuggestionViewData.Shop"
            kotlin.jvm.internal.C19383o.m32795e(r0, r15)
            com.etsy.android.ui.search.v2.suggestions.w$n r0 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11083w.C11097n) r0
            android.widget.TextView r15 = r14.f24578c
            java.lang.String r1 = r0.f24569a
            java.lang.String r1 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r1)
            r15.setText(r1)
            android.widget.TextView r15 = r14.f24579d
            java.lang.String r1 = r0.f24570b
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x03b7
            goto L_0x03b8
        L_0x03b7:
            r3 = r4
        L_0x03b8:
            if (r3 == 0) goto L_0x03c1
            java.lang.String r1 = r0.f24570b
            java.lang.String r1 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r1)
            goto L_0x03c3
        L_0x03c1:
            java.lang.String r1 = ""
        L_0x03c3:
            r15.setText(r1)
            android.view.View r15 = r14.itemView
            com.etsy.android.lib.core.img.GlideRequests r15 = androidx.activity.C0114h.m272C0(r15)
            java.lang.String r1 = r0.f24571c
            u9.b r15 = r15.load((java.lang.String) r1)
            int r1 = r14.f24581f
            u9.b r15 = r15.mo17158r(r1, r1)
            u9.b r15 = r15.mo17159s()
            com.bumptech.glide.request.g r1 = com.bumptech.glide.request.C6128g.m12232J()
            u9.b r15 = r15.mo16829a(r1)
            android.widget.ImageView r1 = r14.f24580e
            r15.mo16816M(r1)
            android.view.View r15 = r14.itemView
            kotlin.jvm.internal.C19383o.m32796f(r15, r12)
            com.etsy.android.ui.search.v2.suggestions.ShopSearchSuggestionViewHolder$bind$1 r1 = new com.etsy.android.ui.search.v2.suggestions.ShopSearchSuggestionViewHolder$bind$1
            r1.<init>(r14, r0)
            com.etsy.android.extensions.ViewExtensions.m12866j(r15, r1)
            goto L_0x07cd
        L_0x03f8:
            boolean r15 = r14 instanceof com.etsy.android.p327ui.search.p330v2.suggestions.C11080t
            if (r15 == 0) goto L_0x0470
            com.etsy.android.ui.search.v2.suggestions.t r14 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11080t) r14
            java.lang.String r15 = "null cannot be cast to non-null type com.etsy.android.ui.search.v2.suggestions.SearchSuggestionViewData.MoreShops"
            kotlin.jvm.internal.C19383o.m32795e(r0, r15)
            com.etsy.android.ui.search.v2.suggestions.w$j r0 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11083w.C11093j) r0
            android.text.SpannableStringBuilder r15 = r14.f24548d
            r15.clear()
            android.text.SpannableStringBuilder r15 = r14.f24548d
            android.view.View r1 = r14.itemView
            android.content.res.Resources r1 = r1.getResources()
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r6 = r0.f24564a
            r2[r4] = r6
            r6 = 2131953418(0x7f13070a, float:1.9543306E38)
            java.lang.String r1 = r1.getString(r6, r2)
            r15.append(r1)
            android.text.SpannableStringBuilder r15 = r14.f24548d
            java.lang.String r1 = r0.f24564a
            r2 = 6
            int r15 = kotlin.text.C19459m.m33046o1(r15, r1, r4, r2)
            int r1 = r15 + -1
            if (r1 < 0) goto L_0x045a
            android.text.SpannableStringBuilder r2 = r14.f24548d
            com.etsy.android.stylekit.typefaces.StyleKitSpan$BoldSpan r6 = r14.f24549e
            r2.setSpan(r6, r4, r1, r5)
            java.lang.String r1 = r0.f24564a
            int r1 = r1.length()
            int r1 = r1 + r15
            int r1 = r1 + r3
            android.text.SpannableStringBuilder r15 = r14.f24548d
            int r15 = r15.length()
            if (r1 > r15) goto L_0x045a
            android.text.SpannableStringBuilder r15 = r14.f24548d
            int r15 = r15.length()
            int r15 = r15 - r1
            if (r15 <= 0) goto L_0x045a
            android.text.SpannableStringBuilder r15 = r14.f24548d
            com.etsy.android.stylekit.typefaces.StyleKitSpan$BoldSpan r2 = r14.f24549e
            int r3 = r15.length()
            r15.setSpan(r2, r1, r3, r5)
        L_0x045a:
            android.widget.TextView r15 = r14.f24547c
            android.text.SpannableStringBuilder r1 = r14.f24548d
            r15.setText(r1)
            android.view.View r15 = r14.itemView
            kotlin.jvm.internal.C19383o.m32796f(r15, r12)
            com.etsy.android.ui.search.v2.suggestions.MoreShopsSearchSuggestionViewHolder$bind$1 r1 = new com.etsy.android.ui.search.v2.suggestions.MoreShopsSearchSuggestionViewHolder$bind$1
            r1.<init>(r14, r0)
            com.etsy.android.extensions.ViewExtensions.m12866j(r15, r1)
            goto L_0x07cd
        L_0x0470:
            boolean r15 = r14 instanceof com.etsy.android.p327ui.search.p330v2.suggestions.C11082v
            if (r15 == 0) goto L_0x0497
            com.etsy.android.ui.search.v2.suggestions.v r14 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11082v) r14
            java.lang.String r15 = "null cannot be cast to non-null type com.etsy.android.ui.search.v2.suggestions.SearchSuggestionViewData.NoShops"
            kotlin.jvm.internal.C19383o.m32795e(r0, r15)
            com.etsy.android.ui.search.v2.suggestions.w$m r0 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11083w.C11096m) r0
            android.widget.TextView r15 = r14.f24553b
            android.view.View r14 = r14.itemView
            android.content.res.Resources r14 = r14.getResources()
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = r0.f24568a
            r1[r4] = r0
            r0 = 2131953417(0x7f130709, float:1.9543304E38)
            java.lang.String r14 = r14.getString(r0, r1)
            r15.setText(r14)
            goto L_0x07cd
        L_0x0497:
            boolean r15 = r14 instanceof com.etsy.android.p327ui.search.p330v2.suggestions.C11054i
            if (r15 == 0) goto L_0x04b4
            com.etsy.android.ui.search.v2.suggestions.i r14 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11054i) r14
            java.lang.String r15 = "null cannot be cast to non-null type com.etsy.android.ui.search.v2.suggestions.SearchSuggestionViewData.GiftGuides"
            kotlin.jvm.internal.C19383o.m32795e(r0, r15)
            com.etsy.android.ui.search.v2.suggestions.w$e r0 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11083w.C11088e) r0
            com.etsy.android.ui.search.v2.suggestions.j r15 = new com.etsy.android.ui.search.v2.suggestions.j
            java.util.List<com.etsy.android.lib.models.apiv3.search.GiftGuide> r0 = r0.f24559a
            com.etsy.android.ui.search.v2.suggestions.d$b r1 = r14.f24500b
            r15.<init>(r0, r1)
            androidx.recyclerview.widget.RecyclerView r14 = r14.f24501c
            r14.setAdapter(r15)
            goto L_0x07cd
        L_0x04b4:
            boolean r15 = r14 instanceof com.etsy.android.p327ui.search.p330v2.suggestions.GiftGuideSuggestionRedesignViewHolder
            if (r15 == 0) goto L_0x051a
            com.etsy.android.ui.search.v2.suggestions.GiftGuideSuggestionRedesignViewHolder r14 = (com.etsy.android.p327ui.search.p330v2.suggestions.GiftGuideSuggestionRedesignViewHolder) r14
            java.lang.String r15 = "null cannot be cast to non-null type com.etsy.android.ui.search.v2.suggestions.SearchSuggestionViewData.SingleGiftGuide"
            kotlin.jvm.internal.C19383o.m32795e(r0, r15)
            com.etsy.android.ui.search.v2.suggestions.w$o r0 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11083w.C11098o) r0
            android.view.View r15 = r14.itemView
            android.content.Context r15 = r15.getContext()
            com.etsy.android.lib.core.img.GlideRequests r15 = androidx.activity.C0114h.m270B0(r15)
            com.etsy.android.lib.models.apiv3.search.GiftGuide r1 = r0.f24574a
            com.etsy.android.lib.models.apiv3.listing.ListingImage r1 = r1.getImage()
            java.lang.String r1 = r1.getUrl()
            u9.b r15 = r15.load((java.lang.String) r1)
            j4.h[] r1 = new p150j4.C7117h[r2]
            com.bumptech.glide.load.resource.bitmap.i r2 = new com.bumptech.glide.load.resource.bitmap.i
            r2.<init>()
            r1[r4] = r2
            com.bumptech.glide.load.resource.bitmap.w r2 = new com.bumptech.glide.load.resource.bitmap.w
            kotlin.c r4 = r14.f24463f
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r2.<init>(r4)
            r1[r3] = r2
            u9.b r15 = r15.mo46145m0(r1)
            android.widget.ImageView r1 = r14.f24461d
            r15.mo16816M(r1)
            android.widget.TextView r15 = r14.f24462e
            com.etsy.android.lib.models.apiv3.search.GiftGuide r1 = r0.f24574a
            java.lang.String r1 = r1.getTitle()
            r15.setText(r1)
            com.google.android.material.card.MaterialCardView r15 = r14.f24460c
            java.lang.String r1 = "mCard"
            kotlin.jvm.internal.C19383o.m32796f(r15, r1)
            com.etsy.android.ui.search.v2.suggestions.GiftGuideSuggestionRedesignViewHolder$bind$1 r1 = new com.etsy.android.ui.search.v2.suggestions.GiftGuideSuggestionRedesignViewHolder$bind$1
            r1.<init>(r14, r0)
            com.etsy.android.extensions.ViewExtensions.m12866j(r15, r1)
            goto L_0x07cd
        L_0x051a:
            boolean r15 = r14 instanceof com.etsy.android.p327ui.search.p330v2.suggestions.C11053h
            r5 = 2131429590(0x7f0b08d6, float:1.8480857E38)
            java.lang.String r6 = "null cannot be cast to non-null type com.etsy.android.ui.search.v2.suggestions.SearchSuggestionViewData.GiftCard"
            if (r15 == 0) goto L_0x0550
            com.etsy.android.ui.search.v2.suggestions.h r14 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11053h) r14
            kotlin.jvm.internal.C19383o.m32795e(r0, r6)
            com.etsy.android.ui.search.v2.suggestions.w$d r0 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11083w.C11087d) r0
            android.view.View r15 = r14.itemView
            com.etsy.android.lib.core.img.GlideRequests r15 = androidx.activity.C0114h.m272C0(r15)
            java.lang.String r0 = r0.f24558a
            u9.b r15 = r15.load((java.lang.String) r0)
            android.view.View r0 = r14.itemView
            android.view.View r0 = r0.findViewById(r5)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r15.mo16816M(r0)
            android.view.View r15 = r14.itemView
            kotlin.jvm.internal.C19383o.m32796f(r15, r12)
            com.etsy.android.ui.search.v2.suggestions.GiftCardSearchSuggestionViewHolder$bind$1 r0 = new com.etsy.android.ui.search.v2.suggestions.GiftCardSearchSuggestionViewHolder$bind$1
            r0.<init>(r14)
            com.etsy.android.extensions.ViewExtensions.m12866j(r15, r0)
            goto L_0x07cd
        L_0x0550:
            boolean r15 = r14 instanceof com.etsy.android.p327ui.search.p330v2.suggestions.C11052g
            if (r15 == 0) goto L_0x0581
            com.etsy.android.ui.search.v2.suggestions.g r14 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11052g) r14
            kotlin.jvm.internal.C19383o.m32795e(r0, r6)
            com.etsy.android.ui.search.v2.suggestions.w$d r0 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11083w.C11087d) r0
            android.view.View r15 = r14.itemView
            com.etsy.android.lib.core.img.GlideRequests r15 = androidx.activity.C0114h.m272C0(r15)
            java.lang.String r0 = r0.f24558a
            u9.b r15 = r15.load((java.lang.String) r0)
            android.view.View r0 = r14.itemView
            android.view.View r0 = r0.findViewById(r5)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r15.mo16816M(r0)
            android.view.View r15 = r14.itemView
            kotlin.jvm.internal.C19383o.m32796f(r15, r12)
            com.etsy.android.ui.search.v2.suggestions.GiftCardSearchSuggestionRedesignViewHolder$bind$1 r0 = new com.etsy.android.ui.search.v2.suggestions.GiftCardSearchSuggestionRedesignViewHolder$bind$1
            r0.<init>(r14)
            com.etsy.android.extensions.ViewExtensions.m12866j(r15, r0)
            goto L_0x07cd
        L_0x0581:
            boolean r15 = r14 instanceof com.etsy.android.p327ui.search.p330v2.suggestions.C11061l
            if (r15 == 0) goto L_0x060b
            com.etsy.android.ui.search.v2.suggestions.l r14 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11061l) r14
            java.lang.String r15 = "null cannot be cast to non-null type com.etsy.android.ui.search.v2.suggestions.SearchSuggestionViewData.ItemHeader"
            kotlin.jvm.internal.C19383o.m32795e(r0, r15)
            com.etsy.android.ui.search.v2.suggestions.w$g r0 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11083w.C11090g) r0
            com.etsy.android.ui.search.v2.suggestions.k r15 = r0.f24561a
            boolean r0 = r15 instanceof com.etsy.android.p327ui.search.p330v2.suggestions.C11056k.C11057a
            if (r0 == 0) goto L_0x05ad
            android.widget.TextView r15 = r14.f24509c
            android.view.View r0 = r14.itemView
            android.content.Context r0 = r0.getContext()
            r1 = 2131953236(0x7f130654, float:1.9542937E38)
            java.lang.String r0 = r0.getString(r1)
            r15.setText(r0)
            android.widget.Button r14 = r14.f24510d
            com.etsy.android.extensions.ViewExtensions.m12860d(r14)
            goto L_0x07cd
        L_0x05ad:
            boolean r0 = r15 instanceof com.etsy.android.p327ui.search.p330v2.suggestions.C11056k.C11058b
            if (r0 == 0) goto L_0x05d4
            android.widget.TextView r15 = r14.f24509c
            android.view.View r0 = r14.itemView
            android.content.Context r0 = r0.getContext()
            r1 = 2131953317(0x7f1306a5, float:1.9543102E38)
            java.lang.String r0 = r0.getString(r1)
            r15.setText(r0)
            android.widget.Button r15 = r14.f24510d
            com.etsy.android.ui.search.v2.suggestions.ItemHeaderViewHolder$bind$1 r0 = new com.etsy.android.ui.search.v2.suggestions.ItemHeaderViewHolder$bind$1
            r0.<init>(r14)
            com.etsy.android.extensions.ViewExtensions.m12866j(r15, r0)
            android.widget.Button r14 = r14.f24510d
            r14.setVisibility(r4)
            goto L_0x07cd
        L_0x05d4:
            boolean r0 = r15 instanceof com.etsy.android.p327ui.search.p330v2.suggestions.C11056k.C11059c
            if (r0 == 0) goto L_0x05ee
            android.widget.TextView r15 = r14.f24509c
            android.view.View r0 = r14.itemView
            android.content.Context r0 = r0.getContext()
            java.lang.String r0 = r0.getString(r1)
            r15.setText(r0)
            android.widget.Button r14 = r14.f24510d
            com.etsy.android.extensions.ViewExtensions.m12860d(r14)
            goto L_0x07cd
        L_0x05ee:
            boolean r15 = r15 instanceof com.etsy.android.p327ui.search.p330v2.suggestions.C11056k.C11060d
            if (r15 == 0) goto L_0x07cd
            android.widget.TextView r15 = r14.f24509c
            android.view.View r0 = r14.itemView
            android.content.Context r0 = r0.getContext()
            r1 = 2131953381(0x7f1306e5, float:1.9543231E38)
            java.lang.String r0 = r0.getString(r1)
            r15.setText(r0)
            android.widget.Button r14 = r14.f24510d
            com.etsy.android.extensions.ViewExtensions.m12860d(r14)
            goto L_0x07cd
        L_0x060b:
            boolean r15 = r14 instanceof com.etsy.android.p327ui.search.p330v2.suggestions.C11045b
            java.lang.String r1 = "null cannot be cast to non-null type com.etsy.android.ui.search.v2.suggestions.SearchSuggestionViewData.Category"
            r5 = 2131429589(0x7f0b08d5, float:1.8480855E38)
            r6 = 2131429588(0x7f0b08d4, float:1.8480853E38)
            if (r15 == 0) goto L_0x06a1
            com.etsy.android.ui.search.v2.suggestions.b r14 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11045b) r14
            kotlin.jvm.internal.C19383o.m32795e(r0, r1)
            com.etsy.android.ui.search.v2.suggestions.w$a r0 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11083w.C11084a) r0
            int r15 = r0.f24555b
            if (r15 != 0) goto L_0x0624
            r15 = r3
            goto L_0x0625
        L_0x0624:
            r15 = r4
        L_0x0625:
            if (r15 == 0) goto L_0x0629
            r15 = r4
            goto L_0x062b
        L_0x0629:
            int r15 = r14.f24489d
        L_0x062b:
            android.view.View r1 = r14.itemView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            kotlin.jvm.internal.C19383o.m32795e(r1, r11)
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r7 = r1.getMarginStart()
            int r8 = r1.getMarginEnd()
            int r9 = r1.bottomMargin
            r1.setMarginStart(r7)
            r1.topMargin = r15
            r1.setMarginEnd(r8)
            r1.bottomMargin = r9
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r6)
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            com.etsy.android.lib.models.apiv3.search.TaxonomyNode r1 = r0.f24554a
            com.etsy.android.lib.models.apiv3.listing.ListingImage r1 = r1.getImage()
            int r6 = r14.f24490e
            java.lang.String r1 = androidx.compose.foundation.layout.C0761x.m1711b1(r1, r6)
            android.view.View r6 = r14.itemView
            com.etsy.android.lib.core.img.GlideRequests r6 = androidx.activity.C0114h.m272C0(r6)
            u9.b r1 = r6.load((java.lang.String) r1)
            j4.h[] r2 = new p150j4.C7117h[r2]
            com.bumptech.glide.load.resource.bitmap.i r6 = new com.bumptech.glide.load.resource.bitmap.i
            r6.<init>()
            r2[r4] = r6
            com.bumptech.glide.load.resource.bitmap.w r4 = new com.bumptech.glide.load.resource.bitmap.w
            int r6 = r14.f24488c
            r4.<init>(r6)
            r2[r3] = r4
            u9.b r1 = r1.mo46145m0(r2)
            r1.mo16816M(r15)
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r5)
            android.widget.TextView r15 = (android.widget.TextView) r15
            com.etsy.android.lib.models.apiv3.search.TaxonomyNode r1 = r0.f24554a
            java.lang.String r1 = r1.getName()
            r15.setText(r1)
            android.view.View r15 = r14.itemView
            kotlin.jvm.internal.C19383o.m32796f(r15, r12)
            com.etsy.android.ui.search.v2.suggestions.CategorySearchSuggestionViewHolder$bind$1 r1 = new com.etsy.android.ui.search.v2.suggestions.CategorySearchSuggestionViewHolder$bind$1
            r1.<init>(r14, r0)
            com.etsy.android.extensions.ViewExtensions.m12866j(r15, r1)
            goto L_0x07cd
        L_0x06a1:
            boolean r15 = r14 instanceof com.etsy.android.p327ui.search.p330v2.suggestions.C11050e
            if (r15 == 0) goto L_0x06ca
            com.etsy.android.ui.search.v2.suggestions.e r14 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11050e) r14
            java.lang.String r15 = "null cannot be cast to non-null type com.etsy.android.ui.search.v2.suggestions.SearchSuggestionViewData.Divider"
            kotlin.jvm.internal.C19383o.m32795e(r0, r15)
            com.etsy.android.ui.search.v2.suggestions.w$c r0 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11083w.C11086c) r0
            android.view.View r15 = r14.itemView
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            kotlin.jvm.internal.C19383o.m32795e(r15, r11)
            android.view.ViewGroup$MarginLayoutParams r15 = (android.view.ViewGroup.MarginLayoutParams) r15
            android.view.View r14 = r14.itemView
            android.content.Context r14 = r14.getContext()
            android.content.res.Resources r14 = r14.getResources()
            r14.getDimensionPixelSize(r10)
            r15.topMargin = r4
            goto L_0x07cd
        L_0x06ca:
            boolean r15 = r14 instanceof com.etsy.android.p327ui.search.p330v2.suggestions.MultipleListingSuggestionViewHolder
            if (r15 == 0) goto L_0x06e0
            com.etsy.android.ui.search.v2.suggestions.MultipleListingSuggestionViewHolder r14 = (com.etsy.android.p327ui.search.p330v2.suggestions.MultipleListingSuggestionViewHolder) r14
            java.lang.String r15 = "null cannot be cast to non-null type com.etsy.android.ui.search.v2.suggestions.SearchSuggestionViewData.MultiListing"
            kotlin.jvm.internal.C19383o.m32795e(r0, r15)
            com.etsy.android.ui.search.v2.suggestions.w$k r0 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11083w.C11094k) r0
            com.etsy.android.ui.search.v2.suggestions.MultipleListingSuggestionViewHolder$ListingAdapter r14 = r14.f24469c
            java.util.List<com.etsy.android.ui.search.v2.suggestions.o$d> r15 = r0.f24566a
            r14.mo11950j(r15)
            goto L_0x07cd
        L_0x06e0:
            boolean r15 = r14 instanceof com.etsy.android.p327ui.search.p330v2.suggestions.C11079s
            if (r15 == 0) goto L_0x06f4
            com.etsy.android.ui.search.v2.suggestions.s r14 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11079s) r14
            com.etsy.android.ui.search.v2.suggestions.f r15 = r13.f24495e
            android.view.View r0 = r14.itemView
            com.etsy.android.ui.search.v2.suggestions.r r1 = new com.etsy.android.ui.search.v2.suggestions.r
            r1.<init>(r4, r15, r14)
            r0.setOnClickListener(r1)
            goto L_0x07cd
        L_0x06f4:
            boolean r15 = r14 instanceof com.etsy.android.p327ui.search.p330v2.suggestions.C11039a
            if (r15 == 0) goto L_0x0744
            com.etsy.android.ui.search.v2.suggestions.a r14 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11039a) r14
            kotlin.jvm.internal.C19383o.m32795e(r0, r1)
            com.etsy.android.ui.search.v2.suggestions.w$a r0 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11083w.C11084a) r0
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r6)
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            com.etsy.android.lib.models.apiv3.search.TaxonomyNode r1 = r0.f24554a
            com.etsy.android.lib.models.apiv3.listing.ListingImage r1 = r1.getImage()
            int r2 = r14.f24482c
            java.lang.String r1 = androidx.compose.foundation.layout.C0761x.m1711b1(r1, r2)
            android.view.View r2 = r14.itemView
            com.etsy.android.lib.core.img.GlideRequests r2 = androidx.activity.C0114h.m272C0(r2)
            u9.b r1 = r2.load((java.lang.String) r1)
            u9.b r1 = r1.mo46136d0()
            r1.mo16816M(r15)
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r5)
            android.widget.TextView r15 = (android.widget.TextView) r15
            com.etsy.android.lib.models.apiv3.search.TaxonomyNode r1 = r0.f24554a
            java.lang.String r1 = r1.getName()
            r15.setText(r1)
            android.view.View r15 = r14.itemView
            kotlin.jvm.internal.C19383o.m32796f(r15, r12)
            com.etsy.android.ui.search.v2.suggestions.CategorySearchSuggestionRedesignViewHolder$bind$1 r1 = new com.etsy.android.ui.search.v2.suggestions.CategorySearchSuggestionRedesignViewHolder$bind$1
            r1.<init>(r14, r0)
            com.etsy.android.extensions.ViewExtensions.m12866j(r15, r1)
            goto L_0x07cd
        L_0x0744:
            boolean r15 = r14 instanceof com.etsy.android.p327ui.search.p330v2.suggestions.C11046c
            if (r15 == 0) goto L_0x0795
            com.etsy.android.ui.search.v2.suggestions.c r14 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11046c) r14
            java.lang.String r15 = "null cannot be cast to non-null type com.etsy.android.ui.search.v2.suggestions.SearchSuggestionViewData.CategoryWithMargins"
            kotlin.jvm.internal.C19383o.m32795e(r0, r15)
            com.etsy.android.ui.search.v2.suggestions.w$b r0 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11083w.C11085b) r0
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r6)
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            com.etsy.android.lib.models.apiv3.search.TaxonomyNode r1 = r0.f24556a
            com.etsy.android.lib.models.apiv3.listing.ListingImage r1 = r1.getImage()
            int r2 = r14.f24492c
            java.lang.String r1 = androidx.compose.foundation.layout.C0761x.m1711b1(r1, r2)
            android.view.View r2 = r14.itemView
            com.etsy.android.lib.core.img.GlideRequests r2 = androidx.activity.C0114h.m272C0(r2)
            u9.b r1 = r2.load((java.lang.String) r1)
            u9.b r1 = r1.mo46136d0()
            r1.mo16816M(r15)
            android.view.View r15 = r14.itemView
            android.view.View r15 = r15.findViewById(r5)
            android.widget.TextView r15 = (android.widget.TextView) r15
            com.etsy.android.lib.models.apiv3.search.TaxonomyNode r1 = r0.f24556a
            java.lang.String r1 = r1.getName()
            r15.setText(r1)
            android.view.View r15 = r14.itemView
            kotlin.jvm.internal.C19383o.m32796f(r15, r12)
            com.etsy.android.ui.search.v2.suggestions.CategoryWithMarginsSearchSuggestionRedesignViewHolder$bind$1 r1 = new com.etsy.android.ui.search.v2.suggestions.CategoryWithMarginsSearchSuggestionRedesignViewHolder$bind$1
            r1.<init>(r14, r0)
            com.etsy.android.extensions.ViewExtensions.m12866j(r15, r1)
            goto L_0x07cd
        L_0x0795:
            boolean r15 = r14 instanceof com.etsy.android.p327ui.search.p330v2.suggestions.C11081u
            if (r15 == 0) goto L_0x07cd
            com.etsy.android.ui.search.v2.suggestions.u r14 = (com.etsy.android.p327ui.search.p330v2.suggestions.C11081u) r14
            android.widget.TextView r15 = r14.f24550b
            if (r15 == 0) goto L_0x07bc
            r15.setText(r8)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            kotlin.jvm.internal.C19383o.m32795e(r0, r11)
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            android.content.res.Resources r15 = r15.getResources()
            int r15 = r15.getDimensionPixelSize(r10)
            int r1 = r0.leftMargin
            int r2 = r0.topMargin
            int r3 = r0.rightMargin
            r0.setMargins(r1, r2, r3, r15)
        L_0x07bc:
            android.widget.Button r15 = r14.f24551c
            if (r15 == 0) goto L_0x07c3
            com.etsy.android.extensions.ViewExtensions.m12860d(r15)
        L_0x07c3:
            android.widget.TextView r14 = r14.f24552d
            if (r14 == 0) goto L_0x07cd
            r14.setText(r9)
            r14.setVisibility(r4)
        L_0x07cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.p330v2.suggestions.C11047d.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$b0, int):void");
    }

    public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        if (i == R.layout.list_item_expanded_header) {
            return new C11081u(viewGroup);
        }
        if (i == R.layout.list_item_mosaic_card) {
            return new GiftGuideSuggestionRedesignViewHolder(viewGroup, this.f24493c);
        }
        switch (i) {
            case R.layout.search_suggestion_category:
                return new C11045b(viewGroup, this.f24493c);
            case R.layout.search_suggestion_category_redesign:
                return new C11039a(viewGroup, this.f24493c);
            case R.layout.search_suggestion_category_with_margins_redesign:
                return new C11046c(viewGroup, this.f24493c);
            case R.layout.search_suggestion_divider:
                return new C11050e(viewGroup);
            case R.layout.search_suggestion_gift_card:
                return new C11053h(viewGroup, this.f24493c);
            case R.layout.search_suggestion_gift_card_redesign:
                return new C11052g(viewGroup, this.f24493c);
            case R.layout.search_suggestion_gift_guides:
                return new C11054i(viewGroup, this.f24493c);
            case R.layout.search_suggestion_item_2:
                return new C11063n(viewGroup, this.f24493c);
            case R.layout.search_suggestion_item_header:
                return new C11061l(viewGroup, this.f24493c);
            case R.layout.search_suggestion_large_header:
                return new C11070p(viewGroup, this.f24493c);
            case R.layout.search_suggestion_more_saved_searches:
                return new C11079s(viewGroup);
            case R.layout.search_suggestion_more_shops:
                return new C11080t(viewGroup, this.f24493c);
            case R.layout.search_suggestion_no_shops:
                return new C11082v(viewGroup);
            case R.layout.search_suggestion_recent_view:
                return new MultipleListingSuggestionViewHolder(viewGroup, this.f24493c, this.f24494d);
            case R.layout.search_suggestion_shop:
                return new C11101y(viewGroup, this.f24493c);
            case R.layout.search_suggestion_small_header:
                return new C11102z(viewGroup);
            default:
                throw new IllegalArgumentException(C0015b.m88g("Missing ViewHolder for viewType ", i));
        }
    }
}
