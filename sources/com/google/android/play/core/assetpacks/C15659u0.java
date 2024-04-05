package com.google.android.play.core.assetpacks;

import com.google.android.gms.measurement.internal.C15032m3;
import com.google.android.play.core.internal.C15714z;
import java.util.concurrent.atomic.AtomicBoolean;
import p194o0.C7510c;

/* renamed from: com.google.android.play.core.assetpacks.u0 */
public final class C15659u0 {

    /* renamed from: k */
    public static final C15032m3 f35344k = new C15032m3("ExtractorLooper");

    /* renamed from: a */
    public final C15608h1 f35345a;

    /* renamed from: b */
    public final C15643q0 f35346b;

    /* renamed from: c */
    public final C15633n2 f35347c;

    /* renamed from: d */
    public final C15656t1 f35348d;

    /* renamed from: e */
    public final C15672x1 f35349e;

    /* renamed from: f */
    public final C15597e2 f35350f;

    /* renamed from: g */
    public final C15605g2 f35351g;

    /* renamed from: h */
    public final C15714z f35352h;

    /* renamed from: i */
    public final C15612i1 f35353i;

    /* renamed from: j */
    public final AtomicBoolean f35354j = new AtomicBoolean(false);

    public C15659u0(C15608h1 h1Var, C15714z zVar, C15643q0 q0Var, C15633n2 n2Var, C15656t1 t1Var, C15672x1 x1Var, C15597e2 e2Var, C15605g2 g2Var, C15612i1 i1Var) {
        this.f35345a = h1Var;
        this.f35352h = zVar;
        this.f35346b = q0Var;
        this.f35347c = n2Var;
        this.f35348d = t1Var;
        this.f35349e = x1Var;
        this.f35350f = e2Var;
        this.f35351g = g2Var;
        this.f35353i = i1Var;
    }

    /* renamed from: a */
    public final void mo55491a(int i, Exception exc) {
        C15608h1 h1Var;
        try {
            C15608h1 h1Var2 = this.f35345a;
            h1Var2.getClass();
            h1Var2.mo55412d(new C7510c(h1Var2, i));
            h1Var = this.f35345a;
            h1Var.getClass();
            h1Var.f35175f.lock();
            h1Var.mo55409a(i);
            h1Var.f35175f.unlock();
        } catch (zzck unused) {
            f35344k.mo52243c("Error during error handling: %s", exc.getMessage());
        } catch (Throwable th) {
            h1Var.f35175f.unlock();
            throw th;
        }
    }
}
