package com.etsy.android.lib.network;

import android.net.ConnectivityManager;
import android.net.Network;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p145io.reactivex.internal.operators.observable.ObservableTimer;
import p145io.reactivex.internal.util.NotificationLite;
import p248tp.C8061n;
import p306z8.C8480g;
import p402n9.C13090j;
import p456ua.C13461f;

public final class Connectivity$networkCallback$1 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ Connectivity this$0;

    public Connectivity$networkCallback$1(Connectivity connectivity) {
        this.this$0 = connectivity;
    }

    /* access modifiers changed from: private */
    /* renamed from: onAvailable$lambda-1$lambda-0  reason: not valid java name */
    public static final void m34866onAvailable$lambda1$lambda0(Connectivity connectivity, Long l) {
        C19383o.m32797g(connectivity, "this$0");
        Object obj = connectivity.f19165g.f43101b.get();
        boolean z = !(obj != null && !NotificationLite.isComplete(obj) && !NotificationLite.isError(obj));
        boolean b = C19383o.m32792b(connectivity.f19165g.mo71420m(), Boolean.FALSE);
        if (z || b) {
            connectivity.f19161c.mo21310e("Network is connected");
            connectivity.f19165g.onNext(Boolean.TRUE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onLost$lambda-3$lambda-2  reason: not valid java name */
    public static final void m34867onLost$lambda3$lambda2(Connectivity connectivity, Long l) {
        C19383o.m32797g(connectivity, "this$0");
        connectivity.f19161c.mo21310e("Network is disconnected");
        connectivity.f19165g.onNext(Boolean.FALSE);
    }

    public void onAvailable(Network network) {
        C19383o.m32797g(network, "network");
        this.this$0.f19163e = System.currentTimeMillis();
        Connectivity connectivity = this.this$0;
        C7091a aVar = connectivity.f19166h;
        aVar.mo19405d();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        connectivity.f19160b.getClass();
        ObservableTimer j = C8061n.m16235j(0, timeUnit, C13461f.m21235b());
        connectivity.f19160b.getClass();
        ObservableSubscribeOn i = j.mo20639i(C13461f.m21235b());
        connectivity.f19160b.getClass();
        aVar.mo19403b(i.mo20635e(C13461f.m21235b()).mo20637g(new C8480g(connectivity, 2)));
    }

    public void onLost(Network network) {
        C19383o.m32797g(network, "network");
        this.this$0.f19163e = System.currentTimeMillis();
        Connectivity connectivity = this.this$0;
        C7091a aVar = connectivity.f19166h;
        aVar.mo19405d();
        long j = connectivity.f19162d;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        connectivity.f19160b.getClass();
        ObservableTimer j2 = C8061n.m16235j(j, timeUnit, C13461f.m21235b());
        connectivity.f19160b.getClass();
        ObservableSubscribeOn i = j2.mo20639i(C13461f.m21235b());
        connectivity.f19160b.getClass();
        aVar.mo19403b(i.mo20635e(C13461f.m21235b()).mo20637g(new C13090j(connectivity, 2)));
    }
}
