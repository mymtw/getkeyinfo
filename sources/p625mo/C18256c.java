package p625mo;

import android.media.MediaFormat;
import com.linkedin.android.litr.exception.TrackTranscoderException;
import p577go.C17803a;
import p577go.C17804b;
import p577go.C17806d;
import p577go.C17807e;
import p600jo.C18042c;
import p600jo.C18043d;
import p617lo.C18213d;
import p628nj.C18263b;

/* renamed from: mo.c */
public abstract class C18256c {

    /* renamed from: a */
    public final C18042c f40016a;

    /* renamed from: b */
    public final C18043d f40017b;

    /* renamed from: c */
    public final C18213d f40018c;

    /* renamed from: d */
    public final C17803a f40019d;

    /* renamed from: e */
    public final C17804b f40020e;

    /* renamed from: f */
    public final C18263b f40021f;

    /* renamed from: g */
    public int f40022g;

    /* renamed from: h */
    public int f40023h;

    /* renamed from: i */
    public boolean f40024i;

    /* renamed from: j */
    public MediaFormat f40025j;

    /* renamed from: k */
    public long f40026k = -1;

    /* renamed from: l */
    public float f40027l;

    public C18256c(int i, int i2, MediaFormat mediaFormat, C17803a aVar, C17804b bVar, C18042c cVar, C18043d dVar, C18213d dVar2) {
        this.f40016a = cVar;
        this.f40022g = i;
        this.f40023h = i2;
        this.f40017b = dVar;
        this.f40025j = mediaFormat;
        this.f40018c = dVar2;
        this.f40019d = aVar;
        this.f40020e = bVar;
        C18263b selection = cVar.getSelection();
        this.f40021f = selection;
        MediaFormat h = cVar.mo69606h(i);
        if (h.containsKey("durationUs")) {
            long j = h.getLong("durationUs");
            this.f40026k = j;
            if (mediaFormat != null) {
                mediaFormat.setLong("durationUs", j);
            }
        }
        selection.getClass();
        this.f40026k = Math.min(this.f40026k, Long.MAX_VALUE) - 0;
    }

    /* renamed from: a */
    public final void mo69803a() {
        while (this.f40016a.mo69600c() == this.f40022g) {
            this.f40016a.mo69599b();
            if ((this.f40016a.mo69608j() & 4) != 0) {
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo69801b() throws TrackTranscoderException {
        C17806d dVar = (C17806d) this.f40019d;
        dVar.getClass();
        try {
            dVar.f38709a.getName();
        } catch (IllegalStateException e) {
            throw new TrackTranscoderException(TrackTranscoderException.Error.CODEC_IN_RELEASED_STATE, e);
        }
    }

    /* renamed from: c */
    public void mo69802c() throws TrackTranscoderException {
        C17807e eVar = (C17807e) this.f40020e;
        eVar.getClass();
        try {
            eVar.f38713a.getName();
        } catch (IllegalStateException e) {
            throw new TrackTranscoderException(TrackTranscoderException.Error.CODEC_IN_RELEASED_STATE, e);
        }
    }

    /* renamed from: d */
    public abstract int mo69798d() throws TrackTranscoderException;

    /* renamed from: e */
    public abstract void mo69799e() throws TrackTranscoderException;

    /* renamed from: f */
    public abstract void mo69800f();
}
