package com.etsy.android.p327ui;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import p475we.C13832h;

/* renamed from: com.etsy.android.ui.g0 */
public abstract class C9905g0 {

    /* renamed from: com.etsy.android.ui.g0$a */
    public static final class C9906a extends C9905g0 {

        /* renamed from: a */
        public static final C9906a f21854a = new C9906a();
    }

    /* renamed from: com.etsy.android.ui.g0$b */
    public static final class C9907b extends C9905g0 {

        /* renamed from: a */
        public final C13832h f21855a;

        public C9907b(C13832h hVar) {
            C19383o.m32797g(hVar, "type");
            this.f21855a = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9907b) && C19383o.m32792b(this.f21855a, ((C9907b) obj).f21855a);
        }

        public final int hashCode() {
            return this.f21855a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ShowUpgradePrompt(type=");
            h.append(this.f21855a);
            h.append(')');
            return h.toString();
        }
    }
}
