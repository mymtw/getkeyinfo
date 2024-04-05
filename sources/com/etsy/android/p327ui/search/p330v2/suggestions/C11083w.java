package com.etsy.android.p327ui.search.p330v2.suggestions;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.search.GiftGuide;
import com.etsy.android.lib.models.apiv3.search.TaxonomyNode;
import com.etsy.android.p327ui.search.p330v2.suggestions.C11064o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.search.v2.suggestions.w */
public abstract class C11083w {

    /* renamed from: com.etsy.android.ui.search.v2.suggestions.w$a */
    public static final class C11084a extends C11083w {

        /* renamed from: a */
        public final TaxonomyNode f24554a;

        /* renamed from: b */
        public final int f24555b;

        public C11084a(TaxonomyNode taxonomyNode, int i) {
            C19383o.m32797g(taxonomyNode, ResponseConstants.CATEGORY);
            this.f24554a = taxonomyNode;
            this.f24555b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11084a)) {
                return false;
            }
            C11084a aVar = (C11084a) obj;
            return C19383o.m32792b(this.f24554a, aVar.f24554a) && this.f24555b == aVar.f24555b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f24555b) + (this.f24554a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Category(category=");
            h.append(this.f24554a);
            h.append(", position=");
            return C0073e.m208h(h, this.f24555b, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.suggestions.w$b */
    public static final class C11085b extends C11083w {

        /* renamed from: a */
        public final TaxonomyNode f24556a;

        /* renamed from: b */
        public final int f24557b;

        public C11085b(TaxonomyNode taxonomyNode, int i) {
            C19383o.m32797g(taxonomyNode, ResponseConstants.CATEGORY);
            this.f24556a = taxonomyNode;
            this.f24557b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11085b)) {
                return false;
            }
            C11085b bVar = (C11085b) obj;
            return C19383o.m32792b(this.f24556a, bVar.f24556a) && this.f24557b == bVar.f24557b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f24557b) + (this.f24556a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("CategoryWithMargins(category=");
            h.append(this.f24556a);
            h.append(", position=");
            return C0073e.m208h(h, this.f24557b, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.suggestions.w$c */
    public static final class C11086c extends C11083w {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11086c)) {
                return false;
            }
            ((C11086c) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Divider(addTopMargin=false)";
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.suggestions.w$d */
    public static final class C11087d extends C11083w {

        /* renamed from: a */
        public final String f24558a;

        public C11087d(String str) {
            C19383o.m32797g(str, "imageUrl");
            this.f24558a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11087d) && C19383o.m32792b(this.f24558a, ((C11087d) obj).f24558a);
        }

        public final int hashCode() {
            return this.f24558a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("GiftCard(imageUrl="), this.f24558a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.suggestions.w$e */
    public static final class C11088e extends C11083w {

        /* renamed from: a */
        public final List<GiftGuide> f24559a;

        public C11088e(List<GiftGuide> list) {
            C19383o.m32797g(list, "giftGuides");
            this.f24559a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11088e) && C19383o.m32792b(this.f24559a, ((C11088e) obj).f24559a);
        }

        public final int hashCode() {
            return this.f24559a.hashCode();
        }

        public final String toString() {
            return C0070b.m186i(C0072d.m201h("GiftGuides(giftGuides="), this.f24559a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.suggestions.w$f */
    public static final class C11089f extends C11083w {

        /* renamed from: a */
        public final C11064o f24560a;

        public C11089f(C11064o oVar) {
            this.f24560a = oVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11089f) && C19383o.m32792b(this.f24560a, ((C11089f) obj).f24560a);
        }

        public final int hashCode() {
            return this.f24560a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Item(type=");
            h.append(this.f24560a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.suggestions.w$g */
    public static final class C11090g extends C11083w {

        /* renamed from: a */
        public final C11056k f24561a;

        public C11090g(C11056k kVar) {
            C19383o.m32797g(kVar, "type");
            this.f24561a = kVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11090g) && C19383o.m32792b(this.f24561a, ((C11090g) obj).f24561a);
        }

        public final int hashCode() {
            return this.f24561a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ItemHeader(type=");
            h.append(this.f24561a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.suggestions.w$h */
    public static final class C11091h extends C11083w {

        /* renamed from: a */
        public final C11071q f24562a;

        public C11091h(C11071q qVar) {
            C19383o.m32797g(qVar, "type");
            this.f24562a = qVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11091h) && C19383o.m32792b(this.f24562a, ((C11091h) obj).f24562a);
        }

        public final int hashCode() {
            return this.f24562a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("LargeHeader(type=");
            h.append(this.f24562a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.suggestions.w$i */
    public static final class C11092i extends C11083w {

        /* renamed from: a */
        public static final C11092i f24563a = new C11092i();

        public final boolean equals(Object obj) {
            return obj instanceof C11092i;
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.suggestions.w$j */
    public static final class C11093j extends C11083w {

        /* renamed from: a */
        public final String f24564a;

        /* renamed from: b */
        public final String f24565b;

        public C11093j(String str, String str2) {
            C19383o.m32797g(str, "query");
            C19383o.m32797g(str2, "deepLink");
            this.f24564a = str;
            this.f24565b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11093j)) {
                return false;
            }
            C11093j jVar = (C11093j) obj;
            return C19383o.m32792b(this.f24564a, jVar.f24564a) && C19383o.m32792b(this.f24565b, jVar.f24565b);
        }

        public final int hashCode() {
            return this.f24565b.hashCode() + (this.f24564a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("MoreShops(query=");
            h.append(this.f24564a);
            h.append(", deepLink=");
            return C0391c.m1057c(h, this.f24565b, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.suggestions.w$k */
    public static final class C11094k extends C11083w {

        /* renamed from: a */
        public final List<C11064o.C11068d> f24566a;

        public C11094k(ArrayList arrayList) {
            C19383o.m32797g(arrayList, "listings");
            this.f24566a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11094k) && C19383o.m32792b(this.f24566a, ((C11094k) obj).f24566a);
        }

        public final int hashCode() {
            return this.f24566a.hashCode();
        }

        public final String toString() {
            return C0070b.m186i(C0072d.m201h("MultiListing(listings="), this.f24566a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.suggestions.w$l */
    public static final class C11095l extends C11083w {

        /* renamed from: a */
        public static final C11095l f24567a = new C11095l();

        public final boolean equals(Object obj) {
            return obj instanceof C11095l;
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.suggestions.w$m */
    public static final class C11096m extends C11083w {

        /* renamed from: a */
        public final String f24568a;

        public C11096m(String str) {
            C19383o.m32797g(str, "query");
            this.f24568a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11096m) && C19383o.m32792b(this.f24568a, ((C11096m) obj).f24568a);
        }

        public final int hashCode() {
            return this.f24568a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("NoShops(query="), this.f24568a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.suggestions.w$n */
    public static final class C11097n extends C11083w {

        /* renamed from: a */
        public final String f24569a;

        /* renamed from: b */
        public final String f24570b;

        /* renamed from: c */
        public final String f24571c;

        /* renamed from: d */
        public final String f24572d;

        /* renamed from: e */
        public final int f24573e;

        public C11097n(String str, String str2, String str3, String str4, int i) {
            C19383o.m32797g(str, "name");
            C19383o.m32797g(str4, "deepLink");
            this.f24569a = str;
            this.f24570b = str2;
            this.f24571c = str3;
            this.f24572d = str4;
            this.f24573e = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11097n)) {
                return false;
            }
            C11097n nVar = (C11097n) obj;
            return C19383o.m32792b(this.f24569a, nVar.f24569a) && C19383o.m32792b(this.f24570b, nVar.f24570b) && C19383o.m32792b(this.f24571c, nVar.f24571c) && C19383o.m32792b(this.f24572d, nVar.f24572d) && this.f24573e == nVar.f24573e;
        }

        public final int hashCode() {
            int e = C0023f.m105e(this.f24570b, this.f24569a.hashCode() * 31, 31);
            String str = this.f24571c;
            return Integer.hashCode(this.f24573e) + C0023f.m105e(this.f24572d, (e + (str == null ? 0 : str.hashCode())) * 31, 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Shop(name=");
            h.append(this.f24569a);
            h.append(", owner=");
            h.append(this.f24570b);
            h.append(", imageUrl=");
            h.append(this.f24571c);
            h.append(", deepLink=");
            h.append(this.f24572d);
            h.append(", position=");
            return C0073e.m208h(h, this.f24573e, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.suggestions.w$o */
    public static final class C11098o extends C11083w {

        /* renamed from: a */
        public final GiftGuide f24574a;

        public C11098o(GiftGuide giftGuide) {
            C19383o.m32797g(giftGuide, "giftGuide");
            this.f24574a = giftGuide;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11098o) && C19383o.m32792b(this.f24574a, ((C11098o) obj).f24574a);
        }

        public final int hashCode() {
            return this.f24574a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("SingleGiftGuide(giftGuide=");
            h.append(this.f24574a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.suggestions.w$p */
    public static final class C11099p extends C11083w {

        /* renamed from: a */
        public final C11040a0 f24575a;

        /* renamed from: b */
        public final boolean f24576b;

        public C11099p(C11040a0 a0Var, boolean z) {
            C19383o.m32797g(a0Var, "type");
            this.f24575a = a0Var;
            this.f24576b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11099p)) {
                return false;
            }
            C11099p pVar = (C11099p) obj;
            return C19383o.m32792b(this.f24575a, pVar.f24575a) && this.f24576b == pVar.f24576b;
        }

        public final int hashCode() {
            int hashCode = this.f24575a.hashCode() * 31;
            boolean z = this.f24576b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("SmallHeader(type=");
            h.append(this.f24575a);
            h.append(", showDivider=");
            return C0391c.m1058d(h, this.f24576b, ')');
        }
    }
}
