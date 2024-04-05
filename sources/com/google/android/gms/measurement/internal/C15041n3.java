package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C14584b2;
import com.google.android.gms.internal.measurement.C14610d2;
import com.google.android.gms.internal.measurement.C14623e2;
import com.google.android.gms.internal.measurement.C14636f2;
import com.google.android.gms.internal.measurement.C14662h2;
import com.google.android.gms.internal.measurement.C14699k0;
import com.google.android.gms.internal.measurement.C14754o3;
import com.google.android.gms.internal.measurement.C14780q3;
import com.google.android.gms.internal.measurement.C14798r8;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzkh;
import java.util.Map;
import p193o.C7494b;
import p514bk.C14088a;
import p568fn.C17782b;

/* renamed from: com.google.android.gms.measurement.internal.n3 */
public final class C15041n3 extends C14928a7 implements C14938c {

    /* renamed from: e */
    public final C7494b f33700e = new C7494b();
    @VisibleForTesting

    /* renamed from: f */
    public final C7494b f33701f = new C7494b();
    @VisibleForTesting

    /* renamed from: g */
    public final C7494b f33702g = new C7494b();

    /* renamed from: h */
    public final C7494b f33703h = new C7494b();

    /* renamed from: i */
    public final C7494b f33704i = new C7494b();
    @VisibleForTesting

    /* renamed from: j */
    public final C15023l3 f33705j = new C15023l3(this);

    /* renamed from: k */
    public final C15032m3 f33706k = new C15032m3((Object) this);

    /* renamed from: l */
    public final C7494b f33707l = new C7494b();

    public C15041n3(C14973f7 f7Var) {
        super(f7Var);
    }

    /* renamed from: u */
    public static final C7494b m24553u(C14636f2 f2Var) {
        C7494b bVar = new C7494b();
        for (C14662h2 next : f2Var.mo50505B()) {
            bVar.put(next.mo50556s(), next.mo50557t());
        }
        return bVar;
    }

    /* renamed from: e */
    public final String mo51945e(String str, String str2) {
        mo51995g();
        mo52262s(str);
        Map map = (Map) this.f33700e.getOrDefault(str, null);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* renamed from: j */
    public final void mo51944j() {
    }

    /* renamed from: k */
    public final int mo52254k(String str, String str2) {
        Integer num;
        mo51995g();
        mo52262s(str);
        Map map = (Map) this.f33704i.getOrDefault(str, null);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* renamed from: l */
    public final C14636f2 mo52255l(String str) {
        mo51942h();
        mo51995g();
        Preconditions.checkNotEmpty(str);
        mo52262s(str);
        return (C14636f2) this.f33703h.getOrDefault(str, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        r4 = (com.google.android.gms.internal.measurement.C14636f2) r3.f33703h.getOrDefault(r4, null);
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo52256m(java.lang.String r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.measurement.C14722la.m23700b()
            com.google.android.gms.measurement.internal.o4 r0 = r3.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.d r0 = r0.f33878h
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.C14959e2.f33426q0
            r2 = 0
            boolean r0 = r0.mo51973p(r2, r1)
            r1 = 0
            if (r0 == 0) goto L_0x002d
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x001a
            return r1
        L_0x001a:
            o.b r0 = r3.f33703h
            java.lang.Object r4 = r0.getOrDefault(r4, r2)
            com.google.android.gms.internal.measurement.f2 r4 = (com.google.android.gms.internal.measurement.C14636f2) r4
            if (r4 != 0) goto L_0x0025
            return r1
        L_0x0025:
            int r4 = r4.mo50509r()
            if (r4 == 0) goto L_0x002d
            r4 = 1
            return r4
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C15041n3.mo52256m(java.lang.String):boolean");
    }

    /* renamed from: n */
    public final boolean mo52257n(String str, String str2) {
        Boolean bool;
        mo51995g();
        mo52262s(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f33702g.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: o */
    public final boolean mo52258o(String str, String str2) {
        Boolean bool;
        mo51995g();
        mo52262s(str);
        if (IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(mo51945e(str, "measurement.upload.blacklist_internal")) && C15018k7.m24469R(str2)) {
            return true;
        }
        if (IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(mo51945e(str, "measurement.upload.blacklist_public")) && C15018k7.m24470S(str2)) {
            return true;
        }
        Map map = (Map) this.f33701f.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0389, code lost:
        if (r5.mo52052B().insertWithOnConflict(r4, (java.lang.String) null, r9, 5) != -1) goto L_0x039e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x038b, code lost:
        ((com.google.android.gms.measurement.internal.C15103u3) r5.f33681b).mo52016b().f33724g.mo52238b(com.google.android.gms.measurement.internal.C15049o2.m24575p(r28), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x039e, code lost:
        r3 = r21;
        r9 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03ba, code lost:
        r0 = r0.mo50753y().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03c6, code lost:
        if (r0.hasNext() == false) goto L_0x04c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x03c8, code lost:
        r3 = (com.google.android.gms.internal.measurement.C14863x1) r0.next();
        r5.mo51942h();
        r5.mo51995g();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r28);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x03e2, code lost:
        if (android.text.TextUtils.isEmpty(r3.mo50965v()) == false) goto L_0x0411;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03e4, code lost:
        r0 = ((com.google.android.gms.measurement.internal.C15103u3) r5.f33681b).mo52016b().f33727j;
        r9 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r28);
        r11 = java.lang.Integer.valueOf(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03fc, code lost:
        if (r3.mo50961A() == false) goto L_0x0407;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x03fe, code lost:
        r3 = java.lang.Integer.valueOf(r3.mo50963r());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0407, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0408, code lost:
        r0.mo52240d(r9, r11, java.lang.String.valueOf(r3), "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0411, code lost:
        r9 = r3.mo50868i();
        r11 = new android.content.ContentValues();
        r11.put(r6, r2);
        r23 = r0;
        r11.put("audience_id", java.lang.Integer.valueOf(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x042a, code lost:
        if (r3.mo50961A() == false) goto L_0x0435;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x042c, code lost:
        r0 = java.lang.Integer.valueOf(r3.mo50963r());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0435, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0436, code lost:
        r11.put("filter_id", r0);
        r24 = r6;
        r11.put(com.etsy.android.lib.models.ResponseConstants.PROPERTY_NAME, r3.mo50965v());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0448, code lost:
        if (r3.mo50962B() == false) goto L_0x0453;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x044a, code lost:
        r0 = java.lang.Boolean.valueOf(r3.mo50968z());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0453, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0454, code lost:
        r11.put("session_scoped", r0);
        r11.put("data", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0466, code lost:
        if (r5.mo52052B().insertWithOnConflict("property_filters", (java.lang.String) null, r11, 5) != -1) goto L_0x047c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0468, code lost:
        ((com.google.android.gms.measurement.internal.C15103u3) r5.f33681b).mo52016b().f33724g.mo52238b(com.google.android.gms.measurement.internal.C15049o2.m24575p(r28), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x047c, code lost:
        r0 = r23;
        r6 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0482, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
        ((com.google.android.gms.measurement.internal.C15103u3) r5.f33681b).mo52016b().f33724g.mo52239c(com.google.android.gms.measurement.internal.C15049o2.m24575p(r28), "Error storing property filter. appId", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x04c3, code lost:
        r11 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x029e, code lost:
        r9 = r0.mo50753y().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02aa, code lost:
        if (r9.hasNext() == false) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02b6, code lost:
        if (((com.google.android.gms.internal.measurement.C14863x1) r9.next()).mo50961A() != false) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x02b8, code lost:
        ((com.google.android.gms.measurement.internal.C15103u3) r5.f33681b).mo52016b().f33727j.mo52239c(com.google.android.gms.measurement.internal.C15049o2.m24575p(r28), "Property filter with no ID. Audience definition ignored. appId, audienceId", java.lang.Integer.valueOf(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x02d1, code lost:
        r9 = r0.mo50752x().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x02dd, code lost:
        r6 = "app_id";
        r21 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02eb, code lost:
        if (r9.hasNext() == false) goto L_0x03ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r11 = (com.google.android.gms.internal.measurement.C14778q1) r9.next();
        r5.mo51942h();
        r5.mo51995g();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r28);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0307, code lost:
        if (android.text.TextUtils.isEmpty(r11.mo50789x()) == false) goto L_0x0336;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0309, code lost:
        r0 = ((com.google.android.gms.measurement.internal.C15103u3) r5.f33681b).mo52016b().f33727j;
        r6 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r28);
        r9 = java.lang.Integer.valueOf(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0321, code lost:
        if (r11.mo50783F() == false) goto L_0x032c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0323, code lost:
        r11 = java.lang.Integer.valueOf(r11.mo50786s());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x032c, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x032d, code lost:
        r0.mo52240d(r6, r9, java.lang.String.valueOf(r11), "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0336, code lost:
        r3 = r11.mo50868i();
        r23 = r9;
        r9 = new android.content.ContentValues();
        r9.put(r6, r2);
        r9.put("audience_id", java.lang.Integer.valueOf(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x034f, code lost:
        if (r11.mo50783F() == false) goto L_0x035a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0351, code lost:
        r6 = java.lang.Integer.valueOf(r11.mo50786s());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x035a, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x035b, code lost:
        r9.put("filter_id", r6);
        r9.put(com.etsy.android.lib.models.ResponseConstants.EVENT_NAME, r11.mo50789x());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x036b, code lost:
        if (r11.mo50784G() == false) goto L_0x0376;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x036d, code lost:
        r6 = java.lang.Boolean.valueOf(r11.mo50781D());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0376, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0377, code lost:
        r9.put("session_scoped", r6);
        r9.put("data", r3);
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52259p(java.lang.String r28, byte[] r29, java.lang.String r30) {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            r3 = r30
            r27.mo51942h()
            r27.mo51995g()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r28)
            com.google.android.gms.internal.measurement.f2 r0 = r27.mo52260q(r28, r29)
            com.google.android.gms.internal.measurement.q5 r0 = r0.mo50872n()
            r4 = r0
            com.google.android.gms.internal.measurement.e2 r4 = (com.google.android.gms.internal.measurement.C14623e2) r4
            r1.mo52261r(r2, r4)
            com.google.android.gms.internal.measurement.C14722la.m23700b()
            com.google.android.gms.measurement.internal.o4 r0 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.d r0 = r0.f33878h
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C14959e2.f33426q0
            r6 = 0
            boolean r0 = r0.mo51973p(r6, r5)
            if (r0 == 0) goto L_0x0038
            com.google.android.gms.internal.measurement.t5 r0 = r4.mo50807h()
            com.google.android.gms.internal.measurement.f2 r0 = (com.google.android.gms.internal.measurement.C14636f2) r0
            r1.mo52263t(r2, r0)
        L_0x0038:
            o.b r0 = r1.f33703h
            com.google.android.gms.internal.measurement.t5 r5 = r4.mo50807h()
            com.google.android.gms.internal.measurement.f2 r5 = (com.google.android.gms.internal.measurement.C14636f2) r5
            r0.put(r2, r5)
            o.b r0 = r1.f33707l
            r0.put(r2, r3)
            o.b r0 = r1.f33700e
            com.google.android.gms.internal.measurement.t5 r5 = r4.mo50807h()
            com.google.android.gms.internal.measurement.f2 r5 = (com.google.android.gms.internal.measurement.C14636f2) r5
            o.b r5 = m24553u(r5)
            r0.put(r2, r5)
            com.google.android.gms.measurement.internal.f7 r0 = r1.f34048c
            com.google.android.gms.measurement.internal.h r5 = r0.f33488d
            com.google.android.gms.measurement.internal.C14973f7.m24287I(r5)
            java.util.ArrayList r7 = new java.util.ArrayList
            MessageType r0 = r4.f33058c
            com.google.android.gms.internal.measurement.f2 r0 = (com.google.android.gms.internal.measurement.C14636f2) r0
            com.google.android.gms.internal.measurement.z5 r0 = r0.mo50514z()
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r7.<init>(r0)
            java.lang.String r8 = "app_id=? and audience_id=?"
            java.lang.String r0 = "app_id=?"
            java.lang.String r9 = "event_filters"
            java.lang.String r10 = "property_filters"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            r12 = 0
        L_0x007b:
            int r13 = r7.size()
            if (r12 >= r13) goto L_0x01fa
            java.lang.Object r13 = r7.get(r12)
            com.google.android.gms.internal.measurement.o1 r13 = (com.google.android.gms.internal.measurement.C14752o1) r13
            com.google.android.gms.internal.measurement.q5 r13 = r13.mo50872n()
            com.google.android.gms.internal.measurement.n1 r13 = (com.google.android.gms.internal.measurement.C14739n1) r13
            MessageType r15 = r13.f33058c
            com.google.android.gms.internal.measurement.o1 r15 = (com.google.android.gms.internal.measurement.C14752o1) r15
            int r15 = r15.mo50748s()
            if (r15 == 0) goto L_0x017d
            r15 = r13
            r6 = 0
        L_0x0099:
            MessageType r14 = r15.f33058c
            com.google.android.gms.internal.measurement.o1 r14 = (com.google.android.gms.internal.measurement.C14752o1) r14
            int r14 = r14.mo50748s()
            if (r6 >= r14) goto L_0x0176
            MessageType r14 = r15.f33058c
            com.google.android.gms.internal.measurement.o1 r14 = (com.google.android.gms.internal.measurement.C14752o1) r14
            com.google.android.gms.internal.measurement.q1 r14 = r14.mo50750v(r6)
            com.google.android.gms.internal.measurement.q5 r14 = r14.mo50872n()
            com.google.android.gms.internal.measurement.p1 r14 = (com.google.android.gms.internal.measurement.C14765p1) r14
            com.google.android.gms.internal.measurement.q5 r16 = r14.clone()
            r11 = r16
            com.google.android.gms.internal.measurement.p1 r11 = (com.google.android.gms.internal.measurement.C14765p1) r11
            MessageType r3 = r14.f33058c
            com.google.android.gms.internal.measurement.q1 r3 = (com.google.android.gms.internal.measurement.C14778q1) r3
            java.lang.String r3 = r3.mo50789x()
            java.lang.String[] r1 = p568fn.C17782b.f38638i
            r16 = r4
            java.lang.String[] r4 = p568fn.C17782b.f38640k
            java.lang.String r1 = p514bk.C14088a.m21797z(r3, r1, r4)
            if (r1 == 0) goto L_0x00e0
            boolean r3 = r11.f33059d
            if (r3 == 0) goto L_0x00d7
            r11.mo50809j()
            r3 = 0
            r11.f33059d = r3
        L_0x00d7:
            MessageType r3 = r11.f33058c
            com.google.android.gms.internal.measurement.q1 r3 = (com.google.android.gms.internal.measurement.C14778q1) r3
            com.google.android.gms.internal.measurement.C14778q1.m23858z(r3, r1)
            r1 = 1
            goto L_0x00e1
        L_0x00e0:
            r1 = 0
        L_0x00e1:
            r3 = 0
        L_0x00e2:
            MessageType r4 = r14.f33058c
            com.google.android.gms.internal.measurement.q1 r4 = (com.google.android.gms.internal.measurement.C14778q1) r4
            int r4 = r4.mo50785r()
            if (r3 >= r4) goto L_0x0141
            MessageType r4 = r14.f33058c
            com.google.android.gms.internal.measurement.q1 r4 = (com.google.android.gms.internal.measurement.C14778q1) r4
            com.google.android.gms.internal.measurement.s1 r4 = r4.mo50787v(r3)
            r17 = r14
            java.lang.String r14 = r4.mo50838v()
            r18 = r8
            java.lang.String[] r8 = p514bk.C14088a.f31028i
            r19 = r9
            java.lang.String[] r9 = p514bk.C14088a.f31029j
            java.lang.String r8 = p514bk.C14088a.m21797z(r14, r8, r9)
            if (r8 == 0) goto L_0x0138
            com.google.android.gms.internal.measurement.q5 r1 = r4.mo50872n()
            com.google.android.gms.internal.measurement.r1 r1 = (com.google.android.gms.internal.measurement.C14791r1) r1
            boolean r4 = r1.f33059d
            if (r4 == 0) goto L_0x0119
            r1.mo50809j()
            r4 = 0
            r1.f33059d = r4
            goto L_0x011a
        L_0x0119:
            r4 = 0
        L_0x011a:
            MessageType r9 = r1.f33058c
            com.google.android.gms.internal.measurement.s1 r9 = (com.google.android.gms.internal.measurement.C14803s1) r9
            com.google.android.gms.internal.measurement.C14803s1.m23918w(r9, r8)
            com.google.android.gms.internal.measurement.t5 r1 = r1.mo50807h()
            com.google.android.gms.internal.measurement.s1 r1 = (com.google.android.gms.internal.measurement.C14803s1) r1
            boolean r8 = r11.f33059d
            if (r8 == 0) goto L_0x0130
            r11.mo50809j()
            r11.f33059d = r4
        L_0x0130:
            MessageType r4 = r11.f33058c
            com.google.android.gms.internal.measurement.q1 r4 = (com.google.android.gms.internal.measurement.C14778q1) r4
            com.google.android.gms.internal.measurement.C14778q1.m23855A(r4, r3, r1)
            r1 = 1
        L_0x0138:
            int r3 = r3 + 1
            r14 = r17
            r8 = r18
            r9 = r19
            goto L_0x00e2
        L_0x0141:
            r18 = r8
            r19 = r9
            if (r1 == 0) goto L_0x0168
            boolean r1 = r15.f33059d
            if (r1 == 0) goto L_0x0151
            r15.mo50809j()
            r1 = 0
            r15.f33059d = r1
        L_0x0151:
            MessageType r1 = r15.f33058c
            com.google.android.gms.internal.measurement.o1 r1 = (com.google.android.gms.internal.measurement.C14752o1) r1
            com.google.android.gms.internal.measurement.t5 r3 = r11.mo50807h()
            com.google.android.gms.internal.measurement.q1 r3 = (com.google.android.gms.internal.measurement.C14778q1) r3
            com.google.android.gms.internal.measurement.C14752o1.m23794A(r1, r6, r3)
            com.google.android.gms.internal.measurement.t5 r1 = r13.mo50807h()
            com.google.android.gms.internal.measurement.o1 r1 = (com.google.android.gms.internal.measurement.C14752o1) r1
            r7.set(r12, r1)
            r15 = r13
        L_0x0168:
            int r6 = r6 + 1
            r1 = r27
            r3 = r30
            r4 = r16
            r8 = r18
            r9 = r19
            goto L_0x0099
        L_0x0176:
            r16 = r4
            r18 = r8
            r19 = r9
            goto L_0x0184
        L_0x017d:
            r16 = r4
            r18 = r8
            r19 = r9
            r15 = r13
        L_0x0184:
            MessageType r1 = r15.f33058c
            com.google.android.gms.internal.measurement.o1 r1 = (com.google.android.gms.internal.measurement.C14752o1) r1
            int r1 = r1.mo50749t()
            if (r1 == 0) goto L_0x01eb
            r1 = 0
        L_0x018f:
            MessageType r3 = r15.f33058c
            com.google.android.gms.internal.measurement.o1 r3 = (com.google.android.gms.internal.measurement.C14752o1) r3
            int r3 = r3.mo50749t()
            if (r1 >= r3) goto L_0x01eb
            MessageType r3 = r15.f33058c
            com.google.android.gms.internal.measurement.o1 r3 = (com.google.android.gms.internal.measurement.C14752o1) r3
            com.google.android.gms.internal.measurement.x1 r3 = r3.mo50751w(r1)
            java.lang.String r4 = r3.mo50965v()
            java.lang.String[] r6 = kotlinx.coroutines.C19543e0.f43494g
            java.lang.String[] r8 = kotlinx.coroutines.C19543e0.f43495h
            java.lang.String r4 = p514bk.C14088a.m21797z(r4, r6, r8)
            if (r4 == 0) goto L_0x01e8
            com.google.android.gms.internal.measurement.q5 r3 = r3.mo50872n()
            com.google.android.gms.internal.measurement.w1 r3 = (com.google.android.gms.internal.measurement.C14851w1) r3
            boolean r6 = r3.f33059d
            if (r6 == 0) goto L_0x01c0
            r3.mo50809j()
            r6 = 0
            r3.f33059d = r6
            goto L_0x01c1
        L_0x01c0:
            r6 = 0
        L_0x01c1:
            MessageType r8 = r3.f33058c
            com.google.android.gms.internal.measurement.x1 r8 = (com.google.android.gms.internal.measurement.C14863x1) r8
            com.google.android.gms.internal.measurement.C14863x1.m24115w(r8, r4)
            boolean r4 = r15.f33059d
            if (r4 == 0) goto L_0x01d1
            r15.mo50809j()
            r15.f33059d = r6
        L_0x01d1:
            MessageType r4 = r15.f33058c
            com.google.android.gms.internal.measurement.o1 r4 = (com.google.android.gms.internal.measurement.C14752o1) r4
            com.google.android.gms.internal.measurement.t5 r3 = r3.mo50807h()
            com.google.android.gms.internal.measurement.x1 r3 = (com.google.android.gms.internal.measurement.C14863x1) r3
            com.google.android.gms.internal.measurement.C14752o1.m23796z(r4, r1, r3)
            com.google.android.gms.internal.measurement.t5 r3 = r13.mo50807h()
            com.google.android.gms.internal.measurement.o1 r3 = (com.google.android.gms.internal.measurement.C14752o1) r3
            r7.set(r12, r3)
            r15 = r13
        L_0x01e8:
            int r1 = r1 + 1
            goto L_0x018f
        L_0x01eb:
            int r12 = r12 + 1
            r1 = r27
            r3 = r30
            r4 = r16
            r8 = r18
            r9 = r19
            r6 = 0
            goto L_0x007b
        L_0x01fa:
            r16 = r4
            r18 = r8
            r19 = r9
            r5.mo51942h()
            r5.mo51995g()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r28)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            android.database.sqlite.SQLiteDatabase r1 = r5.mo52052B()
            r1.beginTransaction()
            r5.mo51942h()     // Catch:{ all -> 0x0633 }
            r5.mo51995g()     // Catch:{ all -> 0x0633 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r28)     // Catch:{ all -> 0x0633 }
            android.database.sqlite.SQLiteDatabase r3 = r5.mo52052B()     // Catch:{ all -> 0x0633 }
            r4 = 1
            java.lang.String[] r6 = new java.lang.String[r4]     // Catch:{ all -> 0x0633 }
            r8 = 0
            r6[r8] = r2     // Catch:{ all -> 0x0633 }
            r3.delete(r10, r0, r6)     // Catch:{ all -> 0x0633 }
            java.lang.String[] r6 = new java.lang.String[r4]     // Catch:{ all -> 0x0633 }
            r6[r8] = r2     // Catch:{ all -> 0x0633 }
            r4 = r19
            r3.delete(r4, r0, r6)     // Catch:{ all -> 0x0633 }
            java.util.Iterator r3 = r7.iterator()     // Catch:{ all -> 0x0633 }
        L_0x0236:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0633 }
            if (r0 == 0) goto L_0x04cb
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x0633 }
            com.google.android.gms.internal.measurement.o1 r0 = (com.google.android.gms.internal.measurement.C14752o1) r0     // Catch:{ all -> 0x0633 }
            r5.mo51942h()     // Catch:{ all -> 0x0633 }
            r5.mo51995g()     // Catch:{ all -> 0x0633 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r28)     // Catch:{ all -> 0x0633 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ all -> 0x0633 }
            boolean r8 = r0.mo50746B()     // Catch:{ all -> 0x0633 }
            if (r8 != 0) goto L_0x0268
            com.google.android.gms.measurement.internal.o4 r0 = r5.f33681b     // Catch:{ all -> 0x0633 }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ all -> 0x0633 }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ all -> 0x0633 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33727j     // Catch:{ all -> 0x0633 }
            java.lang.String r6 = "Audience with no ID. appId"
            com.google.android.gms.measurement.internal.n2 r8 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r28)     // Catch:{ all -> 0x0633 }
            r0.mo52238b(r8, r6)     // Catch:{ all -> 0x0633 }
            goto L_0x0236
        L_0x0268:
            int r8 = r0.mo50747r()     // Catch:{ all -> 0x0633 }
            com.google.android.gms.internal.measurement.z5 r9 = r0.mo50752x()     // Catch:{ all -> 0x0633 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0633 }
        L_0x0274:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x0633 }
            if (r11 == 0) goto L_0x029e
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x0633 }
            com.google.android.gms.internal.measurement.q1 r11 = (com.google.android.gms.internal.measurement.C14778q1) r11     // Catch:{ all -> 0x0633 }
            boolean r11 = r11.mo50783F()     // Catch:{ all -> 0x0633 }
            if (r11 != 0) goto L_0x0274
            com.google.android.gms.measurement.internal.o4 r0 = r5.f33681b     // Catch:{ all -> 0x0633 }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ all -> 0x0633 }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ all -> 0x0633 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33727j     // Catch:{ all -> 0x0633 }
            java.lang.String r6 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
            com.google.android.gms.measurement.internal.n2 r9 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r28)     // Catch:{ all -> 0x0633 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0633 }
            r0.mo52239c(r9, r6, r8)     // Catch:{ all -> 0x0633 }
            goto L_0x0236
        L_0x029e:
            com.google.android.gms.internal.measurement.z5 r9 = r0.mo50753y()     // Catch:{ all -> 0x0633 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0633 }
        L_0x02a6:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x0633 }
            if (r11 == 0) goto L_0x02d1
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x0633 }
            com.google.android.gms.internal.measurement.x1 r11 = (com.google.android.gms.internal.measurement.C14863x1) r11     // Catch:{ all -> 0x0633 }
            boolean r11 = r11.mo50961A()     // Catch:{ all -> 0x0633 }
            if (r11 != 0) goto L_0x02a6
            com.google.android.gms.measurement.internal.o4 r0 = r5.f33681b     // Catch:{ all -> 0x0633 }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ all -> 0x0633 }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ all -> 0x0633 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33727j     // Catch:{ all -> 0x0633 }
            java.lang.String r6 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            com.google.android.gms.measurement.internal.n2 r9 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r28)     // Catch:{ all -> 0x0633 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0633 }
            r0.mo52239c(r9, r6, r8)     // Catch:{ all -> 0x0633 }
            goto L_0x0236
        L_0x02d1:
            com.google.android.gms.internal.measurement.z5 r9 = r0.mo50752x()     // Catch:{ all -> 0x0633 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0633 }
        L_0x02d9:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x0633 }
            java.lang.String r12 = "data"
            java.lang.String r13 = "session_scoped"
            java.lang.String r14 = "filter_id"
            java.lang.String r15 = "audience_id"
            java.lang.String r6 = "app_id"
            r19 = -1
            r21 = r3
            if (r11 == 0) goto L_0x03ba
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x0633 }
            com.google.android.gms.internal.measurement.q1 r11 = (com.google.android.gms.internal.measurement.C14778q1) r11     // Catch:{ all -> 0x0633 }
            r5.mo51942h()     // Catch:{ all -> 0x0633 }
            r5.mo51995g()     // Catch:{ all -> 0x0633 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r28)     // Catch:{ all -> 0x0633 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r11)     // Catch:{ all -> 0x0633 }
            java.lang.String r22 = r11.mo50789x()     // Catch:{ all -> 0x0633 }
            boolean r22 = android.text.TextUtils.isEmpty(r22)     // Catch:{ all -> 0x0633 }
            if (r22 == 0) goto L_0x0336
            com.google.android.gms.measurement.internal.o4 r0 = r5.f33681b     // Catch:{ all -> 0x0633 }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ all -> 0x0633 }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ all -> 0x0633 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33727j     // Catch:{ all -> 0x0633 }
            java.lang.String r3 = "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId"
            com.google.android.gms.measurement.internal.n2 r6 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r28)     // Catch:{ all -> 0x0633 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0633 }
            boolean r12 = r11.mo50783F()     // Catch:{ all -> 0x0633 }
            if (r12 == 0) goto L_0x032c
            int r11 = r11.mo50786s()     // Catch:{ all -> 0x0633 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0633 }
            goto L_0x032d
        L_0x032c:
            r11 = 0
        L_0x032d:
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0633 }
            r0.mo52240d(r6, r9, r11, r3)     // Catch:{ all -> 0x0633 }
            goto L_0x0496
        L_0x0336:
            byte[] r3 = r11.mo50868i()     // Catch:{ all -> 0x0633 }
            r23 = r9
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0633 }
            r9.<init>()     // Catch:{ all -> 0x0633 }
            r9.put(r6, r2)     // Catch:{ all -> 0x0633 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0633 }
            r9.put(r15, r6)     // Catch:{ all -> 0x0633 }
            boolean r6 = r11.mo50783F()     // Catch:{ all -> 0x0633 }
            if (r6 == 0) goto L_0x035a
            int r6 = r11.mo50786s()     // Catch:{ all -> 0x0633 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0633 }
            goto L_0x035b
        L_0x035a:
            r6 = 0
        L_0x035b:
            r9.put(r14, r6)     // Catch:{ all -> 0x0633 }
            java.lang.String r6 = "event_name"
            java.lang.String r14 = r11.mo50789x()     // Catch:{ all -> 0x0633 }
            r9.put(r6, r14)     // Catch:{ all -> 0x0633 }
            boolean r6 = r11.mo50784G()     // Catch:{ all -> 0x0633 }
            if (r6 == 0) goto L_0x0376
            boolean r6 = r11.mo50781D()     // Catch:{ all -> 0x0633 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x0633 }
            goto L_0x0377
        L_0x0376:
            r6 = 0
        L_0x0377:
            r9.put(r13, r6)     // Catch:{ all -> 0x0633 }
            r9.put(r12, r3)     // Catch:{ all -> 0x0633 }
            android.database.sqlite.SQLiteDatabase r3 = r5.mo52052B()     // Catch:{ SQLiteException -> 0x03a4 }
            r6 = 5
            r11 = 0
            long r12 = r3.insertWithOnConflict(r4, r11, r9, r6)     // Catch:{ SQLiteException -> 0x03a4 }
            int r3 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r3 != 0) goto L_0x039e
            com.google.android.gms.measurement.internal.o4 r3 = r5.f33681b     // Catch:{ SQLiteException -> 0x03a4 }
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3     // Catch:{ SQLiteException -> 0x03a4 }
            com.google.android.gms.measurement.internal.o2 r3 = r3.mo52016b()     // Catch:{ SQLiteException -> 0x03a4 }
            com.google.android.gms.measurement.internal.m2 r3 = r3.f33724g     // Catch:{ SQLiteException -> 0x03a4 }
            java.lang.String r6 = "Failed to insert event filter (got -1). appId"
            com.google.android.gms.measurement.internal.n2 r9 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r28)     // Catch:{ SQLiteException -> 0x03a4 }
            r3.mo52238b(r9, r6)     // Catch:{ SQLiteException -> 0x03a4 }
        L_0x039e:
            r3 = r21
            r9 = r23
            goto L_0x02d9
        L_0x03a4:
            r0 = move-exception
            com.google.android.gms.measurement.internal.o4 r3 = r5.f33681b     // Catch:{ all -> 0x0633 }
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3     // Catch:{ all -> 0x0633 }
            com.google.android.gms.measurement.internal.o2 r3 = r3.mo52016b()     // Catch:{ all -> 0x0633 }
            com.google.android.gms.measurement.internal.m2 r3 = r3.f33724g     // Catch:{ all -> 0x0633 }
            java.lang.String r6 = "Error storing event filter. appId"
            com.google.android.gms.measurement.internal.n2 r9 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r28)     // Catch:{ all -> 0x0633 }
            r3.mo52239c(r9, r6, r0)     // Catch:{ all -> 0x0633 }
            goto L_0x0496
        L_0x03ba:
            com.google.android.gms.internal.measurement.z5 r0 = r0.mo50753y()     // Catch:{ all -> 0x0633 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0633 }
        L_0x03c2:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0633 }
            if (r3 == 0) goto L_0x04c3
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0633 }
            com.google.android.gms.internal.measurement.x1 r3 = (com.google.android.gms.internal.measurement.C14863x1) r3     // Catch:{ all -> 0x0633 }
            r5.mo51942h()     // Catch:{ all -> 0x0633 }
            r5.mo51995g()     // Catch:{ all -> 0x0633 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r28)     // Catch:{ all -> 0x0633 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)     // Catch:{ all -> 0x0633 }
            java.lang.String r9 = r3.mo50965v()     // Catch:{ all -> 0x0633 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0633 }
            if (r9 == 0) goto L_0x0411
            com.google.android.gms.measurement.internal.o4 r0 = r5.f33681b     // Catch:{ all -> 0x0633 }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ all -> 0x0633 }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ all -> 0x0633 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33727j     // Catch:{ all -> 0x0633 }
            java.lang.String r6 = "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId"
            com.google.android.gms.measurement.internal.n2 r9 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r28)     // Catch:{ all -> 0x0633 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0633 }
            boolean r12 = r3.mo50961A()     // Catch:{ all -> 0x0633 }
            if (r12 == 0) goto L_0x0407
            int r3 = r3.mo50963r()     // Catch:{ all -> 0x0633 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0633 }
            goto L_0x0408
        L_0x0407:
            r3 = 0
        L_0x0408:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0633 }
            r0.mo52240d(r9, r11, r3, r6)     // Catch:{ all -> 0x0633 }
            goto L_0x0496
        L_0x0411:
            byte[] r9 = r3.mo50868i()     // Catch:{ all -> 0x0633 }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x0633 }
            r11.<init>()     // Catch:{ all -> 0x0633 }
            r11.put(r6, r2)     // Catch:{ all -> 0x0633 }
            r23 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0633 }
            r11.put(r15, r0)     // Catch:{ all -> 0x0633 }
            boolean r0 = r3.mo50961A()     // Catch:{ all -> 0x0633 }
            if (r0 == 0) goto L_0x0435
            int r0 = r3.mo50963r()     // Catch:{ all -> 0x0633 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0633 }
            goto L_0x0436
        L_0x0435:
            r0 = 0
        L_0x0436:
            r11.put(r14, r0)     // Catch:{ all -> 0x0633 }
            java.lang.String r0 = "property_name"
            r24 = r6
            java.lang.String r6 = r3.mo50965v()     // Catch:{ all -> 0x0633 }
            r11.put(r0, r6)     // Catch:{ all -> 0x0633 }
            boolean r0 = r3.mo50962B()     // Catch:{ all -> 0x0633 }
            if (r0 == 0) goto L_0x0453
            boolean r0 = r3.mo50968z()     // Catch:{ all -> 0x0633 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0633 }
            goto L_0x0454
        L_0x0453:
            r0 = 0
        L_0x0454:
            r11.put(r13, r0)     // Catch:{ all -> 0x0633 }
            r11.put(r12, r9)     // Catch:{ all -> 0x0633 }
            android.database.sqlite.SQLiteDatabase r0 = r5.mo52052B()     // Catch:{ SQLiteException -> 0x0482 }
            r3 = 5
            r6 = 0
            long r25 = r0.insertWithOnConflict(r10, r6, r11, r3)     // Catch:{ SQLiteException -> 0x0482 }
            int r0 = (r25 > r19 ? 1 : (r25 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x047c
            com.google.android.gms.measurement.internal.o4 r0 = r5.f33681b     // Catch:{ SQLiteException -> 0x0482 }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ SQLiteException -> 0x0482 }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ SQLiteException -> 0x0482 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33724g     // Catch:{ SQLiteException -> 0x0482 }
            java.lang.String r3 = "Failed to insert property filter (got -1). appId"
            com.google.android.gms.measurement.internal.n2 r6 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r28)     // Catch:{ SQLiteException -> 0x0482 }
            r0.mo52238b(r6, r3)     // Catch:{ SQLiteException -> 0x0482 }
            goto L_0x0496
        L_0x047c:
            r0 = r23
            r6 = r24
            goto L_0x03c2
        L_0x0482:
            r0 = move-exception
            com.google.android.gms.measurement.internal.o4 r3 = r5.f33681b     // Catch:{ all -> 0x0633 }
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3     // Catch:{ all -> 0x0633 }
            com.google.android.gms.measurement.internal.o2 r3 = r3.mo52016b()     // Catch:{ all -> 0x0633 }
            com.google.android.gms.measurement.internal.m2 r3 = r3.f33724g     // Catch:{ all -> 0x0633 }
            java.lang.String r6 = "Error storing property filter. appId"
            com.google.android.gms.measurement.internal.n2 r9 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r28)     // Catch:{ all -> 0x0633 }
            r3.mo52239c(r9, r6, r0)     // Catch:{ all -> 0x0633 }
        L_0x0496:
            r5.mo51942h()     // Catch:{ all -> 0x0633 }
            r5.mo51995g()     // Catch:{ all -> 0x0633 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r28)     // Catch:{ all -> 0x0633 }
            android.database.sqlite.SQLiteDatabase r0 = r5.mo52052B()     // Catch:{ all -> 0x0633 }
            r3 = 2
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ all -> 0x0633 }
            r9 = 0
            r6[r9] = r2     // Catch:{ all -> 0x0633 }
            java.lang.String r11 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0633 }
            r12 = 1
            r6[r12] = r11     // Catch:{ all -> 0x0633 }
            r11 = r18
            r0.delete(r10, r11, r6)     // Catch:{ all -> 0x0633 }
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ all -> 0x0633 }
            r3[r9] = r2     // Catch:{ all -> 0x0633 }
            java.lang.String r6 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0633 }
            r3[r12] = r6     // Catch:{ all -> 0x0633 }
            r0.delete(r4, r11, r3)     // Catch:{ all -> 0x0633 }
            goto L_0x04c5
        L_0x04c3:
            r11 = r18
        L_0x04c5:
            r18 = r11
            r3 = r21
            goto L_0x0236
        L_0x04cb:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0633 }
            r0.<init>()     // Catch:{ all -> 0x0633 }
            java.util.Iterator r3 = r7.iterator()     // Catch:{ all -> 0x0633 }
        L_0x04d4:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0633 }
            if (r4 == 0) goto L_0x04f4
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0633 }
            com.google.android.gms.internal.measurement.o1 r4 = (com.google.android.gms.internal.measurement.C14752o1) r4     // Catch:{ all -> 0x0633 }
            boolean r6 = r4.mo50746B()     // Catch:{ all -> 0x0633 }
            if (r6 == 0) goto L_0x04ef
            int r4 = r4.mo50747r()     // Catch:{ all -> 0x0633 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0633 }
            goto L_0x04f0
        L_0x04ef:
            r11 = 0
        L_0x04f0:
            r0.add(r11)     // Catch:{ all -> 0x0633 }
            goto L_0x04d4
        L_0x04f4:
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r28)     // Catch:{ all -> 0x0633 }
            r5.mo51942h()     // Catch:{ all -> 0x0633 }
            r5.mo51995g()     // Catch:{ all -> 0x0633 }
            android.database.sqlite.SQLiteDatabase r3 = r5.mo52052B()     // Catch:{ all -> 0x0633 }
            r4 = 1
            java.lang.String[] r6 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x05a2 }
            r4 = 0
            r6[r4] = r2     // Catch:{ SQLiteException -> 0x05a2 }
            java.lang.String r4 = "select count(1) from audience_filter_values where app_id=?"
            long r6 = r5.mo52081x(r4, r6)     // Catch:{ SQLiteException -> 0x05a2 }
            com.google.android.gms.measurement.internal.o4 r4 = r5.f33681b     // Catch:{ all -> 0x0633 }
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4     // Catch:{ all -> 0x0633 }
            com.google.android.gms.measurement.internal.d r4 = r4.f33878h     // Catch:{ all -> 0x0633 }
            r5 = 2000(0x7d0, float:2.803E-42)
            com.google.android.gms.measurement.internal.d2<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.C14959e2.f33372F     // Catch:{ all -> 0x0633 }
            int r4 = r4.mo51968k(r2, r8)     // Catch:{ all -> 0x0633 }
            int r4 = java.lang.Math.min(r5, r4)     // Catch:{ all -> 0x0633 }
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)     // Catch:{ all -> 0x0633 }
            long r8 = (long) r4     // Catch:{ all -> 0x0633 }
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x052b
            goto L_0x05b6
        L_0x052b:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0633 }
            r5.<init>()     // Catch:{ all -> 0x0633 }
            r6 = 0
        L_0x0531:
            int r7 = r0.size()     // Catch:{ all -> 0x0633 }
            if (r6 >= r7) goto L_0x054d
            java.lang.Object r7 = r0.get(r6)     // Catch:{ all -> 0x0633 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x0633 }
            if (r7 == 0) goto L_0x05b6
            int r7 = r7.intValue()     // Catch:{ all -> 0x0633 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x0633 }
            r5.add(r7)     // Catch:{ all -> 0x0633 }
            int r6 = r6 + 1
            goto L_0x0531
        L_0x054d:
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r5)     // Catch:{ all -> 0x0633 }
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0633 }
            int r5 = r5.length()     // Catch:{ all -> 0x0633 }
            r6 = 2
            int r5 = r5 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0633 }
            r6.<init>(r5)     // Catch:{ all -> 0x0633 }
            java.lang.String r5 = "("
            r6.append(r5)     // Catch:{ all -> 0x0633 }
            r6.append(r0)     // Catch:{ all -> 0x0633 }
            java.lang.String r0 = ")"
            r6.append(r0)     // Catch:{ all -> 0x0633 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0633 }
            java.lang.String r5 = "audience_filter_values"
            int r6 = r0.length()     // Catch:{ all -> 0x0633 }
            int r6 = r6 + 140
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0633 }
            r7.<init>(r6)     // Catch:{ all -> 0x0633 }
            java.lang.String r6 = "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in "
            r7.append(r6)     // Catch:{ all -> 0x0633 }
            r7.append(r0)     // Catch:{ all -> 0x0633 }
            java.lang.String r0 = " order by rowid desc limit -1 offset ?)"
            r7.append(r0)     // Catch:{ all -> 0x0633 }
            r6 = 2
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch:{ all -> 0x0633 }
            r6 = 0
            r0[r6] = r2     // Catch:{ all -> 0x0633 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x0633 }
            r6 = 1
            r0[r6] = r4     // Catch:{ all -> 0x0633 }
            java.lang.String r4 = r7.toString()     // Catch:{ all -> 0x0633 }
            r3.delete(r5, r4, r0)     // Catch:{ all -> 0x0633 }
            goto L_0x05b6
        L_0x05a2:
            r0 = move-exception
            com.google.android.gms.measurement.internal.o4 r3 = r5.f33681b     // Catch:{ all -> 0x0633 }
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3     // Catch:{ all -> 0x0633 }
            com.google.android.gms.measurement.internal.o2 r3 = r3.mo52016b()     // Catch:{ all -> 0x0633 }
            com.google.android.gms.measurement.internal.m2 r3 = r3.f33724g     // Catch:{ all -> 0x0633 }
            java.lang.String r4 = "Database error querying filters. appId"
            com.google.android.gms.measurement.internal.n2 r5 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r28)     // Catch:{ all -> 0x0633 }
            r3.mo52239c(r5, r4, r0)     // Catch:{ all -> 0x0633 }
        L_0x05b6:
            r1.setTransactionSuccessful()     // Catch:{ all -> 0x0633 }
            r1.endTransaction()
            r1 = r16
            boolean r0 = r1.f33059d     // Catch:{ RuntimeException -> 0x05dc }
            if (r0 == 0) goto L_0x05c8
            r1.mo50809j()     // Catch:{ RuntimeException -> 0x05dc }
            r3 = 0
            r1.f33059d = r3     // Catch:{ RuntimeException -> 0x05dc }
        L_0x05c8:
            MessageType r0 = r1.f33058c     // Catch:{ RuntimeException -> 0x05dc }
            com.google.android.gms.internal.measurement.f2 r0 = (com.google.android.gms.internal.measurement.C14636f2) r0     // Catch:{ RuntimeException -> 0x05dc }
            com.google.android.gms.internal.measurement.C14636f2.m23548D(r0)     // Catch:{ RuntimeException -> 0x05dc }
            com.google.android.gms.internal.measurement.t5 r0 = r1.mo50807h()     // Catch:{ RuntimeException -> 0x05dc }
            com.google.android.gms.internal.measurement.f2 r0 = (com.google.android.gms.internal.measurement.C14636f2) r0     // Catch:{ RuntimeException -> 0x05dc }
            byte[] r0 = r0.mo50868i()     // Catch:{ RuntimeException -> 0x05dc }
            r3 = r27
            goto L_0x05f4
        L_0x05dc:
            r0 = move-exception
            r3 = r27
            com.google.android.gms.measurement.internal.o4 r4 = r3.f33681b
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4
            com.google.android.gms.measurement.internal.o2 r4 = r4.mo52016b()
            com.google.android.gms.measurement.internal.m2 r4 = r4.f33727j
            com.google.android.gms.measurement.internal.n2 r5 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r28)
            java.lang.String r6 = "Unable to serialize reduced-size config. Storing full config instead. appId"
            r4.mo52239c(r5, r6, r0)
            r0 = r29
        L_0x05f4:
            com.google.android.gms.internal.measurement.ea r4 = com.google.android.gms.internal.measurement.C14631ea.f32828c
            com.google.android.gms.internal.measurement.p4<com.google.android.gms.internal.measurement.fa> r4 = r4.f32829b
            java.lang.Object r4 = r4.zza()
            com.google.android.gms.internal.measurement.fa r4 = (com.google.android.gms.internal.measurement.C14644fa) r4
            r4.zza()
            com.google.android.gms.measurement.internal.o4 r4 = r3.f33681b
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4
            com.google.android.gms.measurement.internal.d r4 = r4.f33878h
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C14959e2.f33420n0
            r6 = 0
            boolean r4 = r4.mo51973p(r6, r5)
            if (r4 == 0) goto L_0x061d
            com.google.android.gms.measurement.internal.f7 r4 = r3.f34048c
            com.google.android.gms.measurement.internal.h r4 = r4.f33488d
            com.google.android.gms.measurement.internal.C14973f7.m24287I(r4)
            r5 = r30
            r4.mo52074p(r2, r0, r5)
            goto L_0x0627
        L_0x061d:
            com.google.android.gms.measurement.internal.f7 r4 = r3.f34048c
            com.google.android.gms.measurement.internal.h r4 = r4.f33488d
            com.google.android.gms.measurement.internal.C14973f7.m24287I(r4)
            r4.mo52074p(r2, r0, r6)
        L_0x0627:
            o.b r0 = r3.f33703h
            com.google.android.gms.internal.measurement.t5 r1 = r1.mo50807h()
            com.google.android.gms.internal.measurement.f2 r1 = (com.google.android.gms.internal.measurement.C14636f2) r1
            r0.put(r2, r1)
            return
        L_0x0633:
            r0 = move-exception
            r3 = r27
            r1.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C15041n3.mo52259p(java.lang.String, byte[], java.lang.String):void");
    }

    /* renamed from: q */
    public final C14636f2 mo52260q(String str, byte[] bArr) {
        if (bArr == null) {
            return C14636f2.m23551x();
        }
        try {
            C14636f2 f2Var = (C14636f2) ((C14623e2) C14991h7.m24389z(C14636f2.m23549v(), bArr)).mo50807h();
            C15031m2 m2Var = ((C15103u3) this.f33681b).mo52016b().f33732o;
            String str2 = null;
            Long valueOf = f2Var.mo50508G() ? Long.valueOf(f2Var.mo50511t()) : null;
            if (f2Var.mo50507F()) {
                str2 = f2Var.mo50513y();
            }
            m2Var.mo52239c(valueOf, "Parsed config. version, gmp_app_id", str2);
            return f2Var;
        } catch (zzkh e) {
            ((C15103u3) this.f33681b).mo52016b().f33727j.mo52239c(C15049o2.m24575p(str), "Unable to merge remote config. appId", e);
            return C14636f2.m23551x();
        } catch (RuntimeException e2) {
            ((C15103u3) this.f33681b).mo52016b().f33727j.mo52239c(C15049o2.m24575p(str), "Unable to merge remote config. appId", e2);
            return C14636f2.m23551x();
        }
    }

    /* renamed from: r */
    public final void mo52261r(String str, C14623e2 e2Var) {
        C7494b bVar = new C7494b();
        C7494b bVar2 = new C7494b();
        C7494b bVar3 = new C7494b();
        for (int i = 0; i < ((C14636f2) e2Var.f33058c).mo50510s(); i++) {
            C14584b2 b2Var = (C14584b2) ((C14636f2) e2Var.f33058c).mo50512u(i).mo50872n();
            if (TextUtils.isEmpty(b2Var.mo50379o())) {
                ((C15103u3) this.f33681b).mo52016b().f33727j.mo52237a("EventConfig contained null event name");
            } else {
                String o = b2Var.mo50379o();
                String z = C14088a.m21797z(b2Var.mo50379o(), C17782b.f38638i, C17782b.f38640k);
                if (!TextUtils.isEmpty(z)) {
                    if (b2Var.f33059d) {
                        b2Var.mo50809j();
                        b2Var.f33059d = false;
                    }
                    C14610d2.m23428u((C14610d2) b2Var.f33058c, z);
                    if (e2Var.f33059d) {
                        e2Var.mo50809j();
                        e2Var.f33059d = false;
                    }
                    C14636f2.m23547C((C14636f2) e2Var.f33058c, i, (C14610d2) b2Var.mo50807h());
                }
                C14798r8 r8Var = C14798r8.f33071c;
                r8Var.f33072b.zza().zza();
                C14947d dVar = ((C15103u3) this.f33681b).f33878h;
                C14950d2<Boolean> d2Var = C14959e2.f33442y0;
                if (!dVar.mo51973p((String) null, d2Var)) {
                    bVar.put(o, Boolean.valueOf(((C14610d2) b2Var.f33058c).mo50449v()));
                } else if (((C14610d2) b2Var.f33058c).mo50451x() && ((C14610d2) b2Var.f33058c).mo50449v()) {
                    bVar.put(o, Boolean.TRUE);
                }
                r8Var.f33072b.zza().zza();
                if (!((C15103u3) this.f33681b).f33878h.mo51973p((String) null, d2Var)) {
                    bVar2.put(b2Var.mo50379o(), Boolean.valueOf(((C14610d2) b2Var.f33058c).mo50450w()));
                } else if (((C14610d2) b2Var.f33058c).mo50452y() && ((C14610d2) b2Var.f33058c).mo50450w()) {
                    bVar2.put(b2Var.mo50379o(), Boolean.TRUE);
                }
                if (((C14610d2) b2Var.f33058c).mo50453z()) {
                    if (((C14610d2) b2Var.f33058c).mo50447r() < 2 || ((C14610d2) b2Var.f33058c).mo50447r() > 65535) {
                        ((C15103u3) this.f33681b).mo52016b().f33727j.mo52239c(b2Var.mo50379o(), "Invalid sampling rate. Event name, sample rate", Integer.valueOf(((C14610d2) b2Var.f33058c).mo50447r()));
                    } else {
                        bVar3.put(b2Var.mo50379o(), Integer.valueOf(((C14610d2) b2Var.f33058c).mo50447r()));
                    }
                }
            }
        }
        this.f33701f.put(str, bVar);
        this.f33702g.put(str, bVar2);
        this.f33704i.put(str, bVar3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008e, code lost:
        if (r2 != null) goto L_0x0090;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0129  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52262s(java.lang.String r13) {
        /*
            r12 = this;
            r12.mo51942h()
            r12.mo51995g()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            o.b r0 = r12.f33703h
            r1 = 0
            java.lang.Object r0 = r0.getOrDefault(r13, r1)
            if (r0 != 0) goto L_0x012d
            com.google.android.gms.measurement.internal.f7 r0 = r12.f34048c
            com.google.android.gms.measurement.internal.h r0 = r0.f33488d
            com.google.android.gms.measurement.internal.C14973f7.m24287I(r0)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            r0.mo51995g()
            r0.mo51942h()
            android.database.sqlite.SQLiteDatabase r2 = r0.mo52052B()     // Catch:{ SQLiteException -> 0x0078, all -> 0x0075 }
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String[] r4 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x0078, all -> 0x0075 }
            r10 = 1
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0078, all -> 0x0075 }
            r11 = 0
            r6[r11] = r13     // Catch:{ SQLiteException -> 0x0078, all -> 0x0075 }
            java.lang.String r3 = "apps"
            java.lang.String r5 = "app_id=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0078, all -> 0x0075 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0073 }
            if (r3 != 0) goto L_0x0046
            goto L_0x0090
        L_0x0046:
            byte[] r3 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x0073 }
            java.lang.String r4 = r2.getString(r10)     // Catch:{ SQLiteException -> 0x0073 }
            boolean r5 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0073 }
            if (r5 == 0) goto L_0x0067
            com.google.android.gms.measurement.internal.o4 r5 = r0.f33681b     // Catch:{ SQLiteException -> 0x0073 }
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5     // Catch:{ SQLiteException -> 0x0073 }
            com.google.android.gms.measurement.internal.o2 r5 = r5.mo52016b()     // Catch:{ SQLiteException -> 0x0073 }
            com.google.android.gms.measurement.internal.m2 r5 = r5.f33724g     // Catch:{ SQLiteException -> 0x0073 }
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            com.google.android.gms.measurement.internal.n2 r7 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r13)     // Catch:{ SQLiteException -> 0x0073 }
            r5.mo52238b(r7, r6)     // Catch:{ SQLiteException -> 0x0073 }
        L_0x0067:
            if (r3 != 0) goto L_0x006a
            goto L_0x0090
        L_0x006a:
            android.util.Pair r5 = new android.util.Pair     // Catch:{ SQLiteException -> 0x0073 }
            r5.<init>(r3, r4)     // Catch:{ SQLiteException -> 0x0073 }
            r2.close()
            goto L_0x0094
        L_0x0073:
            r3 = move-exception
            goto L_0x007b
        L_0x0075:
            r13 = move-exception
            goto L_0x0127
        L_0x0078:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x007b:
            com.google.android.gms.measurement.internal.o4 r0 = r0.f33681b     // Catch:{ all -> 0x0125 }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ all -> 0x0125 }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ all -> 0x0125 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33724g     // Catch:{ all -> 0x0125 }
            java.lang.String r4 = "Error querying remote config. appId"
            com.google.android.gms.measurement.internal.n2 r5 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r13)     // Catch:{ all -> 0x0125 }
            r0.mo52239c(r5, r4, r3)     // Catch:{ all -> 0x0125 }
            if (r2 == 0) goto L_0x0093
        L_0x0090:
            r2.close()
        L_0x0093:
            r5 = r1
        L_0x0094:
            if (r5 != 0) goto L_0x00b5
            o.b r0 = r12.f33700e
            r0.put(r13, r1)
            o.b r0 = r12.f33701f
            r0.put(r13, r1)
            o.b r0 = r12.f33702g
            r0.put(r13, r1)
            o.b r0 = r12.f33703h
            r0.put(r13, r1)
            o.b r0 = r12.f33707l
            r0.put(r13, r1)
            o.b r0 = r12.f33704i
            r0.put(r13, r1)
            return
        L_0x00b5:
            java.lang.Object r0 = r5.first
            byte[] r0 = (byte[]) r0
            com.google.android.gms.internal.measurement.f2 r0 = r12.mo52260q(r13, r0)
            com.google.android.gms.internal.measurement.q5 r0 = r0.mo50872n()
            com.google.android.gms.internal.measurement.e2 r0 = (com.google.android.gms.internal.measurement.C14623e2) r0
            r12.mo52261r(r13, r0)
            o.b r2 = r12.f33700e
            com.google.android.gms.internal.measurement.t5 r3 = r0.mo50807h()
            com.google.android.gms.internal.measurement.f2 r3 = (com.google.android.gms.internal.measurement.C14636f2) r3
            o.b r3 = m24553u(r3)
            r2.put(r13, r3)
            o.b r2 = r12.f33703h
            com.google.android.gms.internal.measurement.t5 r3 = r0.mo50807h()
            com.google.android.gms.internal.measurement.f2 r3 = (com.google.android.gms.internal.measurement.C14636f2) r3
            r2.put(r13, r3)
            com.google.android.gms.internal.measurement.C14722la.m23700b()
            com.google.android.gms.measurement.internal.o4 r2 = r12.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.d r2 = r2.f33878h
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C14959e2.f33426q0
            boolean r2 = r2.mo51973p(r1, r3)
            if (r2 == 0) goto L_0x00fa
            com.google.android.gms.internal.measurement.t5 r0 = r0.mo50807h()
            com.google.android.gms.internal.measurement.f2 r0 = (com.google.android.gms.internal.measurement.C14636f2) r0
            r12.mo52263t(r13, r0)
        L_0x00fa:
            com.google.android.gms.internal.measurement.ea r0 = com.google.android.gms.internal.measurement.C14631ea.f32828c
            com.google.android.gms.internal.measurement.p4<com.google.android.gms.internal.measurement.fa> r0 = r0.f32829b
            java.lang.Object r0 = r0.zza()
            com.google.android.gms.internal.measurement.fa r0 = (com.google.android.gms.internal.measurement.C14644fa) r0
            r0.zza()
            com.google.android.gms.measurement.internal.o4 r0 = r12.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.d r0 = r0.f33878h
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C14959e2.f33420n0
            boolean r0 = r0.mo51973p(r1, r2)
            if (r0 == 0) goto L_0x011f
            o.b r0 = r12.f33707l
            java.lang.Object r1 = r5.second
            java.lang.String r1 = (java.lang.String) r1
            r0.put(r13, r1)
            return
        L_0x011f:
            o.b r0 = r12.f33707l
            r0.put(r13, r1)
            return
        L_0x0125:
            r13 = move-exception
            r1 = r2
        L_0x0127:
            if (r1 == 0) goto L_0x012c
            r1.close()
        L_0x012c:
            throw r13
        L_0x012d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C15041n3.mo52262s(java.lang.String):void");
    }

    /* renamed from: t */
    public final void mo52263t(String str, C14636f2 f2Var) {
        if (f2Var.mo50509r() != 0) {
            ((C15103u3) this.f33681b).mo52016b().f33732o.mo52238b(Integer.valueOf(f2Var.mo50509r()), "EES programs found");
            C14780q3 q3Var = (C14780q3) f2Var.mo50504A().get(0);
            try {
                C14699k0 k0Var = new C14699k0();
                ((Map) k0Var.f32901a.f32777d.f2868b).put("internal.remoteConfig", new C14996i3(this, str));
                ((Map) k0Var.f32901a.f32777d.f2868b).put("internal.appMetadata", new C15014k3(this, str));
                ((Map) k0Var.f32901a.f32777d.f2868b).put("internal.logger", new C14987h3(this));
                k0Var.mo50620a(q3Var);
                this.f33705j.put(str, k0Var);
                ((C15103u3) this.f33681b).mo52016b().f33732o.mo52239c(str, "EES program loaded for appId, activities", Integer.valueOf(q3Var.mo50802r().mo50677r()));
                for (C14754o3 s : q3Var.mo50802r().mo50678u()) {
                    ((C15103u3) this.f33681b).mo52016b().f33732o.mo52238b(s.mo50758s(), "EES program activity");
                }
            } catch (zzd unused) {
                ((C15103u3) this.f33681b).mo52016b().f33724g.mo52238b(str, "Failed to load EES program. appId");
            }
        } else {
            this.f33705j.remove(str);
        }
    }
}
