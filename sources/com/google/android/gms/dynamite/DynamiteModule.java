package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.etsy.android.lib.conversation.MessageDraft;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p628nj.C18265d;
import p628nj.C18266e;
import p628nj.C18267f;

@KeepForSdk
public final class DynamiteModule {
    @KeepForSdk

    /* renamed from: b */
    public static final C14456b f32574b = new C14456b();
    @KeepForSdk

    /* renamed from: c */
    public static final C14457c f32575c = new C14457c();
    @KeepForSdk

    /* renamed from: d */
    public static final C14458d f32576d = new C14458d();

    /* renamed from: e */
    public static Boolean f32577e = null;

    /* renamed from: f */
    public static String f32578f = null;

    /* renamed from: g */
    public static boolean f32579g = false;

    /* renamed from: h */
    public static int f32580h = -1;

    /* renamed from: i */
    public static final ThreadLocal<C18266e> f32581i = new ThreadLocal<>();

    /* renamed from: j */
    public static final C18265d f32582j = new C18265d();

    /* renamed from: k */
    public static final C14455a f32583k = new C14455a();

    /* renamed from: l */
    public static zzq f32584l;

    /* renamed from: m */
    public static zzr f32585m;

    /* renamed from: a */
    public final Context f32586a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, C18267f fVar) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th, C18267f fVar) {
            super(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    public interface C14452a {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a */
        public interface C14453a {
            /* renamed from: a */
            int mo49527a(Context context, String str, boolean z) throws LoadingException;

            /* renamed from: b */
            int mo49528b(Context context, String str);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$b */
        public static class C14454b {
            @KeepForSdk

            /* renamed from: a */
            public int f32587a = 0;
            @KeepForSdk

            /* renamed from: b */
            public int f32588b = 0;
            @KeepForSdk

            /* renamed from: c */
            public int f32589c = 0;
        }

        @KeepForSdk
        /* renamed from: a */
        C14454b mo49526a(Context context, String str, C14453a aVar) throws LoadingException;
    }

    public DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.f32586a = context;
    }

    @KeepForSdk
    /* renamed from: a */
    public static int m22900a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(str.length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".");
            sb.append("ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 51 + str.length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(str.length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    @KeepForSdk
    /* renamed from: c */
    public static DynamiteModule m22901c(Context context, C14452a aVar, String str) throws LoadingException {
        int i;
        Boolean bool;
        DynamiteModule dynamiteModule;
        IObjectWrapper iObjectWrapper;
        zzr zzr;
        Boolean valueOf;
        IObjectWrapper iObjectWrapper2;
        Context context2 = context;
        C14452a aVar2 = aVar;
        String str2 = str;
        Class<DynamiteModule> cls = DynamiteModule.class;
        ThreadLocal<C18266e> threadLocal = f32581i;
        C18266e eVar = threadLocal.get();
        C18266e eVar2 = new C18266e(0);
        threadLocal.set(eVar2);
        C18265d dVar = f32582j;
        long longValue = ((Long) dVar.get()).longValue();
        try {
            dVar.set(Long.valueOf(SystemClock.elapsedRealtime()));
            C14452a.C14454b a = aVar2.mo49526a(context2, str2, f32583k);
            int i2 = a.f32587a;
            int i3 = a.f32588b;
            StringBuilder sb = new StringBuilder(str.length() + 68 + str.length());
            sb.append("Considering local module ");
            sb.append(str2);
            sb.append(MessageDraft.IMAGE_DELIMITER);
            sb.append(i2);
            sb.append(" and remote module ");
            sb.append(str2);
            sb.append(MessageDraft.IMAGE_DELIMITER);
            sb.append(i3);
            Log.i("DynamiteModule", sb.toString());
            int i4 = a.f32589c;
            if (i4 != 0) {
                if (i4 == -1) {
                    if (a.f32587a != 0) {
                        i4 = -1;
                    }
                }
                if (!(i4 == 1 && a.f32588b == 0)) {
                    if (i4 == -1) {
                        DynamiteModule f = m22904f(context2, str2);
                        if (longValue == 0) {
                            dVar.remove();
                        } else {
                            dVar.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = eVar2.f40090a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(eVar);
                        return f;
                    } else if (i4 == 1) {
                        try {
                            int i5 = a.f32588b;
                            try {
                                synchronized (cls) {
                                    bool = f32577e;
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        StringBuilder sb2 = new StringBuilder(str.length() + 51);
                                        sb2.append("Selected remote version of ");
                                        sb2.append(str2);
                                        sb2.append(", version >= ");
                                        sb2.append(i5);
                                        Log.i("DynamiteModule", sb2.toString());
                                        synchronized (cls) {
                                            zzr = f32585m;
                                        }
                                        if (zzr != null) {
                                            C18266e eVar3 = threadLocal.get();
                                            if (eVar3 == null || eVar3.f40090a == null) {
                                                throw new LoadingException("No result cursor", (C18267f) null);
                                            }
                                            Context applicationContext = context.getApplicationContext();
                                            Cursor cursor2 = eVar3.f40090a;
                                            ObjectWrapper.wrap(null);
                                            synchronized (cls) {
                                                valueOf = Boolean.valueOf(f32580h >= 2);
                                            }
                                            if (valueOf.booleanValue()) {
                                                iObjectWrapper2 = zzr.zzf(ObjectWrapper.wrap(applicationContext), str2, i5, ObjectWrapper.wrap(cursor2));
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                iObjectWrapper2 = zzr.zze(ObjectWrapper.wrap(applicationContext), str2, i5, ObjectWrapper.wrap(cursor2));
                                            }
                                            Context context3 = (Context) ObjectWrapper.unwrap(iObjectWrapper2);
                                            if (context3 != null) {
                                                dynamiteModule = new DynamiteModule(context3);
                                            } else {
                                                throw new LoadingException("Failed to get module context", (C18267f) null);
                                            }
                                        } else {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", (C18267f) null);
                                        }
                                    } else {
                                        StringBuilder sb3 = new StringBuilder(str.length() + 51);
                                        sb3.append("Selected remote version of ");
                                        sb3.append(str2);
                                        sb3.append(", version >= ");
                                        sb3.append(i5);
                                        Log.i("DynamiteModule", sb3.toString());
                                        zzq h = m22906h(context);
                                        if (h != null) {
                                            int zze = h.zze();
                                            if (zze >= 3) {
                                                C18266e eVar4 = threadLocal.get();
                                                if (eVar4 != null) {
                                                    iObjectWrapper = h.zzi(ObjectWrapper.wrap(context), str2, i5, ObjectWrapper.wrap(eVar4.f40090a));
                                                } else {
                                                    throw new LoadingException("No cached result cursor holder", (C18267f) null);
                                                }
                                            } else if (zze == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                iObjectWrapper = h.zzj(ObjectWrapper.wrap(context), str2, i5);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                iObjectWrapper = h.zzh(ObjectWrapper.wrap(context), str2, i5);
                                            }
                                            if (ObjectWrapper.unwrap(iObjectWrapper) != null) {
                                                dynamiteModule = new DynamiteModule((Context) ObjectWrapper.unwrap(iObjectWrapper));
                                            } else {
                                                throw new LoadingException("Failed to load remote module.", (C18267f) null);
                                            }
                                        } else {
                                            throw new LoadingException("Failed to create IDynamiteLoader.", (C18267f) null);
                                        }
                                    }
                                    if (longValue == 0) {
                                        dVar.remove();
                                    } else {
                                        dVar.set(Long.valueOf(longValue));
                                    }
                                    Cursor cursor3 = eVar2.f40090a;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    threadLocal.set(eVar);
                                    return dynamiteModule;
                                }
                                throw new LoadingException("Failed to determine which loading route to use.", (C18267f) null);
                            } catch (RemoteException e) {
                                throw new LoadingException("Failed to load remote module.", e, (C18267f) null);
                            } catch (LoadingException e2) {
                                throw e2;
                            } catch (Throwable th) {
                                CrashUtils.addDynamiteErrorToDropBox(context2, th);
                                throw new LoadingException("Failed to load remote module.", th, (C18267f) null);
                            }
                        } catch (LoadingException e3) {
                            String valueOf2 = String.valueOf(e3.getMessage());
                            Log.w("DynamiteModule", valueOf2.length() != 0 ? "Failed to load remote module: ".concat(valueOf2) : new String("Failed to load remote module: "));
                            int i6 = a.f32587a;
                            if (i6 != 0) {
                                if (aVar.mo49526a(context2, str2, new C14459e(i6)).f32589c == -1) {
                                    DynamiteModule f2 = m22904f(context2, str2);
                                    if (i != 0) {
                                        f32582j.set(Long.valueOf(longValue));
                                    }
                                    return f2;
                                }
                            }
                            throw new LoadingException("Remote load failed. No local fallback found.", e3, (C18267f) null);
                        }
                    } else {
                        StringBuilder sb4 = new StringBuilder(47);
                        sb4.append("VersionPolicy returned invalid code:");
                        sb4.append(i4);
                        throw new LoadingException(sb4.toString(), (C18267f) null);
                    }
                }
            }
            int i7 = a.f32587a;
            int i8 = a.f32588b;
            StringBuilder sb5 = new StringBuilder(str.length() + 92);
            sb5.append("No acceptable module ");
            sb5.append(str2);
            sb5.append(" found. Local version is ");
            sb5.append(i7);
            sb5.append(" and remote version is ");
            sb5.append(i8);
            sb5.append(".");
            throw new LoadingException(sb5.toString(), (C18267f) null);
        } finally {
            if (longValue == 0) {
                f32582j.remove();
            } else {
                f32582j.set(Long.valueOf(longValue));
            }
            Cursor cursor4 = eVar2.f40090a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f32581i.set(eVar);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:18:0x003a=Splitter:B:18:0x003a, B:24:0x004a=Splitter:B:24:0x004a, B:43:0x008e=Splitter:B:43:0x008e} */
    /* renamed from: d */
    public static int m22902d(android.content.Context r9, java.lang.String r10, boolean r11) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x01d3 }
            java.lang.Boolean r1 = f32577e     // Catch:{ all -> 0x01d0 }
            r2 = 0
            if (r1 != 0) goto L_0x00d2
            android.content.Context r1 = r9.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00ad, IllegalAccessException -> 0x00ab, NoSuchFieldException -> 0x00a9 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00ad, IllegalAccessException -> 0x00ab, NoSuchFieldException -> 0x00a9 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r3 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r3 = r3.getName()     // Catch:{ ClassNotFoundException -> 0x00ad, IllegalAccessException -> 0x00ab, NoSuchFieldException -> 0x00a9 }
            java.lang.Class r1 = r1.loadClass(r3)     // Catch:{ ClassNotFoundException -> 0x00ad, IllegalAccessException -> 0x00ab, NoSuchFieldException -> 0x00a9 }
            java.lang.String r3 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch:{ ClassNotFoundException -> 0x00ad, IllegalAccessException -> 0x00ab, NoSuchFieldException -> 0x00a9 }
            java.lang.Class r3 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00ad, IllegalAccessException -> 0x00ab, NoSuchFieldException -> 0x00a9 }
            monitor-enter(r3)     // Catch:{ ClassNotFoundException -> 0x00ad, IllegalAccessException -> 0x00ab, NoSuchFieldException -> 0x00a9 }
            java.lang.Object r4 = r1.get(r2)     // Catch:{ all -> 0x00a6 }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x00a6 }
            if (r4 == 0) goto L_0x003d
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a6 }
            if (r4 != r1) goto L_0x0037
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00a6 }
            goto L_0x00a4
        L_0x0037:
            m22905g(r4)     // Catch:{ LoadingException -> 0x003a }
        L_0x003a:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00a6 }
            goto L_0x00a4
        L_0x003d:
            boolean r4 = f32579g     // Catch:{ all -> 0x00a6 }
            if (r4 != 0) goto L_0x009b
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00a6 }
            boolean r5 = r4.equals(r2)     // Catch:{ all -> 0x00a6 }
            if (r5 == 0) goto L_0x004a
            goto L_0x009b
        L_0x004a:
            int r5 = m22903e(r9, r10, r11)     // Catch:{ LoadingException -> 0x0091 }
            java.lang.String r6 = f32578f     // Catch:{ LoadingException -> 0x0091 }
            if (r6 == 0) goto L_0x008e
            boolean r6 = r6.isEmpty()     // Catch:{ LoadingException -> 0x0091 }
            if (r6 == 0) goto L_0x0059
            goto L_0x008e
        L_0x0059:
            java.lang.ClassLoader r6 = p628nj.C18263b.m30875w0()     // Catch:{ LoadingException -> 0x0091 }
            if (r6 == 0) goto L_0x0060
            goto L_0x0083
        L_0x0060:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ LoadingException -> 0x0091 }
            r7 = 29
            if (r6 < r7) goto L_0x0075
            dalvik.system.DelegateLastClassLoader r6 = new dalvik.system.DelegateLastClassLoader     // Catch:{ LoadingException -> 0x0091 }
            java.lang.String r7 = f32578f     // Catch:{ LoadingException -> 0x0091 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)     // Catch:{ LoadingException -> 0x0091 }
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x0091 }
            r6.<init>(r7, r8)     // Catch:{ LoadingException -> 0x0091 }
            goto L_0x0083
        L_0x0075:
            nj.c r6 = new nj.c     // Catch:{ LoadingException -> 0x0091 }
            java.lang.String r7 = f32578f     // Catch:{ LoadingException -> 0x0091 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)     // Catch:{ LoadingException -> 0x0091 }
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x0091 }
            r6.<init>(r8, r7)     // Catch:{ LoadingException -> 0x0091 }
        L_0x0083:
            m22905g(r6)     // Catch:{ LoadingException -> 0x0091 }
            r1.set(r2, r6)     // Catch:{ LoadingException -> 0x0091 }
            f32577e = r4     // Catch:{ LoadingException -> 0x0091 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a6 }
            monitor-exit(r0)     // Catch:{ all -> 0x01d0 }
            return r5
        L_0x008e:
            monitor-exit(r3)     // Catch:{ all -> 0x00a6 }
            monitor-exit(r0)     // Catch:{ all -> 0x01d0 }
            return r5
        L_0x0091:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a6 }
            r1.set(r2, r4)     // Catch:{ all -> 0x00a6 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00a6 }
            goto L_0x00a4
        L_0x009b:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a6 }
            r1.set(r2, r4)     // Catch:{ all -> 0x00a6 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00a6 }
        L_0x00a4:
            monitor-exit(r3)     // Catch:{ all -> 0x00a6 }
            goto L_0x00d0
        L_0x00a6:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00a6 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00ad, IllegalAccessException -> 0x00ab, NoSuchFieldException -> 0x00a9 }
        L_0x00a9:
            r1 = move-exception
            goto L_0x00ae
        L_0x00ab:
            r1 = move-exception
            goto L_0x00ae
        L_0x00ad:
            r1 = move-exception
        L_0x00ae:
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01d0 }
            int r4 = r1.length()     // Catch:{ all -> 0x01d0 }
            int r4 = r4 + 30
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d0 }
            r5.<init>(r4)     // Catch:{ all -> 0x01d0 }
            java.lang.String r4 = "Failed to load module via V2: "
            r5.append(r4)     // Catch:{ all -> 0x01d0 }
            r5.append(r1)     // Catch:{ all -> 0x01d0 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x01d0 }
            android.util.Log.w(r3, r1)     // Catch:{ all -> 0x01d0 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01d0 }
        L_0x00d0:
            f32577e = r1     // Catch:{ all -> 0x01d0 }
        L_0x00d2:
            monitor-exit(r0)     // Catch:{ all -> 0x01d0 }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x01d3 }
            r1 = 0
            if (r0 == 0) goto L_0x0100
            int r9 = m22903e(r9, r10, r11)     // Catch:{ LoadingException -> 0x00df }
            return r9
        L_0x00df:
            r10 = move-exception
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x01d3 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x01d3 }
            int r2 = r10.length()     // Catch:{ all -> 0x01d3 }
            if (r2 == 0) goto L_0x00f7
            java.lang.String r10 = r0.concat(r10)     // Catch:{ all -> 0x01d3 }
            goto L_0x00fc
        L_0x00f7:
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x01d3 }
            r10.<init>(r0)     // Catch:{ all -> 0x01d3 }
        L_0x00fc:
            android.util.Log.w(r11, r10)     // Catch:{ all -> 0x01d3 }
            return r1
        L_0x0100:
            com.google.android.gms.dynamite.zzq r3 = m22906h(r9)     // Catch:{ all -> 0x01d3 }
            if (r3 != 0) goto L_0x0108
            goto L_0x01c7
        L_0x0108:
            int r0 = r3.zze()     // Catch:{ RemoteException -> 0x01a1 }
            r4 = 3
            if (r0 < r4) goto L_0x017c
            java.lang.ThreadLocal<nj.e> r0 = f32581i     // Catch:{ RemoteException -> 0x01a1 }
            java.lang.Object r4 = r0.get()     // Catch:{ RemoteException -> 0x01a1 }
            nj.e r4 = (p628nj.C18266e) r4     // Catch:{ RemoteException -> 0x01a1 }
            if (r4 == 0) goto L_0x0123
            android.database.Cursor r4 = r4.f40090a     // Catch:{ RemoteException -> 0x01a1 }
            if (r4 == 0) goto L_0x0123
            int r1 = r4.getInt(r1)     // Catch:{ RemoteException -> 0x01a1 }
            goto L_0x01c7
        L_0x0123:
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r9)     // Catch:{ RemoteException -> 0x01a1 }
            nj.d r5 = f32582j     // Catch:{ RemoteException -> 0x01a1 }
            java.lang.Object r5 = r5.get()     // Catch:{ RemoteException -> 0x01a1 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ RemoteException -> 0x01a1 }
            long r7 = r5.longValue()     // Catch:{ RemoteException -> 0x01a1 }
            r5 = r10
            r6 = r11
            com.google.android.gms.dynamic.IObjectWrapper r10 = r3.zzk(r4, r5, r6, r7)     // Catch:{ RemoteException -> 0x01a1 }
            java.lang.Object r10 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r10)     // Catch:{ RemoteException -> 0x01a1 }
            android.database.Cursor r10 = (android.database.Cursor) r10     // Catch:{ RemoteException -> 0x01a1 }
            if (r10 == 0) goto L_0x016c
            boolean r11 = r10.moveToFirst()     // Catch:{ RemoteException -> 0x0179, all -> 0x015e }
            if (r11 != 0) goto L_0x0148
            goto L_0x016c
        L_0x0148:
            int r11 = r10.getInt(r1)     // Catch:{ RemoteException -> 0x0179, all -> 0x015e }
            if (r11 <= 0) goto L_0x0164
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x0179, all -> 0x015e }
            nj.e r0 = (p628nj.C18266e) r0     // Catch:{ RemoteException -> 0x0179, all -> 0x015e }
            if (r0 == 0) goto L_0x0161
            android.database.Cursor r3 = r0.f40090a     // Catch:{ RemoteException -> 0x0179, all -> 0x015e }
            if (r3 != 0) goto L_0x0161
            r0.f40090a = r10     // Catch:{ RemoteException -> 0x0179, all -> 0x015e }
            r1 = 1
            goto L_0x0161
        L_0x015e:
            r11 = move-exception
            goto L_0x01ca
        L_0x0161:
            if (r1 == 0) goto L_0x0164
            goto L_0x0165
        L_0x0164:
            r2 = r10
        L_0x0165:
            if (r2 == 0) goto L_0x016a
            r2.close()     // Catch:{ all -> 0x01d3 }
        L_0x016a:
            r1 = r11
            goto L_0x01c7
        L_0x016c:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r0)     // Catch:{ RemoteException -> 0x0179, all -> 0x015e }
            if (r10 == 0) goto L_0x01c7
            r10.close()     // Catch:{ all -> 0x01d3 }
            goto L_0x01c7
        L_0x0179:
            r11 = move-exception
            r2 = r10
            goto L_0x01a3
        L_0x017c:
            r4 = 2
            if (r0 != r4) goto L_0x018f
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r4 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r0, r4)     // Catch:{ RemoteException -> 0x01a1 }
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r9)     // Catch:{ RemoteException -> 0x01a1 }
            int r1 = r3.zzg(r0, r10, r11)     // Catch:{ RemoteException -> 0x01a1 }
            goto L_0x01c7
        L_0x018f:
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r4 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r0, r4)     // Catch:{ RemoteException -> 0x01a1 }
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r9)     // Catch:{ RemoteException -> 0x01a1 }
            int r1 = r3.zzf(r0, r10, r11)     // Catch:{ RemoteException -> 0x01a1 }
            goto L_0x01c7
        L_0x019f:
            r10 = move-exception
            goto L_0x01c8
        L_0x01a1:
            r10 = move-exception
            r11 = r10
        L_0x01a3:
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x019f }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x019f }
            int r3 = r11.length()     // Catch:{ all -> 0x019f }
            if (r3 == 0) goto L_0x01ba
            java.lang.String r11 = r0.concat(r11)     // Catch:{ all -> 0x019f }
            goto L_0x01bf
        L_0x01ba:
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x019f }
            r11.<init>(r0)     // Catch:{ all -> 0x019f }
        L_0x01bf:
            android.util.Log.w(r10, r11)     // Catch:{ all -> 0x019f }
            if (r2 == 0) goto L_0x01c7
            r2.close()     // Catch:{ all -> 0x01d3 }
        L_0x01c7:
            return r1
        L_0x01c8:
            r11 = r10
            r10 = r2
        L_0x01ca:
            if (r10 == 0) goto L_0x01cf
            r10.close()     // Catch:{ all -> 0x01d3 }
        L_0x01cf:
            throw r11     // Catch:{ all -> 0x01d3 }
        L_0x01d0:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01d0 }
            throw r10     // Catch:{ all -> 0x01d3 }
        L_0x01d3:
            r10 = move-exception
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r9, r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m22902d(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d7  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m22903e(android.content.Context r10, java.lang.String r11, boolean r12) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r0 = 0
            nj.d r1 = f32582j     // Catch:{ Exception -> 0x00c2, all -> 0x00c0 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00c2, all -> 0x00c0 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00c2, all -> 0x00c0 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x00c2, all -> 0x00c0 }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x00c2, all -> 0x00c0 }
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L_0x0019
            r10 = r4
        L_0x0019:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00c2, all -> 0x00c0 }
            r12.<init>()     // Catch:{ Exception -> 0x00c2, all -> 0x00c0 }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch:{ Exception -> 0x00c2, all -> 0x00c0 }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch:{ Exception -> 0x00c2, all -> 0x00c0 }
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch:{ Exception -> 0x00c2, all -> 0x00c0 }
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch:{ Exception -> 0x00c2, all -> 0x00c0 }
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00c2, all -> 0x00c0 }
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch:{ Exception -> 0x00c2, all -> 0x00c0 }
            android.net.Uri r4 = r10.build()     // Catch:{ Exception -> 0x00c2, all -> 0x00c0 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00c2, all -> 0x00c0 }
            if (r10 == 0) goto L_0x00b1
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x0096 }
            if (r11 == 0) goto L_0x00b1
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch:{ Exception -> 0x0096 }
            if (r12 <= 0) goto L_0x00a1
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x0096 }
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch:{ all -> 0x009e }
            f32578f = r2     // Catch:{ all -> 0x009e }
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x009e }
            if (r2 < 0) goto L_0x006f
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x009e }
            f32580h = r2     // Catch:{ all -> 0x009e }
        L_0x006f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x009e }
            if (r2 < 0) goto L_0x0083
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x009e }
            if (r2 == 0) goto L_0x007f
            r2 = r9
            goto L_0x0080
        L_0x007f:
            r2 = r11
        L_0x0080:
            f32579g = r2     // Catch:{ all -> 0x009e }
            goto L_0x0084
        L_0x0083:
            r2 = r11
        L_0x0084:
            monitor-exit(r1)     // Catch:{ all -> 0x009e }
            java.lang.ThreadLocal<nj.e> r1 = f32581i     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x0096 }
            nj.e r1 = (p628nj.C18266e) r1     // Catch:{ Exception -> 0x0096 }
            if (r1 == 0) goto L_0x0098
            android.database.Cursor r3 = r1.f40090a     // Catch:{ Exception -> 0x0096 }
            if (r3 != 0) goto L_0x0098
            r1.f40090a = r10     // Catch:{ Exception -> 0x0096 }
            goto L_0x0099
        L_0x0096:
            r11 = move-exception
            goto L_0x00c5
        L_0x0098:
            r9 = r11
        L_0x0099:
            if (r9 == 0) goto L_0x009c
            r10 = r0
        L_0x009c:
            r11 = r2
            goto L_0x00a1
        L_0x009e:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x009e }
            throw r11     // Catch:{ Exception -> 0x0096 }
        L_0x00a1:
            if (r11 != 0) goto L_0x00a9
            if (r10 == 0) goto L_0x00a8
            r10.close()
        L_0x00a8:
            return r12
        L_0x00a9:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x0096 }
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x0096 }
            throw r11     // Catch:{ Exception -> 0x0096 }
        L_0x00b1:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch:{ Exception -> 0x0096 }
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x0096 }
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch:{ Exception -> 0x0096 }
            throw r11     // Catch:{ Exception -> 0x0096 }
        L_0x00c0:
            r10 = move-exception
            goto L_0x00d5
        L_0x00c2:
            r10 = move-exception
            r11 = r10
            r10 = r0
        L_0x00c5:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch:{ all -> 0x00d2 }
            if (r12 == 0) goto L_0x00ca
            throw r11     // Catch:{ all -> 0x00d2 }
        L_0x00ca:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r12 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = "V2 version check failed"
            r12.<init>(r1, r11, r0)     // Catch:{ all -> 0x00d2 }
            throw r12     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            r11 = move-exception
            r0 = r10
            r10 = r11
        L_0x00d5:
            if (r0 == 0) goto L_0x00da
            r0.close()
        L_0x00da:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m22903e(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: f */
    public static DynamiteModule m22904f(Context context, String str) {
        Log.i("DynamiteModule", str.length() != 0 ? "Selected local version of ".concat(str) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    /* renamed from: g */
    public static void m22905g(ClassLoader classLoader) throws LoadingException {
        zzr zzr;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzr = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzr = queryLocalInterface instanceof zzr ? (zzr) queryLocalInterface : new zzr(iBinder);
            }
            f32585m = zzr;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, (C18267f) null);
        }
    }

    /* renamed from: h */
    public static zzq m22906h(Context context) {
        zzq zzq;
        synchronized (DynamiteModule.class) {
            zzq zzq2 = f32584l;
            if (zzq2 != null) {
                return zzq2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzq = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzq = queryLocalInterface instanceof zzq ? (zzq) queryLocalInterface : new zzq(iBinder);
                }
                if (zzq != null) {
                    f32584l = zzq;
                    return zzq;
                }
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
        }
        return null;
    }

    @KeepForSdk
    /* renamed from: b */
    public final IBinder mo49525b(String str) throws LoadingException {
        try {
            return (IBinder) this.f32586a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException(str.length() != 0 ? "Failed to instantiate module class: ".concat(str) : new String("Failed to instantiate module class: "), e, (C18267f) null);
        }
    }
}
