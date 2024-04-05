package p253u3;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.appcompat.widget.C0326j;
import com.amplitude.api.CursorWindowAllocationException;
import java.io.File;
import java.util.HashMap;

/* renamed from: u3.o */
public final class C8150o extends SQLiteOpenHelper {

    /* renamed from: e */
    public static final String f17877e = C8150o.class.getName();

    /* renamed from: f */
    public static final HashMap f17878f = new HashMap();

    /* renamed from: g */
    public static final C8149n f17879g = C8149n.f17874c;

    /* renamed from: b */
    public File f17880b;

    /* renamed from: c */
    public boolean f17881c = true;

    /* renamed from: d */
    public C8151p f17882d;

    public C8150o(Context context, String str) {
        super(context, m16386g(str), (SQLiteDatabase.CursorFactory) null, 3);
        this.f17880b = context.getDatabasePath(m16386g(str));
        C8156t.m16413d(str);
    }

    /* renamed from: b */
    public static void m16384b(RuntimeException runtimeException) {
        String message = runtimeException.getMessage();
        if (C8156t.m16412c(message) || (!message.startsWith("Cursor window allocation of") && !message.startsWith("Could not allocate CursorWindow"))) {
            throw runtimeException;
        }
        throw new CursorWindowAllocationException(message);
    }

    /* renamed from: f */
    public static synchronized C8150o m16385f(Context context, String str) {
        C8150o oVar;
        synchronized (C8150o.class) {
            String d = C8156t.m16413d(str);
            HashMap hashMap = f17878f;
            oVar = (C8150o) hashMap.get(d);
            if (oVar == null) {
                oVar = new C8150o(context.getApplicationContext(), d);
                hashMap.put(d, oVar);
            }
        }
        return oVar;
    }

    /* renamed from: g */
    public static String m16386g(String str) {
        return (C8156t.m16412c(str) || str.equals("$default_instance")) ? "com.amplitude.api" : C0326j.m864i("com.amplitude.api_", str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r2.isOpen() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        if (r2.isOpen() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0055, code lost:
        close();
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo20768B(java.lang.Object r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r1 = 1
            r2 = 0
            android.database.sqlite.SQLiteDatabase r2 = r5.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0038, StackOverflowError -> 0x001a }
            long r6 = r5.mo20786x(r2, r7, r8, r6)     // Catch:{ SQLiteException -> 0x0038, StackOverflowError -> 0x001a }
            boolean r8 = r2.isOpen()     // Catch:{ all -> 0x0016 }
            if (r8 == 0) goto L_0x005a
            r5.close()     // Catch:{ all -> 0x0016 }
            goto L_0x005a
        L_0x0016:
            r6 = move-exception
            goto L_0x0068
        L_0x0018:
            r6 = move-exception
            goto L_0x005c
        L_0x001a:
            r6 = move-exception
            u3.n r8 = f17879g     // Catch:{ all -> 0x0018 }
            java.lang.String r3 = f17877e     // Catch:{ all -> 0x0018 }
            java.lang.String r4 = "insertOrReplaceKeyValue in %s failed"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0018 }
            r1[r0] = r7     // Catch:{ all -> 0x0018 }
            java.lang.String r7 = java.lang.String.format(r4, r1)     // Catch:{ all -> 0x0018 }
            r8.mo20766b(r3, r7, r6)     // Catch:{ all -> 0x0018 }
            r5.mo20774d()     // Catch:{ all -> 0x0018 }
            if (r2 == 0) goto L_0x0058
            boolean r6 = r2.isOpen()     // Catch:{ all -> 0x0016 }
            if (r6 == 0) goto L_0x0058
            goto L_0x0055
        L_0x0038:
            r6 = move-exception
            u3.n r8 = f17879g     // Catch:{ all -> 0x0018 }
            java.lang.String r3 = f17877e     // Catch:{ all -> 0x0018 }
            java.lang.String r4 = "insertOrReplaceKeyValue in %s failed"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0018 }
            r1[r0] = r7     // Catch:{ all -> 0x0018 }
            java.lang.String r7 = java.lang.String.format(r4, r1)     // Catch:{ all -> 0x0018 }
            r8.mo20766b(r3, r7, r6)     // Catch:{ all -> 0x0018 }
            r5.mo20774d()     // Catch:{ all -> 0x0018 }
            if (r2 == 0) goto L_0x0058
            boolean r6 = r2.isOpen()     // Catch:{ all -> 0x0016 }
            if (r6 == 0) goto L_0x0058
        L_0x0055:
            r5.close()     // Catch:{ all -> 0x0016 }
        L_0x0058:
            r6 = -1
        L_0x005a:
            monitor-exit(r5)
            return r6
        L_0x005c:
            if (r2 == 0) goto L_0x0067
            boolean r7 = r2.isOpen()     // Catch:{ all -> 0x0016 }
            if (r7 == 0) goto L_0x0067
            r5.close()     // Catch:{ all -> 0x0016 }
        L_0x0067:
            throw r6     // Catch:{ all -> 0x0016 }
        L_0x0068:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p253u3.C8150o.mo20768B(java.lang.Object, java.lang.String, java.lang.String):long");
    }

    /* renamed from: G */
    public final synchronized void mo20769G(long j) {
        mo20770M(j, "events");
    }

    /* renamed from: M */
    public final synchronized void mo20770M(long j, String str) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.delete(str, "id = " + j, (String[]) null);
        } catch (SQLiteException e) {
            f17879g.mo20766b(f17877e, String.format("removeEvent from %s failed", new Object[]{str}), e);
            mo20774d();
        } catch (StackOverflowError e2) {
            try {
                f17879g.mo20766b(f17877e, String.format("removeEvent from %s failed", new Object[]{str}), e2);
                mo20774d();
            } catch (Throwable th) {
                close();
                throw th;
            }
        }
        close();
    }

    /* renamed from: Q */
    public final synchronized void mo20771Q(long j, String str) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.delete(str, "id <= " + j, (String[]) null);
        } catch (SQLiteException e) {
            f17879g.mo20766b(f17877e, String.format("removeEvents from %s failed", new Object[]{str}), e);
            mo20774d();
        } catch (StackOverflowError e2) {
            try {
                f17879g.mo20766b(f17877e, String.format("removeEvents from %s failed", new Object[]{str}), e2);
                mo20774d();
            } catch (Throwable th) {
                close();
                throw th;
            }
        }
        close();
    }

    /* renamed from: R */
    public final synchronized void mo20772R(long j) {
        mo20770M(j, "identifys");
    }

    /* renamed from: a */
    public final synchronized long mo20773a(String str, String str2) {
        long j;
        long j2 = -1;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("event", str2);
            j = mo20783r(writableDatabase, str, contentValues);
            if (j == -1) {
                try {
                    f17879g.mo20767c(f17877e, String.format("Insert into %s failed", new Object[]{str}));
                } catch (SQLiteException e) {
                    e = e;
                    j2 = j;
                } catch (StackOverflowError e2) {
                    e = e2;
                    j2 = j;
                    try {
                        f17879g.mo20766b(f17877e, String.format("addEvent to %s failed", new Object[]{str}), e);
                        mo20774d();
                        j = j2;
                        close();
                        return j;
                    } catch (Throwable th) {
                        close();
                        throw th;
                    }
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            f17879g.mo20766b(f17877e, String.format("addEvent to %s failed", new Object[]{str}), e);
            mo20774d();
            j = j2;
            close();
            return j;
        } catch (StackOverflowError e4) {
            e = e4;
            f17879g.mo20766b(f17877e, String.format("addEvent to %s failed", new Object[]{str}), e);
            mo20774d();
            j = j2;
            close();
            return j;
        }
        close();
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c7, code lost:
        if (r1.isOpen() != false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00e2, code lost:
        if (r1.isOpen() != false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00e4, code lost:
        close();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20774d() {
        /*
            r8 = this;
            java.lang.String r0 = "databaseReset callback failed during delete"
            r1 = 0
            r2 = 0
            r3 = 1
            r8.close()     // Catch:{ SecurityException -> 0x0057 }
            java.io.File r4 = r8.f17880b     // Catch:{ SecurityException -> 0x0057 }
            r4.delete()     // Catch:{ SecurityException -> 0x0057 }
            u3.p r4 = r8.f17882d
            if (r4 == 0) goto L_0x00ab
            boolean r4 = r8.f17881c
            if (r4 == 0) goto L_0x00ab
            r8.f17881c = r2
            android.database.sqlite.SQLiteDatabase r1 = r8.getWritableDatabase()     // Catch:{ SQLiteException -> 0x002e }
            u3.p r4 = r8.f17882d     // Catch:{ SQLiteException -> 0x002e }
            u3.i r4 = (p253u3.C8144i) r4     // Catch:{ SQLiteException -> 0x002e }
            r4.mo20760a(r1)     // Catch:{ SQLiteException -> 0x002e }
            r8.f17881c = r3
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L_0x00ab
            goto L_0x0099
        L_0x002c:
            r0 = move-exception
            goto L_0x0047
        L_0x002e:
            r4 = move-exception
            u3.n r5 = f17879g     // Catch:{ all -> 0x002c }
            java.lang.String r6 = f17877e     // Catch:{ all -> 0x002c }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x002c }
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x002c }
            r5.mo20766b(r6, r0, r4)     // Catch:{ all -> 0x002c }
            r8.f17881c = r3
            if (r1 == 0) goto L_0x00ab
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L_0x00ab
            goto L_0x0099
        L_0x0047:
            r8.f17881c = r3
            if (r1 == 0) goto L_0x0054
            boolean r1 = r1.isOpen()
            if (r1 == 0) goto L_0x0054
            r8.close()
        L_0x0054:
            throw r0
        L_0x0055:
            r4 = move-exception
            goto L_0x00ac
        L_0x0057:
            r4 = move-exception
            u3.n r5 = f17879g     // Catch:{ all -> 0x0055 }
            java.lang.String r6 = f17877e     // Catch:{ all -> 0x0055 }
            java.lang.String r7 = "delete failed"
            r5.mo20766b(r6, r7, r4)     // Catch:{ all -> 0x0055 }
            u3.p r4 = r8.f17882d
            if (r4 == 0) goto L_0x00ab
            boolean r4 = r8.f17881c
            if (r4 == 0) goto L_0x00ab
            r8.f17881c = r2
            android.database.sqlite.SQLiteDatabase r1 = r8.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0081 }
            u3.p r4 = r8.f17882d     // Catch:{ SQLiteException -> 0x0081 }
            u3.i r4 = (p253u3.C8144i) r4     // Catch:{ SQLiteException -> 0x0081 }
            r4.mo20760a(r1)     // Catch:{ SQLiteException -> 0x0081 }
            r8.f17881c = r3
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L_0x00ab
            goto L_0x0099
        L_0x007f:
            r0 = move-exception
            goto L_0x009d
        L_0x0081:
            r4 = move-exception
            u3.n r5 = f17879g     // Catch:{ all -> 0x007f }
            java.lang.String r6 = f17877e     // Catch:{ all -> 0x007f }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x007f }
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x007f }
            r5.mo20766b(r6, r0, r4)     // Catch:{ all -> 0x007f }
            r8.f17881c = r3
            if (r1 == 0) goto L_0x00ab
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L_0x00ab
        L_0x0099:
            r8.close()
            goto L_0x00ab
        L_0x009d:
            r8.f17881c = r3
            if (r1 == 0) goto L_0x00aa
            boolean r1 = r1.isOpen()
            if (r1 == 0) goto L_0x00aa
            r8.close()
        L_0x00aa:
            throw r0
        L_0x00ab:
            return
        L_0x00ac:
            u3.p r5 = r8.f17882d
            if (r5 == 0) goto L_0x00f6
            boolean r5 = r8.f17881c
            if (r5 == 0) goto L_0x00f6
            r8.f17881c = r2
            android.database.sqlite.SQLiteDatabase r1 = r8.getWritableDatabase()     // Catch:{ SQLiteException -> 0x00cc }
            u3.p r5 = r8.f17882d     // Catch:{ SQLiteException -> 0x00cc }
            u3.i r5 = (p253u3.C8144i) r5     // Catch:{ SQLiteException -> 0x00cc }
            r5.mo20760a(r1)     // Catch:{ SQLiteException -> 0x00cc }
            r8.f17881c = r3
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L_0x00f6
            goto L_0x00e4
        L_0x00ca:
            r0 = move-exception
            goto L_0x00e8
        L_0x00cc:
            r5 = move-exception
            u3.n r6 = f17879g     // Catch:{ all -> 0x00ca }
            java.lang.String r7 = f17877e     // Catch:{ all -> 0x00ca }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x00ca }
            r6.mo20766b(r7, r0, r5)     // Catch:{ all -> 0x00ca }
            r8.f17881c = r3
            if (r1 == 0) goto L_0x00f6
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L_0x00f6
        L_0x00e4:
            r8.close()
            goto L_0x00f6
        L_0x00e8:
            r8.f17881c = r3
            if (r1 == 0) goto L_0x00f5
            boolean r1 = r1.isOpen()
            if (r1 == 0) goto L_0x00f5
            r8.close()
        L_0x00f5:
            throw r0
        L_0x00f6:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p253u3.C8150o.mo20774d():void");
    }

    /* renamed from: e */
    public final synchronized long mo20775e(String str, String str2) {
        long j;
        try {
            j = (long) getWritableDatabase().delete(str, "key=?", new String[]{str2});
            close();
        } catch (SQLiteException e) {
            f17879g.mo20766b(f17877e, String.format("deleteKey from %s failed", new Object[]{str}), e);
            mo20774d();
            close();
            j = -1;
            return j;
        } catch (StackOverflowError e2) {
            try {
                f17879g.mo20766b(f17877e, String.format("deleteKey from %s failed", new Object[]{str}), e2);
                mo20774d();
                close();
                j = -1;
                return j;
            } catch (Throwable th) {
                close();
                throw th;
            }
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (r2 == null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        if (r2 == null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        r0 = 0;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo20776h(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            r1 = 1
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r7.getReadableDatabase()     // Catch:{ SQLiteException -> 0x0045, StackOverflowError -> 0x002a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0045, StackOverflowError -> 0x002a }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0045, StackOverflowError -> 0x002a }
            java.lang.String r5 = "SELECT COUNT(*) FROM "
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0045, StackOverflowError -> 0x002a }
            r4.append(r8)     // Catch:{ SQLiteException -> 0x0045, StackOverflowError -> 0x002a }
            java.lang.String r4 = r4.toString()     // Catch:{ SQLiteException -> 0x0045, StackOverflowError -> 0x002a }
            android.database.sqlite.SQLiteStatement r2 = r3.compileStatement(r4)     // Catch:{ SQLiteException -> 0x0045, StackOverflowError -> 0x002a }
            long r0 = r2.simpleQueryForLong()     // Catch:{ SQLiteException -> 0x0045, StackOverflowError -> 0x002a }
            r2.close()     // Catch:{ all -> 0x006d }
            r7.close()     // Catch:{ all -> 0x006d }
            goto L_0x0062
        L_0x0028:
            r8 = move-exception
            goto L_0x0064
        L_0x002a:
            r3 = move-exception
            u3.n r4 = f17879g     // Catch:{ all -> 0x0028 }
            java.lang.String r5 = f17877e     // Catch:{ all -> 0x0028 }
            java.lang.String r6 = "getNumberRows for %s failed"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0028 }
            r1[r0] = r8     // Catch:{ all -> 0x0028 }
            java.lang.String r8 = java.lang.String.format(r6, r1)     // Catch:{ all -> 0x0028 }
            r4.mo20766b(r5, r8, r3)     // Catch:{ all -> 0x0028 }
            r7.mo20774d()     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x005d
        L_0x0041:
            r2.close()     // Catch:{ all -> 0x006d }
            goto L_0x005d
        L_0x0045:
            r3 = move-exception
            u3.n r4 = f17879g     // Catch:{ all -> 0x0028 }
            java.lang.String r5 = f17877e     // Catch:{ all -> 0x0028 }
            java.lang.String r6 = "getNumberRows for %s failed"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0028 }
            r1[r0] = r8     // Catch:{ all -> 0x0028 }
            java.lang.String r8 = java.lang.String.format(r6, r1)     // Catch:{ all -> 0x0028 }
            r4.mo20766b(r5, r8, r3)     // Catch:{ all -> 0x0028 }
            r7.mo20774d()     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x005d
            goto L_0x0041
        L_0x005d:
            r7.close()     // Catch:{ all -> 0x006d }
            r0 = 0
        L_0x0062:
            monitor-exit(r7)
            return r0
        L_0x0064:
            if (r2 == 0) goto L_0x0069
            r2.close()     // Catch:{ all -> 0x006d }
        L_0x0069:
            r7.close()     // Catch:{ all -> 0x006d }
            throw r8     // Catch:{ all -> 0x006d }
        L_0x006d:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p253u3.C8150o.mo20776h(java.lang.String):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a6, code lost:
        if (r14 != null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d9, code lost:
        if (r14 != null) goto L_0x00a8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c3 A[Catch:{ SQLiteException -> 0x00c4, StackOverflowError -> 0x00ac, IllegalStateException -> 0x00a2, RuntimeException -> 0x009a, all -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e4 A[SYNTHETIC, Splitter:B:58:0x00e4] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:39:0x00a3=Splitter:B:39:0x00a3, B:45:0x00ad=Splitter:B:45:0x00ad} */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.LinkedList mo20777i(long r20, long r22, java.lang.String r24) throws org.json.JSONException {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r4 = r22
            monitor-enter(r19)
            java.util.LinkedList r11 = new java.util.LinkedList     // Catch:{ all -> 0x00eb }
            r11.<init>()     // Catch:{ all -> 0x00eb }
            r12 = 0
            r13 = 1
            r14 = 0
            android.database.sqlite.SQLiteDatabase r0 = r19.getReadableDatabase()     // Catch:{ SQLiteException -> 0x00c4, StackOverflowError -> 0x00ac, IllegalStateException -> 0x00a2, RuntimeException -> 0x009a }
            java.lang.String r6 = "id"
            java.lang.String r7 = "event"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7}     // Catch:{ SQLiteException -> 0x00c4, StackOverflowError -> 0x00ac, IllegalStateException -> 0x00a2, RuntimeException -> 0x009a }
            r7 = 0
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x0034
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00c4, StackOverflowError -> 0x00ac, IllegalStateException -> 0x00a2, RuntimeException -> 0x009a }
            r9.<init>()     // Catch:{ SQLiteException -> 0x00c4, StackOverflowError -> 0x00ac, IllegalStateException -> 0x00a2, RuntimeException -> 0x009a }
            java.lang.String r10 = "id <= "
            r9.append(r10)     // Catch:{ SQLiteException -> 0x00c4, StackOverflowError -> 0x00ac, IllegalStateException -> 0x00a2, RuntimeException -> 0x009a }
            r9.append(r2)     // Catch:{ SQLiteException -> 0x00c4, StackOverflowError -> 0x00ac, IllegalStateException -> 0x00a2, RuntimeException -> 0x009a }
            java.lang.String r2 = r9.toString()     // Catch:{ SQLiteException -> 0x00c4, StackOverflowError -> 0x00ac, IllegalStateException -> 0x00a2, RuntimeException -> 0x009a }
            r9 = r2
            goto L_0x0035
        L_0x0034:
            r9 = r14
        L_0x0035:
            r10 = 0
            r15 = 0
            r16 = 0
            java.lang.String r17 = "id ASC"
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0053
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00c4, StackOverflowError -> 0x00ac, IllegalStateException -> 0x00a2, RuntimeException -> 0x009a }
            r2.<init>()     // Catch:{ SQLiteException -> 0x00c4, StackOverflowError -> 0x00ac, IllegalStateException -> 0x00a2, RuntimeException -> 0x009a }
            java.lang.String r3 = ""
            r2.append(r3)     // Catch:{ SQLiteException -> 0x00c4, StackOverflowError -> 0x00ac, IllegalStateException -> 0x00a2, RuntimeException -> 0x009a }
            r2.append(r4)     // Catch:{ SQLiteException -> 0x00c4, StackOverflowError -> 0x00ac, IllegalStateException -> 0x00a2, RuntimeException -> 0x009a }
            java.lang.String r2 = r2.toString()     // Catch:{ SQLiteException -> 0x00c4, StackOverflowError -> 0x00ac, IllegalStateException -> 0x00a2, RuntimeException -> 0x009a }
            r18 = r2
            goto L_0x0055
        L_0x0053:
            r18 = r14
        L_0x0055:
            r2 = r0
            r3 = r24
            r4 = r6
            r5 = r9
            r6 = r10
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x00c4, StackOverflowError -> 0x00ac, IllegalStateException -> 0x00a2, RuntimeException -> 0x009a }
        L_0x0066:
            boolean r0 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0095, StackOverflowError -> 0x0092, IllegalStateException -> 0x008f, RuntimeException -> 0x008d }
            if (r0 == 0) goto L_0x0089
            long r3 = r2.getLong(r12)     // Catch:{ SQLiteException -> 0x0095, StackOverflowError -> 0x0092, IllegalStateException -> 0x008f, RuntimeException -> 0x008d }
            java.lang.String r0 = r2.getString(r13)     // Catch:{ SQLiteException -> 0x0095, StackOverflowError -> 0x0092, IllegalStateException -> 0x008f, RuntimeException -> 0x008d }
            boolean r5 = p253u3.C8156t.m16412c(r0)     // Catch:{ SQLiteException -> 0x0095, StackOverflowError -> 0x0092, IllegalStateException -> 0x008f, RuntimeException -> 0x008d }
            if (r5 == 0) goto L_0x007b
            goto L_0x0066
        L_0x007b:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ SQLiteException -> 0x0095, StackOverflowError -> 0x0092, IllegalStateException -> 0x008f, RuntimeException -> 0x008d }
            r5.<init>(r0)     // Catch:{ SQLiteException -> 0x0095, StackOverflowError -> 0x0092, IllegalStateException -> 0x008f, RuntimeException -> 0x008d }
            java.lang.String r0 = "event_id"
            r5.put(r0, r3)     // Catch:{ SQLiteException -> 0x0095, StackOverflowError -> 0x0092, IllegalStateException -> 0x008f, RuntimeException -> 0x008d }
            r11.add(r5)     // Catch:{ SQLiteException -> 0x0095, StackOverflowError -> 0x0092, IllegalStateException -> 0x008f, RuntimeException -> 0x008d }
            goto L_0x0066
        L_0x0089:
            r2.close()     // Catch:{ all -> 0x00eb }
            goto L_0x00dc
        L_0x008d:
            r0 = move-exception
            goto L_0x009c
        L_0x008f:
            r0 = move-exception
            r14 = r2
            goto L_0x00a3
        L_0x0092:
            r0 = move-exception
            r14 = r2
            goto L_0x00ad
        L_0x0095:
            r0 = move-exception
            r14 = r2
            goto L_0x00c5
        L_0x0098:
            r0 = move-exception
            goto L_0x00e1
        L_0x009a:
            r0 = move-exception
            r2 = r14
        L_0x009c:
            m16384b(r0)     // Catch:{ all -> 0x00a0 }
            throw r14     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            goto L_0x00e2
        L_0x00a2:
            r0 = move-exception
        L_0x00a3:
            r1.mo20780n(r0)     // Catch:{ all -> 0x0098 }
            if (r14 == 0) goto L_0x00dc
        L_0x00a8:
            r14.close()     // Catch:{ all -> 0x00eb }
            goto L_0x00dc
        L_0x00ac:
            r0 = move-exception
        L_0x00ad:
            u3.n r2 = f17879g     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = f17877e     // Catch:{ all -> 0x0098 }
            java.lang.String r4 = "getEvents from %s failed"
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ all -> 0x0098 }
            r5[r12] = r24     // Catch:{ all -> 0x0098 }
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch:{ all -> 0x0098 }
            r2.mo20766b(r3, r4, r0)     // Catch:{ all -> 0x0098 }
            r19.mo20774d()     // Catch:{ all -> 0x0098 }
            if (r14 == 0) goto L_0x00dc
            goto L_0x00a8
        L_0x00c4:
            r0 = move-exception
        L_0x00c5:
            u3.n r2 = f17879g     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = f17877e     // Catch:{ all -> 0x0098 }
            java.lang.String r4 = "getEvents from %s failed"
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ all -> 0x0098 }
            r5[r12] = r24     // Catch:{ all -> 0x0098 }
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch:{ all -> 0x0098 }
            r2.mo20766b(r3, r4, r0)     // Catch:{ all -> 0x0098 }
            r19.mo20774d()     // Catch:{ all -> 0x0098 }
            if (r14 == 0) goto L_0x00dc
            goto L_0x00a8
        L_0x00dc:
            r19.close()     // Catch:{ all -> 0x00eb }
            monitor-exit(r19)
            return r11
        L_0x00e1:
            r2 = r14
        L_0x00e2:
            if (r2 == 0) goto L_0x00e7
            r2.close()     // Catch:{ all -> 0x00eb }
        L_0x00e7:
            r19.close()     // Catch:{ all -> 0x00eb }
            throw r0     // Catch:{ all -> 0x00eb }
        L_0x00eb:
            r0 = move-exception
            monitor-exit(r19)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p253u3.C8150o.mo20777i(long, long, java.lang.String):java.util.LinkedList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r4 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        if (r4 == null) goto L_0x0074;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo20778j(long r10, java.lang.String r12) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            r1 = 1
            r2 = -1
            r4 = 0
            android.database.sqlite.SQLiteDatabase r5 = r9.getReadableDatabase()     // Catch:{ SQLiteException -> 0x005c, StackOverflowError -> 0x0044 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x005c, StackOverflowError -> 0x0044 }
            r6.<init>()     // Catch:{ SQLiteException -> 0x005c, StackOverflowError -> 0x0044 }
            java.lang.String r7 = "SELECT id FROM "
            r6.append(r7)     // Catch:{ SQLiteException -> 0x005c, StackOverflowError -> 0x0044 }
            r6.append(r12)     // Catch:{ SQLiteException -> 0x005c, StackOverflowError -> 0x0044 }
            java.lang.String r7 = " LIMIT 1 OFFSET "
            r6.append(r7)     // Catch:{ SQLiteException -> 0x005c, StackOverflowError -> 0x0044 }
            r7 = 1
            long r10 = r10 - r7
            r6.append(r10)     // Catch:{ SQLiteException -> 0x005c, StackOverflowError -> 0x0044 }
            java.lang.String r10 = r6.toString()     // Catch:{ SQLiteException -> 0x005c, StackOverflowError -> 0x0044 }
            android.database.sqlite.SQLiteStatement r4 = r5.compileStatement(r10)     // Catch:{ SQLiteException -> 0x005c, StackOverflowError -> 0x0044 }
            long r10 = r4.simpleQueryForLong()     // Catch:{ SQLiteDoneException -> 0x0030 }
            r2 = r10
            goto L_0x003c
        L_0x0030:
            r10 = move-exception
            u3.n r11 = f17879g     // Catch:{ SQLiteException -> 0x005c, StackOverflowError -> 0x0044 }
            java.lang.String r5 = f17877e     // Catch:{ SQLiteException -> 0x005c, StackOverflowError -> 0x0044 }
            boolean r11 = r11.f17875a     // Catch:{ SQLiteException -> 0x005c, StackOverflowError -> 0x0044 }
            if (r11 == 0) goto L_0x003c
            android.util.Log.w(r5, r10)     // Catch:{ SQLiteException -> 0x005c, StackOverflowError -> 0x0044 }
        L_0x003c:
            if (r4 == 0) goto L_0x0074
        L_0x003e:
            r4.close()     // Catch:{ all -> 0x0082 }
            goto L_0x0074
        L_0x0042:
            r10 = move-exception
            goto L_0x0079
        L_0x0044:
            r10 = move-exception
            u3.n r11 = f17879g     // Catch:{ all -> 0x0042 }
            java.lang.String r5 = f17877e     // Catch:{ all -> 0x0042 }
            java.lang.String r6 = "getNthEventId from %s failed"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0042 }
            r1[r0] = r12     // Catch:{ all -> 0x0042 }
            java.lang.String r12 = java.lang.String.format(r6, r1)     // Catch:{ all -> 0x0042 }
            r11.mo20766b(r5, r12, r10)     // Catch:{ all -> 0x0042 }
            r9.mo20774d()     // Catch:{ all -> 0x0042 }
            if (r4 == 0) goto L_0x0074
            goto L_0x003e
        L_0x005c:
            r10 = move-exception
            u3.n r11 = f17879g     // Catch:{ all -> 0x0042 }
            java.lang.String r5 = f17877e     // Catch:{ all -> 0x0042 }
            java.lang.String r6 = "getNthEventId from %s failed"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0042 }
            r1[r0] = r12     // Catch:{ all -> 0x0042 }
            java.lang.String r12 = java.lang.String.format(r6, r1)     // Catch:{ all -> 0x0042 }
            r11.mo20766b(r5, r12, r10)     // Catch:{ all -> 0x0042 }
            r9.mo20774d()     // Catch:{ all -> 0x0042 }
            if (r4 == 0) goto L_0x0074
            goto L_0x003e
        L_0x0074:
            r9.close()     // Catch:{ all -> 0x0082 }
            monitor-exit(r9)
            return r2
        L_0x0079:
            if (r4 == 0) goto L_0x007e
            r4.close()     // Catch:{ all -> 0x0082 }
        L_0x007e:
            r9.close()     // Catch:{ all -> 0x0082 }
            throw r10     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p253u3.C8150o.mo20778j(long, java.lang.String):long");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v18, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: java.lang.Object} */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0088, code lost:
        if (r14 != null) goto L_0x003b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0056 A[Catch:{ SQLiteException -> 0x0071, StackOverflowError -> 0x0057, IllegalStateException -> 0x004f, RuntimeException -> 0x0049, all -> 0x0047, all -> 0x0090 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0070 A[Catch:{ SQLiteException -> 0x0071, StackOverflowError -> 0x0057, IllegalStateException -> 0x004f, RuntimeException -> 0x0049, all -> 0x0047, all -> 0x0090 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0094 A[SYNTHETIC, Splitter:B:45:0x0094] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Object mo20779k(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 0
            r1 = 0
            r2 = 1
            android.database.sqlite.SQLiteDatabase r3 = r12.getReadableDatabase()     // Catch:{ SQLiteException -> 0x0071, StackOverflowError -> 0x0057, IllegalStateException -> 0x004f, RuntimeException -> 0x0049, all -> 0x0047 }
            java.lang.String r4 = "key"
            java.lang.String r5 = "value"
            java.lang.String[] r5 = new java.lang.String[]{r4, r5}     // Catch:{ SQLiteException -> 0x0071, StackOverflowError -> 0x0057, IllegalStateException -> 0x004f, RuntimeException -> 0x0049, all -> 0x0047 }
            java.lang.String r6 = "key = ?"
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0071, StackOverflowError -> 0x0057, IllegalStateException -> 0x004f, RuntimeException -> 0x0049, all -> 0x0047 }
            r7[r1] = r14     // Catch:{ SQLiteException -> 0x0071, StackOverflowError -> 0x0057, IllegalStateException -> 0x004f, RuntimeException -> 0x0049, all -> 0x0047 }
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r4 = r13
            android.database.Cursor r14 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x0071, StackOverflowError -> 0x0057, IllegalStateException -> 0x004f, RuntimeException -> 0x0049, all -> 0x0047 }
            boolean r3 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0045, StackOverflowError -> 0x0043, IllegalStateException -> 0x0041, RuntimeException -> 0x003f }
            if (r3 == 0) goto L_0x003b
            java.lang.String r3 = "store"
            boolean r3 = r13.equals(r3)     // Catch:{ SQLiteException -> 0x0045, StackOverflowError -> 0x0043, IllegalStateException -> 0x0041, RuntimeException -> 0x003f }
            if (r3 == 0) goto L_0x0032
            java.lang.String r13 = r14.getString(r2)     // Catch:{ SQLiteException -> 0x0045, StackOverflowError -> 0x0043, IllegalStateException -> 0x0041, RuntimeException -> 0x003f }
            goto L_0x003a
        L_0x0032:
            long r3 = r14.getLong(r2)     // Catch:{ SQLiteException -> 0x0045, StackOverflowError -> 0x0043, IllegalStateException -> 0x0041, RuntimeException -> 0x003f }
            java.lang.Long r13 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x0045, StackOverflowError -> 0x0043, IllegalStateException -> 0x0041, RuntimeException -> 0x003f }
        L_0x003a:
            r0 = r13
        L_0x003b:
            r14.close()     // Catch:{ all -> 0x009b }
            goto L_0x008b
        L_0x003f:
            r13 = move-exception
            goto L_0x004b
        L_0x0041:
            r13 = move-exception
            goto L_0x0051
        L_0x0043:
            r3 = move-exception
            goto L_0x005a
        L_0x0045:
            r3 = move-exception
            goto L_0x0074
        L_0x0047:
            r13 = move-exception
            goto L_0x0092
        L_0x0049:
            r13 = move-exception
            r14 = r0
        L_0x004b:
            m16384b(r13)     // Catch:{ all -> 0x0090 }
            throw r0     // Catch:{ all -> 0x0090 }
        L_0x004f:
            r13 = move-exception
            r14 = r0
        L_0x0051:
            r12.mo20780n(r13)     // Catch:{ all -> 0x0090 }
            if (r14 == 0) goto L_0x008b
            goto L_0x003b
        L_0x0057:
            r14 = move-exception
            r3 = r14
            r14 = r0
        L_0x005a:
            u3.n r4 = f17879g     // Catch:{ all -> 0x0090 }
            java.lang.String r5 = f17877e     // Catch:{ all -> 0x0090 }
            java.lang.String r6 = "getValue from %s failed"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0090 }
            r2[r1] = r13     // Catch:{ all -> 0x0090 }
            java.lang.String r13 = java.lang.String.format(r6, r2)     // Catch:{ all -> 0x0090 }
            r4.mo20766b(r5, r13, r3)     // Catch:{ all -> 0x0090 }
            r12.mo20774d()     // Catch:{ all -> 0x0090 }
            if (r14 == 0) goto L_0x008b
            goto L_0x003b
        L_0x0071:
            r14 = move-exception
            r3 = r14
            r14 = r0
        L_0x0074:
            u3.n r4 = f17879g     // Catch:{ all -> 0x0090 }
            java.lang.String r5 = f17877e     // Catch:{ all -> 0x0090 }
            java.lang.String r6 = "getValue from %s failed"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0090 }
            r2[r1] = r13     // Catch:{ all -> 0x0090 }
            java.lang.String r13 = java.lang.String.format(r6, r2)     // Catch:{ all -> 0x0090 }
            r4.mo20766b(r5, r13, r3)     // Catch:{ all -> 0x0090 }
            r12.mo20774d()     // Catch:{ all -> 0x0090 }
            if (r14 == 0) goto L_0x008b
            goto L_0x003b
        L_0x008b:
            r12.close()     // Catch:{ all -> 0x009b }
            monitor-exit(r12)
            return r0
        L_0x0090:
            r13 = move-exception
            r0 = r14
        L_0x0092:
            if (r0 == 0) goto L_0x0097
            r0.close()     // Catch:{ all -> 0x009b }
        L_0x0097:
            r12.close()     // Catch:{ all -> 0x009b }
            throw r13     // Catch:{ all -> 0x009b }
        L_0x009b:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p253u3.C8150o.mo20779k(java.lang.String, java.lang.String):java.lang.Object");
    }

    /* renamed from: n */
    public final void mo20780n(IllegalStateException illegalStateException) {
        String message = illegalStateException.getMessage();
        if (C8156t.m16412c(message) || !message.contains("Couldn't read") || !message.contains("CursorWindow")) {
            throw illegalStateException;
        }
        mo20774d();
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS store (key TEXT PRIMARY KEY NOT NULL, value TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS long_store (key TEXT PRIMARY KEY NOT NULL, value INTEGER);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS identifys (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
        C8151p pVar = this.f17882d;
        if (pVar != null && this.f17881c) {
            try {
                this.f17881c = false;
                ((C8144i) pVar).mo20760a(sQLiteDatabase);
            } catch (SQLiteException e) {
                f17879g.mo20766b(f17877e, String.format("databaseReset callback failed during onCreate", new Object[0]), e);
            } catch (Throwable th) {
                this.f17881c = true;
                throw th;
            }
            this.f17881c = true;
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i > i2) {
            f17879g.mo20765a(f17877e, "onUpgrade() with invalid oldVersion and newVersion");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS store");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS long_store");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS identifys");
            onCreate(sQLiteDatabase);
        } else if (i2 > 1) {
            if (i == 1) {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS store (key TEXT PRIMARY KEY NOT NULL, value TEXT);");
                if (i2 <= 2) {
                    return;
                }
            } else if (i != 2) {
                if (i != 3) {
                    C8149n nVar = f17879g;
                    String str = f17877e;
                    nVar.mo20765a(str, "onUpgrade() with unknown oldVersion " + i);
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS store");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS long_store");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS identifys");
                    onCreate(sQLiteDatabase);
                    return;
                }
                return;
            }
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS identifys (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS long_store (key TEXT PRIMARY KEY NOT NULL, value INTEGER);");
        }
    }

    /* renamed from: r */
    public final synchronized long mo20783r(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) throws SQLiteException, StackOverflowError {
        return sQLiteDatabase.insert(str, (String) null, contentValues);
    }

    /* renamed from: t */
    public final synchronized void mo20784t(String str, Long l) {
        if (l == null) {
            mo20775e("long_store", str);
        } else {
            mo20768B(l, "long_store", str);
        }
    }

    /* renamed from: u */
    public final synchronized void mo20785u(String str, String str2) {
        if (str2 == null) {
            mo20775e("store", str);
        } else {
            mo20768B(str2, "store", str);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: x */
    public final synchronized long mo20786x(android.database.sqlite.SQLiteDatabase r3, java.lang.String r4, java.lang.String r5, java.lang.Object r6) throws android.database.sqlite.SQLiteException, java.lang.StackOverflowError {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ all -> 0x003a }
            r0.<init>()     // Catch:{ all -> 0x003a }
            java.lang.String r1 = "key"
            r0.put(r1, r5)     // Catch:{ all -> 0x003a }
            boolean r5 = r6 instanceof java.lang.Long     // Catch:{ all -> 0x003a }
            if (r5 == 0) goto L_0x0017
            java.lang.String r5 = "value"
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x003a }
            r0.put(r5, r6)     // Catch:{ all -> 0x003a }
            goto L_0x001e
        L_0x0017:
            java.lang.String r5 = "value"
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x003a }
            r0.put(r5, r6)     // Catch:{ all -> 0x003a }
        L_0x001e:
            monitor-enter(r2)     // Catch:{ all -> 0x003a }
            r5 = 0
            r6 = 5
            long r3 = r3.insertWithOnConflict(r4, r5, r0, r6)     // Catch:{ all -> 0x0037 }
            monitor-exit(r2)     // Catch:{ all -> 0x003a }
            r5 = -1
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0035
            u3.n r5 = f17879g     // Catch:{ all -> 0x003a }
            java.lang.String r6 = f17877e     // Catch:{ all -> 0x003a }
            java.lang.String r0 = "Insert failed"
            r5.mo20767c(r6, r0)     // Catch:{ all -> 0x003a }
        L_0x0035:
            monitor-exit(r2)
            return r3
        L_0x0037:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003a }
            throw r3     // Catch:{ all -> 0x003a }
        L_0x003a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p253u3.C8150o.mo20786x(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.Object):long");
    }
}
