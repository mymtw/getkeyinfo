package com.etsy.android.p327ui.shop;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.TranslatedReview;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.shop.u */
public abstract class C11244u {

    /* renamed from: com.etsy.android.ui.shop.u$a */
    public static final class C11245a extends C11244u {

        /* renamed from: a */
        public final Throwable f24825a;

        public C11245a(Throwable th) {
            C19383o.m32797g(th, "error");
            this.f24825a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11245a) && C19383o.m32792b(this.f24825a, ((C11245a) obj).f24825a);
        }

        public final int hashCode() {
            return this.f24825a.hashCode();
        }

        public final String toString() {
            return C0070b.m185h(C0072d.m201h("Error(error="), this.f24825a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.shop.u$b */
    public static final class C11246b extends C11244u {

        /* renamed from: a */
        public final TranslatedReview f24826a;

        public C11246b(TranslatedReview translatedReview) {
            this.f24826a = translatedReview;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11246b) && C19383o.m32792b(this.f24826a, ((C11246b) obj).f24826a);
        }

        public final int hashCode() {
            return this.f24826a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(review=");
            h.append(this.f24826a);
            h.append(')');
            return h.toString();
        }
    }
}
