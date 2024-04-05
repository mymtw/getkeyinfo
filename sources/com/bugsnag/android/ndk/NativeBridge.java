package com.bugsnag.android.ndk;

import android.os.Build;
import com.bugsnag.android.C5780k2;
import com.bugsnag.android.C5816o1;
import com.bugsnag.android.NativeInterface;
import com.bugsnag.android.internal.C5771f;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19446a;
import kotlin.text.C19459m;

public final class NativeBridge implements C5771f {
    private final AtomicBoolean installed = new AtomicBoolean(false);
    private final ReentrantLock lock = new ReentrantLock();
    private final C5816o1 logger;
    private final String reportDirectory;

    public NativeBridge() {
        String nativeReportPath = NativeInterface.getNativeReportPath();
        C19383o.m32793c(nativeReportPath, "NativeInterface.getNativeReportPath()");
        this.reportDirectory = nativeReportPath;
        C5816o1 logger2 = NativeInterface.getLogger();
        C19383o.m32793c(logger2, "NativeInterface.getLogger()");
        this.logger = logger2;
    }

    private final void deliverPendingReports() {
        this.lock.lock();
        try {
            File file = new File(this.reportDirectory);
            if (file.exists()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        C19383o.m32793c(file2, ResponseConstants.FILE);
                        String absolutePath = file2.getAbsolutePath();
                        C19383o.m32793c(absolutePath, "file.absolutePath");
                        deliverReportAtPath(absolutePath);
                    }
                }
            } else {
                this.logger.mo16608h("Payload directory does not exist, cannot read pending reports");
            }
        } catch (Exception e) {
            this.logger.mo16608h("Failed to parse/write pending reports: " + e);
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
        this.lock.unlock();
    }

    private final void handleAddMetadata(C5780k2.C5783c cVar) {
        String str = cVar.f12382b;
        if (str != null) {
            Object obj = cVar.f12383c;
            if (obj instanceof String) {
                String str2 = cVar.f12381a;
                if (str != null) {
                    addMetadataString(str2, str, makeSafe((String) obj));
                } else {
                    C19383o.m32803m();
                    throw null;
                }
            } else if (obj instanceof Boolean) {
                String str3 = cVar.f12381a;
                if (str != null) {
                    addMetadataBoolean(str3, str, ((Boolean) obj).booleanValue());
                } else {
                    C19383o.m32803m();
                    throw null;
                }
            } else if (obj instanceof Number) {
                String str4 = cVar.f12381a;
                if (str != null) {
                    addMetadataDouble(str4, str, ((Number) obj).doubleValue());
                } else {
                    C19383o.m32803m();
                    throw null;
                }
            }
        }
    }

    private final void handleInstallMessage(C5780k2.C5788h hVar) {
        this.lock.lock();
        try {
            if (this.installed.get()) {
                C5816o1 o1Var = this.logger;
                o1Var.mo16608h("Received duplicate setup message with arg: " + hVar);
            } else {
                String str = this.reportDirectory;
                String absolutePath = new File(str, UUID.randomUUID() + ".crash").getAbsolutePath();
                String makeSafe = makeSafe(hVar.f12388a);
                C19383o.m32793c(absolutePath, "reportPath");
                install(makeSafe, absolutePath, makeSafe(hVar.f12390c), hVar.f12391d, hVar.f12389b, Build.VERSION.SDK_INT, is32bit(), hVar.f12392e.ordinal());
                this.installed.set(true);
            }
        } finally {
            this.lock.unlock();
        }
    }

    private final boolean is32bit() {
        String[] cpuAbi = NativeInterface.getCpuAbi();
        C19383o.m32793c(cpuAbi, "NativeInterface.getCpuAbi()");
        List l1 = C19318k.m32620l1(cpuAbi);
        boolean z = false;
        if (!(l1 instanceof Collection) || !l1.isEmpty()) {
            Iterator it = l1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                C19383o.m32793c(str, "it");
                if (C19459m.m33036e1(str, "64", false)) {
                    z = true;
                    break;
                }
            }
        }
        return !z;
    }

    private final boolean isInvalidMessage(Object obj) {
        if (obj == null || !(obj instanceof C5780k2)) {
            return true;
        }
        if (this.installed.get() || (obj instanceof C5780k2.C5788h)) {
            return false;
        }
        C5816o1 o1Var = this.logger;
        o1Var.mo16608h("Received message before INSTALL: " + obj);
        return true;
    }

    private final String makeSafe(String str) {
        Charset defaultCharset = Charset.defaultCharset();
        C19383o.m32793c(defaultCharset, "Charset.defaultCharset()");
        if (str != null) {
            byte[] bytes = str.getBytes(defaultCharset);
            C19383o.m32796f(bytes, "(this as java.lang.String).getBytes(charset)");
            return new String(bytes, C19446a.f43373b);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final native void addBreadcrumb(String str, String str2, String str3, Object obj);

    public final native void addFeatureFlag(String str, String str2);

    public final native void addHandledEvent();

    public final native void addMetadataBoolean(String str, String str2, boolean z);

    public final native void addMetadataDouble(String str, String str2, double d);

    public final native void addMetadataString(String str, String str2, String str3);

    public final native void addUnhandledEvent();

    public final native void clearFeatureFlag(String str);

    public final native void clearFeatureFlags();

    public final native void clearMetadataTab(String str);

    public final native void deliverReportAtPath(String str);

    public final native long getSignalUnwindStackFunction();

    public final native void install(String str, String str2, String str3, int i, boolean z, int i2, boolean z2, int i3);

    public void onStateChange(C5780k2 k2Var) {
        C19383o.m32798h(k2Var, "event");
        if (!isInvalidMessage(k2Var)) {
            if (k2Var instanceof C5780k2.C5788h) {
                handleInstallMessage((C5780k2.C5788h) k2Var);
            } else if (C19383o.m32792b(k2Var, C5780k2.C5787g.f12387a)) {
                deliverPendingReports();
            } else if (k2Var instanceof C5780k2.C5783c) {
                handleAddMetadata((C5780k2.C5783c) k2Var);
            } else if (k2Var instanceof C5780k2.C5785e) {
                clearMetadataTab(makeSafe(((C5780k2.C5785e) k2Var).f12384a));
            } else {
                String str = "";
                if (k2Var instanceof C5780k2.C5786f) {
                    C5780k2.C5786f fVar = (C5780k2.C5786f) k2Var;
                    String makeSafe = makeSafe(fVar.f12385a);
                    String str2 = fVar.f12386b;
                    if (str2 != null) {
                        str = str2;
                    }
                    removeMetadata(makeSafe, makeSafe(str));
                } else if (k2Var instanceof C5780k2.C5781a) {
                    C5780k2.C5781a aVar = (C5780k2.C5781a) k2Var;
                    addBreadcrumb(makeSafe(aVar.f12375a), makeSafe(aVar.f12376b.toString()), makeSafe(aVar.f12377c), aVar.f12378d);
                } else if (C19383o.m32792b(k2Var, C5780k2.C5789i.f12393a)) {
                    addHandledEvent();
                } else if (C19383o.m32792b(k2Var, C5780k2.C5790j.f12394a)) {
                    addUnhandledEvent();
                } else if (C19383o.m32792b(k2Var, C5780k2.C5791k.f12395a)) {
                    pausedSession();
                } else if (k2Var instanceof C5780k2.C5792l) {
                    C5780k2.C5792l lVar = (C5780k2.C5792l) k2Var;
                    startedSession(makeSafe(lVar.f12396a), makeSafe(lVar.f12397b), lVar.f12398c, lVar.f12399d);
                } else if (k2Var instanceof C5780k2.C5793m) {
                    String str3 = ((C5780k2.C5793m) k2Var).f12400a;
                    if (str3 != null) {
                        str = str3;
                    }
                    updateContext(makeSafe(str));
                } else if (k2Var instanceof C5780k2.C5794n) {
                    C5780k2.C5794n nVar = (C5780k2.C5794n) k2Var;
                    boolean z = nVar.f12401a;
                    String str4 = nVar.f12402b;
                    if (str4 != null) {
                        str = str4;
                    }
                    updateInForeground(z, makeSafe(str));
                } else if (k2Var instanceof C5780k2.C5796p) {
                    C5780k2.C5796p pVar = (C5780k2.C5796p) k2Var;
                    updateLastRunInfo(0);
                } else if (k2Var instanceof C5780k2.C5795o) {
                    updateIsLaunching(((C5780k2.C5795o) k2Var).f12403a);
                } else if (k2Var instanceof C5780k2.C5798r) {
                    String str5 = ((C5780k2.C5798r) k2Var).f12406a;
                    if (str5 != null) {
                        str = str5;
                    }
                    updateOrientation(str);
                } else if (k2Var instanceof C5780k2.C5799s) {
                    C5780k2.C5799s sVar = (C5780k2.C5799s) k2Var;
                    String str6 = sVar.f12407a.f12619b;
                    if (str6 == null) {
                        str6 = str;
                    }
                    updateUserId(makeSafe(str6));
                    String str7 = sVar.f12407a.f12621d;
                    if (str7 == null) {
                        str7 = str;
                    }
                    updateUserName(makeSafe(str7));
                    String str8 = sVar.f12407a.f12620c;
                    if (str8 != null) {
                        str = str8;
                    }
                    updateUserEmail(makeSafe(str));
                } else if (k2Var instanceof C5780k2.C5797q) {
                    C5780k2.C5797q qVar = (C5780k2.C5797q) k2Var;
                    updateLowMemory(qVar.f12404a, qVar.f12405b);
                } else {
                    String str9 = null;
                    if (k2Var instanceof C5780k2.C5782b) {
                        C5780k2.C5782b bVar = (C5780k2.C5782b) k2Var;
                        String makeSafe2 = makeSafe(bVar.f12379a);
                        String str10 = bVar.f12380b;
                        if (str10 != null) {
                            str9 = makeSafe(str10);
                        }
                        addFeatureFlag(makeSafe2, str9);
                    } else if (k2Var instanceof C5780k2.C5784d) {
                        C5780k2.C5784d dVar = (C5780k2.C5784d) k2Var;
                        clearFeatureFlag(makeSafe((String) null));
                    }
                }
            }
        }
    }

    public final native void pausedSession();

    public final native void removeMetadata(String str, String str2);

    public final native void startedSession(String str, String str2, int i, int i2);

    public final native void updateContext(String str);

    public final native void updateInForeground(boolean z, String str);

    public final native void updateIsLaunching(boolean z);

    public final native void updateLastRunInfo(int i);

    public final native void updateLowMemory(boolean z, String str);

    public final native void updateOrientation(String str);

    public final native void updateUserEmail(String str);

    public final native void updateUserId(String str);

    public final native void updateUserName(String str);
}
