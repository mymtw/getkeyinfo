package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.lang3.time.DateUtils;
import p604kj.C18100e;

@VisibleForTesting
/* renamed from: com.google.android.gms.measurement.internal.i6 */
public final class C14999i6 extends C14933b3 {

    /* renamed from: d */
    public final zzjn f33573d;

    /* renamed from: e */
    public zzeb f33574e;

    /* renamed from: f */
    public volatile Boolean f33575f;

    /* renamed from: g */
    public final C14927a6 f33576g;

    /* renamed from: h */
    public final C15122w6 f33577h;

    /* renamed from: i */
    public final ArrayList f33578i = new ArrayList();

    /* renamed from: j */
    public final C14954d6 f33579j;

    public C14999i6(C15103u3 u3Var) {
        super(u3Var);
        this.f33577h = new C15122w6(u3Var.f33885o);
        this.f33573d = new zzjn(this);
        this.f33576g = new C14927a6(this, u3Var);
        this.f33579j = new C14954d6(this, u3Var);
    }

    /* renamed from: u */
    public static void m24411u(C14999i6 i6Var, ComponentName componentName) {
        i6Var.mo51995g();
        if (i6Var.f33574e != null) {
            i6Var.f33574e = null;
            ((C15103u3) i6Var.f33681b).mo52016b().f33732o.mo52238b(componentName, "Disconnected from device MeasurementService");
            i6Var.mo51995g();
            i6Var.mo52135v();
        }
    }

    /* renamed from: j */
    public final boolean mo51948j() {
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v50, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v58, resolved type: int} */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:77|78|79|80) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:92|93|94|95) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:63|64|65|66|244) */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0247, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x024a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0261, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0263, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0265, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x02f9, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x02fe, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x01db, code lost:
        r17 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b6, code lost:
        r17 = r7;
        r16 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bd, code lost:
        r17 = r7;
        r16 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c4, code lost:
        r17 = r7;
        r16 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0124, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        ((com.google.android.gms.measurement.internal.C15103u3) r9.f33681b).mo52016b().f33724g.mo52237a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x013b, code lost:
        r17 = r17;
        r17 = r17;
        r17 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r14.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        ((com.google.android.gms.measurement.internal.C15103u3) r9.f33681b).mo52016b().f33724g.mo52237a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0172, code lost:
        r17 = r17;
        r17 = r17;
        r17 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r7.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        ((com.google.android.gms.measurement.internal.C15103u3) r9.f33681b).mo52016b().f33724g.mo52237a("Failed to load conditional user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01ab, code lost:
        r17 = r17;
        r17 = r17;
        r17 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        r7.recycle();
        r0 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x012c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x0163 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x019c */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x025d A[SYNTHETIC, Splitter:B:140:0x025d] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0265 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:14:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x028e A[SYNTHETIC, Splitter:B:165:0x028e] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0260 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x02e8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x02e8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x02e8 A[SYNTHETIC] */
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52125k(com.google.android.gms.measurement.internal.zzeb r28, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r29, com.google.android.gms.measurement.internal.zzp r30) {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r27.mo51995g()
            r27.mo51946h()
            com.google.android.gms.measurement.internal.o4 r0 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            r0.getClass()
            com.google.android.gms.measurement.internal.o4 r0 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            r0.getClass()
            r5 = 100
            r6 = 0
            r0 = r5
            r7 = r6
        L_0x0021:
            r8 = 1001(0x3e9, float:1.403E-42)
            if (r7 >= r8) goto L_0x03a4
            if (r0 != r5) goto L_0x03a4
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            com.google.android.gms.measurement.internal.o4 r0 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.i2 r9 = r0.mo52328o()
            java.lang.String r10 = "rowid"
            java.lang.String r11 = "Error reading entries from local database"
            r9.mo51995g()
            boolean r0 = r9.f33563e
            if (r0 == 0) goto L_0x0040
            goto L_0x0068
        L_0x0040:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            com.google.android.gms.measurement.internal.o4 r0 = r9.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            android.content.Context r14 = r0.f33872b
            r0.getClass()
            java.lang.String r0 = "google_app_measurement_local.db"
            java.io.File r0 = r14.getDatabasePath(r0)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0315
            r14 = 5
            r15 = r6
            r12 = r14
        L_0x005d:
            if (r15 >= r14) goto L_0x0302
            r14 = 1
            android.database.sqlite.SQLiteDatabase r5 = r9.mo52118k()     // Catch:{ SQLiteFullException -> 0x02c6, SQLiteDatabaseLockedException -> 0x02b0, SQLiteException -> 0x0284, all -> 0x027f }
            if (r5 != 0) goto L_0x006c
            r9.f33563e = r14     // Catch:{ SQLiteFullException -> 0x0276, SQLiteDatabaseLockedException -> 0x026e, SQLiteException -> 0x0267, all -> 0x0265 }
        L_0x0068:
            r17 = r7
            goto L_0x0313
        L_0x006c:
            r5.beginTransaction()     // Catch:{ SQLiteFullException -> 0x0276, SQLiteDatabaseLockedException -> 0x026e, SQLiteException -> 0x0267, all -> 0x0265 }
            java.lang.String r0 = "3"
            java.lang.String r17 = "messages"
            java.lang.String[] r18 = new java.lang.String[]{r10}     // Catch:{ all -> 0x0254 }
            java.lang.String r19 = "type=?"
            java.lang.String[] r20 = new java.lang.String[]{r0}     // Catch:{ all -> 0x0254 }
            r21 = 0
            r22 = 0
            java.lang.String r23 = "rowid desc"
            java.lang.String r24 = "1"
            r16 = r5
            android.database.Cursor r14 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0254 }
            boolean r0 = r14.moveToFirst()     // Catch:{ all -> 0x024d }
            r25 = -1
            if (r0 == 0) goto L_0x009b
            long r16 = r14.getLong(r6)     // Catch:{ all -> 0x024d }
            r14.close()     // Catch:{ SQLiteFullException -> 0x0276, SQLiteDatabaseLockedException -> 0x026e, SQLiteException -> 0x0267, all -> 0x0265 }
            goto L_0x00a0
        L_0x009b:
            r14.close()     // Catch:{ SQLiteFullException -> 0x0276, SQLiteDatabaseLockedException -> 0x026e, SQLiteException -> 0x0267, all -> 0x0265 }
            r16 = r25
        L_0x00a0:
            int r0 = (r16 > r25 ? 1 : (r16 == r25 ? 0 : -1))
            if (r0 == 0) goto L_0x00cb
            java.lang.String r0 = "rowid<?"
            r14 = 1
            java.lang.String[] r6 = new java.lang.String[r14]     // Catch:{ SQLiteFullException -> 0x024a, SQLiteDatabaseLockedException -> 0x00bd, SQLiteException -> 0x0247, all -> 0x0265 }
            java.lang.String r14 = java.lang.String.valueOf(r16)     // Catch:{ SQLiteFullException -> 0x024a, SQLiteDatabaseLockedException -> 0x00bd, SQLiteException -> 0x0247, all -> 0x0265 }
            r16 = 0
            r6[r16] = r14     // Catch:{ SQLiteFullException -> 0x024a, SQLiteDatabaseLockedException -> 0x00bd, SQLiteException -> 0x0247, all -> 0x0265 }
            r19 = r0
            r20 = r6
            goto L_0x00cf
        L_0x00b6:
            r17 = r7
            r16 = r10
            r10 = 0
            goto L_0x028b
        L_0x00bd:
            r17 = r7
            r16 = r10
            r10 = 0
            goto L_0x0273
        L_0x00c4:
            r17 = r7
            r16 = r10
            r10 = 0
            goto L_0x027c
        L_0x00cb:
            r19 = 0
            r20 = 0
        L_0x00cf:
            java.lang.String r0 = "type"
            java.lang.String r6 = "entry"
            java.lang.String[] r18 = new java.lang.String[]{r10, r0, r6}     // Catch:{ SQLiteFullException -> 0x024a, SQLiteDatabaseLockedException -> 0x00bd, SQLiteException -> 0x0247, all -> 0x0265 }
            java.lang.String r17 = "messages"
            r21 = 0
            r22 = 0
            java.lang.String r23 = "rowid asc"
            r6 = 100
            java.lang.String r24 = java.lang.Integer.toString(r6)     // Catch:{ SQLiteFullException -> 0x024a, SQLiteDatabaseLockedException -> 0x00bd, SQLiteException -> 0x0247, all -> 0x0265 }
            r16 = r5
            android.database.Cursor r6 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ SQLiteFullException -> 0x024a, SQLiteDatabaseLockedException -> 0x00bd, SQLiteException -> 0x0247, all -> 0x0265 }
        L_0x00eb:
            boolean r0 = r6.moveToNext()     // Catch:{ SQLiteFullException -> 0x0241, SQLiteDatabaseLockedException -> 0x023b, SQLiteException -> 0x0235 }
            if (r0 == 0) goto L_0x01f2
            r14 = 0
            long r25 = r6.getLong(r14)     // Catch:{ SQLiteFullException -> 0x0241, SQLiteDatabaseLockedException -> 0x023b, SQLiteException -> 0x0235 }
            r14 = 1
            int r0 = r6.getInt(r14)     // Catch:{ SQLiteFullException -> 0x0241, SQLiteDatabaseLockedException -> 0x023b, SQLiteException -> 0x0235 }
            r14 = 2
            r16 = r10
            byte[] r10 = r6.getBlob(r14)     // Catch:{ SQLiteFullException -> 0x01e8, SQLiteDatabaseLockedException -> 0x01e5, SQLiteException -> 0x01e1 }
            if (r0 != 0) goto L_0x0144
            android.os.Parcel r14 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x01e8, SQLiteDatabaseLockedException -> 0x01e5, SQLiteException -> 0x01e1 }
            int r0 = r10.length     // Catch:{ ParseException -> 0x012a, all -> 0x0126 }
            r17 = r7
            r7 = 0
            r14.unmarshall(r10, r7, r0)     // Catch:{ ParseException -> 0x012c }
            r14.setDataPosition(r7)     // Catch:{ ParseException -> 0x012c }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzat> r0 = com.google.android.gms.measurement.internal.zzat.CREATOR     // Catch:{ ParseException -> 0x012c }
            java.lang.Object r0 = r0.createFromParcel(r14)     // Catch:{ ParseException -> 0x012c }
            com.google.android.gms.measurement.internal.zzat r0 = (com.google.android.gms.measurement.internal.zzat) r0     // Catch:{ ParseException -> 0x012c }
            r14.recycle()     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x023f, SQLiteException -> 0x0231 }
            if (r0 == 0) goto L_0x01db
            r13.add(r0)     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x023f, SQLiteException -> 0x0231 }
            goto L_0x01db
        L_0x0124:
            r0 = move-exception
            goto L_0x0140
        L_0x0126:
            r0 = move-exception
            r17 = r7
            goto L_0x0140
        L_0x012a:
            r17 = r7
        L_0x012c:
            com.google.android.gms.measurement.internal.o4 r0 = r9.f33681b     // Catch:{ all -> 0x0124 }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ all -> 0x0124 }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ all -> 0x0124 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33724g     // Catch:{ all -> 0x0124 }
            java.lang.String r7 = "Failed to load event from local database"
            r0.mo52237a(r7)     // Catch:{ all -> 0x0124 }
            r14.recycle()     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x023f, SQLiteException -> 0x0231 }
            goto L_0x01db
        L_0x0140:
            r14.recycle()     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x023f, SQLiteException -> 0x0231 }
            throw r0     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x023f, SQLiteException -> 0x0231 }
        L_0x0144:
            r17 = r7
            r7 = 1
            if (r0 != r7) goto L_0x0180
            android.os.Parcel r7 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x023f, SQLiteException -> 0x0231 }
            int r0 = r10.length     // Catch:{ ParseException -> 0x0163 }
            r14 = 0
            r7.unmarshall(r10, r14, r0)     // Catch:{ ParseException -> 0x0163 }
            r7.setDataPosition(r14)     // Catch:{ ParseException -> 0x0163 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzkv> r0 = com.google.android.gms.measurement.internal.zzkv.CREATOR     // Catch:{ ParseException -> 0x0163 }
            java.lang.Object r0 = r0.createFromParcel(r7)     // Catch:{ ParseException -> 0x0163 }
            com.google.android.gms.measurement.internal.zzkv r0 = (com.google.android.gms.measurement.internal.zzkv) r0     // Catch:{ ParseException -> 0x0163 }
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x023f, SQLiteException -> 0x0231 }
            goto L_0x0176
        L_0x0161:
            r0 = move-exception
            goto L_0x017c
        L_0x0163:
            com.google.android.gms.measurement.internal.o4 r0 = r9.f33681b     // Catch:{ all -> 0x0161 }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ all -> 0x0161 }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ all -> 0x0161 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33724g     // Catch:{ all -> 0x0161 }
            java.lang.String r10 = "Failed to load user property from local database"
            r0.mo52237a(r10)     // Catch:{ all -> 0x0161 }
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x023f, SQLiteException -> 0x0231 }
            r0 = 0
        L_0x0176:
            if (r0 == 0) goto L_0x01db
            r13.add(r0)     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x023f, SQLiteException -> 0x0231 }
            goto L_0x01db
        L_0x017c:
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x023f, SQLiteException -> 0x0231 }
            throw r0     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x023f, SQLiteException -> 0x0231 }
        L_0x0180:
            if (r0 != r14) goto L_0x01b9
            android.os.Parcel r7 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x023f, SQLiteException -> 0x0231 }
            int r0 = r10.length     // Catch:{ ParseException -> 0x019c }
            r14 = 0
            r7.unmarshall(r10, r14, r0)     // Catch:{ ParseException -> 0x019c }
            r7.setDataPosition(r14)     // Catch:{ ParseException -> 0x019c }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzab> r0 = com.google.android.gms.measurement.internal.zzab.CREATOR     // Catch:{ ParseException -> 0x019c }
            java.lang.Object r0 = r0.createFromParcel(r7)     // Catch:{ ParseException -> 0x019c }
            com.google.android.gms.measurement.internal.zzab r0 = (com.google.android.gms.measurement.internal.zzab) r0     // Catch:{ ParseException -> 0x019c }
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x023f, SQLiteException -> 0x0231 }
            goto L_0x01af
        L_0x019a:
            r0 = move-exception
            goto L_0x01b5
        L_0x019c:
            com.google.android.gms.measurement.internal.o4 r0 = r9.f33681b     // Catch:{ all -> 0x019a }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ all -> 0x019a }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ all -> 0x019a }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33724g     // Catch:{ all -> 0x019a }
            java.lang.String r10 = "Failed to load conditional user property from local database"
            r0.mo52237a(r10)     // Catch:{ all -> 0x019a }
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x023f, SQLiteException -> 0x0231 }
            r0 = 0
        L_0x01af:
            if (r0 == 0) goto L_0x01db
            r13.add(r0)     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x023f, SQLiteException -> 0x0231 }
            goto L_0x01db
        L_0x01b5:
            r7.recycle()     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x023f, SQLiteException -> 0x0231 }
            throw r0     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x023f, SQLiteException -> 0x0231 }
        L_0x01b9:
            r7 = 3
            if (r0 != r7) goto L_0x01cc
            com.google.android.gms.measurement.internal.o4 r0 = r9.f33681b     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x023f, SQLiteException -> 0x0231 }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x023f, SQLiteException -> 0x0231 }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x023f, SQLiteException -> 0x0231 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33727j     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x023f, SQLiteException -> 0x0231 }
            java.lang.String r7 = "Skipping app launch break"
            r0.mo52237a(r7)     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x023f, SQLiteException -> 0x0231 }
            goto L_0x01db
        L_0x01cc:
            com.google.android.gms.measurement.internal.o4 r0 = r9.f33681b     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x023f, SQLiteException -> 0x0231 }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x023f, SQLiteException -> 0x0231 }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x023f, SQLiteException -> 0x0231 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33724g     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x023f, SQLiteException -> 0x0231 }
            java.lang.String r7 = "Unknown record type in local database"
            r0.mo52237a(r7)     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x023f, SQLiteException -> 0x0231 }
        L_0x01db:
            r10 = r16
            r7 = r17
            goto L_0x00eb
        L_0x01e1:
            r0 = move-exception
            r17 = r7
            goto L_0x01ec
        L_0x01e5:
            r17 = r7
            goto L_0x023f
        L_0x01e8:
            r0 = move-exception
            r17 = r7
            goto L_0x01ef
        L_0x01ec:
            r10 = 0
            goto L_0x028c
        L_0x01ef:
            r10 = 0
            goto L_0x027d
        L_0x01f2:
            r17 = r7
            r16 = r10
            r7 = 1
            java.lang.String[] r0 = new java.lang.String[r7]     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x023f, SQLiteException -> 0x0231 }
            java.lang.String r7 = java.lang.Long.toString(r25)     // Catch:{ SQLiteFullException -> 0x0233, SQLiteDatabaseLockedException -> 0x023f, SQLiteException -> 0x0231 }
            r10 = 0
            r0[r10] = r7     // Catch:{ SQLiteFullException -> 0x022e, SQLiteDatabaseLockedException -> 0x0274, SQLiteException -> 0x022b }
            java.lang.String r7 = "messages"
            java.lang.String r14 = "rowid <= ?"
            int r0 = r5.delete(r7, r14, r0)     // Catch:{ SQLiteFullException -> 0x022e, SQLiteDatabaseLockedException -> 0x0274, SQLiteException -> 0x022b }
            int r7 = r13.size()     // Catch:{ SQLiteFullException -> 0x022e, SQLiteDatabaseLockedException -> 0x0274, SQLiteException -> 0x022b }
            if (r0 >= r7) goto L_0x021d
            com.google.android.gms.measurement.internal.o4 r0 = r9.f33681b     // Catch:{ SQLiteFullException -> 0x022e, SQLiteDatabaseLockedException -> 0x0274, SQLiteException -> 0x022b }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ SQLiteFullException -> 0x022e, SQLiteDatabaseLockedException -> 0x0274, SQLiteException -> 0x022b }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ SQLiteFullException -> 0x022e, SQLiteDatabaseLockedException -> 0x0274, SQLiteException -> 0x022b }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33724g     // Catch:{ SQLiteFullException -> 0x022e, SQLiteDatabaseLockedException -> 0x0274, SQLiteException -> 0x022b }
            java.lang.String r7 = "Fewer entries removed from local database than expected"
            r0.mo52237a(r7)     // Catch:{ SQLiteFullException -> 0x022e, SQLiteDatabaseLockedException -> 0x0274, SQLiteException -> 0x022b }
        L_0x021d:
            r5.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x022e, SQLiteDatabaseLockedException -> 0x0274, SQLiteException -> 0x022b }
            r5.endTransaction()     // Catch:{ SQLiteFullException -> 0x022e, SQLiteDatabaseLockedException -> 0x0274, SQLiteException -> 0x022b }
            r6.close()
            r5.close()
            goto L_0x0317
        L_0x022b:
            r0 = move-exception
            goto L_0x028c
        L_0x022e:
            r0 = move-exception
            goto L_0x027d
        L_0x0231:
            r0 = move-exception
            goto L_0x01ec
        L_0x0233:
            r0 = move-exception
            goto L_0x01ef
        L_0x0235:
            r0 = move-exception
            r17 = r7
            r16 = r10
            goto L_0x01ec
        L_0x023b:
            r17 = r7
            r16 = r10
        L_0x023f:
            r10 = 0
            goto L_0x0274
        L_0x0241:
            r0 = move-exception
            r17 = r7
            r16 = r10
            goto L_0x01ef
        L_0x0247:
            r0 = move-exception
            goto L_0x00b6
        L_0x024a:
            r0 = move-exception
            goto L_0x00c4
        L_0x024d:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r10 = r6
            goto L_0x025b
        L_0x0254:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r10 = r6
            r14 = 0
        L_0x025b:
            if (r14 == 0) goto L_0x0260
            r14.close()     // Catch:{ SQLiteFullException -> 0x0263, SQLiteDatabaseLockedException -> 0x0273, SQLiteException -> 0x0261, all -> 0x0265 }
        L_0x0260:
            throw r0     // Catch:{ SQLiteFullException -> 0x0263, SQLiteDatabaseLockedException -> 0x0273, SQLiteException -> 0x0261, all -> 0x0265 }
        L_0x0261:
            r0 = move-exception
            goto L_0x028b
        L_0x0263:
            r0 = move-exception
            goto L_0x027c
        L_0x0265:
            r0 = move-exception
            goto L_0x0281
        L_0x0267:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r10 = r6
            goto L_0x028b
        L_0x026e:
            r17 = r7
            r16 = r10
            r10 = r6
        L_0x0273:
            r6 = 0
        L_0x0274:
            r7 = r11
            goto L_0x02b8
        L_0x0276:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r10 = r6
        L_0x027c:
            r6 = 0
        L_0x027d:
            r7 = r11
            goto L_0x02ce
        L_0x027f:
            r0 = move-exception
            r5 = 0
        L_0x0281:
            r12 = 0
            goto L_0x02f7
        L_0x0284:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r10 = r6
            r5 = 0
        L_0x028b:
            r6 = 0
        L_0x028c:
            if (r5 == 0) goto L_0x0297
            boolean r7 = r5.inTransaction()     // Catch:{ all -> 0x02f5 }
            if (r7 == 0) goto L_0x0297
            r5.endTransaction()     // Catch:{ all -> 0x02f5 }
        L_0x0297:
            com.google.android.gms.measurement.internal.o4 r7 = r9.f33681b     // Catch:{ all -> 0x02f5 }
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7     // Catch:{ all -> 0x02f5 }
            com.google.android.gms.measurement.internal.o2 r7 = r7.mo52016b()     // Catch:{ all -> 0x02f5 }
            com.google.android.gms.measurement.internal.m2 r7 = r7.f33724g     // Catch:{ all -> 0x02f5 }
            r7.mo52238b(r0, r11)     // Catch:{ all -> 0x02f5 }
            r7 = 1
            r9.f33563e = r7     // Catch:{ all -> 0x02f5 }
            if (r6 == 0) goto L_0x02ac
            r6.close()
        L_0x02ac:
            r7 = r11
            if (r5 == 0) goto L_0x02e8
            goto L_0x02e5
        L_0x02b0:
            r17 = r7
            r16 = r10
            r10 = r6
            r7 = r11
            r5 = 0
            r6 = 0
        L_0x02b8:
            long r10 = (long) r12
            android.os.SystemClock.sleep(r10)     // Catch:{ all -> 0x02f5 }
            int r12 = r12 + 20
            if (r6 == 0) goto L_0x02c3
            r6.close()
        L_0x02c3:
            if (r5 == 0) goto L_0x02e8
            goto L_0x02e5
        L_0x02c6:
            r0 = move-exception
            r17 = r7
            r16 = r10
            r7 = r11
            r5 = 0
            r6 = 0
        L_0x02ce:
            com.google.android.gms.measurement.internal.o4 r10 = r9.f33681b     // Catch:{ all -> 0x02f5 }
            com.google.android.gms.measurement.internal.u3 r10 = (com.google.android.gms.measurement.internal.C15103u3) r10     // Catch:{ all -> 0x02f5 }
            com.google.android.gms.measurement.internal.o2 r10 = r10.mo52016b()     // Catch:{ all -> 0x02f5 }
            com.google.android.gms.measurement.internal.m2 r10 = r10.f33724g     // Catch:{ all -> 0x02f5 }
            r10.mo52238b(r0, r7)     // Catch:{ all -> 0x02f5 }
            r10 = 1
            r9.f33563e = r10     // Catch:{ all -> 0x02f5 }
            if (r6 == 0) goto L_0x02e3
            r6.close()
        L_0x02e3:
            if (r5 == 0) goto L_0x02e8
        L_0x02e5:
            r5.close()
        L_0x02e8:
            int r15 = r15 + 1
            r11 = r7
            r10 = r16
            r7 = r17
            r5 = 100
            r6 = 0
            r14 = 5
            goto L_0x005d
        L_0x02f5:
            r0 = move-exception
            r12 = r6
        L_0x02f7:
            if (r12 == 0) goto L_0x02fc
            r12.close()
        L_0x02fc:
            if (r5 == 0) goto L_0x0301
            r5.close()
        L_0x0301:
            throw r0
        L_0x0302:
            r17 = r7
            com.google.android.gms.measurement.internal.o4 r0 = r9.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33727j
            java.lang.String r5 = "Failed to read events from database in reasonable time"
            r0.mo52237a(r5)
        L_0x0313:
            r12 = 0
            goto L_0x0318
        L_0x0315:
            r17 = r7
        L_0x0317:
            r12 = r13
        L_0x0318:
            if (r12 == 0) goto L_0x0323
            r8.addAll(r12)
            int r0 = r12.size()
            r5 = r0
            goto L_0x0324
        L_0x0323:
            r5 = 0
        L_0x0324:
            r6 = 100
            if (r3 == 0) goto L_0x032d
            if (r5 >= r6) goto L_0x032d
            r8.add(r3)
        L_0x032d:
            int r7 = r8.size()
            r9 = 0
        L_0x0332:
            if (r9 >= r7) goto L_0x039d
            java.lang.Object r0 = r8.get(r9)
            com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r0 = (com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable) r0
            boolean r10 = r0 instanceof com.google.android.gms.measurement.internal.zzat
            if (r10 == 0) goto L_0x0355
            com.google.android.gms.measurement.internal.zzat r0 = (com.google.android.gms.measurement.internal.zzat) r0     // Catch:{ RemoteException -> 0x0344 }
            r2.zzk(r0, r4)     // Catch:{ RemoteException -> 0x0344 }
            goto L_0x039a
        L_0x0344:
            r0 = move-exception
            com.google.android.gms.measurement.internal.o4 r10 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r10 = (com.google.android.gms.measurement.internal.C15103u3) r10
            com.google.android.gms.measurement.internal.o2 r10 = r10.mo52016b()
            com.google.android.gms.measurement.internal.m2 r10 = r10.f33724g
            java.lang.String r11 = "Failed to send event to the service"
            r10.mo52238b(r0, r11)
            goto L_0x039a
        L_0x0355:
            boolean r10 = r0 instanceof com.google.android.gms.measurement.internal.zzkv
            if (r10 == 0) goto L_0x0370
            com.google.android.gms.measurement.internal.zzkv r0 = (com.google.android.gms.measurement.internal.zzkv) r0     // Catch:{ RemoteException -> 0x035f }
            r2.zzt(r0, r4)     // Catch:{ RemoteException -> 0x035f }
            goto L_0x039a
        L_0x035f:
            r0 = move-exception
            com.google.android.gms.measurement.internal.o4 r10 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r10 = (com.google.android.gms.measurement.internal.C15103u3) r10
            com.google.android.gms.measurement.internal.o2 r10 = r10.mo52016b()
            com.google.android.gms.measurement.internal.m2 r10 = r10.f33724g
            java.lang.String r11 = "Failed to send user property to the service"
            r10.mo52238b(r0, r11)
            goto L_0x039a
        L_0x0370:
            boolean r10 = r0 instanceof com.google.android.gms.measurement.internal.zzab
            if (r10 == 0) goto L_0x038b
            com.google.android.gms.measurement.internal.zzab r0 = (com.google.android.gms.measurement.internal.zzab) r0     // Catch:{ RemoteException -> 0x037a }
            r2.zzn(r0, r4)     // Catch:{ RemoteException -> 0x037a }
            goto L_0x039a
        L_0x037a:
            r0 = move-exception
            com.google.android.gms.measurement.internal.o4 r10 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r10 = (com.google.android.gms.measurement.internal.C15103u3) r10
            com.google.android.gms.measurement.internal.o2 r10 = r10.mo52016b()
            com.google.android.gms.measurement.internal.m2 r10 = r10.f33724g
            java.lang.String r11 = "Failed to send conditional user property to the service"
            r10.mo52238b(r0, r11)
            goto L_0x039a
        L_0x038b:
            com.google.android.gms.measurement.internal.o4 r0 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33724g
            java.lang.String r10 = "Discarding data. Unrecognized parcel type."
            r0.mo52237a(r10)
        L_0x039a:
            int r9 = r9 + 1
            goto L_0x0332
        L_0x039d:
            int r7 = r17 + 1
            r0 = r5
            r5 = r6
            r6 = 0
            goto L_0x0021
        L_0x03a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C14999i6.mo52125k(com.google.android.gms.measurement.internal.zzeb, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable, com.google.android.gms.measurement.internal.zzp):void");
    }

    /* renamed from: l */
    public final void mo52126l(zzab zzab) {
        boolean z;
        Preconditions.checkNotNull(zzab);
        mo51995g();
        mo51946h();
        ((C15103u3) this.f33681b).getClass();
        C14995i2 o = ((C15103u3) this.f33681b).mo52328o();
        ((C15103u3) o.f33681b).mo52335w().getClass();
        byte[] W = C15018k7.m24474W(zzab);
        if (W.length > 131072) {
            ((C15103u3) o.f33681b).mo52016b().f33725h.mo52237a("Conditional user property too long for local database. Sending directly to service");
            z = false;
        } else {
            z = o.mo52121n(2, W);
        }
        zzab zzab2 = new zzab(zzab);
        mo52133s(new C18100e(this, mo52130p(true), z, zzab2, zzab));
    }

    /* renamed from: m */
    public final boolean mo52127m() {
        mo51995g();
        mo51946h();
        return this.f33574e != null;
    }

    /* renamed from: n */
    public final boolean mo52128n() {
        mo51995g();
        mo51946h();
        return !mo52129o() || ((C15103u3) this.f33681b).mo52335w().mo52210g0() >= C14959e2.f33418m0.mo51978a(null).intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0142  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo52129o() {
        /*
            r8 = this;
            r8.mo51995g()
            r8.mo51946h()
            java.lang.Boolean r0 = r8.f33575f
            if (r0 != 0) goto L_0x0164
            r8.mo51995g()
            r8.mo51946h()
            com.google.android.gms.measurement.internal.o4 r0 = r8.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.c3 r0 = r0.mo52330q()
            r0.mo51995g()
            android.content.SharedPreferences r1 = r0.mo51953k()
            java.lang.String r2 = "use_service"
            boolean r1 = r1.contains(r2)
            r3 = 0
            if (r1 != 0) goto L_0x002a
            r0 = 0
            goto L_0x0036
        L_0x002a:
            android.content.SharedPreferences r0 = r0.mo51953k()
            boolean r0 = r0.getBoolean(r2, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0036:
            r1 = 1
            if (r0 == 0) goto L_0x0041
            boolean r4 = r0.booleanValue()
            if (r4 == 0) goto L_0x0041
            goto L_0x015e
        L_0x0041:
            com.google.android.gms.measurement.internal.o4 r4 = r8.f33681b
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4
            r4.getClass()
            com.google.android.gms.measurement.internal.o4 r4 = r8.f33681b
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4
            com.google.android.gms.measurement.internal.g2 r4 = r4.mo52327n()
            r4.mo51946h()
            int r4 = r4.f33523k
            if (r4 != r1) goto L_0x0059
            goto L_0x0123
        L_0x0059:
            com.google.android.gms.measurement.internal.o4 r4 = r8.f33681b
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4
            com.google.android.gms.measurement.internal.o2 r4 = r4.mo52016b()
            com.google.android.gms.measurement.internal.m2 r4 = r4.f33732o
            java.lang.String r5 = "Checking service availability"
            r4.mo52237a(r5)
            com.google.android.gms.measurement.internal.o4 r4 = r8.f33681b
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4
            com.google.android.gms.measurement.internal.k7 r4 = r4.mo52335w()
            r4.getClass()
            com.google.android.gms.common.GoogleApiAvailabilityLight r5 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            com.google.android.gms.measurement.internal.o4 r4 = r4.f33681b
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4
            android.content.Context r4 = r4.f33872b
            r6 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r4 = r5.isGooglePlayServicesAvailable(r4, r6)
            if (r4 == 0) goto L_0x0114
            if (r4 == r1) goto L_0x0104
            r5 = 2
            if (r4 == r5) goto L_0x00dc
            r0 = 3
            if (r4 == r0) goto L_0x00cb
            r0 = 9
            if (r4 == r0) goto L_0x00bb
            r0 = 18
            if (r4 == r0) goto L_0x00aa
            com.google.android.gms.measurement.internal.o4 r0 = r8.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33727j
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "Unexpected service status"
            r0.mo52238b(r1, r4)
            goto L_0x00da
        L_0x00aa:
            com.google.android.gms.measurement.internal.o4 r0 = r8.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33727j
            java.lang.String r3 = "Service updating"
            r0.mo52237a(r3)
            goto L_0x0123
        L_0x00bb:
            com.google.android.gms.measurement.internal.o4 r0 = r8.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33727j
            java.lang.String r1 = "Service invalid"
            r0.mo52237a(r1)
            goto L_0x00da
        L_0x00cb:
            com.google.android.gms.measurement.internal.o4 r0 = r8.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33727j
            java.lang.String r1 = "Service disabled"
            r0.mo52237a(r1)
        L_0x00da:
            r1 = r3
            goto L_0x0124
        L_0x00dc:
            com.google.android.gms.measurement.internal.o4 r4 = r8.f33681b
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4
            com.google.android.gms.measurement.internal.o2 r4 = r4.mo52016b()
            com.google.android.gms.measurement.internal.m2 r4 = r4.f33731n
            java.lang.String r5 = "Service container out of date"
            r4.mo52237a(r5)
            com.google.android.gms.measurement.internal.o4 r4 = r8.f33681b
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4
            com.google.android.gms.measurement.internal.k7 r4 = r4.mo52335w()
            int r4 = r4.mo52210g0()
            r5 = 17443(0x4423, float:2.4443E-41)
            if (r4 >= r5) goto L_0x00fc
            goto L_0x0124
        L_0x00fc:
            if (r0 != 0) goto L_0x00ff
            goto L_0x0100
        L_0x00ff:
            r1 = r3
        L_0x0100:
            r7 = r3
            r3 = r1
            r1 = r7
            goto L_0x0124
        L_0x0104:
            com.google.android.gms.measurement.internal.o4 r0 = r8.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33732o
            java.lang.String r4 = "Service missing"
            r0.mo52237a(r4)
            goto L_0x0124
        L_0x0114:
            com.google.android.gms.measurement.internal.o4 r0 = r8.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33732o
            java.lang.String r3 = "Service available"
            r0.mo52237a(r3)
        L_0x0123:
            r3 = r1
        L_0x0124:
            if (r3 != 0) goto L_0x0142
            com.google.android.gms.measurement.internal.o4 r0 = r8.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.d r0 = r0.f33878h
            boolean r0 = r0.mo51977t()
            if (r0 == 0) goto L_0x0142
            com.google.android.gms.measurement.internal.o4 r0 = r8.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33724g
            java.lang.String r1 = "No way to upload. Consider using the full version of Analytics"
            r0.mo52237a(r1)
            goto L_0x015d
        L_0x0142:
            if (r1 == 0) goto L_0x015d
            com.google.android.gms.measurement.internal.o4 r0 = r8.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.c3 r0 = r0.mo52330q()
            r0.mo51995g()
            android.content.SharedPreferences r0 = r0.mo51953k()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r2, r3)
            r0.apply()
        L_0x015d:
            r1 = r3
        L_0x015e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r8.f33575f = r0
        L_0x0164:
            java.lang.Boolean r0 = r8.f33575f
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C14999i6.mo52129o():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02eb  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzp mo52130p(boolean r38) {
        /*
            r37 = this;
            r1 = r37
            com.google.android.gms.measurement.internal.o4 r0 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            r0.getClass()
            com.google.android.gms.measurement.internal.o4 r0 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.g2 r2 = r0.mo52327n()
            r3 = 0
            r4 = 1
            r5 = 0
            if (r38 == 0) goto L_0x00d3
            com.google.android.gms.measurement.internal.o4 r0 = r1.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.o4 r7 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7
            com.google.android.gms.measurement.internal.c3 r7 = r7.mo52330q()
            com.google.android.gms.measurement.internal.z2 r7 = r7.f33300e
            if (r7 != 0) goto L_0x002d
            goto L_0x00d3
        L_0x002d:
            com.google.android.gms.measurement.internal.o4 r0 = r0.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.c3 r0 = r0.mo52330q()
            com.google.android.gms.measurement.internal.z2 r0 = r0.f33300e
            com.google.android.gms.measurement.internal.c3 r7 = r0.f34008e
            r7.mo51995g()
            com.google.android.gms.measurement.internal.c3 r7 = r0.f34008e
            r7.mo51995g()
            com.google.android.gms.measurement.internal.c3 r7 = r0.f34008e
            android.content.SharedPreferences r7 = r7.mo51953k()
            java.lang.String r8 = r0.f34004a
            long r7 = r7.getLong(r8, r5)
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x0056
            r0.mo52372a()
            r7 = r5
            goto L_0x0067
        L_0x0056:
            com.google.android.gms.measurement.internal.c3 r9 = r0.f34008e
            com.google.android.gms.measurement.internal.o4 r9 = r9.f33681b
            com.google.android.gms.measurement.internal.u3 r9 = (com.google.android.gms.measurement.internal.C15103u3) r9
            com.google.android.gms.common.util.Clock r9 = r9.f33885o
            long r9 = r9.currentTimeMillis()
            long r7 = r7 - r9
            long r7 = java.lang.Math.abs(r7)
        L_0x0067:
            long r9 = r0.f34007d
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x006e
            goto L_0x0076
        L_0x006e:
            long r9 = r9 + r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x0078
            r0.mo52372a()
        L_0x0076:
            r0 = r3
            goto L_0x00a6
        L_0x0078:
            com.google.android.gms.measurement.internal.c3 r7 = r0.f34008e
            android.content.SharedPreferences r7 = r7.mo51953k()
            java.lang.String r8 = r0.f34006c
            java.lang.String r7 = r7.getString(r8, r3)
            com.google.android.gms.measurement.internal.c3 r8 = r0.f34008e
            android.content.SharedPreferences r8 = r8.mo51953k()
            java.lang.String r9 = r0.f34005b
            long r8 = r8.getLong(r9, r5)
            r0.mo52372a()
            if (r7 == 0) goto L_0x00a4
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x009a
            goto L_0x00a4
        L_0x009a:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r0.<init>(r7, r8)
            goto L_0x00a6
        L_0x00a4:
            android.util.Pair<java.lang.String, java.lang.Long> r0 = com.google.android.gms.measurement.internal.C14942c3.f33298x
        L_0x00a6:
            if (r0 == 0) goto L_0x00d3
            android.util.Pair<java.lang.String, java.lang.Long> r7 = com.google.android.gms.measurement.internal.C14942c3.f33298x
            if (r0 != r7) goto L_0x00ad
            goto L_0x00d3
        L_0x00ad:
            java.lang.Object r7 = r0.second
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.Object r0 = r0.first
            java.lang.String r0 = (java.lang.String) r0
            int r8 = r7.length()
            java.lang.String r9 = java.lang.String.valueOf(r0)
            int r9 = r9.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r8 = r8 + r4
            int r8 = r8 + r9
            r10.<init>(r8)
            java.lang.String r8 = ":"
            java.lang.String r0 = android.support.p013v4.media.C0070b.m184f(r10, r7, r8, r0)
            r18 = r0
            goto L_0x00d5
        L_0x00d3:
            r18 = r3
        L_0x00d5:
            r2.mo51995g()
            com.google.android.gms.measurement.internal.zzp r36 = new com.google.android.gms.measurement.internal.zzp
            java.lang.String r8 = r2.mo52046l()
            java.lang.String r9 = r2.mo52047m()
            r2.mo51946h()
            java.lang.String r10 = r2.f33517e
            r2.mo51946h()
            int r0 = r2.f33518f
            long r11 = (long) r0
            r2.mo51946h()
            java.lang.String r0 = r2.f33519g
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r13 = r2.f33519g
            com.google.android.gms.measurement.internal.o4 r0 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.d r0 = r0.f33878h
            r0.mo51969l()
            r2.mo51946h()
            r2.mo51995g()
            long r14 = r2.f33520h
            int r0 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            r5 = 0
            if (r0 != 0) goto L_0x019f
            com.google.android.gms.measurement.internal.o4 r0 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.k7 r6 = r0.mo52335w()
            com.google.android.gms.measurement.internal.o4 r0 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            android.content.Context r0 = r0.f33872b
            java.lang.String r7 = r0.getPackageName()
            r6.mo51995g()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r7)
            android.content.pm.PackageManager r14 = r0.getPackageManager()
            java.security.MessageDigest r15 = com.google.android.gms.measurement.internal.C15018k7.m24479n()
            r16 = -1
            if (r15 != 0) goto L_0x0144
            com.google.android.gms.measurement.internal.o4 r0 = r6.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33724g
            java.lang.String r6 = "Could not get MD5 instance"
            r0.mo52237a(r6)
            goto L_0x0198
        L_0x0144:
            if (r14 == 0) goto L_0x0196
            boolean r7 = r6.mo52202Q(r0, r7)     // Catch:{ NameNotFoundException -> 0x0186 }
            if (r7 != 0) goto L_0x0196
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch:{ NameNotFoundException -> 0x0186 }
            com.google.android.gms.measurement.internal.o4 r7 = r6.f33681b     // Catch:{ NameNotFoundException -> 0x0186 }
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7     // Catch:{ NameNotFoundException -> 0x0186 }
            android.content.Context r7 = r7.f33872b     // Catch:{ NameNotFoundException -> 0x0186 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0186 }
            r14 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r7, r14)     // Catch:{ NameNotFoundException -> 0x0186 }
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x0186 }
            if (r0 == 0) goto L_0x0176
            int r7 = r0.length     // Catch:{ NameNotFoundException -> 0x0186 }
            if (r7 <= 0) goto L_0x0176
            r0 = r0[r5]     // Catch:{ NameNotFoundException -> 0x0186 }
            byte[] r0 = r0.toByteArray()     // Catch:{ NameNotFoundException -> 0x0186 }
            byte[] r0 = r15.digest(r0)     // Catch:{ NameNotFoundException -> 0x0186 }
            long r16 = com.google.android.gms.measurement.internal.C15018k7.m24477h0(r0)     // Catch:{ NameNotFoundException -> 0x0186 }
            goto L_0x0198
        L_0x0176:
            com.google.android.gms.measurement.internal.o4 r0 = r6.f33681b     // Catch:{ NameNotFoundException -> 0x0186 }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ NameNotFoundException -> 0x0186 }
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()     // Catch:{ NameNotFoundException -> 0x0186 }
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33727j     // Catch:{ NameNotFoundException -> 0x0186 }
            java.lang.String r7 = "Could not get signatures"
            r0.mo52237a(r7)     // Catch:{ NameNotFoundException -> 0x0186 }
            goto L_0x0198
        L_0x0186:
            r0 = move-exception
            com.google.android.gms.measurement.internal.o4 r6 = r6.f33681b
            com.google.android.gms.measurement.internal.u3 r6 = (com.google.android.gms.measurement.internal.C15103u3) r6
            com.google.android.gms.measurement.internal.o2 r6 = r6.mo52016b()
            com.google.android.gms.measurement.internal.m2 r6 = r6.f33724g
            java.lang.String r7 = "Package name not found"
            r6.mo52238b(r0, r7)
        L_0x0196:
            r16 = 0
        L_0x0198:
            r6 = r16
            r2.f33520h = r6
            r16 = r6
            goto L_0x01a1
        L_0x019f:
            r16 = r14
        L_0x01a1:
            com.google.android.gms.measurement.internal.o4 r0 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            boolean r19 = r0.mo52321e()
            com.google.android.gms.measurement.internal.o4 r0 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.c3 r0 = r0.mo52330q()
            boolean r0 = r0.f33311p
            r20 = r0 ^ 1
            r2.mo51995g()
            com.google.android.gms.measurement.internal.o4 r0 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            boolean r0 = r0.mo52321e()
            if (r0 != 0) goto L_0x01c4
            goto L_0x0251
        L_0x01c4:
            com.google.android.gms.internal.measurement.ab r0 = com.google.android.gms.internal.measurement.C14580ab.f32749c
            com.google.android.gms.internal.measurement.p4<com.google.android.gms.internal.measurement.bb> r0 = r0.f32750b
            java.lang.Object r0 = r0.zza()
            com.google.android.gms.internal.measurement.bb r0 = (com.google.android.gms.internal.measurement.C14593bb) r0
            r0.zza()
            com.google.android.gms.measurement.internal.o4 r0 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.d r0 = r0.f33878h
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.C14959e2.f33402e0
            boolean r0 = r0.mo51973p(r3, r6)
            if (r0 == 0) goto L_0x01ef
            com.google.android.gms.measurement.internal.o4 r0 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33732o
            java.lang.String r4 = "Disabled IID for tests."
            r0.mo52237a(r4)
            goto L_0x0251
        L_0x01ef:
            com.google.android.gms.measurement.internal.o4 r0 = r2.f33681b     // Catch:{ ClassNotFoundException -> 0x0251 }
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0     // Catch:{ ClassNotFoundException -> 0x0251 }
            android.content.Context r0 = r0.f33872b     // Catch:{ ClassNotFoundException -> 0x0251 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0251 }
            java.lang.String r6 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r0 = r0.loadClass(r6)     // Catch:{ ClassNotFoundException -> 0x0251 }
            if (r0 != 0) goto L_0x0202
            goto L_0x0251
        L_0x0202:
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0242 }
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r5] = r7     // Catch:{ Exception -> 0x0242 }
            java.lang.String r7 = "getInstance"
            java.lang.reflect.Method r6 = r0.getDeclaredMethod(r7, r6)     // Catch:{ Exception -> 0x0242 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0242 }
            com.google.android.gms.measurement.internal.o4 r7 = r2.f33681b     // Catch:{ Exception -> 0x0242 }
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7     // Catch:{ Exception -> 0x0242 }
            android.content.Context r7 = r7.f33872b     // Catch:{ Exception -> 0x0242 }
            r4[r5] = r7     // Catch:{ Exception -> 0x0242 }
            java.lang.Object r4 = r6.invoke(r3, r4)     // Catch:{ Exception -> 0x0242 }
            if (r4 != 0) goto L_0x021f
            goto L_0x0251
        L_0x021f:
            java.lang.String r6 = "getFirebaseInstanceId"
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0232 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r6, r7)     // Catch:{ Exception -> 0x0232 }
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0232 }
            java.lang.Object r0 = r0.invoke(r4, r6)     // Catch:{ Exception -> 0x0232 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0232 }
            r21 = r0
            goto L_0x0253
        L_0x0232:
            com.google.android.gms.measurement.internal.o4 r0 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33729l
            java.lang.String r4 = "Failed to retrieve Firebase Instance Id"
            r0.mo52237a(r4)
            goto L_0x0251
        L_0x0242:
            com.google.android.gms.measurement.internal.o4 r0 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.o2 r0 = r0.mo52016b()
            com.google.android.gms.measurement.internal.m2 r0 = r0.f33728k
            java.lang.String r4 = "Failed to obtain Firebase Analytics instance"
            r0.mo52237a(r4)
        L_0x0251:
            r21 = r3
        L_0x0253:
            com.google.android.gms.measurement.internal.o4 r0 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r0 = (com.google.android.gms.measurement.internal.C15103u3) r0
            com.google.android.gms.measurement.internal.c3 r3 = r0.mo52330q()
            com.google.android.gms.measurement.internal.y2 r3 = r3.f33301f
            long r3 = r3.mo52363a()
            r6 = 0
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x026a
            long r3 = r0.f33871H
            goto L_0x0270
        L_0x026a:
            long r6 = r0.f33871H
            long r3 = java.lang.Math.min(r6, r3)
        L_0x0270:
            r24 = r3
            r2.mo51946h()
            int r0 = r2.f33523k
            com.google.android.gms.measurement.internal.o4 r3 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3
            com.google.android.gms.measurement.internal.d r3 = r3.f33878h
            java.lang.String r4 = "google_analytics_adid_collection_enabled"
            java.lang.Boolean r3 = r3.mo51972o(r4)
            if (r3 == 0) goto L_0x028f
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x028c
            goto L_0x028f
        L_0x028c:
            r27 = r5
            goto L_0x0292
        L_0x028f:
            r3 = 1
            r27 = r3
        L_0x0292:
            com.google.android.gms.measurement.internal.o4 r3 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r3 = (com.google.android.gms.measurement.internal.C15103u3) r3
            com.google.android.gms.measurement.internal.c3 r3 = r3.mo52330q()
            r3.mo51995g()
            android.content.SharedPreferences r3 = r3.mo51953k()
            java.lang.String r4 = "deferred_analytics_collection"
            boolean r28 = r3.getBoolean(r4, r5)
            r2.mo51946h()
            java.lang.String r3 = r2.f33525m
            com.google.android.gms.measurement.internal.o4 r4 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r4 = (com.google.android.gms.measurement.internal.C15103u3) r4
            com.google.android.gms.measurement.internal.d r4 = r4.f33878h
            java.lang.String r5 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r4 = r4.mo51972o(r5)
            if (r4 != 0) goto L_0x02bc
            r4 = 0
            goto L_0x02c6
        L_0x02bc:
            boolean r4 = r4.booleanValue()
            r4 = r4 ^ 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
        L_0x02c6:
            r30 = r4
            long r4 = r2.f33521i
            java.util.List<java.lang.String> r6 = r2.f33522j
            com.google.android.gms.internal.measurement.C14811s9.m23933a()
            com.google.android.gms.measurement.internal.o4 r7 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r7 = (com.google.android.gms.measurement.internal.C15103u3) r7
            com.google.android.gms.measurement.internal.d r7 = r7.f33878h
            com.google.android.gms.measurement.internal.d2<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.C14959e2.f33398c0
            r15 = 0
            boolean r7 = r7.mo51973p(r15, r14)
            if (r7 == 0) goto L_0x02eb
            r2.mo51946h()
            java.lang.String r7 = r2.f33526n
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            java.lang.String r7 = r2.f33526n
            r34 = r7
            goto L_0x02ed
        L_0x02eb:
            r34 = r15
        L_0x02ed:
            r14 = 46000(0xb3b0, double:2.2727E-319)
            r22 = 0
            com.google.android.gms.measurement.internal.o4 r2 = r2.f33681b
            com.google.android.gms.measurement.internal.u3 r2 = (com.google.android.gms.measurement.internal.C15103u3) r2
            com.google.android.gms.measurement.internal.c3 r2 = r2.mo52330q()
            com.google.android.gms.measurement.internal.e r2 = r2.mo51955m()
            java.lang.String r35 = r2.mo51984d()
            r7 = r36
            r26 = r0
            r29 = r3
            r31 = r4
            r33 = r6
            r7.<init>((java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (long) r11, (java.lang.String) r13, (long) r14, (long) r16, (java.lang.String) r18, (boolean) r19, (boolean) r20, (java.lang.String) r21, (long) r22, (long) r24, (int) r26, (boolean) r27, (boolean) r28, (java.lang.String) r29, (java.lang.Boolean) r30, (long) r31, (java.util.List<java.lang.String>) r33, (java.lang.String) r34, (java.lang.String) r35)
            return r36
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C14999i6.mo52130p(boolean):com.google.android.gms.measurement.internal.zzp");
    }

    /* renamed from: q */
    public final void mo52131q() {
        mo51995g();
        ((C15103u3) this.f33681b).mo52016b().f33732o.mo52238b(Integer.valueOf(this.f33578i.size()), "Processing queued up service tasks");
        Iterator it = this.f33578i.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                ((C15103u3) this.f33681b).mo52016b().f33724g.mo52238b(e, "Task exception while flushing queue");
            }
        }
        this.f33578i.clear();
        this.f33579j.mo52168a();
    }

    /* renamed from: r */
    public final void mo52132r() {
        mo51995g();
        C15122w6 w6Var = this.f33577h;
        w6Var.f33961b = w6Var.f33960a.elapsedRealtime();
        C14927a6 a6Var = this.f33576g;
        ((C15103u3) this.f33681b).getClass();
        a6Var.mo52169c(C14959e2.f33376J.mo51978a(null).longValue());
    }

    /* renamed from: s */
    public final void mo52133s(Runnable runnable) throws IllegalStateException {
        mo51995g();
        if (mo52127m()) {
            runnable.run();
            return;
        }
        int size = this.f33578i.size();
        ((C15103u3) this.f33681b).getClass();
        if (((long) size) >= 1000) {
            ((C15103u3) this.f33681b).mo52016b().f33724g.mo52237a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f33578i.add(runnable);
        this.f33579j.mo52169c(DateUtils.MILLIS_PER_MINUTE);
        mo52135v();
    }

    /* renamed from: t */
    public final Boolean mo52134t() {
        return this.f33575f;
    }

    /* renamed from: v */
    public final void mo52135v() {
        mo51995g();
        mo51946h();
        if (!mo52127m()) {
            if (mo52129o()) {
                this.f33573d.zzc();
            } else if (!((C15103u3) this.f33681b).f33878h.mo51977t()) {
                ((C15103u3) this.f33681b).getClass();
                List<ResolveInfo> queryIntentServices = ((C15103u3) this.f33681b).f33872b.getPackageManager().queryIntentServices(new Intent().setClassName(((C15103u3) this.f33681b).f33872b, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                    ((C15103u3) this.f33681b).mo52016b().f33724g.mo52237a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                C15103u3 u3Var = (C15103u3) this.f33681b;
                Context context = u3Var.f33872b;
                u3Var.getClass();
                intent.setComponent(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
                this.f33573d.zzb(intent);
            }
        }
    }

    /* renamed from: w */
    public final void mo52136w() {
        mo51995g();
        mo51946h();
        this.f33573d.zzd();
        try {
            ConnectionTracker.getInstance().unbindService(((C15103u3) this.f33681b).f33872b, this.f33573d);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f33574e = null;
    }

    /* renamed from: x */
    public final void mo52137x(AtomicReference<String> atomicReference) {
        mo51995g();
        mo51946h();
        mo52133s(new C15137y5(this, atomicReference, mo52130p(false)));
    }
}
