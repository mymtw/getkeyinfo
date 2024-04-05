package com.etsy.android.p327ui.listing;

import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.GooglePayData;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext;
import com.etsy.android.lib.models.apiv3.listing.ListingFetch;
import com.etsy.android.lib.models.apiv3.listing.Shop;
import com.etsy.android.lib.models.apiv3.listing.Variation;
import com.etsy.android.lib.models.apiv3.listing.VariationValue;
import com.etsy.android.p327ui.listing.p329ui.C10409f;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.C10425l;
import com.etsy.android.p327ui.listing.p329ui.ListingSections;
import com.etsy.android.p327ui.listing.p329ui.buybox.personalization.optional.C10279a;
import com.etsy.android.p327ui.listing.p329ui.buybox.personalization.required.C10285a;
import com.etsy.android.p327ui.listing.p329ui.buybox.quantity.C10299a;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.listing.C10349a;
import com.etsy.android.p327ui.listing.p329ui.buybox.variations.listing.C10350b;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C19318k;
import kotlin.collections.C19322o;
import kotlin.collections.C19327t;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import p459ud.C13473a;
import p467vd.C13780a;
import p568fn.C17782b;

/* renamed from: com.etsy.android.ui.listing.ListingViewState */
public abstract class ListingViewState {

    /* renamed from: a */
    public final boolean f22229a;

    /* renamed from: b */
    public C10096a f22230b;

    /* renamed from: com.etsy.android.ui.listing.ListingViewState$ImageVisibility */
    public enum ImageVisibility {
        NONE,
        VISIBLE
    }

    /* renamed from: com.etsy.android.ui.listing.ListingViewState$a */
    public static final class C10089a extends ListingViewState {

        /* renamed from: c */
        public C10096a f22231c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10089a(C10096a aVar) {
            super(true, aVar);
            C19383o.m32797g(aVar, "commonListingState");
            this.f22231c = aVar;
        }

        /* renamed from: a */
        public final C10096a mo33466a() {
            return this.f22231c;
        }

        /* renamed from: d */
        public final void mo33469d(C10096a aVar) {
            this.f22231c = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10089a) && C19383o.m32792b(this.f22231c, ((C10089a) obj).f22231c);
        }

        public final int hashCode() {
            return this.f22231c.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ErrorNoInternet(commonListingState=");
            h.append(this.f22231c);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.listing.ListingViewState$b */
    public static final class C10090b extends ListingViewState {

        /* renamed from: c */
        public final String f22232c;

        /* renamed from: d */
        public C10096a f22233d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10090b(String str, C10096a aVar) {
            super(true, aVar);
            C19383o.m32797g(aVar, "commonListingState");
            this.f22232c = str;
            this.f22233d = aVar;
        }

        /* renamed from: a */
        public final C10096a mo33466a() {
            return this.f22233d;
        }

        /* renamed from: d */
        public final void mo33469d(C10096a aVar) {
            this.f22233d = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10090b)) {
                return false;
            }
            C10090b bVar = (C10090b) obj;
            return C19383o.m32792b(this.f22232c, bVar.f22232c) && C19383o.m32792b(this.f22233d, bVar.f22233d);
        }

        public final int hashCode() {
            String str = this.f22232c;
            return this.f22233d.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ErrorUnavailable(subtitle=");
            h.append(this.f22232c);
            h.append(", commonListingState=");
            h.append(this.f22233d);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.listing.ListingViewState$c */
    public static final class C10091c extends ListingViewState {

        /* renamed from: c */
        public static final C10091c f22234c = new C10091c();

        public C10091c() {
            super(false, new C10096a(0));
        }
    }

    /* renamed from: com.etsy.android.ui.listing.ListingViewState$d */
    public static final class C10092d extends ListingViewState {

        /* renamed from: c */
        public final boolean f22235c;

        /* renamed from: d */
        public C10096a f22236d;

        /* renamed from: e */
        public final boolean f22237e;

        /* renamed from: f */
        public final C10409f f22238f;

        /* renamed from: g */
        public final ListingFetch f22239g;

        /* renamed from: h */
        public final GooglePayData f22240h;

        /* renamed from: i */
        public final AppsInventoryAddToCartContext f22241i;

        /* renamed from: j */
        public final C10425l f22242j;

        /* renamed from: k */
        public final boolean f22243k;

        /* renamed from: l */
        public final ListingSections.Order f22244l;

        /* renamed from: m */
        public final ArrayList f22245m = new ArrayList();

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10092d(boolean z, C10096a aVar, boolean z2, C10409f fVar, ListingFetch listingFetch, GooglePayData googlePayData, AppsInventoryAddToCartContext appsInventoryAddToCartContext, C10425l lVar, boolean z3, ListingSections.Order order) {
            super(z, aVar);
            C19383o.m32797g(aVar, "commonListingState");
            C19383o.m32797g(lVar, "machineTranslationData");
            C19383o.m32797g(order, "sectionsOrder");
            this.f22235c = z;
            this.f22236d = aVar;
            this.f22237e = z2;
            this.f22238f = fVar;
            this.f22239g = listingFetch;
            this.f22240h = googlePayData;
            this.f22241i = appsInventoryAddToCartContext;
            this.f22242j = lVar;
            this.f22243k = z3;
            this.f22244l = order;
        }

        /* renamed from: e */
        public static C10092d m18242e(C10092d dVar, boolean z, C10409f fVar, GooglePayData googlePayData, AppsInventoryAddToCartContext appsInventoryAddToCartContext, C10425l lVar, boolean z2, int i) {
            C10092d dVar2 = dVar;
            int i2 = i;
            boolean z3 = (i2 & 1) != 0 ? dVar2.f22235c : false;
            C10096a aVar = (i2 & 2) != 0 ? dVar2.f22236d : null;
            boolean z4 = (i2 & 4) != 0 ? dVar2.f22237e : z;
            C10409f fVar2 = (i2 & 8) != 0 ? dVar2.f22238f : fVar;
            ListingFetch listingFetch = (i2 & 16) != 0 ? dVar2.f22239g : null;
            GooglePayData googlePayData2 = (i2 & 32) != 0 ? dVar2.f22240h : googlePayData;
            AppsInventoryAddToCartContext appsInventoryAddToCartContext2 = (i2 & 64) != 0 ? dVar2.f22241i : appsInventoryAddToCartContext;
            C10425l lVar2 = (i2 & 128) != 0 ? dVar2.f22242j : lVar;
            boolean z5 = (i2 & 256) != 0 ? dVar2.f22243k : z2;
            ListingSections.Order order = (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? dVar2.f22244l : null;
            dVar.getClass();
            C19383o.m32797g(aVar, "commonListingState");
            C19383o.m32797g(fVar2, ResponseConstants.f19137UI);
            C19383o.m32797g(listingFetch, "listingFetch");
            C19383o.m32797g(lVar2, "machineTranslationData");
            C19383o.m32797g(order, "sectionsOrder");
            return new C10092d(z3, aVar, z4, fVar2, listingFetch, googlePayData2, appsInventoryAddToCartContext2, lVar2, z5, order);
        }

        /* renamed from: a */
        public final C10096a mo33466a() {
            return this.f22236d;
        }

        /* renamed from: c */
        public final boolean mo33468c() {
            return this.f22235c;
        }

        /* renamed from: d */
        public final void mo33469d(C10096a aVar) {
            this.f22236d = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10092d)) {
                return false;
            }
            C10092d dVar = (C10092d) obj;
            return this.f22235c == dVar.f22235c && C19383o.m32792b(this.f22236d, dVar.f22236d) && this.f22237e == dVar.f22237e && C19383o.m32792b(this.f22238f, dVar.f22238f) && C19383o.m32792b(this.f22239g, dVar.f22239g) && C19383o.m32792b(this.f22240h, dVar.f22240h) && C19383o.m32792b(this.f22241i, dVar.f22241i) && C19383o.m32792b(this.f22242j, dVar.f22242j) && this.f22243k == dVar.f22243k && this.f22244l == dVar.f22244l;
        }

        /* renamed from: f */
        public final long mo33477f() {
            return this.f22239g.getListing().getListingId();
        }

        /* renamed from: g */
        public final String mo33478g() {
            String str;
            C10423j jVar = this.f22238f.f22802e.f22829n;
            if (jVar == null) {
                return null;
            }
            C10279a aVar = jVar instanceof C10279a ? (C10279a) jVar : null;
            if (aVar != null && (str = aVar.f22589e) != null) {
                return str;
            }
            C10285a aVar2 = jVar instanceof C10285a ? (C10285a) jVar : null;
            if (aVar2 != null) {
                return aVar2.f22603e;
            }
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
            r0 = r0.getOffering();
         */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Long mo33479h() {
            /*
                r4 = this;
                com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext r0 = r4.f22241i
                r1 = 0
                if (r0 == 0) goto L_0x0014
                com.etsy.android.lib.models.apiv3.listing.InventoryProductOffering r0 = r0.getOffering()
                if (r0 == 0) goto L_0x0014
                long r2 = r0.getOfferingId()
                java.lang.Long r0 = java.lang.Long.valueOf(r2)
                goto L_0x0015
            L_0x0014:
                r0 = r1
            L_0x0015:
                boolean r0 = com.google.android.play.core.assetpacks.C15588c1.m25348t0(r0)
                if (r0 == 0) goto L_0x002d
                com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext r0 = r4.f22241i
                if (r0 == 0) goto L_0x002d
                com.etsy.android.lib.models.apiv3.listing.InventoryProductOffering r0 = r0.getOffering()
                if (r0 == 0) goto L_0x002d
                long r0 = r0.getOfferingId()
                java.lang.Long r1 = java.lang.Long.valueOf(r0)
            L_0x002d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.ListingViewState.C10092d.mo33479h():java.lang.Long");
        }

        public final int hashCode() {
            boolean z = this.f22235c;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int hashCode = (this.f22236d.hashCode() + ((z ? 1 : 0) * true)) * 31;
            boolean z3 = this.f22237e;
            if (z3) {
                z3 = true;
            }
            int hashCode2 = (this.f22239g.hashCode() + ((this.f22238f.hashCode() + ((hashCode + (z3 ? 1 : 0)) * 31)) * 31)) * 31;
            GooglePayData googlePayData = this.f22240h;
            int i = 0;
            int hashCode3 = (hashCode2 + (googlePayData == null ? 0 : googlePayData.hashCode())) * 31;
            AppsInventoryAddToCartContext appsInventoryAddToCartContext = this.f22241i;
            if (appsInventoryAddToCartContext != null) {
                i = appsInventoryAddToCartContext.hashCode();
            }
            int hashCode4 = (this.f22242j.hashCode() + ((hashCode3 + i) * 31)) * 31;
            boolean z4 = this.f22243k;
            if (!z4) {
                z2 = z4;
            }
            return this.f22244l.hashCode() + ((hashCode4 + (z2 ? 1 : 0)) * 31);
        }

        /* renamed from: i */
        public final ArrayList mo33481i() {
            VariationValue variationValue;
            VariationValue variationValue2;
            ArrayList arrayList = new ArrayList();
            C10409f.C10410a aVar = this.f22238f.f22802e;
            C10423j jVar = aVar.f22823h;
            Variation variation = null;
            C10349a aVar2 = jVar instanceof C10349a ? (C10349a) jVar : null;
            C10423j jVar2 = aVar.f22824i;
            C10350b bVar = jVar2 instanceof C10350b ? (C10350b) jVar2 : null;
            if (!((aVar2 != null ? aVar2.f22709a : null) == null || (variationValue2 = aVar2.f22710b) == null)) {
                arrayList.add(new Pair(aVar2.f22709a, variationValue2));
            }
            if (bVar != null) {
                variation = bVar.f22712a;
            }
            if (!(variation == null || (variationValue = bVar.f22713b) == null)) {
                arrayList.add(new Pair(bVar.f22712a, variationValue));
            }
            return arrayList;
        }

        /* renamed from: j */
        public final int mo33482j() {
            C10299a aVar = this.f22238f.f22802e.f22828m;
            if (aVar != null) {
                return aVar.f22609a;
            }
            return 1;
        }

        /* renamed from: k */
        public final Shop mo33483k() {
            return this.f22239g.getShop();
        }

        /* renamed from: l */
        public final Long mo33484l() {
            Shop shop = this.f22239g.getShop();
            if (shop != null) {
                return shop.getShopId();
            }
            return null;
        }

        /* renamed from: m */
        public final ArrayList mo33485m() {
            ArrayList arrayList;
            C10409f fVar = this.f22238f;
            ListingSections.Order order = this.f22244l;
            fVar.getClass();
            C19383o.m32797g(order, ResponseConstants.ORDER);
            int i = C10409f.C10416e.f22851a[order.ordinal()];
            Object obj = null;
            if (i == 1 || i == 2) {
                List[] listArr = new List[9];
                listArr[0] = C19318k.m32611c1(new C10423j[]{fVar.f22798a, fVar.f22801d, fVar.f22799b.f22850a});
                C13780a aVar = fVar.f22811n.f30311a;
                listArr[1] = aVar != null ? C17782b.m29864d0(aVar) : EmptyList.INSTANCE;
                listArr[2] = fVar.f22802e.mo33942a((ListingSections.Order) null);
                listArr[3] = fVar.f22803f.mo33950b(order);
                listArr[4] = C19318k.m32611c1(new C10423j[]{fVar.f22805h, fVar.f22806i});
                C13780a aVar2 = fVar.f22811n.f30311a;
                listArr[5] = aVar2 != null ? C17782b.m29864d0(aVar2) : EmptyList.INSTANCE;
                C10409f.C10412b bVar = fVar.f22807j;
                if (bVar != null) {
                    List d0 = C17782b.m29864d0(bVar.f22840a);
                    Iterable iterable = bVar.f22841b;
                    if (iterable == null) {
                        iterable = EmptyList.INSTANCE;
                    }
                    arrayList = C19327t.m32636R0(C19327t.m32651g1(C19327t.m32650f1(iterable, d0), bVar.f22842c));
                } else {
                    arrayList = null;
                }
                listArr[6] = arrayList;
                listArr[7] = fVar.f22808k.mo46151a();
                Object[] objArr = new C10423j[4];
                if (!(!C19383o.m32792b(fVar.f22808k, C13473a.C13475b.f29497b) && fVar.f22807j != null)) {
                    obj = fVar.f22811n.f30314d;
                }
                objArr[0] = obj;
                objArr[1] = fVar.f22812o;
                objArr[2] = fVar.f22809l;
                objArr[3] = fVar.f22810m;
                listArr[8] = C19318k.m32611c1(objArr);
                return C19322o.m32625G0(C19318k.m32611c1(listArr));
            } else if (i == 3) {
                Object[] objArr2 = new List[8];
                objArr2[0] = C19318k.m32611c1(new C10423j[]{fVar.f22798a, fVar.f22801d, fVar.f22811n.f30312b});
                objArr2[1] = fVar.f22802e.mo33942a(order);
                objArr2[2] = fVar.f22803f.mo33950b(order);
                objArr2[3] = C19318k.m32611c1(new C10423j[]{fVar.f22805h, fVar.f22806i});
                C13780a aVar3 = fVar.f22811n.f30311a;
                objArr2[4] = aVar3 != null ? C17782b.m29864d0(aVar3) : EmptyList.INSTANCE;
                C10409f.C10412b bVar2 = fVar.f22807j;
                if (bVar2 != null) {
                    List d02 = C17782b.m29864d0(bVar2.f22840a);
                    Iterable iterable2 = bVar2.f22841b;
                    if (iterable2 == null) {
                        iterable2 = EmptyList.INSTANCE;
                    }
                    obj = C19327t.m32636R0(C19327t.m32651g1(C19327t.m32650f1(iterable2, d02), bVar2.f22842c));
                }
                objArr2[5] = obj;
                objArr2[6] = fVar.f22808k.mo46151a();
                C10423j[] jVarArr = new C10423j[4];
                jVarArr[0] = !C19383o.m32792b(fVar.f22808k, C13473a.C13475b.f29497b) && fVar.f22807j != null ? fVar.f22811n.f30311a : fVar.f22811n.f30314d;
                jVarArr[1] = fVar.f22812o;
                jVarArr[2] = fVar.f22809l;
                jVarArr[3] = fVar.f22810m;
                objArr2[7] = C19318k.m32611c1(jVarArr);
                return C19322o.m32625G0(C19318k.m32611c1(objArr2));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Listing(isAppBarVisible=");
            h.append(this.f22235c);
            h.append(", commonListingState=");
            h.append(this.f22236d);
            h.append(", isCustomNavigationBarTransparent=");
            h.append(this.f22237e);
            h.append(", ui=");
            h.append(this.f22238f);
            h.append(", listingFetch=");
            h.append(this.f22239g);
            h.append(", googlePayData=");
            h.append(this.f22240h);
            h.append(", inventoryContext=");
            h.append(this.f22241i);
            h.append(", machineTranslationData=");
            h.append(this.f22242j);
            h.append(", isAddedToCart=");
            h.append(this.f22243k);
            h.append(", sectionsOrder=");
            h.append(this.f22244l);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.listing.ListingViewState$e */
    public static final class C10093e extends ListingViewState {

        /* renamed from: c */
        public C10096a f22246c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10093e(C10096a aVar) {
            super(false, aVar);
            C19383o.m32797g(aVar, "commonListingState");
            this.f22246c = aVar;
        }

        /* renamed from: a */
        public final C10096a mo33466a() {
            return this.f22246c;
        }

        /* renamed from: d */
        public final void mo33469d(C10096a aVar) {
            this.f22246c = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10093e) && C19383o.m32792b(this.f22246c, ((C10093e) obj).f22246c);
        }

        public final int hashCode() {
            return this.f22246c.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Loading(commonListingState=");
            h.append(this.f22246c);
            h.append(')');
            return h.toString();
        }
    }

    public ListingViewState(boolean z, C10096a aVar) {
        this.f22229a = z;
        this.f22230b = aVar;
    }

    /* renamed from: a */
    public C10096a mo33466a() {
        return this.f22230b;
    }

    /* renamed from: b */
    public final String mo33467b() {
        return mo33466a().f22248b;
    }

    /* renamed from: c */
    public boolean mo33468c() {
        return this.f22229a;
    }

    /* renamed from: d */
    public void mo33469d(C10096a aVar) {
        this.f22230b = aVar;
    }
}
