package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.C15032m3;
import com.google.android.play.core.internal.C15714z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.android.play.core.assetpacks.h1 */
public final class C15608h1 {

    /* renamed from: g */
    public static final C15032m3 f35169g = new C15032m3("ExtractorSessionStoreView");

    /* renamed from: a */
    public final C15583b0 f35170a;

    /* renamed from: b */
    public final C15714z f35171b;

    /* renamed from: c */
    public final C15671x0 f35172c;

    /* renamed from: d */
    public final C15714z f35173d;

    /* renamed from: e */
    public final HashMap f35174e = new HashMap();

    /* renamed from: f */
    public final ReentrantLock f35175f = new ReentrantLock();

    public C15608h1(C15583b0 b0Var, C15714z zVar, C15671x0 x0Var, C15714z zVar2) {
        this.f35170a = b0Var;
        this.f35171b = zVar;
        this.f35172c = x0Var;
        this.f35173d = zVar2;
    }

    /* renamed from: e */
    public static String m25395e(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        throw new zzck("Session without pack received.");
    }

    /* renamed from: a */
    public final void mo55409a(int i) {
        C15596e1 c = mo55411c(i);
        C15592d1 d1Var = c.f35123c;
        int i2 = d1Var.f35106d;
        if (i2 == 5 || i2 == 6 || i2 == 4) {
            C15583b0 b0Var = this.f35170a;
            String str = d1Var.f35103a;
            int i3 = c.f35122b;
            long j = d1Var.f35104b;
            if (b0Var.mo55377c(str, i3, j).exists()) {
                C15583b0.m25256g(b0Var.mo55377c(str, i3, j));
            }
            C15592d1 d1Var2 = c.f35123c;
            int i4 = d1Var2.f35106d;
            if (i4 == 5 || i4 == 6) {
                C15583b0 b0Var2 = this.f35170a;
                String str2 = d1Var2.f35103a;
                int i5 = c.f35122b;
                long j2 = d1Var2.f35104b;
                if (b0Var2.mo55382j(str2, i5, j2).exists()) {
                    C15583b0.m25256g(b0Var2.mo55382j(str2, i5, j2));
                    return;
                }
                return;
            }
            return;
        }
        throw new zzck(String.format("Could not safely delete session %d because it is not in a terminal state.", new Object[]{Integer.valueOf(i)}), i);
    }

    /* renamed from: b */
    public final void mo55410b() {
        this.f35175f.unlock();
    }

    /* renamed from: c */
    public final C15596e1 mo55411c(int i) {
        HashMap hashMap = this.f35174e;
        Integer valueOf = Integer.valueOf(i);
        C15596e1 e1Var = (C15596e1) hashMap.get(valueOf);
        if (e1Var != null) {
            return e1Var;
        }
        throw new zzck(String.format("Could not find session %d while trying to get it", new Object[]{valueOf}), i);
    }

    /* renamed from: d */
    public final Object mo55412d(C15604g1 g1Var) {
        try {
            this.f35175f.lock();
            return g1Var.zza();
        } finally {
            this.f35175f.unlock();
        }
    }
}
