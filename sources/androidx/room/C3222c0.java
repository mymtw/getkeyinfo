package androidx.room;

import android.database.Cursor;
import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.input.pointer.C1634f;
import p112g2.C6832b;
import p124h2.C6920a;

/* renamed from: androidx.room.c0 */
public final class C3222c0 extends C6832b.C6833a {

    /* renamed from: b */
    public C3237i f7491b;

    /* renamed from: c */
    public final C3223a f7492c;

    /* renamed from: d */
    public final String f7493d;

    /* renamed from: e */
    public final String f7494e;

    /* renamed from: androidx.room.c0$a */
    public static abstract class C3223a {

        /* renamed from: a */
        public final int f7495a;

        public C3223a(int i) {
            this.f7495a = i;
        }

        /* renamed from: a */
        public abstract void mo12004a(C6920a aVar);

        /* renamed from: b */
        public abstract void mo12005b(C6920a aVar);

        /* renamed from: c */
        public abstract void mo12006c();

        /* renamed from: d */
        public abstract void mo12007d(C6920a aVar);

        /* renamed from: e */
        public abstract void mo12008e();

        /* renamed from: f */
        public abstract void mo12009f(C6920a aVar);

        /* renamed from: g */
        public abstract C3224b mo12010g(C6920a aVar);
    }

    /* renamed from: androidx.room.c0$b */
    public static class C3224b {

        /* renamed from: a */
        public final boolean f7496a;

        /* renamed from: b */
        public final String f7497b;

        public C3224b(boolean z, String str) {
            this.f7496a = z;
            this.f7497b = str;
        }
    }

    public C3222c0(C3237i iVar, C3223a aVar, String str, String str2) {
        super(aVar.f7495a);
        this.f7491b = iVar;
        this.f7492c = aVar;
        this.f7493d = str;
        this.f7494e = str2;
    }

    /* renamed from: b */
    public final void mo11998b() {
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final void mo11999c(C6920a aVar) {
        Cursor a = aVar.mo19063a("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (a.moveToFirst() && a.getInt(0) == 0) {
                z = true;
            }
            a.close();
            this.f7492c.mo12004a(aVar);
            if (!z) {
                C3224b g = this.f7492c.mo12010g(aVar);
                if (!g.f7496a) {
                    StringBuilder h = C0072d.m201h("Pre-packaged database has an invalid schema: ");
                    h.append(g.f7497b);
                    throw new IllegalStateException(h.toString());
                }
            }
            mo12003g(aVar);
            this.f7492c.mo12006c();
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: d */
    public final void mo12000d(C6920a aVar, int i, int i2) {
        mo12002f(aVar, i, i2);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public final void mo12001e(C6920a aVar) {
        Cursor a = aVar.mo19063a("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = a.moveToFirst() && a.getInt(0) != 0;
            a.close();
            if (z) {
                Cursor t0 = aVar.mo18968t0(new C1634f("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                try {
                    String string = t0.moveToFirst() ? t0.getString(0) : null;
                    t0.close();
                    if (!this.f7493d.equals(string) && !this.f7494e.equals(string)) {
                        throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                    }
                } catch (Throwable th) {
                    t0.close();
                    throw th;
                }
            } else {
                C3224b g = this.f7492c.mo12010g(aVar);
                if (g.f7496a) {
                    this.f7492c.mo12008e();
                    mo12003g(aVar);
                } else {
                    StringBuilder h = C0072d.m201h("Pre-packaged database has an invalid schema: ");
                    h.append(g.f7497b);
                    throw new IllegalStateException(h.toString());
                }
            }
            this.f7492c.mo12007d(aVar);
            this.f7491b = null;
        } catch (Throwable th2) {
            a.close();
            throw th2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0079, code lost:
        r0 = r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12002f(p124h2.C6920a r12, int r13, int r14) {
        /*
            r11 = this;
            androidx.room.i r0 = r11.f7491b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00bd
            androidx.room.RoomDatabase$c r0 = r0.f7523d
            r0.getClass()
            if (r13 != r14) goto L_0x0013
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x007a
        L_0x0013:
            if (r14 <= r13) goto L_0x0017
            r3 = r1
            goto L_0x0018
        L_0x0017:
            r3 = r2
        L_0x0018:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = r13
        L_0x001e:
            if (r3 == 0) goto L_0x0023
            if (r5 >= r14) goto L_0x0079
            goto L_0x0025
        L_0x0023:
            if (r5 <= r14) goto L_0x0079
        L_0x0025:
            java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, z1.b>> r6 = r0.f7485a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r6.get(r7)
            java.util.TreeMap r6 = (java.util.TreeMap) r6
            r7 = 0
            if (r6 != 0) goto L_0x0035
            goto L_0x0077
        L_0x0035:
            if (r3 == 0) goto L_0x003c
            java.util.NavigableSet r8 = r6.descendingKeySet()
            goto L_0x0040
        L_0x003c:
            java.util.Set r8 = r6.keySet()
        L_0x0040:
            java.util.Iterator r8 = r8.iterator()
        L_0x0044:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0074
            java.lang.Object r9 = r8.next()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r3 == 0) goto L_0x005b
            if (r9 > r14) goto L_0x0061
            if (r9 <= r5) goto L_0x0061
            goto L_0x005f
        L_0x005b:
            if (r9 < r14) goto L_0x0061
            if (r9 >= r5) goto L_0x0061
        L_0x005f:
            r10 = r1
            goto L_0x0062
        L_0x0061:
            r10 = r2
        L_0x0062:
            if (r10 == 0) goto L_0x0044
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            java.lang.Object r5 = r6.get(r5)
            z1.b r5 = (p299z1.C8421b) r5
            r4.add(r5)
            r6 = r1
            r5 = r9
            goto L_0x0075
        L_0x0074:
            r6 = r2
        L_0x0075:
            if (r6 != 0) goto L_0x001e
        L_0x0077:
            r0 = r7
            goto L_0x007a
        L_0x0079:
            r0 = r4
        L_0x007a:
            if (r0 == 0) goto L_0x00bd
            androidx.room.c0$a r2 = r11.f7492c
            r2.mo12009f(r12)
            java.util.Iterator r0 = r0.iterator()
        L_0x0085:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0095
            java.lang.Object r2 = r0.next()
            z1.b r2 = (p299z1.C8421b) r2
            r2.mo12859a(r12)
            goto L_0x0085
        L_0x0095:
            androidx.room.c0$a r0 = r11.f7492c
            androidx.room.c0$b r0 = r0.mo12010g(r12)
            boolean r2 = r0.f7496a
            if (r2 == 0) goto L_0x00a8
            androidx.room.c0$a r0 = r11.f7492c
            r0.mo12008e()
            r11.mo12003g(r12)
            goto L_0x00be
        L_0x00a8:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Migration didn't properly handle: "
            java.lang.StringBuilder r13 = android.support.p013v4.media.C0072d.m201h(r13)
            java.lang.String r14 = r0.f7497b
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x00bd:
            r1 = r2
        L_0x00be:
            if (r1 != 0) goto L_0x00e5
            androidx.room.i r0 = r11.f7491b
            if (r0 == 0) goto L_0x00d5
            boolean r0 = r0.mo12031a(r13, r14)
            if (r0 != 0) goto L_0x00d5
            androidx.room.c0$a r13 = r11.f7492c
            r13.mo12005b(r12)
            androidx.room.c0$a r13 = r11.f7492c
            r13.mo12004a(r12)
            goto L_0x00e5
        L_0x00d5:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "A migration from "
            java.lang.String r1 = " to "
            java.lang.String r2 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            java.lang.String r13 = android.support.p013v4.media.C0070b.m183e(r0, r13, r1, r14, r2)
            r12.<init>(r13)
            throw r12
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C3222c0.mo12002f(h2.a, int, int):void");
    }

    /* renamed from: g */
    public final void mo12003g(C6920a aVar) {
        aVar.mo18966q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = this.f7493d;
        aVar.mo18966q("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')");
    }
}
