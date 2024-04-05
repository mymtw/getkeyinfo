package p463v9;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import androidx.work.BackoffPolicy;
import androidx.work.C3376c;
import androidx.work.C3424m;
import androidx.work.C3437q;
import androidx.work.C3438r;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import com.etsy.android.lib.core.posts.EtsyPostWorker;
import com.etsy.android.lib.core.posts.PersistentRequest;
import com.etsy.android.lib.core.posts.PostDatabase;
import com.etsy.android.lib.logger.C8694h;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;

/* renamed from: v9.b */
public final class C13537b {

    /* renamed from: a */
    public final Context f29603a;

    /* renamed from: b */
    public final C13542e f29604b;

    /* renamed from: v9.b$a */
    public static class C13538a {

        /* renamed from: a */
        public static String f29605a = "SELECT _id, length(serialized_post), version_code FROM post WHERE run_after_time IS NULL OR run_after_time <= ? ORDER BY _id LIMIT 1";
    }

    /* renamed from: v9.b$b */
    public static class C13539b<Request, Result> {

        /* renamed from: a */
        public final PersistentRequest<Request, Result> f29606a;

        /* renamed from: b */
        public final long f29607b;

        /* renamed from: c */
        public final int f29608c;

        public C13539b(long j, PersistentRequest<Request, Result> persistentRequest, int i) {
            this.f29606a = persistentRequest;
            this.f29607b = j;
            this.f29608c = i;
        }
    }

    public C13537b(Context context, C13542e eVar) {
        this.f29603a = context;
        this.f29604b = eVar;
    }

    /* renamed from: a */
    public static PersistentRequest m21309a(byte[] bArr) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bArr));
            PersistentRequest persistentRequest = (PersistentRequest) objectInputStream.readObject();
            objectInputStream.close();
            return persistentRequest;
        } catch (IOException | ClassNotFoundException e) {
            C8694h.f19097a.mo21309d("Error writing full body; sent nothing", e);
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m21310b(SQLiteDatabase sQLiteDatabase, long j, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (true) {
            int i3 = i - i2;
            if (i3 <= 0) {
                break;
            }
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT substr(serialized_post, ?, ?) FROM post WHERE _id = ?", new String[]{String.valueOf(i2 + 1), String.valueOf(Math.min(1000000, i3)), String.valueOf(j)});
            if (rawQuery != null && rawQuery.moveToFirst()) {
                byte[] blob = rawQuery.getBlob(0);
                System.arraycopy(blob, 0, bArr, i2, blob.length);
                i2 += blob.length;
                rawQuery.close();
            } else if (rawQuery != null) {
                rawQuery.close();
            }
        }
        if (i <= 0 || i2 != i) {
            return null;
        }
        return bArr;
    }

    /* renamed from: c */
    public final C13539b<?, ?> mo46194c() {
        C13539b<?, ?> bVar;
        SQLiteDatabase readableDatabase = PostDatabase.getInstance(this.f29603a).getReadableDatabase();
        if (readableDatabase == null) {
            return null;
        }
        readableDatabase.beginTransaction();
        try {
            new SQLiteQueryBuilder().setTables("post");
            Cursor rawQuery = readableDatabase.rawQuery(C13538a.f29605a, new String[]{String.valueOf(System.currentTimeMillis())});
            if (rawQuery != null && rawQuery.moveToFirst()) {
                long j = rawQuery.getLong(0);
                int i = rawQuery.getInt(1);
                int i2 = rawQuery.getInt(2);
                rawQuery.close();
                byte[] b = m21310b(readableDatabase, j, i);
                if (b != null) {
                    bVar = new C13539b<>(j, m21309a(b), i2);
                    readableDatabase.setTransactionSuccessful();
                    readableDatabase.endTransaction();
                    return bVar;
                }
            } else if (rawQuery != null) {
                rawQuery.close();
            }
            bVar = null;
            readableDatabase.setTransactionSuccessful();
            readableDatabase.endTransaction();
            return bVar;
        } catch (Exception e) {
            C8694h.f19097a.mo21309d("queryNextQueuedPost - db error.", e);
            C18263b.f40052P.mo45450b("EtsyPostManager", "deserializePost - read error." + e.toString());
            readableDatabase.endTransaction();
            return null;
        } catch (Throwable th) {
            readableDatabase.endTransaction();
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00e9  */
    @android.annotation.SuppressLint({"DefaultLocale"})
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <Request, Result> void mo46195d(com.etsy.android.lib.core.posts.PersistentRequest<Request, Result> r12, boolean r13, long r14) {
        /*
            r11 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0016 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0016 }
            r2.writeObject(r12)     // Catch:{ IOException -> 0x0016 }
            r2.close()     // Catch:{ IOException -> 0x0016 }
            byte[] r0 = r0.toByteArray()     // Catch:{ IOException -> 0x0016 }
            goto L_0x001f
        L_0x0016:
            r0 = move-exception
            com.etsy.android.lib.logger.h r2 = com.etsy.android.lib.logger.C8694h.f19097a
            java.lang.String r3 = "Error writing full body; sent nothing"
            r2.mo21309d(r3, r0)
            r0 = r1
        L_0x001f:
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0039
            com.etsy.android.lib.logger.h r13 = com.etsy.android.lib.logger.C8694h.f19097a
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r2] = r12
            java.lang.String r15 = "Post could not be serialized to JSON - %s"
            java.lang.String r14 = java.lang.String.format(r15, r14)
            r13.mo21306a(r14)
            android.content.Context r13 = r11.f29603a
            r12.onPersistentResult(r13, r1)
            goto L_0x00f3
        L_0x0039:
            com.etsy.android.lib.logger.h r4 = com.etsy.android.lib.logger.C8694h.f19097a
            java.lang.Object[] r5 = new java.lang.Object[r3]
            int r6 = r0.length
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r2] = r6
            java.lang.String r6 = "Added post with length: %d"
            java.lang.String.format(r6, r5)
            r4.mo21308c()
            java.lang.Object[] r5 = new java.lang.Object[r3]
            int r6 = r12.getVersionCode()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r2] = r6
            java.lang.String r6 = "Added post with version %s"
            java.lang.String.format(r6, r5)
            r4.mo21308c()
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.Long r6 = java.lang.Long.valueOf(r14)
            r5[r2] = r6
            java.lang.String r6 = "Added post with runAfterTime %s"
            java.lang.String.format(r6, r5)
            r4.mo21308c()
            int r4 = r12.getVersionCode()
            android.content.Context r5 = r11.f29603a
            com.etsy.android.lib.core.posts.PostDatabase r5 = com.etsy.android.lib.core.posts.PostDatabase.getInstance(r5)
            android.database.sqlite.SQLiteDatabase r5 = r5.getWritableDatabase()
            r6 = 0
            if (r5 == 0) goto L_0x00ce
            java.lang.String r8 = "post"
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ Exception -> 0x00b0 }
            r9.<init>()     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r10 = "serialized_post"
            r9.put(r10, r0)     // Catch:{ Exception -> 0x00b0 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r10 = "version_code"
            r9.put(r10, r4)     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r4 = "post_json"
            java.lang.String r10 = ""
            r9.put(r4, r10)     // Catch:{ Exception -> 0x00b0 }
            int r4 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x00ab
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r15 = "run_after_time"
            r9.put(r15, r14)     // Catch:{ Exception -> 0x00b0 }
        L_0x00ab:
            long r14 = r5.insert(r8, r1, r9)     // Catch:{ Exception -> 0x00b0 }
            goto L_0x00d0
        L_0x00b0:
            r14 = move-exception
            com.etsy.android.lib.logger.h r15 = com.etsy.android.lib.logger.C8694h.f19097a
            java.lang.String r4 = "insertPostToDb - db error."
            r15.mo21309d(r4, r14)
            ea.n r15 = p628nj.C18263b.f40052P
            java.lang.StringBuilder r4 = android.support.p013v4.media.C0072d.m201h(r4)
            java.lang.String r14 = r14.toString()
            r4.append(r14)
            java.lang.String r14 = r4.toString()
            java.lang.String r4 = "EtsyPostManager"
            r15.mo45450b(r4, r14)
        L_0x00ce:
            r14 = -1
        L_0x00d0:
            int r14 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r14 >= 0) goto L_0x00e9
            com.etsy.android.lib.logger.h r13 = com.etsy.android.lib.logger.C8694h.f19097a
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r2] = r0
            java.lang.String r15 = "Couldn't put post in db = %s"
            java.lang.String r14 = java.lang.String.format(r15, r14)
            r13.mo21306a(r14)
            android.content.Context r13 = r11.f29603a
            r12.onPersistentResult(r13, r1)
            goto L_0x00f3
        L_0x00e9:
            if (r13 == 0) goto L_0x00ee
            r11.mo46196e()
        L_0x00ee:
            android.content.Context r13 = r11.f29603a
            r12.onPersisted(r13)
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p463v9.C13537b.mo46195d(com.etsy.android.lib.core.posts.PersistentRequest, boolean, long):void");
    }

    /* renamed from: e */
    public final void mo46196e() {
        C13542e eVar = this.f29604b;
        eVar.getClass();
        C3424m.C3425a aVar = new C3424m.C3425a(EtsyPostWorker.class);
        C3376c.C3377a aVar2 = new C3376c.C3377a();
        aVar2.f7890a = NetworkType.CONNECTED;
        C3438r a = ((C3424m.C3425a) ((C3424m.C3425a) aVar.mo12966e(new C3376c(aVar2))).mo12965d(BackoffPolicy.EXPONENTIAL, TimeUnit.SECONDS)).mo12964a();
        C19383o.m32796f(a, "OneTimeWorkRequestBuilde…NDS)\n            .build()");
        C3437q qVar = eVar.f29618a;
        ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.REPLACE;
        qVar.getClass();
        qVar.mo12960a("etsy_post_one_time", existingWorkPolicy, Collections.singletonList((C3424m) a)).mo20725M();
    }
}
