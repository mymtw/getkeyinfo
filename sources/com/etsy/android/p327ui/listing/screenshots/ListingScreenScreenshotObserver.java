package com.etsy.android.p327ui.listing.screenshots;

import androidx.lifecycle.C2857f;
import androidx.lifecycle.C2887s;
import com.etsy.android.lib.util.C8879a0;
import com.etsy.android.lib.util.C8881b0;
import com.etsy.android.lib.util.C8924v;
import com.etsy.android.p327ui.BOEActivity;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.internal.operators.observable.C19162g;
import p145io.reactivex.internal.operators.observable.ObservableCreate;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p145io.reactivex.internal.operators.observable.ObservableThrottleFirstTimed;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8061n;
import p248tp.C8066r;
import p456ua.C13461f;
import p466vc.C13573c;
import p628nj.C18263b;
import p738dq.C18990a;

/* renamed from: com.etsy.android.ui.listing.screenshots.ListingScreenScreenshotObserver */
public final class ListingScreenScreenshotObserver implements C2857f {

    /* renamed from: b */
    public final BOEActivity f22350b;

    /* renamed from: c */
    public final C13461f f22351c;

    /* renamed from: d */
    public final C13573c f22352d;

    /* renamed from: e */
    public final C7091a f22353e = new C7091a();

    public ListingScreenScreenshotObserver(BOEActivity bOEActivity, C13461f fVar, C13573c cVar) {
        C19383o.m32797g(bOEActivity, "boeActivity");
        this.f22350b = bOEActivity;
        this.f22351c = fVar;
        this.f22352d = cVar;
    }

    public final void onPause(C2887s sVar) {
        this.f22353e.dispose();
    }

    public final void onResume(C2887s sVar) {
        C8061n nVar;
        if (!this.f22353e.f15781c) {
            C8881b0 b0Var = new C8881b0(this.f22350b);
            if (C8924v.m17365a(b0Var.f19631a.get(), "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                nVar = new C19162g(new Functions.C12962g(new SecurityException("Permission not granted")));
            } else {
                C18263b.f40051O.mo45474a(String.format("%s.read_external_storage_permission_granted", new Object[]{"listing_page.screenshot"}));
                nVar = new ObservableCreate(new C8879a0(b0Var, b0Var.f19631a.get().getContentResolver()));
            }
            TimeUnit timeUnit = TimeUnit.SECONDS;
            C8066r rVar = C18990a.f42332a;
            if (timeUnit == null) {
                throw new NullPointerException("unit is null");
            } else if (rVar != null) {
                ObservableThrottleFirstTimed observableThrottleFirstTimed = new ObservableThrottleFirstTimed(nVar, rVar, timeUnit);
                this.f22351c.getClass();
                ObservableSubscribeOn i = observableThrottleFirstTimed.mo20639i(C13461f.m21235b());
                this.f22351c.getClass();
                LambdaObserver f = SubscribersKt.m32501f(i.mo20635e(C13461f.m21236c()), new ListingScreenScreenshotObserver$onResume$1(this), new ListingScreenScreenshotObserver$onResume$2(this), 2);
                C7091a aVar = this.f22353e;
                C19383o.m32798h(aVar, "compositeDisposable");
                aVar.mo19403b(f);
            } else {
                throw new NullPointerException("scheduler is null");
            }
        }
    }
}
