package com.google.android.gms.internal.measurement;

import android.support.p013v4.media.C0072d;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.google.android.gms.internal.measurement.f */
public final class C14633f implements Iterable<C14763p>, C14763p, C14711l {

    /* renamed from: b */
    public final TreeMap f32830b;

    /* renamed from: c */
    public final TreeMap f32831c;

    public C14633f() {
        this.f32830b = new TreeMap();
        this.f32831c = new TreeMap();
    }

    /* renamed from: a */
    public final Iterator<C14763p> mo50482a() {
        return new C14607d(this.f32830b.keySet().iterator(), this.f32831c.keySet().iterator());
    }

    /* renamed from: c */
    public final boolean mo50483c(String str) {
        return "length".equals(str) || this.f32831c.containsKey(str);
    }

    /* renamed from: e */
    public final void mo50484e(String str, C14763p pVar) {
        if (pVar == null) {
            this.f32831c.remove(str);
        } else {
            this.f32831c.put(str, pVar);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14633f)) {
            return false;
        }
        C14633f fVar = (C14633f) obj;
        if (mo50490m() != fVar.mo50490m()) {
            return false;
        }
        if (this.f32830b.isEmpty()) {
            return fVar.f32830b.isEmpty();
        }
        for (int intValue = ((Integer) this.f32830b.firstKey()).intValue(); intValue <= ((Integer) this.f32830b.lastKey()).intValue(); intValue++) {
            if (!mo50491n(intValue).equals(fVar.mo50491n(intValue))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01cd, code lost:
        r22 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01e7, code lost:
        r6 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01f6, code lost:
        r7 = ",";
        r21 = r12;
        r18 = "forEach";
        r12 = com.google.android.material.shadow.ShadowDrawableWrapper.COS_45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0202, code lost:
        switch(r22) {
            case 0: goto L_0x0876;
            case 1: goto L_0x0833;
            case 2: goto L_0x07cd;
            case 3: goto L_0x0796;
            case 4: goto L_0x0703;
            case 5: goto L_0x06c1;
            case 6: goto L_0x061d;
            case 7: goto L_0x05e8;
            case 8: goto L_0x05cb;
            case 9: goto L_0x0593;
            case 10: goto L_0x0586;
            case 11: goto L_0x0579;
            case 12: goto L_0x053e;
            case 13: goto L_0x0523;
            case 14: goto L_0x049b;
            case 15: goto L_0x0422;
            case 16: goto L_0x03c5;
            case 17: goto L_0x02b7;
            case 18: goto L_0x02a4;
            case 19: goto L_0x020f;
            default: goto L_0x0205;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0205, code lost:
        r2 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x020e, code lost:
        throw new java.lang.IllegalArgumentException("Command not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0213, code lost:
        if (r28.isEmpty() != false) goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0215, code lost:
        r0 = new com.google.android.gms.internal.measurement.C14633f();
        r1 = r28.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0222, code lost:
        if (r1.hasNext() == false) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0224, code lost:
        r2 = r27.mo50400c((com.google.android.gms.internal.measurement.C14763p) r1.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0232, code lost:
        if ((r2 instanceof com.google.android.gms.internal.measurement.C14659h) != false) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0234, code lost:
        r0.mo50497v(r0.mo50490m(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0243, code lost:
        throw new java.lang.IllegalStateException("Argument evaluation failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0244, code lost:
        r1 = r0.mo50490m();
        r2 = mo50493p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0250, code lost:
        if (r2.hasNext() == false) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0252, code lost:
        r3 = r2.next();
        r0.mo50497v(r3.intValue() + r1, mo50491n(r3.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x026b, code lost:
        r8 = r25;
        r8.f32830b.clear();
        r1 = r0.mo50493p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x027a, code lost:
        if (r1.hasNext() == false) goto L_0x0294;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x027c, code lost:
        r2 = r1.next();
        r8.mo50497v(r2.intValue(), r0.mo50491n(r2.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0292, code lost:
        r8 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0294, code lost:
        r0 = new com.google.android.gms.internal.measurement.C14672i(java.lang.Double.valueOf((double) mo50490m()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02a4, code lost:
        r8 = r25;
        kotlin.jvm.internal.C19388s.m32840P0(r6, r28, 0);
        r0 = new com.google.android.gms.internal.measurement.C14813t(r8.mo50492o(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02b7, code lost:
        r8 = r25;
        r3 = r27;
        r5 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02c2, code lost:
        if (r28.isEmpty() == false) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02c4, code lost:
        r0 = new com.google.android.gms.internal.measurement.C14633f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02cb, code lost:
        r1 = (int) kotlin.jvm.internal.C19388s.m32826I0(r3.mo50400c((com.google.android.gms.internal.measurement.C14763p) r5.get(0)).zzh().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02e2, code lost:
        if (r1 >= 0) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02e4, code lost:
        r1 = java.lang.Math.max(0, mo50490m() + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02f2, code lost:
        if (r1 <= mo50490m()) goto L_0x02f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02f4, code lost:
        r1 = mo50490m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02f8, code lost:
        r0 = mo50490m();
        r2 = new com.google.android.gms.internal.measurement.C14633f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0306, code lost:
        if (r28.size() <= 1) goto L_0x03b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0308, code lost:
        r4 = java.lang.Math.max(0, (int) kotlin.jvm.internal.C19388s.m32826I0(r3.mo50400c((com.google.android.gms.internal.measurement.C14763p) r5.get(1)).zzh().doubleValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0324, code lost:
        if (r4 <= 0) goto L_0x0340;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0326, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x032d, code lost:
        if (r6 >= java.lang.Math.min(r0, r1 + r4)) goto L_0x0340;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x032f, code lost:
        r2.mo50497v(r2.mo50490m(), r8.mo50491n(r1));
        r8.mo50495s(r1);
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0345, code lost:
        if (r28.size() <= 2) goto L_0x082a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0347, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x034c, code lost:
        if (r0 >= r28.size()) goto L_0x082a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x034e, code lost:
        r4 = r3.mo50400c((com.google.android.gms.internal.measurement.C14763p) r5.get(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x035a, code lost:
        if ((r4 instanceof com.google.android.gms.internal.measurement.C14659h) != false) goto L_0x03a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x035c, code lost:
        r6 = (r1 + r0) - 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0360, code lost:
        if (r6 < 0) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0366, code lost:
        if (r6 < mo50490m()) goto L_0x036c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0368, code lost:
        r8.mo50497v(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x036c, code lost:
        r7 = ((java.lang.Integer) r8.f32830b.lastKey()).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0378, code lost:
        if (r7 < r6) goto L_0x0395;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x037a, code lost:
        r9 = r8.f32830b;
        r10 = java.lang.Integer.valueOf(r7);
        r9 = (com.google.android.gms.internal.measurement.C14763p) r9.get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0386, code lost:
        if (r9 == null) goto L_0x0392;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0388, code lost:
        r8.mo50497v(r7 + 1, r9);
        r8.f32830b.remove(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0392, code lost:
        r7 = r7 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0395, code lost:
        r8.mo50497v(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0398, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03a8, code lost:
        throw new java.lang.IllegalArgumentException(android.support.p013v4.media.C0072d.m200g(32, "Invalid value index: ", r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03b0, code lost:
        throw new java.lang.IllegalArgumentException("Failed to parse elements to add");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03b1, code lost:
        if (r1 >= r0) goto L_0x082a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03b3, code lost:
        r2.mo50497v(r2.mo50490m(), r8.mo50491n(r1));
        r8.mo50497v(r1, (com.google.android.gms.internal.measurement.C14763p) null);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03c5, code lost:
        r8 = r25;
        r3 = r27;
        r5 = r28;
        kotlin.jvm.internal.C19388s.m32844R0(r0, r5, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03d4, code lost:
        if (mo50490m() >= 2) goto L_0x03d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03d8, code lost:
        r0 = mo50494q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03e0, code lost:
        if (r28.isEmpty() != false) goto L_0x03fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03e2, code lost:
        r1 = r3.mo50400c((com.google.android.gms.internal.measurement.C14763p) r5.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03ef, code lost:
        if ((r1 instanceof com.google.android.gms.internal.measurement.C14685j) == false) goto L_0x03f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03f1, code lost:
        r1 = (com.google.android.gms.internal.measurement.C14685j) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03fb, code lost:
        throw new java.lang.IllegalArgumentException("Comparator should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03fc, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03fd, code lost:
        java.util.Collections.sort(r0, new com.google.android.gms.internal.measurement.C14569a0(r1, r3));
        r8.f32830b.clear();
        r0 = r0.iterator();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0413, code lost:
        if (r0.hasNext() == false) goto L_0x0575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0415, code lost:
        r8.mo50497v(r1, (com.google.android.gms.internal.measurement.C14763p) r0.next());
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0422, code lost:
        r8 = r25;
        r3 = r27;
        r5 = r28;
        kotlin.jvm.internal.C19388s.m32840P0(r10, r5, 1);
        r0 = r3.mo50400c((com.google.android.gms.internal.measurement.C14763p) r5.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0439, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.C14685j) == false) goto L_0x0495;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x043f, code lost:
        if (mo50490m() != 0) goto L_0x0445;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0441, code lost:
        r0 = com.google.android.gms.internal.measurement.C14763p.f33039n0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0445, code lost:
        r0 = (com.google.android.gms.internal.measurement.C14685j) r0;
        r1 = mo50493p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x044f, code lost:
        if (r1.hasNext() == false) goto L_0x0491;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0451, code lost:
        r2 = r1.next().intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x045f, code lost:
        if (r8.mo50498w(r2) == false) goto L_0x044b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x048b, code lost:
        if (r0.mo50553b(r3, java.util.Arrays.asList(new com.google.android.gms.internal.measurement.C14763p[]{r8.mo50491n(r2), new com.google.android.gms.internal.measurement.C14672i(java.lang.Double.valueOf((double) r2)), r8})).zzg().booleanValue() == false) goto L_0x044b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x048d, code lost:
        r0 = com.google.android.gms.internal.measurement.C14763p.f33038m0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0491, code lost:
        r0 = com.google.android.gms.internal.measurement.C14763p.f33039n0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x049a, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x049b, code lost:
        r8 = r25;
        r3 = r27;
        r5 = r28;
        kotlin.jvm.internal.C19388s.m32844R0("slice", r5, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04a9, code lost:
        if (r28.isEmpty() == false) goto L_0x04b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04ab, code lost:
        r0 = zzd();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04b1, code lost:
        r0 = (double) mo50490m();
        r6 = kotlin.jvm.internal.C19388s.m32826I0(r3.mo50400c((com.google.android.gms.internal.measurement.C14763p) r5.get(0)).zzh().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04cf, code lost:
        if (r6 >= com.google.android.material.shadow.ShadowDrawableWrapper.COS_45) goto L_0x04d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04d1, code lost:
        r6 = java.lang.Math.max(r6 + r0, com.google.android.material.shadow.ShadowDrawableWrapper.COS_45);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04d7, code lost:
        r6 = java.lang.Math.min(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04e0, code lost:
        if (r28.size() != 2) goto L_0x0507;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04e2, code lost:
        r2 = kotlin.jvm.internal.C19388s.m32826I0(r3.mo50400c((com.google.android.gms.internal.measurement.C14763p) r5.get(1)).zzh().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04fb, code lost:
        if (r2 >= com.google.android.material.shadow.ShadowDrawableWrapper.COS_45) goto L_0x0503;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04fd, code lost:
        r0 = java.lang.Math.max(r0 + r2, com.google.android.material.shadow.ShadowDrawableWrapper.COS_45);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0503, code lost:
        r0 = java.lang.Math.min(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0507, code lost:
        r2 = new com.google.android.gms.internal.measurement.C14633f();
        r3 = (int) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0510, code lost:
        if (((double) r3) >= r0) goto L_0x0520;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0512, code lost:
        r2.mo50497v(r2.mo50490m(), r8.mo50491n(r3));
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0520, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0523, code lost:
        r8 = r25;
        kotlin.jvm.internal.C19388s.m32840P0("shift", r28, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x052f, code lost:
        if (mo50490m() != 0) goto L_0x0535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0531, code lost:
        r0 = com.google.android.gms.internal.measurement.C14763p.f33033g0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0535, code lost:
        r1 = r8.mo50491n(0);
        r8.mo50495s(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x053e, code lost:
        r8 = r25;
        kotlin.jvm.internal.C19388s.m32840P0("reverse", r28, 0);
        r0 = mo50490m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x054a, code lost:
        if (r0 == 0) goto L_0x0575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x054c, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x054f, code lost:
        if (r1 >= (r0 / 2)) goto L_0x0575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0555, code lost:
        if (r8.mo50498w(r1) == false) goto L_0x0572;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0557, code lost:
        r2 = r8.mo50491n(r1);
        r8.mo50497v(r1, (com.google.android.gms.internal.measurement.C14763p) null);
        r3 = (r0 - 1) - r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0566, code lost:
        if (r8.mo50498w(r3) == false) goto L_0x056f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0568, code lost:
        r8.mo50497v(r1, r8.mo50491n(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x056f, code lost:
        r8.mo50497v(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0572, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0575, code lost:
        r1 = r8;
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0579, code lost:
        r8 = r25;
        r0 = androidx.compose.foundation.layout.C0761x.m1728i1(r8, r27, r28, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0586, code lost:
        r8 = r25;
        r0 = androidx.compose.foundation.layout.C0761x.m1728i1(r8, r27, r28, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0593, code lost:
        r8 = r25;
        r3 = r27;
        r5 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x059d, code lost:
        if (r28.isEmpty() != false) goto L_0x05bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x059f, code lost:
        r0 = r28.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x05a7, code lost:
        if (r0.hasNext() == false) goto L_0x05bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05a9, code lost:
        r8.mo50497v(mo50490m(), r3.mo50400c((com.google.android.gms.internal.measurement.C14763p) r0.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05bb, code lost:
        r0 = new com.google.android.gms.internal.measurement.C14672i(java.lang.Double.valueOf((double) mo50490m()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x05cb, code lost:
        r8 = r25;
        kotlin.jvm.internal.C19388s.m32840P0("pop", r28, 0);
        r0 = mo50490m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05d7, code lost:
        if (r0 != 0) goto L_0x05dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x05d9, code lost:
        r0 = com.google.android.gms.internal.measurement.C14763p.f33033g0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x05dd, code lost:
        r0 = r0 - 1;
        r1 = r8.mo50491n(r0);
        r8.mo50495s(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05e8, code lost:
        r8 = r25;
        r3 = r27;
        r5 = r28;
        kotlin.jvm.internal.C19388s.m32840P0("map", r5, 1);
        r0 = r3.mo50400c((com.google.android.gms.internal.measurement.C14763p) r5.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05ff, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.C14750o) == false) goto L_0x0617;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0605, code lost:
        if (mo50490m() != 0) goto L_0x060e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0607, code lost:
        r0 = new com.google.android.gms.internal.measurement.C14633f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x060e, code lost:
        r0 = androidx.compose.foundation.layout.C0761x.m1723g1(r8, r3, (com.google.android.gms.internal.measurement.C14750o) r0, (java.lang.Boolean) null, (java.lang.Boolean) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x061c, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x061d, code lost:
        r8 = r25;
        r3 = r27;
        r5 = r28;
        kotlin.jvm.internal.C19388s.m32844R0("lastIndexOf", r5, 2);
        r0 = com.google.android.gms.internal.measurement.C14763p.f33033g0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x062d, code lost:
        if (r28.isEmpty() != false) goto L_0x063a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x062f, code lost:
        r0 = r3.mo50400c((com.google.android.gms.internal.measurement.C14763p) r5.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x063a, code lost:
        r1 = (double) (mo50490m() - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0646, code lost:
        if (r28.size() <= 1) goto L_0x067e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0648, code lost:
        r1 = r3.mo50400c((com.google.android.gms.internal.measurement.C14763p) r5.get(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x065e, code lost:
        if (java.lang.Double.isNaN(r1.zzh().doubleValue()) == false) goto L_0x0668;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0660, code lost:
        r1 = (double) (mo50490m() - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0668, code lost:
        r1 = kotlin.jvm.internal.C19388s.m32826I0(r1.zzh().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0676, code lost:
        if (r1 >= com.google.android.material.shadow.ShadowDrawableWrapper.COS_45) goto L_0x067e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0678, code lost:
        r1 = r1 + ((double) mo50490m());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0680, code lost:
        if (r1 >= com.google.android.material.shadow.ShadowDrawableWrapper.COS_45) goto L_0x068c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0682, code lost:
        r0 = new com.google.android.gms.internal.measurement.C14672i(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x068c, code lost:
        r1 = (int) java.lang.Math.min((double) mo50490m(), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0696, code lost:
        if (r1 < 0) goto L_0x06b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x069c, code lost:
        if (r8.mo50498w(r1) == false) goto L_0x06b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x06a6, code lost:
        if (kotlin.jvm.internal.C19388s.m32848T0(r8.mo50491n(r1), r0) == false) goto L_0x06b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x06a8, code lost:
        r0 = new com.google.android.gms.internal.measurement.C14672i(java.lang.Double.valueOf((double) r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x06b3, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x06b6, code lost:
        r0 = new com.google.android.gms.internal.measurement.C14672i(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x06bf, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x06c1, code lost:
        r8 = r25;
        r3 = r27;
        r5 = r28;
        kotlin.jvm.internal.C19388s.m32844R0(r21, r5, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x06d1, code lost:
        if (mo50490m() != 0) goto L_0x06d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x06d3, code lost:
        r1 = com.google.android.gms.internal.measurement.C14763p.f33040o0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x06d5, code lost:
        r2 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x06dc, code lost:
        if (r28.size() <= 0) goto L_0x06f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x06de, code lost:
        r0 = r3.mo50400c((com.google.android.gms.internal.measurement.C14763p) r5.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x06eb, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.C14737n) != false) goto L_0x06f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x06ef, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.C14825u) == false) goto L_0x06f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x06f2, code lost:
        r7 = r0.zzi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x06f7, code lost:
        r7 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x06f9, code lost:
        r1 = new com.google.android.gms.internal.measurement.C14813t(r8.mo50492o(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0703, code lost:
        r8 = r25;
        r3 = r27;
        r5 = r28;
        kotlin.jvm.internal.C19388s.m32844R0("indexOf", r5, 2);
        r0 = com.google.android.gms.internal.measurement.C14763p.f33033g0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0713, code lost:
        if (r28.isEmpty() != false) goto L_0x0720;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0715, code lost:
        r0 = r3.mo50400c((com.google.android.gms.internal.measurement.C14763p) r5.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0725, code lost:
        if (r28.size() <= 1) goto L_0x075d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0727, code lost:
        r1 = kotlin.jvm.internal.C19388s.m32826I0(r3.mo50400c((com.google.android.gms.internal.measurement.C14763p) r5.get(1)).zzh().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0744, code lost:
        if (r1 < ((double) mo50490m())) goto L_0x0750;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0746, code lost:
        r1 = new com.google.android.gms.internal.measurement.C14672i(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0752, code lost:
        if (r1 >= com.google.android.material.shadow.ShadowDrawableWrapper.COS_45) goto L_0x075c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0754, code lost:
        r12 = ((double) mo50490m()) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x075c, code lost:
        r12 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x075d, code lost:
        r1 = mo50493p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0765, code lost:
        if (r1.hasNext() == false) goto L_0x078b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0767, code lost:
        r2 = r1.next().intValue();
        r3 = (double) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0774, code lost:
        if (r3 < r12) goto L_0x0761;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x077e, code lost:
        if (kotlin.jvm.internal.C19388s.m32848T0(r8.mo50491n(r2), r0) == false) goto L_0x0761;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0780, code lost:
        r1 = new com.google.android.gms.internal.measurement.C14672i(java.lang.Double.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x078b, code lost:
        r1 = new com.google.android.gms.internal.measurement.C14672i(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0796, code lost:
        r8 = r25;
        r3 = r27;
        r5 = r28;
        kotlin.jvm.internal.C19388s.m32840P0(r18, r5, 1);
        r0 = r3.mo50400c((com.google.android.gms.internal.measurement.C14763p) r5.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x07af, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.C14750o) == false) goto L_0x07c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x07b7, code lost:
        if (r8.f32830b.size() != 0) goto L_0x07bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x07b9, code lost:
        r1 = com.google.android.gms.internal.measurement.C14763p.f33033g0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x07bd, code lost:
        androidx.compose.foundation.layout.C0761x.m1723g1(r8, r3, (com.google.android.gms.internal.measurement.C14750o) r0, (java.lang.Boolean) null, (java.lang.Boolean) null);
        r1 = com.google.android.gms.internal.measurement.C14763p.f33033g0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x07cc, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x07cd, code lost:
        r8 = r25;
        r3 = r27;
        r0 = r28;
        kotlin.jvm.internal.C19388s.m32840P0(r5, r0, 1);
        r0 = r3.mo50400c((com.google.android.gms.internal.measurement.C14763p) r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x07e4, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.C14750o) == false) goto L_0x082d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x07ec, code lost:
        if (r8.f32830b.size() != 0) goto L_0x07f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x07ee, code lost:
        r1 = new com.google.android.gms.internal.measurement.C14633f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x07f5, code lost:
        r1 = zzd();
        r0 = androidx.compose.foundation.layout.C0761x.m1723g1(r8, r3, (com.google.android.gms.internal.measurement.C14750o) r0, (java.lang.Boolean) null, java.lang.Boolean.TRUE);
        r2 = new com.google.android.gms.internal.measurement.C14633f();
        r0 = r0.mo50493p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x080f, code lost:
        if (r0.hasNext() == false) goto L_0x082a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0811, code lost:
        r2.mo50497v(r2.mo50490m(), ((com.google.android.gms.internal.measurement.C14633f) r1).mo50491n(r0.next().intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x082a, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0832, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0833, code lost:
        r2 = r25;
        r3 = r27;
        r0 = r28;
        kotlin.jvm.internal.C19388s.m32840P0("every", r0, 1);
        r0 = r3.mo50400c((com.google.android.gms.internal.measurement.C14763p) r0.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x084a, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.C14750o) == false) goto L_0x0870;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0850, code lost:
        if (mo50490m() != 0) goto L_0x0856;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0868, code lost:
        if (androidx.compose.foundation.layout.C0761x.m1723g1(r2, r3, (com.google.android.gms.internal.measurement.C14750o) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).mo50490m() == mo50490m()) goto L_0x086d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0875, code lost:
        throw new java.lang.IllegalArgumentException("Callback should be a method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0876, code lost:
        r2 = r25;
        r3 = r27;
        r0 = r28;
        r1 = zzd();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0884, code lost:
        if (r28.isEmpty() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0886, code lost:
        r0 = r28.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x088e, code lost:
        if (r0.hasNext() == false) goto L_0x08d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0890, code lost:
        r4 = r3.mo50400c((com.google.android.gms.internal.measurement.C14763p) r0.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x089c, code lost:
        if ((r4 instanceof com.google.android.gms.internal.measurement.C14659h) != false) goto L_0x08d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x089e, code lost:
        r5 = (com.google.android.gms.internal.measurement.C14633f) r1;
        r6 = r5.mo50490m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x08a7, code lost:
        if ((r4 instanceof com.google.android.gms.internal.measurement.C14633f) == false) goto L_0x08cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x08a9, code lost:
        r4 = (com.google.android.gms.internal.measurement.C14633f) r4;
        r7 = r4.mo50493p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x08b3, code lost:
        if (r7.hasNext() == false) goto L_0x088a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x08b5, code lost:
        r8 = r7.next();
        r5.mo50497v(r8.intValue() + r6, r4.mo50491n(r8.intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x08cc, code lost:
        r5.mo50497v(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x08d7, code lost:
        throw new java.lang.IllegalStateException("Failed evaluation of arguments");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:?, code lost:
        return com.google.android.gms.internal.measurement.C14763p.f33038m0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:?, code lost:
        return com.google.android.gms.internal.measurement.C14763p.f33039n0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:?, code lost:
        return com.google.android.gms.internal.measurement.C14763p.f33038m0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0167, code lost:
        r5 = r17;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C14763p mo50486g(java.lang.String r26, com.google.android.gms.internal.measurement.C14598c3 r27, java.util.ArrayList r28) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            java.lang.String r4 = "concat"
            boolean r5 = r4.equals(r1)
            java.lang.String r6 = "reduceRight"
            java.lang.String r7 = "push"
            java.lang.String r8 = "unshift"
            java.lang.String r9 = "splice"
            java.lang.String r10 = "reduce"
            java.lang.String r11 = "toString"
            java.lang.String r12 = "filter"
            java.lang.String r13 = "forEach"
            java.lang.String r14 = "lastIndexOf"
            java.lang.String r15 = "map"
            r16 = r4
            java.lang.String r4 = "pop"
            java.lang.String r0 = "join"
            java.lang.String r2 = "some"
            java.lang.String r3 = "sort"
            r17 = r8
            java.lang.String r8 = "every"
            r18 = r11
            java.lang.String r11 = "shift"
            r19 = r9
            java.lang.String r9 = "slice"
            r20 = r3
            java.lang.String r3 = "reverse"
            r21 = r2
            java.lang.String r2 = "indexOf"
            if (r5 != 0) goto L_0x0117
            boolean r5 = r8.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r12.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r13.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r2.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r0.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r14.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r15.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r4.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r7.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r10.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r6.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r3.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r11.equals(r1)
            if (r5 != 0) goto L_0x0117
            boolean r5 = r9.equals(r1)
            if (r5 != 0) goto L_0x0117
            r5 = r21
            boolean r21 = r5.equals(r1)
            if (r21 != 0) goto L_0x0108
            r21 = r0
            r0 = r20
            boolean r20 = r0.equals(r1)
            if (r20 != 0) goto L_0x00fc
            r20 = r0
            r0 = r19
            boolean r19 = r0.equals(r1)
            if (r19 != 0) goto L_0x00ec
            r19 = r5
            r5 = r18
            boolean r18 = r5.equals(r1)
            if (r18 != 0) goto L_0x00d7
            r18 = r5
            r5 = r17
            boolean r17 = r5.equals(r1)
            if (r17 == 0) goto L_0x00c7
            goto L_0x00db
        L_0x00c7:
            com.google.android.gms.internal.measurement.t r0 = new com.google.android.gms.internal.measurement.t
            r0.<init>(r1)
            r1 = r25
            r2 = r27
            r3 = r28
            com.google.android.gms.internal.measurement.p r0 = com.google.android.play.core.assetpacks.C15588c1.m25309U0(r1, r0, r2, r3)
            return r0
        L_0x00d7:
            r18 = r5
            r5 = r17
        L_0x00db:
            r17 = r12
            r12 = r21
            r23 = r20
            r20 = r0
            r0 = r23
            r24 = r19
            r19 = r10
            r10 = r24
            goto L_0x0124
        L_0x00ec:
            r19 = r10
            r10 = r5
            r5 = r17
            r17 = r12
            r12 = r21
            r23 = r20
            r20 = r0
            r0 = r23
            goto L_0x0124
        L_0x00fc:
            r20 = r19
            r19 = r10
            r10 = r5
            r5 = r17
            r17 = r12
            r12 = r21
            goto L_0x0124
        L_0x0108:
            r23 = r12
            r12 = r0
            r0 = r20
            r20 = r19
            r19 = r10
            r10 = r5
            r5 = r17
            r17 = r23
            goto L_0x0124
        L_0x0117:
            r5 = r17
            r17 = r12
            r12 = r0
            r0 = r20
            r20 = r19
            r19 = r10
            r10 = r21
        L_0x0124:
            int r21 = r26.hashCode()
            r22 = -1
            switch(r21) {
                case -1776922004: goto L_0x01ea;
                case -1354795244: goto L_0x01db;
                case -1274492040: goto L_0x01d0;
                case -934873754: goto L_0x01c3;
                case -895859076: goto L_0x01b8;
                case -678635926: goto L_0x01b0;
                case -467511597: goto L_0x01a8;
                case -277637751: goto L_0x019f;
                case 107868: goto L_0x0197;
                case 111185: goto L_0x018e;
                case 3267882: goto L_0x0186;
                case 3452698: goto L_0x017d;
                case 3536116: goto L_0x0174;
                case 3536286: goto L_0x016b;
                case 96891675: goto L_0x015f;
                case 109407362: goto L_0x0155;
                case 109526418: goto L_0x014b;
                case 965561430: goto L_0x0141;
                case 1099846370: goto L_0x0137;
                case 1943291465: goto L_0x012e;
                default: goto L_0x012d;
            }
        L_0x012d:
            goto L_0x0167
        L_0x012e:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0167
            r1 = 4
            goto L_0x01cd
        L_0x0137:
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0167
            r1 = 12
            goto L_0x01cd
        L_0x0141:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0167
            r1 = 11
            goto L_0x01cd
        L_0x014b:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0167
            r1 = 14
            goto L_0x01cd
        L_0x0155:
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0167
            r1 = 13
            goto L_0x01cd
        L_0x015f:
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0167
            r22 = 1
        L_0x0167:
            r5 = r17
            goto L_0x01e7
        L_0x016b:
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0167
            r1 = 16
            goto L_0x01cd
        L_0x0174:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x0167
            r1 = 15
            goto L_0x01cd
        L_0x017d:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0167
            r1 = 9
            goto L_0x01cd
        L_0x0186:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x0167
            r1 = 5
            goto L_0x01cd
        L_0x018e:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0167
            r1 = 8
            goto L_0x01cd
        L_0x0197:
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x0167
            r1 = 7
            goto L_0x01cd
        L_0x019f:
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0167
            r1 = 19
            goto L_0x01cd
        L_0x01a8:
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L_0x0167
            r1 = 6
            goto L_0x01cd
        L_0x01b0:
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0167
            r1 = 3
            goto L_0x01cd
        L_0x01b8:
            r5 = r20
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0167
            r1 = 17
            goto L_0x01cd
        L_0x01c3:
            r5 = r19
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0167
            r1 = 10
        L_0x01cd:
            r22 = r1
            goto L_0x0167
        L_0x01d0:
            r5 = r17
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x01e7
            r22 = 2
            goto L_0x01e7
        L_0x01db:
            r6 = r16
            r5 = r17
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x01e7
            r22 = 0
        L_0x01e7:
            r6 = r18
            goto L_0x01f6
        L_0x01ea:
            r5 = r17
            r6 = r18
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x01f6
            r22 = 18
        L_0x01f6:
            r16 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.String r1 = "Callback should be a method"
            java.lang.String r7 = ","
            r21 = r12
            r18 = r13
            r12 = 0
            switch(r22) {
                case 0: goto L_0x0876;
                case 1: goto L_0x0833;
                case 2: goto L_0x07cd;
                case 3: goto L_0x0796;
                case 4: goto L_0x0703;
                case 5: goto L_0x06c1;
                case 6: goto L_0x061d;
                case 7: goto L_0x05e8;
                case 8: goto L_0x05cb;
                case 9: goto L_0x0593;
                case 10: goto L_0x0586;
                case 11: goto L_0x0579;
                case 12: goto L_0x053e;
                case 13: goto L_0x0523;
                case 14: goto L_0x049b;
                case 15: goto L_0x0422;
                case 16: goto L_0x03c5;
                case 17: goto L_0x02b7;
                case 18: goto L_0x02a4;
                case 19: goto L_0x020f;
                default: goto L_0x0205;
            }
        L_0x0205:
            r2 = r25
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Command not supported"
            r0.<init>(r1)
            throw r0
        L_0x020f:
            boolean r0 = r28.isEmpty()
            if (r0 != 0) goto L_0x0292
            com.google.android.gms.internal.measurement.f r0 = new com.google.android.gms.internal.measurement.f
            r0.<init>()
            java.util.Iterator r1 = r28.iterator()
        L_0x021e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0244
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.measurement.p r2 = (com.google.android.gms.internal.measurement.C14763p) r2
            r3 = r27
            com.google.android.gms.internal.measurement.p r2 = r3.mo50400c(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.measurement.C14659h
            if (r4 != 0) goto L_0x023c
            int r4 = r0.mo50490m()
            r0.mo50497v(r4, r2)
            goto L_0x021e
        L_0x023c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Argument evaluation failed"
            r0.<init>(r1)
            throw r0
        L_0x0244:
            int r1 = r0.mo50490m()
            java.util.Iterator r2 = r25.mo50493p()
        L_0x024c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x026b
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r4 = r3.intValue()
            int r4 = r4 + r1
            int r3 = r3.intValue()
            r8 = r25
            com.google.android.gms.internal.measurement.p r3 = r8.mo50491n(r3)
            r0.mo50497v(r4, r3)
            goto L_0x024c
        L_0x026b:
            r8 = r25
            java.util.TreeMap r1 = r8.f32830b
            r1.clear()
            java.util.Iterator r1 = r0.mo50493p()
        L_0x0276:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0294
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r3 = r2.intValue()
            int r2 = r2.intValue()
            com.google.android.gms.internal.measurement.p r2 = r0.mo50491n(r2)
            r8.mo50497v(r3, r2)
            goto L_0x0276
        L_0x0292:
            r8 = r25
        L_0x0294:
            com.google.android.gms.internal.measurement.i r0 = new com.google.android.gms.internal.measurement.i
            int r1 = r25.mo50490m()
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            goto L_0x06bf
        L_0x02a4:
            r8 = r25
            r0 = 0
            r5 = r28
            kotlin.jvm.internal.C19388s.m32840P0(r6, r5, r0)
            com.google.android.gms.internal.measurement.t r0 = new com.google.android.gms.internal.measurement.t
            java.lang.String r1 = r8.mo50492o(r7)
            r0.<init>(r1)
            goto L_0x06bf
        L_0x02b7:
            r8 = r25
            r3 = r27
            r5 = r28
            r0 = 0
            boolean r1 = r28.isEmpty()
            if (r1 == 0) goto L_0x02cb
            com.google.android.gms.internal.measurement.f r0 = new com.google.android.gms.internal.measurement.f
            r0.<init>()
            goto L_0x06bf
        L_0x02cb:
            java.lang.Object r1 = r5.get(r0)
            com.google.android.gms.internal.measurement.p r1 = (com.google.android.gms.internal.measurement.C14763p) r1
            com.google.android.gms.internal.measurement.p r1 = r3.mo50400c(r1)
            java.lang.Double r1 = r1.zzh()
            double r1 = r1.doubleValue()
            double r1 = kotlin.jvm.internal.C19388s.m32826I0(r1)
            int r1 = (int) r1
            if (r1 >= 0) goto L_0x02ee
            int r2 = r25.mo50490m()
            int r2 = r2 + r1
            int r1 = java.lang.Math.max(r0, r2)
            goto L_0x02f8
        L_0x02ee:
            int r0 = r25.mo50490m()
            if (r1 <= r0) goto L_0x02f8
            int r1 = r25.mo50490m()
        L_0x02f8:
            int r0 = r25.mo50490m()
            com.google.android.gms.internal.measurement.f r2 = new com.google.android.gms.internal.measurement.f
            r2.<init>()
            int r4 = r28.size()
            r6 = 1
            if (r4 <= r6) goto L_0x03b1
            java.lang.Object r4 = r5.get(r6)
            com.google.android.gms.internal.measurement.p r4 = (com.google.android.gms.internal.measurement.C14763p) r4
            com.google.android.gms.internal.measurement.p r4 = r3.mo50400c(r4)
            java.lang.Double r4 = r4.zzh()
            double r6 = r4.doubleValue()
            double r6 = kotlin.jvm.internal.C19388s.m32826I0(r6)
            int r4 = (int) r6
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            if (r4 <= 0) goto L_0x0340
            r6 = r1
        L_0x0327:
            int r7 = r1 + r4
            int r7 = java.lang.Math.min(r0, r7)
            if (r6 >= r7) goto L_0x0340
            com.google.android.gms.internal.measurement.p r7 = r8.mo50491n(r1)
            int r9 = r2.mo50490m()
            r2.mo50497v(r9, r7)
            r8.mo50495s(r1)
            int r6 = r6 + 1
            goto L_0x0327
        L_0x0340:
            int r0 = r28.size()
            r4 = 2
            if (r0 <= r4) goto L_0x082a
            r0 = 2
        L_0x0348:
            int r4 = r28.size()
            if (r0 >= r4) goto L_0x082a
            java.lang.Object r4 = r5.get(r0)
            com.google.android.gms.internal.measurement.p r4 = (com.google.android.gms.internal.measurement.C14763p) r4
            com.google.android.gms.internal.measurement.p r4 = r3.mo50400c(r4)
            boolean r6 = r4 instanceof com.google.android.gms.internal.measurement.C14659h
            if (r6 != 0) goto L_0x03a9
            int r6 = r1 + r0
            int r6 = r6 + -2
            if (r6 < 0) goto L_0x039b
            int r7 = r25.mo50490m()
            if (r6 < r7) goto L_0x036c
            r8.mo50497v(r6, r4)
            goto L_0x0398
        L_0x036c:
            java.util.TreeMap r7 = r8.f32830b
            java.lang.Object r7 = r7.lastKey()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
        L_0x0378:
            if (r7 < r6) goto L_0x0395
            java.util.TreeMap r9 = r8.f32830b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            java.lang.Object r9 = r9.get(r10)
            com.google.android.gms.internal.measurement.p r9 = (com.google.android.gms.internal.measurement.C14763p) r9
            if (r9 == 0) goto L_0x0392
            int r11 = r7 + 1
            r8.mo50497v(r11, r9)
            java.util.TreeMap r9 = r8.f32830b
            r9.remove(r10)
        L_0x0392:
            int r7 = r7 + -1
            goto L_0x0378
        L_0x0395:
            r8.mo50497v(r6, r4)
        L_0x0398:
            int r0 = r0 + 1
            goto L_0x0348
        L_0x039b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 32
            java.lang.String r2 = "Invalid value index: "
            java.lang.String r1 = android.support.p013v4.media.C0072d.m200g(r1, r2, r6)
            r0.<init>(r1)
            throw r0
        L_0x03a9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed to parse elements to add"
            r0.<init>(r1)
            throw r0
        L_0x03b1:
            if (r1 >= r0) goto L_0x082a
            com.google.android.gms.internal.measurement.p r3 = r8.mo50491n(r1)
            int r4 = r2.mo50490m()
            r2.mo50497v(r4, r3)
            r3 = 0
            r8.mo50497v(r1, r3)
            int r1 = r1 + 1
            goto L_0x03b1
        L_0x03c5:
            r8 = r25
            r3 = r27
            r5 = r28
            r1 = 1
            kotlin.jvm.internal.C19388s.m32844R0(r0, r5, r1)
            int r0 = r25.mo50490m()
            r1 = 2
            if (r0 >= r1) goto L_0x03d8
            goto L_0x0575
        L_0x03d8:
            java.util.ArrayList r0 = r25.mo50494q()
            boolean r1 = r28.isEmpty()
            if (r1 != 0) goto L_0x03fc
            r1 = 0
            java.lang.Object r1 = r5.get(r1)
            com.google.android.gms.internal.measurement.p r1 = (com.google.android.gms.internal.measurement.C14763p) r1
            com.google.android.gms.internal.measurement.p r1 = r3.mo50400c(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C14685j
            if (r2 == 0) goto L_0x03f4
            com.google.android.gms.internal.measurement.j r1 = (com.google.android.gms.internal.measurement.C14685j) r1
            goto L_0x03fd
        L_0x03f4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Comparator should be a method"
            r0.<init>(r1)
            throw r0
        L_0x03fc:
            r1 = 0
        L_0x03fd:
            com.google.android.gms.internal.measurement.a0 r2 = new com.google.android.gms.internal.measurement.a0
            r2.<init>(r1, r3)
            java.util.Collections.sort(r0, r2)
            java.util.TreeMap r1 = r8.f32830b
            r1.clear()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x040f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0575
            int r2 = r1 + 1
            java.lang.Object r3 = r0.next()
            com.google.android.gms.internal.measurement.p r3 = (com.google.android.gms.internal.measurement.C14763p) r3
            r8.mo50497v(r1, r3)
            r1 = r2
            goto L_0x040f
        L_0x0422:
            r8 = r25
            r3 = r27
            r5 = r28
            r0 = 1
            kotlin.jvm.internal.C19388s.m32840P0(r10, r5, r0)
            r0 = 0
            java.lang.Object r0 = r5.get(r0)
            com.google.android.gms.internal.measurement.p r0 = (com.google.android.gms.internal.measurement.C14763p) r0
            com.google.android.gms.internal.measurement.p r0 = r3.mo50400c(r0)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.C14685j
            if (r2 == 0) goto L_0x0495
            int r1 = r25.mo50490m()
            if (r1 != 0) goto L_0x0445
            com.google.android.gms.internal.measurement.g r0 = com.google.android.gms.internal.measurement.C14763p.f33039n0
            goto L_0x06bf
        L_0x0445:
            com.google.android.gms.internal.measurement.j r0 = (com.google.android.gms.internal.measurement.C14685j) r0
            java.util.Iterator r1 = r25.mo50493p()
        L_0x044b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0491
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            boolean r4 = r8.mo50498w(r2)
            if (r4 == 0) goto L_0x044b
            r4 = 3
            com.google.android.gms.internal.measurement.p[] r4 = new com.google.android.gms.internal.measurement.C14763p[r4]
            com.google.android.gms.internal.measurement.p r5 = r8.mo50491n(r2)
            r6 = 0
            r4[r6] = r5
            com.google.android.gms.internal.measurement.i r5 = new com.google.android.gms.internal.measurement.i
            double r6 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r6)
            r5.<init>(r2)
            r2 = 1
            r4[r2] = r5
            r2 = 2
            r4[r2] = r8
            java.util.List r2 = java.util.Arrays.asList(r4)
            com.google.android.gms.internal.measurement.p r2 = r0.mo50553b(r3, r2)
            java.lang.Boolean r2 = r2.zzg()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x044b
            com.google.android.gms.internal.measurement.g r0 = com.google.android.gms.internal.measurement.C14763p.f33038m0
            goto L_0x06bf
        L_0x0491:
            com.google.android.gms.internal.measurement.g r0 = com.google.android.gms.internal.measurement.C14763p.f33039n0
            goto L_0x06bf
        L_0x0495:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x049b:
            r8 = r25
            r3 = r27
            r5 = r28
            r0 = 2
            kotlin.jvm.internal.C19388s.m32844R0(r9, r5, r0)
            boolean r0 = r28.isEmpty()
            if (r0 == 0) goto L_0x04b1
            com.google.android.gms.internal.measurement.p r0 = r25.zzd()
            goto L_0x06bf
        L_0x04b1:
            int r0 = r25.mo50490m()
            double r0 = (double) r0
            r2 = 0
            java.lang.Object r2 = r5.get(r2)
            com.google.android.gms.internal.measurement.p r2 = (com.google.android.gms.internal.measurement.C14763p) r2
            com.google.android.gms.internal.measurement.p r2 = r3.mo50400c(r2)
            java.lang.Double r2 = r2.zzh()
            double r6 = r2.doubleValue()
            double r6 = kotlin.jvm.internal.C19388s.m32826I0(r6)
            int r2 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r2 >= 0) goto L_0x04d7
            double r6 = r6 + r0
            double r6 = java.lang.Math.max(r6, r12)
            goto L_0x04db
        L_0x04d7:
            double r6 = java.lang.Math.min(r6, r0)
        L_0x04db:
            int r2 = r28.size()
            r4 = 2
            if (r2 != r4) goto L_0x0507
            r2 = 1
            java.lang.Object r2 = r5.get(r2)
            com.google.android.gms.internal.measurement.p r2 = (com.google.android.gms.internal.measurement.C14763p) r2
            com.google.android.gms.internal.measurement.p r2 = r3.mo50400c(r2)
            java.lang.Double r2 = r2.zzh()
            double r2 = r2.doubleValue()
            double r2 = kotlin.jvm.internal.C19388s.m32826I0(r2)
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 >= 0) goto L_0x0503
            double r0 = r0 + r2
            double r0 = java.lang.Math.max(r0, r12)
            goto L_0x0507
        L_0x0503:
            double r0 = java.lang.Math.min(r0, r2)
        L_0x0507:
            com.google.android.gms.internal.measurement.f r2 = new com.google.android.gms.internal.measurement.f
            r2.<init>()
            int r3 = (int) r6
        L_0x050d:
            double r4 = (double) r3
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x0520
            com.google.android.gms.internal.measurement.p r4 = r8.mo50491n(r3)
            int r5 = r2.mo50490m()
            r2.mo50497v(r5, r4)
            int r3 = r3 + 1
            goto L_0x050d
        L_0x0520:
            r0 = r2
            goto L_0x06bf
        L_0x0523:
            r8 = r25
            r5 = r28
            r0 = 0
            kotlin.jvm.internal.C19388s.m32840P0(r11, r5, r0)
            int r1 = r25.mo50490m()
            if (r1 != 0) goto L_0x0535
            com.google.android.gms.internal.measurement.u r0 = com.google.android.gms.internal.measurement.C14763p.f33033g0
            goto L_0x06bf
        L_0x0535:
            com.google.android.gms.internal.measurement.p r1 = r8.mo50491n(r0)
            r8.mo50495s(r0)
            goto L_0x06d5
        L_0x053e:
            r8 = r25
            r5 = r28
            r0 = 0
            kotlin.jvm.internal.C19388s.m32840P0(r3, r5, r0)
            int r0 = r25.mo50490m()
            if (r0 == 0) goto L_0x0575
            r1 = 0
        L_0x054d:
            int r2 = r0 / 2
            if (r1 >= r2) goto L_0x0575
            boolean r2 = r8.mo50498w(r1)
            if (r2 == 0) goto L_0x0572
            com.google.android.gms.internal.measurement.p r2 = r8.mo50491n(r1)
            r3 = 0
            r8.mo50497v(r1, r3)
            int r3 = r0 + -1
            int r3 = r3 - r1
            boolean r4 = r8.mo50498w(r3)
            if (r4 == 0) goto L_0x056f
            com.google.android.gms.internal.measurement.p r4 = r8.mo50491n(r3)
            r8.mo50497v(r1, r4)
        L_0x056f:
            r8.mo50497v(r3, r2)
        L_0x0572:
            int r1 = r1 + 1
            goto L_0x054d
        L_0x0575:
            r1 = r8
            r2 = r1
            goto L_0x08d8
        L_0x0579:
            r8 = r25
            r3 = r27
            r5 = r28
            r0 = 0
            com.google.android.gms.internal.measurement.p r0 = androidx.compose.foundation.layout.C0761x.m1728i1(r8, r3, r5, r0)
            goto L_0x06bf
        L_0x0586:
            r8 = r25
            r3 = r27
            r5 = r28
            r0 = 1
            com.google.android.gms.internal.measurement.p r0 = androidx.compose.foundation.layout.C0761x.m1728i1(r8, r3, r5, r0)
            goto L_0x06bf
        L_0x0593:
            r8 = r25
            r3 = r27
            r5 = r28
            boolean r0 = r28.isEmpty()
            if (r0 != 0) goto L_0x05bb
            java.util.Iterator r0 = r28.iterator()
        L_0x05a3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x05bb
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.p r1 = (com.google.android.gms.internal.measurement.C14763p) r1
            com.google.android.gms.internal.measurement.p r1 = r3.mo50400c(r1)
            int r2 = r25.mo50490m()
            r8.mo50497v(r2, r1)
            goto L_0x05a3
        L_0x05bb:
            com.google.android.gms.internal.measurement.i r0 = new com.google.android.gms.internal.measurement.i
            int r1 = r25.mo50490m()
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            goto L_0x06bf
        L_0x05cb:
            r8 = r25
            r5 = r28
            r0 = 0
            kotlin.jvm.internal.C19388s.m32840P0(r4, r5, r0)
            int r0 = r25.mo50490m()
            if (r0 != 0) goto L_0x05dd
            com.google.android.gms.internal.measurement.u r0 = com.google.android.gms.internal.measurement.C14763p.f33033g0
            goto L_0x06bf
        L_0x05dd:
            int r0 = r0 + -1
            com.google.android.gms.internal.measurement.p r1 = r8.mo50491n(r0)
            r8.mo50495s(r0)
            goto L_0x06d5
        L_0x05e8:
            r8 = r25
            r3 = r27
            r5 = r28
            r0 = 0
            r2 = 1
            kotlin.jvm.internal.C19388s.m32840P0(r15, r5, r2)
            java.lang.Object r0 = r5.get(r0)
            com.google.android.gms.internal.measurement.p r0 = (com.google.android.gms.internal.measurement.C14763p) r0
            com.google.android.gms.internal.measurement.p r0 = r3.mo50400c(r0)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.C14750o
            if (r2 == 0) goto L_0x0617
            int r1 = r25.mo50490m()
            if (r1 != 0) goto L_0x060e
            com.google.android.gms.internal.measurement.f r0 = new com.google.android.gms.internal.measurement.f
            r0.<init>()
            goto L_0x06bf
        L_0x060e:
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.C14750o) r0
            r1 = 0
            com.google.android.gms.internal.measurement.f r0 = androidx.compose.foundation.layout.C0761x.m1723g1(r8, r3, r0, r1, r1)
            goto L_0x06bf
        L_0x0617:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x061d:
            r8 = r25
            r3 = r27
            r5 = r28
            r0 = 2
            kotlin.jvm.internal.C19388s.m32844R0(r14, r5, r0)
            com.google.android.gms.internal.measurement.u r0 = com.google.android.gms.internal.measurement.C14763p.f33033g0
            boolean r1 = r28.isEmpty()
            if (r1 != 0) goto L_0x063a
            r0 = 0
            java.lang.Object r0 = r5.get(r0)
            com.google.android.gms.internal.measurement.p r0 = (com.google.android.gms.internal.measurement.C14763p) r0
            com.google.android.gms.internal.measurement.p r0 = r3.mo50400c(r0)
        L_0x063a:
            int r1 = r25.mo50490m()
            int r1 = r1 + -1
            double r1 = (double) r1
            int r4 = r28.size()
            r6 = 1
            if (r4 <= r6) goto L_0x067e
            java.lang.Object r1 = r5.get(r6)
            com.google.android.gms.internal.measurement.p r1 = (com.google.android.gms.internal.measurement.C14763p) r1
            com.google.android.gms.internal.measurement.p r1 = r3.mo50400c(r1)
            java.lang.Double r2 = r1.zzh()
            double r2 = r2.doubleValue()
            boolean r2 = java.lang.Double.isNaN(r2)
            if (r2 == 0) goto L_0x0668
            int r1 = r25.mo50490m()
            int r1 = r1 + -1
            double r1 = (double) r1
            goto L_0x0674
        L_0x0668:
            java.lang.Double r1 = r1.zzh()
            double r1 = r1.doubleValue()
            double r1 = kotlin.jvm.internal.C19388s.m32826I0(r1)
        L_0x0674:
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x067e
            int r3 = r25.mo50490m()
            double r3 = (double) r3
            double r1 = r1 + r3
        L_0x067e:
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x068c
            com.google.android.gms.internal.measurement.i r0 = new com.google.android.gms.internal.measurement.i
            java.lang.Double r1 = java.lang.Double.valueOf(r16)
            r0.<init>(r1)
            goto L_0x06bf
        L_0x068c:
            int r3 = r25.mo50490m()
            double r3 = (double) r3
            double r1 = java.lang.Math.min(r3, r1)
            int r1 = (int) r1
        L_0x0696:
            if (r1 < 0) goto L_0x06b6
            boolean r2 = r8.mo50498w(r1)
            if (r2 == 0) goto L_0x06b3
            com.google.android.gms.internal.measurement.p r2 = r8.mo50491n(r1)
            boolean r2 = kotlin.jvm.internal.C19388s.m32848T0(r2, r0)
            if (r2 == 0) goto L_0x06b3
            com.google.android.gms.internal.measurement.i r0 = new com.google.android.gms.internal.measurement.i
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            goto L_0x06bf
        L_0x06b3:
            int r1 = r1 + -1
            goto L_0x0696
        L_0x06b6:
            com.google.android.gms.internal.measurement.i r0 = new com.google.android.gms.internal.measurement.i
            java.lang.Double r1 = java.lang.Double.valueOf(r16)
            r0.<init>(r1)
        L_0x06bf:
            r1 = r0
            goto L_0x06d5
        L_0x06c1:
            r8 = r25
            r3 = r27
            r5 = r28
            r0 = 1
            r1 = r21
            kotlin.jvm.internal.C19388s.m32844R0(r1, r5, r0)
            int r0 = r25.mo50490m()
            if (r0 != 0) goto L_0x06d8
            com.google.android.gms.internal.measurement.t r1 = com.google.android.gms.internal.measurement.C14763p.f33040o0
        L_0x06d5:
            r2 = r8
            goto L_0x08d8
        L_0x06d8:
            int r0 = r28.size()
            if (r0 <= 0) goto L_0x06f9
            r0 = 0
            java.lang.Object r0 = r5.get(r0)
            com.google.android.gms.internal.measurement.p r0 = (com.google.android.gms.internal.measurement.C14763p) r0
            com.google.android.gms.internal.measurement.p r0 = r3.mo50400c(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C14737n
            if (r1 != 0) goto L_0x06f7
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C14825u
            if (r1 == 0) goto L_0x06f2
            goto L_0x06f7
        L_0x06f2:
            java.lang.String r7 = r0.zzi()
            goto L_0x06f9
        L_0x06f7:
            java.lang.String r7 = ""
        L_0x06f9:
            com.google.android.gms.internal.measurement.t r1 = new com.google.android.gms.internal.measurement.t
            java.lang.String r0 = r8.mo50492o(r7)
            r1.<init>(r0)
            goto L_0x06d5
        L_0x0703:
            r8 = r25
            r3 = r27
            r5 = r28
            r0 = 2
            kotlin.jvm.internal.C19388s.m32844R0(r2, r5, r0)
            com.google.android.gms.internal.measurement.u r0 = com.google.android.gms.internal.measurement.C14763p.f33033g0
            boolean r1 = r28.isEmpty()
            if (r1 != 0) goto L_0x0720
            r0 = 0
            java.lang.Object r0 = r5.get(r0)
            com.google.android.gms.internal.measurement.p r0 = (com.google.android.gms.internal.measurement.C14763p) r0
            com.google.android.gms.internal.measurement.p r0 = r3.mo50400c(r0)
        L_0x0720:
            int r1 = r28.size()
            r2 = 1
            if (r1 <= r2) goto L_0x075d
            java.lang.Object r1 = r5.get(r2)
            com.google.android.gms.internal.measurement.p r1 = (com.google.android.gms.internal.measurement.C14763p) r1
            com.google.android.gms.internal.measurement.p r1 = r3.mo50400c(r1)
            java.lang.Double r1 = r1.zzh()
            double r1 = r1.doubleValue()
            double r1 = kotlin.jvm.internal.C19388s.m32826I0(r1)
            int r3 = r25.mo50490m()
            double r3 = (double) r3
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0750
            com.google.android.gms.internal.measurement.i r1 = new com.google.android.gms.internal.measurement.i
            java.lang.Double r0 = java.lang.Double.valueOf(r16)
            r1.<init>(r0)
            goto L_0x06d5
        L_0x0750:
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x075c
            int r3 = r25.mo50490m()
            double r3 = (double) r3
            double r12 = r3 + r1
            goto L_0x075d
        L_0x075c:
            r12 = r1
        L_0x075d:
            java.util.Iterator r1 = r25.mo50493p()
        L_0x0761:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x078b
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            double r3 = (double) r2
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 < 0) goto L_0x0761
            com.google.android.gms.internal.measurement.p r2 = r8.mo50491n(r2)
            boolean r2 = kotlin.jvm.internal.C19388s.m32848T0(r2, r0)
            if (r2 == 0) goto L_0x0761
            com.google.android.gms.internal.measurement.i r1 = new com.google.android.gms.internal.measurement.i
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            r1.<init>(r0)
            goto L_0x06d5
        L_0x078b:
            com.google.android.gms.internal.measurement.i r1 = new com.google.android.gms.internal.measurement.i
            java.lang.Double r0 = java.lang.Double.valueOf(r16)
            r1.<init>(r0)
            goto L_0x06d5
        L_0x0796:
            r8 = r25
            r3 = r27
            r5 = r28
            r0 = 1
            r2 = r18
            kotlin.jvm.internal.C19388s.m32840P0(r2, r5, r0)
            r0 = 0
            java.lang.Object r0 = r5.get(r0)
            com.google.android.gms.internal.measurement.p r0 = (com.google.android.gms.internal.measurement.C14763p) r0
            com.google.android.gms.internal.measurement.p r0 = r3.mo50400c(r0)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.C14750o
            if (r2 == 0) goto L_0x07c7
            java.util.TreeMap r1 = r8.f32830b
            int r1 = r1.size()
            if (r1 != 0) goto L_0x07bd
            com.google.android.gms.internal.measurement.u r1 = com.google.android.gms.internal.measurement.C14763p.f33033g0
            goto L_0x06d5
        L_0x07bd:
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.C14750o) r0
            r1 = 0
            androidx.compose.foundation.layout.C0761x.m1723g1(r8, r3, r0, r1, r1)
            com.google.android.gms.internal.measurement.u r1 = com.google.android.gms.internal.measurement.C14763p.f33033g0
            goto L_0x06d5
        L_0x07c7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x07cd:
            r8 = r25
            r3 = r27
            r0 = r28
            r2 = 1
            kotlin.jvm.internal.C19388s.m32840P0(r5, r0, r2)
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.measurement.p r0 = (com.google.android.gms.internal.measurement.C14763p) r0
            com.google.android.gms.internal.measurement.p r0 = r3.mo50400c(r0)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.C14750o
            if (r2 == 0) goto L_0x082d
            java.util.TreeMap r1 = r8.f32830b
            int r1 = r1.size()
            if (r1 != 0) goto L_0x07f5
            com.google.android.gms.internal.measurement.f r1 = new com.google.android.gms.internal.measurement.f
            r1.<init>()
            goto L_0x06d5
        L_0x07f5:
            com.google.android.gms.internal.measurement.p r1 = r25.zzd()
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.C14750o) r0
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r4 = 0
            com.google.android.gms.internal.measurement.f r0 = androidx.compose.foundation.layout.C0761x.m1723g1(r8, r3, r0, r4, r2)
            com.google.android.gms.internal.measurement.f r2 = new com.google.android.gms.internal.measurement.f
            r2.<init>()
            java.util.Iterator r0 = r0.mo50493p()
        L_0x080b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x082a
            java.lang.Object r3 = r0.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = r1
            com.google.android.gms.internal.measurement.f r4 = (com.google.android.gms.internal.measurement.C14633f) r4
            com.google.android.gms.internal.measurement.p r3 = r4.mo50491n(r3)
            int r4 = r2.mo50490m()
            r2.mo50497v(r4, r3)
            goto L_0x080b
        L_0x082a:
            r1 = r2
            goto L_0x06d5
        L_0x082d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0833:
            r2 = r25
            r3 = r27
            r0 = r28
            r4 = 1
            kotlin.jvm.internal.C19388s.m32840P0(r8, r0, r4)
            r4 = 0
            java.lang.Object r0 = r0.get(r4)
            com.google.android.gms.internal.measurement.p r0 = (com.google.android.gms.internal.measurement.C14763p) r0
            com.google.android.gms.internal.measurement.p r0 = r3.mo50400c(r0)
            boolean r4 = r0 instanceof com.google.android.gms.internal.measurement.C14750o
            if (r4 == 0) goto L_0x0870
            int r1 = r25.mo50490m()
            if (r1 != 0) goto L_0x0856
            com.google.android.gms.internal.measurement.g r1 = com.google.android.gms.internal.measurement.C14763p.f33038m0
            goto L_0x08d8
        L_0x0856:
            com.google.android.gms.internal.measurement.o r0 = (com.google.android.gms.internal.measurement.C14750o) r0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            com.google.android.gms.internal.measurement.f r0 = androidx.compose.foundation.layout.C0761x.m1723g1(r2, r3, r0, r1, r4)
            int r0 = r0.mo50490m()
            int r1 = r25.mo50490m()
            if (r0 == r1) goto L_0x086d
            com.google.android.gms.internal.measurement.g r1 = com.google.android.gms.internal.measurement.C14763p.f33039n0
            goto L_0x08d8
        L_0x086d:
            com.google.android.gms.internal.measurement.g r1 = com.google.android.gms.internal.measurement.C14763p.f33038m0
            goto L_0x08d8
        L_0x0870:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0876:
            r2 = r25
            r3 = r27
            r0 = r28
            com.google.android.gms.internal.measurement.p r1 = r25.zzd()
            boolean r4 = r28.isEmpty()
            if (r4 != 0) goto L_0x08d8
            java.util.Iterator r0 = r28.iterator()
        L_0x088a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x08d8
            java.lang.Object r4 = r0.next()
            com.google.android.gms.internal.measurement.p r4 = (com.google.android.gms.internal.measurement.C14763p) r4
            com.google.android.gms.internal.measurement.p r4 = r3.mo50400c(r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.measurement.C14659h
            if (r5 != 0) goto L_0x08d0
            r5 = r1
            com.google.android.gms.internal.measurement.f r5 = (com.google.android.gms.internal.measurement.C14633f) r5
            int r6 = r5.mo50490m()
            boolean r7 = r4 instanceof com.google.android.gms.internal.measurement.C14633f
            if (r7 == 0) goto L_0x08cc
            com.google.android.gms.internal.measurement.f r4 = (com.google.android.gms.internal.measurement.C14633f) r4
            java.util.Iterator r7 = r4.mo50493p()
        L_0x08af:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x088a
            java.lang.Object r8 = r7.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r9 = r8.intValue()
            int r8 = r8.intValue()
            com.google.android.gms.internal.measurement.p r8 = r4.mo50491n(r8)
            int r9 = r9 + r6
            r5.mo50497v(r9, r8)
            goto L_0x08af
        L_0x08cc:
            r5.mo50497v(r6, r4)
            goto L_0x088a
        L_0x08d0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Failed evaluation of arguments"
            r0.<init>(r1)
            throw r0
        L_0x08d8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C14633f.mo50486g(java.lang.String, com.google.android.gms.internal.measurement.c3, java.util.ArrayList):com.google.android.gms.internal.measurement.p");
    }

    public final int hashCode() {
        return this.f32830b.hashCode() * 31;
    }

    public final Iterator<C14763p> iterator() {
        return new C14620e(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r3 = (com.google.android.gms.internal.measurement.C14763p) r2.f32831c.get(r3);
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C14763p mo50489l(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "length"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0017
            com.google.android.gms.internal.measurement.i r3 = new com.google.android.gms.internal.measurement.i
            int r0 = r2.mo50490m()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3.<init>(r0)
            return r3
        L_0x0017:
            boolean r0 = r2.mo50483c(r3)
            if (r0 == 0) goto L_0x0028
            java.util.TreeMap r0 = r2.f32831c
            java.lang.Object r3 = r0.get(r3)
            com.google.android.gms.internal.measurement.p r3 = (com.google.android.gms.internal.measurement.C14763p) r3
            if (r3 == 0) goto L_0x0028
            return r3
        L_0x0028:
            com.google.android.gms.internal.measurement.u r3 = com.google.android.gms.internal.measurement.C14763p.f33033g0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C14633f.mo50489l(java.lang.String):com.google.android.gms.internal.measurement.p");
    }

    /* renamed from: m */
    public final int mo50490m() {
        if (this.f32830b.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f32830b.lastKey()).intValue() + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = (com.google.android.gms.internal.measurement.C14763p) r1.f32830b.get(java.lang.Integer.valueOf(r2));
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C14763p mo50491n(int r2) {
        /*
            r1 = this;
            int r0 = r1.mo50490m()
            if (r2 >= r0) goto L_0x001e
            boolean r0 = r1.mo50498w(r2)
            if (r0 == 0) goto L_0x001b
            java.util.TreeMap r0 = r1.f32830b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.measurement.p r2 = (com.google.android.gms.internal.measurement.C14763p) r2
            if (r2 == 0) goto L_0x001b
            return r2
        L_0x001b:
            com.google.android.gms.internal.measurement.u r2 = com.google.android.gms.internal.measurement.C14763p.f33033g0
            return r2
        L_0x001e:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Attempting to get element outside of current array"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C14633f.mo50491n(int):com.google.android.gms.internal.measurement.p");
    }

    /* renamed from: o */
    public final String mo50492o(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f32830b.isEmpty()) {
            for (int i = 0; i < mo50490m(); i++) {
                C14763p n = mo50491n(i);
                sb.append(str);
                if (!(n instanceof C14825u) && !(n instanceof C14737n)) {
                    sb.append(n.zzi());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    /* renamed from: p */
    public final Iterator<Integer> mo50493p() {
        return this.f32830b.keySet().iterator();
    }

    /* renamed from: q */
    public final ArrayList mo50494q() {
        ArrayList arrayList = new ArrayList(mo50490m());
        for (int i = 0; i < mo50490m(); i++) {
            arrayList.add(mo50491n(i));
        }
        return arrayList;
    }

    /* renamed from: s */
    public final void mo50495s(int i) {
        int intValue = ((Integer) this.f32830b.lastKey()).intValue();
        if (i <= intValue && i >= 0) {
            this.f32830b.remove(Integer.valueOf(i));
            if (i == intValue) {
                TreeMap treeMap = this.f32830b;
                int i2 = i - 1;
                Integer valueOf = Integer.valueOf(i2);
                if (!treeMap.containsKey(valueOf) && i2 >= 0) {
                    this.f32830b.put(valueOf, C14763p.f33033g0);
                    return;
                }
                return;
            }
            while (true) {
                i++;
                if (i <= ((Integer) this.f32830b.lastKey()).intValue()) {
                    TreeMap treeMap2 = this.f32830b;
                    Integer valueOf2 = Integer.valueOf(i);
                    C14763p pVar = (C14763p) treeMap2.get(valueOf2);
                    if (pVar != null) {
                        this.f32830b.put(Integer.valueOf(i - 1), pVar);
                        this.f32830b.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final String toString() {
        return mo50492o(",");
    }

    @RequiresNonNull({"elements"})
    /* renamed from: v */
    public final void mo50497v(int i, C14763p pVar) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        } else if (i < 0) {
            throw new IndexOutOfBoundsException(C0072d.m200g(32, "Out of bounds index: ", i));
        } else if (pVar == null) {
            this.f32830b.remove(Integer.valueOf(i));
        } else {
            this.f32830b.put(Integer.valueOf(i), pVar);
        }
    }

    /* renamed from: w */
    public final boolean mo50498w(int i) {
        if (i >= 0 && i <= ((Integer) this.f32830b.lastKey()).intValue()) {
            return this.f32830b.containsKey(Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(C0072d.m200g(32, "Out of bounds index: ", i));
    }

    public final C14763p zzd() {
        C14633f fVar = new C14633f();
        for (Map.Entry entry : this.f32830b.entrySet()) {
            if (entry.getValue() instanceof C14711l) {
                fVar.f32830b.put((Integer) entry.getKey(), (C14763p) entry.getValue());
            } else {
                fVar.f32830b.put((Integer) entry.getKey(), ((C14763p) entry.getValue()).zzd());
            }
        }
        return fVar;
    }

    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    public final Double zzh() {
        return this.f32830b.size() == 1 ? mo50491n(0).zzh() : this.f32830b.size() <= 0 ? Double.valueOf(ShadowDrawableWrapper.COS_45) : Double.valueOf(Double.NaN);
    }

    public final String zzi() {
        return mo50492o(",");
    }

    public C14633f(List<C14763p> list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                mo50497v(i, list.get(i));
            }
        }
    }
}
