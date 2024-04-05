package com.etsy.android.p327ui.shop;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.ShopHomePage;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.shop.k0 */
public interface C11172k0 {

    /* renamed from: com.etsy.android.ui.shop.k0$a */
    public static final class C11173a implements C11172k0 {

        /* renamed from: a */
        public final Throwable f24712a;

        /* renamed from: b */
        public final String f24713b;

        public C11173a() {
            this((String) null, (Throwable) null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11173a)) {
                return false;
            }
            C11173a aVar = (C11173a) obj;
            return C19383o.m32792b(this.f24712a, aVar.f24712a) && C19383o.m32792b(this.f24713b, aVar.f24713b);
        }

        public final int hashCode() {
            Throwable th = this.f24712a;
            int i = 0;
            int hashCode = (th == null ? 0 : th.hashCode()) * 31;
            String str = this.f24713b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Failure(error=");
            h.append(this.f24712a);
            h.append(", message=");
            return C0391c.m1057c(h, this.f24713b, ')');
        }

        public C11173a(String str, Throwable th) {
            this.f24712a = th;
            this.f24713b = str;
        }
    }

    /* renamed from: com.etsy.android.ui.shop.k0$b */
    public static final class C11174b implements C11172k0 {

        /* renamed from: a */
        public final ShopHomePage f24714a;

        public C11174b(ShopHomePage shopHomePage) {
            this.f24714a = shopHomePage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11174b) && C19383o.m32792b(this.f24714a, ((C11174b) obj).f24714a);
        }

        public final int hashCode() {
            return this.f24714a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(page=");
            h.append(this.f24714a);
            h.append(')');
            return h.toString();
        }
    }
}
