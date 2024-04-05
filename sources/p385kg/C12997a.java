package p385kg;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import com.facebook.internal.instrument.InstrumentData;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.C19383o;
import org.json.JSONArray;
import p401mg.C13080a;
import p453tf.C13418j;
import p568fn.C17782b;

/* renamed from: kg.a */
public final class C12997a {

    /* renamed from: a */
    public static final int f28615a = Process.myUid();

    /* renamed from: b */
    public static final ScheduledExecutorService f28616b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c */
    public static String f28617c = "";

    /* renamed from: d */
    public static final C12998a f28618d = C12998a.f28619b;

    /* renamed from: kg.a$a */
    public static final class C12998a implements Runnable {

        /* renamed from: b */
        public static final C12998a f28619b = new C12998a();

        public final void run() {
            if (!C13080a.m20762b(this)) {
                try {
                    Object systemService = C13418j.m21106b().getSystemService("activity");
                    if (systemService != null) {
                        C12997a.m20708a((ActivityManager) systemService);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
                } catch (Exception unused) {
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    static {
        new C12997a();
    }

    /* renamed from: a */
    public static final void m20708a(ActivityManager activityManager) {
        Class<C12997a> cls = C12997a.class;
        if (!C13080a.m20762b(cls)) {
            try {
                List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
                if (processesInErrorState != null) {
                    for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                        if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == f28615a) {
                            Looper mainLooper = Looper.getMainLooper();
                            C19383o.m32796f(mainLooper, "Looper.getMainLooper()");
                            Thread thread = mainLooper.getThread();
                            C19383o.m32796f(thread, "Looper.getMainLooper().thread");
                            StackTraceElement[] stackTrace = thread.getStackTrace();
                            JSONArray jSONArray = new JSONArray();
                            for (StackTraceElement stackTraceElement : stackTrace) {
                                jSONArray.put(stackTraceElement.toString());
                            }
                            String jSONArray2 = jSONArray.toString();
                            if (!C19383o.m32792b(jSONArray2, f28617c)) {
                                if (C17782b.m29862b0(thread)) {
                                    f28617c = jSONArray2;
                                    new InstrumentData(processErrorStateInfo.shortMsg, jSONArray2).mo39442b();
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                C13080a.m20761a(cls, th);
            }
        }
    }
}
