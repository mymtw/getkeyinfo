package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.models.Country;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.f */
public final class C10563f {

    /* renamed from: a */
    public final Country f23155a;

    /* renamed from: b */
    public final String f23156b;

    /* renamed from: c */
    public final String f23157c;

    /* renamed from: d */
    public final EtsyMoney f23158d;

    /* renamed from: e */
    public final List<Country> f23159e;

    /* renamed from: f */
    public final CalculateShippingState f23160f;

    /* renamed from: g */
    public final String f23161g;

    /* renamed from: h */
    public final String f23162h;

    /* renamed from: i */
    public final String f23163i;

    /* renamed from: j */
    public final String f23164j;

    /* renamed from: k */
    public final String f23165k;

    /* renamed from: l */
    public final boolean f23166l;

    public C10563f() {
        this(0);
    }

    public C10563f(Country country, String str, String str2, EtsyMoney etsyMoney, List<Country> list, CalculateShippingState calculateShippingState, String str3, String str4, String str5, String str6, String str7, boolean z) {
        C19383o.m32797g(calculateShippingState, "state");
        this.f23155a = country;
        this.f23156b = str;
        this.f23157c = str2;
        this.f23158d = etsyMoney;
        this.f23159e = list;
        this.f23160f = calculateShippingState;
        this.f23161g = str3;
        this.f23162h = str4;
        this.f23163i = str5;
        this.f23164j = str6;
        this.f23165k = str7;
        this.f23166l = z;
    }

    /* renamed from: a */
    public static C10563f m18515a(C10563f fVar, String str, boolean z) {
        Country country = fVar.f23155a;
        String str2 = fVar.f23156b;
        String str3 = fVar.f23157c;
        EtsyMoney etsyMoney = fVar.f23158d;
        List<Country> list = fVar.f23159e;
        CalculateShippingState calculateShippingState = fVar.f23160f;
        String str4 = fVar.f23161g;
        String str5 = fVar.f23162h;
        String str6 = fVar.f23163i;
        String str7 = fVar.f23164j;
        fVar.getClass();
        C19383o.m32797g(calculateShippingState, "state");
        return new C10563f(country, str2, str3, etsyMoney, list, calculateShippingState, str4, str5, str6, str7, str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10563f)) {
            return false;
        }
        C10563f fVar = (C10563f) obj;
        return C19383o.m32792b(this.f23155a, fVar.f23155a) && C19383o.m32792b(this.f23156b, fVar.f23156b) && C19383o.m32792b(this.f23157c, fVar.f23157c) && C19383o.m32792b(this.f23158d, fVar.f23158d) && C19383o.m32792b(this.f23159e, fVar.f23159e) && this.f23160f == fVar.f23160f && C19383o.m32792b(this.f23161g, fVar.f23161g) && C19383o.m32792b(this.f23162h, fVar.f23162h) && C19383o.m32792b(this.f23163i, fVar.f23163i) && C19383o.m32792b(this.f23164j, fVar.f23164j) && C19383o.m32792b(this.f23165k, fVar.f23165k) && this.f23166l == fVar.f23166l;
    }

    public final int hashCode() {
        Country country = this.f23155a;
        int i = 0;
        int hashCode = (country == null ? 0 : country.hashCode()) * 31;
        String str = this.f23156b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f23157c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        EtsyMoney etsyMoney = this.f23158d;
        int hashCode4 = (hashCode3 + (etsyMoney == null ? 0 : etsyMoney.hashCode())) * 31;
        List<Country> list = this.f23159e;
        int hashCode5 = (this.f23160f.hashCode() + ((hashCode4 + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        String str3 = this.f23161g;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f23162h;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f23163i;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f23164j;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f23165k;
        if (str7 != null) {
            i = str7.hashCode();
        }
        int i2 = (hashCode9 + i) * 31;
        boolean z = this.f23166l;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("CalculatedShipping(shippingCountry=");
        h.append(this.f23155a);
        h.append(", shippingZip=");
        h.append(this.f23156b);
        h.append(", standardShippingOptionId=");
        h.append(this.f23157c);
        h.append(", standardShippingCost=");
        h.append(this.f23158d);
        h.append(", availableCountries=");
        h.append(this.f23159e);
        h.append(", state=");
        h.append(this.f23160f);
        h.append(", headerLabel=");
        h.append(this.f23161g);
        h.append(", headerUpdateButton=");
        h.append(this.f23162h);
        h.append(", viewOnlyDestinationName=");
        h.append(this.f23163i);
        h.append(", viewOnlyCost=");
        h.append(this.f23164j);
        h.append(", errorMessage=");
        h.append(this.f23165k);
        h.append(", isLoading=");
        return C0391c.m1058d(h, this.f23166l, ')');
    }

    public /* synthetic */ C10563f(int i) {
        this((Country) null, (String) null, (String) null, (EtsyMoney) null, (List<Country>) null, CalculateShippingState.GONE, (String) null, (String) null, (String) null, (String) null, (String) null, false);
    }
}
