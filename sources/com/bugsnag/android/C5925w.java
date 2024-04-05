package com.bugsnag.android;

import com.facebook.login.LoginStatusClient;
import java.util.HashSet;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;

/* renamed from: com.bugsnag.android.w */
public final class C5925w {

    /* renamed from: a */
    public C5915t2 f12671a = new C5915t2((String) null, (String) null, (String) null);

    /* renamed from: b */
    public final C5805m f12672b = new C5805m(0);

    /* renamed from: c */
    public final C5909s1 f12673c = new C5909s1(0);

    /* renamed from: d */
    public final C5718a1 f12674d = new C5718a1(0);

    /* renamed from: e */
    public Integer f12675e = 0;

    /* renamed from: f */
    public String f12676f;

    /* renamed from: g */
    public ThreadSendPolicy f12677g = ThreadSendPolicy.ALWAYS;

    /* renamed from: h */
    public long f12678h = LoginStatusClient.DEFAULT_TOAST_DURATION_MS;

    /* renamed from: i */
    public boolean f12679i = true;

    /* renamed from: j */
    public boolean f12680j = true;

    /* renamed from: k */
    public C5828r0 f12681k = new C5828r0(true, true, true, true);

    /* renamed from: l */
    public boolean f12682l = true;

    /* renamed from: m */
    public String f12683m = "android";

    /* renamed from: n */
    public C5816o1 f12684n = C19421p.f43315e;

    /* renamed from: o */
    public C5731d0 f12685o;

    /* renamed from: p */
    public C5815o0 f12686p = new C5815o0();

    /* renamed from: q */
    public int f12687q = 50;

    /* renamed from: r */
    public int f12688r = 32;

    /* renamed from: s */
    public int f12689s = 128;

    /* renamed from: t */
    public int f12690t = 200;

    /* renamed from: u */
    public EmptySet f12691u;

    /* renamed from: v */
    public Set<String> f12692v;

    /* renamed from: w */
    public final C5914t1 f12693w;

    /* renamed from: x */
    public final HashSet<C5719a2> f12694x;

    /* renamed from: y */
    public String f12695y;

    public C5925w(String str) {
        C19383o.m32798h(str, "apiKey");
        this.f12695y = str;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.f12691u = emptySet;
        this.f12692v = emptySet;
        this.f12693w = new C5914t1(0);
        this.f12694x = new HashSet<>();
    }
}
