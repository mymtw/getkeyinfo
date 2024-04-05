package com.bugsnag.android;

import com.bugsnag.android.C5748g1;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C19394m;
import kotlin.collections.C19322o;
import kotlin.collections.C19324q;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;

/* renamed from: com.bugsnag.android.u0 */
public final class C5918u0 implements C5748g1.C5749a {

    /* renamed from: b */
    public C5750g2 f12647b;

    /* renamed from: c */
    public final C5829r1 f12648c;

    /* renamed from: d */
    public final C5722b1 f12649d;

    /* renamed from: e */
    public final Set<String> f12650e;

    /* renamed from: f */
    public Collection<String> f12651f;

    /* renamed from: g */
    public final C5923v1 f12652g;

    /* renamed from: h */
    public C5728c2 f12653h;

    /* renamed from: i */
    public String f12654i;

    /* renamed from: j */
    public C5735e f12655j;

    /* renamed from: k */
    public C5811n0 f12656k;

    /* renamed from: l */
    public List<Breadcrumb> f12657l;

    /* renamed from: m */
    public List<C5819p0> f12658m;

    /* renamed from: n */
    public List<Thread> f12659n;

    /* renamed from: o */
    public String f12660o;

    /* renamed from: p */
    public String f12661p;

    /* renamed from: q */
    public C5915t2 f12662q;

    public C5918u0(String str, List list, Set set, List list2, C5829r1 r1Var, C5722b1 b1Var, Collection collection, C5750g2 g2Var, List list3, C5915t2 t2Var, Set set2) {
        C19383o.m32798h(str, "apiKey");
        C19383o.m32798h(list, "breadcrumbs");
        C19383o.m32798h(set, "discardClasses");
        C19383o.m32798h(list2, "errors");
        C19383o.m32798h(r1Var, ResponseConstants.METADATA);
        C19383o.m32798h(b1Var, "featureFlags");
        C19383o.m32798h(collection, "projectPackages");
        C19383o.m32798h(g2Var, "severityReason");
        C19383o.m32798h(list3, "threads");
        C19383o.m32798h(t2Var, "user");
        C5923v1 v1Var = new C5923v1();
        Set<String> t1 = C19327t.m32664t1(v1Var.f12669a);
        C19383o.m32798h(t1, "<set-?>");
        v1Var.f12669a = t1;
        C19394m mVar = C19394m.f43287a;
        this.f12652g = v1Var;
        this.f12654i = str;
        this.f12657l = list;
        this.f12650e = set;
        this.f12658m = list2;
        this.f12648c = r1Var;
        this.f12649d = b1Var;
        this.f12651f = collection;
        this.f12647b = g2Var;
        this.f12659n = list3;
        this.f12662q = t2Var;
        if (set2 != null) {
            Set<String> t12 = C19327t.m32664t1(set2);
            C19383o.m32798h(t12, "<set-?>");
            v1Var.f12669a = t12;
            Set<String> t13 = C19327t.m32664t1(set2);
            C19383o.m32798h(t13, "value");
            C5923v1 v1Var2 = r1Var.f12467b;
            v1Var2.getClass();
            v1Var2.f12669a = t13;
        }
    }

    /* renamed from: a */
    public final LinkedHashSet mo16689a() {
        int i;
        List<C5819p0> list = this.f12658m;
        ArrayList arrayList = new ArrayList();
        for (C5819p0 p0Var : list) {
            ErrorType errorType = p0Var.f12445b.f12458e;
            if (errorType != null) {
                arrayList.add(errorType);
            }
        }
        Set t1 = C19327t.m32664t1(arrayList);
        List<C5819p0> list2 = this.f12658m;
        ArrayList arrayList2 = new ArrayList(C19322o.m32624F0(list2));
        for (C5819p0 p0Var2 : list2) {
            arrayList2.add(p0Var2.f12445b.f12455b);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            List<C5759i2> list3 = (List) it.next();
            C19383o.m32793c(list3, "it");
            ArrayList arrayList4 = new ArrayList();
            for (C5759i2 i2Var : list3) {
                ErrorType errorType2 = i2Var.f12307l;
                if (errorType2 != null) {
                    arrayList4.add(errorType2);
                }
            }
            C19324q.m32628J0(arrayList4, arrayList3);
        }
        C19383o.m32797g(t1, "<this>");
        Integer valueOf = Integer.valueOf(arrayList3.size());
        if (valueOf != null) {
            i = t1.size() + valueOf.intValue();
        } else {
            i = t1.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C19421p.m32930T(i));
        linkedHashSet.addAll(t1);
        C19324q.m32628J0(arrayList3, linkedHashSet);
        return linkedHashSet;
    }

    public final void toStream(C5748g1 g1Var) throws IOException {
        C19383o.m32798h(g1Var, "parentWriter");
        C5748g1 g1Var2 = new C5748g1(g1Var, this.f12652g);
        g1Var2.mo16522d();
        g1Var2.mo16514B(ResponseConstants.CONTEXT);
        g1Var2.mo16530k(this.f12661p);
        g1Var2.mo16514B("metaData");
        g1Var2.mo16516M(this.f12648c, false);
        g1Var2.mo16514B("severity");
        Severity severity = this.f12647b.f12263f;
        C19383o.m32793c(severity, "severityReason.currentSeverity");
        g1Var2.mo16516M(severity, false);
        g1Var2.mo16514B("severityReason");
        g1Var2.mo16516M(this.f12647b, false);
        g1Var2.mo16514B("unhandled");
        g1Var2.mo16534u(this.f12647b.f12264g);
        g1Var2.mo16514B("exceptions");
        g1Var2.mo16520b();
        for (C5819p0 M : this.f12658m) {
            g1Var2.mo16516M(M, false);
        }
        g1Var2.mo16524f();
        g1Var2.mo16514B("projectPackages");
        g1Var2.mo16520b();
        for (String k : this.f12651f) {
            g1Var2.mo16530k(k);
        }
        g1Var2.mo16524f();
        g1Var2.mo16514B("user");
        g1Var2.mo16516M(this.f12662q, false);
        g1Var2.mo16514B("app");
        C5735e eVar = this.f12655j;
        if (eVar != null) {
            g1Var2.mo16516M(eVar, false);
            g1Var2.mo16514B("device");
            C5811n0 n0Var = this.f12656k;
            if (n0Var != null) {
                g1Var2.mo16516M(n0Var, false);
                g1Var2.mo16514B("breadcrumbs");
                g1Var2.mo16516M(this.f12657l, false);
                g1Var2.mo16514B("groupingHash");
                g1Var2.mo16530k(this.f12660o);
                g1Var2.mo16514B("threads");
                g1Var2.mo16520b();
                for (Thread M2 : this.f12659n) {
                    g1Var2.mo16516M(M2, false);
                }
                g1Var2.mo16524f();
                g1Var2.mo16514B("featureFlags");
                g1Var2.mo16516M(this.f12649d, false);
                C5728c2 c2Var = this.f12653h;
                if (c2Var != null) {
                    C5728c2 a = C5728c2.m11517a(c2Var);
                    g1Var2.mo16514B("session");
                    g1Var2.mo16522d();
                    g1Var2.mo16514B("id");
                    g1Var2.mo16530k(a.f12184d);
                    g1Var2.mo16514B("startedAt");
                    g1Var2.mo16516M(a.f12185e, false);
                    g1Var2.mo16514B("events");
                    g1Var2.mo16522d();
                    g1Var2.mo16514B("handled");
                    g1Var2.mo16531n((long) a.f12192l.intValue());
                    g1Var2.mo16514B("unhandled");
                    g1Var2.mo16531n((long) a.f12191k.intValue());
                    g1Var2.mo16526g();
                    g1Var2.mo16526g();
                }
                g1Var2.mo16526g();
                return;
            }
            C19383o.m32805o("device");
            throw null;
        }
        C19383o.m32805o("app");
        throw null;
    }
}
