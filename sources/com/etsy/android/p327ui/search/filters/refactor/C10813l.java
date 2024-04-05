package com.etsy.android.p327ui.search.filters.refactor;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.FilterCountry;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.filters.refactor.l */
public interface C10813l {

    /* renamed from: com.etsy.android.ui.search.filters.refactor.l$a */
    public static final class C10814a implements C10813l {

        /* renamed from: a */
        public final C10789b f23950a;

        public C10814a(C10789b bVar) {
            C19383o.m32797g(bVar, "selectedItem");
            this.f23950a = bVar;
        }

        /* renamed from: a */
        public final C10789b mo35919a() {
            return this.f23950a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10814a) && C19383o.m32792b(this.f23950a, ((C10814a) obj).f23950a);
        }

        public final int hashCode() {
            return this.f23950a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("CategorySelected(selectedItem=");
            h.append(this.f23950a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.l$b */
    public static final class C10815b implements C10813l {

        /* renamed from: a */
        public final C10792c f23951a;

        /* renamed from: b */
        public final boolean f23952b;

        public C10815b(C10792c cVar, boolean z) {
            this.f23951a = cVar;
            this.f23952b = z;
        }

        /* renamed from: a */
        public final C10792c mo35923a() {
            return this.f23951a;
        }

        /* renamed from: b */
        public final boolean mo35924b() {
            return this.f23952b;
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.l$c */
    public static final class C10816c implements C10813l {

        /* renamed from: a */
        public final boolean f23953a;

        /* renamed from: b */
        public final String f23954b;

        public C10816c(boolean z, String str) {
            C19383o.m32797g(str, "changedPrice");
            this.f23953a = z;
            this.f23954b = str;
        }

        /* renamed from: a */
        public final String mo35925a() {
            return this.f23954b;
        }

        /* renamed from: b */
        public final boolean mo35926b() {
            return this.f23953a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10816c)) {
                return false;
            }
            C10816c cVar = (C10816c) obj;
            return this.f23953a == cVar.f23953a && C19383o.m32792b(this.f23954b, cVar.f23954b);
        }

        public final int hashCode() {
            boolean z = this.f23953a;
            if (z) {
                z = true;
            }
            return this.f23954b.hashCode() + ((z ? 1 : 0) * true);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("CustomPriceChanged(isMin=");
            h.append(this.f23953a);
            h.append(", changedPrice=");
            return C0391c.m1057c(h, this.f23954b, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.l$d */
    public static final class C10817d implements C10813l {

        /* renamed from: a */
        public final String f23955a;

        /* renamed from: b */
        public final boolean f23956b;

        public C10817d(String str, boolean z) {
            C19383o.m32797g(str, "id");
            this.f23955a = str;
            this.f23956b = z;
        }

        /* renamed from: a */
        public final String mo35930a() {
            return this.f23955a;
        }

        /* renamed from: b */
        public final boolean mo35931b() {
            return this.f23956b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10817d)) {
                return false;
            }
            C10817d dVar = (C10817d) obj;
            return C19383o.m32792b(this.f23955a, dVar.f23955a) && this.f23956b == dVar.f23956b;
        }

        public final int hashCode() {
            int hashCode = this.f23955a.hashCode() * 31;
            boolean z = this.f23956b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("GroupExpansionChanged(id=");
            h.append(this.f23955a);
            h.append(", isExpanded=");
            return C0391c.m1058d(h, this.f23956b, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.l$e */
    public static final class C10818e implements C10813l {

        /* renamed from: a */
        public final ItemTypeSelectItem f23957a;

        public C10818e(ItemTypeSelectItem itemTypeSelectItem) {
            this.f23957a = itemTypeSelectItem;
        }

        /* renamed from: a */
        public final ItemTypeSelectItem mo35935a() {
            return this.f23957a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10818e) && C19383o.m32792b(this.f23957a, ((C10818e) obj).f23957a);
        }

        public final int hashCode() {
            return this.f23957a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ItemTypeSelectedEvent(selectedItem=");
            h.append(this.f23957a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.l$f */
    public static final class C10819f implements C10813l {

        /* renamed from: a */
        public final C10798d f23958a;

        /* renamed from: b */
        public final boolean f23959b;

        public C10819f(C10798d dVar, boolean z) {
            C19383o.m32797g(dVar, "changedItem");
            this.f23958a = dVar;
            this.f23959b = z;
        }

        /* renamed from: a */
        public final C10798d mo35939a() {
            return this.f23958a;
        }

        /* renamed from: b */
        public final boolean mo35940b() {
            return this.f23959b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10819f)) {
                return false;
            }
            C10819f fVar = (C10819f) obj;
            return C19383o.m32792b(this.f23958a, fVar.f23958a) && this.f23959b == fVar.f23959b;
        }

        public final int hashCode() {
            int hashCode = this.f23958a.hashCode() * 31;
            boolean z = this.f23959b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("MultiSelectChangedEvent(changedItem=");
            h.append(this.f23958a);
            h.append(", isSelected=");
            return C0391c.m1058d(h, this.f23959b, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.l$g */
    public static final class C10820g implements C10813l {

        /* renamed from: a */
        public final String f23960a;

        /* renamed from: b */
        public final boolean f23961b;

        public C10820g(String str, boolean z) {
            C19383o.m32797g(str, "optionId");
            this.f23960a = str;
            this.f23961b = z;
        }

        /* renamed from: a */
        public final String mo35944a() {
            return this.f23960a;
        }

        /* renamed from: b */
        public final boolean mo35945b() {
            return this.f23961b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10820g)) {
                return false;
            }
            C10820g gVar = (C10820g) obj;
            return C19383o.m32792b(this.f23960a, gVar.f23960a) && this.f23961b == gVar.f23961b;
        }

        public final int hashCode() {
            int hashCode = this.f23960a.hashCode() * 31;
            boolean z = this.f23961b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("OtherOptionChanged(optionId=");
            h.append(this.f23960a);
            h.append(", isSelected=");
            return C0391c.m1058d(h, this.f23961b, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.l$h */
    public static final class C10821h implements C10813l {

        /* renamed from: a */
        public final C10803g f23962a;

        public C10821h(C10803g gVar) {
            C19383o.m32797g(gVar, "selectedItem");
            this.f23962a = gVar;
        }

        /* renamed from: a */
        public final C10803g mo35949a() {
            return this.f23962a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10821h) && C19383o.m32792b(this.f23962a, ((C10821h) obj).f23962a);
        }

        public final int hashCode() {
            return this.f23962a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("PriceFilterOptionChanged(selectedItem=");
            h.append(this.f23962a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.l$i */
    public static final class C10822i implements C10813l {

        /* renamed from: a */
        public final boolean f23963a;

        /* renamed from: b */
        public final String f23964b;

        public C10822i(boolean z, String str) {
            C19383o.m32797g(str, "changedPrice");
            this.f23963a = z;
            this.f23964b = str;
        }

        /* renamed from: a */
        public final String mo35953a() {
            return this.f23964b;
        }

        /* renamed from: b */
        public final boolean mo35954b() {
            return this.f23963a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10822i)) {
                return false;
            }
            C10822i iVar = (C10822i) obj;
            return this.f23963a == iVar.f23963a && C19383o.m32792b(this.f23964b, iVar.f23964b);
        }

        public final int hashCode() {
            boolean z = this.f23963a;
            if (z) {
                z = true;
            }
            return this.f23964b.hashCode() + ((z ? 1 : 0) * true);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("PriceMultiSelectCustomPriceChanged(isMin=");
            h.append(this.f23963a);
            h.append(", changedPrice=");
            return C0391c.m1057c(h, this.f23964b, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.l$j */
    public static final class C10823j implements C10813l {

        /* renamed from: a */
        public final C10803g f23965a;

        /* renamed from: b */
        public final boolean f23966b;

        public C10823j(C10803g gVar, boolean z) {
            C19383o.m32797g(gVar, "selectedItem");
            this.f23965a = gVar;
            this.f23966b = z;
        }

        /* renamed from: a */
        public final C10803g mo35958a() {
            return this.f23965a;
        }

        /* renamed from: b */
        public final boolean mo35959b() {
            return this.f23966b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10823j)) {
                return false;
            }
            C10823j jVar = (C10823j) obj;
            return C19383o.m32792b(this.f23965a, jVar.f23965a) && this.f23966b == jVar.f23966b;
        }

        public final int hashCode() {
            int hashCode = this.f23965a.hashCode() * 31;
            boolean z = this.f23966b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("PriceMultiSelectOptionChanged(selectedItem=");
            h.append(this.f23965a);
            h.append(", isSelected=");
            return C0391c.m1058d(h, this.f23966b, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.l$k */
    public static final class C10824k implements C10813l {

        /* renamed from: a */
        public static final C10824k f23967a = new C10824k();
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.l$l */
    public static final class C10825l implements C10813l {

        /* renamed from: a */
        public final String f23968a;

        /* renamed from: b */
        public final boolean f23969b;

        public C10825l(String str, boolean z) {
            C19383o.m32797g(str, "optionId");
            this.f23968a = str;
            this.f23969b = z;
        }

        /* renamed from: a */
        public final String mo35963a() {
            return this.f23968a;
        }

        /* renamed from: b */
        public final boolean mo35964b() {
            return this.f23969b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10825l)) {
                return false;
            }
            C10825l lVar = (C10825l) obj;
            return C19383o.m32792b(this.f23968a, lVar.f23968a) && this.f23969b == lVar.f23969b;
        }

        public final int hashCode() {
            int hashCode = this.f23968a.hashCode() * 31;
            boolean z = this.f23969b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ShippingFilterOptionChanged(optionId=");
            h.append(this.f23968a);
            h.append(", isSelected=");
            return C0391c.m1058d(h, this.f23969b, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.l$m */
    public static final class C10826m implements C10813l {

        /* renamed from: a */
        public static final C10826m f23970a = new C10826m();
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.l$n */
    public static final class C10827n implements C10813l {

        /* renamed from: a */
        public final String f23971a;

        /* renamed from: b */
        public final boolean f23972b;

        public C10827n(String str, boolean z) {
            this.f23971a = str;
            this.f23972b = z;
        }

        /* renamed from: a */
        public final String mo35968a() {
            return this.f23971a;
        }

        /* renamed from: b */
        public final boolean mo35969b() {
            return this.f23972b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10827n)) {
                return false;
            }
            C10827n nVar = (C10827n) obj;
            return C19383o.m32792b(this.f23971a, nVar.f23971a) && this.f23972b == nVar.f23972b;
        }

        public final int hashCode() {
            int hashCode = this.f23971a.hashCode() * 31;
            boolean z = this.f23972b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ShopLocationItemSelected(id=");
            h.append(this.f23971a);
            h.append(", selected=");
            return C0391c.m1058d(h, this.f23972b, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.l$o */
    public static final class C10828o implements C10813l {

        /* renamed from: a */
        public final String f23973a;

        public C10828o(String str) {
            C19383o.m32797g(str, "updatedText");
            this.f23973a = str;
        }

        /* renamed from: a */
        public final String mo35973a() {
            return this.f23973a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10828o) && C19383o.m32792b(this.f23973a, ((C10828o) obj).f23973a);
        }

        public final int hashCode() {
            return this.f23973a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("ShopLocationUpdated(updatedText="), this.f23973a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.l$p */
    public static final class C10829p implements C10813l {

        /* renamed from: a */
        public static final C10829p f23974a = new C10829p();
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.l$q */
    public static final class C10830q implements C10813l {

        /* renamed from: a */
        public final C10798d f23975a;

        /* renamed from: b */
        public final boolean f23976b;

        public C10830q(C10798d dVar, boolean z) {
            this.f23975a = dVar;
            this.f23976b = z;
        }

        /* renamed from: a */
        public final C10798d mo35977a() {
            return this.f23975a;
        }

        /* renamed from: b */
        public final boolean mo35978b() {
            return this.f23976b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10830q)) {
                return false;
            }
            C10830q qVar = (C10830q) obj;
            return C19383o.m32792b(this.f23975a, qVar.f23975a) && this.f23976b == qVar.f23976b;
        }

        public final int hashCode() {
            int hashCode = this.f23975a.hashCode() * 31;
            boolean z = this.f23976b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("SizeSelectChangedEvent(changedItem=");
            h.append(this.f23975a);
            h.append(", isSelected=");
            return C0391c.m1058d(h, this.f23976b, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.l$r */
    public static final class C10831r implements C10813l {

        /* renamed from: a */
        public final SortBySelectItem f23977a;

        public C10831r(SortBySelectItem sortBySelectItem) {
            this.f23977a = sortBySelectItem;
        }

        /* renamed from: a */
        public final SortBySelectItem mo35982a() {
            return this.f23977a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10831r) && C19383o.m32792b(this.f23977a, ((C10831r) obj).f23977a);
        }

        public final int hashCode() {
            return this.f23977a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("SortBySelectedEvent(selectedItem=");
            h.append(this.f23977a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.l$s */
    public static final class C10832s implements C10813l {

        /* renamed from: a */
        public static final C10832s f23978a = new C10832s();
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.l$t */
    public static final class C10833t implements C10813l {

        /* renamed from: a */
        public final FilterCountry f23979a;

        public C10833t(FilterCountry filterCountry) {
            this.f23979a = filterCountry;
        }

        /* renamed from: a */
        public final FilterCountry mo35986a() {
            return this.f23979a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10833t) && C19383o.m32792b(this.f23979a, ((C10833t) obj).f23979a);
        }

        public final int hashCode() {
            return this.f23979a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("UpdateShipsToCountryResult(country=");
            h.append(this.f23979a);
            h.append(')');
            return h.toString();
        }
    }
}
