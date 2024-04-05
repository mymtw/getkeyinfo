package com.etsy.android.lib.logger;

import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.logger.ViewClickAnalyticsLog;
import com.etsy.android.lib.toolbar.C8860a;
import com.etsy.android.lib.util.C8890e0;
import com.google.android.gms.internal.measurement.C14609d1;
import com.google.android.gms.internal.measurement.C14726m1;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.Pair;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p226r8.C7784a;
import p359ha.C12799a;
import p409o9.C13138q;
import p486y9.C13891g;
import p628nj.C18263b;

/* renamed from: com.etsy.android.lib.logger.p */
public final class C8703p extends C8672b {

    /* renamed from: e */
    public String f19107e;

    /* renamed from: f */
    public boolean f19108f;

    /* renamed from: g */
    public boolean f19109g;

    /* renamed from: h */
    public boolean f19110h;

    /* renamed from: i */
    public boolean f19111i;

    /* renamed from: j */
    public boolean f19112j;

    /* renamed from: k */
    public boolean f19113k = true;

    /* renamed from: l */
    public boolean f19114l = false;

    /* renamed from: m */
    public HashMap<AnalyticsProperty, Object> f19115m;

    /* renamed from: n */
    public C8623e f19116n;

    /* renamed from: o */
    public ThreadLocalRandom f19117o = ThreadLocalRandom.current();

    /* renamed from: p */
    public C12799a f19118p;

    public C8703p(C8693g gVar) {
        super(gVar.getTrackingName());
        if (gVar.getDefaultName().equals(gVar.getTrackingName())) {
            this.f19113k = false;
        }
        mo21359g(gVar, true);
    }

    /* renamed from: b */
    public final C8623e mo21332b() {
        return this.f19116n;
    }

    /* renamed from: d */
    public final void mo21333d(String str, Map<? extends AnalyticsProperty, Object> map) {
        Object obj;
        C12799a aVar = this.f19118p;
        if (aVar != null) {
            C19383o.m32797g(str, "eventName");
            if (!(!C19383o.m32792b(str, "add_to_cart") || map == null || (obj = map.get(PredefinedAnalyticsProperty.LISTING_ID)) == null)) {
                Pair[] pairArr = {new Pair("added_listing_id", obj)};
                FirebaseAnalytics firebaseAnalytics = aVar.f28272a;
                Bundle K = C19382n.m32717K((Pair[]) Arrays.copyOf(pairArr, 1));
                C14726m1 m1Var = firebaseAnalytics.f36720a;
                m1Var.getClass();
                m1Var.mo50666b(new C14609d1(m1Var, (String) null, "add_to_cart", K, false));
            }
        }
        super.mo21333d(str, map);
    }

    /* renamed from: f */
    public final void mo21358f(AnalyticsProperty analyticsProperty, Object obj) {
        if (analyticsProperty instanceof PlatformAnalyticsProperty) {
            StringBuilder h = C0072d.m201h("Tried tracking with platform private attribute: ");
            h.append(analyticsProperty.toString());
            h.append(" please see PlatformAnalyticsProperty or reach out to #app-platform for help ");
            throw new IllegalArgumentException(h.toString());
        } else if (!(analyticsProperty instanceof DefaultAnalyticsProperty)) {
            this.f19115m.put(analyticsProperty, obj);
        } else {
            StringBuilder h2 = C0072d.m201h("Tried tracking with platform private attribute: ");
            h2.append(analyticsProperty.toString());
            h2.append(" please see DefaultAnalyticsProperty or reach out to #app-platform for help ");
            throw new IllegalArgumentException(h2.toString());
        }
    }

    /* renamed from: g */
    public final void mo21359g(C8693g gVar, boolean z) {
        this.f19115m = new HashMap<>();
        this.f19112j = z;
        C8693g trackingParent = gVar.getTrackingParent();
        if (!(trackingParent == null || trackingParent.getAnalyticsContext() == null)) {
            this.f19107e = trackingParent.getAnalyticsContext().f19059a;
        }
        C8890e0 e0Var = new C8890e0();
        List<String> list = C8591a.f18700r;
        this.f19116n = new C8623e(this, e0Var, C18263b.f40056T.f18706f);
        if (gVar.getAndroidContext() != null) {
            this.f19118p = new C12799a(FirebaseAnalytics.getInstance(gVar.getAndroidContext()), C13138q.m20808a().f28895a, new C13891g());
        }
    }

    /* renamed from: h */
    public final void mo21360h(C8693g gVar) {
        mo21363k(gVar);
        C12799a aVar = this.f19118p;
        if (aVar != null && this.f19113k) {
            C19383o.m32797g(gVar, "view");
            FirebaseAnalytics firebaseAnalytics = aVar.f28272a;
            C7784a aVar2 = new C7784a(6);
            String trackingName = gVar.getTrackingName();
            C19383o.m32796f(trackingName, "view.trackingName");
            ((Bundle) aVar2.f17221b).putString("screen_name", trackingName);
            C14726m1 m1Var = firebaseAnalytics.f36720a;
            m1Var.getClass();
            m1Var.mo50666b(new C14609d1(m1Var, (String) null, "screen_view", (Bundle) aVar2.f17221b, false));
        }
    }

    /* renamed from: i */
    public final void mo21361i(C8693g gVar) {
        if (this.f19114l) {
            this.f19114l = false;
            Boolean valueOf = Boolean.valueOf(gVar.getPerformanceTracker() != null && gVar.getAnalyticsContext().f19116n.mo21132b(C8592b.f18731F));
            int d = gVar.getAnalyticsContext().f19116n.mo21134d(C8592b.f18733G);
            if (valueOf.booleanValue() && this.f19117o.nextInt(100) < d) {
                C8672b.m17069c(new C8711q(gVar));
            }
        }
        this.f19109g = false;
    }

    /* renamed from: j */
    public final void mo21362j(Bundle bundle) {
        Object obj;
        if (bundle != null && this.f19113k) {
            for (String next : bundle.keySet()) {
                C8701o oVar = ViewAnalyticsParameters.f19051e.get(next);
                if (oVar != null) {
                    try {
                        obj = oVar.f19106c.mo11995a(bundle, oVar.f19104a);
                    } catch (ClassCastException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        mo21358f(oVar.f19105b, obj);
                    }
                } else {
                    Object obj2 = bundle.get(next);
                    if (obj2 instanceof Bundle) {
                        mo21362j((Bundle) obj2);
                    } else if (obj2 instanceof C8698l) {
                        C8698l lVar = (C8698l) obj2;
                        C19383o.m32797g(lVar, "item");
                        for (Map.Entry entry : C19388s.m32882r0(lVar).entrySet()) {
                            mo21358f((AnalyticsProperty) entry.getKey(), entry.getValue());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo21363k(C8693g gVar) {
        if (this.f19113k && !this.f19109g) {
            if (this.f19108f) {
                boolean z = this.f19112j;
                if (z) {
                    this.f19109g = true;
                    C8672b.m17069c(new C8700n(gVar, z, this.f19111i));
                    this.f19111i = true;
                    return;
                }
                return;
            }
            boolean z2 = this.f19112j;
            if (z2) {
                this.f19109g = true;
                this.f19111i = true;
            }
            C8672b.m17069c(new C8700n(gVar, z2, false));
            this.f19108f = true;
        }
    }

    /* renamed from: l */
    public final void mo21364l(String str, ViewClickAnalyticsLog.ViewAction viewAction, HashMap<AnalyticsProperty, Object> hashMap) {
        C8860a.m17263b(viewAction.name() + "_" + str);
        C8672b.m17069c(new ViewClickAnalyticsLog(str, viewAction, hashMap, this));
    }

    public C8703p(C8693g gVar, boolean z, Bundle bundle) {
        super(gVar.getTrackingName());
        if (gVar.getDefaultName().equals(gVar.getTrackingName())) {
            this.f19113k = false;
        }
        mo21359g(gVar, z);
        mo21362j(bundle);
    }
}
