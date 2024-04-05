package com.bugsnag.android;

import com.bugsnag.android.C5780k2;
import com.bugsnag.android.internal.C5763c;
import com.bugsnag.android.internal.C5771f;
import com.bugsnag.android.ndk.NativeBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;

public final class NdkPlugin implements C5719a2 {
    /* access modifiers changed from: private */
    public static final C5709a Companion = new C5709a();
    @Deprecated
    private static final String LOAD_ERR_MSG = "Native library could not be linked. Bugsnag will not report NDK errors. See https://docs.bugsnag.com/platforms/android/ndk-link-errors";
    private C5917u client;
    private final C5812n1 libraryLoader = new C5812n1();
    private NativeBridge nativeBridge;
    private final AtomicBoolean oneTimeSetupPerformed = new AtomicBoolean(false);

    /* renamed from: com.bugsnag.android.NdkPlugin$a */
    public static final class C5709a {
    }

    /* renamed from: com.bugsnag.android.NdkPlugin$b */
    public static final class C5710b implements C5934x1 {

        /* renamed from: a */
        public static final C5710b f12121a = new C5710b();

        /* renamed from: a */
        public final void mo16417a(C5908s0 s0Var) {
            C19383o.m32798h(s0Var, "it");
            C5819p0 p0Var = s0Var.f12603b.f12658m.get(0);
            C19383o.m32793c(p0Var, "error");
            p0Var.mo16610a("NdkLinkError");
            C5709a unused = NdkPlugin.Companion;
            p0Var.f12445b.f12457d = NdkPlugin.LOAD_ERR_MSG;
        }
    }

    private final native void disableCrashReporting();

    private final native void enableCrashReporting();

    private final native String getBinaryArch();

    private final NativeBridge initNativeBridge(C5917u uVar) {
        boolean z;
        Set<Map.Entry> entrySet;
        NativeBridge nativeBridge2 = new NativeBridge();
        uVar.f12623b.addObserver(nativeBridge2);
        uVar.f12631j.addObserver(nativeBridge2);
        uVar.f12634m.addObserver(nativeBridge2);
        uVar.f12639r.addObserver(nativeBridge2);
        uVar.f12627f.addObserver(nativeBridge2);
        uVar.f12625d.addObserver(nativeBridge2);
        uVar.f12638q.addObserver(nativeBridge2);
        uVar.f12644w.addObserver(nativeBridge2);
        uVar.f12632k.addObserver(nativeBridge2);
        uVar.f12624c.addObserver(nativeBridge2);
        int i = 0;
        try {
            z = ((Boolean) uVar.f12645x.mo16513b(TaskType.IO, new C5911t(uVar)).get()).booleanValue();
        } catch (Throwable unused) {
            z = false;
        }
        if (!z) {
            uVar.f12636o.mo16608h("Failed to setup NDK directory.");
        } else {
            String absolutePath = uVar.f12643v.f12367a.getAbsolutePath();
            C5758i1 i1Var = uVar.f12642u;
            if (i1Var != null) {
                i = i1Var.f12294a;
            }
            int i2 = i;
            C5921v vVar = uVar.f12639r;
            C5763c cVar = uVar.f12622a;
            vVar.getClass();
            C19383o.m32798h(cVar, "conf");
            C19383o.m32798h(absolutePath, "lastRunInfoPath");
            if (!vVar.getObservers$bugsnag_android_core_release().isEmpty()) {
                C5780k2.C5788h hVar = new C5780k2.C5788h(cVar.f12311a, cVar.f12313c.f12463b, absolutePath, i2, cVar.f12315e);
                for (C5771f onStateChange : vVar.getObservers$bugsnag_android_core_release()) {
                    onStateChange.onStateChange(hVar);
                }
            }
            C5909s1 s1Var = uVar.f12623b;
            for (String next : s1Var.f12604b.f12468c.keySet()) {
                C5829r1 r1Var = s1Var.f12604b;
                r1Var.getClass();
                C19383o.m32798h(next, "section");
                Map map = r1Var.f12468c.get(next);
                if (!(map == null || (entrySet = map.entrySet()) == null)) {
                    for (Map.Entry entry : entrySet) {
                        s1Var.mo16671b(entry.getValue(), next, (String) entry.getKey());
                    }
                }
            }
            uVar.f12625d.mo16478a();
            uVar.f12627f.mo16691a();
            uVar.f12632k.mo16612a();
            C5718a1 a1Var = uVar.f12624c;
            C5722b1 b1Var = a1Var.f12147b;
            Set<Map.Entry<String, String>> entrySet2 = b1Var.f12158c.entrySet();
            ArrayList arrayList = new ArrayList(C19322o.m32624F0(entrySet2));
            for (Map.Entry entry2 : entrySet2) {
                String str = (String) entry2.getKey();
                String str2 = (String) entry2.getValue();
                if (C19383o.m32792b(str2, b1Var.f12157b)) {
                    str2 = null;
                }
                arrayList.add(new C5939z0(str, str2));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C5939z0 z0Var = (C5939z0) it.next();
                String str3 = z0Var.f12718b;
                String str4 = z0Var.f12719c;
                if (!a1Var.getObservers$bugsnag_android_core_release().isEmpty()) {
                    C19383o.m32793c(str3, "name");
                    C5780k2.C5782b bVar = new C5780k2.C5782b(str3, str4);
                    for (C5771f onStateChange2 : a1Var.getObservers$bugsnag_android_core_release()) {
                        onStateChange2.onStateChange(bVar);
                    }
                }
            }
            C5921v vVar2 = uVar.f12639r;
            if (!vVar2.getObservers$bugsnag_android_core_release().isEmpty()) {
                C5780k2.C5787g gVar = C5780k2.C5787g.f12387a;
                for (C5771f onStateChange3 : vVar2.getObservers$bugsnag_android_core_release()) {
                    onStateChange3.onStateChange(gVar);
                }
            }
        }
        return nativeBridge2;
    }

    private final void performOneTimeSetup(C5917u uVar) {
        C5812n1 n1Var = this.libraryLoader;
        C5710b bVar = C5710b.f12121a;
        n1Var.getClass();
        try {
            uVar.f12645x.mo16512a(TaskType.IO, new C5808m1(n1Var, "bugsnag-ndk", uVar, bVar)).get();
        } catch (Throwable unused) {
        }
        if (this.libraryLoader.f12432b) {
            String binaryArch = getBinaryArch();
            C5729d dVar = uVar.f12630i;
            dVar.getClass();
            C19383o.m32798h(binaryArch, "binaryArch");
            dVar.f12199c = binaryArch;
            this.nativeBridge = initNativeBridge(uVar);
            return;
        }
        uVar.f12636o.mo16605e(LOAD_ERR_MSG);
    }

    public final long getSignalUnwindStackFunction() {
        NativeBridge nativeBridge2 = this.nativeBridge;
        if (nativeBridge2 != null) {
            return nativeBridge2.getSignalUnwindStackFunction();
        }
        return 0;
    }

    public void load(C5917u uVar) {
        C19383o.m32798h(uVar, "client");
        this.client = uVar;
        if (!this.oneTimeSetupPerformed.getAndSet(true)) {
            performOneTimeSetup(uVar);
        }
        if (this.libraryLoader.f12432b) {
            enableCrashReporting();
            uVar.f12636o.mo16606f("Initialised NDK Plugin");
        }
    }

    public void unload() {
        C5917u uVar;
        if (this.libraryLoader.f12432b) {
            disableCrashReporting();
            NativeBridge nativeBridge2 = this.nativeBridge;
            if (nativeBridge2 != null && (uVar = this.client) != null) {
                uVar.f12623b.removeObserver(nativeBridge2);
                uVar.f12631j.removeObserver(nativeBridge2);
                uVar.f12634m.removeObserver(nativeBridge2);
                uVar.f12639r.removeObserver(nativeBridge2);
                uVar.f12627f.removeObserver(nativeBridge2);
                uVar.f12625d.removeObserver(nativeBridge2);
                uVar.f12638q.removeObserver(nativeBridge2);
                uVar.f12644w.removeObserver(nativeBridge2);
                uVar.f12632k.removeObserver(nativeBridge2);
                uVar.f12624c.removeObserver(nativeBridge2);
            }
        }
    }
}
