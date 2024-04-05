package com.etsy.android.p327ui.shop;

import android.content.res.Resources;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.models.ShopSection;
import com.etsy.android.lib.models.apiv3.FAQs;
import com.etsy.android.lib.models.apiv3.ListingMemberData;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.datatypes.ShopHomeSortOption;
import com.etsy.android.lib.util.C8885d0;
import java.util.ArrayList;
import java.util.List;
import p193o.C7494b;
import p193o.C7497e;
import p425q9.C13265p;
import p452te.C13394c;
import p460ue.C13497g;

/* renamed from: com.etsy.android.ui.shop.q0 */
public final class C11192q0 implements C11143e1 {

    /* renamed from: a */
    public C11193a f24741a;

    /* renamed from: b */
    public final Resources f24742b;

    /* renamed from: c */
    public final C13265p f24743c;

    /* renamed from: d */
    public String f24744d = "";

    /* renamed from: e */
    public String f24745e = "";

    /* renamed from: f */
    public ShopSection f24746f;

    /* renamed from: g */
    public List<ShopSection> f24747g = new ArrayList();

    /* renamed from: h */
    public ShopHomeSortOption f24748h;

    /* renamed from: i */
    public List<ShopHomeSortOption> f24749i;

    /* renamed from: j */
    public C7494b<EtsyId, ListingMemberData> f24750j = new C7494b<>();

    /* renamed from: k */
    public C7494b<EtsyId, C7497e> f24751k = new C7494b<>();

    /* renamed from: l */
    public int f24752l = -1;

    /* renamed from: m */
    public int f24753m = -1;

    /* renamed from: n */
    public boolean f24754n;

    /* renamed from: o */
    public boolean f24755o;

    /* renamed from: p */
    public boolean f24756p;

    /* renamed from: q */
    public boolean f24757q;

    /* renamed from: r */
    public boolean f24758r;

    /* renamed from: s */
    public boolean f24759s;

    /* renamed from: com.etsy.android.ui.shop.q0$a */
    public interface C11193a {
        void didClearSearch();

        void didSelectSection(ShopSection shopSection);

        void didSubmitSearchQuery(String str);

        void loadMoreListings();

        void navigateToAllReviews();

        void onTranslateShopButtonClicked(boolean z);

        void performScrollToSection(ShopSection shopSection);

        void performSearch();

        void performShopFavorite(boolean z);

        void performVacationNotificationSubscription(boolean z);

        void refreshFilterSpinners();

        void showDetailsBottomSheet(String str, String str2);

        void translateFAQs(FAQs fAQs);

        void translatePrivacyOther(C13497g gVar);

        void translateReviewMessage(C13394c cVar);
    }

    public C11192q0(C11193a aVar, Resources resources, C13265p pVar, C8623e eVar) {
        this.f24742b = resources;
        this.f24743c = pVar;
        this.f24759s = eVar.mo21132b(C8592b.C8595c.f18865i);
        this.f24741a = aVar;
    }

    /* renamed from: a */
    public final String mo36861a(String str, String str2) {
        return (!this.f24759s || !C8885d0.m17324h(str2)) ? str : str2;
    }
}
