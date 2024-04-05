package com.reddit.indicatorfastscroll;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.reddit.indicatorfastscroll.a */
public abstract class C17346a {

    /* renamed from: com.reddit.indicatorfastscroll.a$a */
    public static final class C17347a extends C17346a {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17347a)) {
                return false;
            }
            ((C17347a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Icon(iconRes=0)";
        }
    }

    /* renamed from: com.reddit.indicatorfastscroll.a$b */
    public static final class C17348b extends C17346a {

        /* renamed from: a */
        public final String f37878a;

        public C17348b(String str) {
            this.f37878a = str;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C17348b) && C19383o.m32792b(this.f37878a, ((C17348b) obj).f37878a);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f37878a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return C0023f.m110k(C0072d.m201h("Text(text="), this.f37878a, ")");
        }
    }
}
