package com.etsy.android.p327ui.user.purchases;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.user.purchases.s */
public final class C11677s {

    /* renamed from: a */
    public final C11649g f25866a;

    /* renamed from: b */
    public final C11628a f25867b;

    /* renamed from: c */
    public final long f25868c;

    /* renamed from: d */
    public final String f25869d;

    /* renamed from: e */
    public final String f25870e;

    /* renamed from: f */
    public final String f25871f;

    /* renamed from: g */
    public final String f25872g;

    /* renamed from: h */
    public final int f25873h;

    /* renamed from: i */
    public final String f25874i;

    /* renamed from: j */
    public final String f25875j;

    /* renamed from: k */
    public final List<C11681w> f25876k;

    public C11677s(C11649g gVar, C11628a aVar, long j, String str, String str2, String str3, String str4, int i, String str5, String str6, ArrayList arrayList) {
        C19383o.m32797g(str6, "shippingStatus");
        this.f25866a = gVar;
        this.f25867b = aVar;
        this.f25868c = j;
        this.f25869d = str;
        this.f25870e = str2;
        this.f25871f = str3;
        this.f25872g = str4;
        this.f25873h = i;
        this.f25874i = str5;
        this.f25875j = str6;
        this.f25876k = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11677s)) {
            return false;
        }
        C11677s sVar = (C11677s) obj;
        return C19383o.m32792b(this.f25866a, sVar.f25866a) && C19383o.m32792b(this.f25867b, sVar.f25867b) && this.f25868c == sVar.f25868c && C19383o.m32792b(this.f25869d, sVar.f25869d) && C19383o.m32792b(this.f25870e, sVar.f25870e) && C19383o.m32792b(this.f25871f, sVar.f25871f) && C19383o.m32792b(this.f25872g, sVar.f25872g) && this.f25873h == sVar.f25873h && C19383o.m32792b(this.f25874i, sVar.f25874i) && C19383o.m32792b(this.f25875j, sVar.f25875j) && C19383o.m32792b(this.f25876k, sVar.f25876k);
    }

    public final int hashCode() {
        int b = C0071c.m190b(this.f25868c, (this.f25867b.hashCode() + (this.f25866a.hashCode() * 31)) * 31, 31);
        String str = this.f25869d;
        int i = 0;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25870e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25871f;
        int a = C0069a.m170a(this.f25873h, C0023f.m105e(this.f25872g, (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31);
        String str4 = this.f25874i;
        int e = C0023f.m105e(this.f25875j, (a + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        List<C11681w> list = this.f25876k;
        if (list != null) {
            i = list.hashCode();
        }
        return e + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PurchasesReceiptViewState(dependencies=");
        h.append(this.f25866a);
        h.append(", dispatcher=");
        h.append(this.f25867b);
        h.append(", receiptId=");
        h.append(this.f25868c);
        h.append(", shopName=");
        h.append(this.f25869d);
        h.append(", avatarUrl=");
        h.append(this.f25870e);
        h.append(", price=");
        h.append(this.f25871f);
        h.append(", date=");
        h.append(this.f25872g);
        h.append(", multishopNoteVisibility=");
        h.append(this.f25873h);
        h.append(", multishopNote=");
        h.append(this.f25874i);
        h.append(", shippingStatus=");
        h.append(this.f25875j);
        h.append(", transactionViewStates=");
        return C0070b.m186i(h, this.f25876k, ')');
    }
}
