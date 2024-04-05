package p608kn;

import android.os.Process;
import android.support.p013v4.media.C0072d;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.p530v1.C16660d;
import com.google.firebase.perf.util.Timer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p568fn.C17781a;

/* renamed from: kn.b */
public final class C18150b {

    /* renamed from: g */
    public static final C17781a f39632g = C17781a.m29823d();

    /* renamed from: h */
    public static final long f39633h = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: a */
    public final ConcurrentLinkedQueue<C16660d> f39634a = new ConcurrentLinkedQueue<>();

    /* renamed from: b */
    public final ScheduledExecutorService f39635b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c */
    public final String f39636c;

    /* renamed from: d */
    public final long f39637d;

    /* renamed from: e */
    public ScheduledFuture f39638e = null;

    /* renamed from: f */
    public long f39639f = -1;

    public C18150b() {
        int myPid = Process.myPid();
        StringBuilder h = C0072d.m201h("/proc/");
        h.append(Integer.toString(myPid));
        h.append("/stat");
        this.f39636c = h.toString();
        this.f39637d = Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    /* renamed from: a */
    public final synchronized void mo69698a(long j, Timer timer) {
        this.f39639f = j;
        try {
            this.f39638e = this.f39635b.scheduleAtFixedRate(new C18149a(0, this, timer), 0, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C17781a aVar = f39632g;
            aVar.mo69018f("Unable to start collecting Cpu Metrics: " + e.getMessage());
        }
        return;
    }

    /* renamed from: b */
    public final C16660d mo69699b(Timer timer) {
        BufferedReader bufferedReader;
        if (timer == null) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(this.f39636c));
            long currentTimestampMicros = timer.getCurrentTimestampMicros();
            String[] split = bufferedReader.readLine().split(" ");
            long parseLong = Long.parseLong(split[13]);
            long parseLong2 = Long.parseLong(split[15]);
            long parseLong3 = Long.parseLong(split[14]);
            long parseLong4 = Long.parseLong(split[16]);
            C16660d.C16662b C = C16660d.m27572C();
            C.mo59761u();
            C16660d.m27574z((C16660d) C.f37158c, currentTimestampMicros);
            double d = ((double) (parseLong3 + parseLong4)) / ((double) this.f39637d);
            long j = f39633h;
            long round = Math.round(d * ((double) j));
            C.mo59761u();
            C16660d.m27571B((C16660d) C.f37158c, round);
            long round2 = Math.round((((double) (parseLong + parseLong2)) / ((double) this.f39637d)) * ((double) j));
            C.mo59761u();
            C16660d.m27570A((C16660d) C.f37158c, round2);
            C16660d dVar = (C16660d) C.mo59759s();
            bufferedReader.close();
            return dVar;
        } catch (IOException e) {
            C17781a aVar = f39632g;
            StringBuilder h = C0072d.m201h("Unable to read 'proc/[pid]/stat' file: ");
            h.append(e.getMessage());
            aVar.mo69018f(h.toString());
            return null;
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e2) {
            C17781a aVar2 = f39632g;
            StringBuilder h2 = C0072d.m201h("Unexpected '/proc/[pid]/stat' file format encountered: ");
            h2.append(e2.getMessage());
            aVar2.mo69018f(h2.toString());
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
