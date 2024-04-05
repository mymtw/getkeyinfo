package p665rl;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.play.core.internal.zzbt;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p673sl.C18525e;

/* renamed from: rl.a */
public final class C18483a {

    /* renamed from: e */
    public static final AtomicReference f40713e = new AtomicReference((Object) null);

    /* renamed from: a */
    public final C18487e f40714a;

    /* renamed from: b */
    public final C18525e f40715b;

    /* renamed from: c */
    public final HashSet f40716c = new HashSet();

    /* renamed from: d */
    public final C18484b f40717d;

    public C18483a(Context context) {
        try {
            this.f40714a = new C18487e(context);
            this.f40717d = new C18484b();
            this.f40715b = new C18525e(context);
        } catch (PackageManager.NameNotFoundException e) {
            throw new zzbt("Failed to initialize FileStorage", e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0041 A[LOOP:1: B:10:0x0041->B:13:0x004c, LOOP_START] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m31187c(android.content.Context r9, boolean r10) {
        /*
            java.util.concurrent.atomic.AtomicReference r0 = f40713e
            rl.a r1 = new rl.a
            r1.<init>(r9)
        L_0x0007:
            r2 = 0
            boolean r3 = r0.compareAndSet(r2, r1)
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0012
            r0 = r5
            goto L_0x0019
        L_0x0012:
            java.lang.Object r3 = r0.get()
            if (r3 == 0) goto L_0x0007
            r0 = r4
        L_0x0019:
            java.util.concurrent.atomic.AtomicReference r1 = f40713e
            java.lang.Object r1 = r1.get()
            rl.a r1 = (p665rl.C18483a) r1
            if (r0 == 0) goto L_0x005a
            com.google.android.play.core.splitinstall.zzo r0 = com.google.android.play.core.splitinstall.zzo.INSTANCE
            com.google.android.play.core.internal.k r3 = new com.google.android.play.core.internal.k
            java.util.concurrent.ThreadPoolExecutor r6 = androidx.compose.foundation.layout.C0761x.m1720f1()
            com.google.android.play.core.internal.m r7 = new com.google.android.play.core.internal.m
            rl.e r8 = r1.f40714a
            r7.<init>(r9, r8)
            rl.e r8 = r1.f40714a
            r3.<init>(r9, r6, r7, r8)
            r0.zzb(r3)
            r8.a r0 = new r8.a
            r0.<init>((java.lang.Object) r1)
            java.util.concurrent.atomic.AtomicReference r3 = p673sl.C18529i.f40791a
        L_0x0041:
            boolean r6 = r3.compareAndSet(r2, r0)
            if (r6 == 0) goto L_0x0048
            goto L_0x004e
        L_0x0048:
            java.lang.Object r6 = r3.get()
            if (r6 == 0) goto L_0x0041
        L_0x004e:
            java.util.concurrent.ThreadPoolExecutor r0 = androidx.compose.foundation.layout.C0761x.m1720f1()
            com.google.android.gms.measurement.internal.p6 r2 = new com.google.android.gms.measurement.internal.p6
            r2.<init>(r9, r5)
            r0.execute(r2)
        L_0x005a:
            r1.mo69992b(r9, r10)     // Catch:{ Exception -> 0x005e }
            return r5
        L_0x005e:
            r9 = move-exception
            java.lang.String r10 = "SplitCompat"
            java.lang.String r0 = "Error installing additional splits"
            android.util.Log.e(r10, r0, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p665rl.C18483a.m31187c(android.content.Context, boolean):boolean");
    }

    /* renamed from: a */
    public final void mo69991a(Set set) throws IOException {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C18487e eVar = this.f40714a;
            eVar.getClass();
            File file = new File(eVar.mo70002g(), "verified-splits");
            C18487e.m31195e(file);
            C18487e.m31193c(C18487e.m31194d(file, String.valueOf((String) it.next()).concat(".apk")));
        }
        C18525e eVar2 = this.f40715b;
        eVar2.getClass();
        synchronized (C18525e.class) {
            eVar2.f40790a.getSharedPreferences("playcore_split_install_internal", 0).edit().putStringSet("modules_to_uninstall_if_emulated", new HashSet()).apply();
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x0221 */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x021e A[SYNTHETIC, Splitter:B:109:0x021e] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x00a0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x00d0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c8 A[Catch:{ NameNotFoundException -> 0x02c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f4 A[Catch:{ NameNotFoundException -> 0x02c1 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo69992b(android.content.Context r12, boolean r13) throws java.io.IOException {
        /*
            r11 = this;
            monitor-enter(r11)
            if (r13 == 0) goto L_0x0009
            rl.e r0 = r11.f40714a     // Catch:{ all -> 0x02d2 }
            r0.mo70000b()     // Catch:{ all -> 0x02d2 }
            goto L_0x0015
        L_0x0009:
            java.util.concurrent.ThreadPoolExecutor r0 = androidx.compose.foundation.layout.C0761x.m1720f1()     // Catch:{ all -> 0x02d2 }
            rl.n r1 = new rl.n     // Catch:{ all -> 0x02d2 }
            r1.<init>(r11)     // Catch:{ all -> 0x02d2 }
            r0.execute(r1)     // Catch:{ all -> 0x02d2 }
        L_0x0015:
            java.lang.String r0 = r12.getPackageName()     // Catch:{ all -> 0x02d2 }
            r1 = 1
            r2 = 0
            android.content.pm.PackageManager r3 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x02c1 }
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x02c1 }
            java.lang.String[] r3 = r3.splitNames     // Catch:{ NameNotFoundException -> 0x02c1 }
            if (r3 != 0) goto L_0x002d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x02c1 }
            r3.<init>()     // Catch:{ NameNotFoundException -> 0x02c1 }
            goto L_0x0031
        L_0x002d:
            java.util.List r3 = java.util.Arrays.asList(r3)     // Catch:{ NameNotFoundException -> 0x02c1 }
        L_0x0031:
            rl.e r0 = r11.f40714a     // Catch:{ all -> 0x02d2 }
            java.util.HashSet r0 = r0.mo69999a()     // Catch:{ all -> 0x02d2 }
            sl.e r4 = r11.f40715b     // Catch:{ all -> 0x02d2 }
            java.util.Set r4 = r4.mo70046a()     // Catch:{ all -> 0x02d2 }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x02d2 }
            r5.<init>()     // Catch:{ all -> 0x02d2 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x02d2 }
        L_0x0046:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x02d2 }
            r8 = 2
            if (r7 == 0) goto L_0x007f
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x02d2 }
            rl.o r7 = (p665rl.C18497o) r7     // Catch:{ all -> 0x02d2 }
            java.lang.String r7 = r7.mo69994b()     // Catch:{ all -> 0x02d2 }
            boolean r9 = r3.contains(r7)     // Catch:{ all -> 0x02d2 }
            if (r9 != 0) goto L_0x0078
            int r9 = p673sl.C18530j.f40792a     // Catch:{ all -> 0x02d2 }
            java.lang.String r9 = "config."
            boolean r9 = r7.startsWith(r9)     // Catch:{ all -> 0x02d2 }
            if (r9 == 0) goto L_0x006a
            java.lang.String r8 = ""
            goto L_0x0072
        L_0x006a:
            java.lang.String r9 = "\\.config\\."
            java.lang.String[] r8 = r7.split(r9, r8)     // Catch:{ all -> 0x02d2 }
            r8 = r8[r2]     // Catch:{ all -> 0x02d2 }
        L_0x0072:
            boolean r8 = r4.contains(r8)     // Catch:{ all -> 0x02d2 }
            if (r8 == 0) goto L_0x0046
        L_0x0078:
            r5.add(r7)     // Catch:{ all -> 0x02d2 }
            r6.remove()     // Catch:{ all -> 0x02d2 }
            goto L_0x0046
        L_0x007f:
            if (r13 == 0) goto L_0x0085
            r11.mo69991a(r5)     // Catch:{ all -> 0x02d2 }
            goto L_0x0097
        L_0x0085:
            boolean r4 = r5.isEmpty()     // Catch:{ all -> 0x02d2 }
            if (r4 != 0) goto L_0x0097
            java.util.concurrent.ThreadPoolExecutor r4 = androidx.compose.foundation.layout.C0761x.m1720f1()     // Catch:{ all -> 0x02d2 }
            com.google.android.gms.measurement.internal.t3 r6 = new com.google.android.gms.measurement.internal.t3     // Catch:{ all -> 0x02d2 }
            r6.<init>((int) r8, (java.lang.Object) r11, (java.lang.Object) r5)     // Catch:{ all -> 0x02d2 }
            r4.execute(r6)     // Catch:{ all -> 0x02d2 }
        L_0x0097:
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x02d2 }
            r4.<init>()     // Catch:{ all -> 0x02d2 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x02d2 }
        L_0x00a0:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x02d2 }
            if (r6 == 0) goto L_0x00cc
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x02d2 }
            rl.o r6 = (p665rl.C18497o) r6     // Catch:{ all -> 0x02d2 }
            java.lang.String r6 = r6.mo69994b()     // Catch:{ all -> 0x02d2 }
            int r7 = p673sl.C18530j.f40792a     // Catch:{ all -> 0x02d2 }
            java.lang.String r7 = "config."
            boolean r7 = r6.startsWith(r7)     // Catch:{ all -> 0x02d2 }
            if (r7 != 0) goto L_0x00c5
            java.lang.String r7 = ".config."
            boolean r7 = r6.contains(r7)     // Catch:{ all -> 0x02d2 }
            if (r7 == 0) goto L_0x00c3
            goto L_0x00c5
        L_0x00c3:
            r7 = r2
            goto L_0x00c6
        L_0x00c5:
            r7 = r1
        L_0x00c6:
            if (r7 != 0) goto L_0x00a0
            r4.add(r6)     // Catch:{ all -> 0x02d2 }
            goto L_0x00a0
        L_0x00cc:
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x02d2 }
        L_0x00d0:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x02d2 }
            if (r5 == 0) goto L_0x00f8
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x02d2 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x02d2 }
            int r6 = p673sl.C18530j.f40792a     // Catch:{ all -> 0x02d2 }
            java.lang.String r6 = "config."
            boolean r6 = r5.startsWith(r6)     // Catch:{ all -> 0x02d2 }
            if (r6 != 0) goto L_0x00f1
            java.lang.String r6 = ".config."
            boolean r6 = r5.contains(r6)     // Catch:{ all -> 0x02d2 }
            if (r6 == 0) goto L_0x00ef
            goto L_0x00f1
        L_0x00ef:
            r6 = r2
            goto L_0x00f2
        L_0x00f1:
            r6 = r1
        L_0x00f2:
            if (r6 != 0) goto L_0x00d0
            r4.add(r5)     // Catch:{ all -> 0x02d2 }
            goto L_0x00d0
        L_0x00f8:
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x02d2 }
            int r5 = r0.size()     // Catch:{ all -> 0x02d2 }
            r3.<init>(r5)     // Catch:{ all -> 0x02d2 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x02d2 }
        L_0x0105:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x02d2 }
            if (r5 == 0) goto L_0x0140
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x02d2 }
            rl.o r5 = (p665rl.C18497o) r5     // Catch:{ all -> 0x02d2 }
            java.lang.String r6 = r5.mo69994b()     // Catch:{ all -> 0x02d2 }
            int r7 = p673sl.C18530j.f40792a     // Catch:{ all -> 0x02d2 }
            java.lang.String r7 = "config."
            boolean r6 = r6.startsWith(r7)     // Catch:{ all -> 0x02d2 }
            if (r6 != 0) goto L_0x013c
            java.lang.String r6 = r5.mo69994b()     // Catch:{ all -> 0x02d2 }
            java.lang.String r7 = "config."
            boolean r7 = r6.startsWith(r7)     // Catch:{ all -> 0x02d2 }
            if (r7 == 0) goto L_0x012e
            java.lang.String r6 = ""
            goto L_0x0136
        L_0x012e:
            java.lang.String r7 = "\\.config\\."
            java.lang.String[] r6 = r6.split(r7, r8)     // Catch:{ all -> 0x02d2 }
            r6 = r6[r2]     // Catch:{ all -> 0x02d2 }
        L_0x0136:
            boolean r6 = r4.contains(r6)     // Catch:{ all -> 0x02d2 }
            if (r6 == 0) goto L_0x0105
        L_0x013c:
            r3.add(r5)     // Catch:{ all -> 0x02d2 }
            goto L_0x0105
        L_0x0140:
            rl.m r0 = new rl.m     // Catch:{ all -> 0x02d2 }
            rl.e r2 = r11.f40714a     // Catch:{ all -> 0x02d2 }
            r0.<init>(r2)     // Catch:{ all -> 0x02d2 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x02d2 }
            r4 = 26
            if (r2 == r4) goto L_0x0162
            r4 = 27
            if (r2 == r4) goto L_0x0152
            goto L_0x015c
        L_0x0152:
            int r2 = android.os.Build.VERSION.PREVIEW_SDK_INT     // Catch:{ all -> 0x02d2 }
            if (r2 != 0) goto L_0x015c
            com.google.android.gms.measurement.internal.x r2 = new com.google.android.gms.measurement.internal.x     // Catch:{ all -> 0x02d2 }
            r2.<init>()     // Catch:{ all -> 0x02d2 }
            goto L_0x0167
        L_0x015c:
            tq.a r2 = new tq.a     // Catch:{ all -> 0x02d2 }
            r2.<init>()     // Catch:{ all -> 0x02d2 }
            goto L_0x0167
        L_0x0162:
            kotlinx.coroutines.e0 r2 = new kotlinx.coroutines.e0     // Catch:{ all -> 0x02d2 }
            r2.<init>()     // Catch:{ all -> 0x02d2 }
        L_0x0167:
            java.lang.ClassLoader r4 = r12.getClassLoader()     // Catch:{ all -> 0x02d2 }
            r5 = 0
            if (r13 == 0) goto L_0x0176
            java.util.HashSet r0 = r0.mo70005a()     // Catch:{ all -> 0x02d2 }
            r2.mo4159e(r4, r0)     // Catch:{ all -> 0x02d2 }
            goto L_0x01aa
        L_0x0176:
            java.util.Iterator r6 = r3.iterator()     // Catch:{ all -> 0x02d2 }
        L_0x017a:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x02d2 }
            if (r7 == 0) goto L_0x01aa
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x02d2 }
            rl.o r7 = (p665rl.C18497o) r7     // Catch:{ all -> 0x02d2 }
            java.util.concurrent.atomic.AtomicBoolean r8 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x02d2 }
            r8.<init>(r1)     // Catch:{ all -> 0x02d2 }
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x02d2 }
            r9.<init>()     // Catch:{ all -> 0x02d2 }
            rl.g r10 = new rl.g     // Catch:{ all -> 0x02d2 }
            r10.<init>(r0, r7, r9, r8)     // Catch:{ all -> 0x02d2 }
            p665rl.C18495m.m31206b(r7, r10)     // Catch:{ all -> 0x02d2 }
            boolean r7 = r8.get()     // Catch:{ all -> 0x02d2 }
            if (r7 == 0) goto L_0x019f
            goto L_0x01a0
        L_0x019f:
            r9 = r5
        L_0x01a0:
            if (r9 != 0) goto L_0x01a6
            r6.remove()     // Catch:{ all -> 0x02d2 }
            goto L_0x017a
        L_0x01a6:
            r2.mo4159e(r4, r9)     // Catch:{ all -> 0x02d2 }
            goto L_0x017a
        L_0x01aa:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x02d2 }
            r0.<init>()     // Catch:{ all -> 0x02d2 }
            java.util.Iterator r1 = r3.iterator()     // Catch:{ all -> 0x02d2 }
        L_0x01b3:
            boolean r6 = r1.hasNext()     // Catch:{ all -> 0x02d2 }
            if (r6 == 0) goto L_0x0222
            java.lang.Object r6 = r1.next()     // Catch:{ all -> 0x02d2 }
            rl.o r6 = (p665rl.C18497o) r6     // Catch:{ all -> 0x02d2 }
            java.util.zip.ZipFile r7 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x021b }
            java.io.File r8 = r6.mo69993a()     // Catch:{ IOException -> 0x021b }
            r7.<init>(r8)     // Catch:{ IOException -> 0x021b }
            java.lang.String r8 = "classes.dex"
            java.util.zip.ZipEntry r8 = r7.getEntry(r8)     // Catch:{ IOException -> 0x0218 }
            r7.close()     // Catch:{ IOException -> 0x0218 }
            if (r8 == 0) goto L_0x0210
            rl.e r7 = r11.f40714a     // Catch:{ all -> 0x02d2 }
            java.lang.String r8 = r6.mo69994b()     // Catch:{ all -> 0x02d2 }
            r7.getClass()     // Catch:{ all -> 0x02d2 }
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x02d2 }
            java.io.File r7 = r7.mo70002g()     // Catch:{ all -> 0x02d2 }
            java.lang.String r10 = "dex"
            r9.<init>(r7, r10)     // Catch:{ all -> 0x02d2 }
            p665rl.C18487e.m31195e(r9)     // Catch:{ all -> 0x02d2 }
            java.io.File r7 = p665rl.C18487e.m31194d(r9, r8)     // Catch:{ all -> 0x02d2 }
            p665rl.C18487e.m31195e(r7)     // Catch:{ all -> 0x02d2 }
            java.io.File r8 = r6.mo69993a()     // Catch:{ all -> 0x02d2 }
            boolean r7 = r2.mo4158d(r4, r7, r8, r13)     // Catch:{ all -> 0x02d2 }
            if (r7 == 0) goto L_0x01fc
            goto L_0x0210
        L_0x01fc:
            java.lang.String r7 = "SplitCompat"
            java.lang.String r8 = "split was not installed "
            java.io.File r6 = r6.mo69993a()     // Catch:{ all -> 0x02d2 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x02d2 }
            java.lang.String r6 = r8.concat(r6)     // Catch:{ all -> 0x02d2 }
            android.util.Log.w(r7, r6)     // Catch:{ all -> 0x02d2 }
            goto L_0x01b3
        L_0x0210:
            java.io.File r6 = r6.mo69993a()     // Catch:{ all -> 0x02d2 }
            r0.add(r6)     // Catch:{ all -> 0x02d2 }
            goto L_0x01b3
        L_0x0218:
            r12 = move-exception
            r5 = r7
            goto L_0x021c
        L_0x021b:
            r12 = move-exception
        L_0x021c:
            if (r5 == 0) goto L_0x0221
            r5.close()     // Catch:{ IOException -> 0x0221 }
        L_0x0221:
            throw r12     // Catch:{ all -> 0x02d2 }
        L_0x0222:
            rl.b r13 = r11.f40717d     // Catch:{ all -> 0x02d2 }
            monitor-enter(r13)     // Catch:{ all -> 0x02d2 }
            android.content.res.AssetManager r12 = r12.getAssets()     // Catch:{ all -> 0x02be }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x02be }
        L_0x022d:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x02be }
            if (r2 == 0) goto L_0x023d
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x02be }
            java.io.File r2 = (java.io.File) r2     // Catch:{ all -> 0x02be }
            p665rl.C18484b.m31190a(r12, r2)     // Catch:{ all -> 0x02be }
            goto L_0x022d
        L_0x023d:
            monitor-exit(r13)     // Catch:{ all -> 0x02d2 }
            java.util.HashSet r12 = new java.util.HashSet     // Catch:{ all -> 0x02d2 }
            r12.<init>()     // Catch:{ all -> 0x02d2 }
            java.util.Iterator r13 = r3.iterator()     // Catch:{ all -> 0x02d2 }
        L_0x0247:
            boolean r1 = r13.hasNext()     // Catch:{ all -> 0x02d2 }
            if (r1 == 0) goto L_0x02b0
            java.lang.Object r1 = r13.next()     // Catch:{ all -> 0x02d2 }
            rl.o r1 = (p665rl.C18497o) r1     // Catch:{ all -> 0x02d2 }
            java.io.File r2 = r1.mo69993a()     // Catch:{ all -> 0x02d2 }
            boolean r2 = r0.contains(r2)     // Catch:{ all -> 0x02d2 }
            if (r2 == 0) goto L_0x028a
            java.lang.String r2 = r1.mo69994b()     // Catch:{ all -> 0x02d2 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02d2 }
            int r4 = r2.length()     // Catch:{ all -> 0x02d2 }
            int r4 = r4 + 30
            r3.<init>(r4)     // Catch:{ all -> 0x02d2 }
            java.lang.String r4 = "Split '"
            r3.append(r4)     // Catch:{ all -> 0x02d2 }
            r3.append(r2)     // Catch:{ all -> 0x02d2 }
            java.lang.String r2 = "' installation emulated"
            r3.append(r2)     // Catch:{ all -> 0x02d2 }
            java.lang.String r2 = "SplitCompat"
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x02d2 }
            android.util.Log.d(r2, r3)     // Catch:{ all -> 0x02d2 }
            java.lang.String r1 = r1.mo69994b()     // Catch:{ all -> 0x02d2 }
            r12.add(r1)     // Catch:{ all -> 0x02d2 }
            goto L_0x0247
        L_0x028a:
            java.lang.String r1 = r1.mo69994b()     // Catch:{ all -> 0x02d2 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x02d2 }
            int r3 = r1.length()     // Catch:{ all -> 0x02d2 }
            int r3 = r3 + 35
            r2.<init>(r3)     // Catch:{ all -> 0x02d2 }
            java.lang.String r3 = "Split '"
            r2.append(r3)     // Catch:{ all -> 0x02d2 }
            r2.append(r1)     // Catch:{ all -> 0x02d2 }
            java.lang.String r1 = "' installation not emulated."
            r2.append(r1)     // Catch:{ all -> 0x02d2 }
            java.lang.String r1 = "SplitCompat"
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x02d2 }
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x02d2 }
            goto L_0x0247
        L_0x02b0:
            java.util.HashSet r13 = r11.f40716c     // Catch:{ all -> 0x02d2 }
            monitor-enter(r13)     // Catch:{ all -> 0x02d2 }
            java.util.HashSet r0 = r11.f40716c     // Catch:{ all -> 0x02bb }
            r0.addAll(r12)     // Catch:{ all -> 0x02bb }
            monitor-exit(r13)     // Catch:{ all -> 0x02bb }
            monitor-exit(r11)
            return
        L_0x02bb:
            r12 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x02bb }
            throw r12     // Catch:{ all -> 0x02d2 }
        L_0x02be:
            r12 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x02d2 }
            throw r12     // Catch:{ all -> 0x02d2 }
        L_0x02c1:
            r12 = move-exception
            java.io.IOException r13 = new java.io.IOException     // Catch:{ all -> 0x02d2 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x02d2 }
            r1[r2] = r0     // Catch:{ all -> 0x02d2 }
            java.lang.String r0 = "Cannot load data for application '%s'"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x02d2 }
            r13.<init>(r0, r12)     // Catch:{ all -> 0x02d2 }
            throw r13     // Catch:{ all -> 0x02d2 }
        L_0x02d2:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p665rl.C18483a.mo69992b(android.content.Context, boolean):void");
    }
}
