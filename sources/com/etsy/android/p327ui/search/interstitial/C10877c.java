package com.etsy.android.p327ui.search.interstitial;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.search.p330v2.suggestions.C11083w;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p430qe.C13311c;

/* renamed from: com.etsy.android.ui.search.interstitial.c */
public interface C10877c {

    /* renamed from: com.etsy.android.ui.search.interstitial.c$a */
    public static final class C10878a implements C10877c {

        /* renamed from: a */
        public final C13311c f24133a;

        public C10878a(C13311c cVar) {
            C19383o.m32797g(cVar, "clickType");
            this.f24133a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10878a) && C19383o.m32792b(this.f24133a, ((C10878a) obj).f24133a);
        }

        public final int hashCode() {
            return this.f24133a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ProcessClickType(clickType=");
            h.append(this.f24133a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.search.interstitial.c$b */
    public static final class C10879b implements C10877c {

        /* renamed from: a */
        public final int f24134a;

        /* renamed from: b */
        public final List<C11083w.C11089f> f24135b;

        public C10879b(int i, List<C11083w.C11089f> list) {
            C19383o.m32797g(list, "savedSearches");
            this.f24134a = i;
            this.f24135b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10879b)) {
                return false;
            }
            C10879b bVar = (C10879b) obj;
            return this.f24134a == bVar.f24134a && C19383o.m32792b(this.f24135b, bVar.f24135b);
        }

        public final int hashCode() {
            return this.f24135b.hashCode() + (Integer.hashCode(this.f24134a) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("RemainingSavedSearchesLoaded(position=");
            h.append(this.f24134a);
            h.append(", savedSearches=");
            return C0070b.m186i(h, this.f24135b, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.interstitial.c$c */
    public static final class C10880c implements C10877c {

        /* renamed from: a */
        public static final C10880c f24136a = new C10880c();
    }

    /* renamed from: com.etsy.android.ui.search.interstitial.c$d */
    public static final class C10881d implements C10877c {

        /* renamed from: a */
        public final List<C11083w> f24137a;

        /* renamed from: b */
        public final boolean f24138b = true;

        public C10881d(List list) {
            C19383o.m32797g(list, ResponseConstants.SUGGESTIONS);
            this.f24137a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10881d)) {
                return false;
            }
            C10881d dVar = (C10881d) obj;
            return C19383o.m32792b(this.f24137a, dVar.f24137a) && this.f24138b == dVar.f24138b;
        }

        public final int hashCode() {
            int hashCode = this.f24137a.hashCode() * 31;
            boolean z = this.f24138b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ShowSearchSuggestions(suggestions=");
            h.append(this.f24137a);
            h.append(", scrollToTop=");
            return C0391c.m1058d(h, this.f24138b, ')');
        }
    }
}
