package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C14863x1;

/* renamed from: com.google.android.gms.measurement.internal.r7 */
public final class C15081r7 extends C15072q7 {

    /* renamed from: g */
    public final C14863x1 f33815g;

    /* renamed from: h */
    public final /* synthetic */ C15090s7 f33816h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15081r7(C15090s7 s7Var, String str, int i, C14863x1 x1Var) {
        super(str, i);
        this.f33816h = s7Var;
        this.f33815g = x1Var;
    }

    /* renamed from: a */
    public final int mo52287a() {
        return this.f33815g.mo50963r();
    }

    /* renamed from: b */
    public final boolean mo52288b() {
        return false;
    }

    /* renamed from: c */
    public final boolean mo52289c() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v21, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo52302g(java.lang.Long r15, java.lang.Long r16, com.google.android.gms.internal.measurement.C14702k3 r17, boolean r18) {
        /*
            r14 = this;
            r0 = r14
            com.google.android.gms.internal.measurement.C14656g9.m23603a()
            com.google.android.gms.measurement.internal.s7 r1 = r0.f33816h
            com.google.android.gms.measurement.internal.o4 r1 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.d r1 = r1.f33878h
            java.lang.String r2 = r0.f33786a
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C14959e2.f33389W
            boolean r1 = r1.mo51973p(r2, r3)
            com.google.android.gms.internal.measurement.x1 r2 = r0.f33815g
            boolean r2 = r2.mo50966x()
            com.google.android.gms.internal.measurement.x1 r3 = r0.f33815g
            boolean r3 = r3.mo50967y()
            com.google.android.gms.internal.measurement.x1 r4 = r0.f33815g
            boolean r4 = r4.mo50968z()
            r5 = 0
            r6 = 1
            if (r2 != 0) goto L_0x0031
            if (r3 != 0) goto L_0x0031
            if (r4 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r2 = r5
            goto L_0x0032
        L_0x0031:
            r2 = r6
        L_0x0032:
            r3 = 0
            if (r18 == 0) goto L_0x0061
            if (r2 != 0) goto L_0x0061
            com.google.android.gms.measurement.internal.s7 r1 = r0.f33816h
            com.google.android.gms.measurement.internal.o4 r1 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.o2 r1 = r1.mo52016b()
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33732o
            int r2 = r0.f33787b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.gms.internal.measurement.x1 r4 = r0.f33815g
            boolean r4 = r4.mo50961A()
            if (r4 == 0) goto L_0x005b
            com.google.android.gms.internal.measurement.x1 r3 = r0.f33815g
            int r3 = r3.mo50963r()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x005b:
            java.lang.String r4 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.mo52239c(r2, r4, r3)
            return r6
        L_0x0061:
            com.google.android.gms.internal.measurement.x1 r7 = r0.f33815g
            com.google.android.gms.internal.measurement.s1 r7 = r7.mo50964s()
            boolean r8 = r7.mo50839x()
            boolean r9 = r17.mo50623H()
            r10 = 0
            if (r9 == 0) goto L_0x00b3
            boolean r9 = r7.mo50841z()
            if (r9 != 0) goto L_0x009c
            com.google.android.gms.measurement.internal.s7 r7 = r0.f33816h
            com.google.android.gms.measurement.internal.o4 r7 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7
            com.google.android.gms.measurement.internal.o2 r7 = r7.mo52016b()
            com.google.android.gms.measurement.internal.m2 r7 = r7.f33727j
            com.google.android.gms.measurement.internal.s7 r8 = r0.f33816h
            com.google.android.gms.measurement.internal.o4 r8 = r8.f33681b
            com.google.android.gms.measurement.internal.u3 r8 = (com.google.android.gms.measurement.internal.C15103u3) r8
            com.google.android.gms.measurement.internal.j2 r8 = r8.f33884n
            java.lang.String r9 = r17.mo50629w()
            java.lang.String r8 = r8.mo52144f(r9)
            java.lang.String r9 = "No number filter for long property. property"
            r7.mo52238b(r8, r9)
            goto L_0x01bb
        L_0x009c:
            long r12 = r17.mo50627s()
            com.google.android.gms.internal.measurement.v1 r7 = r7.mo50836t()
            java.math.BigDecimal r9 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x00ad }
            r9.<init>(r12)     // Catch:{ NumberFormatException -> 0x00ad }
            java.lang.Boolean r3 = com.google.android.gms.measurement.internal.C15072q7.m24604d(r9, r7, r10)     // Catch:{ NumberFormatException -> 0x00ad }
        L_0x00ad:
            java.lang.Boolean r3 = com.google.android.gms.measurement.internal.C15072q7.m24606f(r3, r8)
            goto L_0x01bb
        L_0x00b3:
            boolean r9 = r17.mo50622G()
            if (r9 == 0) goto L_0x00fd
            boolean r9 = r7.mo50841z()
            if (r9 != 0) goto L_0x00e2
            com.google.android.gms.measurement.internal.s7 r7 = r0.f33816h
            com.google.android.gms.measurement.internal.o4 r7 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7
            com.google.android.gms.measurement.internal.o2 r7 = r7.mo52016b()
            com.google.android.gms.measurement.internal.m2 r7 = r7.f33727j
            com.google.android.gms.measurement.internal.s7 r8 = r0.f33816h
            com.google.android.gms.measurement.internal.o4 r8 = r8.f33681b
            com.google.android.gms.measurement.internal.u3 r8 = (com.google.android.gms.measurement.internal.C15103u3) r8
            com.google.android.gms.measurement.internal.j2 r8 = r8.f33884n
            java.lang.String r9 = r17.mo50629w()
            java.lang.String r8 = r8.mo52144f(r9)
            java.lang.String r9 = "No number filter for double property. property"
            r7.mo52238b(r8, r9)
            goto L_0x01bb
        L_0x00e2:
            double r9 = r17.mo50626r()
            com.google.android.gms.internal.measurement.v1 r7 = r7.mo50836t()
            java.math.BigDecimal r11 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x00f7 }
            r11.<init>(r9)     // Catch:{ NumberFormatException -> 0x00f7 }
            double r9 = java.lang.Math.ulp(r9)     // Catch:{ NumberFormatException -> 0x00f7 }
            java.lang.Boolean r3 = com.google.android.gms.measurement.internal.C15072q7.m24604d(r11, r7, r9)     // Catch:{ NumberFormatException -> 0x00f7 }
        L_0x00f7:
            java.lang.Boolean r3 = com.google.android.gms.measurement.internal.C15072q7.m24606f(r3, r8)
            goto L_0x01bb
        L_0x00fd:
            boolean r9 = r17.mo50625J()
            if (r9 == 0) goto L_0x019a
            boolean r9 = r7.mo50835B()
            if (r9 != 0) goto L_0x017f
            boolean r9 = r7.mo50841z()
            if (r9 != 0) goto L_0x0132
            com.google.android.gms.measurement.internal.s7 r7 = r0.f33816h
            com.google.android.gms.measurement.internal.o4 r7 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7
            com.google.android.gms.measurement.internal.o2 r7 = r7.mo52016b()
            com.google.android.gms.measurement.internal.m2 r7 = r7.f33727j
            com.google.android.gms.measurement.internal.s7 r8 = r0.f33816h
            com.google.android.gms.measurement.internal.o4 r8 = r8.f33681b
            com.google.android.gms.measurement.internal.u3 r8 = (com.google.android.gms.measurement.internal.C15103u3) r8
            com.google.android.gms.measurement.internal.j2 r8 = r8.f33884n
            java.lang.String r9 = r17.mo50629w()
            java.lang.String r8 = r8.mo52144f(r9)
            java.lang.String r9 = "No string or number filter defined. property"
            r7.mo52238b(r8, r9)
            goto L_0x01bb
        L_0x0132:
            java.lang.String r9 = r17.mo50630x()
            boolean r9 = com.google.android.gms.measurement.internal.C14991h7.m24379J(r9)
            if (r9 == 0) goto L_0x0159
            java.lang.String r9 = r17.mo50630x()
            com.google.android.gms.internal.measurement.v1 r7 = r7.mo50836t()
            boolean r12 = com.google.android.gms.measurement.internal.C14991h7.m24379J(r9)
            if (r12 != 0) goto L_0x014b
            goto L_0x0154
        L_0x014b:
            java.math.BigDecimal r12 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0154 }
            r12.<init>(r9)     // Catch:{ NumberFormatException -> 0x0154 }
            java.lang.Boolean r3 = com.google.android.gms.measurement.internal.C15072q7.m24604d(r12, r7, r10)     // Catch:{ NumberFormatException -> 0x0154 }
        L_0x0154:
            java.lang.Boolean r3 = com.google.android.gms.measurement.internal.C15072q7.m24606f(r3, r8)
            goto L_0x01bb
        L_0x0159:
            com.google.android.gms.measurement.internal.s7 r7 = r0.f33816h
            com.google.android.gms.measurement.internal.o4 r7 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7
            com.google.android.gms.measurement.internal.o2 r7 = r7.mo52016b()
            com.google.android.gms.measurement.internal.m2 r7 = r7.f33727j
            com.google.android.gms.measurement.internal.s7 r8 = r0.f33816h
            com.google.android.gms.measurement.internal.o4 r8 = r8.f33681b
            com.google.android.gms.measurement.internal.u3 r8 = (com.google.android.gms.measurement.internal.C15103u3) r8
            com.google.android.gms.measurement.internal.j2 r8 = r8.f33884n
            java.lang.String r9 = r17.mo50629w()
            java.lang.String r8 = r8.mo52144f(r9)
            java.lang.String r9 = r17.mo50630x()
            java.lang.String r10 = "Invalid user property value for Numeric number filter. property, value"
            r7.mo52239c(r8, r10, r9)
            goto L_0x01bb
        L_0x017f:
            java.lang.String r3 = r17.mo50630x()
            com.google.android.gms.internal.measurement.a2 r7 = r7.mo50837u()
            com.google.android.gms.measurement.internal.s7 r9 = r0.f33816h
            com.google.android.gms.measurement.internal.o4 r9 = r9.f33681b
            com.google.android.gms.measurement.internal.u3 r9 = (com.google.android.gms.measurement.internal.C15103u3) r9
            com.google.android.gms.measurement.internal.o2 r9 = r9.mo52016b()
            java.lang.Boolean r3 = com.google.android.gms.measurement.internal.C15072q7.m24605e(r3, r7, r9)
            java.lang.Boolean r3 = com.google.android.gms.measurement.internal.C15072q7.m24606f(r3, r8)
            goto L_0x01bb
        L_0x019a:
            com.google.android.gms.measurement.internal.s7 r7 = r0.f33816h
            com.google.android.gms.measurement.internal.o4 r7 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7
            com.google.android.gms.measurement.internal.o2 r7 = r7.mo52016b()
            com.google.android.gms.measurement.internal.m2 r7 = r7.f33727j
            com.google.android.gms.measurement.internal.s7 r8 = r0.f33816h
            com.google.android.gms.measurement.internal.o4 r8 = r8.f33681b
            com.google.android.gms.measurement.internal.u3 r8 = (com.google.android.gms.measurement.internal.C15103u3) r8
            com.google.android.gms.measurement.internal.j2 r8 = r8.f33884n
            java.lang.String r9 = r17.mo50629w()
            java.lang.String r8 = r8.mo52144f(r9)
            java.lang.String r9 = "User property has no value, property"
            r7.mo52238b(r8, r9)
        L_0x01bb:
            com.google.android.gms.measurement.internal.s7 r7 = r0.f33816h
            com.google.android.gms.measurement.internal.o4 r7 = r7.f33681b
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7
            com.google.android.gms.measurement.internal.o2 r7 = r7.mo52016b()
            com.google.android.gms.measurement.internal.m2 r7 = r7.f33732o
            if (r3 != 0) goto L_0x01cc
            java.lang.String r8 = "null"
            goto L_0x01cd
        L_0x01cc:
            r8 = r3
        L_0x01cd:
            java.lang.String r9 = "Property filter result"
            r7.mo52238b(r8, r9)
            if (r3 != 0) goto L_0x01d5
            return r5
        L_0x01d5:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r0.f33788c = r5
            if (r4 == 0) goto L_0x01e3
            boolean r4 = r3.booleanValue()
            if (r4 == 0) goto L_0x01e2
            goto L_0x01e3
        L_0x01e2:
            return r6
        L_0x01e3:
            if (r18 == 0) goto L_0x01ed
            com.google.android.gms.internal.measurement.x1 r4 = r0.f33815g
            boolean r4 = r4.mo50966x()
            if (r4 == 0) goto L_0x01ef
        L_0x01ed:
            r0.f33789d = r3
        L_0x01ef:
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0234
            if (r2 == 0) goto L_0x0234
            boolean r2 = r17.mo50624I()
            if (r2 == 0) goto L_0x0234
            long r2 = r17.mo50628t()
            if (r15 == 0) goto L_0x0207
            long r2 = r15.longValue()
        L_0x0207:
            if (r1 == 0) goto L_0x021f
            com.google.android.gms.internal.measurement.x1 r1 = r0.f33815g
            boolean r1 = r1.mo50966x()
            if (r1 == 0) goto L_0x021f
            com.google.android.gms.internal.measurement.x1 r1 = r0.f33815g
            boolean r1 = r1.mo50967y()
            if (r1 != 0) goto L_0x021f
            if (r16 == 0) goto L_0x021f
            long r2 = r16.longValue()
        L_0x021f:
            com.google.android.gms.internal.measurement.x1 r1 = r0.f33815g
            boolean r1 = r1.mo50967y()
            if (r1 == 0) goto L_0x022e
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r0.f33791f = r1
            goto L_0x0234
        L_0x022e:
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r0.f33790e = r1
        L_0x0234:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C15081r7.mo52302g(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.k3, boolean):boolean");
    }
}
