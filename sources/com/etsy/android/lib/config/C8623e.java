package com.etsy.android.lib.config;

import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.config.EtsyConfigKey;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.toolbar.C8860a;
import com.etsy.android.lib.util.C8890e0;
import java.util.HashSet;
import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;
import p409o9.C13132l;
import p409o9.C13137p;

/* renamed from: com.etsy.android.lib.config.e */
public final class C8623e extends C8618c {

    /* renamed from: f */
    public HashSet<String> f18951f = new HashSet<>();

    /* renamed from: g */
    public C8672b f18952g;

    /* renamed from: h */
    public C8890e0 f18953h;

    /* renamed from: i */
    public long f18954i;

    public C8623e(C8672b bVar, C8890e0 e0Var, EtsyConfigKey.Environment environment, C8618c.C8619a aVar) {
        super(environment, aVar);
        this.f18952g = bVar;
        this.f18953h = e0Var;
        this.f18953h.getClass();
        this.f18954i = System.currentTimeMillis();
    }

    /* renamed from: c */
    public final C13132l mo21133c(EtsyConfigKey etsyConfigKey, String str) {
        C13132l c = super.mo21133c(etsyConfigKey, str);
        mo21147j();
        if (c.f28877h && c.f28870a.equals(str) && !this.f18951f.contains(str)) {
            if (super.mo21137g(C8592b.f18776b).mo45840h()) {
                C8672b bVar = this.f18952g;
                if (bVar != null) {
                    bVar.mo21334e(c);
                }
            } else {
                C8694h.f19097a.mo21313g("WARNING config flag tracking has been disabled!");
            }
            String str2 = c.f28870a;
            String str3 = c.f28871b;
            String str4 = c.f28873d;
            if (C8860a.C8861a.m17264a()) {
                C8860a aVar = C8860a.f19558o;
                C19383o.m32794d(aVar);
                C19383o.m32796f(str2, "abTest.key");
                aVar.f19567h = str2;
                String c2 = C0048b.m164c(str2, ":\n", str3, ", ", str4);
                C8860a aVar2 = C8860a.f19558o;
                C19383o.m32794d(aVar2);
                aVar2.f19569j.add(c2);
            }
            this.f18951f.add(str);
        }
        return c;
    }

    /* renamed from: g */
    public final C13132l mo21137g(C13137p pVar) {
        C13132l g = super.mo21137g(pVar);
        mo21147j();
        if (g.f28877h && !this.f18951f.contains(pVar.getName())) {
            if (super.mo21137g(C8592b.f18776b).mo45840h()) {
                C8672b bVar = this.f18952g;
                if (bVar != null) {
                    bVar.mo21334e(g);
                }
            } else {
                C8694h.f19097a.mo21313g("WARNING config flag tracking has been disabled!");
            }
            String str = g.f28870a;
            String str2 = g.f28871b;
            String str3 = g.f28873d;
            if (C8860a.C8861a.m17264a()) {
                C8860a aVar = C8860a.f19558o;
                C19383o.m32794d(aVar);
                C19383o.m32796f(str, "abTest.key");
                aVar.f19567h = str;
                String c = C0048b.m164c(str, ":\n", str2, ", ", str3);
                C8860a aVar2 = C8860a.f19558o;
                C19383o.m32794d(aVar2);
                aVar2.f19569j.add(c);
            }
            this.f18951f.add(pVar.getName());
        }
        return g;
    }

    /* renamed from: j */
    public final void mo21147j() {
        this.f18953h.getClass();
        if (this.f18954i + 1800000 < System.currentTimeMillis()) {
            this.f18951f.clear();
            this.f18953h.getClass();
            this.f18954i = System.currentTimeMillis();
        }
    }

    public C8623e(C8672b bVar, C8890e0 e0Var, C8623e eVar) {
        super(eVar);
        this.f18952g = bVar;
        this.f18953h = e0Var;
        this.f18953h.getClass();
        this.f18954i = System.currentTimeMillis();
    }
}
