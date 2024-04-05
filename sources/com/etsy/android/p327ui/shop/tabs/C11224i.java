package com.etsy.android.p327ui.shop.tabs;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p568fn.C17782b;

/* renamed from: com.etsy.android.ui.shop.tabs.i */
public abstract class C11224i {

    /* renamed from: com.etsy.android.ui.shop.tabs.i$a */
    public static final class C11225a extends C11224i {

        /* renamed from: a */
        public static final C11225a f24805a = new C11225a();
    }

    /* renamed from: com.etsy.android.ui.shop.tabs.i$b */
    public static final class C11226b extends C11224i {

        /* renamed from: a */
        public static final C11226b f24806a = new C11226b();
    }

    /* renamed from: com.etsy.android.ui.shop.tabs.i$c */
    public static final class C11227c extends C11224i {

        /* renamed from: a */
        public final String f24807a;

        public C11227c(String str) {
            this.f24807a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11227c) && C19383o.m32792b(this.f24807a, ((C11227c) obj).f24807a);
        }

        public final int hashCode() {
            return this.f24807a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("ShowErrorUnavailable(message="), this.f24807a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.shop.tabs.i$d */
    public static final class C11228d extends C11224i {

        /* renamed from: a */
        public final String f24808a;

        /* renamed from: b */
        public final C11215b f24809b = null;

        public C11228d(String str) {
            C19383o.m32797g(str, "message");
            this.f24808a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11228d)) {
                return false;
            }
            C11228d dVar = (C11228d) obj;
            return C19383o.m32792b(this.f24808a, dVar.f24808a) && C19383o.m32792b(this.f24809b, dVar.f24809b);
        }

        public final int hashCode() {
            int hashCode = this.f24808a.hashCode() * 31;
            C11215b bVar = this.f24809b;
            return hashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ShowGenericError(message=");
            h.append(this.f24808a);
            h.append(", retryEvent=");
            h.append(this.f24809b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.shop.tabs.i$e */
    public static final class C11229e extends C11224i {

        /* renamed from: a */
        public static final C11229e f24810a = new C11229e();
    }

    /* renamed from: com.etsy.android.ui.shop.tabs.i$f */
    public static final class C11230f extends C11224i {

        /* renamed from: a */
        public final String f24811a;

        /* renamed from: b */
        public final List<Tab> f24812b;

        public C11230f(String str, List<Tab> list) {
            C19383o.m32797g(list, "tabs");
            this.f24811a = str;
            this.f24812b = list;
        }

        /* renamed from: a */
        public final int mo36923a() {
            int i = -1;
            int i2 = 0;
            for (T next : this.f24812b) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    if (((Tab) next).f24781b) {
                        i = i2;
                    }
                    i2 = i3;
                } else {
                    C17782b.m29877o0();
                    throw null;
                }
            }
            return i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11230f)) {
                return false;
            }
            C11230f fVar = (C11230f) obj;
            return C19383o.m32792b(this.f24811a, fVar.f24811a) && C19383o.m32792b(this.f24812b, fVar.f24812b);
        }

        public final int hashCode() {
            return this.f24812b.hashCode() + (this.f24811a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ShowShop(title=");
            h.append(this.f24811a);
            h.append(", tabs=");
            return C0070b.m186i(h, this.f24812b, ')');
        }
    }
}
