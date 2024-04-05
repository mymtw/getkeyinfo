package com.etsy.android.lib.network;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.etsy.android.lib.logger.C8694h;
import java.util.Set;
import kotlin.jvm.internal.C19382n;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.subjects.C19254a;
import p456ua.C13461f;

public final class Connectivity {

    /* renamed from: a */
    public ConnectivityManager f19159a;

    /* renamed from: b */
    public C13461f f19160b;

    /* renamed from: c */
    public C8694h f19161c;

    /* renamed from: d */
    public final long f19162d = 500;

    /* renamed from: e */
    public long f19163e;

    /* renamed from: f */
    public final Set<Integer> f19164f = C19382n.m32704D0(1, 6, 9);

    /* renamed from: g */
    public final C19254a<Boolean> f19165g = new C19254a<>();

    /* renamed from: h */
    public final C7091a f19166h = new C7091a();

    public Connectivity(ConnectivityManager connectivityManager, C13461f fVar, C8694h hVar) {
        this.f19159a = connectivityManager;
        this.f19160b = fVar;
        this.f19161c = hVar;
        this.f19159a.registerDefaultNetworkCallback(new Connectivity$networkCallback$1(this));
    }

    /* renamed from: a */
    public final boolean mo29933a() {
        if (this.f19163e > 0) {
            NetworkInfo activeNetworkInfo = this.f19159a.getActiveNetworkInfo();
            if (!(activeNetworkInfo != null ? activeNetworkInfo.isConnected() : false) && System.currentTimeMillis() < this.f19163e + this.f19162d) {
                return true;
            }
            NetworkInfo activeNetworkInfo2 = this.f19159a.getActiveNetworkInfo();
            if ((activeNetworkInfo2 != null ? activeNetworkInfo2.isConnected() : false) && System.currentTimeMillis() < this.f19163e + 0) {
                return false;
            }
        }
        NetworkInfo activeNetworkInfo3 = this.f19159a.getActiveNetworkInfo();
        if (activeNetworkInfo3 != null) {
            return activeNetworkInfo3.isConnected();
        }
        return false;
    }
}
