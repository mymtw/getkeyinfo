package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C14779q2;

/* renamed from: com.google.android.gms.measurement.internal.o7 */
public final class C15054o7 {

    /* renamed from: a */
    public C14779q2 f33735a;

    /* renamed from: b */
    public Long f33736b;

    /* renamed from: c */
    public long f33737c;

    /* renamed from: d */
    public final /* synthetic */ C15090s7 f33738d;

    public /* synthetic */ C15054o7(C15090s7 s7Var) {
        this.f33738d = s7Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: com.google.android.gms.internal.measurement.z5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.google.android.gms.internal.measurement.z5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.google.android.gms.internal.measurement.z5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: com.google.android.gms.internal.measurement.z5} */
    /* JADX WARNING: type inference failed for: r0v13, types: [java.io.Serializable] */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fb, code lost:
        if (r14 == null) goto L_0x0100;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01e5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C14779q2 mo52282a(com.google.android.gms.internal.measurement.C14779q2 r18, java.lang.String r19) {
        /*
            r17 = this;
            r1 = r17
            r8 = r18
            r3 = r19
            java.lang.String r0 = r18.mo50800y()
            com.google.android.gms.internal.measurement.z5 r9 = r18.mo50801z()
            com.google.android.gms.measurement.internal.s7 r2 = r1.f33738d
            com.google.android.gms.measurement.internal.f7 r2 = r2.f34048c
            r2.mo52012P()
            java.lang.String r2 = "_eid"
            java.io.Serializable r4 = com.google.android.gms.measurement.internal.C14991h7.m24382m(r8, r2)
            java.lang.Long r4 = (java.lang.Long) r4
            r10 = 0
            if (r4 == 0) goto L_0x0237
            java.lang.String r5 = "_ep"
            boolean r5 = r0.equals(r5)
            r6 = 0
            if (r5 == 0) goto L_0x01e9
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            com.google.android.gms.measurement.internal.s7 r0 = r1.f33738d
            com.google.android.gms.measurement.internal.f7 r0 = r0.f34048c
            r0.mo52012P()
            java.lang.String r0 = "_en"
            java.io.Serializable r0 = com.google.android.gms.measurement.internal.C14991h7.m24382m(r8, r0)
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r5 = 0
            if (r0 == 0) goto L_0x0056
            com.google.android.gms.measurement.internal.s7 r0 = r1.f33738d
            com.google.android.gms.measurement.internal.o4 r0 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33725h
            java.lang.String r2 = "Extra parameter without an event name. eventId"
            r0.mo52238b(r4, r2)
            return r5
        L_0x0056:
            com.google.android.gms.internal.measurement.q2 r0 = r1.f33735a
            r12 = 1
            if (r0 == 0) goto L_0x006d
            java.lang.Long r0 = r1.f33736b
            if (r0 == 0) goto L_0x006d
            long r13 = r4.longValue()
            java.lang.Long r0 = r1.f33736b
            long r15 = r0.longValue()
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0128
        L_0x006d:
            com.google.android.gms.measurement.internal.s7 r0 = r1.f33738d
            com.google.android.gms.measurement.internal.f7 r0 = r0.f34048c
            com.google.android.gms.measurement.internal.h r13 = r0.f33488d
            com.google.android.gms.measurement.internal.C14973f7.m24287I(r13)
            r13.mo51995g()
            r13.mo51942h()
            android.database.sqlite.SQLiteDatabase r0 = r13.mo52052B()     // Catch:{ SQLiteException -> 0x00ea, all -> 0x00e6 }
            r14 = 2
            java.lang.String[] r14 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x00ea, all -> 0x00e6 }
            r14[r10] = r3     // Catch:{ SQLiteException -> 0x00ea, all -> 0x00e6 }
            java.lang.String r15 = r4.toString()     // Catch:{ SQLiteException -> 0x00ea, all -> 0x00e6 }
            r14[r12] = r15     // Catch:{ SQLiteException -> 0x00ea, all -> 0x00e6 }
            java.lang.String r15 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            android.database.Cursor r14 = r0.rawQuery(r15, r14)     // Catch:{ SQLiteException -> 0x00ea, all -> 0x00e6 }
            boolean r0 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x00cf }
            if (r0 != 0) goto L_0x00ab
            com.google.android.gms.measurement.internal.o4 r0 = r13.f33681b     // Catch:{ SQLiteException -> 0x00cf }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ SQLiteException -> 0x00cf }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ SQLiteException -> 0x00cf }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33732o     // Catch:{ SQLiteException -> 0x00cf }
            java.lang.String r15 = "Main event not found"
            r0.mo52237a(r15)     // Catch:{ SQLiteException -> 0x00cf }
            r14.close()
            r0 = r5
            goto L_0x0101
        L_0x00ab:
            byte[] r0 = r14.getBlob(r10)     // Catch:{ SQLiteException -> 0x00cf }
            long r15 = r14.getLong(r12)     // Catch:{ SQLiteException -> 0x00cf }
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ SQLiteException -> 0x00cf }
            com.google.android.gms.internal.measurement.p2 r5 = com.google.android.gms.internal.measurement.C14779q2.m23880v()     // Catch:{ IOException -> 0x00d1 }
            com.google.android.gms.internal.measurement.q5 r0 = com.google.android.gms.measurement.internal.C14991h7.m24389z(r5, r0)     // Catch:{ IOException -> 0x00d1 }
            com.google.android.gms.internal.measurement.p2 r0 = (com.google.android.gms.internal.measurement.C14766p2) r0     // Catch:{ IOException -> 0x00d1 }
            com.google.android.gms.internal.measurement.t5 r0 = r0.mo50807h()     // Catch:{ IOException -> 0x00d1 }
            com.google.android.gms.internal.measurement.q2 r0 = (com.google.android.gms.internal.measurement.C14779q2) r0     // Catch:{ IOException -> 0x00d1 }
            android.util.Pair r0 = android.util.Pair.create(r0, r15)     // Catch:{ SQLiteException -> 0x00cf }
            r14.close()
            goto L_0x0101
        L_0x00cf:
            r0 = move-exception
            goto L_0x00ec
        L_0x00d1:
            r0 = move-exception
            com.google.android.gms.measurement.internal.o4 r5 = r13.f33681b     // Catch:{ SQLiteException -> 0x00cf }
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5     // Catch:{ SQLiteException -> 0x00cf }
            com.google.android.gms.measurement.internal.o2 r5 = r5.mo52016b()     // Catch:{ SQLiteException -> 0x00cf }
            com.google.android.gms.measurement.internal.m2 r5 = r5.f33724g     // Catch:{ SQLiteException -> 0x00cf }
            java.lang.String r15 = "Failed to merge main event. appId, eventId"
            com.google.android.gms.measurement.internal.n2 r10 = com.google.android.gms.measurement.internal.C15049o2.m24575p(r19)     // Catch:{ SQLiteException -> 0x00cf }
            r5.mo52240d(r10, r4, r0, r15)     // Catch:{ SQLiteException -> 0x00cf }
            goto L_0x00fd
        L_0x00e6:
            r0 = move-exception
            r5 = 0
            goto L_0x01e3
        L_0x00ea:
            r0 = move-exception
            r14 = 0
        L_0x00ec:
            com.google.android.gms.measurement.internal.o4 r5 = r13.f33681b     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.measurement.internal.u3 r5 = (com.google.android.gms.measurement.internal.C15103u3) r5     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.measurement.internal.o2 r5 = r5.mo52016b()     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.measurement.internal.m2 r5 = r5.f33724g     // Catch:{ all -> 0x01e1 }
            java.lang.String r10 = "Error selecting main event"
            r5.mo52238b(r0, r10)     // Catch:{ all -> 0x01e1 }
            if (r14 == 0) goto L_0x0100
        L_0x00fd:
            r14.close()
        L_0x0100:
            r0 = 0
        L_0x0101:
            if (r0 == 0) goto L_0x01ce
            java.lang.Object r5 = r0.first
            if (r5 != 0) goto L_0x0109
            goto L_0x01ce
        L_0x0109:
            com.google.android.gms.internal.measurement.q2 r5 = (com.google.android.gms.internal.measurement.C14779q2) r5
            r1.f33735a = r5
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r13 = r0.longValue()
            r1.f33737c = r13
            com.google.android.gms.measurement.internal.s7 r0 = r1.f33738d
            com.google.android.gms.measurement.internal.f7 r0 = r0.f34048c
            r0.mo52012P()
            com.google.android.gms.internal.measurement.q2 r0 = r1.f33735a
            java.io.Serializable r0 = com.google.android.gms.measurement.internal.C14991h7.m24382m(r0, r2)
            java.lang.Long r0 = (java.lang.Long) r0
            r1.f33736b = r0
        L_0x0128:
            long r13 = r1.f33737c
            r15 = -1
            long r13 = r13 + r15
            r1.f33737c = r13
            int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x016e
            com.google.android.gms.measurement.internal.s7 r0 = r1.f33738d
            com.google.android.gms.measurement.internal.f7 r0 = r0.f34048c
            com.google.android.gms.measurement.internal.h r2 = r0.f33488d
            com.google.android.gms.measurement.internal.C14973f7.m24287I(r2)
            r2.mo51995g()
            com.google.android.gms.measurement.internal.o4 r0 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33732o
            java.lang.String r4 = "Clearing complex main event info. appId"
            r0.mo52238b(r3, r4)
            android.database.sqlite.SQLiteDatabase r0 = r2.mo52052B()     // Catch:{ SQLiteException -> 0x015d }
            java.lang.String[] r4 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x015d }
            r5 = 0
            r4[r5] = r3     // Catch:{ SQLiteException -> 0x015d }
            java.lang.String r3 = "delete from main_event_params where app_id=?"
            r0.execSQL(r3, r4)     // Catch:{ SQLiteException -> 0x015d }
            goto L_0x0180
        L_0x015d:
            r0 = move-exception
            com.google.android.gms.measurement.internal.o4 r2 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33724g
            java.lang.String r3 = "Error clearing complex main event"
            r2.mo52238b(r0, r3)
            goto L_0x0180
        L_0x016e:
            com.google.android.gms.measurement.internal.s7 r0 = r1.f33738d
            com.google.android.gms.measurement.internal.f7 r0 = r0.f34048c
            com.google.android.gms.measurement.internal.h r2 = r0.f33488d
            com.google.android.gms.measurement.internal.C14973f7.m24287I(r2)
            long r5 = r1.f33737c
            com.google.android.gms.internal.measurement.q2 r7 = r1.f33735a
            r3 = r19
            r2.mo52076r(r3, r4, r5, r7)
        L_0x0180:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.internal.measurement.q2 r2 = r1.f33735a
            com.google.android.gms.internal.measurement.z5 r2 = r2.mo50801z()
            java.util.Iterator r2 = r2.iterator()
        L_0x018f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01b0
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.u2 r3 = (com.google.android.gms.internal.measurement.C14828u2) r3
            com.google.android.gms.measurement.internal.s7 r4 = r1.f33738d
            com.google.android.gms.measurement.internal.f7 r4 = r4.f34048c
            r4.mo52012P()
            java.lang.String r4 = r3.mo50887x()
            com.google.android.gms.internal.measurement.u2 r4 = com.google.android.gms.measurement.internal.C14991h7.m24381l(r8, r4)
            if (r4 != 0) goto L_0x018f
            r0.add(r3)
            goto L_0x018f
        L_0x01b0:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x01bb
            r0.addAll(r9)
            r9 = r0
            goto L_0x01cc
        L_0x01bb:
            com.google.android.gms.measurement.internal.s7 r0 = r1.f33738d
            com.google.android.gms.measurement.internal.o4 r0 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33725h
            java.lang.String r2 = "No unique parameters in main event. eventName"
            r0.mo52238b(r11, r2)
        L_0x01cc:
            r0 = r11
            goto L_0x0237
        L_0x01ce:
            com.google.android.gms.measurement.internal.s7 r0 = r1.f33738d
            com.google.android.gms.measurement.internal.o4 r0 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33725h
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            r0.mo52239c(r11, r2, r4)
            r2 = 0
            return r2
        L_0x01e1:
            r0 = move-exception
            r5 = r14
        L_0x01e3:
            if (r5 == 0) goto L_0x01e8
            r5.close()
        L_0x01e8:
            throw r0
        L_0x01e9:
            r1.f33736b = r4
            r1.f33735a = r8
            com.google.android.gms.measurement.internal.s7 r2 = r1.f33738d
            com.google.android.gms.measurement.internal.f7 r2 = r2.f34048c
            r2.mo52012P()
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r5 = "_epc"
            java.io.Serializable r5 = com.google.android.gms.measurement.internal.C14991h7.m24382m(r8, r5)
            if (r5 == 0) goto L_0x0201
            r2 = r5
        L_0x0201:
            java.lang.Long r2 = (java.lang.Long) r2
            long r10 = r2.longValue()
            r1.f33737c = r10
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x021f
            com.google.android.gms.measurement.internal.s7 r2 = r1.f33738d
            com.google.android.gms.measurement.internal.o4 r2 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33725h
            java.lang.String r3 = "Complex event with zero extra param count. eventName"
            r2.mo52238b(r0, r3)
            goto L_0x0237
        L_0x021f:
            com.google.android.gms.measurement.internal.s7 r2 = r1.f33738d
            com.google.android.gms.measurement.internal.f7 r2 = r2.f34048c
            com.google.android.gms.measurement.internal.h r2 = r2.f33488d
            com.google.android.gms.measurement.internal.C14973f7.m24287I(r2)
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r5 = r1.f33737c
            r3 = r19
            r7 = r18
            r2.mo52076r(r3, r4, r5, r7)
        L_0x0237:
            com.google.android.gms.internal.measurement.q5 r2 = r18.mo50872n()
            com.google.android.gms.internal.measurement.p2 r2 = (com.google.android.gms.internal.measurement.C14766p2) r2
            r2.mo50770s(r0)
            boolean r0 = r2.f33059d
            if (r0 == 0) goto L_0x024b
            r2.mo50809j()
            r3 = 0
            r2.f33059d = r3
            goto L_0x024c
        L_0x024b:
            r3 = 0
        L_0x024c:
            MessageType r0 = r2.f33058c
            com.google.android.gms.internal.measurement.q2 r0 = (com.google.android.gms.internal.measurement.C14779q2) r0
            com.google.android.gms.internal.measurement.C14779q2.m23875D(r0)
            boolean r0 = r2.f33059d
            if (r0 == 0) goto L_0x025c
            r2.mo50809j()
            r2.f33059d = r3
        L_0x025c:
            MessageType r0 = r2.f33058c
            com.google.android.gms.internal.measurement.q2 r0 = (com.google.android.gms.internal.measurement.C14779q2) r0
            com.google.android.gms.internal.measurement.C14779q2.m23874C(r0, r9)
            com.google.android.gms.internal.measurement.t5 r0 = r2.mo50807h()
            com.google.android.gms.internal.measurement.q2 r0 = (com.google.android.gms.internal.measurement.C14779q2) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C15054o7.mo52282a(com.google.android.gms.internal.measurement.q2, java.lang.String):com.google.android.gms.internal.measurement.q2");
    }
}
