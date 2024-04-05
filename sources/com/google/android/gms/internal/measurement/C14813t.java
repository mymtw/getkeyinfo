package com.google.android.gms.internal.measurement;

import com.fasterxml.jackson.core.JsonFactory;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.t */
public final class C14813t implements Iterable<C14763p>, C14763p {

    /* renamed from: b */
    public final String f33085b;

    public C14813t(String str) {
        if (str != null) {
            this.f33085b = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    /* renamed from: a */
    public final Iterator<C14763p> mo50482a() {
        return new C14789r(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14813t)) {
            return false;
        }
        return this.f33085b.equals(((C14813t) obj).f33085b);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0178, code lost:
        throw new java.lang.IllegalArgumentException("Command not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0179, code lost:
        kotlin.jvm.internal.C19388s.m32840P0("toUpperCase", r22, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x018e, code lost:
        kotlin.jvm.internal.C19388s.m32840P0("toUpperCase", r22, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01a5, code lost:
        r2 = r19;
        kotlin.jvm.internal.C19388s.m32840P0("toString", r22, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01af, code lost:
        kotlin.jvm.internal.C19388s.m32840P0(r16, r22, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01c8, code lost:
        kotlin.jvm.internal.C19388s.m32840P0("toLocaleLowerCase", r22, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01de, code lost:
        kotlin.jvm.internal.C19388s.m32840P0(r5, r22, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01f3, code lost:
        r1 = r22;
        kotlin.jvm.internal.C19388s.m32844R0("substring", r1, 2);
        r0 = r19.f33085b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0202, code lost:
        if (r22.size() <= 0) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0204, code lost:
        r4 = r21;
        r3 = (int) kotlin.jvm.internal.C19388s.m32826I0(r4.mo50400c((com.google.android.gms.internal.measurement.C14763p) r1.get(0)).zzh().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x021e, code lost:
        r4 = r21;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0226, code lost:
        if (r22.size() <= 1) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0228, code lost:
        r1 = (int) kotlin.jvm.internal.C19388s.m32826I0(r4.mo50400c((com.google.android.gms.internal.measurement.C14763p) r1.get(1)).zzh().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0240, code lost:
        r1 = r0.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0244, code lost:
        r3 = java.lang.Math.min(java.lang.Math.max(r3, 0), r0.length());
        r1 = java.lang.Math.min(java.lang.Math.max(r1, 0), r0.length());
        r4 = new com.google.android.gms.internal.measurement.C14813t(r0.substring(java.lang.Math.min(r3, r1), java.lang.Math.max(r3, r1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0270, code lost:
        r2 = r19;
        r4 = r21;
        r1 = r22;
        kotlin.jvm.internal.C19388s.m32844R0("split", r1, 2);
        r3 = r2.f33085b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0280, code lost:
        if (r3.length() != 0) goto L_0x0293;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0282, code lost:
        r0 = new com.google.android.gms.internal.measurement.C14633f(java.util.Arrays.asList(new com.google.android.gms.internal.measurement.C14763p[]{r2}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0293, code lost:
        r6 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x029d, code lost:
        if (r22.size() != 0) goto L_0x02a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x029f, code lost:
        r6.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02a4, code lost:
        r5 = r4.mo50400c((com.google.android.gms.internal.measurement.C14763p) r1.get(0)).zzi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02b7, code lost:
        if (r22.size() <= 1) goto L_0x02d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02b9, code lost:
        r7 = kotlin.jvm.internal.C19388s.m32832L0(r4.mo50400c((com.google.android.gms.internal.measurement.C14763p) r1.get(1)).zzh().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02d0, code lost:
        r7 = com.fasterxml.jackson.core.base.ParserMinimalBase.MAX_INT_L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02d7, code lost:
        if (r7 != 0) goto L_0x02e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02d9, code lost:
        r0 = new com.google.android.gms.internal.measurement.C14633f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02e0, code lost:
        r1 = r3.split(java.util.regex.Pattern.quote(r5), ((int) r7) + 1);
        r3 = r1.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02f0, code lost:
        if (r5.equals(r0) == false) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02f2, code lost:
        if (r3 <= 0) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02f4, code lost:
        r4 = r1[0].equals(r0);
        r5 = r3 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0303, code lost:
        if (r1[r5].equals(r0) != false) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0306, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0307, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x030b, code lost:
        if (((long) r3) <= r7) goto L_0x030f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x030d, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x030f, code lost:
        if (r4 >= r5) goto L_0x031e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0311, code lost:
        r6.add(new com.google.android.gms.internal.measurement.C14813t(r1[r4]));
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x031e, code lost:
        r0 = new com.google.android.gms.internal.measurement.C14633f(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0325, code lost:
        r4 = r21;
        r1 = r22;
        kotlin.jvm.internal.C19388s.m32844R0("slice", r1, 2);
        r0 = r19.f33085b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0335, code lost:
        if (r22.size() <= 0) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0337, code lost:
        r5 = r4.mo50400c((com.google.android.gms.internal.measurement.C14763p) r1.get(0)).zzh().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x034b, code lost:
        r5 = com.google.android.material.shadow.ShadowDrawableWrapper.COS_45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x034d, code lost:
        r5 = kotlin.jvm.internal.C19388s.m32826I0(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0355, code lost:
        if (r5 >= com.google.android.material.shadow.ShadowDrawableWrapper.COS_45) goto L_0x0362;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0357, code lost:
        r5 = java.lang.Math.max(((double) r0.length()) + r5, com.google.android.material.shadow.ShadowDrawableWrapper.COS_45);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0362, code lost:
        r5 = java.lang.Math.min(r5, (double) r0.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x036b, code lost:
        r3 = (int) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0371, code lost:
        if (r22.size() <= 1) goto L_0x0386;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0373, code lost:
        r4 = r4.mo50400c((com.google.android.gms.internal.measurement.C14763p) r1.get(1)).zzh().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0386, code lost:
        r4 = (double) r0.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x038b, code lost:
        r4 = kotlin.jvm.internal.C19388s.m32826I0(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0393, code lost:
        if (r4 >= com.google.android.material.shadow.ShadowDrawableWrapper.COS_45) goto L_0x03a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0395, code lost:
        r4 = java.lang.Math.max(((double) r0.length()) + r4, com.google.android.material.shadow.ShadowDrawableWrapper.COS_45);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03a0, code lost:
        r4 = java.lang.Math.min(r4, (double) r0.length());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03a9, code lost:
        r4 = new com.google.android.gms.internal.measurement.C14813t(r0.substring(r3, java.lang.Math.max(0, ((int) r4) - r3) + r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03bc, code lost:
        r4 = r21;
        r1 = r22;
        r2 = r19;
        kotlin.jvm.internal.C19388s.m32844R0("search", r1, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03cc, code lost:
        if (r22.size() <= 0) goto L_0x03dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03ce, code lost:
        r17 = r4.mo50400c((com.google.android.gms.internal.measurement.C14763p) r1.get(0)).zzi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03dc, code lost:
        r0 = java.util.regex.Pattern.compile(r17).matcher(r2.f33085b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03ea, code lost:
        if (r0.find() == false) goto L_0x03fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03fc, code lost:
        r0 = new com.google.android.gms.internal.measurement.C14672i(java.lang.Double.valueOf(-1.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0409, code lost:
        r2 = r19;
        r4 = r21;
        r1 = r22;
        kotlin.jvm.internal.C19388s.m32844R0(com.etsy.android.lib.models.apiv3.vespa.BaseServerDrivenActionResult.TYPE_REPLACE, r1, 2);
        r0 = com.google.android.gms.internal.measurement.C14763p.f33033g0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0419, code lost:
        if (r22.size() <= 0) goto L_0x043b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x041b, code lost:
        r17 = r4.mo50400c((com.google.android.gms.internal.measurement.C14763p) r1.get(0)).zzi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x042f, code lost:
        if (r22.size() <= 1) goto L_0x043b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0431, code lost:
        r0 = r4.mo50400c((com.google.android.gms.internal.measurement.C14763p) r1.get(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x043b, code lost:
        r1 = r17;
        r3 = r2.f33085b;
        r5 = r3.indexOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0443, code lost:
        if (r5 < 0) goto L_0x062b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0447, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.C14685j) == false) goto L_0x046e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0449, code lost:
        r0 = ((com.google.android.gms.internal.measurement.C14685j) r0).mo50553b(r4, java.util.Arrays.asList(new com.google.android.gms.internal.measurement.C14763p[]{new com.google.android.gms.internal.measurement.C14813t(r1), new com.google.android.gms.internal.measurement.C14672i(java.lang.Double.valueOf((double) r5)), r2}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x046e, code lost:
        r6 = r3.substring(0, r5);
        r0 = r0.zzi();
        r1 = r3.substring(r1.length() + r5);
        r4 = new com.google.android.gms.internal.measurement.C14813t(android.support.p013v4.media.C0070b.m184f(new java.lang.StringBuilder((java.lang.String.valueOf(r6).length() + java.lang.String.valueOf(r0).length()) + java.lang.String.valueOf(r1).length()), r6, r0, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04aa, code lost:
        r4 = r21;
        r1 = r22;
        kotlin.jvm.internal.C19388s.m32844R0("match", r1, 1);
        r3 = r19.f33085b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04ba, code lost:
        if (r22.size() > 0) goto L_0x04bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04bd, code lost:
        r0 = r4.mo50400c((com.google.android.gms.internal.measurement.C14763p) r1.get(0)).zzi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04cc, code lost:
        r0 = java.util.regex.Pattern.compile(r0).matcher(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04d8, code lost:
        if (r0.find() == false) goto L_0x04f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x04f4, code lost:
        r0 = com.google.android.gms.internal.measurement.C14763p.f33034h0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x04f8, code lost:
        r4 = r21;
        r1 = r22;
        kotlin.jvm.internal.C19388s.m32844R0("lastIndexOf", r1, 2);
        r5 = r19.f33085b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0509, code lost:
        if (r22.size() > 0) goto L_0x050c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x050c, code lost:
        r17 = r4.mo50400c((com.google.android.gms.internal.measurement.C14763p) r1.get(0)).zzi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x051a, code lost:
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0520, code lost:
        if (r22.size() >= 2) goto L_0x0525;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0522, code lost:
        r3 = Double.NaN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0525, code lost:
        r3 = r4.mo50400c((com.google.android.gms.internal.measurement.C14763p) r1.get(1)).zzh().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x053c, code lost:
        if (java.lang.Double.isNaN(r3) == false) goto L_0x0541;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x053e, code lost:
        r3 = Double.POSITIVE_INFINITY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0541, code lost:
        r3 = kotlin.jvm.internal.C19388s.m32826I0(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0556, code lost:
        r4 = r21;
        r1 = r22;
        r5 = com.google.android.material.shadow.ShadowDrawableWrapper.COS_45;
        kotlin.jvm.internal.C19388s.m32844R0("indexOf", r1, 2);
        r3 = r19.f33085b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0568, code lost:
        if (r22.size() > 0) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x056b, code lost:
        r17 = r4.mo50400c((com.google.android.gms.internal.measurement.C14763p) r1.get(0)).zzi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x057a, code lost:
        r7 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0580, code lost:
        if (r22.size() >= 2) goto L_0x0583;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0583, code lost:
        r5 = r4.mo50400c((com.google.android.gms.internal.measurement.C14763p) r1.get(1)).zzh().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0596, code lost:
        r4 = new com.google.android.gms.internal.measurement.C14672i(java.lang.Double.valueOf((double) r3.indexOf(r7, (int) kotlin.jvm.internal.C19388s.m32826I0(r5))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x05ac, code lost:
        r1 = r22;
        kotlin.jvm.internal.C19388s.m32840P0(r7, r1, 1);
        r0 = r19.f33085b;
        r1 = r21.mo50400c((com.google.android.gms.internal.measurement.C14763p) r1.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x05cd, code lost:
        if ("length".equals(r1.zzi()) == false) goto L_0x05d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x05cf, code lost:
        r0 = com.google.android.gms.internal.measurement.C14763p.f33038m0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x05d2, code lost:
        r3 = r1.zzh().doubleValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x05e0, code lost:
        if (r3 != java.lang.Math.floor(r3)) goto L_0x05ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x05e2, code lost:
        r1 = (int) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x05e3, code lost:
        if (r1 < 0) goto L_0x05ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05e9, code lost:
        if (r1 >= r0.length()) goto L_0x05ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x05eb, code lost:
        r0 = com.google.android.gms.internal.measurement.C14763p.f33038m0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05ee, code lost:
        r0 = com.google.android.gms.internal.measurement.C14763p.f33039n0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x05f3, code lost:
        r2 = r19;
        r4 = r21;
        r1 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x05fd, code lost:
        if (r22.size() == 0) goto L_0x062b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05ff, code lost:
        r0 = new java.lang.StringBuilder(r2.f33085b);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x060b, code lost:
        if (r3 >= r22.size()) goto L_0x0621;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x060d, code lost:
        r0.append(r4.mo50400c((com.google.android.gms.internal.measurement.C14763p) r1.get(r3)).zzi());
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x062d, code lost:
        r2 = r19;
        r4 = r21;
        r1 = r22;
        kotlin.jvm.internal.C19388s.m32844R0(r6, r1, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x063b, code lost:
        if (r22.size() <= 0) goto L_0x0656;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x063d, code lost:
        r0 = (int) kotlin.jvm.internal.C19388s.m32826I0(r4.mo50400c((com.google.android.gms.internal.measurement.C14763p) r1.get(0)).zzh().doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0656, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0657, code lost:
        r1 = r2.f33085b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0659, code lost:
        if (r0 < 0) goto L_0x0671;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x065f, code lost:
        if (r0 < r1.length()) goto L_0x0662;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:?, code lost:
        return com.google.android.gms.internal.measurement.C14763p.f33040o0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:?, code lost:
        return new com.google.android.gms.internal.measurement.C14813t(r19.f33085b.trim());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:?, code lost:
        return new com.google.android.gms.internal.measurement.C14813t(r19.f33085b.toUpperCase(java.util.Locale.ENGLISH));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:?, code lost:
        return new com.google.android.gms.internal.measurement.C14813t(r19.f33085b.toLowerCase(java.util.Locale.ENGLISH));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:?, code lost:
        return new com.google.android.gms.internal.measurement.C14813t(r19.f33085b.toLowerCase());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:?, code lost:
        return new com.google.android.gms.internal.measurement.C14813t(r19.f33085b.toUpperCase());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:?, code lost:
        return new com.google.android.gms.internal.measurement.C14672i(java.lang.Double.valueOf((double) r0.start()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:?, code lost:
        return new com.google.android.gms.internal.measurement.C14633f(java.util.Arrays.asList(new com.google.android.gms.internal.measurement.C14763p[]{new com.google.android.gms.internal.measurement.C14813t(r0.group())}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:?, code lost:
        return new com.google.android.gms.internal.measurement.C14672i(java.lang.Double.valueOf((double) r5.lastIndexOf(r0, (int) r3)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:?, code lost:
        return new com.google.android.gms.internal.measurement.C14813t(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:?, code lost:
        return new com.google.android.gms.internal.measurement.C14813t(java.lang.String.valueOf(r1.charAt(r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bc, code lost:
        r6 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0130, code lost:
        r6 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x013c, code lost:
        r7 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0155, code lost:
        r7 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0163, code lost:
        r16 = "toLowerCase";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0166, code lost:
        r1 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0168, code lost:
        r0 = "";
        r17 = "undefined";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x016c, code lost:
        switch(r1) {
            case 0: goto L_0x062d;
            case 1: goto L_0x05f3;
            case 2: goto L_0x05ac;
            case 3: goto L_0x0556;
            case 4: goto L_0x04f8;
            case 5: goto L_0x04aa;
            case 6: goto L_0x0409;
            case 7: goto L_0x03bc;
            case 8: goto L_0x0325;
            case 9: goto L_0x0270;
            case 10: goto L_0x01f3;
            case 11: goto L_0x01de;
            case 12: goto L_0x01c8;
            case 13: goto L_0x01af;
            case 14: goto L_0x01a5;
            case 15: goto L_0x018e;
            case 16: goto L_0x0179;
            default: goto L_0x016f;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x016f, code lost:
        r2 = r19;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0158  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C14763p mo50486g(java.lang.String r20, com.google.android.gms.internal.measurement.C14598c3 r21, java.util.ArrayList r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            java.lang.String r4 = "charAt"
            boolean r5 = r4.equals(r1)
            java.lang.String r6 = "trim"
            java.lang.String r7 = "concat"
            java.lang.String r8 = "indexOf"
            java.lang.String r9 = "replace"
            java.lang.String r10 = "substring"
            java.lang.String r11 = "split"
            java.lang.String r12 = "slice"
            java.lang.String r13 = "match"
            java.lang.String r14 = "lastIndexOf"
            java.lang.String r15 = "toLocaleUpperCase"
            java.lang.String r2 = "search"
            java.lang.String r0 = "toLowerCase"
            java.lang.String r3 = "toLocaleLowerCase"
            r16 = r4
            java.lang.String r4 = "toString"
            r17 = r6
            java.lang.String r6 = "hasOwnProperty"
            r18 = r15
            java.lang.String r15 = "toUpperCase"
            if (r5 != 0) goto L_0x00af
            boolean r5 = r7.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r6.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r8.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r14.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r13.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r9.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r2.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r12.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r11.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r10.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r0.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r3.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r4.equals(r1)
            if (r5 != 0) goto L_0x00af
            boolean r5 = r15.equals(r1)
            if (r5 != 0) goto L_0x00af
            r5 = r18
            boolean r18 = r5.equals(r1)
            if (r18 != 0) goto L_0x00b1
            r18 = r6
            r6 = r17
            boolean r17 = r6.equals(r1)
            if (r17 == 0) goto L_0x009d
            goto L_0x00b5
        L_0x009d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "%s is not a String function"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
        L_0x00af:
            r5 = r18
        L_0x00b1:
            r18 = r6
            r6 = r17
        L_0x00b5:
            int r17 = r20.hashCode()
            switch(r17) {
                case -1789698943: goto L_0x0158;
                case -1776922004: goto L_0x014a;
                case -1464939364: goto L_0x013f;
                case -1361633751: goto L_0x0133;
                case -1354795244: goto L_0x0129;
                case -1137582698: goto L_0x0120;
                case -906336856: goto L_0x0118;
                case -726908483: goto L_0x010f;
                case -467511597: goto L_0x0107;
                case -399551817: goto L_0x00fe;
                case 3568674: goto L_0x00f5;
                case 103668165: goto L_0x00ed;
                case 109526418: goto L_0x00e4;
                case 109648666: goto L_0x00db;
                case 530542161: goto L_0x00d2;
                case 1094496948: goto L_0x00c9;
                case 1943291465: goto L_0x00c0;
                default: goto L_0x00bc;
            }
        L_0x00bc:
            r6 = r16
            goto L_0x0155
        L_0x00c0:
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x00bc
            r1 = 3
            goto L_0x0130
        L_0x00c9:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x00bc
            r1 = 6
            goto L_0x0130
        L_0x00d2:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x00bc
            r1 = 10
            goto L_0x0130
        L_0x00db:
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x00bc
            r1 = 9
            goto L_0x0130
        L_0x00e4:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x00bc
            r1 = 8
            goto L_0x0130
        L_0x00ed:
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x00bc
            r1 = 5
            goto L_0x0130
        L_0x00f5:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00bc
            r1 = 16
            goto L_0x0130
        L_0x00fe:
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x00bc
            r1 = 15
            goto L_0x0130
        L_0x0107:
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L_0x00bc
            r1 = 4
            goto L_0x0130
        L_0x010f:
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00bc
            r1 = 11
            goto L_0x0130
        L_0x0118:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00bc
            r1 = 7
            goto L_0x0130
        L_0x0120:
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00bc
            r1 = 13
            goto L_0x0130
        L_0x0129:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x00bc
            r1 = 1
        L_0x0130:
            r6 = r16
            goto L_0x013c
        L_0x0133:
            r6 = r16
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0155
            r1 = 0
        L_0x013c:
            r7 = r18
            goto L_0x0163
        L_0x013f:
            r6 = r16
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0155
            r1 = 12
            goto L_0x013c
        L_0x014a:
            r6 = r16
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0155
            r1 = 14
            goto L_0x013c
        L_0x0155:
            r7 = r18
            goto L_0x0166
        L_0x0158:
            r6 = r16
            r7 = r18
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0166
            r1 = 2
        L_0x0163:
            r16 = r0
            goto L_0x0168
        L_0x0166:
            r1 = -1
            goto L_0x0163
        L_0x0168:
            java.lang.String r0 = ""
            java.lang.String r17 = "undefined"
            switch(r1) {
                case 0: goto L_0x062d;
                case 1: goto L_0x05f3;
                case 2: goto L_0x05ac;
                case 3: goto L_0x0556;
                case 4: goto L_0x04f8;
                case 5: goto L_0x04aa;
                case 6: goto L_0x0409;
                case 7: goto L_0x03bc;
                case 8: goto L_0x0325;
                case 9: goto L_0x0270;
                case 10: goto L_0x01f3;
                case 11: goto L_0x01de;
                case 12: goto L_0x01c8;
                case 13: goto L_0x01af;
                case 14: goto L_0x01a5;
                case 15: goto L_0x018e;
                case 16: goto L_0x0179;
                default: goto L_0x016f;
            }
        L_0x016f:
            r2 = r19
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Command not supported"
            r0.<init>(r1)
            throw r0
        L_0x0179:
            r0 = 0
            r1 = r22
            kotlin.jvm.internal.C19388s.m32840P0(r15, r1, r0)
            r2 = r19
            java.lang.String r0 = r2.f33085b
            com.google.android.gms.internal.measurement.t r1 = new com.google.android.gms.internal.measurement.t
            java.lang.String r0 = r0.trim()
            r1.<init>(r0)
            goto L_0x0673
        L_0x018e:
            r2 = r19
            r1 = r22
            r0 = 0
            kotlin.jvm.internal.C19388s.m32840P0(r15, r1, r0)
            java.lang.String r0 = r2.f33085b
            com.google.android.gms.internal.measurement.t r1 = new com.google.android.gms.internal.measurement.t
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toUpperCase(r3)
            r1.<init>(r0)
            goto L_0x0673
        L_0x01a5:
            r2 = r19
            r1 = r22
            r0 = 0
            kotlin.jvm.internal.C19388s.m32840P0(r4, r1, r0)
            goto L_0x062b
        L_0x01af:
            r2 = r19
            r1 = r22
            r0 = r16
            r3 = 0
            kotlin.jvm.internal.C19388s.m32840P0(r0, r1, r3)
            java.lang.String r0 = r2.f33085b
            com.google.android.gms.internal.measurement.t r1 = new com.google.android.gms.internal.measurement.t
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toLowerCase(r3)
            r1.<init>(r0)
            goto L_0x0673
        L_0x01c8:
            r2 = r19
            r1 = r22
            r0 = r3
            r3 = 0
            kotlin.jvm.internal.C19388s.m32840P0(r0, r1, r3)
            java.lang.String r0 = r2.f33085b
            com.google.android.gms.internal.measurement.t r1 = new com.google.android.gms.internal.measurement.t
            java.lang.String r0 = r0.toLowerCase()
            r1.<init>(r0)
            goto L_0x0673
        L_0x01de:
            r2 = r19
            r1 = r22
            r0 = 0
            kotlin.jvm.internal.C19388s.m32840P0(r5, r1, r0)
            java.lang.String r0 = r2.f33085b
            com.google.android.gms.internal.measurement.t r1 = new com.google.android.gms.internal.measurement.t
            java.lang.String r0 = r0.toUpperCase()
            r1.<init>(r0)
            goto L_0x0673
        L_0x01f3:
            r2 = r19
            r1 = r22
            r0 = 2
            r3 = 0
            kotlin.jvm.internal.C19388s.m32844R0(r10, r1, r0)
            java.lang.String r0 = r2.f33085b
            int r4 = r22.size()
            if (r4 <= 0) goto L_0x021e
            java.lang.Object r3 = r1.get(r3)
            com.google.android.gms.internal.measurement.p r3 = (com.google.android.gms.internal.measurement.C14763p) r3
            r4 = r21
            com.google.android.gms.internal.measurement.p r3 = r4.mo50400c(r3)
            java.lang.Double r3 = r3.zzh()
            double r5 = r3.doubleValue()
            double r5 = kotlin.jvm.internal.C19388s.m32826I0(r5)
            int r3 = (int) r5
            goto L_0x0221
        L_0x021e:
            r4 = r21
            r3 = 0
        L_0x0221:
            int r5 = r22.size()
            r6 = 1
            if (r5 <= r6) goto L_0x0240
            java.lang.Object r1 = r1.get(r6)
            com.google.android.gms.internal.measurement.p r1 = (com.google.android.gms.internal.measurement.C14763p) r1
            com.google.android.gms.internal.measurement.p r1 = r4.mo50400c(r1)
            java.lang.Double r1 = r1.zzh()
            double r4 = r1.doubleValue()
            double r4 = kotlin.jvm.internal.C19388s.m32826I0(r4)
            int r1 = (int) r4
            goto L_0x0244
        L_0x0240:
            int r1 = r0.length()
        L_0x0244:
            r4 = 0
            int r3 = java.lang.Math.max(r3, r4)
            int r5 = r0.length()
            int r3 = java.lang.Math.min(r3, r5)
            int r1 = java.lang.Math.max(r1, r4)
            int r4 = r0.length()
            int r1 = java.lang.Math.min(r1, r4)
            com.google.android.gms.internal.measurement.t r4 = new com.google.android.gms.internal.measurement.t
            int r5 = java.lang.Math.min(r3, r1)
            int r1 = java.lang.Math.max(r3, r1)
            java.lang.String r0 = r0.substring(r5, r1)
            r4.<init>(r0)
            goto L_0x05a9
        L_0x0270:
            r2 = r19
            r4 = r21
            r1 = r22
            r3 = 2
            kotlin.jvm.internal.C19388s.m32844R0(r11, r1, r3)
            java.lang.String r3 = r2.f33085b
            int r5 = r3.length()
            if (r5 != 0) goto L_0x0293
            com.google.android.gms.internal.measurement.f r0 = new com.google.android.gms.internal.measurement.f
            r1 = 1
            com.google.android.gms.internal.measurement.p[] r1 = new com.google.android.gms.internal.measurement.C14763p[r1]
            r3 = 0
            r1[r3] = r2
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            goto L_0x05f0
        L_0x0293:
            r5 = 0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r7 = r22.size()
            if (r7 != 0) goto L_0x02a4
            r6.add(r2)
            goto L_0x031e
        L_0x02a4:
            java.lang.Object r5 = r1.get(r5)
            com.google.android.gms.internal.measurement.p r5 = (com.google.android.gms.internal.measurement.C14763p) r5
            com.google.android.gms.internal.measurement.p r5 = r4.mo50400c(r5)
            java.lang.String r5 = r5.zzi()
            int r7 = r22.size()
            r8 = 1
            if (r7 <= r8) goto L_0x02d0
            java.lang.Object r1 = r1.get(r8)
            com.google.android.gms.internal.measurement.p r1 = (com.google.android.gms.internal.measurement.C14763p) r1
            com.google.android.gms.internal.measurement.p r1 = r4.mo50400c(r1)
            java.lang.Double r1 = r1.zzh()
            double r7 = r1.doubleValue()
            long r7 = kotlin.jvm.internal.C19388s.m32832L0(r7)
            goto L_0x02d3
        L_0x02d0:
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
        L_0x02d3:
            r9 = 0
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x02e0
            com.google.android.gms.internal.measurement.f r0 = new com.google.android.gms.internal.measurement.f
            r0.<init>()
            goto L_0x05f0
        L_0x02e0:
            java.lang.String r1 = java.util.regex.Pattern.quote(r5)
            int r4 = (int) r7
            int r4 = r4 + 1
            java.lang.String[] r1 = r3.split(r1, r4)
            int r3 = r1.length
            boolean r4 = r5.equals(r0)
            if (r4 == 0) goto L_0x0306
            if (r3 <= 0) goto L_0x0306
            r4 = 0
            r4 = r1[r4]
            boolean r4 = r4.equals(r0)
            int r5 = r3 + -1
            r9 = r1[r5]
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0308
            goto L_0x0307
        L_0x0306:
            r4 = 0
        L_0x0307:
            r5 = r3
        L_0x0308:
            long r9 = (long) r3
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x030f
            int r5 = r5 + -1
        L_0x030f:
            if (r4 >= r5) goto L_0x031e
            com.google.android.gms.internal.measurement.t r0 = new com.google.android.gms.internal.measurement.t
            r3 = r1[r4]
            r0.<init>(r3)
            r6.add(r0)
            int r4 = r4 + 1
            goto L_0x030f
        L_0x031e:
            com.google.android.gms.internal.measurement.f r0 = new com.google.android.gms.internal.measurement.f
            r0.<init>(r6)
            goto L_0x05f0
        L_0x0325:
            r2 = r19
            r4 = r21
            r1 = r22
            r0 = 2
            kotlin.jvm.internal.C19388s.m32844R0(r12, r1, r0)
            java.lang.String r0 = r2.f33085b
            int r3 = r22.size()
            if (r3 <= 0) goto L_0x034b
            r3 = 0
            java.lang.Object r3 = r1.get(r3)
            com.google.android.gms.internal.measurement.p r3 = (com.google.android.gms.internal.measurement.C14763p) r3
            com.google.android.gms.internal.measurement.p r3 = r4.mo50400c(r3)
            java.lang.Double r3 = r3.zzh()
            double r5 = r3.doubleValue()
            goto L_0x034d
        L_0x034b:
            r5 = 0
        L_0x034d:
            double r5 = kotlin.jvm.internal.C19388s.m32826I0(r5)
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x0362
            int r3 = r0.length()
            double r9 = (double) r3
            double r9 = r9 + r5
            double r5 = java.lang.Math.max(r9, r7)
            goto L_0x036b
        L_0x0362:
            int r3 = r0.length()
            double r7 = (double) r3
            double r5 = java.lang.Math.min(r5, r7)
        L_0x036b:
            int r3 = (int) r5
            int r5 = r22.size()
            r6 = 1
            if (r5 <= r6) goto L_0x0386
            java.lang.Object r1 = r1.get(r6)
            com.google.android.gms.internal.measurement.p r1 = (com.google.android.gms.internal.measurement.C14763p) r1
            com.google.android.gms.internal.measurement.p r1 = r4.mo50400c(r1)
            java.lang.Double r1 = r1.zzh()
            double r4 = r1.doubleValue()
            goto L_0x038b
        L_0x0386:
            int r1 = r0.length()
            double r4 = (double) r1
        L_0x038b:
            double r4 = kotlin.jvm.internal.C19388s.m32826I0(r4)
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x03a0
            int r1 = r0.length()
            double r8 = (double) r1
            double r8 = r8 + r4
            double r4 = java.lang.Math.max(r8, r6)
            goto L_0x03a9
        L_0x03a0:
            int r1 = r0.length()
            double r6 = (double) r1
            double r4 = java.lang.Math.min(r4, r6)
        L_0x03a9:
            int r1 = (int) r4
            int r1 = r1 - r3
            r4 = 0
            int r1 = java.lang.Math.max(r4, r1)
            com.google.android.gms.internal.measurement.t r4 = new com.google.android.gms.internal.measurement.t
            int r1 = r1 + r3
            java.lang.String r0 = r0.substring(r3, r1)
            r4.<init>(r0)
            goto L_0x05a9
        L_0x03bc:
            r4 = r21
            r1 = r22
            r0 = r2
            r2 = r19
            r3 = 1
            r5 = 0
            kotlin.jvm.internal.C19388s.m32844R0(r0, r1, r3)
            int r0 = r22.size()
            if (r0 <= 0) goto L_0x03dc
            java.lang.Object r0 = r1.get(r5)
            com.google.android.gms.internal.measurement.p r0 = (com.google.android.gms.internal.measurement.C14763p) r0
            com.google.android.gms.internal.measurement.p r0 = r4.mo50400c(r0)
            java.lang.String r17 = r0.zzi()
        L_0x03dc:
            java.lang.String r0 = r2.f33085b
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r17)
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r1 = r0.find()
            if (r1 == 0) goto L_0x03fc
            com.google.android.gms.internal.measurement.i r1 = new com.google.android.gms.internal.measurement.i
            int r0 = r0.start()
            double r3 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            r1.<init>(r0)
            goto L_0x0673
        L_0x03fc:
            com.google.android.gms.internal.measurement.i r0 = new com.google.android.gms.internal.measurement.i
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r0.<init>(r1)
            goto L_0x05f0
        L_0x0409:
            r2 = r19
            r4 = r21
            r1 = r22
            r0 = 2
            kotlin.jvm.internal.C19388s.m32844R0(r9, r1, r0)
            com.google.android.gms.internal.measurement.u r0 = com.google.android.gms.internal.measurement.C14763p.f33033g0
            int r3 = r22.size()
            if (r3 <= 0) goto L_0x043b
            r3 = 0
            java.lang.Object r3 = r1.get(r3)
            com.google.android.gms.internal.measurement.p r3 = (com.google.android.gms.internal.measurement.C14763p) r3
            com.google.android.gms.internal.measurement.p r3 = r4.mo50400c(r3)
            java.lang.String r17 = r3.zzi()
            int r3 = r22.size()
            r5 = 1
            if (r3 <= r5) goto L_0x043b
            java.lang.Object r0 = r1.get(r5)
            com.google.android.gms.internal.measurement.p r0 = (com.google.android.gms.internal.measurement.C14763p) r0
            com.google.android.gms.internal.measurement.p r0 = r4.mo50400c(r0)
        L_0x043b:
            r1 = r17
            java.lang.String r3 = r2.f33085b
            int r5 = r3.indexOf(r1)
            if (r5 < 0) goto L_0x062b
            boolean r6 = r0 instanceof com.google.android.gms.internal.measurement.C14685j
            if (r6 == 0) goto L_0x046e
            com.google.android.gms.internal.measurement.j r0 = (com.google.android.gms.internal.measurement.C14685j) r0
            r6 = 3
            com.google.android.gms.internal.measurement.p[] r6 = new com.google.android.gms.internal.measurement.C14763p[r6]
            com.google.android.gms.internal.measurement.t r7 = new com.google.android.gms.internal.measurement.t
            r7.<init>(r1)
            r8 = 0
            r6[r8] = r7
            com.google.android.gms.internal.measurement.i r7 = new com.google.android.gms.internal.measurement.i
            double r8 = (double) r5
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            r7.<init>(r8)
            r8 = 1
            r6[r8] = r7
            r7 = 2
            r6[r7] = r2
            java.util.List r6 = java.util.Arrays.asList(r6)
            com.google.android.gms.internal.measurement.p r0 = r0.mo50553b(r4, r6)
        L_0x046e:
            com.google.android.gms.internal.measurement.t r4 = new com.google.android.gms.internal.measurement.t
            r6 = 0
            java.lang.String r6 = r3.substring(r6, r5)
            java.lang.String r0 = r0.zzi()
            int r1 = r1.length()
            int r1 = r1 + r5
            java.lang.String r1 = r3.substring(r1)
            java.lang.String r3 = java.lang.String.valueOf(r6)
            int r3 = r3.length()
            java.lang.String r5 = java.lang.String.valueOf(r0)
            int r5 = r5.length()
            java.lang.String r7 = java.lang.String.valueOf(r1)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r3 = r3 + r5
            int r3 = r3 + r7
            r8.<init>(r3)
            java.lang.String r0 = android.support.p013v4.media.C0070b.m184f(r8, r6, r0, r1)
            r4.<init>(r0)
            goto L_0x05a9
        L_0x04aa:
            r2 = r19
            r4 = r21
            r1 = r22
            r3 = 1
            kotlin.jvm.internal.C19388s.m32844R0(r13, r1, r3)
            java.lang.String r3 = r2.f33085b
            int r5 = r22.size()
            if (r5 > 0) goto L_0x04bd
            goto L_0x04cc
        L_0x04bd:
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.internal.measurement.p r0 = (com.google.android.gms.internal.measurement.C14763p) r0
            com.google.android.gms.internal.measurement.p r0 = r4.mo50400c(r0)
            java.lang.String r0 = r0.zzi()
        L_0x04cc:
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r1 = r0.find()
            if (r1 == 0) goto L_0x04f4
            com.google.android.gms.internal.measurement.f r1 = new com.google.android.gms.internal.measurement.f
            r3 = 1
            com.google.android.gms.internal.measurement.p[] r3 = new com.google.android.gms.internal.measurement.C14763p[r3]
            com.google.android.gms.internal.measurement.t r4 = new com.google.android.gms.internal.measurement.t
            java.lang.String r0 = r0.group()
            r4.<init>(r0)
            r0 = 0
            r3[r0] = r4
            java.util.List r0 = java.util.Arrays.asList(r3)
            r1.<init>(r0)
            goto L_0x0673
        L_0x04f4:
            com.google.android.gms.internal.measurement.n r0 = com.google.android.gms.internal.measurement.C14763p.f33034h0
            goto L_0x05f0
        L_0x04f8:
            r2 = r19
            r4 = r21
            r1 = r22
            r0 = 0
            r3 = 2
            kotlin.jvm.internal.C19388s.m32844R0(r14, r1, r3)
            java.lang.String r5 = r2.f33085b
            int r6 = r22.size()
            if (r6 > 0) goto L_0x050c
            goto L_0x051a
        L_0x050c:
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.internal.measurement.p r0 = (com.google.android.gms.internal.measurement.C14763p) r0
            com.google.android.gms.internal.measurement.p r0 = r4.mo50400c(r0)
            java.lang.String r17 = r0.zzi()
        L_0x051a:
            r0 = r17
            int r6 = r22.size()
            if (r6 >= r3) goto L_0x0525
            r3 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            goto L_0x0538
        L_0x0525:
            r3 = 1
            java.lang.Object r1 = r1.get(r3)
            com.google.android.gms.internal.measurement.p r1 = (com.google.android.gms.internal.measurement.C14763p) r1
            com.google.android.gms.internal.measurement.p r1 = r4.mo50400c(r1)
            java.lang.Double r1 = r1.zzh()
            double r3 = r1.doubleValue()
        L_0x0538:
            boolean r1 = java.lang.Double.isNaN(r3)
            if (r1 == 0) goto L_0x0541
            r3 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            goto L_0x0545
        L_0x0541:
            double r3 = kotlin.jvm.internal.C19388s.m32826I0(r3)
        L_0x0545:
            com.google.android.gms.internal.measurement.i r1 = new com.google.android.gms.internal.measurement.i
            int r3 = (int) r3
            int r0 = r5.lastIndexOf(r0, r3)
            double r3 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            r1.<init>(r0)
            goto L_0x0673
        L_0x0556:
            r2 = r19
            r4 = r21
            r1 = r22
            r0 = 2
            r5 = 0
            kotlin.jvm.internal.C19388s.m32844R0(r8, r1, r0)
            java.lang.String r3 = r2.f33085b
            int r7 = r22.size()
            if (r7 > 0) goto L_0x056b
            goto L_0x057a
        L_0x056b:
            r7 = 0
            java.lang.Object r7 = r1.get(r7)
            com.google.android.gms.internal.measurement.p r7 = (com.google.android.gms.internal.measurement.C14763p) r7
            com.google.android.gms.internal.measurement.p r7 = r4.mo50400c(r7)
            java.lang.String r17 = r7.zzi()
        L_0x057a:
            r7 = r17
            int r8 = r22.size()
            if (r8 >= r0) goto L_0x0583
            goto L_0x0596
        L_0x0583:
            r0 = 1
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.internal.measurement.p r0 = (com.google.android.gms.internal.measurement.C14763p) r0
            com.google.android.gms.internal.measurement.p r0 = r4.mo50400c(r0)
            java.lang.Double r0 = r0.zzh()
            double r5 = r0.doubleValue()
        L_0x0596:
            double r0 = kotlin.jvm.internal.C19388s.m32826I0(r5)
            com.google.android.gms.internal.measurement.i r4 = new com.google.android.gms.internal.measurement.i
            int r0 = (int) r0
            int r0 = r3.indexOf(r7, r0)
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.<init>(r0)
        L_0x05a9:
            r1 = r4
            goto L_0x0673
        L_0x05ac:
            r2 = r19
            r4 = r21
            r1 = r22
            r0 = 1
            kotlin.jvm.internal.C19388s.m32840P0(r7, r1, r0)
            java.lang.String r0 = r2.f33085b
            r3 = 0
            java.lang.Object r1 = r1.get(r3)
            com.google.android.gms.internal.measurement.p r1 = (com.google.android.gms.internal.measurement.C14763p) r1
            com.google.android.gms.internal.measurement.p r1 = r4.mo50400c(r1)
            java.lang.String r3 = r1.zzi()
            java.lang.String r4 = "length"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x05d2
            com.google.android.gms.internal.measurement.g r0 = com.google.android.gms.internal.measurement.C14763p.f33038m0
            goto L_0x05f0
        L_0x05d2:
            java.lang.Double r1 = r1.zzh()
            double r3 = r1.doubleValue()
            double r5 = java.lang.Math.floor(r3)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x05ee
            int r1 = (int) r3
            if (r1 < 0) goto L_0x05ee
            int r0 = r0.length()
            if (r1 >= r0) goto L_0x05ee
            com.google.android.gms.internal.measurement.g r0 = com.google.android.gms.internal.measurement.C14763p.f33038m0
            goto L_0x05f0
        L_0x05ee:
            com.google.android.gms.internal.measurement.g r0 = com.google.android.gms.internal.measurement.C14763p.f33039n0
        L_0x05f0:
            r1 = r0
            goto L_0x0673
        L_0x05f3:
            r2 = r19
            r4 = r21
            r1 = r22
            int r0 = r22.size()
            if (r0 == 0) goto L_0x062b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = r2.f33085b
            r0.<init>(r3)
            r3 = 0
        L_0x0607:
            int r5 = r22.size()
            if (r3 >= r5) goto L_0x0621
            java.lang.Object r5 = r1.get(r3)
            com.google.android.gms.internal.measurement.p r5 = (com.google.android.gms.internal.measurement.C14763p) r5
            com.google.android.gms.internal.measurement.p r5 = r4.mo50400c(r5)
            java.lang.String r5 = r5.zzi()
            r0.append(r5)
            int r3 = r3 + 1
            goto L_0x0607
        L_0x0621:
            com.google.android.gms.internal.measurement.t r1 = new com.google.android.gms.internal.measurement.t
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            goto L_0x0673
        L_0x062b:
            r1 = r2
            goto L_0x0673
        L_0x062d:
            r2 = r19
            r4 = r21
            r1 = r22
            r0 = 1
            kotlin.jvm.internal.C19388s.m32844R0(r6, r1, r0)
            int r0 = r22.size()
            if (r0 <= 0) goto L_0x0656
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.internal.measurement.p r0 = (com.google.android.gms.internal.measurement.C14763p) r0
            com.google.android.gms.internal.measurement.p r0 = r4.mo50400c(r0)
            java.lang.Double r0 = r0.zzh()
            double r0 = r0.doubleValue()
            double r0 = kotlin.jvm.internal.C19388s.m32826I0(r0)
            int r0 = (int) r0
            goto L_0x0657
        L_0x0656:
            r0 = 0
        L_0x0657:
            java.lang.String r1 = r2.f33085b
            if (r0 < 0) goto L_0x0671
            int r3 = r1.length()
            if (r0 < r3) goto L_0x0662
            goto L_0x0671
        L_0x0662:
            com.google.android.gms.internal.measurement.t r3 = new com.google.android.gms.internal.measurement.t
            char r0 = r1.charAt(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.<init>(r0)
            r1 = r3
            goto L_0x0673
        L_0x0671:
            com.google.android.gms.internal.measurement.t r1 = com.google.android.gms.internal.measurement.C14763p.f33040o0
        L_0x0673:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C14813t.mo50486g(java.lang.String, com.google.android.gms.internal.measurement.c3, java.util.ArrayList):com.google.android.gms.internal.measurement.p");
    }

    public final int hashCode() {
        return this.f33085b.hashCode();
    }

    public final Iterator<C14763p> iterator() {
        return new C14801s(this);
    }

    public final String toString() {
        String str = this.f33085b;
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        sb.append(str);
        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        return sb.toString();
    }

    public final C14763p zzd() {
        return new C14813t(this.f33085b);
    }

    public final Boolean zzg() {
        return Boolean.valueOf(!this.f33085b.isEmpty());
    }

    public final Double zzh() {
        if (this.f33085b.isEmpty()) {
            return Double.valueOf(ShadowDrawableWrapper.COS_45);
        }
        try {
            return Double.valueOf(this.f33085b);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final String zzi() {
        return this.f33085b;
    }
}
