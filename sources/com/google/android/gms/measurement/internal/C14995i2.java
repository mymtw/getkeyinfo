package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.util.VisibleForTesting;

/* renamed from: com.google.android.gms.measurement.internal.i2 */
public final class C14995i2 extends C14933b3 {

    /* renamed from: d */
    public final C14986h2 f33562d;

    /* renamed from: e */
    public boolean f33563e;

    public C14995i2(C15103u3 u3Var) {
        super(u3Var);
        C15103u3 u3Var2 = (C15103u3) this.f33681b;
        Context context = u3Var2.f33872b;
        u3Var2.getClass();
        this.f33562d = new C14986h2(this, context);
    }

    /* renamed from: j */
    public final boolean mo51948j() {
        return false;
    }

    @VisibleForTesting
    /* renamed from: k */
    public final SQLiteDatabase mo52118k() throws SQLiteException {
        if (this.f33563e) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f33562d.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f33563e = true;
        return null;
    }

    /* renamed from: l */
    public final void mo52119l() {
        int delete;
        mo51995g();
        try {
            SQLiteDatabase k = mo52118k();
            if (k != null && (delete = k.delete(ResponseConstants.MESSAGES, (String) null, (String[]) null)) > 0) {
                ((C15103u3) this.f33681b).mo52016b().f33732o.mo52238b(Integer.valueOf(delete), "Reset local analytics data. records");
            }
        } catch (SQLiteException e) {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52238b(e, "Error resetting local analytics data. error");
        }
    }

    /* renamed from: m */
    public final void mo52120m() {
        mo51995g();
        if (!this.f33563e) {
            C15103u3 u3Var = (C15103u3) this.f33681b;
            Context context = u3Var.f33872b;
            u3Var.getClass();
            if (context.getDatabasePath("google_app_measurement_local.db").exists()) {
                int i = 5;
                int i2 = 0;
                while (i2 < 5) {
                    SQLiteDatabase sQLiteDatabase = null;
                    try {
                        SQLiteDatabase k = mo52118k();
                        if (k == null) {
                            this.f33563e = true;
                            return;
                        }
                        k.beginTransaction();
                        k.delete(ResponseConstants.MESSAGES, "type == ?", new String[]{Integer.toString(3)});
                        k.setTransactionSuccessful();
                        k.endTransaction();
                        k.close();
                        return;
                    } catch (SQLiteFullException e) {
                        ((C15103u3) this.f33681b).mo52016b().f33724g.mo52238b(e, "Error deleting app launch break from local database");
                        this.f33563e = true;
                        if (sQLiteDatabase == null) {
                            i2++;
                        }
                        sQLiteDatabase.close();
                        i2++;
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep((long) i);
                        i += 20;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                            i2++;
                        } else {
                            i2++;
                        }
                    } catch (SQLiteException e2) {
                        if (sQLiteDatabase != null) {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        }
                        ((C15103u3) this.f33681b).mo52016b().f33724g.mo52238b(e2, "Error deleting app launch break from local database");
                        this.f33563e = true;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                            i2++;
                        } else {
                            i2++;
                        }
                    } catch (Throwable th) {
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                        throw th;
                    }
                }
                ((C15103u3) this.f33681b).mo52016b().f33727j.mo52237a("Error deleting app launch break from local database in reasonable time");
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r7v5, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v8, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: type inference failed for: r7v12 */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00cd A[SYNTHETIC, Splitter:B:47:0x00cd] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0123 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0123 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0123 A[SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo52121n(int r17, byte[] r18) {
        /*
            r16 = this;
            r1 = r16
            r16.mo51995g()
            boolean r0 = r1.f33563e
            r2 = 0
            if (r0 == 0) goto L_0x000b
            return r2
        L_0x000b:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.String r4 = "type"
            r3.put(r4, r0)
            java.lang.String r0 = "entry"
            r4 = r18
            r3.put(r0, r4)
            com.google.android.gms.measurement.internal.o4 r0 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            r0.getClass()
            r4 = 5
            r5 = r2
            r6 = r4
        L_0x002a:
            if (r5 >= r4) goto L_0x0139
            r7 = 0
            r8 = 1
            android.database.sqlite.SQLiteDatabase r9 = r16.mo52118k()     // Catch:{ SQLiteFullException -> 0x0104, SQLiteDatabaseLockedException -> 0x00f2, SQLiteException -> 0x00c9, all -> 0x00c5 }
            if (r9 != 0) goto L_0x0037
            r1.f33563e = r8     // Catch:{ SQLiteFullException -> 0x00c3, SQLiteDatabaseLockedException -> 0x00f3, SQLiteException -> 0x00bf }
            return r2
        L_0x0037:
            r9.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00c3, SQLiteDatabaseLockedException -> 0x00f3, SQLiteException -> 0x00bf }
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r10 = r9.rawQuery(r0, r7)     // Catch:{ SQLiteFullException -> 0x00c3, SQLiteDatabaseLockedException -> 0x00f3, SQLiteException -> 0x00bf }
            r11 = 0
            if (r10 == 0) goto L_0x0055
            boolean r0 = r10.moveToFirst()     // Catch:{ SQLiteFullException -> 0x0053, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0051, all -> 0x004f }
            if (r0 == 0) goto L_0x0055
            long r11 = r10.getLong(r2)     // Catch:{ SQLiteFullException -> 0x0053, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0051, all -> 0x004f }
            goto L_0x0055
        L_0x004f:
            r0 = move-exception
            goto L_0x00b3
        L_0x0051:
            r0 = move-exception
            goto L_0x00b6
        L_0x0053:
            r0 = move-exception
            goto L_0x00ba
        L_0x0055:
            r13 = 100000(0x186a0, double:4.94066E-319)
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            java.lang.String r15 = "messages"
            if (r0 < 0) goto L_0x00a0
            com.google.android.gms.measurement.internal.o4 r0 = r1.f33681b     // Catch:{ SQLiteFullException -> 0x0053, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0051, all -> 0x004f }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ SQLiteFullException -> 0x0053, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0051, all -> 0x004f }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ SQLiteFullException -> 0x0053, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0051, all -> 0x004f }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33724g     // Catch:{ SQLiteFullException -> 0x0053, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0051, all -> 0x004f }
            java.lang.String r4 = "Data loss, local db full"
            r0.mo52237a(r4)     // Catch:{ SQLiteFullException -> 0x0053, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0051, all -> 0x004f }
            long r13 = r13 - r11
            r11 = 1
            long r13 = r13 + r11
            java.lang.String[] r0 = new java.lang.String[r8]     // Catch:{ SQLiteFullException -> 0x0053, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0051, all -> 0x004f }
            java.lang.String r4 = java.lang.Long.toString(r13)     // Catch:{ SQLiteFullException -> 0x0053, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0051, all -> 0x004f }
            r0[r2] = r4     // Catch:{ SQLiteFullException -> 0x0053, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0051, all -> 0x004f }
            java.lang.String r4 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            int r0 = r9.delete(r15, r4, r0)     // Catch:{ SQLiteFullException -> 0x0053, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0051, all -> 0x004f }
            long r11 = (long) r0     // Catch:{ SQLiteFullException -> 0x0053, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0051, all -> 0x004f }
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x00a0
            com.google.android.gms.measurement.internal.o4 r0 = r1.f33681b     // Catch:{ SQLiteFullException -> 0x0053, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0051, all -> 0x004f }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ SQLiteFullException -> 0x0053, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0051, all -> 0x004f }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ SQLiteFullException -> 0x0053, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0051, all -> 0x004f }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33724g     // Catch:{ SQLiteFullException -> 0x0053, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0051, all -> 0x004f }
            java.lang.String r4 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r2 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0053, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0051, all -> 0x004f }
            java.lang.Long r8 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteFullException -> 0x0053, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0051, all -> 0x004f }
            long r13 = r13 - r11
            java.lang.Long r11 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0053, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0051, all -> 0x004f }
            r0.mo52240d(r2, r8, r11, r4)     // Catch:{ SQLiteFullException -> 0x0053, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0051, all -> 0x004f }
        L_0x00a0:
            r9.insertOrThrow(r15, r7, r3)     // Catch:{ SQLiteFullException -> 0x0053, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0051, all -> 0x004f }
            r9.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0053, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0051, all -> 0x004f }
            r9.endTransaction()     // Catch:{ SQLiteFullException -> 0x0053, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x0051, all -> 0x004f }
            if (r10 == 0) goto L_0x00ae
            r10.close()
        L_0x00ae:
            r9.close()
            r2 = 1
            return r2
        L_0x00b3:
            r7 = r10
            goto L_0x012e
        L_0x00b6:
            r7 = r10
            goto L_0x00c0
        L_0x00b8:
            r7 = r10
            goto L_0x00f3
        L_0x00ba:
            r7 = r10
            goto L_0x0106
        L_0x00bc:
            r0 = move-exception
            goto L_0x012e
        L_0x00bf:
            r0 = move-exception
        L_0x00c0:
            r2 = r7
            r7 = r9
            goto L_0x00cb
        L_0x00c3:
            r0 = move-exception
            goto L_0x0106
        L_0x00c5:
            r0 = move-exception
            r9 = r7
            goto L_0x012e
        L_0x00c9:
            r0 = move-exception
            r2 = r7
        L_0x00cb:
            if (r7 == 0) goto L_0x00d6
            boolean r4 = r7.inTransaction()     // Catch:{ all -> 0x00f0 }
            if (r4 == 0) goto L_0x00d6
            r7.endTransaction()     // Catch:{ all -> 0x00f0 }
        L_0x00d6:
            com.google.android.gms.measurement.internal.o4 r4 = r1.f33681b     // Catch:{ all -> 0x00f0 }
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4     // Catch:{ all -> 0x00f0 }
            com.google.android.gms.measurement.internal.o2 r4 = r4.mo52016b()     // Catch:{ all -> 0x00f0 }
            com.google.android.gms.measurement.internal.m2 r4 = r4.f33724g     // Catch:{ all -> 0x00f0 }
            java.lang.String r8 = "Error writing entry to local database"
            r4.mo52238b(r0, r8)     // Catch:{ all -> 0x00f0 }
            r4 = 1
            r1.f33563e = r4     // Catch:{ all -> 0x00f0 }
            if (r2 == 0) goto L_0x00ed
            r2.close()
        L_0x00ed:
            if (r7 == 0) goto L_0x0123
            goto L_0x0120
        L_0x00f0:
            r0 = move-exception
            goto L_0x012c
        L_0x00f2:
            r9 = r7
        L_0x00f3:
            long r10 = (long) r6
            android.os.SystemClock.sleep(r10)     // Catch:{ all -> 0x00bc }
            int r6 = r6 + 20
            if (r7 == 0) goto L_0x00fe
            r7.close()
        L_0x00fe:
            if (r9 == 0) goto L_0x0123
            r9.close()
            goto L_0x0123
        L_0x0104:
            r0 = move-exception
            r9 = r7
        L_0x0106:
            com.google.android.gms.measurement.internal.o4 r2 = r1.f33681b     // Catch:{ all -> 0x0129 }
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2     // Catch:{ all -> 0x0129 }
            com.google.android.gms.measurement.internal.o2 r2 = r2.mo52016b()     // Catch:{ all -> 0x0129 }
            com.google.android.gms.measurement.internal.m2 r2 = r2.f33724g     // Catch:{ all -> 0x0129 }
            java.lang.String r4 = "Error writing entry; local database full"
            r2.mo52238b(r0, r4)     // Catch:{ all -> 0x0129 }
            r2 = 1
            r1.f33563e = r2     // Catch:{ all -> 0x0129 }
            if (r7 == 0) goto L_0x011d
            r7.close()
        L_0x011d:
            if (r9 == 0) goto L_0x0123
            r7 = r9
        L_0x0120:
            r7.close()
        L_0x0123:
            int r5 = r5 + 1
            r2 = 0
            r4 = 5
            goto L_0x002a
        L_0x0129:
            r0 = move-exception
            r2 = r7
            r7 = r9
        L_0x012c:
            r9 = r7
            r7 = r2
        L_0x012e:
            if (r7 == 0) goto L_0x0133
            r7.close()
        L_0x0133:
            if (r9 == 0) goto L_0x0138
            r9.close()
        L_0x0138:
            throw r0
        L_0x0139:
            com.google.android.gms.measurement.internal.o4 r0 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33732o
            java.lang.String r2 = "Failed to write entry to local database"
            r0.mo52237a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C14995i2.mo52121n(int, byte[]):boolean");
    }
}
