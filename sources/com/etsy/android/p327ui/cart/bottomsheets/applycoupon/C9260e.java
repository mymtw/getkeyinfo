package com.etsy.android.p327ui.cart.bottomsheets.applycoupon;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2895z;
import com.etsy.android.lib.models.apiv3.cart.CartPage;
import com.etsy.android.p327ui.cart.C9420x;
import com.etsy.android.util.C12059p;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p340ea.C12673n;
import p456ua.C13461f;

/* renamed from: com.etsy.android.ui.cart.bottomsheets.applycoupon.e */
public final class C9260e extends C2866i0 {

    /* renamed from: b */
    public final C13461f f20449b;

    /* renamed from: c */
    public final C9420x f20450c;

    /* renamed from: d */
    public final C12673n f20451d;

    /* renamed from: e */
    public final C2895z<Boolean> f20452e;

    /* renamed from: f */
    public final C2895z f20453f;

    /* renamed from: g */
    public final C2895z<C9261a> f20454g;

    /* renamed from: h */
    public final C2895z f20455h;

    /* renamed from: i */
    public final C2895z<C12059p<Integer>> f20456i;

    /* renamed from: j */
    public final C2895z f20457j;

    /* renamed from: k */
    public final C2895z<C12059p<CartPage>> f20458k;

    /* renamed from: l */
    public final C2895z f20459l;

    /* renamed from: m */
    public String f20460m = "";

    /* renamed from: n */
    public final C7091a f20461n = new C7091a();

    /* renamed from: com.etsy.android.ui.cart.bottomsheets.applycoupon.e$a */
    public static abstract class C9261a {

        /* renamed from: com.etsy.android.ui.cart.bottomsheets.applycoupon.e$a$a */
        public static final class C9262a extends C9261a {

            /* renamed from: a */
            public final String f20462a;

            public C9262a(String str) {
                this.f20462a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C9262a) && C19383o.m32792b(this.f20462a, ((C9262a) obj).f20462a);
            }

            public final int hashCode() {
                return this.f20462a.hashCode();
            }

            public final String toString() {
                return C0391c.m1057c(C0072d.m201h("Generic(message="), this.f20462a, ')');
            }
        }

        /* renamed from: com.etsy.android.ui.cart.bottomsheets.applycoupon.e$a$b */
        public static final class C9263b extends C9261a {

            /* renamed from: a */
            public final String f20463a;

            public C9263b(String str) {
                C19383o.m32797g(str, "couponCode");
                this.f20463a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C9263b) && C19383o.m32792b(this.f20463a, ((C9263b) obj).f20463a);
            }

            public final int hashCode() {
                return this.f20463a.hashCode();
            }

            public final String toString() {
                return C0391c.m1057c(C0072d.m201h("NotSignedIn(couponCode="), this.f20463a, ')');
            }
        }
    }

    public C9260e(C13461f fVar, C9420x xVar, C12673n nVar) {
        C19383o.m32797g(nVar, "elkLogger");
        this.f20449b = fVar;
        this.f20450c = xVar;
        this.f20451d = nVar;
        C2895z<Boolean> zVar = new C2895z<>(Boolean.FALSE);
        this.f20452e = zVar;
        this.f20453f = zVar;
        C2895z<C9261a> zVar2 = new C2895z<>();
        this.f20454g = zVar2;
        this.f20455h = zVar2;
        C2895z<C12059p<Integer>> zVar3 = new C2895z<>();
        this.f20456i = zVar3;
        this.f20457j = zVar3;
        C2895z<C12059p<CartPage>> zVar4 = new C2895z<>();
        this.f20458k = zVar4;
        this.f20459l = zVar4;
    }

    public final void onCleared() {
        super.onCleared();
        this.f20461n.mo19405d();
    }
}
