package com.etsy.android.p327ui.home.editorspicks;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.finds.FindsPage;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.home.editorspicks.c */
public abstract class C9926c {

    /* renamed from: com.etsy.android.ui.home.editorspicks.c$a */
    public static final class C9927a extends C9926c {

        /* renamed from: a */
        public final Throwable f21883a;

        public C9927a(Exception exc) {
            this.f21883a = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9927a) && C19383o.m32792b(this.f21883a, ((C9927a) obj).f21883a);
        }

        public final int hashCode() {
            return this.f21883a.hashCode();
        }

        public final String toString() {
            return C0070b.m185h(C0072d.m201h("Error(error="), this.f21883a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.home.editorspicks.c$b */
    public static final class C9928b extends C9926c {

        /* renamed from: a */
        public final FindsPage f21884a;

        public C9928b(FindsPage findsPage) {
            this.f21884a = findsPage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9928b) && C19383o.m32792b(this.f21884a, ((C9928b) obj).f21884a);
        }

        public final int hashCode() {
            return this.f21884a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(findsPage=");
            h.append(this.f21884a);
            h.append(')');
            return h.toString();
        }
    }
}
