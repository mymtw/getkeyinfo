package com.etsy.android.qualtrics;

import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.qualtrics.d */
public abstract class C8952d {

    /* renamed from: a */
    public final String f19749a;

    /* renamed from: b */
    public final String f19750b;

    /* renamed from: com.etsy.android.qualtrics.d$a */
    public static final class C8953a extends C8952d {

        /* renamed from: c */
        public static final C8953a f19751c = new C8953a();

        public C8953a() {
            super("BOEConvosScreen", "screenID");
        }
    }

    /* renamed from: com.etsy.android.qualtrics.d$b */
    public static final class C8954b extends C8952d {

        /* renamed from: c */
        public static final C8954b f19752c = new C8954b();

        public C8954b() {
            super("BOEFavoritesScreen", "screenID");
        }
    }

    /* renamed from: com.etsy.android.qualtrics.d$c */
    public static final class C8955c extends C8952d {

        /* renamed from: c */
        public static final C8955c f19753c = new C8955c();

        public C8955c() {
            super("BOEListingScreen", "screenID");
        }
    }

    /* renamed from: com.etsy.android.qualtrics.d$d */
    public static final class C8956d extends C8952d {

        /* renamed from: c */
        public static final C8956d f19754c = new C8956d();

        public C8956d() {
            super("BOENotificationsScreen", "screenID");
        }
    }

    /* renamed from: com.etsy.android.qualtrics.d$e */
    public static final class C8957e extends C8952d {

        /* renamed from: c */
        public static final C8957e f19755c = new C8957e();

        public C8957e() {
            super("BOEPostPurchasesScreen", "screenID");
        }
    }

    /* renamed from: com.etsy.android.qualtrics.d$f */
    public static final class C8958f extends C8952d {

        /* renamed from: c */
        public static final C8958f f19756c = new C8958f();

        public C8958f() {
            super("BOEPurchasesScreen", "screenID");
        }
    }

    /* renamed from: com.etsy.android.qualtrics.d$g */
    public static final class C8959g extends C8952d {

        /* renamed from: c */
        public static final C8959g f19757c = new C8959g();

        public C8959g() {
            super("BOESearchResultsScreen", "screenID");
        }
    }

    /* renamed from: com.etsy.android.qualtrics.d$h */
    public static final class C8960h extends C8952d {

        /* renamed from: c */
        public static final C8960h f19758c = new C8960h();

        public C8960h() {
            super("BOEShopHomeScreen", "screenID");
        }
    }

    /* renamed from: com.etsy.android.qualtrics.d$i */
    public static final class C8961i extends C8952d {
        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C8961i(String str) {
            this(str, 0);
            C19383o.m32797g(str, "value");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8961i(String str, int i) {
            super(str, "locale");
            C19383o.m32797g(str, "value");
        }
    }

    public C8952d(String str, String str2) {
        this.f19749a = str;
        this.f19750b = str2;
    }
}
