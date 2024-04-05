package com.etsy.android.lib.network.oauth2;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.lib.network.oauth2.y */
public abstract class C8799y {

    /* renamed from: com.etsy.android.lib.network.oauth2.y$a */
    public static final class C8800a extends C8799y {

        /* renamed from: a */
        public final String f19349a;

        public C8800a(String str) {
            this.f19349a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8800a) && C19383o.m32792b(this.f19349a, ((C8800a) obj).f19349a);
        }

        public final int hashCode() {
            return this.f19349a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("Etsy(email="), this.f19349a, ')');
        }
    }

    /* renamed from: com.etsy.android.lib.network.oauth2.y$b */
    public static final class C8801b extends C8799y {

        /* renamed from: a */
        public static final C8801b f19350a = new C8801b();
    }

    /* renamed from: com.etsy.android.lib.network.oauth2.y$c */
    public static final class C8802c extends C8799y {

        /* renamed from: a */
        public static final C8802c f19351a = new C8802c();
    }

    /* renamed from: com.etsy.android.lib.network.oauth2.y$d */
    public static final class C8803d extends C8799y {

        /* renamed from: a */
        public final String f19352a;

        public C8803d(String str) {
            this.f19352a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8803d) && C19383o.m32792b(this.f19352a, ((C8803d) obj).f19352a);
        }

        public final int hashCode() {
            return this.f19352a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("MagicLink(uri="), this.f19352a, ')');
        }
    }
}
