package p611lh;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import p513bj.C14049b0;

/* renamed from: lh.n */
public final class C18177n {

    /* renamed from: a */
    public final C18178a f39769a;

    /* renamed from: b */
    public int f39770b;

    /* renamed from: c */
    public long f39771c;

    /* renamed from: d */
    public long f39772d;

    /* renamed from: e */
    public long f39773e;

    /* renamed from: f */
    public long f39774f;

    /* renamed from: lh.n$a */
    public static final class C18178a {

        /* renamed from: a */
        public final AudioTrack f39775a;

        /* renamed from: b */
        public final AudioTimestamp f39776b = new AudioTimestamp();

        /* renamed from: c */
        public long f39777c;

        /* renamed from: d */
        public long f39778d;

        /* renamed from: e */
        public long f39779e;

        public C18178a(AudioTrack audioTrack) {
            this.f39775a = audioTrack;
        }
    }

    public C18177n(AudioTrack audioTrack) {
        if (C14049b0.f30913a >= 19) {
            this.f39769a = new C18178a(audioTrack);
            mo69720a();
            return;
        }
        this.f39769a = null;
        mo69721b(3);
    }

    /* renamed from: a */
    public final void mo69720a() {
        if (this.f39769a != null) {
            mo69721b(0);
        }
    }

    /* renamed from: b */
    public final void mo69721b(int i) {
        this.f39770b = i;
        if (i == 0) {
            this.f39773e = 0;
            this.f39774f = -1;
            this.f39771c = System.nanoTime() / 1000;
            this.f39772d = NetworkRetryInterceptor.DEFAULT_MAX_RETRIES_DURATION;
        } else if (i == 1) {
            this.f39772d = NetworkRetryInterceptor.DEFAULT_MAX_RETRIES_DURATION;
        } else if (i == 2 || i == 3) {
            this.f39772d = 10000000;
        } else if (i == 4) {
            this.f39772d = 500000;
        } else {
            throw new IllegalStateException();
        }
    }
}
