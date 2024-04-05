package com.bugsnag.android;

import com.etsy.android.lib.models.ResponseConstants;
import java.util.Map;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.bugsnag.android.k2 */
public abstract class C5780k2 {

    /* renamed from: com.bugsnag.android.k2$a */
    public static final class C5781a extends C5780k2 {

        /* renamed from: a */
        public final String f12375a;

        /* renamed from: b */
        public final BreadcrumbType f12376b;

        /* renamed from: c */
        public final String f12377c;

        /* renamed from: d */
        public final Map<String, Object> f12378d;

        public C5781a(String str, BreadcrumbType breadcrumbType, String str2, Map<String, Object> map) {
            C19383o.m32798h(str, "message");
            C19383o.m32798h(breadcrumbType, "type");
            C19383o.m32798h(str2, ResponseConstants.TIMESTAMP);
            this.f12375a = str;
            this.f12376b = breadcrumbType;
            this.f12377c = str2;
            this.f12378d = map;
        }
    }

    /* renamed from: com.bugsnag.android.k2$b */
    public static final class C5782b extends C5780k2 {

        /* renamed from: a */
        public final String f12379a;

        /* renamed from: b */
        public final String f12380b;

        public C5782b(String str, String str2) {
            this.f12379a = str;
            this.f12380b = str2;
        }
    }

    /* renamed from: com.bugsnag.android.k2$c */
    public static final class C5783c extends C5780k2 {

        /* renamed from: a */
        public final String f12381a;

        /* renamed from: b */
        public final String f12382b;

        /* renamed from: c */
        public final Object f12383c;

        public C5783c(String str, String str2, Object obj) {
            C19383o.m32798h(str, "section");
            this.f12381a = str;
            this.f12382b = str2;
            this.f12383c = obj;
        }
    }

    /* renamed from: com.bugsnag.android.k2$d */
    public static final class C5784d extends C5780k2 {
    }

    /* renamed from: com.bugsnag.android.k2$e */
    public static final class C5785e extends C5780k2 {

        /* renamed from: a */
        public final String f12384a;

        public C5785e(String str) {
            C19383o.m32798h(str, "section");
            this.f12384a = str;
        }
    }

    /* renamed from: com.bugsnag.android.k2$f */
    public static final class C5786f extends C5780k2 {

        /* renamed from: a */
        public final String f12385a;

        /* renamed from: b */
        public final String f12386b;

        public C5786f(String str, String str2) {
            C19383o.m32798h(str, "section");
            this.f12385a = str;
            this.f12386b = str2;
        }
    }

    /* renamed from: com.bugsnag.android.k2$g */
    public static final class C5787g extends C5780k2 {

        /* renamed from: a */
        public static final C5787g f12387a = new C5787g();
    }

    /* renamed from: com.bugsnag.android.k2$h */
    public static final class C5788h extends C5780k2 {

        /* renamed from: a */
        public final String f12388a;

        /* renamed from: b */
        public final boolean f12389b;

        /* renamed from: c */
        public final String f12390c;

        /* renamed from: d */
        public final int f12391d;

        /* renamed from: e */
        public final ThreadSendPolicy f12392e;

        public C5788h(String str, boolean z, String str2, int i, ThreadSendPolicy threadSendPolicy) {
            C19383o.m32798h(str, "apiKey");
            C19383o.m32798h(threadSendPolicy, "sendThreads");
            this.f12388a = str;
            this.f12389b = z;
            this.f12390c = str2;
            this.f12391d = i;
            this.f12392e = threadSendPolicy;
        }
    }

    /* renamed from: com.bugsnag.android.k2$i */
    public static final class C5789i extends C5780k2 {

        /* renamed from: a */
        public static final C5789i f12393a = new C5789i();
    }

    /* renamed from: com.bugsnag.android.k2$j */
    public static final class C5790j extends C5780k2 {

        /* renamed from: a */
        public static final C5790j f12394a = new C5790j();
    }

    /* renamed from: com.bugsnag.android.k2$k */
    public static final class C5791k extends C5780k2 {

        /* renamed from: a */
        public static final C5791k f12395a = new C5791k();
    }

    /* renamed from: com.bugsnag.android.k2$l */
    public static final class C5792l extends C5780k2 {

        /* renamed from: a */
        public final String f12396a;

        /* renamed from: b */
        public final String f12397b;

        /* renamed from: c */
        public final int f12398c;

        /* renamed from: d */
        public final int f12399d;

        public C5792l(String str, String str2, int i, int i2) {
            C19383o.m32798h(str, "id");
            this.f12396a = str;
            this.f12397b = str2;
            this.f12398c = i;
            this.f12399d = i2;
        }
    }

    /* renamed from: com.bugsnag.android.k2$m */
    public static final class C5793m extends C5780k2 {

        /* renamed from: a */
        public final String f12400a;

        public C5793m(String str) {
            this.f12400a = str;
        }
    }

    /* renamed from: com.bugsnag.android.k2$n */
    public static final class C5794n extends C5780k2 {

        /* renamed from: a */
        public final boolean f12401a;

        /* renamed from: b */
        public final String f12402b;

        public C5794n(boolean z, String str) {
            this.f12401a = z;
            this.f12402b = str;
        }
    }

    /* renamed from: com.bugsnag.android.k2$o */
    public static final class C5795o extends C5780k2 {

        /* renamed from: a */
        public final boolean f12403a = false;
    }

    /* renamed from: com.bugsnag.android.k2$p */
    public static final class C5796p extends C5780k2 {
    }

    /* renamed from: com.bugsnag.android.k2$q */
    public static final class C5797q extends C5780k2 {

        /* renamed from: a */
        public final boolean f12404a;

        /* renamed from: b */
        public final String f12405b;

        public C5797q(String str, boolean z) {
            C19383o.m32798h(str, "memoryTrimLevelDescription");
            this.f12404a = z;
            this.f12405b = str;
        }
    }

    /* renamed from: com.bugsnag.android.k2$r */
    public static final class C5798r extends C5780k2 {

        /* renamed from: a */
        public final String f12406a;

        public C5798r(String str) {
            this.f12406a = str;
        }
    }

    /* renamed from: com.bugsnag.android.k2$s */
    public static final class C5799s extends C5780k2 {

        /* renamed from: a */
        public final C5915t2 f12407a;

        public C5799s(C5915t2 t2Var) {
            C19383o.m32798h(t2Var, "user");
            this.f12407a = t2Var;
        }
    }
}
