package com.etsy.android.p327ui.conversation.compose;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.conversation.compose.b */
public interface C9456b {

    /* renamed from: com.etsy.android.ui.conversation.compose.b$a */
    public static final class C9457a implements C9456b {

        /* renamed from: a */
        public final String f20959a;

        /* renamed from: b */
        public final int f20960b;

        /* renamed from: c */
        public final Throwable f20961c;

        public C9457a(String str, int i, Throwable th) {
            this.f20959a = str;
            this.f20960b = i;
            this.f20961c = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9457a)) {
                return false;
            }
            C9457a aVar = (C9457a) obj;
            return C19383o.m32792b(this.f20959a, aVar.f20959a) && this.f20960b == aVar.f20960b && C19383o.m32792b(this.f20961c, aVar.f20961c);
        }

        public final int hashCode() {
            String str = this.f20959a;
            int i = 0;
            int a = C0069a.m170a(this.f20960b, (str == null ? 0 : str.hashCode()) * 31, 31);
            Throwable th = this.f20961c;
            if (th != null) {
                i = th.hashCode();
            }
            return a + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Error(errorMessage=");
            h.append(this.f20959a);
            h.append(", code=");
            h.append(this.f20960b);
            h.append(", exception=");
            return C0070b.m185h(h, this.f20961c, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.compose.b$b */
    public static final class C9458b implements C9456b {

        /* renamed from: a */
        public static final C9458b f20962a = new C9458b();
    }
}
