package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.measurement.C14720l8;
import java.io.File;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.i */
public final class C14992i implements C14941c2 {

    /* renamed from: b */
    public static final /* synthetic */ C14992i f33559b = new C14992i();

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        if (r0 == false) goto L_0x0040;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0080 A[Catch:{ all -> 0x00e4, SQLiteException -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb A[Catch:{ all -> 0x00e4, SQLiteException -> 0x00e9 }, LOOP:1: B:31:0x00bb->B:36:0x00cd, LOOP_START, PHI: r13 
      PHI: (r13v1 int) = (r13v0 int), (r13v2 int) binds: [B:30:0x00b9, B:36:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d6 A[Catch:{ all -> 0x00e4, SQLiteException -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[Catch:{  }, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m24404a(com.google.android.gms.measurement.internal.C15049o2 r15, android.database.sqlite.SQLiteDatabase r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String[] r20) throws android.database.sqlite.SQLiteException {
        /*
            r1 = r15
            r10 = r16
            r11 = r17
            r12 = r20
            if (r1 == 0) goto L_0x00fa
            r13 = 0
            r14 = 0
            java.lang.String r0 = "name"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch:{ SQLiteException -> 0x0032, all -> 0x002f }
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0032, all -> 0x002f }
            r6[r13] = r11     // Catch:{ SQLiteException -> 0x0032, all -> 0x002f }
            java.lang.String r3 = "SQLITE_MASTER"
            java.lang.String r5 = "name=?"
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r16
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0032, all -> 0x002f }
            boolean r0 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x002d }
            r2.close()
            if (r0 != 0) goto L_0x0045
            goto L_0x0040
        L_0x002d:
            r0 = move-exception
            goto L_0x0034
        L_0x002f:
            r0 = move-exception
            goto L_0x00f4
        L_0x0032:
            r0 = move-exception
            r2 = r14
        L_0x0034:
            com.google.android.gms.measurement.internal.m2 r3 = r1.f33727j     // Catch:{ all -> 0x00f2 }
            java.lang.String r4 = "Error querying for table"
            r3.mo52239c(r11, r4, r0)     // Catch:{ all -> 0x00f2 }
            if (r2 == 0) goto L_0x0040
            r2.close()
        L_0x0040:
            r2 = r18
            r10.execSQL(r2)
        L_0x0045:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ SQLiteException -> 0x00e9 }
            r0.<init>()     // Catch:{ SQLiteException -> 0x00e9 }
            int r2 = r17.length()     // Catch:{ SQLiteException -> 0x00e9 }
            int r2 = r2 + 22
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00e9 }
            r3.<init>(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r2 = "SELECT * FROM "
            r3.append(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            r3.append(r11)     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r2 = " LIMIT 0"
            r3.append(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r2 = r3.toString()     // Catch:{ SQLiteException -> 0x00e9 }
            android.database.Cursor r2 = r10.rawQuery(r2, r14)     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String[] r3 = r2.getColumnNames()     // Catch:{ all -> 0x00e4 }
            java.util.Collections.addAll(r0, r3)     // Catch:{ all -> 0x00e4 }
            r2.close()     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r2 = ","
            r3 = r19
            java.lang.String[] r2 = r3.split(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            int r3 = r2.length     // Catch:{ SQLiteException -> 0x00e9 }
            r4 = r13
        L_0x007e:
            if (r4 >= r3) goto L_0x00b9
            r5 = r2[r4]     // Catch:{ SQLiteException -> 0x00e9 }
            boolean r6 = r0.remove(r5)     // Catch:{ SQLiteException -> 0x00e9 }
            if (r6 == 0) goto L_0x008b
            int r4 = r4 + 1
            goto L_0x007e
        L_0x008b:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ SQLiteException -> 0x00e9 }
            int r2 = r17.length()     // Catch:{ SQLiteException -> 0x00e9 }
            int r2 = r2 + 35
            java.lang.String r3 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x00e9 }
            int r3 = r3.length()     // Catch:{ SQLiteException -> 0x00e9 }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00e9 }
            r3.<init>(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r2 = "Table "
            r3.append(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            r3.append(r11)     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r2 = " is missing required column: "
            r3.append(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            r3.append(r5)     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r2 = r3.toString()     // Catch:{ SQLiteException -> 0x00e9 }
            r0.<init>(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            throw r0     // Catch:{ SQLiteException -> 0x00e9 }
        L_0x00b9:
            if (r12 == 0) goto L_0x00d0
        L_0x00bb:
            int r2 = r12.length     // Catch:{ SQLiteException -> 0x00e9 }
            if (r13 >= r2) goto L_0x00d0
            r2 = r12[r13]     // Catch:{ SQLiteException -> 0x00e9 }
            boolean r2 = r0.remove(r2)     // Catch:{ SQLiteException -> 0x00e9 }
            if (r2 != 0) goto L_0x00cd
            int r2 = r13 + 1
            r2 = r12[r2]     // Catch:{ SQLiteException -> 0x00e9 }
            r10.execSQL(r2)     // Catch:{ SQLiteException -> 0x00e9 }
        L_0x00cd:
            int r13 = r13 + 2
            goto L_0x00bb
        L_0x00d0:
            boolean r2 = r0.isEmpty()     // Catch:{ SQLiteException -> 0x00e9 }
            if (r2 != 0) goto L_0x00e3
            com.google.android.gms.measurement.internal.m2 r2 = r1.f33727j     // Catch:{ SQLiteException -> 0x00e9 }
            java.lang.String r3 = "Table has extra columns. table, columns"
            java.lang.String r4 = ", "
            java.lang.String r0 = android.text.TextUtils.join(r4, r0)     // Catch:{ SQLiteException -> 0x00e9 }
            r2.mo52239c(r11, r3, r0)     // Catch:{ SQLiteException -> 0x00e9 }
        L_0x00e3:
            return
        L_0x00e4:
            r0 = move-exception
            r2.close()     // Catch:{ SQLiteException -> 0x00e9 }
            throw r0     // Catch:{ SQLiteException -> 0x00e9 }
        L_0x00e9:
            r0 = move-exception
            com.google.android.gms.measurement.internal.m2 r1 = r1.f33724g
            java.lang.String r2 = "Failed to verify columns on table that was just created"
            r1.mo52238b(r11, r2)
            throw r0
        L_0x00f2:
            r0 = move-exception
            r14 = r2
        L_0x00f4:
            if (r14 == 0) goto L_0x00f9
            r14.close()
        L_0x00f9:
            throw r0
        L_0x00fa:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Monitor must not be null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C14992i.m24404a(com.google.android.gms.measurement.internal.o2, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    /* renamed from: b */
    public static void m24405b(C15049o2 o2Var, SQLiteDatabase sQLiteDatabase) {
        if (o2Var != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                o2Var.f33727j.mo52237a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                o2Var.f33727j.mo52237a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                o2Var.f33727j.mo52237a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                o2Var.f33727j.mo52237a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    public Object zza() {
        List<C14950d2<?>> list = C14959e2.f33393a;
        return Long.valueOf(C14720l8.f32933c.zza().mo50696l());
    }
}
