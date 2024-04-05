package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19388s;

/* renamed from: com.google.android.gms.internal.measurement.y */
public final class C14873y extends C14849w {
    public C14873y() {
        this.f33140a.add(zzbl.APPLY);
        this.f33140a.add(zzbl.BLOCK);
        this.f33140a.add(zzbl.BREAK);
        this.f33140a.add(zzbl.CASE);
        this.f33140a.add(zzbl.DEFAULT);
        this.f33140a.add(zzbl.CONTINUE);
        this.f33140a.add(zzbl.DEFINE_FUNCTION);
        this.f33140a.add(zzbl.FN);
        this.f33140a.add(zzbl.IF);
        this.f33140a.add(zzbl.QUOTE);
        this.f33140a.add(zzbl.RETURN);
        this.f33140a.add(zzbl.SWITCH);
        this.f33140a.add(zzbl.TERNARY);
    }

    /* renamed from: c */
    public static C14750o m24163c(C14598c3 c3Var, ArrayList arrayList) {
        C19388s.m32842Q0(zzbl.FN.name(), arrayList, 2);
        C14763p c = c3Var.mo50400c((C14763p) arrayList.get(0));
        C14763p c2 = c3Var.mo50400c((C14763p) arrayList.get(1));
        if (c2 instanceof C14633f) {
            ArrayList q = ((C14633f) c2).mo50494q();
            List arrayList2 = new ArrayList();
            if (arrayList.size() > 2) {
                arrayList2 = arrayList.subList(2, arrayList.size());
            }
            return new C14750o(c.zzi(), q, arrayList2, c3Var);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", new Object[]{c2.getClass().getCanonicalName()}));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0117, code lost:
        if (r9.equals("continue") == false) goto L_0x011b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C14763p mo50377a(java.lang.String r9, com.google.android.gms.internal.measurement.C14598c3 r10, java.util.ArrayList r11) {
        /*
            r8 = this;
            com.google.android.gms.internal.measurement.zzbl r0 = com.google.android.gms.internal.measurement.zzbl.ADD
            com.google.android.gms.internal.measurement.zzbl r0 = kotlin.jvm.internal.C19388s.m32834M0(r9)
            int r0 = r0.ordinal()
            r1 = 1
            r2 = 3
            r3 = 2
            r4 = 0
            if (r0 == r3) goto L_0x01ed
            r5 = 15
            if (r0 == r5) goto L_0x01e1
            r5 = 25
            if (r0 == r5) goto L_0x01dc
            r5 = 41
            r6 = 0
            if (r0 == r5) goto L_0x018c
            r5 = 54
            if (r0 == r5) goto L_0x0186
            r5 = 57
            java.lang.String r7 = "return"
            if (r0 == r5) goto L_0x016a
            r5 = 19
            if (r0 == r5) goto L_0x0149
            r5 = 20
            if (r0 == r5) goto L_0x012e
            r5 = 60
            if (r0 == r5) goto L_0x0084
            r5 = 61
            if (r0 == r5) goto L_0x0058
            switch(r0) {
                case 11: goto L_0x004a;
                case 12: goto L_0x003e;
                case 13: goto L_0x0149;
                default: goto L_0x003a;
            }
        L_0x003a:
            r8.mo50946b(r9)
            throw r6
        L_0x003e:
            com.google.android.gms.internal.measurement.zzbl r9 = com.google.android.gms.internal.measurement.zzbl.BREAK
            java.lang.String r9 = r9.name()
            kotlin.jvm.internal.C19388s.m32840P0(r9, r11, r4)
            com.google.android.gms.internal.measurement.h r9 = com.google.android.gms.internal.measurement.C14763p.f33036j0
            return r9
        L_0x004a:
            com.google.android.gms.internal.measurement.c3 r9 = r10.mo50399b()
            com.google.android.gms.internal.measurement.f r10 = new com.google.android.gms.internal.measurement.f
            r10.<init>(r11)
            com.google.android.gms.internal.measurement.p r9 = r9.mo50401d(r10)
            return r9
        L_0x0058:
            com.google.android.gms.internal.measurement.zzbl r9 = com.google.android.gms.internal.measurement.zzbl.TERNARY
            java.lang.Object r9 = p504ai.C13983i.m21491j(r9, r11, r2, r4)
            com.google.android.gms.internal.measurement.p r9 = (com.google.android.gms.internal.measurement.C14763p) r9
            com.google.android.gms.internal.measurement.p r9 = r10.mo50400c(r9)
            java.lang.Boolean r9 = r9.zzg()
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0079
            java.lang.Object r9 = r11.get(r1)
            com.google.android.gms.internal.measurement.p r9 = (com.google.android.gms.internal.measurement.C14763p) r9
            com.google.android.gms.internal.measurement.p r9 = r10.mo50400c(r9)
            goto L_0x0083
        L_0x0079:
            java.lang.Object r9 = r11.get(r3)
            com.google.android.gms.internal.measurement.p r9 = (com.google.android.gms.internal.measurement.C14763p) r9
            com.google.android.gms.internal.measurement.p r9 = r10.mo50400c(r9)
        L_0x0083:
            return r9
        L_0x0084:
            com.google.android.gms.internal.measurement.zzbl r9 = com.google.android.gms.internal.measurement.zzbl.SWITCH
            java.lang.Object r9 = p504ai.C13983i.m21491j(r9, r11, r2, r4)
            com.google.android.gms.internal.measurement.p r9 = (com.google.android.gms.internal.measurement.C14763p) r9
            com.google.android.gms.internal.measurement.p r9 = r10.mo50400c(r9)
            java.lang.Object r0 = r11.get(r1)
            com.google.android.gms.internal.measurement.p r0 = (com.google.android.gms.internal.measurement.C14763p) r0
            com.google.android.gms.internal.measurement.p r0 = r10.mo50400c(r0)
            java.lang.Object r11 = r11.get(r3)
            com.google.android.gms.internal.measurement.p r11 = (com.google.android.gms.internal.measurement.C14763p) r11
            com.google.android.gms.internal.measurement.p r11 = r10.mo50400c(r11)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.C14633f
            if (r2 == 0) goto L_0x0126
            boolean r2 = r11 instanceof com.google.android.gms.internal.measurement.C14633f
            if (r2 == 0) goto L_0x011e
            com.google.android.gms.internal.measurement.f r0 = (com.google.android.gms.internal.measurement.C14633f) r0
            com.google.android.gms.internal.measurement.f r11 = (com.google.android.gms.internal.measurement.C14633f) r11
            r2 = r4
            r3 = r2
        L_0x00b2:
            int r5 = r0.mo50490m()
            if (r2 >= r5) goto L_0x00eb
            if (r3 != 0) goto L_0x00cb
            com.google.android.gms.internal.measurement.p r3 = r0.mo50491n(r2)
            com.google.android.gms.internal.measurement.p r3 = r10.mo50400c(r3)
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00c9
            goto L_0x00cb
        L_0x00c9:
            r3 = r4
            goto L_0x00e8
        L_0x00cb:
            com.google.android.gms.internal.measurement.p r3 = r11.mo50491n(r2)
            com.google.android.gms.internal.measurement.p r3 = r10.mo50400c(r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.measurement.C14659h
            if (r5 == 0) goto L_0x00e7
            r9 = r3
            com.google.android.gms.internal.measurement.h r9 = (com.google.android.gms.internal.measurement.C14659h) r9
            java.lang.String r9 = r9.f32858c
            java.lang.String r10 = "break"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x011a
            com.google.android.gms.internal.measurement.u r9 = com.google.android.gms.internal.measurement.C14763p.f33033g0
            return r9
        L_0x00e7:
            r3 = r1
        L_0x00e8:
            int r2 = r2 + 1
            goto L_0x00b2
        L_0x00eb:
            int r9 = r0.mo50490m()
            int r9 = r9 + r1
            int r1 = r11.mo50490m()
            if (r9 != r1) goto L_0x011b
            int r9 = r0.mo50490m()
            com.google.android.gms.internal.measurement.p r9 = r11.mo50491n(r9)
            com.google.android.gms.internal.measurement.p r3 = r10.mo50400c(r9)
            boolean r9 = r3 instanceof com.google.android.gms.internal.measurement.C14659h
            if (r9 == 0) goto L_0x011b
            r9 = r3
            com.google.android.gms.internal.measurement.h r9 = (com.google.android.gms.internal.measurement.C14659h) r9
            java.lang.String r9 = r9.f32858c
            boolean r10 = r9.equals(r7)
            if (r10 != 0) goto L_0x011a
            java.lang.String r10 = "continue"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x011a
            goto L_0x011b
        L_0x011a:
            return r3
        L_0x011b:
            com.google.android.gms.internal.measurement.u r9 = com.google.android.gms.internal.measurement.C14763p.f33033g0
            return r9
        L_0x011e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Malformed SWITCH statement, case statements are not a list"
            r9.<init>(r10)
            throw r9
        L_0x0126:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Malformed SWITCH statement, cases are not a list"
            r9.<init>(r10)
            throw r9
        L_0x012e:
            com.google.android.gms.internal.measurement.zzbl r9 = com.google.android.gms.internal.measurement.zzbl.DEFINE_FUNCTION
            java.lang.String r9 = r9.name()
            kotlin.jvm.internal.C19388s.m32842Q0(r9, r11, r3)
            com.google.android.gms.internal.measurement.o r9 = m24163c(r10, r11)
            java.lang.String r11 = r9.f32890b
            if (r11 != 0) goto L_0x0145
            java.lang.String r11 = ""
            r10.mo50404g(r11, r9)
            goto L_0x0148
        L_0x0145:
            r10.mo50404g(r11, r9)
        L_0x0148:
            return r9
        L_0x0149:
            boolean r9 = r11.isEmpty()
            if (r9 == 0) goto L_0x0152
            com.google.android.gms.internal.measurement.u r9 = com.google.android.gms.internal.measurement.C14763p.f33033g0
            goto L_0x0169
        L_0x0152:
            java.lang.Object r9 = r11.get(r4)
            com.google.android.gms.internal.measurement.p r9 = (com.google.android.gms.internal.measurement.C14763p) r9
            com.google.android.gms.internal.measurement.p r9 = r10.mo50400c(r9)
            boolean r11 = r9 instanceof com.google.android.gms.internal.measurement.C14633f
            if (r11 == 0) goto L_0x0167
            com.google.android.gms.internal.measurement.f r9 = (com.google.android.gms.internal.measurement.C14633f) r9
            com.google.android.gms.internal.measurement.p r9 = r10.mo50401d(r9)
            goto L_0x0169
        L_0x0167:
            com.google.android.gms.internal.measurement.u r9 = com.google.android.gms.internal.measurement.C14763p.f33033g0
        L_0x0169:
            return r9
        L_0x016a:
            boolean r9 = r11.isEmpty()
            if (r9 == 0) goto L_0x0173
            com.google.android.gms.internal.measurement.h r9 = com.google.android.gms.internal.measurement.C14763p.f33037l0
            goto L_0x0185
        L_0x0173:
            com.google.android.gms.internal.measurement.zzbl r9 = com.google.android.gms.internal.measurement.zzbl.RETURN
            java.lang.Object r9 = p504ai.C13983i.m21491j(r9, r11, r1, r4)
            com.google.android.gms.internal.measurement.p r9 = (com.google.android.gms.internal.measurement.C14763p) r9
            com.google.android.gms.internal.measurement.p r9 = r10.mo50400c(r9)
            com.google.android.gms.internal.measurement.h r10 = new com.google.android.gms.internal.measurement.h
            r10.<init>(r7, r9)
            r9 = r10
        L_0x0185:
            return r9
        L_0x0186:
            com.google.android.gms.internal.measurement.f r9 = new com.google.android.gms.internal.measurement.f
            r9.<init>(r11)
            return r9
        L_0x018c:
            com.google.android.gms.internal.measurement.zzbl r9 = com.google.android.gms.internal.measurement.zzbl.IF
            java.lang.String r9 = r9.name()
            kotlin.jvm.internal.C19388s.m32842Q0(r9, r11, r3)
            java.lang.Object r9 = r11.get(r4)
            com.google.android.gms.internal.measurement.p r9 = (com.google.android.gms.internal.measurement.C14763p) r9
            com.google.android.gms.internal.measurement.p r9 = r10.mo50400c(r9)
            java.lang.Object r0 = r11.get(r1)
            com.google.android.gms.internal.measurement.p r0 = (com.google.android.gms.internal.measurement.C14763p) r0
            com.google.android.gms.internal.measurement.p r0 = r10.mo50400c(r0)
            int r1 = r11.size()
            if (r1 <= r3) goto L_0x01b9
            java.lang.Object r11 = r11.get(r3)
            com.google.android.gms.internal.measurement.p r11 = (com.google.android.gms.internal.measurement.C14763p) r11
            com.google.android.gms.internal.measurement.p r6 = r10.mo50400c(r11)
        L_0x01b9:
            com.google.android.gms.internal.measurement.u r11 = com.google.android.gms.internal.measurement.C14763p.f33033g0
            java.lang.Boolean r9 = r9.zzg()
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x01cc
            com.google.android.gms.internal.measurement.f r0 = (com.google.android.gms.internal.measurement.C14633f) r0
            com.google.android.gms.internal.measurement.p r9 = r10.mo50401d(r0)
            goto L_0x01d6
        L_0x01cc:
            if (r6 == 0) goto L_0x01d5
            com.google.android.gms.internal.measurement.f r6 = (com.google.android.gms.internal.measurement.C14633f) r6
            com.google.android.gms.internal.measurement.p r9 = r10.mo50401d(r6)
            goto L_0x01d6
        L_0x01d5:
            r9 = r11
        L_0x01d6:
            boolean r10 = r9 instanceof com.google.android.gms.internal.measurement.C14659h
            if (r10 == 0) goto L_0x01db
            return r9
        L_0x01db:
            return r11
        L_0x01dc:
            com.google.android.gms.internal.measurement.o r9 = m24163c(r10, r11)
            return r9
        L_0x01e1:
            com.google.android.gms.internal.measurement.zzbl r9 = com.google.android.gms.internal.measurement.zzbl.BREAK
            java.lang.String r9 = r9.name()
            kotlin.jvm.internal.C19388s.m32840P0(r9, r11, r4)
            com.google.android.gms.internal.measurement.h r9 = com.google.android.gms.internal.measurement.C14763p.f33035i0
            return r9
        L_0x01ed:
            com.google.android.gms.internal.measurement.zzbl r9 = com.google.android.gms.internal.measurement.zzbl.APPLY
            java.lang.Object r9 = p504ai.C13983i.m21491j(r9, r11, r2, r4)
            com.google.android.gms.internal.measurement.p r9 = (com.google.android.gms.internal.measurement.C14763p) r9
            com.google.android.gms.internal.measurement.p r9 = r10.mo50400c(r9)
            java.lang.Object r0 = r11.get(r1)
            com.google.android.gms.internal.measurement.p r0 = (com.google.android.gms.internal.measurement.C14763p) r0
            com.google.android.gms.internal.measurement.p r0 = r10.mo50400c(r0)
            java.lang.String r0 = r0.zzi()
            java.lang.Object r11 = r11.get(r3)
            com.google.android.gms.internal.measurement.p r11 = (com.google.android.gms.internal.measurement.C14763p) r11
            com.google.android.gms.internal.measurement.p r11 = r10.mo50400c(r11)
            boolean r2 = r11 instanceof com.google.android.gms.internal.measurement.C14633f
            if (r2 == 0) goto L_0x022e
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0226
            com.google.android.gms.internal.measurement.f r11 = (com.google.android.gms.internal.measurement.C14633f) r11
            java.util.ArrayList r11 = r11.mo50494q()
            com.google.android.gms.internal.measurement.p r9 = r9.mo50486g(r0, r10, r11)
            return r9
        L_0x0226:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Function name for apply is undefined"
            r9.<init>(r10)
            throw r9
        L_0x022e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.Class r11 = r11.getClass()
            java.lang.String r11 = r11.getCanonicalName()
            r10[r4] = r11
            java.lang.String r11 = "Function arguments for Apply are not a list found %s"
            java.lang.String r10 = java.lang.String.format(r11, r10)
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C14873y.mo50377a(java.lang.String, com.google.android.gms.internal.measurement.c3, java.util.ArrayList):com.google.android.gms.internal.measurement.p");
    }
}
