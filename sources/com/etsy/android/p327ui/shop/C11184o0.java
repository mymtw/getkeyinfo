package com.etsy.android.p327ui.shop;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.ShopListingsSearchResult;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.shop.o0 */
public interface C11184o0 {

    /* renamed from: com.etsy.android.ui.shop.o0$a */
    public static final class C11185a implements C11184o0 {

        /* renamed from: a */
        public final Throwable f24731a;

        /* renamed from: b */
        public final String f24732b;

        public C11185a() {
            this((String) null, (Throwable) null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11185a)) {
                return false;
            }
            C11185a aVar = (C11185a) obj;
            return C19383o.m32792b(this.f24731a, aVar.f24731a) && C19383o.m32792b(this.f24732b, aVar.f24732b);
        }

        public final int hashCode() {
            Throwable th = this.f24731a;
            int i = 0;
            int hashCode = (th == null ? 0 : th.hashCode()) * 31;
            String str = this.f24732b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Failure(error=");
            h.append(this.f24731a);
            h.append(", message=");
            return C0391c.m1057c(h, this.f24732b, ')');
        }

        public C11185a(String str, Throwable th) {
            this.f24731a = th;
            this.f24732b = str;
        }
    }

    /* renamed from: com.etsy.android.ui.shop.o0$b */
    public static final class C11186b implements C11184o0 {

        /* renamed from: a */
        public final ShopListingsSearchResult f24733a;

        /* renamed from: b */
        public final int f24734b;

        public C11186b(ShopListingsSearchResult shopListingsSearchResult, int i) {
            this.f24733a = shopListingsSearchResult;
            this.f24734b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11186b)) {
                return false;
            }
            C11186b bVar = (C11186b) obj;
            return C19383o.m32792b(this.f24733a, bVar.f24733a) && this.f24734b == bVar.f24734b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f24734b) + (this.f24733a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(searchResult=");
            h.append(this.f24733a);
            h.append(", maxCount=");
            return C0073e.m208h(h, this.f24734b, ')');
        }
    }
}
