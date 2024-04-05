package com.etsy.android.p327ui.shop;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.ReceiptReview;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.shop.c1 */
public abstract class C11135c1 {

    /* renamed from: com.etsy.android.ui.shop.c1$a */
    public static final class C11136a extends C11135c1 {

        /* renamed from: a */
        public static final C11136a f24628a = new C11136a();
    }

    /* renamed from: com.etsy.android.ui.shop.c1$b */
    public static final class C11137b extends C11135c1 {

        /* renamed from: a */
        public final List<ReceiptReview> f24629a;

        /* renamed from: b */
        public final int f24630b;

        public C11137b(int i, List list) {
            this.f24629a = list;
            this.f24630b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11137b)) {
                return false;
            }
            C11137b bVar = (C11137b) obj;
            return C19383o.m32792b(this.f24629a, bVar.f24629a) && this.f24630b == bVar.f24630b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f24630b) + (this.f24629a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(reviews=");
            h.append(this.f24629a);
            h.append(", reviewsCount=");
            return C0073e.m208h(h, this.f24630b, ')');
        }
    }
}
