package com.etsy.android.p327ui.cart;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.cart.CartPage;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cart.n */
public abstract class C9326n {

    /* renamed from: com.etsy.android.ui.cart.n$b */
    public static final class C9328b extends C9326n {

        /* renamed from: a */
        public final CartPage f20599a;

        public C9328b(CartPage cartPage) {
            this.f20599a = cartPage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9328b) && C19383o.m32792b(this.f20599a, ((C9328b) obj).f20599a);
        }

        public final int hashCode() {
            return this.f20599a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(cartPage=");
            h.append(this.f20599a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.cart.n$a */
    public static final class C9327a extends C9326n {

        /* renamed from: a */
        public final Throwable f20597a;

        /* renamed from: b */
        public final String f20598b;

        public C9327a() {
            this((RuntimeException) null, 3);
        }

        public C9327a(String str, Throwable th) {
            this.f20597a = th;
            this.f20598b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9327a)) {
                return false;
            }
            C9327a aVar = (C9327a) obj;
            return C19383o.m32792b(this.f20597a, aVar.f20597a) && C19383o.m32792b(this.f20598b, aVar.f20598b);
        }

        public final int hashCode() {
            Throwable th = this.f20597a;
            int i = 0;
            int hashCode = (th == null ? 0 : th.hashCode()) * 31;
            String str = this.f20598b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Failure(error=");
            h.append(this.f20597a);
            h.append(", message=");
            return C0391c.m1057c(h, this.f20598b, ')');
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C9327a(RuntimeException runtimeException, int i) {
            this((String) null, (Throwable) (i & 1) != 0 ? null : runtimeException);
        }
    }
}
