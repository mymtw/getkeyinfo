package com.etsy.android.p327ui.cart;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cart.i */
public abstract class C9311i {

    /* renamed from: com.etsy.android.ui.cart.i$b */
    public static final class C9313b extends C9311i {

        /* renamed from: a */
        public final CartGroupItem f20581a;

        public C9313b(CartGroupItem cartGroupItem) {
            this.f20581a = cartGroupItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9313b) && C19383o.m32792b(this.f20581a, ((C9313b) obj).f20581a);
        }

        public final int hashCode() {
            CartGroupItem cartGroupItem = this.f20581a;
            if (cartGroupItem == null) {
                return 0;
            }
            return cartGroupItem.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(cartGroupItem=");
            h.append(this.f20581a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.cart.i$a */
    public static final class C9312a extends C9311i {

        /* renamed from: a */
        public final Throwable f20579a;

        /* renamed from: b */
        public final String f20580b;

        public C9312a(String str, Throwable th) {
            this.f20579a = th;
            this.f20580b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9312a)) {
                return false;
            }
            C9312a aVar = (C9312a) obj;
            return C19383o.m32792b(this.f20579a, aVar.f20579a) && C19383o.m32792b(this.f20580b, aVar.f20580b);
        }

        public final int hashCode() {
            Throwable th = this.f20579a;
            int i = 0;
            int hashCode = (th == null ? 0 : th.hashCode()) * 31;
            String str = this.f20580b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Failure(error=");
            h.append(this.f20579a);
            h.append(", message=");
            return C0391c.m1057c(h, this.f20580b, ')');
        }

        public C9312a() {
            this((String) null, (Throwable) null);
        }
    }
}
