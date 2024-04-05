package com.etsy.android.p327ui.listing.p329ui;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.listing.Reviews;
import com.etsy.android.lib.models.apiv3.listing.ShopHighlight;
import com.etsy.android.lib.models.apiv3.listing.ShopRating;
import com.etsy.android.lib.models.apiv3.listing.ShopReview;
import com.etsy.android.lib.models.apiv3.listing.Subratings;
import com.etsy.android.p327ui.listing.p329ui.C10409f;
import com.etsy.android.p327ui.listing.p329ui.panels.faqs.FaqsPanel;
import com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.C10487a;
import com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.ItemDetailsPanel;
import com.etsy.android.p327ui.listing.p329ui.panels.overview.C10518b;
import com.etsy.android.p327ui.listing.p329ui.panels.reviews.C10521a;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.C10590a;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.unstructured.C10615a;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.r */
public final class C10625r {

    /* renamed from: a */
    public C10518b f23317a;

    /* renamed from: b */
    public C10615a f23318b;

    /* renamed from: c */
    public C10590a f23319c;

    /* renamed from: d */
    public FaqsPanel f23320d;

    /* renamed from: e */
    public C10521a f23321e;

    /* renamed from: f */
    public ItemDetailsPanel f23322f;

    public C10625r(C10409f.C10413c cVar) {
        C19383o.m32797g(cVar, "panels");
        C10518b bVar = cVar.f22843a;
        C10615a aVar = cVar.f22844b;
        C10590a aVar2 = cVar.f22845c;
        FaqsPanel faqsPanel = cVar.f22846d;
        C10521a aVar3 = cVar.f22847e;
        ItemDetailsPanel itemDetailsPanel = cVar.f22848f;
        C19383o.m32797g(itemDetailsPanel, "itemDetailsPanel");
        this.f23317a = bVar;
        this.f23318b = aVar;
        this.f23319c = aVar2;
        this.f23320d = faqsPanel;
        this.f23321e = aVar3;
        this.f23322f = itemDetailsPanel;
    }

    /* renamed from: a */
    public final void mo34251a(C19857l<? super C10406c, C19394m> lVar) {
        FaqsPanel faqsPanel;
        C19383o.m32797g(lVar, "lambda");
        FaqsPanel faqsPanel2 = this.f23320d;
        if (faqsPanel2 != null) {
            C10406c cVar = new C10406c(faqsPanel2);
            lVar.invoke(cVar);
            faqsPanel = new FaqsPanel(cVar.f22774a, cVar.f22775b, cVar.f22776c, cVar.f22777d, cVar.f22778e);
        } else {
            EmptyList emptyList = EmptyList.INSTANCE;
            C10406c cVar2 = new C10406c(new FaqsPanel(emptyList, emptyList, FaqsPanel.LanguageState.ORIGINAL, MachineTranslationViewState.VISIBLE, false));
            lVar.invoke(cVar2);
            faqsPanel = new FaqsPanel(cVar2.f22774a, cVar2.f22775b, cVar2.f22776c, cVar2.f22777d, cVar2.f22778e);
        }
        this.f23320d = faqsPanel;
    }

    /* renamed from: b */
    public final void mo34252b(C19857l<? super C10408e, C19394m> lVar) {
        C19383o.m32797g(lVar, "lambda");
        ItemDetailsPanel itemDetailsPanel = this.f23322f;
        C19383o.m32797g(itemDetailsPanel, "panel");
        CharSequence charSequence = itemDetailsPanel.f23009a;
        CharSequence charSequence2 = itemDetailsPanel.f23010b;
        List<C10487a> list = itemDetailsPanel.f23011c;
        String str = itemDetailsPanel.f23012d;
        String str2 = itemDetailsPanel.f23013e;
        Boolean bool = itemDetailsPanel.f23014f;
        Boolean bool2 = itemDetailsPanel.f23015g;
        String str3 = itemDetailsPanel.f23016h;
        String str4 = itemDetailsPanel.f23017i;
        boolean z = itemDetailsPanel.f23018j;
        String str5 = itemDetailsPanel.f23019k;
        String str6 = itemDetailsPanel.f23020l;
        String str7 = itemDetailsPanel.f23021m;
        C10408e eVar = new C10408e(charSequence, charSequence2, list, str, str2, bool, bool2, str3, str4, z, str5, str6, str7, itemDetailsPanel.f23022n, itemDetailsPanel.f23023o);
        lVar.invoke(eVar);
        CharSequence charSequence3 = eVar.f22783a;
        CharSequence charSequence4 = eVar.f22784b;
        List<C10487a> list2 = eVar.f22785c;
        String str8 = eVar.f22786d;
        String str9 = eVar.f22787e;
        Boolean bool3 = eVar.f22788f;
        Boolean bool4 = eVar.f22789g;
        String str10 = eVar.f22790h;
        String str11 = eVar.f22791i;
        boolean z2 = eVar.f22792j;
        String str12 = eVar.f22793k;
        String str13 = eVar.f22794l;
        String str14 = eVar.f22795m;
        String str15 = str14;
        this.f23322f = new ItemDetailsPanel(charSequence3, charSequence4, list2, str8, str9, bool3, bool4, str10, str11, z2, str12, str13, str15, eVar.f22796n, eVar.f22797o);
    }

    /* renamed from: c */
    public final void mo34253c(C19857l<? super C10649t, C19394m> lVar) {
        C10521a aVar;
        C19857l<? super C10649t, C19394m> lVar2 = lVar;
        C19383o.m32797g(lVar2, "lambda");
        C10521a aVar2 = this.f23321e;
        if (aVar2 != null) {
            C10649t tVar = new C10649t(aVar2);
            lVar2.invoke(tVar);
            aVar = tVar.mo34304a();
        } else {
            EmptyList emptyList = EmptyList.INSTANCE;
            C10521a aVar3 = r3;
            C10521a aVar4 = new C10521a(0, new Reviews(0, 0, emptyList, emptyList, emptyList, emptyList, (ShopReview) null, 64, (DefaultConstructorMarker) null), (List) null, (List) null, 0, 0, 0.0f, (ShopRating) null, (ShopHighlight) null, (Subratings) null, (Reviews.ReviewType) null, false, 8188);
            C10649t tVar2 = new C10649t(aVar3);
            lVar2.invoke(tVar2);
            aVar = tVar2.mo34304a();
        }
        this.f23321e = aVar;
    }

    /* renamed from: d */
    public final void mo34254d(C19857l<? super C10664w, C19394m> lVar) {
        C10615a aVar;
        C19857l<? super C10664w, C19394m> lVar2 = lVar;
        C10615a aVar2 = this.f23318b;
        if (aVar2 != null) {
            C10664w wVar = r3;
            C10664w wVar2 = new C10664w(aVar2.f23286a, aVar2.f23287b, aVar2.f23288c, aVar2.f23289d, aVar2.f23290e, aVar2.f23291f, aVar2.f23292g, aVar2.f23293h, aVar2.f23294i, aVar2.f23295j, aVar2.f23296k, aVar2.f23297l, aVar2.f23298m, aVar2.f23299n, aVar2.f23300o, aVar2.f23301p, aVar2.f23302q, aVar2.f23303r, aVar2.f23304s, aVar2.f23305t);
            C10664w wVar3 = wVar;
            lVar2.invoke(wVar3);
            aVar = wVar3.mo34345a();
        } else {
            C10664w wVar4 = new C10664w(0);
            lVar2.invoke(wVar4);
            aVar = wVar4.mo34345a();
        }
        this.f23318b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10625r)) {
            return false;
        }
        C10625r rVar = (C10625r) obj;
        return C19383o.m32792b(this.f23317a, rVar.f23317a) && C19383o.m32792b(this.f23318b, rVar.f23318b) && C19383o.m32792b(this.f23319c, rVar.f23319c) && C19383o.m32792b(this.f23320d, rVar.f23320d) && C19383o.m32792b(this.f23321e, rVar.f23321e) && C19383o.m32792b(this.f23322f, rVar.f23322f);
    }

    public final int hashCode() {
        C10518b bVar = this.f23317a;
        int i = 0;
        int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        C10615a aVar = this.f23318b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        C10590a aVar2 = this.f23319c;
        int hashCode3 = (hashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        FaqsPanel faqsPanel = this.f23320d;
        int hashCode4 = (hashCode3 + (faqsPanel == null ? 0 : faqsPanel.hashCode())) * 31;
        C10521a aVar3 = this.f23321e;
        if (aVar3 != null) {
            i = aVar3.hashCode();
        }
        return this.f23322f.hashCode() + ((hashCode4 + i) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PanelsBuilder(overviewPanel=");
        h.append(this.f23317a);
        h.append(", shippingUnstructuredPoliciesPanel=");
        h.append(this.f23318b);
        h.append(", shippingAndPoliciesPanel=");
        h.append(this.f23319c);
        h.append(", faqsPanel=");
        h.append(this.f23320d);
        h.append(", reviewsPanel=");
        h.append(this.f23321e);
        h.append(", itemDetailsPanel=");
        h.append(this.f23322f);
        h.append(')');
        return h.toString();
    }
}
