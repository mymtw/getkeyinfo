package p602kh;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.stetho.websocket.CloseCodes;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.C14189a;
import com.google.android.exoplayer2.drm.C14216b;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.C14344i;
import com.google.android.exoplayer2.source.C14347j;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.common.base.C15791j;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.List;
import org.apache.commons.lang3.time.DateUtils;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p003a2.C0015b;
import p505aj.C13992c;
import p513bj.C14046a;
import p513bj.C14049b0;
import p513bj.C14060k;
import p513bj.C14082v;
import p520cj.C14164p;
import p520cj.C14166q;
import p594jh.C17884a1;
import p594jh.C17907e0;
import p594jh.C17912g;
import p594jh.C17913g0;
import p594jh.C17939k1;
import p594jh.C17954o0;
import p594jh.C17963p0;
import p594jh.C17965q;
import p594jh.C17977w;
import p594jh.C17986y0;
import p595ji.C17992d;
import p595ji.C17993e;
import p595ji.C17994f;
import p602kh.C18089v0;
import p619mh.C18223d;
import p619mh.C18224e;
import p718yi.C18887e;

/* renamed from: kh.u0 */
public final class C18086u0 implements C17884a1.C17888d, C14189a, C14164p, C14347j, C13992c.C13993a, C14216b {

    /* renamed from: b */
    public final C17939k1.C17941b f39479b;

    /* renamed from: c */
    public final C17939k1.C17942c f39480c;

    /* renamed from: d */
    public final C18087a f39481d;

    /* renamed from: e */
    public final SparseArray<C18089v0.C18090a> f39482e;

    /* renamed from: f */
    public C14060k<C18089v0> f39483f;

    /* renamed from: g */
    public C17884a1 f39484g;

    /* renamed from: h */
    public boolean f39485h;

    /* renamed from: kh.u0$a */
    public static final class C18087a {

        /* renamed from: a */
        public final C17939k1.C17941b f39486a;

        /* renamed from: b */
        public ImmutableList<C14344i.C14345a> f39487b = ImmutableList.m25826of();

        /* renamed from: c */
        public ImmutableMap<C14344i.C14345a, C17939k1> f39488c = ImmutableMap.m25853of();

        /* renamed from: d */
        public C14344i.C14345a f39489d;

        /* renamed from: e */
        public C14344i.C14345a f39490e;

        /* renamed from: f */
        public C14344i.C14345a f39491f;

        public C18087a(C17939k1.C17941b bVar) {
            this.f39486a = bVar;
        }

        /* renamed from: b */
        public static C14344i.C14345a m30547b(C17884a1 a1Var, ImmutableList<C14344i.C14345a> immutableList, C14344i.C14345a aVar, C17939k1.C17941b bVar) {
            C17939k1 r = a1Var.mo69338r();
            int A = a1Var.mo69300A();
            Object l = r.mo69481p() ? null : r.mo47699l(A);
            int b = (a1Var.mo69317d() || r.mo69481p()) ? -1 : r.mo47630f(A, bVar, false).mo69483b(C17912g.m30087a(a1Var.getCurrentPosition()) - bVar.f39102e);
            for (int i = 0; i < immutableList.size(); i++) {
                C14344i.C14345a aVar2 = immutableList.get(i);
                if (m30548c(aVar2, l, a1Var.mo69317d(), a1Var.mo69331n(), a1Var.mo69303D(), b)) {
                    return aVar2;
                }
            }
            if (immutableList.isEmpty() && aVar != null) {
                if (m30548c(aVar, l, a1Var.mo69317d(), a1Var.mo69331n(), a1Var.mo69303D(), b)) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: c */
        public static boolean m30548c(C14344i.C14345a aVar, Object obj, boolean z, int i, int i2, int i3) {
            if (!aVar.f39346a.equals(obj)) {
                return false;
            }
            return (z && aVar.f39347b == i && aVar.f39348c == i2) || (!z && aVar.f39347b == -1 && aVar.f39350e == i3);
        }

        /* renamed from: a */
        public final void mo69622a(ImmutableMap.C15958b<C14344i.C14345a, C17939k1> bVar, C14344i.C14345a aVar, C17939k1 k1Var) {
            if (aVar != null) {
                if (k1Var.mo47698b(aVar.f39346a) != -1) {
                    bVar.mo56613b(aVar, k1Var);
                    return;
                }
                C17939k1 k1Var2 = this.f39488c.get(aVar);
                if (k1Var2 != null) {
                    bVar.mo56613b(aVar, k1Var2);
                }
            }
        }

        /* renamed from: d */
        public final void mo69623d(C17939k1 k1Var) {
            ImmutableMap.C15958b builder = ImmutableMap.builder();
            if (this.f39487b.isEmpty()) {
                mo69622a(builder, this.f39490e, k1Var);
                if (!C15791j.m25606a(this.f39491f, this.f39490e)) {
                    mo69622a(builder, this.f39491f, k1Var);
                }
                if (!C15791j.m25606a(this.f39489d, this.f39490e) && !C15791j.m25606a(this.f39489d, this.f39491f)) {
                    mo69622a(builder, this.f39489d, k1Var);
                }
            } else {
                for (int i = 0; i < this.f39487b.size(); i++) {
                    mo69622a(builder, this.f39487b.get(i), k1Var);
                }
                if (!this.f39487b.contains(this.f39489d)) {
                    mo69622a(builder, this.f39489d, k1Var);
                }
            }
            this.f39488c = builder.mo56612a();
        }
    }

    public C18086u0() {
        C14082v vVar = C14046a.f30907a;
        int i = C14049b0.f30913a;
        Looper myLooper = Looper.myLooper();
        this.f39483f = new C14060k<>(myLooper == null ? Looper.getMainLooper() : myLooper, vVar, new C0015b());
        C17939k1.C17941b bVar = new C17939k1.C17941b();
        this.f39479b = bVar;
        this.f39480c = new C17939k1.C17942c();
        this.f39481d = new C18087a(bVar);
        this.f39482e = new SparseArray<>();
    }

    /* renamed from: A */
    public final void mo47323A(int i, C14344i.C14345a aVar, int i2) {
        C18089v0.C18090a H = mo69619H(i, aVar);
        mo69621J(H, 1030, new C18094z(H, i2));
    }

    /* renamed from: B */
    public final void mo47324B(int i, C14344i.C14345a aVar) {
        C18089v0.C18090a H = mo69619H(i, aVar);
        mo69621J(H, 1035, new C17965q(H, 1));
    }

    /* renamed from: C */
    public final void mo47100C(long j, long j2, String str) {
        C18089v0.C18090a I = mo69620I();
        mo69621J(I, 1021, new C18069m(I, str, j2, j));
    }

    /* renamed from: D */
    public final void mo47325D(int i, C14344i.C14345a aVar) {
        C18089v0.C18090a H = mo69619H(i, aVar);
        mo69621J(H, 1033, new C18070m0(H));
    }

    /* renamed from: E */
    public final C18089v0.C18090a mo69616E() {
        return mo69617F(this.f39481d.f39489d);
    }

    /* renamed from: F */
    public final C18089v0.C18090a mo69617F(C14344i.C14345a aVar) {
        this.f39484g.getClass();
        C17939k1 k1Var = aVar == null ? null : this.f39481d.f39488c.get(aVar);
        if (aVar != null && k1Var != null) {
            return mo69618G(k1Var, k1Var.mo69297g(aVar.f39346a, this.f39479b).f39100c, aVar);
        }
        int j = this.f39484g.mo69327j();
        C17939k1 r = this.f39484g.mo69338r();
        if (!(j < r.mo47701o())) {
            r = C17939k1.f39097a;
        }
        return mo69618G(r, j, (C14344i.C14345a) null);
    }

    @RequiresNonNull({"player"})
    /* renamed from: G */
    public final C18089v0.C18090a mo69618G(C17939k1 k1Var, int i, C14344i.C14345a aVar) {
        long j;
        C17939k1 k1Var2 = k1Var;
        int i2 = i;
        C14344i.C14345a aVar2 = k1Var.mo69481p() ? null : aVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = true;
        boolean z2 = k1Var2.equals(this.f39484g.mo69338r()) && i2 == this.f39484g.mo69327j();
        long j2 = 0;
        if (aVar2 != null && aVar2.mo69559a()) {
            if (!(z2 && this.f39484g.mo69331n() == aVar2.f39347b && this.f39484g.mo69303D() == aVar2.f39348c)) {
                z = false;
            }
            if (z) {
                j2 = this.f39484g.getCurrentPosition();
            }
        } else if (z2) {
            j = this.f39484g.mo69304E();
            return new C18089v0.C18090a(elapsedRealtime, k1Var, i, aVar2, j, this.f39484g.mo69338r(), this.f39484g.mo69327j(), this.f39481d.f39489d, this.f39484g.getCurrentPosition(), this.f39484g.mo69318e());
        } else if (!k1Var.mo69481p()) {
            j2 = C17912g.m30088b(k1Var2.mo69480m(i2, this.f39480c).f39119m);
        }
        j = j2;
        return new C18089v0.C18090a(elapsedRealtime, k1Var, i, aVar2, j, this.f39484g.mo69338r(), this.f39484g.mo69327j(), this.f39481d.f39489d, this.f39484g.getCurrentPosition(), this.f39484g.mo69318e());
    }

    /* renamed from: H */
    public final C18089v0.C18090a mo69619H(int i, C14344i.C14345a aVar) {
        this.f39484g.getClass();
        boolean z = true;
        if (aVar != null) {
            if (this.f39481d.f39488c.get(aVar) == null) {
                z = false;
            }
            return z ? mo69617F(aVar) : mo69618G(C17939k1.f39097a, i, aVar);
        }
        C17939k1 r = this.f39484g.mo69338r();
        if (i >= r.mo47701o()) {
            z = false;
        }
        if (!z) {
            r = C17939k1.f39097a;
        }
        return mo69618G(r, i, (C14344i.C14345a) null);
    }

    /* renamed from: I */
    public final C18089v0.C18090a mo69620I() {
        return mo69617F(this.f39481d.f39491f);
    }

    /* renamed from: J */
    public final void mo69621J(C18089v0.C18090a aVar, int i, C14060k.C14061a<C18089v0> aVar2) {
        this.f39482e.put(i, aVar);
        C14060k<C18089v0> kVar = this.f39483f;
        kVar.mo46883b(i, aVar2);
        kVar.mo46882a();
    }

    /* renamed from: a */
    public final void mo47101a(String str) {
        C18089v0.C18090a I = mo69620I();
        mo69621J(I, RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE, new C18053e(I, str, 0));
    }

    /* renamed from: b */
    public final void mo47239b(String str) {
        C18089v0.C18090a I = mo69620I();
        mo69621J(I, 1013, new C18088v(I, str, 1));
    }

    /* renamed from: c */
    public final void mo47326c(int i, C14344i.C14345a aVar) {
        C18089v0.C18090a H = mo69619H(i, aVar);
        mo69621J(H, 1034, new C17977w(H, 1));
    }

    /* renamed from: d */
    public final void mo47240d(C18223d dVar) {
        C18089v0.C18090a F = mo69617F(this.f39481d.f39490e);
        mo69621J(F, 1014, new C18049c(F, dVar));
    }

    /* renamed from: e */
    public final void mo47241e(Exception exc) {
        C18089v0.C18090a I = mo69620I();
        mo69621J(I, 1018, new C17913g0(1, I, exc));
    }

    /* renamed from: f */
    public final void mo47242f(long j) {
        C18089v0.C18090a I = mo69620I();
        mo69621J(I, CloseCodes.UNEXPECTED_CONDITION, new C18067l(I, j));
    }

    /* renamed from: g */
    public final void mo47243g(Format format, C18224e eVar) {
        C18089v0.C18090a I = mo69620I();
        mo69621J(I, 1010, new C18081s(I, format, eVar));
    }

    /* renamed from: h */
    public final void mo47102h(Exception exc) {
        C18089v0.C18090a I = mo69620I();
        mo69621J(I, 1038, new C18050c0(I, exc));
    }

    /* renamed from: i */
    public final void mo47103i(long j, Object obj) {
        C18089v0.C18090a I = mo69620I();
        mo69621J(I, 1027, new C18055f(I, obj, j));
    }

    /* renamed from: j */
    public final void mo47687j(int i, C14344i.C14345a aVar, C17993e eVar) {
        C18089v0.C18090a H = mo69619H(i, aVar);
        mo69621J(H, 1004, new C18060h0(H, eVar));
    }

    /* renamed from: k */
    public final void mo47244k(long j, long j2, String str) {
        C18089v0.C18090a I = mo69620I();
        mo69621J(I, 1009, new C18061i(I, str, j2, j));
    }

    /* renamed from: l */
    public final void mo47104l(int i, long j) {
        C18089v0.C18090a F = mo69617F(this.f39481d.f39490e);
        mo69621J(F, 1026, new C18057g(i, j, F));
    }

    /* renamed from: m */
    public final void mo47688m(int i, C14344i.C14345a aVar, C17992d dVar, C17993e eVar) {
        C18089v0.C18090a H = mo69619H(i, aVar);
        mo69621J(H, 1000, new C18092x(H, dVar, eVar));
    }

    /* renamed from: n */
    public final void mo47327n(int i, C14344i.C14345a aVar, Exception exc) {
        C18089v0.C18090a H = mo69619H(i, aVar);
        mo69621J(H, 1032, new C18063j(H, exc, 1));
    }

    /* renamed from: o */
    public final void mo47245o(long j, long j2, int i) {
        C18089v0.C18090a I = mo69620I();
        mo69621J(I, 1012, new C18072n0(I, i, j, j2));
    }

    public final void onIsLoadingChanged(boolean z) {
        C18089v0.C18090a E = mo69616E();
        mo69621J(E, 4, new C18056f0(E, z));
    }

    public final void onIsPlayingChanged(boolean z) {
        C18089v0.C18090a E = mo69616E();
        mo69621J(E, 8, new C18062i0(E, z));
    }

    public final void onMediaItemTransition(C17954o0 o0Var, int i) {
        C18089v0.C18090a E = mo69616E();
        mo69621J(E, 1, new C18093y(E, o0Var, i));
    }

    public final void onMediaMetadataChanged(C17963p0 p0Var) {
        C18089v0.C18090a E = mo69616E();
        mo69621J(E, 15, new C18065k(E, p0Var, 1));
    }

    public final void onMetadata(Metadata metadata) {
        C18089v0.C18090a E = mo69616E();
        mo69621J(E, 1007, new C18088v(E, metadata, 0));
    }

    public final void onPlayWhenReadyChanged(boolean z, int i) {
        C18089v0.C18090a E = mo69616E();
        mo69621J(E, 6, new C18045a(E, z, i));
    }

    public final void onPlaybackParametersChanged(C17986y0 y0Var) {
        C18089v0.C18090a E = mo69616E();
        mo69621J(E, 13, new C18048b0(E, y0Var));
    }

    public final void onPlaybackStateChanged(int i) {
        C18089v0.C18090a E = mo69616E();
        mo69621J(E, 5, new C18084t0(E, i, 0));
    }

    public final void onPlaybackSuppressionReasonChanged(int i) {
        C18089v0.C18090a E = mo69616E();
        mo69621J(E, 7, new C17907e0(E, i, 1));
    }

    public final void onPlayerError(ExoPlaybackException exoPlaybackException) {
        C17994f fVar = exoPlaybackException.mediaPeriodId;
        C18089v0.C18090a F = fVar != null ? mo69617F(new C14344i.C14345a(fVar)) : mo69616E();
        mo69621J(F, 11, new C18074o0(F, exoPlaybackException));
    }

    public final void onPlayerStateChanged(boolean z, int i) {
        C18089v0.C18090a E = mo69616E();
        mo69621J(E, -1, new C18075p(E, z, i));
    }

    public final void onPositionDiscontinuity(C17884a1.C17889e eVar, C17884a1.C17889e eVar2, int i) {
        if (i == 1) {
            this.f39485h = false;
        }
        C18087a aVar = this.f39481d;
        C17884a1 a1Var = this.f39484g;
        a1Var.getClass();
        aVar.f39489d = C18087a.m30547b(a1Var, aVar.f39487b, aVar.f39490e, aVar.f39486a);
        C18089v0.C18090a E = mo69616E();
        mo69621J(E, 12, new C18082s0(i, eVar, eVar2, E));
    }

    public final void onRepeatModeChanged(int i) {
        C18089v0.C18090a E = mo69616E();
        mo69621J(E, 9, new C18084t0(E, i, 1));
    }

    public final void onSeekProcessed() {
        C18089v0.C18090a E = mo69616E();
        mo69621J(E, -1, new C18071n(E));
    }

    public final void onShuffleModeEnabledChanged(boolean z) {
        C18089v0.C18090a E = mo69616E();
        mo69621J(E, 10, new C18085u(E, z));
    }

    public final void onSkipSilenceEnabledChanged(boolean z) {
        C18089v0.C18090a I = mo69620I();
        mo69621J(I, 1017, new C18066k0(I, z));
    }

    public final void onStaticMetadataChanged(List<Metadata> list) {
        C18089v0.C18090a E = mo69616E();
        mo69621J(E, 3, new C18091w(E, list));
    }

    public final void onSurfaceSizeChanged(int i, int i2) {
        C18089v0.C18090a I = mo69620I();
        mo69621J(I, 1029, new C18058g0(I, i, i2));
    }

    public final void onTimelineChanged(C17939k1 k1Var, int i) {
        C18087a aVar = this.f39481d;
        C17884a1 a1Var = this.f39484g;
        a1Var.getClass();
        aVar.f39489d = C18087a.m30547b(a1Var, aVar.f39487b, aVar.f39490e, aVar.f39486a);
        aVar.mo69623d(a1Var.mo69338r());
        C18089v0.C18090a E = mo69616E();
        mo69621J(E, 0, new C18077q(E, i));
    }

    public final void onTracksChanged(TrackGroupArray trackGroupArray, C18887e eVar) {
        C18089v0.C18090a E = mo69616E();
        mo69621J(E, 2, new C18064j0(E, trackGroupArray, eVar));
    }

    public final void onVideoSizeChanged(C14166q qVar) {
        C18089v0.C18090a I = mo69620I();
        mo69621J(I, 1028, new C18047b(I, qVar));
    }

    public final void onVolumeChanged(float f) {
        C18089v0.C18090a I = mo69620I();
        mo69621J(I, 1019, new C18078q0(I, f));
    }

    /* renamed from: p */
    public final void mo47106p(int i, long j) {
        C18089v0.C18090a F = mo69617F(this.f39481d.f39490e);
        mo69621J(F, 1023, new C18051d(i, j, F));
    }

    /* renamed from: q */
    public final void mo47107q(C18223d dVar) {
        C18089v0.C18090a I = mo69620I();
        mo69621J(I, 1020, new C18065k(I, dVar, 0));
    }

    /* renamed from: r */
    public final void mo47689r(int i, C14344i.C14345a aVar, C17993e eVar) {
        C18089v0.C18090a H = mo69619H(i, aVar);
        mo69621J(H, 1005, new C18052d0(H, eVar));
    }

    /* renamed from: s */
    public final void mo47108s(Format format, C18224e eVar) {
        C18089v0.C18090a I = mo69620I();
        mo69621J(I, 1022, new C18079r(I, format, eVar));
    }

    /* renamed from: t */
    public final void mo47690t(int i, C14344i.C14345a aVar, C17992d dVar, C17993e eVar) {
        C18089v0.C18090a H = mo69619H(i, aVar);
        mo69621J(H, CloseCodes.PROTOCOL_ERROR, new C18073o(H, dVar, eVar));
    }

    /* renamed from: u */
    public final void mo47247u(C18223d dVar) {
        C18089v0.C18090a I = mo69620I();
        mo69621J(I, 1008, new C18059h(I, dVar));
    }

    /* renamed from: v */
    public final void mo47328v(int i, C14344i.C14345a aVar) {
        C18089v0.C18090a H = mo69619H(i, aVar);
        mo69621J(H, 1031, new C18068l0(H));
    }

    /* renamed from: w */
    public final void mo47691w(int i, C14344i.C14345a aVar, C17992d dVar, C17993e eVar) {
        C18089v0.C18090a H = mo69619H(i, aVar);
        mo69621J(H, DateUtils.SEMI_MONTH, new C18046a0(H, dVar, eVar));
    }

    /* renamed from: x */
    public final void mo47248x(Exception exc) {
        C18089v0.C18090a I = mo69620I();
        mo69621J(I, 1037, new C18053e(I, exc, 1));
    }

    /* renamed from: y */
    public final void mo47109y(C18223d dVar) {
        C18089v0.C18090a F = mo69617F(this.f39481d.f39490e);
        mo69621J(F, 1025, new C18063j(F, dVar, 0));
    }

    /* renamed from: z */
    public final void mo47692z(int i, C14344i.C14345a aVar, C17992d dVar, C17993e eVar, IOException iOException, boolean z) {
        C18089v0.C18090a H = mo69619H(i, aVar);
        mo69621J(H, 1003, new C18083t(H, dVar, eVar, iOException, z));
    }
}
