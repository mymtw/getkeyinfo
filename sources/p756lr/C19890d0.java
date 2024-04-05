package p756lr;

import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;

/* renamed from: lr.d0 */
public class C19890d0 {

    /* renamed from: d */
    public static final C19891a f43871d = new C19891a();

    /* renamed from: a */
    public boolean f43872a;

    /* renamed from: b */
    public long f43873b;

    /* renamed from: c */
    public long f43874c;

    /* renamed from: lr.d0$a */
    public static final class C19891a extends C19890d0 {
        /* renamed from: d */
        public final C19890d0 mo72702d(long j) {
            return this;
        }

        /* renamed from: f */
        public final void mo72704f() {
        }

        /* renamed from: g */
        public final C19890d0 mo72705g(long j, TimeUnit timeUnit) {
            C19383o.m32797g(timeUnit, ResponseConstants.UNIT);
            return this;
        }
    }

    /* renamed from: a */
    public C19890d0 mo72699a() {
        this.f43872a = false;
        return this;
    }

    /* renamed from: b */
    public C19890d0 mo72700b() {
        this.f43874c = 0;
        return this;
    }

    /* renamed from: c */
    public long mo72701c() {
        if (this.f43872a) {
            return this.f43873b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    /* renamed from: d */
    public C19890d0 mo72702d(long j) {
        this.f43872a = true;
        this.f43873b = j;
        return this;
    }

    /* renamed from: e */
    public boolean mo72703e() {
        return this.f43872a;
    }

    /* renamed from: f */
    public void mo72704f() throws IOException {
        Thread currentThread = Thread.currentThread();
        C19383o.m32796f(currentThread, "Thread.currentThread()");
        if (currentThread.isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        } else if (this.f43872a && this.f43873b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: g */
    public C19890d0 mo72705g(long j, TimeUnit timeUnit) {
        C19383o.m32797g(timeUnit, ResponseConstants.UNIT);
        if (j >= 0) {
            this.f43874c = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(C0073e.m205e("timeout < 0: ", j).toString());
    }
}
