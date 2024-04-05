package com.etsy.android.p327ui.listing.p329ui.buybox.lottienudge;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.R;
import com.etsy.android.p327ui.core.nudge.NudgeType;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.lottienudge.c */
public final class C10266c extends C10423j {

    /* renamed from: a */
    public final String f22554a;

    /* renamed from: b */
    public final NudgeType f22555b;

    /* renamed from: c */
    public final boolean f22556c;

    /* renamed from: d */
    public final boolean f22557d;

    /* renamed from: e */
    public final String f22558e;

    /* renamed from: f */
    public final String f22559f;

    /* renamed from: g */
    public final boolean f22560g;

    /* renamed from: com.etsy.android.ui.listing.ui.buybox.lottienudge.c$a */
    public /* synthetic */ class C10267a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22561a;

        static {
            int[] iArr = new int[NudgeType.values().length];
            iArr[NudgeType.IN_CART_ONLY.ordinal()] = 1;
            iArr[NudgeType.IN_CART_CAP_20.ordinal()] = 2;
            iArr[NudgeType.COMBO_CART_AND_QUANTITY.ordinal()] = 3;
            iArr[NudgeType.ONLY_ONE_AVAILABLE.ordinal()] = 4;
            iArr[NudgeType.QUANTITY_ONLY.ordinal()] = 5;
            iArr[NudgeType.RARE_FIND_AND_CART_COMBO.ordinal()] = 6;
            iArr[NudgeType.ALMOST_GONE_AND_CART_COMBO.ordinal()] = 7;
            iArr[NudgeType.LP_VIEWS_ONLY.ordinal()] = 8;
            iArr[NudgeType.IN_DEMAND.ordinal()] = 9;
            iArr[NudgeType.HOLIDAY_SHIPPING_DELAY.ordinal()] = 10;
            f22561a = iArr;
        }
    }

    public C10266c(String str, NudgeType nudgeType, boolean z, boolean z2, String str2, String str3, boolean z3) {
        this.f22554a = str;
        this.f22555b = nudgeType;
        this.f22556c = z;
        this.f22557d = z2;
        this.f22558e = str2;
        this.f22559f = str3;
        this.f22560g = z3;
    }

    /* renamed from: b */
    public static C10266c m18331b(C10266c cVar, boolean z, boolean z2, int i) {
        String str = null;
        String str2 = (i & 1) != 0 ? cVar.f22554a : null;
        NudgeType nudgeType = (i & 2) != 0 ? cVar.f22555b : null;
        if ((i & 4) != 0) {
            z = cVar.f22556c;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = cVar.f22557d;
        }
        boolean z4 = z2;
        String str3 = (i & 16) != 0 ? cVar.f22558e : null;
        if ((i & 32) != 0) {
            str = cVar.f22559f;
        }
        String str4 = str;
        boolean z5 = (i & 64) != 0 ? cVar.f22560g : false;
        C19383o.m32797g(str2, "displayText");
        C19383o.m32797g(nudgeType, "nudgeType");
        return new C10266c(str2, nudgeType, z3, z4, str3, str4, z5);
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.LOTTIE_NUDGE;
    }

    /* renamed from: c */
    public final int mo33640c() {
        switch (C10267a.f22561a[this.f22555b.ordinal()]) {
            case 1:
            case 2:
                return R.raw.cart;
            case 3:
                return R.raw.alarm;
            case 8:
                return R.raw.eyeball;
            case 9:
                return R.raw.megaphone;
            case 10:
                return R.raw.edd_delayed;
            default:
                return R.raw.hourglass;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10266c)) {
            return false;
        }
        C10266c cVar = (C10266c) obj;
        return C19383o.m32792b(this.f22554a, cVar.f22554a) && this.f22555b == cVar.f22555b && this.f22556c == cVar.f22556c && this.f22557d == cVar.f22557d && C19383o.m32792b(this.f22558e, cVar.f22558e) && C19383o.m32792b(this.f22559f, cVar.f22559f) && this.f22560g == cVar.f22560g;
    }

    public final int hashCode() {
        int hashCode = (this.f22555b.hashCode() + (this.f22554a.hashCode() * 31)) * 31;
        boolean z = this.f22556c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f22557d;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        String str = this.f22558e;
        int i3 = 0;
        int hashCode2 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f22559f;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        int i4 = (hashCode2 + i3) * 31;
        boolean z4 = this.f22560g;
        if (!z4) {
            z2 = z4;
        }
        return i4 + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("LottieNudge(displayText=");
        h.append(this.f22554a);
        h.append(", nudgeType=");
        h.append(this.f22555b);
        h.append(", isFullyVisible=");
        h.append(this.f22556c);
        h.append(", hasShownAnimation=");
        h.append(this.f22557d);
        h.append(", displayTitle=");
        h.append(this.f22558e);
        h.append(", displayBody=");
        h.append(this.f22559f);
        h.append(", hideNudge=");
        return C0391c.m1058d(h, this.f22560g, ')');
    }
}
