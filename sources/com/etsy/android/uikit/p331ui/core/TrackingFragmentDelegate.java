package com.etsy.android.uikit.p331ui.core;

import android.content.Context;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.logger.C8693g;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.perf.C8709f;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;
import p346fa.C12703a;
import p628nj.C18263b;

/* renamed from: com.etsy.android.uikit.ui.core.TrackingFragmentDelegate */
public class TrackingFragmentDelegate implements C8693g {

    /* renamed from: b */
    public final Fragment f26435b;

    /* renamed from: c */
    public final C8693g f26436c;

    /* renamed from: d */
    public C8703p f26437d;

    /* renamed from: e */
    public String f26438e;

    /* renamed from: f */
    public boolean f26439f = true;

    /* renamed from: g */
    public boolean f26440g = false;

    public TrackingFragmentDelegate(Fragment fragment) {
        this.f26435b = fragment;
        this.f26436c = (C8693g) fragment;
    }

    /* renamed from: a */
    public final void mo38417a(Bundle bundle) {
        C8694h hVar = C8694h.f19097a;
        this.f26435b.isVisible();
        this.f26435b.getClass();
        hVar.mo21308c();
        if (bundle != null) {
            this.f26439f = bundle.getBoolean("Tracking.IsVisibleHint", this.f26439f);
        }
        Bundle arguments = this.f26435b.getArguments();
        if (arguments != null) {
            this.f26438e = arguments.getString("TRACKING_NAME");
        }
        C8703p pVar = new C8703p(this.f26436c, this.f26439f, arguments);
        this.f26437d = pVar;
        pVar.mo21363k(this.f26436c);
        C12703a aVar = C18263b.f40051O;
        Bundle arguments2 = this.f26435b.getArguments();
        StringBuilder h = C0072d.m201h("nav_performance.fragment_launch.");
        h.append(this.f26435b.getClass().getSimpleName());
        String sb = h.toString();
        aVar.getClass();
        C19383o.m32797g(sb, "metric");
        if (arguments2 != null && arguments2.containsKey("graphite_nav_arg_start_time")) {
            long j = arguments2.getLong("graphite_nav_arg_start_time");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            aVar.f27991a.getClass();
            aVar.mo45477d(sb, (double) timeUnit.convert(System.nanoTime() - j, TimeUnit.NANOSECONDS));
            arguments2.remove("graphite_nav_arg_start_time");
        }
        C12703a aVar2 = C18263b.f40051O;
        Bundle arguments3 = this.f26435b.getArguments();
        StringBuilder h2 = C0072d.m201h("legacy_nav_performance.fragment_launch.");
        h2.append(this.f26435b.getClass().getSimpleName());
        String sb2 = h2.toString();
        aVar2.getClass();
        C19383o.m32797g(sb2, "metric");
        if (arguments3 != null && arguments3.containsKey("graphite_nav_arg_legacy_start_time")) {
            long j2 = arguments3.getLong("graphite_nav_arg_legacy_start_time");
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            aVar2.f27991a.getClass();
            aVar2.mo45477d(sb2, (double) timeUnit2.convert(System.nanoTime() - j2, TimeUnit.NANOSECONDS));
            arguments3.remove("graphite_nav_arg_legacy_start_time");
        }
    }

    /* renamed from: b */
    public final void mo38418b() {
        C8694h hVar = C8694h.f19097a;
        this.f26435b.isVisible();
        this.f26435b.getClass();
        hVar.mo21308c();
        C8703p pVar = this.f26437d;
        if (pVar != null) {
            if (pVar.f19109g) {
                pVar.f19114l = true;
            }
            pVar.f19109g = false;
        }
    }

    /* renamed from: c */
    public final void mo38419c() {
        C8694h hVar = C8694h.f19097a;
        this.f26435b.isVisible();
        this.f26435b.getClass();
        hVar.mo21308c();
        C8703p pVar = this.f26437d;
        if (pVar != null) {
            pVar.mo21360h(this.f26436c);
        }
        C12703a aVar = C18263b.f40051O;
        Bundle arguments = this.f26435b.getArguments();
        StringBuilder h = C0072d.m201h("performance.fragment_launch.");
        h.append(this.f26435b.getClass().getSimpleName());
        String sb = h.toString();
        aVar.getClass();
        C19383o.m32797g(sb, "metric");
        if (arguments != null && arguments.containsKey("graphite_arg_start_time")) {
            long j = arguments.getLong("graphite_arg_start_time");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            aVar.f27991a.getClass();
            aVar.mo45477d(sb, (double) timeUnit.convert(System.nanoTime() - j, TimeUnit.NANOSECONDS));
            arguments.remove("graphite_arg_start_time");
        }
    }

    /* renamed from: d */
    public final void mo38420d(Bundle bundle) {
        if (this.f26440g) {
            this.f26439f = false;
        }
        bundle.putBoolean("Tracking.IsVisibleHint", this.f26439f);
    }

    /* renamed from: e */
    public final void mo38421e() {
        C8694h hVar = C8694h.f19097a;
        this.f26435b.isVisible();
        this.f26435b.getClass();
        hVar.mo21308c();
        C8703p pVar = this.f26437d;
        if (pVar != null) {
            pVar.mo21361i(this);
        }
    }

    /* renamed from: f */
    public final void mo38422f(boolean z) {
        this.f26440g = true;
        C8694h hVar = C8694h.f19097a;
        this.f26435b.getClass();
        hVar.mo21308c();
        this.f26439f = z;
        C8703p pVar = this.f26437d;
        if (pVar != null) {
            C8693g gVar = this.f26436c;
            pVar.f19112j = z;
            pVar.f19110h = true;
            if (z) {
                pVar.mo21363k(gVar);
            } else {
                pVar.f19109g = false;
            }
        }
    }

    public final C8703p getAnalyticsContext() {
        return this.f26437d;
    }

    public final Context getAndroidContext() {
        return this.f26435b.getActivity();
    }

    public final String getDefaultName() {
        return this.f26435b.getClass().getSimpleName();
    }

    public final C8709f getPerformanceTracker() {
        Fragment fragment = this.f26435b;
        if (fragment instanceof C8693g) {
            return ((C8693g) fragment).getPerformanceTracker();
        }
        return null;
    }

    public final String getTrackingName() {
        String str = this.f26438e;
        return str != null ? str : getDefaultName();
    }

    public final C8693g getTrackingParent() {
        if (this.f26435b.getParentFragment() != null && (this.f26435b.getParentFragment() instanceof C8693g)) {
            return (C8693g) this.f26435b.getParentFragment();
        }
        if (this.f26435b.getActivity() == null || !(this.f26435b.getActivity() instanceof C8693g)) {
            return null;
        }
        return (C8693g) this.f26435b.getActivity();
    }
}
