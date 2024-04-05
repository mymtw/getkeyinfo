package com.etsy.android.p327ui.shop;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.TranslatedPrivacyPolicy;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.shop.r */
public abstract class C11194r {

    /* renamed from: com.etsy.android.ui.shop.r$a */
    public static final class C11195a extends C11194r {

        /* renamed from: a */
        public static final C11195a f24760a = new C11195a();
    }

    /* renamed from: com.etsy.android.ui.shop.r$b */
    public static final class C11196b extends C11194r {

        /* renamed from: a */
        public final TranslatedPrivacyPolicy f24761a;

        public C11196b(TranslatedPrivacyPolicy translatedPrivacyPolicy) {
            this.f24761a = translatedPrivacyPolicy;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11196b) && C19383o.m32792b(this.f24761a, ((C11196b) obj).f24761a);
        }

        public final int hashCode() {
            return this.f24761a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(policy=");
            h.append(this.f24761a);
            h.append(')');
            return h.toString();
        }
    }
}
