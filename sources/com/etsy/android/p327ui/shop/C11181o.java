package com.etsy.android.p327ui.shop;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.ShopHomeMemberData;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.shop.o */
public abstract class C11181o {

    /* renamed from: com.etsy.android.ui.shop.o$a */
    public static final class C11182a extends C11181o {

        /* renamed from: a */
        public final String f24727a;

        /* renamed from: b */
        public final int f24728b;

        /* renamed from: c */
        public final Throwable f24729c;

        public C11182a(String str, int i, Throwable th) {
            this.f24727a = str;
            this.f24728b = i;
            this.f24729c = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11182a)) {
                return false;
            }
            C11182a aVar = (C11182a) obj;
            return C19383o.m32792b(this.f24727a, aVar.f24727a) && this.f24728b == aVar.f24728b && C19383o.m32792b(this.f24729c, aVar.f24729c);
        }

        public final int hashCode() {
            String str = this.f24727a;
            int i = 0;
            int a = C0069a.m170a(this.f24728b, (str == null ? 0 : str.hashCode()) * 31, 31);
            Throwable th = this.f24729c;
            if (th != null) {
                i = th.hashCode();
            }
            return a + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Error(errorMessage=");
            h.append(this.f24727a);
            h.append(", code=");
            h.append(this.f24728b);
            h.append(", throwable=");
            return C0070b.m185h(h, this.f24729c, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.shop.o$b */
    public static final class C11183b extends C11181o {

        /* renamed from: a */
        public final ShopHomeMemberData f24730a;

        public C11183b(ShopHomeMemberData shopHomeMemberData) {
            this.f24730a = shopHomeMemberData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11183b) && C19383o.m32792b(this.f24730a, ((C11183b) obj).f24730a);
        }

        public final int hashCode() {
            return this.f24730a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(data=");
            h.append(this.f24730a);
            h.append(')');
            return h.toString();
        }
    }
}
