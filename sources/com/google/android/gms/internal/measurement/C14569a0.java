package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;
import kotlin.jvm.internal.C19388s;

/* renamed from: com.google.android.gms.internal.measurement.a0 */
public final class C14569a0 implements Comparator<C14763p> {

    /* renamed from: b */
    public final /* synthetic */ C14685j f32732b;

    /* renamed from: c */
    public final /* synthetic */ C14598c3 f32733c;

    public C14569a0(C14685j jVar, C14598c3 c3Var) {
        this.f32732b = jVar;
        this.f32733c = c3Var;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C14763p pVar = (C14763p) obj;
        C14763p pVar2 = (C14763p) obj2;
        C14685j jVar = this.f32732b;
        C14598c3 c3Var = this.f32733c;
        if (pVar instanceof C14825u) {
            return !(pVar2 instanceof C14825u) ? 1 : 0;
        }
        if (pVar2 instanceof C14825u) {
            return -1;
        }
        if (jVar == null) {
            return pVar.zzi().compareTo(pVar2.zzi());
        }
        return (int) C19388s.m32826I0(jVar.mo50553b(c3Var, Arrays.asList(new C14763p[]{pVar, pVar2})).zzh().doubleValue());
    }
}
