package com.etsy.android.p327ui.shop;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.util.Linkify;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.ReceiptReview;
import com.etsy.android.lib.models.Review;
import com.etsy.android.lib.models.ShopSection;
import com.etsy.android.lib.models.apiv3.AppreciationPhoto;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.apiv3.ShopHomeMemberData;
import com.etsy.android.lib.models.apiv3.ShopHomePage;
import com.etsy.android.lib.models.apiv3.ShopListingLevelReturnPolicies;
import com.etsy.android.lib.models.apiv3.ShopPolicy;
import com.etsy.android.lib.models.apiv3.ShopV3;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.p327ui.shop.C11192q0;
import com.etsy.android.p327ui.shop.viewholder.C11257a;
import com.etsy.android.p327ui.shop.viewholder.C11283k;
import com.etsy.android.p327ui.shop.viewholder.ShopItemsRedesignedSearchViewHolder;
import com.etsy.android.uikit.nav.transactions.C11869a;
import com.etsy.android.uikit.recyclerview.C11877a;
import com.etsy.android.uikit.util.EtsyLinkify;
import com.etsy.android.uikit.viewholder.C11997k;
import com.etsy.android.uikit.viewholder.ListingCardUiModel;
import com.etsy.android.vespa.viewholders.C12086e;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.play.core.assetpacks.C15588c1;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import p357gf.C12796e;
import p415of.C13172b;
import p415of.C13173c;
import p415of.C13182k;
import p415of.C13186o;
import p452te.C13393b;
import p452te.C13394c;
import p452te.C13397f;
import p460ue.C13493c;
import p460ue.C13496f;
import p487ya.C13895a;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.shop.a0 */
public final class C11127a0 extends C13173c implements C11877a, C11877a.C11878a {

    /* renamed from: m */
    public static final Object f24612m = new Object();

    /* renamed from: n */
    public static final SimpleDateFormat f24613n = new SimpleDateFormat("MMM dd, yyyy", Locale.getDefault());

    /* renamed from: i */
    public ShopHomePage f24614i;

    /* renamed from: j */
    public C11192q0 f24615j;

    /* renamed from: k */
    public final C11192q0.C11193a f24616k;

    /* renamed from: l */
    public C11283k f24617l;

    /* renamed from: com.etsy.android.ui.shop.a0$a */
    public class C11128a extends C13493c {

        /* renamed from: b */
        public final /* synthetic */ String f24618b;

        /* renamed from: c */
        public final /* synthetic */ String f24619c;

        public C11128a(String str, String str2) {
            this.f24618b = str;
            this.f24619c = str2;
        }

        /* renamed from: b */
        public final CharSequence mo36825b(Context context) {
            SpannableString spannableString = new SpannableString(C11127a0.this.f24615j.mo36861a(this.f24618b, this.f24619c));
            Linkify.addLinks(spannableString, 1);
            return EtsyLinkify.m19616j(context, spannableString);
        }
    }

    public C11127a0(Fragment fragment, C8703p pVar, C13895a aVar, C8923u uVar, C12796e eVar, C11192q0.C11193a aVar2) {
        super(fragment, pVar, (C13182k) null, aVar, uVar, eVar);
        this.f28995g = pVar;
        this.f24616k = aVar2;
    }

    /* renamed from: u */
    public static ArrayList m19075u(List list, ShopV3 shopV3, C11192q0 q0Var) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ReceiptReview receiptReview = (ReceiptReview) list.get(i);
            String format = f24613n.format(receiptReview.getDate());
            EtsyId userId = receiptReview.getUserId();
            String userDisplayName = receiptReview.getUserDisplayName();
            String userAvatarUrl = receiptReview.getUserAvatarUrl();
            List<Review> reviews = receiptReview.getReviews();
            int size2 = reviews.size();
            int i2 = 0;
            while (i2 < size2) {
                Review review = reviews.get(i2);
                C13394c cVar = r8;
                int i3 = size;
                AppreciationPhoto appreciationPhoto = review.getAppreciationPhoto();
                int i4 = i2;
                int i5 = size2;
                C13394c cVar2 = new C13394c(review, userId, userDisplayName, userAvatarUrl, format, q0Var);
                arrayList.add(new C11202t0(R.id.view_type_shop_home_heading_review, cVar));
                if (review.hasAppreciationPhoto()) {
                    arrayList.add(new C11202t0(R.id.view_type_shop_home_review_appreciation_photo, appreciationPhoto));
                }
                arrayList.add(new C11202t0(R.id.view_type_shop_home_review_rating, cVar));
                if (C8885d0.m17323g(review.getReviewMessage())) {
                    arrayList.add(new C11202t0(R.id.view_type_shop_home_review_message, cVar));
                }
                if (review.hasResponse()) {
                    arrayList.add(new C11202t0(R.id.view_type_shop_home_heading_review_response, new C13393b(f24613n, shopV3, review.getReviewResponse())));
                } else {
                    ShopV3 shopV32 = shopV3;
                }
                if (review.isListingDisplayable()) {
                    arrayList.add(new C11202t0(R.id.view_type_shop_home_review_listing_info, cVar));
                }
                i2 = i4 + 1;
                size = i3;
                size2 = i5;
            }
            ShopV3 shopV33 = shopV3;
            int i6 = size;
        }
        return arrayList;
    }

    /* renamed from: x */
    public static C11997k.C11998a m19076x(C11192q0 q0Var, Resources resources) {
        int i = q0Var.f24752l;
        int i2 = i > q0Var.f24753m ? 3 : 2;
        C11997k.C11998a aVar = new C11997k.C11998a(resources.getString(R.string.more_items), resources.getString(R.string.shop_home_items_count, new Object[]{Integer.toString(q0Var.f24753m), Integer.toString(i)}));
        aVar.f26736c = i2;
        return aVar;
    }

    @Deprecated
    /* renamed from: A */
    public final void mo36813A(int i, Object obj, Object obj2) {
        int v = mo36821v(i, obj);
        if (v != -1) {
            notifyItemChanged(getHeaderCount() + v, obj2);
        }
    }

    /* renamed from: b */
    public final void mo31298b(int i) {
    }

    /* renamed from: e */
    public final boolean mo36814e(int i) {
        int itemViewType = getItemViewType(i);
        return itemViewType == R.id.view_type_shop_home_section_selector || itemViewType == R.id.view_type_shop_home_sticky_boundary;
    }

    /* renamed from: f */
    public final void mo36815f(View view) {
        view.setElevation(8.0f);
    }

    /* renamed from: h */
    public final void mo36816h(View view) {
        view.setElevation(0.0f);
    }

    /* renamed from: i */
    public final void mo31300i(int i) {
        notifyItemChanged(i);
    }

    /* renamed from: k */
    public final boolean mo31808k() {
        return false;
    }

    /* renamed from: l */
    public final C13172b mo33108l(C13895a aVar, C8923u uVar, Fragment fragment, C12796e eVar) {
        return new C11249v0(fragment, this.f28995g, this, aVar, C18263b.f40057V, uVar, eVar);
    }

    /* renamed from: n */
    public final void mo31809n(C11869a aVar) {
    }

    /* renamed from: o */
    public final void mo31810o(C11869a aVar) {
    }

    public final void onBindListItemViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        if (b0Var instanceof C12086e) {
            C12086e eVar = (C12086e) b0Var;
            C13186o oVar = (C13186o) getItems().get(i);
            if (oVar instanceof C11202t0) {
                eVar.mo19450a(((C11202t0) oVar).f24766b);
            } else {
                eVar.mo19450a(oVar);
            }
        }
    }

    public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i, List<Object> list) {
        if (list.isEmpty()) {
            super.onBindViewHolder(b0Var, i);
        } else if (((C11202t0) this.mItems.get(i)).f24767c == R.id.view_type_shop_home_items_search_redesign) {
            ShopItemsRedesignedSearchViewHolder shopItemsRedesignedSearchViewHolder = (ShopItemsRedesignedSearchViewHolder) b0Var;
            shopItemsRedesignedSearchViewHolder.f24849d.setText("");
            shopItemsRedesignedSearchViewHolder.f24849d.clearFocus();
        } else {
            super.onBindViewHolder(b0Var, i, list);
        }
    }

    public final void onViewRecycled(RecyclerView.C3084b0 b0Var) {
        ((C12086e) b0Var).mo31374b();
    }

    /* renamed from: q */
    public final void mo36817q(ShopListingLevelReturnPolicies shopListingLevelReturnPolicies) {
        if (shopListingLevelReturnPolicies != null) {
            this.mItems.add(new C11202t0(R.id.view_type_shop_home_subsection_heading, new C11134c0(shopListingLevelReturnPolicies.getTitle())));
            this.mItems.add(new C11202t0(R.id.view_type_shop_home_section_content, new C11134c0(shopListingLevelReturnPolicies.getDescription())));
        }
    }

    /* renamed from: r */
    public final void mo36818r(int i, String str, String str2) {
        if (!TextUtils.isEmpty(str) && str.trim().length() != 0) {
            this.mItems.add(new C11202t0(R.id.view_type_shop_home_subsection_heading, new C11131b0(i)));
            this.mItems.add(new C11202t0(R.id.view_type_shop_home_section_content, new C11128a(str, str2)));
        }
    }

    /* renamed from: s */
    public final void mo36819s(ShopPolicy shopPolicy) {
        C13496f fVar = new C13496f(shopPolicy, this.f24615j);
        this.mItems.add(new C11202t0(R.id.view_type_shop_home_section_heading, fVar));
        if (shopPolicy != null && !TextUtils.isEmpty(shopPolicy.getWelcomeMessage().trim())) {
            this.mItems.add(new C11202t0(R.id.view_type_shop_home_section_content, fVar));
        }
    }

    /* renamed from: t */
    public final void mo36820t(ArrayList arrayList, ShopHomePage shopHomePage, C11192q0 q0Var) {
        ShopSection shopSection;
        boolean z;
        ArrayList arrayList2 = arrayList;
        C11192q0 q0Var2 = q0Var;
        Resources resources = this.mContext.getResources();
        ArrayList arrayList3 = new ArrayList();
        if (shopHomePage.getShopSections() != null) {
            arrayList3.addAll(shopHomePage.getShopSections());
        }
        List<ListingCard> featuredListings = shopHomePage.getFeaturedListings();
        if (featuredListings != null && featuredListings.size() > 0) {
            ShopSection shopSection2 = new ShopSection(resources.getString(R.string.shop_home_featured_items_section_title), "featured", featuredListings, featuredListings.size());
            arrayList3.remove(shopSection2);
            arrayList3.add(0, shopSection2);
        }
        Iterator it = arrayList3.iterator();
        while (true) {
            if (!it.hasNext()) {
                shopSection = null;
                break;
            }
            shopSection = (ShopSection) it.next();
            if (shopSection.isAllItemsSection()) {
                break;
            }
        }
        int activeListingCount = shopHomePage.getShop().getActiveListingCount();
        if (shopSection != null) {
            List arrayList4 = new ArrayList();
            if (shopHomePage.getShopListings() != null) {
                arrayList4 = shopHomePage.getShopListings();
            }
            ArrayList arrayList5 = new ArrayList();
            if (arrayList4.size() > 8) {
                arrayList5.addAll(arrayList4.subList(0, 8));
            } else {
                arrayList5.addAll(arrayList4);
            }
            shopSection.setListings(arrayList5);
            shopSection.setListingActiveCount(activeListingCount);
            arrayList3.remove(shopSection);
            arrayList3.add(shopSection);
        }
        q0Var2.f24747g.clear();
        q0Var2.f24747g.addAll(arrayList3);
        q0Var2.f24753m = -1;
        q0Var2.f24752l = -1;
        if (activeListingCount > 0) {
            Iterator it2 = arrayList3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                ShopSection shopSection3 = (ShopSection) it2.next();
                EtsyId shopSectionId = shopSection3.getShopSectionId();
                if (!shopSection3.isAllItemsSection() && shopSectionId != null && !"featured".equals(shopSectionId.getId()) && !IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(shopSectionId.getId())) {
                    z = true;
                    break;
                }
            }
            if (z) {
                arrayList2.add(new C11202t0(R.id.view_type_shop_home_section_selector, q0Var2));
            }
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                ShopSection shopSection4 = (ShopSection) arrayList3.get(i);
                List<ListingCard> listings = shopSection4.getListings();
                if (listings != null) {
                    arrayList2.add(new C11202t0(R.id.view_type_shop_home_section_header, shopSection4));
                    for (int i2 = 0; i2 < listings.size(); i2++) {
                        arrayList2.add(new C11202t0(R.id.view_type_shop_home_listing, new ListingCardUiModel(listings.get(i2), true, false, false)));
                    }
                    int listingActiveCount = shopSection4.getListingActiveCount();
                    int size2 = shopSection4.getListings().size();
                    int i3 = listingActiveCount > size2 ? 1 : 2;
                    C11997k.C11998a aVar = new C11997k.C11998a(resources.getString(R.string.shop_home_section_footer_button, new Object[]{String.valueOf(listingActiveCount)}), resources.getString(R.string.shop_home_items_count, new Object[]{Integer.toString(size2), Integer.toString(listingActiveCount)}), shopSection4);
                    aVar.f26736c = i3;
                    arrayList2.add(new C11202t0(R.id.view_type_shop_home_section_footer, aVar));
                    if (i < size - 1) {
                        arrayList2.add(new C11202t0(R.id.view_type_shop_home_section_divider, (Object) null));
                    }
                }
            }
            arrayList2.add(new C11202t0(R.id.view_type_shop_home_sticky_boundary, (Object) null));
            return;
        }
        arrayList2.add(new C11202t0(R.id.view_type_shop_home_empty_layout, new C11257a.C11258a(R.drawable.shop_home_empty_items, resources.getString(R.string.shop_home_no_listings))));
    }

    /* renamed from: v */
    public final int mo36821v(int i, Object obj) {
        int itemCount = getItemCount();
        for (int i2 = 0; i2 < itemCount; i2++) {
            C11202t0 t0Var = (C11202t0) getItem(i2);
            if (t0Var != null && t0Var.f24767c == i && t0Var.f24766b == obj) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: w */
    public final int mo36822w(int i) {
        int size = this.mItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C11202t0) this.mItems.get(i2)).f24767c == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: y */
    public final void mo36823y(boolean z) {
        ShopHomePage shopHomePage = this.f24614i;
        if (shopHomePage != null) {
            this.f24615j.f24755o = z;
            ShopHomeMemberData memberData = shopHomePage.getMemberData();
            if (memberData != null) {
                memberData.setIsFavorer(z);
            }
            C11283k kVar = this.f24617l;
            if (kVar != null) {
                ShopV3 shopV3 = kVar.f24907a;
                kVar.getClass();
                this.f24617l = new C11283k(shopV3, z);
                ArrayList<T> arrayList = this.mItems;
                Pair pair = null;
                int i = 0;
                if (C15588c1.m25338o0(arrayList)) {
                    int size = arrayList.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        T t = arrayList.get(i2);
                        if (((C13186o) t).getViewType() == R.id.view_type_shop_home_info_redesign) {
                            pair = new Pair(Integer.valueOf(i2), t);
                            break;
                        }
                        i2++;
                    }
                }
                if (pair != null && ((C11202t0) pair.getSecond()) != null) {
                    C11202t0 t0Var = new C11202t0(R.id.view_type_shop_home_info_redesign, this.f24617l);
                    if (pair.getFirst() != null) {
                        i = ((Integer) pair.getFirst()).intValue();
                    }
                    this.mItems.remove(i);
                    this.mItems.add(i, t0Var);
                    notifyItemChanged(i);
                }
            }
        }
    }

    /* renamed from: z */
    public final void mo36824z(boolean z) {
        this.f24615j.f24756p = z;
        int w = mo36822w(R.id.view_type_shop_home_vacation_banner);
        if (w >= 0 && w < this.mItems.size()) {
            Object obj = ((C11202t0) this.mItems.get(w)).f24766b;
            if (obj instanceof C13397f) {
                ((C13397f) obj).f29339a = false;
                notifyItemChanged(w);
            }
        }
    }
}
