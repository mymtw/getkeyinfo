package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import kotlin.jvm.internal.C19388s;

/* renamed from: com.google.android.gms.internal.measurement.x */
public final class C14861x extends C14849w {
    public C14861x() {
        this.f33140a.add(zzbl.EQUALS);
        this.f33140a.add(zzbl.GREATER_THAN);
        this.f33140a.add(zzbl.GREATER_THAN_EQUALS);
        this.f33140a.add(zzbl.IDENTITY_EQUALS);
        this.f33140a.add(zzbl.IDENTITY_NOT_EQUALS);
        this.f33140a.add(zzbl.LESS_THAN);
        this.f33140a.add(zzbl.LESS_THAN_EQUALS);
        this.f33140a.add(zzbl.NOT_EQUALS);
    }

    /* renamed from: c */
    public static boolean m24107c(C14763p pVar, C14763p pVar2) {
        if (pVar.getClass().equals(pVar2.getClass())) {
            if ((pVar instanceof C14825u) || (pVar instanceof C14737n)) {
                return true;
            }
            return pVar instanceof C14672i ? !Double.isNaN(pVar.zzh().doubleValue()) && !Double.isNaN(pVar2.zzh().doubleValue()) && pVar.zzh().doubleValue() == pVar2.zzh().doubleValue() : pVar instanceof C14813t ? pVar.zzi().equals(pVar2.zzi()) : pVar instanceof C14646g ? pVar.zzg().equals(pVar2.zzg()) : pVar == pVar2;
        } else if (((pVar instanceof C14825u) || (pVar instanceof C14737n)) && ((pVar2 instanceof C14825u) || (pVar2 instanceof C14737n))) {
            return true;
        } else {
            boolean z = pVar instanceof C14672i;
            if (z && (pVar2 instanceof C14813t)) {
                return m24107c(pVar, new C14672i(pVar2.zzh()));
            }
            boolean z2 = pVar instanceof C14813t;
            if (z2 && (pVar2 instanceof C14672i)) {
                return m24107c(new C14672i(pVar.zzh()), pVar2);
            }
            if (pVar instanceof C14646g) {
                return m24107c(new C14672i(pVar.zzh()), pVar2);
            }
            if (pVar2 instanceof C14646g) {
                return m24107c(pVar, new C14672i(pVar2.zzh()));
            }
            if ((z2 || z) && (pVar2 instanceof C14711l)) {
                return m24107c(pVar, new C14813t(pVar2.zzi()));
            }
            if (!(pVar instanceof C14711l) || (!(pVar2 instanceof C14813t) && !(pVar2 instanceof C14672i))) {
                return false;
            }
            return m24107c(new C14813t(pVar.zzi()), pVar2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        r0 = (r3 > com.google.android.material.shadow.ShadowDrawableWrapper.COS_45 ? 1 : (r3 == com.google.android.material.shadow.ShadowDrawableWrapper.COS_45 ? 0 : -1));
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m24108d(com.google.android.gms.internal.measurement.C14763p r8, com.google.android.gms.internal.measurement.C14763p r9) {
        /*
            boolean r0 = r8 instanceof com.google.android.gms.internal.measurement.C14711l
            if (r0 == 0) goto L_0x000e
            com.google.android.gms.internal.measurement.t r0 = new com.google.android.gms.internal.measurement.t
            java.lang.String r8 = r8.zzi()
            r0.<init>(r8)
            r8 = r0
        L_0x000e:
            boolean r0 = r9 instanceof com.google.android.gms.internal.measurement.C14711l
            if (r0 == 0) goto L_0x001c
            com.google.android.gms.internal.measurement.t r0 = new com.google.android.gms.internal.measurement.t
            java.lang.String r9 = r9.zzi()
            r0.<init>(r9)
            r9 = r0
        L_0x001c:
            boolean r0 = r8 instanceof com.google.android.gms.internal.measurement.C14813t
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0037
            boolean r0 = r9 instanceof com.google.android.gms.internal.measurement.C14813t
            if (r0 != 0) goto L_0x0027
            goto L_0x0037
        L_0x0027:
            java.lang.String r8 = r8.zzi()
            java.lang.String r9 = r9.zzi()
            int r8 = r8.compareTo(r9)
            if (r8 >= 0) goto L_0x0036
            return r1
        L_0x0036:
            return r2
        L_0x0037:
            java.lang.Double r8 = r8.zzh()
            double r3 = r8.doubleValue()
            java.lang.Double r8 = r9.zzh()
            double r8 = r8.doubleValue()
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 != 0) goto L_0x006d
            boolean r0 = java.lang.Double.isNaN(r8)
            if (r0 == 0) goto L_0x0054
            goto L_0x006d
        L_0x0054:
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x005e
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0065
        L_0x005e:
            if (r0 != 0) goto L_0x0066
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            return r2
        L_0x0066:
            int r8 = java.lang.Double.compare(r3, r8)
            if (r8 >= 0) goto L_0x006d
            return r1
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C14861x.m24108d(com.google.android.gms.internal.measurement.p, com.google.android.gms.internal.measurement.p):boolean");
    }

    /* renamed from: e */
    public static boolean m24109e(C14763p pVar, C14763p pVar2) {
        if (pVar instanceof C14711l) {
            pVar = new C14813t(pVar.zzi());
        }
        if (pVar2 instanceof C14711l) {
            pVar2 = new C14813t(pVar2.zzi());
        }
        return (((pVar instanceof C14813t) && (pVar2 instanceof C14813t)) || (!Double.isNaN(pVar.zzh().doubleValue()) && !Double.isNaN(pVar2.zzh().doubleValue()))) && !m24108d(pVar2, pVar);
    }

    /* renamed from: a */
    public final C14763p mo50377a(String str, C14598c3 c3Var, ArrayList arrayList) {
        boolean z;
        boolean z2;
        C19388s.m32840P0(C19388s.m32834M0(str).name(), arrayList, 2);
        C14763p c = c3Var.mo50400c((C14763p) arrayList.get(0));
        C14763p c2 = c3Var.mo50400c((C14763p) arrayList.get(1));
        int ordinal = C19388s.m32834M0(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                z2 = m24107c(c, c2);
            } else if (ordinal == 42) {
                z = m24108d(c, c2);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        z = m24108d(c2, c);
                        break;
                    case 38:
                        z = m24109e(c2, c);
                        break;
                    case 39:
                        z = C19388s.m32848T0(c, c2);
                        break;
                    case 40:
                        z2 = C19388s.m32848T0(c, c2);
                        break;
                    default:
                        mo50946b(str);
                        throw null;
                }
            } else {
                z = m24109e(c, c2);
            }
            z = !z2;
        } else {
            z = m24107c(c, c2);
        }
        return z ? C14763p.f33038m0 : C14763p.f33039n0;
    }
}
