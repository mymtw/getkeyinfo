package com.etsy.android.p327ui.you;

import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import com.etsy.android.p327ui.you.C11800a;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.you.c */
public abstract class C11806c {

    /* renamed from: a */
    public final int f26284a;

    /* renamed from: b */
    public String f26285b;

    /* renamed from: c */
    public final Integer f26286c;

    /* renamed from: com.etsy.android.ui.you.c$a */
    public static final class C11807a extends C11806c {

        /* renamed from: d */
        public static final C11807a f26287d = new C11807a();

        public C11807a() {
            super(R.string.config, (Integer) null, 6);
        }
    }

    /* renamed from: com.etsy.android.ui.you.c$b */
    public static final class C11808b extends C11806c {

        /* renamed from: d */
        public C11800a f26288d;

        public C11808b() {
            this(0);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11808b(int i) {
            super(R.string.nav_convos, (Integer) null, 6);
            C11800a.C11804d dVar = C11800a.C11804d.f26281a;
            C19383o.m32797g(dVar, "badgeCount");
            this.f26288d = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11808b) && C19383o.m32792b(this.f26288d, ((C11808b) obj).f26288d);
        }

        public final int hashCode() {
            return this.f26288d.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Conversation(badgeCount=");
            h.append(this.f26288d);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.you.c$c */
    public static final class C11809c extends C11806c {

        /* renamed from: d */
        public C11800a f26289d;

        public C11809c() {
            this(0);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11809c(int i) {
            super(R.string.nav_purchases, (Integer) null, 6);
            C11800a.C11804d dVar = C11800a.C11804d.f26281a;
            C19383o.m32797g(dVar, "badgeCount");
            this.f26289d = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11809c) && C19383o.m32792b(this.f26289d, ((C11809c) obj).f26289d);
        }

        public final int hashCode() {
            return this.f26289d.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Feedback(badgeCount=");
            h.append(this.f26289d);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.you.c$d */
    public static final class C11810d extends C11806c {

        /* renamed from: d */
        public static final C11810d f26290d = new C11810d();

        public C11810d() {
            super(R.string.nav_get_sell_on_etsy, Integer.valueOf(R.drawable.sk_ic_shop), 2);
        }
    }

    /* renamed from: com.etsy.android.ui.you.c$e */
    public static final class C11811e extends C11806c {

        /* renamed from: d */
        public static final C11811e f26291d = new C11811e();

        public C11811e() {
            super(R.string.nav_buy_etsy_giftcard, (Integer) null, 6);
        }
    }

    /* renamed from: com.etsy.android.ui.you.c$f */
    public static final class C11812f extends C11806c {

        /* renamed from: d */
        public static final C11812f f26292d = new C11812f();

        public C11812f() {
            super(R.string.nav_giftcard_balance, (Integer) null, 6);
        }
    }

    /* renamed from: com.etsy.android.ui.you.c$g */
    public static final class C11813g extends C11806c {

        /* renamed from: d */
        public static final C11813g f26293d = new C11813g();

        public C11813g() {
            super(R.string.help, (Integer) null, 6);
        }
    }

    /* renamed from: com.etsy.android.ui.you.c$h */
    public static final class C11814h extends C11806c {

        /* renamed from: d */
        public static final C11814h f26294d = new C11814h();

        public C11814h() {
            super(R.string.nav_profile, (Integer) null, 6);
        }
    }

    /* renamed from: com.etsy.android.ui.you.c$i */
    public static final class C11815i extends C11806c {

        /* renamed from: d */
        public static final C11815i f26295d = new C11815i();

        public C11815i() {
            super(R.string.settings, (Integer) null, 6);
        }
    }

    public C11806c(int i, Integer num, int i2) {
        num = (i2 & 4) != 0 ? null : num;
        this.f26284a = i;
        this.f26285b = null;
        this.f26286c = num;
    }
}
