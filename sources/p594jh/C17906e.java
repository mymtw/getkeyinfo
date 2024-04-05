package p594jh;

import p594jh.C17939k1;

/* renamed from: jh.e */
public abstract class C17906e implements C17884a1 {

    /* renamed from: a */
    public final C17939k1.C17942c f38890a = new C17939k1.C17942c();

    /* renamed from: F */
    public final int mo69305F() {
        C17939k1 r = mo69338r();
        if (r.mo69481p()) {
            return -1;
        }
        int j = mo69327j();
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            repeatMode = 0;
        }
        return r.mo69298k(j, repeatMode, mo69312M());
    }

    /* renamed from: I */
    public final int mo69308I() {
        C17939k1 r = mo69338r();
        if (r.mo69481p()) {
            return -1;
        }
        int j = mo69327j();
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            repeatMode = 0;
        }
        return r.mo69296e(j, repeatMode, mo69312M());
    }

    /* renamed from: h */
    public final boolean mo69324h() {
        C17939k1 r = mo69338r();
        return !r.mo69481p() && r.mo69480m(mo69327j(), this.f38890a).f39114h;
    }

    public final boolean isPlaying() {
        return getPlaybackState() == 3 && mo69348x() && mo69333p() == 0;
    }

    /* renamed from: o */
    public final boolean mo69332o(int i) {
        return mo69307H().f38842a.f30931a.get(i);
    }

    public final void pause() {
        mo69329l(false);
    }

    public final void play() {
        mo69329l(true);
    }

    public final void seekTo(long j) {
        mo69347w(mo69327j(), j);
    }

    public final void stop() {
        mo69311L();
    }
}
