package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.apache.commons.lang3.ClassUtils;
import p112g2.C6831a;
import p112g2.C6832b;
import p112g2.C6837d;
import p121h.C6900a;
import p124h2.C6920a;
import p124h2.C6925c;
import p299z1.C8420a;
import p299z1.C8421b;
import p504ai.C13983i;

public abstract class RoomDatabase {
    @Deprecated

    /* renamed from: a */
    public volatile C6831a f7460a;

    /* renamed from: b */
    public Executor f7461b;

    /* renamed from: c */
    public C3238i0 f7462c;

    /* renamed from: d */
    public C6832b f7463d;

    /* renamed from: e */
    public final C3244n f7464e = mo11975d();

    /* renamed from: f */
    public boolean f7465f;
    @Deprecated

    /* renamed from: g */
    public List<C3214b> f7466g;

    /* renamed from: h */
    public HashMap f7467h = new HashMap();

    /* renamed from: i */
    public final ReentrantReadWriteLock f7468i = new ReentrantReadWriteLock();

    /* renamed from: j */
    public final ThreadLocal<Integer> f7469j = new ThreadLocal<>();

    /* renamed from: k */
    public final Map<String, Object> f7470k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l */
    public final HashMap f7471l = new HashMap();

    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean isLowRamDevice(ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }

        public JournalMode resolve(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            return (activityManager == null || isLowRamDevice(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* renamed from: androidx.room.RoomDatabase$a */
    public static class C3213a<T extends RoomDatabase> {

        /* renamed from: a */
        public final Class<T> f7472a;

        /* renamed from: b */
        public final String f7473b;

        /* renamed from: c */
        public final Context f7474c;

        /* renamed from: d */
        public ArrayList<C3214b> f7475d;

        /* renamed from: e */
        public Executor f7476e;

        /* renamed from: f */
        public Executor f7477f;

        /* renamed from: g */
        public C6832b.C6835c f7478g;

        /* renamed from: h */
        public boolean f7479h;

        /* renamed from: i */
        public JournalMode f7480i = JournalMode.AUTOMATIC;

        /* renamed from: j */
        public boolean f7481j = true;

        /* renamed from: k */
        public boolean f7482k;

        /* renamed from: l */
        public final C3215c f7483l = new C3215c();

        /* renamed from: m */
        public HashSet f7484m;

        public C3213a(Context context, Class<T> cls, String str) {
            this.f7474c = context;
            this.f7472a = cls;
            this.f7473b = str;
        }

        /* renamed from: a */
        public final void mo11986a(C8421b... bVarArr) {
            if (this.f7484m == null) {
                this.f7484m = new HashSet();
            }
            for (C8421b bVar : bVarArr) {
                this.f7484m.add(Integer.valueOf(bVar.f18438a));
                this.f7484m.add(Integer.valueOf(bVar.f18439b));
            }
            this.f7483l.mo11989a(bVarArr);
        }

        @SuppressLint({"RestrictedApi"})
        /* renamed from: b */
        public final T mo11987b() {
            String str;
            boolean z;
            Executor executor;
            Context context = this.f7474c;
            if (context == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            } else if (this.f7472a != null) {
                Executor executor2 = this.f7476e;
                if (executor2 == null && this.f7477f == null) {
                    C6900a.C6901a aVar = C6900a.f15277e;
                    this.f7477f = aVar;
                    this.f7476e = aVar;
                } else if (executor2 != null && this.f7477f == null) {
                    this.f7477f = executor2;
                } else if (executor2 == null && (executor = this.f7477f) != null) {
                    this.f7476e = executor;
                }
                C6832b.C6835c cVar = this.f7478g;
                if (cVar == null) {
                    cVar = new C6925c();
                }
                C3237i iVar = new C3237i(context, this.f7473b, cVar, this.f7483l, this.f7475d, this.f7479h, this.f7480i.resolve(context), this.f7476e, this.f7477f, this.f7481j, this.f7482k);
                Class<T> cls = this.f7472a;
                String name = cls.getPackage().getName();
                String canonicalName = cls.getCanonicalName();
                if (!name.isEmpty()) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String str2 = canonicalName.replace(ClassUtils.PACKAGE_SEPARATOR_CHAR, '_') + "_Impl";
                try {
                    if (name.isEmpty()) {
                        str = str2;
                    } else {
                        str = name + "." + str2;
                    }
                    T t = (RoomDatabase) Class.forName(str, true, cls.getClassLoader()).newInstance();
                    t.f7463d = t.mo11976e(iVar);
                    Set<Class<? extends C8420a>> g = t.mo11978g();
                    BitSet bitSet = new BitSet();
                    Iterator<Class<? extends C8420a>> it = g.iterator();
                    while (true) {
                        int i = -1;
                        if (it.hasNext()) {
                            Class next = it.next();
                            int size = iVar.f7526g.size() - 1;
                            while (true) {
                                if (size < 0) {
                                    break;
                                } else if (next.isAssignableFrom(iVar.f7526g.get(size).getClass())) {
                                    bitSet.set(size);
                                    i = size;
                                    break;
                                } else {
                                    size--;
                                }
                            }
                            if (i >= 0) {
                                t.f7467h.put(next, iVar.f7526g.get(i));
                            } else {
                                StringBuilder h = C0072d.m201h("A required auto migration spec (");
                                h.append(next.getCanonicalName());
                                h.append(") is missing in the database configuration.");
                                throw new IllegalArgumentException(h.toString());
                            }
                        } else {
                            int size2 = iVar.f7526g.size() - 1;
                            while (size2 >= 0) {
                                if (bitSet.get(size2)) {
                                    size2--;
                                } else {
                                    throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                }
                            }
                            Iterator it2 = t.mo11977f().iterator();
                            while (true) {
                                z = false;
                                if (!it2.hasNext()) {
                                    break;
                                }
                                C8421b bVar = (C8421b) it2.next();
                                if (!Collections.unmodifiableMap(iVar.f7523d.f7485a).containsKey(Integer.valueOf(bVar.f18438a))) {
                                    iVar.f7523d.mo11989a(bVar);
                                }
                            }
                            C3230f0 f0Var = (C3230f0) RoomDatabase.m7840n(C3230f0.class, t.f7463d);
                            if (f0Var != null) {
                                f0Var.f7511b = iVar;
                            }
                            if (((C3231g) RoomDatabase.m7840n(C3231g.class, t.f7463d)) == null) {
                                if (iVar.f7528i == JournalMode.WRITE_AHEAD_LOGGING) {
                                    z = true;
                                }
                                t.f7463d.setWriteAheadLoggingEnabled(z);
                                t.f7466g = iVar.f7524e;
                                t.f7461b = iVar.f7529j;
                                t.f7462c = new C3238i0(iVar.f7530k);
                                t.f7465f = iVar.f7527h;
                                Map<Class<?>, List<Class<?>>> h2 = t.mo11979h();
                                BitSet bitSet2 = new BitSet();
                                for (Map.Entry next2 : h2.entrySet()) {
                                    Class cls2 = (Class) next2.getKey();
                                    Iterator it3 = ((List) next2.getValue()).iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            Class cls3 = (Class) it3.next();
                                            int size3 = iVar.f7525f.size() - 1;
                                            while (true) {
                                                if (size3 < 0) {
                                                    size3 = -1;
                                                    break;
                                                } else if (cls3.isAssignableFrom(iVar.f7525f.get(size3).getClass())) {
                                                    bitSet2.set(size3);
                                                    break;
                                                } else {
                                                    size3--;
                                                }
                                            }
                                            if (size3 >= 0) {
                                                t.f7471l.put(cls3, iVar.f7525f.get(size3));
                                            } else {
                                                throw new IllegalArgumentException("A required type converter (" + cls3 + ") for " + cls2.getCanonicalName() + " is missing in the database configuration.");
                                            }
                                        }
                                    }
                                }
                                int size4 = iVar.f7525f.size() - 1;
                                while (size4 >= 0) {
                                    if (bitSet2.get(size4)) {
                                        size4--;
                                    } else {
                                        throw new IllegalArgumentException(C13983i.m21494m("Unexpected type converter ", iVar.f7525f.get(size4), ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."));
                                    }
                                }
                                return t;
                            }
                            t.f7464e.getClass();
                            throw null;
                        }
                    }
                } catch (ClassNotFoundException unused) {
                    StringBuilder h3 = C0072d.m201h("cannot find implementation for ");
                    h3.append(cls.getCanonicalName());
                    h3.append(". ");
                    h3.append(str2);
                    h3.append(" does not exist");
                    throw new RuntimeException(h3.toString());
                } catch (IllegalAccessException unused2) {
                    StringBuilder h4 = C0072d.m201h("Cannot access the constructor");
                    h4.append(cls.getCanonicalName());
                    throw new RuntimeException(h4.toString());
                } catch (InstantiationException unused3) {
                    StringBuilder h5 = C0072d.m201h("Failed to create an instance of ");
                    h5.append(cls.getCanonicalName());
                    throw new RuntimeException(h5.toString());
                }
            } else {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
        }
    }

    /* renamed from: androidx.room.RoomDatabase$b */
    public static abstract class C3214b {
        /* renamed from: a */
        public void mo11988a(C6920a aVar) {
        }
    }

    /* renamed from: androidx.room.RoomDatabase$c */
    public static class C3215c {

        /* renamed from: a */
        public HashMap<Integer, TreeMap<Integer, C8421b>> f7485a = new HashMap<>();

        /* renamed from: a */
        public final void mo11989a(C8421b... bVarArr) {
            for (C8421b bVar : bVarArr) {
                int i = bVar.f18438a;
                int i2 = bVar.f18439b;
                TreeMap treeMap = this.f7485a.get(Integer.valueOf(i));
                if (treeMap == null) {
                    treeMap = new TreeMap();
                    this.f7485a.put(Integer.valueOf(i), treeMap);
                }
                C8421b bVar2 = (C8421b) treeMap.get(Integer.valueOf(i2));
                if (bVar2 != null) {
                    Log.w("ROOM", "Overriding migration " + bVar2 + " with " + bVar);
                }
                treeMap.put(Integer.valueOf(i2), bVar);
            }
        }
    }

    /* renamed from: androidx.room.RoomDatabase$d */
    public interface C3216d {
        /* renamed from: a */
        void mo11990a();
    }

    /* renamed from: n */
    public static Object m7840n(Class cls, C6832b bVar) {
        if (cls.isInstance(bVar)) {
            return bVar;
        }
        if (bVar instanceof C3240j) {
            return m7840n(cls, ((C3240j) bVar).getDelegate());
        }
        return null;
    }

    /* renamed from: a */
    public final void mo11972a() {
        if (!this.f7465f) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
            }
        }
    }

    /* renamed from: b */
    public final void mo11973b() {
        if (!this.f7463d.mo12025j0().mo18967q0() && this.f7469j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    /* renamed from: c */
    public final void mo11974c() {
        mo11972a();
        mo11972a();
        C6831a j0 = this.f7463d.mo12025j0();
        this.f7464e.mo12045e(j0);
        if (j0.mo18969u0()) {
            j0.mo18959F();
        } else {
            j0.mo18964o();
        }
    }

    /* renamed from: d */
    public abstract C3244n mo11975d();

    /* renamed from: e */
    public abstract C6832b mo11976e(C3237i iVar);

    /* renamed from: f */
    public List mo11977f() {
        return Collections.emptyList();
    }

    /* renamed from: g */
    public Set<Class<? extends C8420a>> mo11978g() {
        return Collections.emptySet();
    }

    /* renamed from: h */
    public Map<Class<?>, List<Class<?>>> mo11979h() {
        return Collections.emptyMap();
    }

    /* renamed from: i */
    public final void mo11980i() {
        this.f7463d.mo12025j0().mo18960K();
        if (!this.f7463d.mo12025j0().mo18967q0()) {
            C3244n nVar = this.f7464e;
            if (nVar.f7546e.compareAndSet(false, true)) {
                nVar.f7545d.f7461b.execute(nVar.f7552k);
            }
        }
    }

    /* renamed from: j */
    public final void mo11981j(C6831a aVar) {
        C3244n nVar = this.f7464e;
        synchronized (nVar) {
            if (nVar.f7547f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            aVar.mo18966q("PRAGMA temp_store = MEMORY;");
            aVar.mo18966q("PRAGMA recursive_triggers='ON';");
            aVar.mo18966q("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            nVar.mo12045e(aVar);
            nVar.f7548g = aVar.mo18961Z("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            nVar.f7547f = true;
        }
    }

    /* renamed from: k */
    public final boolean mo11982k() {
        C6831a aVar = this.f7460a;
        return aVar != null && aVar.isOpen();
    }

    /* renamed from: l */
    public final Cursor mo11983l(C6837d dVar) {
        mo11972a();
        mo11973b();
        return this.f7463d.mo12025j0().mo18968t0(dVar);
    }

    @Deprecated
    /* renamed from: m */
    public final void mo11984m() {
        this.f7463d.mo12025j0().mo18957D();
    }
}
