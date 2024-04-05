package com.google.android.gms.internal.icing;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.icing.z1 */
public final class C14567z1 extends C14561x1<C14564y1, C14564y1> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo49949a(Object obj, Object obj2) {
        ((C14491e0) obj).zzc = (C14564y1) obj2;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C14564y1 mo49950b(Object obj) {
        return ((C14491e0) obj).zzc;
    }

    /* renamed from: c */
    public final void mo49951c(C14491e0 e0Var) {
    }

    /* renamed from: d */
    public final Object mo49952d(Object obj, Object obj2) {
        C14564y1 y1Var = (C14564y1) obj2;
        if (y1Var.equals(C14564y1.f32724d)) {
            return obj;
        }
        C14564y1 y1Var2 = (C14564y1) obj;
        y1Var2.getClass();
        int[] copyOf = Arrays.copyOf(y1Var2.f32725a, 0);
        System.arraycopy(y1Var.f32725a, 0, copyOf, 0, 0);
        Object[] copyOf2 = Arrays.copyOf(y1Var2.f32726b, 0);
        System.arraycopy(y1Var.f32726b, 0, copyOf2, 0, 0);
        return new C14564y1(copyOf, copyOf2);
    }

    /* renamed from: e */
    public final int mo49953e(Object obj) {
        C14564y1 y1Var = (C14564y1) obj;
        int i = y1Var.f32727c;
        if (i != -1) {
            return i;
        }
        y1Var.f32727c = 0;
        return 0;
    }

    /* renamed from: f */
    public final int mo49954f(Object obj) {
        C14564y1 y1Var = (C14564y1) obj;
        int i = y1Var.f32727c;
        if (i != -1) {
            return i;
        }
        y1Var.f32727c = 0;
        return 0;
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo49955g() throws IOException {
    }
}
