package com.etsy.android.p327ui.checkout;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2895z;
import com.etsy.android.util.C12059p;
import com.etsy.android.util.C12060q;
import com.paypal.checkout.PayPalCheckout;
import com.paypal.checkout.approve.OnApprove;
import com.paypal.checkout.cancel.OnCancel;
import com.paypal.checkout.createorder.CreateOrder;
import com.paypal.checkout.error.ErrorInfo;
import com.paypal.checkout.error.OnError;
import com.paypal.checkout.shipping.OnShippingChange;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19543e0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.checkout.PayPalCheckoutViewModel */
public final class PayPalCheckoutViewModel extends C2866i0 {

    /* renamed from: b */
    public final C9434a f20910b;

    /* renamed from: c */
    public final C19543e0 f20911c;

    /* renamed from: d */
    public final C2895z<C12059p<C9427b>> f20912d;

    /* renamed from: e */
    public final C2895z f20913e;

    /* renamed from: f */
    public String f20914f;

    /* renamed from: g */
    public boolean f20915g;

    /* renamed from: com.etsy.android.ui.checkout.PayPalCheckoutViewModel$a */
    public static final class C9426a {

        /* renamed from: a */
        public final String f20916a;

        /* renamed from: b */
        public final String f20917b;

        public C9426a(String str, String str2) {
            C19383o.m32797g(str, "orderId");
            this.f20916a = str;
            this.f20917b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9426a)) {
                return false;
            }
            C9426a aVar = (C9426a) obj;
            return C19383o.m32792b(this.f20916a, aVar.f20916a) && C19383o.m32792b(this.f20917b, aVar.f20917b);
        }

        public final int hashCode() {
            int hashCode = this.f20916a.hashCode() * 31;
            String str = this.f20917b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("PayPalConfirmedOrder(orderId=");
            h.append(this.f20916a);
            h.append(", reviewUrl=");
            return C0391c.m1057c(h, this.f20917b, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.checkout.PayPalCheckoutViewModel$b */
    public static abstract class C9427b {

        /* renamed from: com.etsy.android.ui.checkout.PayPalCheckoutViewModel$b$a */
        public static final class C9428a extends C9427b {

            /* renamed from: a */
            public static final C9428a f20918a = new C9428a();
        }

        /* renamed from: com.etsy.android.ui.checkout.PayPalCheckoutViewModel$b$b */
        public static final class C9429b extends C9427b {

            /* renamed from: a */
            public static final C9429b f20919a = new C9429b();
        }

        /* renamed from: com.etsy.android.ui.checkout.PayPalCheckoutViewModel$b$c */
        public static final class C9430c extends C9427b {

            /* renamed from: a */
            public final String f20920a;

            public C9430c(String str) {
                C19383o.m32797g(str, "errorMessage");
                this.f20920a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C9430c) && C19383o.m32792b(this.f20920a, ((C9430c) obj).f20920a);
            }

            public final int hashCode() {
                return this.f20920a.hashCode();
            }

            public final String toString() {
                return C0391c.m1057c(C0072d.m201h("Error(errorMessage="), this.f20920a, ')');
            }
        }

        /* renamed from: com.etsy.android.ui.checkout.PayPalCheckoutViewModel$b$d */
        public static final class C9431d extends C9427b {

            /* renamed from: a */
            public static final C9431d f20921a = new C9431d();
        }

        /* renamed from: com.etsy.android.ui.checkout.PayPalCheckoutViewModel$b$e */
        public static final class C9432e extends C9427b {

            /* renamed from: a */
            public final C9426a f20922a;

            public C9432e(C9426a aVar) {
                this.f20922a = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C9432e) && C19383o.m32792b(this.f20922a, ((C9432e) obj).f20922a);
            }

            public final int hashCode() {
                return this.f20922a.hashCode();
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Success(order=");
                h.append(this.f20922a);
                h.append(')');
                return h.toString();
            }
        }
    }

    /* renamed from: com.etsy.android.ui.checkout.PayPalCheckoutViewModel$c */
    public static final class C9433c {

        /* renamed from: a */
        public final String f20923a;

        public C9433c(String str) {
            this.f20923a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9433c) && C19383o.m32792b(this.f20923a, ((C9433c) obj).f20923a);
        }

        public final int hashCode() {
            String str = this.f20923a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("PayPalOrderData(orderId="), this.f20923a, ')');
        }
    }

    public PayPalCheckoutViewModel(C9434a aVar, C19543e0 e0Var) {
        this.f20910b = aVar;
        this.f20911c = e0Var;
        C2895z<C12059p<C9427b>> zVar = new C2895z<>();
        this.f20912d = zVar;
        this.f20913e = zVar;
        PayPalCheckout.registerCallbacks$default(OnApprove.Companion.invoke(new PayPalCheckoutProxy$registerCallbacks$1(new C19857l<C9433c, C19394m>(this) {
            public final /* synthetic */ PayPalCheckoutViewModel this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C9433c) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C9433c cVar) {
                C19383o.m32797g(cVar, "data");
                C12060q.m19870a(this.this$0.f20912d, C9427b.C9428a.f20918a);
                PayPalCheckoutViewModel payPalCheckoutViewModel = this.this$0;
                String str = payPalCheckoutViewModel.f20914f;
                String str2 = cVar.f20923a;
                if (str == null || str2 == null) {
                    C12060q.m19870a(payPalCheckoutViewModel.f20912d, new C9427b.C9430c("Unable to confirm PayPal order"));
                } else {
                    C19697g.m33468f(C19388s.m32866i0(payPalCheckoutViewModel), (CoroutineContext) null, (CoroutineStart) null, new PayPalCheckoutViewModel$confirmPaypalOrder$1(payPalCheckoutViewModel, str, str2, (C19340c<? super PayPalCheckoutViewModel$confirmPaypalOrder$1>) null), 3);
                }
            }
        })), (OnShippingChange) null, OnCancel.Companion.invoke(new PayPalCheckoutProxy$registerCallbacks$2(new C19846a<C19394m>(this) {
            public final /* synthetic */ PayPalCheckoutViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void invoke() {
                C12060q.m19870a(this.this$0.f20912d, C9427b.C9429b.f20919a);
            }
        })), OnError.Companion.invoke(new PayPalCheckoutProxy$registerCallbacks$3(new C19857l<ErrorInfo, C19394m>(this) {
            public final /* synthetic */ PayPalCheckoutViewModel this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ErrorInfo) obj);
                return C19394m.f43287a;
            }

            public final void invoke(ErrorInfo errorInfo) {
                C19383o.m32797g(errorInfo, "it");
                C12060q.m19870a(this.this$0.f20912d, new C9427b.C9430c(errorInfo.getReason()));
            }
        })), 2, (Object) null);
    }

    /* renamed from: b */
    public final void mo31858b(String str, String str2, boolean z) {
        C19383o.m32797g(str, "cartId");
        C19383o.m32797g(str2, "orderId");
        this.f20914f = str;
        this.f20915g = z;
        C12060q.m19870a(this.f20912d, C9427b.C9431d.f20921a);
        this.f20911c.getClass();
        PayPalCheckout.startCheckout(CreateOrder.Companion.invoke(new PayPalCheckoutProxy$startCheckout$1(str2)));
    }
}
