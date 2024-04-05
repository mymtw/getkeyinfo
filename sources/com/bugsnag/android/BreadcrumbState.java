package com.bugsnag.android;

import androidx.appcompat.widget.C0326j;
import com.bugsnag.android.C5748g1;
import com.bugsnag.android.C5780k2;
import com.bugsnag.android.internal.C5771f;
import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.C19318k;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;

public final class BreadcrumbState extends C5756i implements C5748g1.C5749a {
    private final C5805m callbackState;
    private final AtomicInteger index;
    private final C5816o1 logger;
    private final int maxBreadcrumbs;
    private final Breadcrumb[] store;
    private final int validIndexMask = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    public BreadcrumbState(int i, C5805m mVar, C5816o1 o1Var) {
        C19383o.m32798h(mVar, "callbackState");
        C19383o.m32798h(o1Var, "logger");
        this.maxBreadcrumbs = i;
        this.callbackState = mVar;
        this.logger = o1Var;
        this.store = new Breadcrumb[i];
        this.index = new AtomicInteger(0);
    }

    private final int getBreadcrumbIndex() {
        int i;
        do {
            i = this.index.get() & this.validIndexMask;
        } while (!this.index.compareAndSet(i, (i + 1) % this.maxBreadcrumbs));
        return i;
    }

    public final void add(Breadcrumb breadcrumb) {
        C19383o.m32798h(breadcrumb, "breadcrumb");
        if (this.maxBreadcrumbs != 0) {
            C5805m mVar = this.callbackState;
            C5816o1 o1Var = this.logger;
            mVar.getClass();
            C19383o.m32798h(o1Var, "logger");
            boolean z = true;
            if (!mVar.f12416b.isEmpty()) {
                Iterator<T> it = mVar.f12416b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    try {
                        if (!((C5930w1) it.next()).mo16699a()) {
                            z = false;
                            break;
                        }
                    } catch (Throwable th) {
                        o1Var.mo16602b("OnBreadcrumbCallback threw an Exception", th);
                    }
                }
            }
            if (z) {
                this.store[getBreadcrumbIndex()] = breadcrumb;
                if (!getObservers$bugsnag_android_core_release().isEmpty()) {
                    C5772j jVar = breadcrumb.impl;
                    String str = jVar.f12345b;
                    BreadcrumbType breadcrumbType = jVar.f12346c;
                    StringBuilder k = C0326j.m866k('t');
                    k.append(breadcrumb.impl.f12348e.getTime());
                    String sb = k.toString();
                    Map map = breadcrumb.impl.f12347d;
                    if (map == null) {
                        map = new LinkedHashMap();
                    }
                    C5780k2.C5781a aVar = new C5780k2.C5781a(str, breadcrumbType, sb, map);
                    for (C5771f onStateChange : getObservers$bugsnag_android_core_release()) {
                        onStateChange.onStateChange(aVar);
                    }
                }
            }
        }
    }

    public final List<Breadcrumb> copy() {
        if (this.maxBreadcrumbs == 0) {
            return EmptyList.INSTANCE;
        }
        int i = -1;
        while (i == -1) {
            i = this.index.getAndSet(-1);
        }
        try {
            int i2 = this.maxBreadcrumbs;
            Breadcrumb[] breadcrumbArr = new Breadcrumb[i2];
            C19318k.m32603U0(this.store, 0, breadcrumbArr, i, i2);
            C19318k.m32603U0(this.store, this.maxBreadcrumbs - i, breadcrumbArr, 0, i);
            return C19318k.m32611c1(breadcrumbArr);
        } finally {
            this.index.set(i);
        }
    }

    public void toStream(C5748g1 g1Var) throws IOException {
        C19383o.m32798h(g1Var, "writer");
        List<Breadcrumb> copy = copy();
        g1Var.mo16520b();
        for (Breadcrumb stream : copy) {
            stream.toStream(g1Var);
        }
        g1Var.mo16524f();
    }
}
