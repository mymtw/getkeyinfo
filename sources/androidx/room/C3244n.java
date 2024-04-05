package androidx.room;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import androidx.compose.animation.C0391c;
import androidx.compose.p015ui.input.pointer.C1634f;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p112g2.C6831a;
import p112g2.C6838e;
import p133i.C6971b;

/* renamed from: androidx.room.n */
public final class C3244n {

    /* renamed from: l */
    public static final String[] f7541l = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a */
    public final HashMap<String, Integer> f7542a;

    /* renamed from: b */
    public final String[] f7543b;

    /* renamed from: c */
    public Map<String, Set<String>> f7544c;

    /* renamed from: d */
    public final RoomDatabase f7545d;

    /* renamed from: e */
    public AtomicBoolean f7546e = new AtomicBoolean(false);

    /* renamed from: f */
    public volatile boolean f7547f = false;

    /* renamed from: g */
    public volatile C6838e f7548g;

    /* renamed from: h */
    public final C3246b f7549h;
    @SuppressLint({"RestrictedApi"})

    /* renamed from: i */
    public final C6971b<C3247c, C3248d> f7550i = new C6971b<>();

    /* renamed from: j */
    public final Object f7551j = new Object();

    /* renamed from: k */
    public C3245a f7552k = new C3245a();

    /* renamed from: androidx.room.n$a */
    public class C3245a implements Runnable {
        public C3245a() {
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        public final HashSet mo12046a() {
            HashSet hashSet = new HashSet();
            Cursor l = C3244n.this.f7545d.mo11983l(new C1634f("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (l.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(l.getInt(0)));
                } catch (Throwable th) {
                    l.close();
                    throw th;
                }
            }
            l.close();
            if (!hashSet.isEmpty()) {
                C3244n.this.f7548g.mo18972s();
            }
            return hashSet;
        }

        /* JADX WARNING: Removed duplicated region for block: B:40:0x007f  */
        /* JADX WARNING: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r11 = this;
                androidx.room.n r0 = androidx.room.C3244n.this
                androidx.room.RoomDatabase r0 = r0.f7545d
                java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.f7468i
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
                r0.lock()
                r1 = 0
                r2 = 0
                r3 = 1
                androidx.room.n r4 = androidx.room.C3244n.this     // Catch:{ IllegalStateException -> 0x0066, SQLiteException -> 0x0064 }
                boolean r4 = r4.mo12042b()     // Catch:{ IllegalStateException -> 0x0066, SQLiteException -> 0x0064 }
                if (r4 != 0) goto L_0x0021
            L_0x0018:
                r0.unlock()
                androidx.room.n r0 = androidx.room.C3244n.this
                r0.getClass()
                return
            L_0x0021:
                androidx.room.n r4 = androidx.room.C3244n.this     // Catch:{ IllegalStateException -> 0x0066, SQLiteException -> 0x0064 }
                java.util.concurrent.atomic.AtomicBoolean r4 = r4.f7546e     // Catch:{ IllegalStateException -> 0x0066, SQLiteException -> 0x0064 }
                boolean r4 = r4.compareAndSet(r3, r1)     // Catch:{ IllegalStateException -> 0x0066, SQLiteException -> 0x0064 }
                if (r4 != 0) goto L_0x002c
                goto L_0x0018
            L_0x002c:
                androidx.room.n r4 = androidx.room.C3244n.this     // Catch:{ IllegalStateException -> 0x0066, SQLiteException -> 0x0064 }
                androidx.room.RoomDatabase r4 = r4.f7545d     // Catch:{ IllegalStateException -> 0x0066, SQLiteException -> 0x0064 }
                g2.b r4 = r4.f7463d     // Catch:{ IllegalStateException -> 0x0066, SQLiteException -> 0x0064 }
                g2.a r4 = r4.mo12025j0()     // Catch:{ IllegalStateException -> 0x0066, SQLiteException -> 0x0064 }
                boolean r4 = r4.mo18967q0()     // Catch:{ IllegalStateException -> 0x0066, SQLiteException -> 0x0064 }
                if (r4 == 0) goto L_0x003d
                goto L_0x0018
            L_0x003d:
                androidx.room.n r4 = androidx.room.C3244n.this     // Catch:{ IllegalStateException -> 0x0066, SQLiteException -> 0x0064 }
                androidx.room.RoomDatabase r4 = r4.f7545d     // Catch:{ IllegalStateException -> 0x0066, SQLiteException -> 0x0064 }
                g2.b r4 = r4.f7463d     // Catch:{ IllegalStateException -> 0x0066, SQLiteException -> 0x0064 }
                g2.a r4 = r4.mo12025j0()     // Catch:{ IllegalStateException -> 0x0066, SQLiteException -> 0x0064 }
                r4.mo18959F()     // Catch:{ IllegalStateException -> 0x0066, SQLiteException -> 0x0064 }
                java.util.HashSet r5 = r11.mo12046a()     // Catch:{ all -> 0x005b }
                r4.mo18957D()     // Catch:{ all -> 0x0059 }
                r4.mo18960K()     // Catch:{ IllegalStateException -> 0x0057, SQLiteException -> 0x0055 }
                goto L_0x006f
            L_0x0055:
                r4 = move-exception
                goto L_0x0068
            L_0x0057:
                r4 = move-exception
                goto L_0x0068
            L_0x0059:
                r6 = move-exception
                goto L_0x005d
            L_0x005b:
                r6 = move-exception
                r5 = r2
            L_0x005d:
                r4.mo18960K()     // Catch:{ IllegalStateException -> 0x0057, SQLiteException -> 0x0055 }
                throw r6     // Catch:{ IllegalStateException -> 0x0057, SQLiteException -> 0x0055 }
            L_0x0061:
                r1 = move-exception
                goto L_0x00da
            L_0x0064:
                r4 = move-exception
                goto L_0x0067
            L_0x0066:
                r4 = move-exception
            L_0x0067:
                r5 = r2
            L_0x0068:
                java.lang.String r6 = "ROOM"
                java.lang.String r7 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r6, r7, r4)     // Catch:{ all -> 0x0061 }
            L_0x006f:
                r0.unlock()
                androidx.room.n r0 = androidx.room.C3244n.this
                r0.getClass()
                if (r5 == 0) goto L_0x00d9
                boolean r0 = r5.isEmpty()
                if (r0 != 0) goto L_0x00d9
                androidx.room.n r0 = androidx.room.C3244n.this
                i.b<androidx.room.n$c, androidx.room.n$d> r0 = r0.f7550i
                monitor-enter(r0)
                androidx.room.n r4 = androidx.room.C3244n.this     // Catch:{ all -> 0x00d6 }
                i.b<androidx.room.n$c, androidx.room.n$d> r4 = r4.f7550i     // Catch:{ all -> 0x00d6 }
                java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00d6 }
            L_0x008c:
                r6 = r4
                i.b$e r6 = (p133i.C6971b.C6976e) r6     // Catch:{ all -> 0x00d6 }
                boolean r7 = r6.hasNext()     // Catch:{ all -> 0x00d6 }
                if (r7 == 0) goto L_0x00d4
                java.lang.Object r6 = r6.next()     // Catch:{ all -> 0x00d6 }
                java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ all -> 0x00d6 }
                java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x00d6 }
                androidx.room.n$d r6 = (androidx.room.C3244n.C3248d) r6     // Catch:{ all -> 0x00d6 }
                int[] r7 = r6.f7559a     // Catch:{ all -> 0x00d6 }
                int r7 = r7.length     // Catch:{ all -> 0x00d6 }
                r8 = r1
                r9 = r2
            L_0x00a6:
                if (r8 >= r7) goto L_0x00cc
                int[] r10 = r6.f7559a     // Catch:{ all -> 0x00d6 }
                r10 = r10[r8]     // Catch:{ all -> 0x00d6 }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x00d6 }
                boolean r10 = r5.contains(r10)     // Catch:{ all -> 0x00d6 }
                if (r10 == 0) goto L_0x00c9
                if (r7 != r3) goto L_0x00bb
                java.util.Set<java.lang.String> r9 = r6.f7562d     // Catch:{ all -> 0x00d6 }
                goto L_0x00c9
            L_0x00bb:
                if (r9 != 0) goto L_0x00c2
                java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x00d6 }
                r9.<init>(r7)     // Catch:{ all -> 0x00d6 }
            L_0x00c2:
                java.lang.String[] r10 = r6.f7560b     // Catch:{ all -> 0x00d6 }
                r10 = r10[r8]     // Catch:{ all -> 0x00d6 }
                r9.add(r10)     // Catch:{ all -> 0x00d6 }
            L_0x00c9:
                int r8 = r8 + 1
                goto L_0x00a6
            L_0x00cc:
                if (r9 == 0) goto L_0x008c
                androidx.room.n$c r6 = r6.f7561c     // Catch:{ all -> 0x00d6 }
                r6.mo11954a(r9)     // Catch:{ all -> 0x00d6 }
                goto L_0x008c
            L_0x00d4:
                monitor-exit(r0)     // Catch:{ all -> 0x00d6 }
                goto L_0x00d9
            L_0x00d6:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00d6 }
                throw r1
            L_0x00d9:
                return
            L_0x00da:
                r0.unlock()
                androidx.room.n r0 = androidx.room.C3244n.this
                r0.getClass()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.C3244n.C3245a.run():void");
        }
    }

    /* renamed from: androidx.room.n$b */
    public static class C3246b {

        /* renamed from: a */
        public final long[] f7554a;

        /* renamed from: b */
        public final boolean[] f7555b;

        /* renamed from: c */
        public final int[] f7556c;

        /* renamed from: d */
        public boolean f7557d;

        public C3246b(int i) {
            long[] jArr = new long[i];
            this.f7554a = jArr;
            boolean[] zArr = new boolean[i];
            this.f7555b = zArr;
            this.f7556c = new int[i];
            Arrays.fill(jArr, 0);
            Arrays.fill(zArr, false);
        }

        /* renamed from: a */
        public final int[] mo12048a() {
            synchronized (this) {
                if (!this.f7557d) {
                    return null;
                }
                int length = this.f7554a.length;
                for (int i = 0; i < length; i++) {
                    int i2 = 1;
                    boolean z = this.f7554a[i] > 0;
                    boolean[] zArr = this.f7555b;
                    if (z != zArr[i]) {
                        int[] iArr = this.f7556c;
                        if (!z) {
                            i2 = 2;
                        }
                        iArr[i] = i2;
                    } else {
                        this.f7556c[i] = 0;
                    }
                    zArr[i] = z;
                }
                this.f7557d = false;
                int[] iArr2 = (int[]) this.f7556c.clone();
                return iArr2;
            }
        }
    }

    /* renamed from: androidx.room.n$c */
    public static abstract class C3247c {

        /* renamed from: a */
        public final String[] f7558a;

        public C3247c(String[] strArr) {
            this.f7558a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        /* renamed from: a */
        public abstract void mo11954a(Set<String> set);
    }

    /* renamed from: androidx.room.n$d */
    public static class C3248d {

        /* renamed from: a */
        public final int[] f7559a;

        /* renamed from: b */
        public final String[] f7560b;

        /* renamed from: c */
        public final C3247c f7561c;

        /* renamed from: d */
        public final Set<String> f7562d;

        public C3248d(C3247c cVar, int[] iArr, String[] strArr) {
            this.f7561c = cVar;
            this.f7559a = iArr;
            this.f7560b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                this.f7562d = Collections.unmodifiableSet(hashSet);
                return;
            }
            this.f7562d = null;
        }
    }

    public C3244n(RoomDatabase roomDatabase, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.f7545d = roomDatabase;
        this.f7549h = new C3246b(strArr.length);
        this.f7542a = new HashMap<>();
        this.f7544c = hashMap2;
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.f7543b = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f7542a.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) hashMap.get(strArr[i]);
            if (str2 != null) {
                this.f7543b[i] = str2.toLowerCase(locale);
            } else {
                this.f7543b[i] = lowerCase;
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(locale2);
            if (this.f7542a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap<String, Integer> hashMap3 = this.f7542a;
                hashMap3.put(lowerCase3, hashMap3.get(lowerCase2));
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    public final void mo12041a(C3247c cVar) {
        C3248d c;
        boolean z;
        String[] strArr = cVar.f7558a;
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f7544c.containsKey(lowerCase)) {
                hashSet.addAll(this.f7544c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        String[] strArr2 = (String[]) hashSet.toArray(new String[hashSet.size()]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        int length2 = strArr2.length;
        int i = 0;
        while (i < length2) {
            Integer num = this.f7542a.get(strArr2[i].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i] = num.intValue();
                i++;
            } else {
                StringBuilder h = C0072d.m201h("There is no table with name ");
                h.append(strArr2[i]);
                throw new IllegalArgumentException(h.toString());
            }
        }
        C3248d dVar = new C3248d(cVar, iArr, strArr2);
        synchronized (this.f7550i) {
            c = this.f7550i.mo19126c(cVar, dVar);
        }
        if (c == null) {
            C3246b bVar = this.f7549h;
            synchronized (bVar) {
                z = false;
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = iArr[i2];
                    long[] jArr = bVar.f7554a;
                    long j = jArr[i3];
                    jArr[i3] = 1 + j;
                    if (j == 0) {
                        bVar.f7557d = true;
                        z = true;
                    }
                }
            }
            if (z && this.f7545d.mo11982k()) {
                mo12045e(this.f7545d.f7463d.mo12025j0());
            }
        }
    }

    /* renamed from: b */
    public final boolean mo12042b() {
        if (!this.f7545d.mo11982k()) {
            return false;
        }
        if (!this.f7547f) {
            this.f7545d.f7463d.mo12025j0();
        }
        if (this.f7547f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: c */
    public final void mo12043c(C3247c cVar) {
        C3248d e;
        boolean z;
        synchronized (this.f7550i) {
            e = this.f7550i.mo19127e(cVar);
        }
        if (e != null) {
            C3246b bVar = this.f7549h;
            int[] iArr = e.f7559a;
            synchronized (bVar) {
                z = false;
                for (int i : iArr) {
                    long[] jArr = bVar.f7554a;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        bVar.f7557d = true;
                        z = true;
                    }
                }
            }
            if (z && this.f7545d.mo11982k()) {
                mo12045e(this.f7545d.f7463d.mo12025j0());
            }
        }
    }

    /* renamed from: d */
    public final void mo12044d(int i, C6831a aVar) {
        aVar.mo18966q("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f7543b[i];
        StringBuilder sb = new StringBuilder();
        String[] strArr = f7541l;
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = strArr[i2];
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            C0391c.m1061h(sb, str, "_", str2, "`");
            C0391c.m1061h(sb, " AFTER ", str2, " ON `", str);
            C0391c.m1061h(sb, "` BEGIN UPDATE ", "room_table_modification_log", " SET ", "invalidated");
            C0391c.m1061h(sb, " = 1", " WHERE ", "table_id", " = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            aVar.mo18966q(sb.toString());
        }
    }

    /* renamed from: e */
    public final void mo12045e(C6831a aVar) {
        if (!aVar.mo18967q0()) {
            try {
                ReentrantReadWriteLock.ReadLock readLock = this.f7545d.f7468i.readLock();
                readLock.lock();
                try {
                    synchronized (this.f7551j) {
                        int[] a = this.f7549h.mo12048a();
                        if (a != null) {
                            int length = a.length;
                            if (aVar.mo18969u0()) {
                                aVar.mo18959F();
                            } else {
                                aVar.mo18964o();
                            }
                            int i = 0;
                            while (i < length) {
                                try {
                                    int i2 = a[i];
                                    if (i2 == 1) {
                                        mo12044d(i, aVar);
                                    } else if (i2 == 2) {
                                        String str = this.f7543b[i];
                                        StringBuilder sb = new StringBuilder();
                                        String[] strArr = f7541l;
                                        for (int i3 = 0; i3 < 3; i3++) {
                                            String str2 = strArr[i3];
                                            sb.setLength(0);
                                            sb.append("DROP TRIGGER IF EXISTS ");
                                            sb.append("`");
                                            sb.append("room_table_modification_trigger_");
                                            sb.append(str);
                                            sb.append("_");
                                            sb.append(str2);
                                            sb.append("`");
                                            aVar.mo18966q(sb.toString());
                                        }
                                    }
                                    i++;
                                } finally {
                                    aVar.mo18960K();
                                }
                            }
                            aVar.mo18957D();
                            aVar.mo18960K();
                            readLock.unlock();
                        }
                    }
                } finally {
                    readLock.unlock();
                }
            } catch (SQLiteException | IllegalStateException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            }
        }
    }
}
