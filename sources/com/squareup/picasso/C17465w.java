package com.squareup.picasso;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.support.p013v4.media.C0072d;

/* renamed from: com.squareup.picasso.w */
public final class C17465w {

    /* renamed from: a */
    public final C17438d f38182a;

    /* renamed from: b */
    public final C17466a f38183b;

    /* renamed from: c */
    public long f38184c;

    /* renamed from: d */
    public long f38185d;

    /* renamed from: e */
    public long f38186e;

    /* renamed from: f */
    public long f38187f;

    /* renamed from: g */
    public long f38188g;

    /* renamed from: h */
    public long f38189h;

    /* renamed from: i */
    public long f38190i;

    /* renamed from: j */
    public long f38191j;

    /* renamed from: k */
    public int f38192k;

    /* renamed from: l */
    public int f38193l;

    /* renamed from: m */
    public int f38194m;

    /* renamed from: com.squareup.picasso.w$a */
    public static class C17466a extends Handler {

        /* renamed from: a */
        public final C17465w f38195a;

        /* renamed from: com.squareup.picasso.w$a$a */
        public class C17467a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ Message f38196b;

            public C17467a(Message message) {
                this.f38196b = message;
            }

            public final void run() {
                StringBuilder h = C0072d.m201h("Unhandled stats message.");
                h.append(this.f38196b.what);
                throw new AssertionError(h.toString());
            }
        }

        public C17466a(Looper looper, C17465w wVar) {
            super(looper);
            this.f38195a = wVar;
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.f38195a.f38184c++;
            } else if (i == 1) {
                this.f38195a.f38185d++;
            } else if (i == 2) {
                C17465w wVar = this.f38195a;
                long j = (long) message.arg1;
                int i2 = wVar.f38193l + 1;
                wVar.f38193l = i2;
                long j2 = wVar.f38187f + j;
                wVar.f38187f = j2;
                wVar.f38190i = j2 / ((long) i2);
            } else if (i == 3) {
                C17465w wVar2 = this.f38195a;
                long j3 = (long) message.arg1;
                wVar2.f38194m++;
                long j4 = wVar2.f38188g + j3;
                wVar2.f38188g = j4;
                wVar2.f38191j = j4 / ((long) wVar2.f38193l);
            } else if (i != 4) {
                Picasso.f38038m.post(new C17467a(message));
            } else {
                C17465w wVar3 = this.f38195a;
                wVar3.f38192k++;
                long longValue = ((Long) message.obj).longValue() + wVar3.f38186e;
                wVar3.f38186e = longValue;
                wVar3.f38189h = longValue / ((long) wVar3.f38192k);
            }
        }
    }

    public C17465w(C17438d dVar) {
        this.f38182a = dVar;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        StringBuilder sb = C17427a0.f38069a;
        C17470z zVar = new C17470z(looper);
        zVar.sendMessageDelayed(zVar.obtainMessage(), 1000);
        this.f38183b = new C17466a(handlerThread.getLooper(), this);
    }

    /* renamed from: a */
    public final C17468x mo68636a() {
        int maxSize = ((C17452n) this.f38182a).f38126a.maxSize();
        int size = ((C17452n) this.f38182a).f38126a.size();
        return new C17468x(maxSize, size, this.f38184c, this.f38185d, this.f38186e, this.f38187f, this.f38188g, this.f38189h, this.f38190i, this.f38191j, this.f38192k, this.f38193l, this.f38194m, System.currentTimeMillis());
    }
}
