package p594jh;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.common.base.C15791j;
import java.util.Arrays;
import java.util.List;
import p512bi.C14045d;
import p513bj.C14055g;
import p520cj.C14158j;
import p611lh.C18169f;
import p627nh.C18261b;
import p636oi.C18296a;
import p636oi.C18306i;
import p718yi.C18887e;

/* renamed from: jh.a1 */
public interface C17884a1 {

    /* renamed from: jh.a1$a */
    public static final class C17885a {

        /* renamed from: a */
        public final C14055g f38842a;

        static {
            new C14055g.C14056a().mo46879b();
        }

        public C17885a(C14055g gVar) {
            this.f38842a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17885a)) {
                return false;
            }
            return this.f38842a.equals(((C17885a) obj).f38842a);
        }

        public final int hashCode() {
            return this.f38842a.hashCode();
        }
    }

    @Deprecated
    /* renamed from: jh.a1$b */
    public interface C17886b {
        void onAvailableCommandsChanged(C17885a aVar) {
        }

        void onEvents(C17884a1 a1Var, C17887c cVar) {
        }

        void onIsLoadingChanged(boolean z) {
        }

        void onIsPlayingChanged(boolean z) {
        }

        @Deprecated
        void onLoadingChanged(boolean z) {
        }

        void onMediaItemTransition(C17954o0 o0Var, int i) {
        }

        void onMediaMetadataChanged(C17963p0 p0Var) {
        }

        void onPlayWhenReadyChanged(boolean z, int i) {
        }

        void onPlaybackParametersChanged(C17986y0 y0Var) {
        }

        void onPlaybackStateChanged(int i) {
        }

        void onPlaybackSuppressionReasonChanged(int i) {
        }

        void onPlayerError(ExoPlaybackException exoPlaybackException) {
        }

        @Deprecated
        void onPlayerStateChanged(boolean z, int i) {
        }

        @Deprecated
        void onPositionDiscontinuity(int i) {
        }

        void onPositionDiscontinuity(C17889e eVar, C17889e eVar2, int i) {
        }

        void onRepeatModeChanged(int i) {
        }

        @Deprecated
        void onSeekProcessed() {
        }

        void onShuffleModeEnabledChanged(boolean z) {
        }

        void onStaticMetadataChanged(List<Metadata> list) {
        }

        void onTimelineChanged(C17939k1 k1Var, int i) {
        }

        @Deprecated
        void onTimelineChanged(C17939k1 k1Var, Object obj, int i) {
        }

        void onTracksChanged(TrackGroupArray trackGroupArray, C18887e eVar) {
        }
    }

    /* renamed from: jh.a1$c */
    public static final class C17887c {

        /* renamed from: a */
        public final C14055g f38843a;

        public C17887c(C14055g gVar) {
            this.f38843a = gVar;
        }

        /* renamed from: a */
        public final boolean mo69353a(int i) {
            return this.f38843a.f30931a.get(i);
        }

        /* renamed from: b */
        public final boolean mo69354b(int... iArr) {
            C14055g gVar = this.f38843a;
            gVar.getClass();
            for (int i : iArr) {
                if (gVar.f30931a.get(i)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: jh.a1$d */
    public interface C17888d extends C14158j, C18169f, C18306i, C14045d, C18261b, C17886b {
        void onCues(List<C18296a> list) {
        }

        void onMetadata(Metadata metadata) {
        }
    }

    /* renamed from: jh.a1$e */
    public static final class C17889e {

        /* renamed from: a */
        public final Object f38844a;

        /* renamed from: b */
        public final int f38845b;

        /* renamed from: c */
        public final Object f38846c;

        /* renamed from: d */
        public final int f38847d;

        /* renamed from: e */
        public final long f38848e;

        /* renamed from: f */
        public final long f38849f;

        /* renamed from: g */
        public final int f38850g;

        /* renamed from: h */
        public final int f38851h;

        public C17889e(Object obj, int i, Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.f38844a = obj;
            this.f38845b = i;
            this.f38846c = obj2;
            this.f38847d = i2;
            this.f38848e = j;
            this.f38849f = j2;
            this.f38850g = i3;
            this.f38851h = i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C17889e.class != obj.getClass()) {
                return false;
            }
            C17889e eVar = (C17889e) obj;
            return this.f38845b == eVar.f38845b && this.f38847d == eVar.f38847d && this.f38848e == eVar.f38848e && this.f38849f == eVar.f38849f && this.f38850g == eVar.f38850g && this.f38851h == eVar.f38851h && C15791j.m25606a(this.f38844a, eVar.f38844a) && C15791j.m25606a(this.f38846c, eVar.f38846c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f38844a, Integer.valueOf(this.f38845b), this.f38846c, Integer.valueOf(this.f38847d), Integer.valueOf(this.f38845b), Long.valueOf(this.f38848e), Long.valueOf(this.f38849f), Integer.valueOf(this.f38850g), Integer.valueOf(this.f38851h)});
        }
    }

    /* renamed from: A */
    int mo69300A();

    /* renamed from: B */
    void mo69301B(TextureView textureView);

    /* renamed from: C */
    float mo69302C();

    /* renamed from: D */
    int mo69303D();

    /* renamed from: E */
    long mo69304E();

    /* renamed from: F */
    int mo69305F();

    /* renamed from: G */
    void mo69306G(C17888d dVar);

    /* renamed from: H */
    C17885a mo69307H();

    /* renamed from: I */
    int mo69308I();

    /* renamed from: J */
    void mo69309J(C17888d dVar);

    /* renamed from: K */
    void mo69310K(SurfaceView surfaceView);

    @Deprecated
    /* renamed from: L */
    void mo69311L();

    /* renamed from: M */
    boolean mo69312M();

    /* renamed from: N */
    long mo69313N();

    /* renamed from: a */
    C17986y0 mo69314a();

    /* renamed from: b */
    void mo69315b(C17986y0 y0Var);

    /* renamed from: c */
    void mo69316c(float f);

    /* renamed from: d */
    boolean mo69317d();

    /* renamed from: e */
    long mo69318e();

    /* renamed from: g */
    List<Metadata> mo69319g();

    long getCurrentPosition();

    long getDuration();

    int getPlaybackState();

    int getRepeatMode();

    /* renamed from: h */
    boolean mo69324h();

    /* renamed from: i */
    void mo69325i(SurfaceView surfaceView);

    boolean isPlaying();

    /* renamed from: j */
    int mo69327j();

    /* renamed from: k */
    ExoPlaybackException mo69328k();

    /* renamed from: l */
    void mo69329l(boolean z);

    /* renamed from: m */
    List<C18296a> mo69330m();

    /* renamed from: n */
    int mo69331n();

    /* renamed from: o */
    boolean mo69332o(int i);

    /* renamed from: p */
    int mo69333p();

    void pause();

    void play();

    void prepare();

    /* renamed from: q */
    TrackGroupArray mo69337q();

    /* renamed from: r */
    C17939k1 mo69338r();

    void release();

    /* renamed from: s */
    Looper mo69340s();

    void seekTo(long j);

    void setRepeatMode(int i);

    void stop();

    @Deprecated
    /* renamed from: t */
    void mo69344t(C17886b bVar);

    /* renamed from: u */
    void mo69345u(TextureView textureView);

    /* renamed from: v */
    C18887e mo69346v();

    /* renamed from: w */
    void mo69347w(int i, long j);

    /* renamed from: x */
    boolean mo69348x();

    /* renamed from: y */
    void mo69349y(boolean z);

    @Deprecated
    /* renamed from: z */
    void mo69350z(C17886b bVar);
}
