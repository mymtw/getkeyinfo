package com.etsy.android.p327ui.shop.tabs;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.shop.tabs.f */
public interface C11219f extends C11215b {

    /* renamed from: com.etsy.android.ui.shop.tabs.f$a */
    public static final class C11220a implements C11219f {

        /* renamed from: a */
        public final String f24801a = "Loaded successfully!";

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11220a) && C19383o.m32792b(this.f24801a, ((C11220a) obj).f24801a);
        }

        public final int hashCode() {
            return this.f24801a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("ShowToast(message="), this.f24801a, ')');
        }
    }
}
