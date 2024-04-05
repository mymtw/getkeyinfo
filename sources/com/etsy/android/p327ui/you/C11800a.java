package com.etsy.android.p327ui.you;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;

/* renamed from: com.etsy.android.ui.you.a */
public abstract class C11800a {

    /* renamed from: com.etsy.android.ui.you.a$a */
    public static final class C11801a extends C11800a {

        /* renamed from: a */
        public final int f26278a;

        public C11801a(int i) {
            this.f26278a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11801a) && this.f26278a == ((C11801a) obj).f26278a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f26278a);
        }

        public final String toString() {
            return C0073e.m208h(C0072d.m201h("Count(count="), this.f26278a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.you.a$b */
    public static final class C11802b extends C11800a {

        /* renamed from: a */
        public static final C11802b f26279a = new C11802b();
    }

    /* renamed from: com.etsy.android.ui.you.a$c */
    public static final class C11803c extends C11800a {

        /* renamed from: a */
        public static final C11803c f26280a = new C11803c();
    }

    /* renamed from: com.etsy.android.ui.you.a$d */
    public static final class C11804d extends C11800a {

        /* renamed from: a */
        public static final C11804d f26281a = new C11804d();
    }
}
