package com.etsy.android.p327ui.checkout;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.checkout.b */
public abstract class C9435b {

    /* renamed from: com.etsy.android.ui.checkout.b$a */
    public static final class C9436a extends C9435b {

        /* renamed from: a */
        public static final C9436a f20928a = new C9436a();
    }

    /* renamed from: com.etsy.android.ui.checkout.b$b */
    public static final class C9437b extends C9435b {

        /* renamed from: a */
        public final String f20929a;

        /* renamed from: b */
        public final String f20930b;

        public C9437b(String str, String str2) {
            C19383o.m32797g(str, "orderId");
            this.f20929a = str;
            this.f20930b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9437b)) {
                return false;
            }
            C9437b bVar = (C9437b) obj;
            return C19383o.m32792b(this.f20929a, bVar.f20929a) && C19383o.m32792b(this.f20930b, bVar.f20930b);
        }

        public final int hashCode() {
            int hashCode = this.f20929a.hashCode() * 31;
            String str = this.f20930b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(orderId=");
            h.append(this.f20929a);
            h.append(", reviewUrl=");
            return C0391c.m1057c(h, this.f20930b, ')');
        }
    }
}
