package p645pi;

import com.etsy.android.lib.network.oauth2.signin.C8778g;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import p513bj.C14049b0;
import p513bj.C14075p;
import p619mh.C18225f;
import p636oi.C18301e;
import p636oi.C18304g;
import p636oi.C18305h;

/* renamed from: pi.d */
public abstract class C18383d implements C18301e {

    /* renamed from: a */
    public final ArrayDeque<C18384a> f40438a = new ArrayDeque<>();

    /* renamed from: b */
    public final ArrayDeque<C18305h> f40439b;

    /* renamed from: c */
    public final PriorityQueue<C18384a> f40440c;

    /* renamed from: d */
    public C18384a f40441d;

    /* renamed from: e */
    public long f40442e;

    /* renamed from: f */
    public long f40443f;

    /* renamed from: pi.d$a */
    public static final class C18384a extends C18304g implements Comparable<C18384a> {

        /* renamed from: k */
        public long f40444k;

        public final int compareTo(Object obj) {
            C18384a aVar = (C18384a) obj;
            if (mo69761h(4) == aVar.mo69761h(4)) {
                long j = this.f31495f - aVar.f31495f;
                if (j == 0) {
                    j = this.f40444k - aVar.f40444k;
                    if (j == 0) {
                        return 0;
                    }
                }
                if (j > 0) {
                    return 1;
                }
            } else if (mo69761h(4)) {
                return 1;
            }
            return -1;
        }
    }

    /* renamed from: pi.d$b */
    public static final class C18385b extends C18305h {

        /* renamed from: f */
        public C18225f.C18226a<C18385b> f40445f;

        public C18385b(C8778g gVar) {
            this.f40445f = gVar;
        }

        /* renamed from: j */
        public final void mo47085j() {
            this.f40445f.mo21075b(this);
        }
    }

    public C18383d() {
        for (int i = 0; i < 10; i++) {
            this.f40438a.add(new C18384a());
        }
        this.f40439b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f40439b.add(new C18385b(new C8778g(this)));
        }
        this.f40440c = new PriorityQueue<>();
    }

    /* renamed from: a */
    public final void mo69839a(long j) {
        this.f40442e = j;
    }

    /* renamed from: c */
    public final void mo69764c(C18304g gVar) throws DecoderException {
        C14075p.m21691c(gVar == this.f40441d);
        C18384a aVar = (C18384a) gVar;
        if (aVar.mo69762i()) {
            aVar.mo46795j();
            this.f40438a.add(aVar);
        } else {
            long j = this.f40443f;
            this.f40443f = 1 + j;
            aVar.f40444k = j;
            this.f40440c.add(aVar);
        }
        this.f40441d = null;
    }

    /* renamed from: d */
    public final Object mo69765d() throws DecoderException {
        C14075p.m21694f(this.f40441d == null);
        if (this.f40438a.isEmpty()) {
            return null;
        }
        C18384a pollFirst = this.f40438a.pollFirst();
        this.f40441d = pollFirst;
        return pollFirst;
    }

    /* renamed from: e */
    public abstract C18386e mo69906e();

    /* renamed from: f */
    public abstract void mo69907f(C18384a aVar);

    public void flush() {
        this.f40443f = 0;
        this.f40442e = 0;
        while (!this.f40440c.isEmpty()) {
            C18384a poll = this.f40440c.poll();
            int i = C14049b0.f30913a;
            poll.mo46795j();
            this.f40438a.add(poll);
        }
        C18384a aVar = this.f40441d;
        if (aVar != null) {
            aVar.mo46795j();
            this.f40438a.add(aVar);
            this.f40441d = null;
        }
    }

    /* renamed from: g */
    public C18305h mo69763b() throws SubtitleDecoderException {
        if (this.f40439b.isEmpty()) {
            return null;
        }
        while (!this.f40440c.isEmpty()) {
            int i = C14049b0.f30913a;
            if (this.f40440c.peek().f31495f > this.f40442e) {
                break;
            }
            C18384a poll = this.f40440c.poll();
            if (poll.mo69761h(4)) {
                C18305h pollFirst = this.f40439b.pollFirst();
                pollFirst.mo69760g(4);
                poll.mo46795j();
                this.f40438a.add(poll);
                return pollFirst;
            }
            mo69907f(poll);
            if (mo69909h()) {
                C18386e e = mo69906e();
                C18305h pollFirst2 = this.f40439b.pollFirst();
                pollFirst2.mo69845k(poll.f31495f, e, Long.MAX_VALUE);
                poll.mo46795j();
                this.f40438a.add(poll);
                return pollFirst2;
            }
            poll.mo46795j();
            this.f40438a.add(poll);
        }
        return null;
    }

    /* renamed from: h */
    public abstract boolean mo69909h();

    public void release() {
    }
}
