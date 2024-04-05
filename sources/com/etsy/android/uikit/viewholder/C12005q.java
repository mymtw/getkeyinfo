package com.etsy.android.uikit.viewholder;

import android.content.res.Resources;
import android.support.p013v4.media.C0072d;
import android.text.style.ForegroundColorSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.StrikethroughSpan;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.stylekit.typefaces.StyleKitSpan;
import kotlin.jvm.internal.C19383o;
import p425q9.C13265p;

/* renamed from: com.etsy.android.uikit.viewholder.q */
public final class C12005q {

    /* renamed from: a */
    public final ListingCard f26754a;

    /* renamed from: b */
    public final Resources f26755b;

    /* renamed from: c */
    public final C13265p f26756c;

    /* renamed from: d */
    public final C8630b f26757d;

    /* renamed from: e */
    public final StrikethroughSpan f26758e;

    /* renamed from: f */
    public final ForegroundColorSpan f26759f;

    /* renamed from: g */
    public final MetricAffectingSpan f26760g;

    public C12005q(ListingCard listingCard, Resources resources, C13265p pVar, C8630b bVar, StrikethroughSpan strikethroughSpan, ForegroundColorSpan foregroundColorSpan, StyleKitSpan.NormalSpan normalSpan) {
        C19383o.m32797g(listingCard, ResponseConstants.LISTING);
        C19383o.m32797g(pVar, "session");
        C19383o.m32797g(strikethroughSpan, "strikethroughSpan");
        C19383o.m32797g(foregroundColorSpan, "colorSpan");
        C19383o.m32797g(normalSpan, "fontSpan");
        this.f26754a = listingCard;
        this.f26755b = resources;
        this.f26756c = pVar;
        this.f26757d = bVar;
        this.f26758e = strikethroughSpan;
        this.f26759f = foregroundColorSpan;
        this.f26760g = normalSpan;
    }

    /* renamed from: a */
    public final String mo38870a(EtsyMoney etsyMoney) {
        if (etsyMoney == null) {
            return "";
        }
        if (this.f26757d == null) {
            return etsyMoney.format();
        }
        return this.f26757d.mo21248a(etsyMoney.getAmount().setScale(0, 2).toString(), etsyMoney.getCurrency().getCurrencyCode()).setMaximumFractionDigits(0).format();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12005q)) {
            return false;
        }
        C12005q qVar = (C12005q) obj;
        return C19383o.m32792b(this.f26754a, qVar.f26754a) && C19383o.m32792b(this.f26755b, qVar.f26755b) && C19383o.m32792b(this.f26756c, qVar.f26756c) && C19383o.m32792b(this.f26757d, qVar.f26757d) && C19383o.m32792b(this.f26758e, qVar.f26758e) && C19383o.m32792b(this.f26759f, qVar.f26759f) && C19383o.m32792b(this.f26760g, qVar.f26760g);
    }

    public final int hashCode() {
        int hashCode = (this.f26756c.hashCode() + ((this.f26755b.hashCode() + (this.f26754a.hashCode() * 31)) * 31)) * 31;
        C8630b bVar = this.f26757d;
        int hashCode2 = bVar == null ? 0 : bVar.hashCode();
        int hashCode3 = this.f26758e.hashCode();
        return this.f26760g.hashCode() + ((this.f26759f.hashCode() + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ListingCard3x3ViewModel(listing=");
        h.append(this.f26754a);
        h.append(", resources=");
        h.append(this.f26755b);
        h.append(", session=");
        h.append(this.f26756c);
        h.append(", etsyMoneyFactory=");
        h.append(this.f26757d);
        h.append(", strikethroughSpan=");
        h.append(this.f26758e);
        h.append(", colorSpan=");
        h.append(this.f26759f);
        h.append(", fontSpan=");
        h.append(this.f26760g);
        h.append(')');
        return h.toString();
    }
}
