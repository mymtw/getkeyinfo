package com.google.android.play.core.assetpacks;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.measurement.internal.C15032m3;
import com.google.android.play.core.internal.C15714z;
import com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestProgressFlow$1;
import java.util.List;
import java.util.concurrent.Executor;
import p604kj.C18103h;
import p614ll.C18200b;
import p689ul.C18606d;

/* renamed from: com.google.android.play.core.assetpacks.q2 */
public final class C15645q2 implements C15582b {

    /* renamed from: f */
    public static final C15032m3 f35294f = new C15032m3("AssetPackManager");

    /* renamed from: a */
    public final C15583b0 f35295a;

    /* renamed from: b */
    public final C15714z f35296b;

    /* renamed from: c */
    public final C15674y f35297c;

    /* renamed from: d */
    public final C15627m0 f35298d;

    /* renamed from: e */
    public final C15714z f35299e;

    public C15645q2(C15583b0 b0Var, C15714z zVar, C15674y yVar, C15671x0 x0Var, C15627m0 m0Var, C15714z zVar2, C18200b bVar, C15581a2 a2Var) {
        new Handler(Looper.getMainLooper());
        this.f35295a = b0Var;
        this.f35296b = zVar;
        this.f35297c = yVar;
        this.f35298d = m0Var;
        this.f35299e = zVar2;
    }

    /* renamed from: a */
    public final void mo55373a(C15586c cVar) {
        this.f35297c.mo69855d(cVar);
    }

    /* renamed from: b */
    public final synchronized void mo55374b(AssetPackManagerKtxKt$requestProgressFlow$1.C15722c cVar) {
        boolean z;
        C15674y yVar = this.f35297c;
        synchronized (yVar) {
            z = yVar.f40213e != null;
        }
        this.f35297c.mo69854c(cVar);
        if (!z) {
            ((Executor) this.f35299e.zza()).execute(new C18103h(this, 2));
        }
    }

    /* renamed from: c */
    public final C18606d<C15590d> mo55375c(List<String> list) {
        return ((C15677y2) this.f35296b.zza()).mo55467d(list, new C15676y1(this), this.f35295a.mo55387o());
    }
}
