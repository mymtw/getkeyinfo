package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C14778q1;

/* renamed from: com.google.android.gms.measurement.internal.p7 */
public final class C15063p7 extends C15072q7 {

    /* renamed from: g */
    public final C14778q1 f33757g;

    /* renamed from: h */
    public final /* synthetic */ C15090s7 f33758h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15063p7(C15090s7 s7Var, String str, int i, C14778q1 q1Var) {
        super(str, i);
        this.f33758h = s7Var;
        this.f33757g = q1Var;
    }

    /* renamed from: a */
    public final int mo52287a() {
        return this.f33757g.mo50786s();
    }

    /* renamed from: b */
    public final boolean mo52288b() {
        return this.f33757g.mo50782E();
    }

    /* renamed from: c */
    public final boolean mo52289c() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:157:0x04ab  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x04b3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x04b4  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo52290g(java.lang.Long r19, java.lang.Long r20, com.google.android.gms.internal.measurement.C14779q2 r21, long r22, com.google.android.gms.measurement.internal.C15037n r24, boolean r25) {
        /*
            r18 = this;
            r0 = r18
            com.google.android.gms.internal.measurement.C14656g9.m23603a()
            com.google.android.gms.measurement.internal.s7 r1 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r1 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.d r1 = r1.f33878h
            java.lang.String r2 = r0.f33786a
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C14959e2.f33391Y
            boolean r1 = r1.mo51973p(r2, r3)
            com.google.android.gms.internal.measurement.q1 r2 = r0.f33757g
            boolean r2 = r2.mo50781D()
            if (r2 == 0) goto L_0x0022
            r2 = r24
            long r2 = r2.f33690e
            goto L_0x0024
        L_0x0022:
            r2 = r22
        L_0x0024:
            com.google.android.gms.measurement.internal.s7 r4 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r4 = r4.f33681b
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4
            com.google.android.gms.measurement.internal.o2 r4 = r4.mo52016b()
            java.lang.String r4 = r4.mo52279s()
            r5 = 2
            boolean r4 = android.util.Log.isLoggable(r4, r5)
            java.lang.String r6 = "null"
            r7 = 0
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L_0x0121
            com.google.android.gms.measurement.internal.s7 r4 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r4 = r4.f33681b
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4
            com.google.android.gms.measurement.internal.o2 r4 = r4.mo52016b()
            com.google.android.gms.measurement.internal.m2 r4 = r4.f33732o
            int r10 = r0.f33787b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            com.google.android.gms.internal.measurement.q1 r11 = r0.f33757g
            boolean r11 = r11.mo50783F()
            if (r11 == 0) goto L_0x0063
            com.google.android.gms.internal.measurement.q1 r11 = r0.f33757g
            int r11 = r11.mo50786s()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x0064
        L_0x0063:
            r11 = r9
        L_0x0064:
            com.google.android.gms.measurement.internal.s7 r12 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r12 = r12.f33681b
            com.google.android.gms.measurement.internal.u3 r12 = (com.google.android.gms.measurement.internal.C15103u3) r12
            com.google.android.gms.measurement.internal.j2 r12 = r12.f33884n
            com.google.android.gms.internal.measurement.q1 r13 = r0.f33757g
            java.lang.String r13 = r13.mo50789x()
            java.lang.String r12 = r12.mo52142d(r13)
            java.lang.String r13 = "Evaluating filter. audience, filter, event"
            r4.mo52240d(r10, r11, r12, r13)
            com.google.android.gms.measurement.internal.s7 r4 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r4 = r4.f33681b
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4
            com.google.android.gms.measurement.internal.o2 r4 = r4.mo52016b()
            com.google.android.gms.measurement.internal.m2 r4 = r4.f33732o
            com.google.android.gms.measurement.internal.s7 r10 = r0.f33758h
            com.google.android.gms.measurement.internal.f7 r10 = r10.f34048c
            com.google.android.gms.measurement.internal.h7 r10 = r10.f33492h
            com.google.android.gms.measurement.internal.C14973f7.m24287I(r10)
            com.google.android.gms.internal.measurement.q1 r11 = r0.f33757g
            if (r11 != 0) goto L_0x0097
            r5 = r6
            goto L_0x011c
        L_0x0097:
            java.lang.String r12 = "\nevent_filter {\n"
            java.lang.StringBuilder r12 = android.support.p013v4.media.C0072d.m201h(r12)
            boolean r13 = r11.mo50783F()
            if (r13 == 0) goto L_0x00b0
            int r13 = r11.mo50786s()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r14 = "filter_id"
            com.google.android.gms.measurement.internal.C14991h7.m24386s(r12, r7, r14, r13)
        L_0x00b0:
            com.google.android.gms.measurement.internal.o4 r13 = r10.f33681b
            com.google.android.gms.measurement.internal.u3 r13 = (com.google.android.gms.measurement.internal.C15103u3) r13
            com.google.android.gms.measurement.internal.j2 r13 = r13.f33884n
            java.lang.String r14 = r11.mo50789x()
            java.lang.String r13 = r13.mo52142d(r14)
            java.lang.String r14 = "event_name"
            com.google.android.gms.measurement.internal.C14991h7.m24386s(r12, r7, r14, r13)
            boolean r13 = r11.mo50779B()
            boolean r14 = r11.mo50780C()
            boolean r15 = r11.mo50781D()
            java.lang.String r13 = com.google.android.gms.measurement.internal.C14991h7.m24384q(r13, r14, r15)
            boolean r14 = r13.isEmpty()
            if (r14 != 0) goto L_0x00de
            java.lang.String r14 = "filter_type"
            com.google.android.gms.measurement.internal.C14991h7.m24386s(r12, r7, r14, r13)
        L_0x00de:
            boolean r13 = r11.mo50782E()
            if (r13 == 0) goto L_0x00ed
            com.google.android.gms.internal.measurement.v1 r13 = r11.mo50788w()
            java.lang.String r14 = "event_count_filter"
            com.google.android.gms.measurement.internal.C14991h7.m24387t(r12, r8, r14, r13)
        L_0x00ed:
            int r13 = r11.mo50785r()
            if (r13 <= 0) goto L_0x0110
            java.lang.String r13 = "  filters {\n"
            r12.append(r13)
            com.google.android.gms.internal.measurement.z5 r11 = r11.mo50790y()
            java.util.Iterator r11 = r11.iterator()
        L_0x0100:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x0110
            java.lang.Object r13 = r11.next()
            com.google.android.gms.internal.measurement.s1 r13 = (com.google.android.gms.internal.measurement.C14803s1) r13
            r10.mo52113o(r12, r5, r13)
            goto L_0x0100
        L_0x0110:
            com.google.android.gms.measurement.internal.C14991h7.m24383p(r12, r8)
            java.lang.String r5 = "}\n}\n"
            r12.append(r5)
            java.lang.String r5 = r12.toString()
        L_0x011c:
            java.lang.String r10 = "Filter definition"
            r4.mo52238b(r5, r10)
        L_0x0121:
            com.google.android.gms.internal.measurement.q1 r4 = r0.f33757g
            boolean r4 = r4.mo50783F()
            if (r4 == 0) goto L_0x04f8
            com.google.android.gms.internal.measurement.q1 r4 = r0.f33757g
            int r4 = r4.mo50786s()
            r5 = 256(0x100, float:3.59E-43)
            if (r4 <= r5) goto L_0x0135
            goto L_0x04f8
        L_0x0135:
            com.google.android.gms.internal.measurement.q1 r4 = r0.f33757g
            boolean r4 = r4.mo50779B()
            com.google.android.gms.internal.measurement.q1 r5 = r0.f33757g
            boolean r5 = r5.mo50780C()
            com.google.android.gms.internal.measurement.q1 r10 = r0.f33757g
            boolean r10 = r10.mo50781D()
            if (r4 != 0) goto L_0x0150
            if (r5 != 0) goto L_0x0150
            if (r10 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r4 = r7
            goto L_0x0151
        L_0x0150:
            r4 = r8
        L_0x0151:
            if (r25 == 0) goto L_0x017f
            if (r4 != 0) goto L_0x017f
            com.google.android.gms.measurement.internal.s7 r1 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r1 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.o2 r1 = r1.mo52016b()
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33732o
            int r2 = r0.f33787b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.gms.internal.measurement.q1 r3 = r0.f33757g
            boolean r3 = r3.mo50783F()
            if (r3 == 0) goto L_0x0179
            com.google.android.gms.internal.measurement.q1 r3 = r0.f33757g
            int r3 = r3.mo50786s()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
        L_0x0179:
            java.lang.String r3 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.mo52239c(r2, r3, r9)
            return r8
        L_0x017f:
            com.google.android.gms.internal.measurement.q1 r5 = r0.f33757g
            java.lang.String r10 = r21.mo50800y()
            boolean r11 = r5.mo50782E()
            r12 = 0
            if (r11 == 0) goto L_0x01aa
            com.google.android.gms.internal.measurement.v1 r11 = r5.mo50788w()
            java.math.BigDecimal r14 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x019b }
            r14.<init>(r2)     // Catch:{ NumberFormatException -> 0x019b }
            java.lang.Boolean r2 = com.google.android.gms.measurement.internal.C15072q7.m24604d(r14, r11, r12)     // Catch:{ NumberFormatException -> 0x019b }
            goto L_0x019c
        L_0x019b:
            r2 = r9
        L_0x019c:
            if (r2 != 0) goto L_0x01a0
            goto L_0x0498
        L_0x01a0:
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x01aa
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L_0x049c
        L_0x01aa:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            com.google.android.gms.internal.measurement.z5 r3 = r5.mo50790y()
            java.util.Iterator r3 = r3.iterator()
        L_0x01b7:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x01f4
            java.lang.Object r11 = r3.next()
            com.google.android.gms.internal.measurement.s1 r11 = (com.google.android.gms.internal.measurement.C14803s1) r11
            java.lang.String r14 = r11.mo50838v()
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L_0x01ec
            com.google.android.gms.measurement.internal.s7 r2 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r2 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33727j
            com.google.android.gms.measurement.internal.s7 r3 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r3 = r3.f33681b
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3
            com.google.android.gms.measurement.internal.j2 r3 = r3.f33884n
            java.lang.String r3 = r3.mo52142d(r10)
            java.lang.String r5 = "null or empty param name in filter. event"
            r2.mo52238b(r3, r5)
            goto L_0x0498
        L_0x01ec:
            java.lang.String r11 = r11.mo50838v()
            r2.add(r11)
            goto L_0x01b7
        L_0x01f4:
            o.b r3 = new o.b
            r3.<init>()
            com.google.android.gms.internal.measurement.z5 r11 = r21.mo50801z()
            java.util.Iterator r11 = r11.iterator()
        L_0x0201:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L_0x0294
            java.lang.Object r14 = r11.next()
            com.google.android.gms.internal.measurement.u2 r14 = (com.google.android.gms.internal.measurement.C14828u2) r14
            java.lang.String r15 = r14.mo50887x()
            boolean r15 = r2.contains(r15)
            if (r15 == 0) goto L_0x0201
            boolean r15 = r14.mo50880M()
            if (r15 == 0) goto L_0x0235
            java.lang.String r15 = r14.mo50887x()
            boolean r16 = r14.mo50880M()
            if (r16 == 0) goto L_0x0230
            long r16 = r14.mo50886u()
            java.lang.Long r14 = java.lang.Long.valueOf(r16)
            goto L_0x0231
        L_0x0230:
            r14 = r9
        L_0x0231:
            r3.put(r15, r14)
            goto L_0x0201
        L_0x0235:
            boolean r15 = r14.mo50878K()
            if (r15 == 0) goto L_0x0253
            java.lang.String r15 = r14.mo50887x()
            boolean r16 = r14.mo50878K()
            if (r16 == 0) goto L_0x024e
            double r16 = r14.mo50883r()
            java.lang.Double r14 = java.lang.Double.valueOf(r16)
            goto L_0x024f
        L_0x024e:
            r14 = r9
        L_0x024f:
            r3.put(r15, r14)
            goto L_0x0201
        L_0x0253:
            boolean r15 = r14.mo50882O()
            if (r15 == 0) goto L_0x0265
            java.lang.String r15 = r14.mo50887x()
            java.lang.String r14 = r14.mo50888y()
            r3.put(r15, r14)
            goto L_0x0201
        L_0x0265:
            com.google.android.gms.measurement.internal.s7 r2 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r2 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33727j
            com.google.android.gms.measurement.internal.s7 r3 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r3 = r3.f33681b
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3
            com.google.android.gms.measurement.internal.j2 r3 = r3.f33884n
            java.lang.String r3 = r3.mo52142d(r10)
            com.google.android.gms.measurement.internal.s7 r5 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r5 = r5.f33681b
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5
            com.google.android.gms.measurement.internal.j2 r5 = r5.f33884n
            java.lang.String r9 = r14.mo50887x()
            java.lang.String r5 = r5.mo52143e(r9)
            java.lang.String r9 = "Unknown value for param. event, param"
            r2.mo52239c(r3, r9, r5)
            goto L_0x0498
        L_0x0294:
            com.google.android.gms.internal.measurement.z5 r2 = r5.mo50790y()
            java.util.Iterator r2 = r2.iterator()
        L_0x029c:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x049a
            java.lang.Object r5 = r2.next()
            com.google.android.gms.internal.measurement.s1 r5 = (com.google.android.gms.internal.measurement.C14803s1) r5
            boolean r11 = r5.mo50840y()
            if (r11 == 0) goto L_0x02b6
            boolean r11 = r5.mo50839x()
            if (r11 == 0) goto L_0x02b6
            r11 = r8
            goto L_0x02b7
        L_0x02b6:
            r11 = r7
        L_0x02b7:
            java.lang.String r14 = r5.mo50838v()
            boolean r15 = r14.isEmpty()
            if (r15 == 0) goto L_0x02e0
            com.google.android.gms.measurement.internal.s7 r2 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r2 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33727j
            com.google.android.gms.measurement.internal.s7 r3 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r3 = r3.f33681b
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3
            com.google.android.gms.measurement.internal.j2 r3 = r3.f33884n
            java.lang.String r3 = r3.mo52142d(r10)
            java.lang.String r5 = "Event has empty param name. event"
            r2.mo52238b(r3, r5)
            goto L_0x0498
        L_0x02e0:
            java.lang.Object r9 = r3.getOrDefault(r14, r9)
            boolean r15 = r9 instanceof java.lang.Long
            if (r15 == 0) goto L_0x033c
            boolean r15 = r5.mo50841z()
            if (r15 != 0) goto L_0x0319
            com.google.android.gms.measurement.internal.s7 r2 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r2 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33727j
            com.google.android.gms.measurement.internal.s7 r3 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r3 = r3.f33681b
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3
            com.google.android.gms.measurement.internal.j2 r3 = r3.f33884n
            java.lang.String r3 = r3.mo52142d(r10)
            com.google.android.gms.measurement.internal.s7 r5 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r5 = r5.f33681b
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5
            com.google.android.gms.measurement.internal.j2 r5 = r5.f33884n
            java.lang.String r5 = r5.mo52143e(r14)
            java.lang.String r9 = "No number filter for long param. event, param"
            r2.mo52239c(r3, r9, r5)
            goto L_0x0498
        L_0x0319:
            java.lang.Long r9 = (java.lang.Long) r9
            long r14 = r9.longValue()
            com.google.android.gms.internal.measurement.v1 r5 = r5.mo50836t()
            java.math.BigDecimal r9 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x032d }
            r9.<init>(r14)     // Catch:{ NumberFormatException -> 0x032d }
            java.lang.Boolean r5 = com.google.android.gms.measurement.internal.C15072q7.m24604d(r9, r5, r12)     // Catch:{ NumberFormatException -> 0x032d }
            goto L_0x032e
        L_0x032d:
            r5 = 0
        L_0x032e:
            if (r5 != 0) goto L_0x0332
            goto L_0x0498
        L_0x0332:
            boolean r5 = r5.booleanValue()
            if (r5 != r11) goto L_0x03e9
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L_0x049c
        L_0x033c:
            boolean r15 = r9 instanceof java.lang.Double
            if (r15 == 0) goto L_0x0398
            boolean r15 = r5.mo50841z()
            if (r15 != 0) goto L_0x0371
            com.google.android.gms.measurement.internal.s7 r2 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r2 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33727j
            com.google.android.gms.measurement.internal.s7 r3 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r3 = r3.f33681b
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3
            com.google.android.gms.measurement.internal.j2 r3 = r3.f33884n
            java.lang.String r3 = r3.mo52142d(r10)
            com.google.android.gms.measurement.internal.s7 r5 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r5 = r5.f33681b
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5
            com.google.android.gms.measurement.internal.j2 r5 = r5.f33884n
            java.lang.String r5 = r5.mo52143e(r14)
            java.lang.String r9 = "No number filter for double param. event, param"
            r2.mo52239c(r3, r9, r5)
            goto L_0x0498
        L_0x0371:
            java.lang.Double r9 = (java.lang.Double) r9
            double r14 = r9.doubleValue()
            com.google.android.gms.internal.measurement.v1 r5 = r5.mo50836t()
            java.math.BigDecimal r9 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0389 }
            r9.<init>(r14)     // Catch:{ NumberFormatException -> 0x0389 }
            double r14 = java.lang.Math.ulp(r14)     // Catch:{ NumberFormatException -> 0x0389 }
            java.lang.Boolean r5 = com.google.android.gms.measurement.internal.C15072q7.m24604d(r9, r5, r14)     // Catch:{ NumberFormatException -> 0x0389 }
            goto L_0x038a
        L_0x0389:
            r5 = 0
        L_0x038a:
            if (r5 != 0) goto L_0x038e
            goto L_0x0498
        L_0x038e:
            boolean r5 = r5.booleanValue()
            if (r5 != r11) goto L_0x03e9
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L_0x049c
        L_0x0398:
            boolean r15 = r9 instanceof java.lang.String
            if (r15 == 0) goto L_0x0441
            boolean r15 = r5.mo50835B()
            if (r15 == 0) goto L_0x03b7
            java.lang.String r9 = (java.lang.String) r9
            com.google.android.gms.internal.measurement.a2 r5 = r5.mo50837u()
            com.google.android.gms.measurement.internal.s7 r14 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r14 = r14.f33681b
            com.google.android.gms.measurement.internal.u3 r14 = (com.google.android.gms.measurement.internal.C15103u3) r14
            com.google.android.gms.measurement.internal.o2 r14 = r14.mo52016b()
            java.lang.Boolean r5 = com.google.android.gms.measurement.internal.C15072q7.m24605e(r9, r5, r14)
            goto L_0x03db
        L_0x03b7:
            boolean r15 = r5.mo50841z()
            if (r15 == 0) goto L_0x0417
            java.lang.String r9 = (java.lang.String) r9
            boolean r15 = com.google.android.gms.measurement.internal.C14991h7.m24379J(r9)
            if (r15 == 0) goto L_0x03ec
            com.google.android.gms.internal.measurement.v1 r5 = r5.mo50836t()
            boolean r14 = com.google.android.gms.measurement.internal.C14991h7.m24379J(r9)
            if (r14 != 0) goto L_0x03d0
            goto L_0x03da
        L_0x03d0:
            java.math.BigDecimal r14 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x03da }
            r14.<init>(r9)     // Catch:{ NumberFormatException -> 0x03da }
            java.lang.Boolean r5 = com.google.android.gms.measurement.internal.C15072q7.m24604d(r14, r5, r12)     // Catch:{ NumberFormatException -> 0x03da }
            goto L_0x03db
        L_0x03da:
            r5 = 0
        L_0x03db:
            if (r5 != 0) goto L_0x03df
            goto L_0x0498
        L_0x03df:
            boolean r5 = r5.booleanValue()
            if (r5 != r11) goto L_0x03e9
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L_0x049c
        L_0x03e9:
            r9 = 0
            goto L_0x029c
        L_0x03ec:
            com.google.android.gms.measurement.internal.s7 r2 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r2 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33727j
            com.google.android.gms.measurement.internal.s7 r3 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r3 = r3.f33681b
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3
            com.google.android.gms.measurement.internal.j2 r3 = r3.f33884n
            java.lang.String r3 = r3.mo52142d(r10)
            com.google.android.gms.measurement.internal.s7 r5 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r5 = r5.f33681b
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5
            com.google.android.gms.measurement.internal.j2 r5 = r5.f33884n
            java.lang.String r5 = r5.mo52143e(r14)
            java.lang.String r9 = "Invalid param value for number filter. event, param"
            r2.mo52239c(r3, r9, r5)
            goto L_0x0498
        L_0x0417:
            com.google.android.gms.measurement.internal.s7 r2 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r2 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33727j
            com.google.android.gms.measurement.internal.s7 r3 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r3 = r3.f33681b
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3
            com.google.android.gms.measurement.internal.j2 r3 = r3.f33884n
            java.lang.String r3 = r3.mo52142d(r10)
            com.google.android.gms.measurement.internal.s7 r5 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r5 = r5.f33681b
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5
            com.google.android.gms.measurement.internal.j2 r5 = r5.f33884n
            java.lang.String r5 = r5.mo52143e(r14)
            java.lang.String r9 = "No filter for String param. event, param"
            r2.mo52239c(r3, r9, r5)
            goto L_0x0498
        L_0x0441:
            if (r9 != 0) goto L_0x046f
            com.google.android.gms.measurement.internal.s7 r2 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r2 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33732o
            com.google.android.gms.measurement.internal.s7 r3 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r3 = r3.f33681b
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3
            com.google.android.gms.measurement.internal.j2 r3 = r3.f33884n
            java.lang.String r3 = r3.mo52142d(r10)
            com.google.android.gms.measurement.internal.s7 r5 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r5 = r5.f33681b
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5
            com.google.android.gms.measurement.internal.j2 r5 = r5.f33884n
            java.lang.String r5 = r5.mo52143e(r14)
            java.lang.String r9 = "Missing param for filter. event, param"
            r2.mo52239c(r3, r9, r5)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L_0x049c
        L_0x046f:
            com.google.android.gms.measurement.internal.s7 r2 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r2 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33727j
            com.google.android.gms.measurement.internal.s7 r3 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r3 = r3.f33681b
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3
            com.google.android.gms.measurement.internal.j2 r3 = r3.f33884n
            java.lang.String r3 = r3.mo52142d(r10)
            com.google.android.gms.measurement.internal.s7 r5 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r5 = r5.f33681b
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5
            com.google.android.gms.measurement.internal.j2 r5 = r5.f33884n
            java.lang.String r5 = r5.mo52143e(r14)
            java.lang.String r9 = "Unknown param type. event, param"
            r2.mo52239c(r3, r9, r5)
        L_0x0498:
            r2 = 0
            goto L_0x049c
        L_0x049a:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
        L_0x049c:
            com.google.android.gms.measurement.internal.s7 r3 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r3 = r3.f33681b
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3
            com.google.android.gms.measurement.internal.o2 r3 = r3.mo52016b()
            com.google.android.gms.measurement.internal.m2 r3 = r3.f33732o
            if (r2 != 0) goto L_0x04ab
            goto L_0x04ac
        L_0x04ab:
            r6 = r2
        L_0x04ac:
            java.lang.String r5 = "Event filter result"
            r3.mo52238b(r6, r5)
            if (r2 != 0) goto L_0x04b4
            return r7
        L_0x04b4:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.f33788c = r3
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x04bf
            return r8
        L_0x04bf:
            r0.f33789d = r3
            if (r4 == 0) goto L_0x04f7
            boolean r2 = r21.mo50793K()
            if (r2 == 0) goto L_0x04f7
            long r2 = r21.mo50798u()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            com.google.android.gms.internal.measurement.q1 r3 = r0.f33757g
            boolean r3 = r3.mo50780C()
            if (r3 == 0) goto L_0x04e9
            if (r1 == 0) goto L_0x04e6
            com.google.android.gms.internal.measurement.q1 r1 = r0.f33757g
            boolean r1 = r1.mo50782E()
            if (r1 != 0) goto L_0x04e4
            goto L_0x04e6
        L_0x04e4:
            r2 = r19
        L_0x04e6:
            r0.f33791f = r2
            goto L_0x04f7
        L_0x04e9:
            if (r1 == 0) goto L_0x04f5
            com.google.android.gms.internal.measurement.q1 r1 = r0.f33757g
            boolean r1 = r1.mo50782E()
            if (r1 == 0) goto L_0x04f5
            r2 = r20
        L_0x04f5:
            r0.f33790e = r2
        L_0x04f7:
            return r8
        L_0x04f8:
            com.google.android.gms.measurement.internal.s7 r1 = r0.f33758h
            com.google.android.gms.measurement.internal.o4 r1 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r1 = (com.google.android.gms.measurement.internal.C15103u3) r1
            com.google.android.gms.measurement.internal.o2 r1 = r1.mo52016b()
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33727j
            java.lang.String r2 = r0.f33786a
            com.google.android.gms.measurement.internal.n2 r2 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r2)
            com.google.android.gms.internal.measurement.q1 r3 = r0.f33757g
            boolean r3 = r3.mo50783F()
            if (r3 == 0) goto L_0x051d
            com.google.android.gms.internal.measurement.q1 r3 = r0.f33757g
            int r3 = r3.mo50786s()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x051e
        L_0x051d:
            r3 = 0
        L_0x051e:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Invalid event filter ID. appId, id"
            r1.mo52239c(r2, r4, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C15063p7.mo52290g(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.q2, long, com.google.android.gms.measurement.internal.n, boolean):boolean");
    }
}
