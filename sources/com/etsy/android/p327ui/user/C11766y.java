package com.etsy.android.p327ui.user;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.Receipt;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.y */
public abstract class C11766y {

    /* renamed from: com.etsy.android.ui.user.y$a */
    public static final class C11767a extends C11766y {

        /* renamed from: a */
        public final String f26210a;

        /* renamed from: b */
        public final int f26211b;

        /* renamed from: c */
        public final Throwable f26212c;

        public C11767a(String str, int i, Throwable th) {
            this.f26210a = str;
            this.f26211b = i;
            this.f26212c = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11767a)) {
                return false;
            }
            C11767a aVar = (C11767a) obj;
            return C19383o.m32792b(this.f26210a, aVar.f26210a) && this.f26211b == aVar.f26211b && C19383o.m32792b(this.f26212c, aVar.f26212c);
        }

        public final int hashCode() {
            String str = this.f26210a;
            int i = 0;
            int a = C0069a.m170a(this.f26211b, (str == null ? 0 : str.hashCode()) * 31, 31);
            Throwable th = this.f26212c;
            if (th != null) {
                i = th.hashCode();
            }
            return a + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Error(errorMessage=");
            h.append(this.f26210a);
            h.append(", code=");
            h.append(this.f26211b);
            h.append(", exception=");
            return C0070b.m185h(h, this.f26212c, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.user.y$b */
    public static final class C11768b extends C11766y {

        /* renamed from: a */
        public final Receipt f26213a;

        public C11768b(Receipt receipt) {
            this.f26213a = receipt;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11768b) && C19383o.m32792b(this.f26213a, ((C11768b) obj).f26213a);
        }

        public final int hashCode() {
            return this.f26213a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(receipt=");
            h.append(this.f26213a);
            h.append(')');
            return h.toString();
        }
    }
}
