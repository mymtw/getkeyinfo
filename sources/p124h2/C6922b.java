package p124h2;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import p112g2.C6831a;
import p112g2.C6832b;

/* renamed from: h2.b */
public final class C6922b implements C6832b {

    /* renamed from: b */
    public final Context f15335b;

    /* renamed from: c */
    public final String f15336c;

    /* renamed from: d */
    public final C6832b.C6833a f15337d;

    /* renamed from: e */
    public final boolean f15338e;

    /* renamed from: f */
    public final Object f15339f = new Object();

    /* renamed from: g */
    public C6923a f15340g;

    /* renamed from: h */
    public boolean f15341h;

    /* renamed from: h2.b$a */
    public static class C6923a extends SQLiteOpenHelper {

        /* renamed from: b */
        public final C6920a[] f15342b;

        /* renamed from: c */
        public final C6832b.C6833a f15343c;

        /* renamed from: d */
        public boolean f15344d;

        /* renamed from: h2.b$a$a */
        public class C6924a implements DatabaseErrorHandler {

            /* renamed from: a */
            public final /* synthetic */ C6832b.C6833a f15345a;

            /* renamed from: b */
            public final /* synthetic */ C6920a[] f15346b;

            public C6924a(C6832b.C6833a aVar, C6920a[] aVarArr) {
                this.f15345a = aVar;
                this.f15346b = aVarArr;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
                r1 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
                if (r0 != null) goto L_0x0054;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
                r5 = r0.iterator();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
                if (r5.hasNext() != false) goto L_0x005e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
                p112g2.C6832b.C6833a.m13238a((java.lang.String) r5.next().second);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
                p112g2.C6832b.C6833a.m13238a(r5.getPath());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
                throw r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
                if ((r3.f15333b == r5) == false) goto L_0x0012;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004e */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x004c A[ExcHandler: all (r1v4 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
              PHI: (r0v11 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r0v4 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v5 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v5 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:12:0x0047, B:15:0x004e, B:16:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:12:0x0047] */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x0076  */
            /* JADX WARNING: Removed duplicated region for block: B:30:0x008e  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onCorruption(android.database.sqlite.SQLiteDatabase r5) {
                /*
                    r4 = this;
                    g2.b$a r0 = r4.f15345a
                    h2.a[] r1 = r4.f15346b
                    r2 = 0
                    r3 = r1[r2]
                    if (r3 == 0) goto L_0x0012
                    android.database.sqlite.SQLiteDatabase r3 = r3.f15333b
                    if (r3 != r5) goto L_0x000f
                    r3 = 1
                    goto L_0x0010
                L_0x000f:
                    r3 = r2
                L_0x0010:
                    if (r3 != 0) goto L_0x0019
                L_0x0012:
                    h2.a r3 = new h2.a
                    r3.<init>(r5)
                    r1[r2] = r3
                L_0x0019:
                    r5 = r1[r2]
                    r0.getClass()
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "Corruption reported by sqlite on database: "
                    r0.append(r1)
                    java.lang.String r1 = r5.getPath()
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    java.lang.String r1 = "SupportSQLite"
                    android.util.Log.e(r1, r0)
                    boolean r0 = r5.isOpen()
                    if (r0 != 0) goto L_0x0046
                    java.lang.String r5 = r5.getPath()
                    p112g2.C6832b.C6833a.m13238a(r5)
                    goto L_0x0095
                L_0x0046:
                    r0 = 0
                    java.util.List r0 = r5.mo18965p()     // Catch:{ SQLiteException -> 0x004e, all -> 0x004c }
                    goto L_0x004e
                L_0x004c:
                    r1 = move-exception
                    goto L_0x0052
                L_0x004e:
                    r5.close()     // Catch:{ IOException -> 0x0074, all -> 0x004c }
                    goto L_0x0074
                L_0x0052:
                    if (r0 == 0) goto L_0x006c
                    java.util.Iterator r5 = r0.iterator()
                L_0x0058:
                    boolean r0 = r5.hasNext()
                    if (r0 == 0) goto L_0x0073
                    java.lang.Object r0 = r5.next()
                    android.util.Pair r0 = (android.util.Pair) r0
                    java.lang.Object r0 = r0.second
                    java.lang.String r0 = (java.lang.String) r0
                    p112g2.C6832b.C6833a.m13238a(r0)
                    goto L_0x0058
                L_0x006c:
                    java.lang.String r5 = r5.getPath()
                    p112g2.C6832b.C6833a.m13238a(r5)
                L_0x0073:
                    throw r1
                L_0x0074:
                    if (r0 == 0) goto L_0x008e
                    java.util.Iterator r5 = r0.iterator()
                L_0x007a:
                    boolean r0 = r5.hasNext()
                    if (r0 == 0) goto L_0x0095
                    java.lang.Object r0 = r5.next()
                    android.util.Pair r0 = (android.util.Pair) r0
                    java.lang.Object r0 = r0.second
                    java.lang.String r0 = (java.lang.String) r0
                    p112g2.C6832b.C6833a.m13238a(r0)
                    goto L_0x007a
                L_0x008e:
                    java.lang.String r5 = r5.getPath()
                    p112g2.C6832b.C6833a.m13238a(r5)
                L_0x0095:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p124h2.C6922b.C6923a.C6924a.onCorruption(android.database.sqlite.SQLiteDatabase):void");
            }
        }

        public C6923a(Context context, String str, C6920a[] aVarArr, C6832b.C6833a aVar) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.f15035a, new C6924a(aVar, aVarArr));
            this.f15343c = aVar;
            this.f15342b = aVarArr;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
            if ((r2.f15333b == r4) == false) goto L_0x0010;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p124h2.C6920a mo19067a(android.database.sqlite.SQLiteDatabase r4) {
            /*
                r3 = this;
                h2.a[] r0 = r3.f15342b
                r1 = 0
                r2 = r0[r1]
                if (r2 == 0) goto L_0x0010
                android.database.sqlite.SQLiteDatabase r2 = r2.f15333b
                if (r2 != r4) goto L_0x000d
                r2 = 1
                goto L_0x000e
            L_0x000d:
                r2 = r1
            L_0x000e:
                if (r2 != 0) goto L_0x0017
            L_0x0010:
                h2.a r2 = new h2.a
                r2.<init>(r4)
                r0[r1] = r2
            L_0x0017:
                r4 = r0[r1]
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p124h2.C6922b.C6923a.mo19067a(android.database.sqlite.SQLiteDatabase):h2.a");
        }

        /* renamed from: b */
        public final synchronized C6831a mo19068b() {
            this.f15344d = false;
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (this.f15344d) {
                close();
                return mo19068b();
            }
            return mo19067a(writableDatabase);
        }

        public final synchronized void close() {
            super.close();
            this.f15342b[0] = null;
        }

        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            C6832b.C6833a aVar = this.f15343c;
            mo19067a(sQLiteDatabase);
            aVar.mo11998b();
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f15343c.mo11999c(mo19067a(sQLiteDatabase));
        }

        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f15344d = true;
            this.f15343c.mo12000d(mo19067a(sQLiteDatabase), i, i2);
        }

        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f15344d) {
                this.f15343c.mo12001e(mo19067a(sQLiteDatabase));
            }
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f15344d = true;
            this.f15343c.mo12002f(mo19067a(sQLiteDatabase), i, i2);
        }
    }

    public C6922b(Context context, String str, C6832b.C6833a aVar, boolean z) {
        this.f15335b = context;
        this.f15336c = str;
        this.f15337d = aVar;
        this.f15338e = z;
    }

    /* renamed from: a */
    public final C6923a mo19066a() {
        C6923a aVar;
        synchronized (this.f15339f) {
            if (this.f15340g == null) {
                C6920a[] aVarArr = new C6920a[1];
                if (this.f15336c == null || !this.f15338e) {
                    this.f15340g = new C6923a(this.f15335b, this.f15336c, aVarArr, this.f15337d);
                } else {
                    this.f15340g = new C6923a(this.f15335b, new File(this.f15335b.getNoBackupFilesDir(), this.f15336c).getAbsolutePath(), aVarArr, this.f15337d);
                }
                this.f15340g.setWriteAheadLoggingEnabled(this.f15341h);
            }
            aVar = this.f15340g;
        }
        return aVar;
    }

    public final void close() {
        mo19066a().close();
    }

    public final String getDatabaseName() {
        return this.f15336c;
    }

    /* renamed from: j0 */
    public final C6831a mo12025j0() {
        return mo19066a().mo19068b();
    }

    public final void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f15339f) {
            C6923a aVar = this.f15340g;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z);
            }
            this.f15341h = z;
        }
    }
}
