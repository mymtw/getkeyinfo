package p594jh;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.etsy.android.lib.requests.EtsyRequest;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoTimeoutException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.IllegalSeekPositionException;
import com.google.android.exoplayer2.audio.C14189a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.C14344i;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import p505aj.C13992c;
import p512bi.C14045d;
import p513bj.C14049b0;
import p513bj.C14050c;
import p513bj.C14055g;
import p513bj.C14060k;
import p513bj.C14075p;
import p513bj.C14082v;
import p513bj.C14083w;
import p520cj.C14153g;
import p520cj.C14154h;
import p520cj.C14158j;
import p520cj.C14164p;
import p520cj.C14166q;
import p548dj.C17560a;
import p594jh.C17884a1;
import p594jh.C17890b;
import p594jh.C17894b1;
import p594jh.C17900d;
import p594jh.C17916h0;
import p594jh.C17927j1;
import p594jh.C17931k0;
import p594jh.C17950n;
import p594jh.C17963p0;
import p594jh.C17978w0;
import p595ji.C17999k;
import p602kh.C18076p0;
import p602kh.C18080r0;
import p602kh.C18086u0;
import p602kh.C18089v0;
import p611lh.C18167d;
import p611lh.C18169f;
import p619mh.C18223d;
import p619mh.C18224e;
import p627nh.C18260a;
import p627nh.C18261b;
import p636oi.C18296a;
import p636oi.C18306i;
import p718yi.C18887e;
import p718yi.C18888f;

/* renamed from: jh.i1 */
public final class C17921i1 extends C17906e implements C17950n {

    /* renamed from: A */
    public int f38945A;

    /* renamed from: B */
    public int f38946B;

    /* renamed from: C */
    public int f38947C;

    /* renamed from: D */
    public C18167d f38948D;

    /* renamed from: E */
    public float f38949E;

    /* renamed from: F */
    public boolean f38950F;

    /* renamed from: G */
    public List<C18296a> f38951G;

    /* renamed from: H */
    public boolean f38952H;

    /* renamed from: I */
    public boolean f38953I;

    /* renamed from: J */
    public C18260a f38954J;

    /* renamed from: b */
    public final C17904d1[] f38955b;

    /* renamed from: c */
    public final C14050c f38956c;

    /* renamed from: d */
    public final C17916h0 f38957d;

    /* renamed from: e */
    public final C17923b f38958e;

    /* renamed from: f */
    public final C17924c f38959f;

    /* renamed from: g */
    public final CopyOnWriteArraySet<C14158j> f38960g;

    /* renamed from: h */
    public final CopyOnWriteArraySet<C18169f> f38961h;

    /* renamed from: i */
    public final CopyOnWriteArraySet<C18306i> f38962i;

    /* renamed from: j */
    public final CopyOnWriteArraySet<C14045d> f38963j;

    /* renamed from: k */
    public final CopyOnWriteArraySet<C18261b> f38964k;

    /* renamed from: l */
    public final C18086u0 f38965l;

    /* renamed from: m */
    public final C17890b f38966m;

    /* renamed from: n */
    public final C17900d f38967n;

    /* renamed from: o */
    public final C17927j1 f38968o;

    /* renamed from: p */
    public final C17946l1 f38969p;

    /* renamed from: q */
    public final C17949m1 f38970q;

    /* renamed from: r */
    public final long f38971r;

    /* renamed from: s */
    public AudioTrack f38972s;

    /* renamed from: t */
    public Object f38973t;

    /* renamed from: u */
    public Surface f38974u;

    /* renamed from: v */
    public SurfaceHolder f38975v;

    /* renamed from: w */
    public SphericalGLSurfaceView f38976w;

    /* renamed from: x */
    public boolean f38977x;

    /* renamed from: y */
    public TextureView f38978y;

    /* renamed from: z */
    public int f38979z;

    /* renamed from: jh.i1$a */
    public static final class C17922a {

        /* renamed from: a */
        public final Context f38980a;

        /* renamed from: b */
        public final C17914g1 f38981b;

        /* renamed from: c */
        public C14082v f38982c;

        /* renamed from: d */
        public C18888f f38983d;

        /* renamed from: e */
        public C17999k f38984e;

        /* renamed from: f */
        public C17930k f38985f;

        /* renamed from: g */
        public C13992c f38986g;

        /* renamed from: h */
        public C18086u0 f38987h;

        /* renamed from: i */
        public Looper f38988i;

        /* renamed from: j */
        public C18167d f38989j;

        /* renamed from: k */
        public int f38990k;

        /* renamed from: l */
        public boolean f38991l;

        /* renamed from: m */
        public C17918h1 f38992m;

        /* renamed from: n */
        public C17925j f38993n;

        /* renamed from: o */
        public long f38994o;

        /* renamed from: p */
        public long f38995p;

        /* renamed from: q */
        public boolean f38996q;

        /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C17922a(android.content.Context r19) {
            /*
                r18 = this;
                r1 = r18
                r0 = r19
                jh.m r2 = new jh.m
                r2.<init>(r0)
                ph.f r3 = new ph.f
                r3.<init>()
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector r4 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector
                com.google.android.exoplayer2.trackselection.a$b r5 = new com.google.android.exoplayer2.trackselection.a$b
                r5.<init>()
                com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r6 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.getDefaults(r19)
                r4.<init>(r6, r5)
                com.google.android.exoplayer2.source.d r5 = new com.google.android.exoplayer2.source.d
                r5.<init>(r0, r3)
                jh.k r3 = new jh.k
                r3.<init>()
                com.google.common.collect.ImmutableListMultimap<java.lang.String, java.lang.Integer> r6 = p505aj.C14005l.f30792n
                java.lang.Class<aj.l> r6 = p505aj.C14005l.class
                monitor-enter(r6)
                aj.l r7 = p505aj.C14005l.f30799u     // Catch:{ all -> 0x01bd }
                r8 = 1
                if (r7 != 0) goto L_0x0166
                if (r0 != 0) goto L_0x0034
                r7 = 0
                goto L_0x0038
            L_0x0034:
                android.content.Context r7 = r19.getApplicationContext()     // Catch:{ all -> 0x01bd }
            L_0x0038:
                r10 = r7
                int r7 = p513bj.C14049b0.f30913a     // Catch:{ all -> 0x01bd }
                if (r0 == 0) goto L_0x0056
                java.lang.String r7 = "phone"
                java.lang.Object r7 = r0.getSystemService(r7)     // Catch:{ all -> 0x01bd }
                android.telephony.TelephonyManager r7 = (android.telephony.TelephonyManager) r7     // Catch:{ all -> 0x01bd }
                if (r7 == 0) goto L_0x0056
                java.lang.String r7 = r7.getNetworkCountryIso()     // Catch:{ all -> 0x01bd }
                boolean r9 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x01bd }
                if (r9 != 0) goto L_0x0056
                java.lang.String r7 = p001a0.C0005b.m58r0(r7)     // Catch:{ all -> 0x01bd }
                goto L_0x0062
            L_0x0056:
                java.util.Locale r7 = java.util.Locale.getDefault()     // Catch:{ all -> 0x01bd }
                java.lang.String r7 = r7.getCountry()     // Catch:{ all -> 0x01bd }
                java.lang.String r7 = p001a0.C0005b.m58r0(r7)     // Catch:{ all -> 0x01bd }
            L_0x0062:
                com.google.common.collect.ImmutableListMultimap<java.lang.String, java.lang.Integer> r9 = p505aj.C14005l.f30792n     // Catch:{ all -> 0x01bd }
                com.google.common.collect.ImmutableList r7 = r9.get((java.lang.Object) r7)     // Catch:{ all -> 0x01bd }
                boolean r9 = r7.isEmpty()     // Catch:{ all -> 0x01bd }
                r11 = 2
                if (r9 == 0) goto L_0x008b
                java.lang.Integer r12 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x01bd }
                java.lang.Integer r13 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x01bd }
                java.lang.Integer r14 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x01bd }
                java.lang.Integer r15 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x01bd }
                java.lang.Integer r16 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x01bd }
                java.lang.Integer r17 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x01bd }
                com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.m25832of(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x01bd }
            L_0x008b:
                java.util.HashMap r12 = new java.util.HashMap     // Catch:{ all -> 0x01bd }
                r9 = 8
                r12.<init>(r9)     // Catch:{ all -> 0x01bd }
                r9 = 0
                java.lang.Integer r13 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01bd }
                r14 = 1000000(0xf4240, double:4.940656E-318)
                java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x01bd }
                r12.put(r13, r14)     // Catch:{ all -> 0x01bd }
                java.lang.Integer r13 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x01bd }
                com.google.common.collect.ImmutableList<java.lang.Long> r14 = p505aj.C14005l.f30793o     // Catch:{ all -> 0x01bd }
                java.lang.Object r15 = r7.get(r9)     // Catch:{ all -> 0x01bd }
                java.lang.Integer r15 = (java.lang.Integer) r15     // Catch:{ all -> 0x01bd }
                int r15 = r15.intValue()     // Catch:{ all -> 0x01bd }
                java.lang.Object r15 = r14.get(r15)     // Catch:{ all -> 0x01bd }
                java.lang.Long r15 = (java.lang.Long) r15     // Catch:{ all -> 0x01bd }
                r12.put(r13, r15)     // Catch:{ all -> 0x01bd }
                r13 = 3
                java.lang.Integer r15 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x01bd }
                com.google.common.collect.ImmutableList<java.lang.Long> r9 = p505aj.C14005l.f30794p     // Catch:{ all -> 0x01bd }
                java.lang.Object r17 = r7.get(r8)     // Catch:{ all -> 0x01bd }
                java.lang.Integer r17 = (java.lang.Integer) r17     // Catch:{ all -> 0x01bd }
                int r8 = r17.intValue()     // Catch:{ all -> 0x01bd }
                java.lang.Object r8 = r9.get(r8)     // Catch:{ all -> 0x01bd }
                java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x01bd }
                r12.put(r15, r8)     // Catch:{ all -> 0x01bd }
                r8 = 4
                java.lang.Integer r9 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x01bd }
                com.google.common.collect.ImmutableList<java.lang.Long> r15 = p505aj.C14005l.f30795q     // Catch:{ all -> 0x01bd }
                java.lang.Object r11 = r7.get(r11)     // Catch:{ all -> 0x01bd }
                java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ all -> 0x01bd }
                int r11 = r11.intValue()     // Catch:{ all -> 0x01bd }
                java.lang.Object r11 = r15.get(r11)     // Catch:{ all -> 0x01bd }
                java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x01bd }
                r12.put(r9, r11)     // Catch:{ all -> 0x01bd }
                r9 = 5
                java.lang.Integer r11 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01bd }
                com.google.common.collect.ImmutableList<java.lang.Long> r15 = p505aj.C14005l.f30796r     // Catch:{ all -> 0x01bd }
                java.lang.Object r13 = r7.get(r13)     // Catch:{ all -> 0x01bd }
                java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ all -> 0x01bd }
                int r13 = r13.intValue()     // Catch:{ all -> 0x01bd }
                java.lang.Object r13 = r15.get(r13)     // Catch:{ all -> 0x01bd }
                java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ all -> 0x01bd }
                r12.put(r11, r13)     // Catch:{ all -> 0x01bd }
                r11 = 10
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x01bd }
                com.google.common.collect.ImmutableList<java.lang.Long> r13 = p505aj.C14005l.f30797s     // Catch:{ all -> 0x01bd }
                java.lang.Object r8 = r7.get(r8)     // Catch:{ all -> 0x01bd }
                java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x01bd }
                int r8 = r8.intValue()     // Catch:{ all -> 0x01bd }
                java.lang.Object r8 = r13.get(r8)     // Catch:{ all -> 0x01bd }
                java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x01bd }
                r12.put(r11, r8)     // Catch:{ all -> 0x01bd }
                r8 = 9
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x01bd }
                com.google.common.collect.ImmutableList<java.lang.Long> r11 = p505aj.C14005l.f30798t     // Catch:{ all -> 0x01bd }
                java.lang.Object r9 = r7.get(r9)     // Catch:{ all -> 0x01bd }
                java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x01bd }
                int r9 = r9.intValue()     // Catch:{ all -> 0x01bd }
                java.lang.Object r9 = r11.get(r9)     // Catch:{ all -> 0x01bd }
                java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x01bd }
                r12.put(r8, r9)     // Catch:{ all -> 0x01bd }
                r8 = 7
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x01bd }
                r9 = 0
                java.lang.Object r7 = r7.get(r9)     // Catch:{ all -> 0x01bd }
                java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x01bd }
                int r7 = r7.intValue()     // Catch:{ all -> 0x01bd }
                java.lang.Object r7 = r14.get(r7)     // Catch:{ all -> 0x01bd }
                java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x01bd }
                r12.put(r8, r7)     // Catch:{ all -> 0x01bd }
                r7 = 2000(0x7d0, float:2.803E-42)
                bj.v r13 = p513bj.C14046a.f30907a     // Catch:{ all -> 0x01bd }
                aj.l r8 = new aj.l     // Catch:{ all -> 0x01bd }
                r14 = 1
                r9 = r8
                r11 = r12
                r12 = r7
                r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x01bd }
                p505aj.C14005l.f30799u = r8     // Catch:{ all -> 0x01bd }
            L_0x0166:
                aj.l r7 = p505aj.C14005l.f30799u     // Catch:{ all -> 0x01bd }
                monitor-exit(r6)
                kh.u0 r6 = new kh.u0
                bj.v r8 = p513bj.C14046a.f30907a
                r6.<init>()
                r18.<init>()
                r1.f38980a = r0
                r1.f38981b = r2
                r1.f38983d = r4
                r1.f38984e = r5
                r1.f38985f = r3
                r1.f38986g = r7
                r1.f38987h = r6
                int r0 = p513bj.C14049b0.f30913a
                android.os.Looper r0 = android.os.Looper.myLooper()
                if (r0 == 0) goto L_0x018a
                goto L_0x018e
            L_0x018a:
                android.os.Looper r0 = android.os.Looper.getMainLooper()
            L_0x018e:
                r1.f38988i = r0
                lh.d r0 = p611lh.C18167d.f39738f
                r1.f38989j = r0
                r0 = 1
                r1.f38990k = r0
                r1.f38991l = r0
                jh.h1 r0 = p594jh.C17918h1.f38938d
                r1.f38992m = r0
                r2 = 20
                long r10 = p594jh.C17912g.m30087a(r2)
                r2 = 500(0x1f4, double:2.47E-321)
                long r12 = p594jh.C17912g.m30087a(r2)
                r14 = 1065336439(0x3f7fbe77, float:0.999)
                jh.j r0 = new jh.j
                r9 = r0
                r9.<init>(r10, r12, r14)
                r1.f38993n = r0
                r1.f38982c = r8
                r1.f38994o = r2
                r2 = 2000(0x7d0, double:9.88E-321)
                r1.f38995p = r2
                return
            L_0x01bd:
                r0 = move-exception
                monitor-exit(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p594jh.C17921i1.C17922a.<init>(android.content.Context):void");
        }
    }

    /* renamed from: jh.i1$b */
    public final class C17923b implements C14164p, C14189a, C18306i, C14045d, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.C14442b, C17900d.C17902b, C17890b.C17892b, C17927j1.C17928a, C17884a1.C17886b, C17950n.C17951a {
        public C17923b() {
        }

        /* renamed from: C */
        public final void mo47100C(long j, long j2, String str) {
            C17921i1.this.f38965l.mo47100C(j, j2, str);
        }

        /* renamed from: a */
        public final void mo47101a(String str) {
            C17921i1.this.f38965l.mo47101a(str);
        }

        /* renamed from: b */
        public final void mo47239b(String str) {
            C17921i1.this.f38965l.mo47239b(str);
        }

        /* renamed from: c */
        public final void mo48210c(Surface surface) {
            C17921i1.this.mo69404W(surface);
        }

        /* renamed from: d */
        public final void mo47240d(C18223d dVar) {
            C17921i1.this.f38965l.mo47240d(dVar);
            C17921i1.this.getClass();
            C17921i1.this.getClass();
        }

        /* renamed from: e */
        public final void mo47241e(Exception exc) {
            C17921i1.this.f38965l.mo47241e(exc);
        }

        /* renamed from: f */
        public final void mo47242f(long j) {
            C17921i1.this.f38965l.mo47242f(j);
        }

        /* renamed from: g */
        public final void mo47243g(Format format, C18224e eVar) {
            C17921i1.this.getClass();
            C17921i1.this.f38965l.mo47243g(format, eVar);
        }

        /* renamed from: h */
        public final void mo47102h(Exception exc) {
            C17921i1.this.f38965l.mo47102h(exc);
        }

        /* renamed from: i */
        public final void mo47103i(long j, Object obj) {
            C17921i1.this.f38965l.mo47103i(j, obj);
            C17921i1 i1Var = C17921i1.this;
            if (i1Var.f38973t == obj) {
                Iterator<C14158j> it = i1Var.f38960g.iterator();
                while (it.hasNext()) {
                    it.next().onRenderedFirstFrame();
                }
            }
        }

        /* renamed from: j */
        public final void mo48211j() {
            C17921i1.this.mo69404W((Object) null);
        }

        /* renamed from: k */
        public final void mo47244k(long j, long j2, String str) {
            C17921i1.this.f38965l.mo47244k(j, j2, str);
        }

        /* renamed from: l */
        public final void mo47104l(int i, long j) {
            C17921i1.this.f38965l.mo47104l(i, j);
        }

        /* renamed from: m */
        public final void mo69407m() {
            C17921i1.m30163O(C17921i1.this);
        }

        /* renamed from: o */
        public final void mo47245o(long j, long j2, int i) {
            C17921i1.this.f38965l.mo47245o(j, j2, i);
        }

        public final void onCues(List<C18296a> list) {
            C17921i1 i1Var = C17921i1.this;
            i1Var.f38951G = list;
            Iterator<C18306i> it = i1Var.f38962i.iterator();
            while (it.hasNext()) {
                it.next().onCues(list);
            }
        }

        public final void onIsLoadingChanged(boolean z) {
            C17921i1.this.getClass();
        }

        public final void onMetadata(Metadata metadata) {
            C17921i1.this.f38965l.onMetadata(metadata);
            C17916h0 h0Var = C17921i1.this.f38957d;
            C17963p0 p0Var = h0Var.f38906B;
            p0Var.getClass();
            C17963p0.C17964a aVar = new C17963p0.C17964a(p0Var);
            for (int i = 0; i < metadata.length(); i++) {
                metadata.get(i).populateMediaMetadata(aVar);
            }
            C17963p0 p0Var2 = new C17963p0(aVar);
            if (!p0Var2.equals(h0Var.f38906B)) {
                h0Var.f38906B = p0Var2;
                C14060k<C17884a1.C17886b> kVar = h0Var.f38917i;
                kVar.mo46883b(15, new C17977w(h0Var, 0));
                kVar.mo46882a();
            }
            Iterator<C14045d> it = C17921i1.this.f38963j.iterator();
            while (it.hasNext()) {
                it.next().onMetadata(metadata);
            }
        }

        public final void onPlayWhenReadyChanged(boolean z, int i) {
            C17921i1.m30163O(C17921i1.this);
        }

        public final void onPlaybackStateChanged(int i) {
            C17921i1.m30163O(C17921i1.this);
        }

        public final void onSkipSilenceEnabledChanged(boolean z) {
            C17921i1 i1Var = C17921i1.this;
            if (i1Var.f38950F != z) {
                i1Var.f38950F = z;
                i1Var.f38965l.onSkipSilenceEnabledChanged(z);
                Iterator<C18169f> it = i1Var.f38961h.iterator();
                while (it.hasNext()) {
                    it.next().onSkipSilenceEnabledChanged(i1Var.f38950F);
                }
            }
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C17921i1 i1Var = C17921i1.this;
            i1Var.getClass();
            Surface surface = new Surface(surfaceTexture);
            i1Var.mo69404W(surface);
            i1Var.f38974u = surface;
            C17921i1.this.mo69399R(i, i2);
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C17921i1.this.mo69404W((Object) null);
            C17921i1.this.mo69399R(0, 0);
            return true;
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C17921i1.this.mo69399R(i, i2);
        }

        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public final void onVideoSizeChanged(C14166q qVar) {
            C17921i1.this.getClass();
            C17921i1.this.f38965l.onVideoSizeChanged(qVar);
            Iterator<C14158j> it = C17921i1.this.f38960g.iterator();
            while (it.hasNext()) {
                C14158j next = it.next();
                next.onVideoSizeChanged(qVar);
                next.onVideoSizeChanged(qVar.f31268a, qVar.f31269b, qVar.f31270c, qVar.f31271d);
            }
        }

        /* renamed from: p */
        public final void mo47106p(int i, long j) {
            C17921i1.this.f38965l.mo47106p(i, j);
        }

        /* renamed from: q */
        public final void mo47107q(C18223d dVar) {
            C17921i1.this.getClass();
            C17921i1.this.f38965l.mo47107q(dVar);
        }

        /* renamed from: s */
        public final void mo47108s(Format format, C18224e eVar) {
            C17921i1.this.getClass();
            C17921i1.this.f38965l.mo47108s(format, eVar);
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C17921i1.this.mo69399R(i2, i3);
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            C17921i1 i1Var = C17921i1.this;
            if (i1Var.f38977x) {
                i1Var.mo69404W(surfaceHolder.getSurface());
            }
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C17921i1 i1Var = C17921i1.this;
            if (i1Var.f38977x) {
                i1Var.mo69404W((Object) null);
            }
            C17921i1.this.mo69399R(0, 0);
        }

        /* renamed from: u */
        public final void mo47247u(C18223d dVar) {
            C17921i1.this.getClass();
            C17921i1.this.f38965l.mo47247u(dVar);
        }

        /* renamed from: x */
        public final void mo47248x(Exception exc) {
            C17921i1.this.f38965l.mo47248x(exc);
        }

        /* renamed from: y */
        public final void mo47109y(C18223d dVar) {
            C17921i1.this.f38965l.mo47109y(dVar);
            C17921i1.this.getClass();
            C17921i1.this.getClass();
        }
    }

    /* renamed from: jh.i1$c */
    public static final class C17924c implements C14154h, C17560a, C17894b1.C17896b {

        /* renamed from: b */
        public C14154h f38998b;

        /* renamed from: c */
        public C17560a f38999c;

        /* renamed from: d */
        public C14154h f39000d;

        /* renamed from: e */
        public C17560a f39001e;

        /* renamed from: a */
        public final void mo47086a(long j, long j2, Format format, MediaFormat mediaFormat) {
            C14154h hVar = this.f39000d;
            if (hVar != null) {
                hVar.mo47086a(j, j2, format, mediaFormat);
            }
            C14154h hVar2 = this.f38998b;
            if (hVar2 != null) {
                hVar2.mo47086a(j, j2, format, mediaFormat);
            }
        }

        /* renamed from: b */
        public final void mo68897b(long j, float[] fArr) {
            C17560a aVar = this.f39001e;
            if (aVar != null) {
                aVar.mo68897b(j, fArr);
            }
            C17560a aVar2 = this.f38999c;
            if (aVar2 != null) {
                aVar2.mo68897b(j, fArr);
            }
        }

        /* renamed from: c */
        public final void mo68898c() {
            C17560a aVar = this.f39001e;
            if (aVar != null) {
                aVar.mo68898c();
            }
            C17560a aVar2 = this.f38999c;
            if (aVar2 != null) {
                aVar2.mo68898c();
            }
        }

        public final void handleMessage(int i, Object obj) {
            if (i == 6) {
                this.f38998b = (C14154h) obj;
            } else if (i == 7) {
                this.f38999c = (C17560a) obj;
            } else if (i == 10000) {
                SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
                if (sphericalGLSurfaceView == null) {
                    this.f39000d = null;
                    this.f39001e = null;
                    return;
                }
                this.f39000d = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.f39001e = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }
    }

    public C17921i1(C17922a aVar) {
        C17921i1 i1Var;
        C17924c cVar;
        C17923b bVar;
        C17916h0 h0Var;
        Handler handler;
        C17922a aVar2 = aVar;
        C14050c cVar2 = new C14050c();
        this.f38956c = cVar2;
        try {
            Context applicationContext = aVar2.f38980a.getApplicationContext();
            C18086u0 u0Var = aVar2.f38987h;
            this.f38965l = u0Var;
            this.f38948D = aVar2.f38989j;
            this.f38979z = aVar2.f38990k;
            this.f38950F = false;
            this.f38971r = aVar2.f38995p;
            C17923b bVar2 = new C17923b();
            this.f38958e = bVar2;
            C17924c cVar3 = new C17924c();
            this.f38959f = cVar3;
            this.f38960g = new CopyOnWriteArraySet<>();
            this.f38961h = new CopyOnWriteArraySet<>();
            this.f38962i = new CopyOnWriteArraySet<>();
            this.f38963j = new CopyOnWriteArraySet<>();
            this.f38964k = new CopyOnWriteArraySet<>();
            Handler handler2 = new Handler(aVar2.f38988i);
            C17904d1[] a = ((C17947m) aVar2.f38981b).mo69491a(handler2, bVar2, bVar2, bVar2, bVar2);
            this.f38955b = a;
            this.f38949E = 1.0f;
            if (C14049b0.f30913a < 21) {
                AudioTrack audioTrack = this.f38972s;
                if (!(audioTrack == null || audioTrack.getAudioSessionId() == 0)) {
                    this.f38972s.release();
                    this.f38972s = null;
                }
                if (this.f38972s == null) {
                    this.f38972s = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.f38947C = this.f38972s.getAudioSessionId();
            } else {
                UUID uuid = C17912g.f38897a;
                AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
                this.f38947C = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            }
            this.f38951G = Collections.emptyList();
            this.f38952H = true;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {15, 16, 17, 18, 19, 20, 21, 22};
            for (int i = 0; i < 8; i++) {
                int i2 = iArr[i];
                C14075p.m21694f(!false);
                sparseBooleanArray.append(i2, true);
            }
            C14075p.m21694f(!false);
            C17884a1.C17885a aVar3 = new C17884a1.C17885a(new C14055g(sparseBooleanArray));
            C18888f fVar = aVar2.f38983d;
            C17999k kVar = aVar2.f38984e;
            C17930k kVar2 = aVar2.f38985f;
            C13992c cVar4 = aVar2.f38986g;
            boolean z = aVar2.f38991l;
            C17918h1 h1Var = aVar2.f38992m;
            C17884a1.C17885a aVar4 = aVar3;
            C17925j jVar = aVar2.f38993n;
            C14050c cVar5 = cVar2;
            try {
                long j = aVar2.f38994o;
                C14082v vVar = aVar2.f38982c;
                Looper looper = aVar2.f38988i;
                boolean z2 = z;
                C17904d1[] d1VarArr = a;
                Handler handler3 = handler2;
                C17999k kVar3 = kVar;
                C17924c cVar6 = cVar3;
                C17930k kVar4 = kVar2;
                C17923b bVar3 = bVar2;
                cVar = cVar6;
                bVar = bVar3;
                h0Var = r1;
                handler = handler3;
                C17916h0 h0Var2 = new C17916h0(d1VarArr, fVar, kVar3, kVar4, cVar4, u0Var, z2, h1Var, jVar, j, vVar, looper, this, aVar4);
                i1Var = this;
            } catch (Throwable th) {
                th = th;
                i1Var = this;
                i1Var.f38956c.mo46870a();
                throw th;
            }
            try {
                i1Var.f38957d = h0Var;
                C17923b bVar4 = bVar;
                h0Var.mo69350z(bVar4);
                h0Var.f38918j.add(bVar4);
                C17923b bVar5 = bVar4;
                C17922a aVar5 = aVar;
                Handler handler4 = handler;
                C17890b bVar6 = new C17890b(aVar5.f38980a, handler4, bVar5);
                i1Var.f38966m = bVar6;
                bVar6.mo69357a();
                C17900d dVar = new C17900d(aVar5.f38980a, handler4, bVar5);
                i1Var.f38967n = dVar;
                dVar.mo69366c();
                C17927j1 j1Var = new C17927j1(aVar5.f38980a, handler4, bVar5);
                i1Var.f38968o = j1Var;
                j1Var.mo69416b(C14049b0.m21649v(i1Var.f38948D.f39741c));
                i1Var.f38969p = new C17946l1(aVar5.f38980a);
                i1Var.f38970q = new C17949m1(aVar5.f38980a);
                i1Var.f38954J = m30164Q(j1Var);
                i1Var.mo69401T(1, 102, Integer.valueOf(i1Var.f38947C));
                i1Var.mo69401T(2, 102, Integer.valueOf(i1Var.f38947C));
                i1Var.mo69401T(1, 3, i1Var.f38948D);
                i1Var.mo69401T(2, 4, Integer.valueOf(i1Var.f38979z));
                i1Var.mo69401T(1, 101, Boolean.valueOf(i1Var.f38950F));
                C17924c cVar7 = cVar;
                i1Var.mo69401T(2, 6, cVar7);
                i1Var.mo69401T(6, 7, cVar7);
                cVar5.mo46870a();
            } catch (Throwable th2) {
                th = th2;
                i1Var.f38956c.mo46870a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            i1Var = this;
            i1Var.f38956c.mo46870a();
            throw th;
        }
    }

    /* renamed from: O */
    public static void m30163O(C17921i1 i1Var) {
        int playbackState = i1Var.getPlaybackState();
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                i1Var.mo69406Y();
                boolean z = i1Var.f38957d.f38907C.f39319p;
                C17946l1 l1Var = i1Var.f38969p;
                boolean x = i1Var.mo69348x();
                l1Var.getClass();
                C17949m1 m1Var = i1Var.f38970q;
                i1Var.mo69348x();
                m1Var.getClass();
                return;
            } else if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        i1Var.f38969p.getClass();
        i1Var.f38970q.getClass();
    }

    /* renamed from: Q */
    public static C18260a m30164Q(C17927j1 j1Var) {
        j1Var.getClass();
        return new C18260a(C14049b0.f30913a >= 28 ? j1Var.f39021d.getStreamMinVolume(j1Var.f39023f) : 0, j1Var.f39021d.getStreamMaxVolume(j1Var.f39023f));
    }

    /* renamed from: A */
    public final int mo69300A() {
        mo69406Y();
        return this.f38957d.mo69300A();
    }

    /* renamed from: B */
    public final void mo69301B(TextureView textureView) {
        mo69406Y();
        if (textureView != null && textureView == this.f38978y) {
            mo69398P();
        }
    }

    /* renamed from: C */
    public final float mo69302C() {
        return this.f38949E;
    }

    /* renamed from: D */
    public final int mo69303D() {
        mo69406Y();
        return this.f38957d.mo69303D();
    }

    /* renamed from: E */
    public final long mo69304E() {
        mo69406Y();
        return this.f38957d.mo69304E();
    }

    /* renamed from: G */
    public final void mo69306G(C17884a1.C17888d dVar) {
        dVar.getClass();
        this.f38961h.add(dVar);
        this.f38960g.add(dVar);
        this.f38962i.add(dVar);
        this.f38963j.add(dVar);
        this.f38964k.add(dVar);
        this.f38957d.mo69350z(dVar);
    }

    /* renamed from: H */
    public final C17884a1.C17885a mo69307H() {
        mo69406Y();
        return this.f38957d.f38905A;
    }

    /* renamed from: J */
    public final void mo69309J(C17884a1.C17888d dVar) {
        dVar.getClass();
        this.f38961h.remove(dVar);
        this.f38960g.remove(dVar);
        this.f38962i.remove(dVar);
        this.f38963j.remove(dVar);
        this.f38964k.remove(dVar);
        mo69344t(dVar);
    }

    /* renamed from: K */
    public final void mo69310K(SurfaceView surfaceView) {
        mo69406Y();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        mo69406Y();
        if (holder != null && holder == this.f38975v) {
            mo69398P();
        }
    }

    /* renamed from: L */
    public final void mo69311L() {
        mo69406Y();
        this.f38967n.mo69368e(1, mo69348x());
        this.f38957d.mo69390W((ExoPlaybackException) null);
        this.f38951G = Collections.emptyList();
    }

    /* renamed from: M */
    public final boolean mo69312M() {
        mo69406Y();
        return this.f38957d.f38928t;
    }

    /* renamed from: N */
    public final long mo69313N() {
        mo69406Y();
        return this.f38957d.mo69313N();
    }

    /* renamed from: P */
    public final void mo69398P() {
        mo69406Y();
        mo69400S();
        mo69404W((Object) null);
        mo69399R(0, 0);
    }

    /* renamed from: R */
    public final void mo69399R(int i, int i2) {
        if (i != this.f38945A || i2 != this.f38946B) {
            this.f38945A = i;
            this.f38946B = i2;
            this.f38965l.onSurfaceSizeChanged(i, i2);
            Iterator<C14158j> it = this.f38960g.iterator();
            while (it.hasNext()) {
                it.next().onSurfaceSizeChanged(i, i2);
            }
        }
    }

    /* renamed from: S */
    public final void mo69400S() {
        if (this.f38976w != null) {
            C17894b1 O = this.f38957d.mo69384O(this.f38959f);
            C14075p.m21694f(!O.f38865g);
            O.f38862d = EtsyRequest.DEFAULT_TIMEOUT;
            C14075p.m21694f(!O.f38865g);
            O.f38863e = null;
            O.mo69362c();
            this.f38976w.removeVideoSurfaceListener(this.f38958e);
            this.f38976w = null;
        }
        TextureView textureView = this.f38978y;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f38958e) {
                Log.w("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f38978y.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            this.f38978y = null;
        }
        SurfaceHolder surfaceHolder = this.f38975v;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f38958e);
            this.f38975v = null;
        }
    }

    /* renamed from: T */
    public final void mo69401T(int i, int i2, Object obj) {
        for (C17904d1 d1Var : this.f38955b) {
            if (d1Var.getTrackType() == i) {
                C17894b1 O = this.f38957d.mo69384O(d1Var);
                C14075p.m21694f(!O.f38865g);
                O.f38862d = i2;
                C14075p.m21694f(!O.f38865g);
                O.f38863e = obj;
                O.mo69362c();
            }
        }
    }

    /* renamed from: U */
    public final void mo69402U(List list) {
        mo69406Y();
        C17916h0 h0Var = this.f38957d;
        h0Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(h0Var.f38922n.mo47693a((C17954o0) list.get(i)));
        }
        h0Var.mo69386Q();
        h0Var.getCurrentPosition();
        h0Var.f38929u++;
        if (!h0Var.f38920l.isEmpty()) {
            int size = h0Var.f38920l.size();
            for (int i2 = size - 1; i2 >= 0; i2--) {
                h0Var.f38920l.remove(i2);
            }
            h0Var.f38934z = h0Var.f38934z.mo69566a(size);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C17978w0.C17981c cVar = new C17978w0.C17981c((C14344i) arrayList.get(i3), h0Var.f38921m);
            arrayList2.add(cVar);
            h0Var.f38920l.add(i3 + 0, new C17916h0.C17917a(cVar.f39297a.f31823n, cVar.f39298b));
        }
        h0Var.f38934z = h0Var.f38934z.mo69572g(arrayList2.size());
        C17899c1 c1Var = new C17899c1(h0Var.f38920l, h0Var.f38934z);
        if (c1Var.mo69481p() || -1 < c1Var.f38870f) {
            int a = c1Var.mo69294a(h0Var.f38928t);
            C17984x0 U = h0Var.mo69388U(h0Var.f38907C, c1Var, h0Var.mo69387R(c1Var, a, -9223372036854775807L));
            int i4 = U.f39308e;
            if (!(a == -1 || i4 == 1)) {
                i4 = (c1Var.mo69481p() || a >= c1Var.f38870f) ? 4 : 2;
            }
            C17984x0 g = U.mo69551g(i4);
            ((C14083w) h0Var.f38916h.f39058h).mo46949a(17, new C17931k0.C17932a(arrayList2, h0Var.f38934z, a, C17912g.m30087a(-9223372036854775807L))).mo46951a();
            h0Var.mo69392Y(g, 0, 1, false, !h0Var.f38907C.f39305b.f39346a.equals(g.f39305b.f39346a) && !h0Var.f38907C.f39304a.mo69481p(), 4, h0Var.mo69385P(g), -1);
            return;
        }
        throw new IllegalSeekPositionException(c1Var, -1, -9223372036854775807L);
    }

    /* renamed from: V */
    public final void mo69403V(SurfaceHolder surfaceHolder) {
        this.f38977x = false;
        this.f38975v = surfaceHolder;
        surfaceHolder.addCallback(this.f38958e);
        Surface surface = this.f38975v.getSurface();
        if (surface == null || !surface.isValid()) {
            mo69399R(0, 0);
            return;
        }
        Rect surfaceFrame = this.f38975v.getSurfaceFrame();
        mo69399R(surfaceFrame.width(), surfaceFrame.height());
    }

    /* renamed from: W */
    public final void mo69404W(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (C17904d1 d1Var : this.f38955b) {
            if (d1Var.getTrackType() == 2) {
                C17894b1 O = this.f38957d.mo69384O(d1Var);
                C14075p.m21694f(!O.f38865g);
                O.f38862d = 1;
                C14075p.m21694f(!O.f38865g);
                O.f38863e = obj;
                O.mo69362c();
                arrayList.add(O);
            }
        }
        Object obj2 = this.f38973t;
        if (!(obj2 == null || obj2 == obj)) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C17894b1) it.next()).mo69360a(this.f38971r);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                this.f38957d.mo69390W(ExoPlaybackException.createForRenderer(new ExoTimeoutException(3)));
            }
            Object obj3 = this.f38973t;
            Surface surface = this.f38974u;
            if (obj3 == surface) {
                surface.release();
                this.f38974u = null;
            }
        }
        this.f38973t = obj;
    }

    /* renamed from: X */
    public final void mo69405X(int i, int i2, boolean z) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        this.f38957d.mo69389V(i3, i2, z2);
    }

    /* renamed from: Y */
    public final void mo69406Y() {
        C14050c cVar = this.f38956c;
        synchronized (cVar) {
            boolean z = false;
            while (!cVar.f30926a) {
                try {
                    cVar.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f38957d.f38924p.getThread()) {
            String m = C14049b0.m21640m("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f38957d.f38924p.getThread().getName());
            if (!this.f38952H) {
                C14075p.m21700l("SimpleExoPlayer", m, this.f38953I ? null : new IllegalStateException());
                this.f38953I = true;
                return;
            }
            throw new IllegalStateException(m);
        }
    }

    /* renamed from: a */
    public final C17986y0 mo69314a() {
        mo69406Y();
        return this.f38957d.f38907C.f39317n;
    }

    /* renamed from: b */
    public final void mo69315b(C17986y0 y0Var) {
        mo69406Y();
        this.f38957d.mo69315b(y0Var);
    }

    /* renamed from: c */
    public final void mo69316c(float f) {
        mo69406Y();
        float h = C14049b0.m21635h(f, 0.0f, 1.0f);
        if (this.f38949E != h) {
            this.f38949E = h;
            mo69401T(1, 2, Float.valueOf(this.f38967n.f38883g * h));
            this.f38965l.onVolumeChanged(h);
            Iterator<C18169f> it = this.f38961h.iterator();
            while (it.hasNext()) {
                it.next().onVolumeChanged(h);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo69317d() {
        mo69406Y();
        return this.f38957d.mo69317d();
    }

    /* renamed from: e */
    public final long mo69318e() {
        mo69406Y();
        return this.f38957d.mo69318e();
    }

    /* renamed from: f */
    public final C18888f mo69393f() {
        mo69406Y();
        return this.f38957d.f38913e;
    }

    /* renamed from: g */
    public final List<Metadata> mo69319g() {
        mo69406Y();
        return this.f38957d.f38907C.f39313j;
    }

    public final long getCurrentPosition() {
        mo69406Y();
        return this.f38957d.getCurrentPosition();
    }

    public final long getDuration() {
        mo69406Y();
        return this.f38957d.getDuration();
    }

    public final int getPlaybackState() {
        mo69406Y();
        return this.f38957d.f38907C.f39308e;
    }

    public final int getRepeatMode() {
        mo69406Y();
        return this.f38957d.f38927s;
    }

    /* renamed from: i */
    public final void mo69325i(SurfaceView surfaceView) {
        mo69406Y();
        if (surfaceView instanceof C14153g) {
            mo69400S();
            mo69404W(surfaceView);
            mo69403V(surfaceView.getHolder());
        } else if (surfaceView instanceof SphericalGLSurfaceView) {
            mo69400S();
            this.f38976w = (SphericalGLSurfaceView) surfaceView;
            C17894b1 O = this.f38957d.mo69384O(this.f38959f);
            C14075p.m21694f(!O.f38865g);
            O.f38862d = EtsyRequest.DEFAULT_TIMEOUT;
            SphericalGLSurfaceView sphericalGLSurfaceView = this.f38976w;
            C14075p.m21694f(true ^ O.f38865g);
            O.f38863e = sphericalGLSurfaceView;
            O.mo69362c();
            this.f38976w.addVideoSurfaceListener(this.f38958e);
            mo69404W(this.f38976w.getVideoSurface());
            mo69403V(surfaceView.getHolder());
        } else {
            SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
            mo69406Y();
            if (holder == null) {
                mo69398P();
                return;
            }
            mo69400S();
            this.f38977x = true;
            this.f38975v = holder;
            holder.addCallback(this.f38958e);
            Surface surface = holder.getSurface();
            if (surface == null || !surface.isValid()) {
                mo69404W((Object) null);
                mo69399R(0, 0);
                return;
            }
            mo69404W(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            mo69399R(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    /* renamed from: j */
    public final int mo69327j() {
        mo69406Y();
        return this.f38957d.mo69327j();
    }

    /* renamed from: k */
    public final ExoPlaybackException mo69328k() {
        mo69406Y();
        return this.f38957d.f38907C.f39309f;
    }

    /* renamed from: l */
    public final void mo69329l(boolean z) {
        mo69406Y();
        int e = this.f38967n.mo69368e(getPlaybackState(), z);
        int i = 1;
        if (z && e != 1) {
            i = 2;
        }
        mo69405X(e, i, z);
    }

    /* renamed from: m */
    public final List<C18296a> mo69330m() {
        mo69406Y();
        return this.f38951G;
    }

    /* renamed from: n */
    public final int mo69331n() {
        mo69406Y();
        return this.f38957d.mo69331n();
    }

    /* renamed from: p */
    public final int mo69333p() {
        mo69406Y();
        return this.f38957d.f38907C.f39316m;
    }

    public final void prepare() {
        mo69406Y();
        boolean x = mo69348x();
        int i = 2;
        int e = this.f38967n.mo69368e(2, x);
        if (!x || e == 1) {
            i = 1;
        }
        mo69405X(e, i, x);
        this.f38957d.prepare();
    }

    /* renamed from: q */
    public final TrackGroupArray mo69337q() {
        mo69406Y();
        return this.f38957d.f38907C.f39311h;
    }

    /* renamed from: r */
    public final C17939k1 mo69338r() {
        mo69406Y();
        return this.f38957d.f38907C.f39304a;
    }

    public final void release() {
        AudioTrack audioTrack;
        mo69406Y();
        if (C14049b0.f30913a < 21 && (audioTrack = this.f38972s) != null) {
            audioTrack.release();
            this.f38972s = null;
        }
        this.f38966m.mo69357a();
        C17927j1 j1Var = this.f38968o;
        C17927j1.C17929b bVar = j1Var.f39022e;
        if (bVar != null) {
            try {
                j1Var.f39018a.unregisterReceiver(bVar);
            } catch (RuntimeException e) {
                C14075p.m21700l("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            j1Var.f39022e = null;
        }
        this.f38969p.getClass();
        this.f38970q.getClass();
        C17900d dVar = this.f38967n;
        dVar.f38879c = null;
        dVar.mo69364a();
        this.f38957d.release();
        C18086u0 u0Var = this.f38965l;
        C18089v0.C18090a E = u0Var.mo69616E();
        u0Var.f39482e.put(1036, E);
        C14060k<C18089v0> kVar = u0Var.f39483f;
        C18076p0 p0Var = new C18076p0(E);
        C14083w wVar = (C14083w) kVar.f30941b;
        wVar.getClass();
        C14083w.C14084a b = C14083w.m21762b();
        b.f31012a = wVar.f31011a.obtainMessage(1, 1036, 0, p0Var);
        b.mo46951a();
        mo69400S();
        Surface surface = this.f38974u;
        if (surface != null) {
            surface.release();
            this.f38974u = null;
        }
        this.f38951G = Collections.emptyList();
    }

    /* renamed from: s */
    public final Looper mo69340s() {
        return this.f38957d.f38924p;
    }

    public final void setRepeatMode(int i) {
        mo69406Y();
        this.f38957d.setRepeatMode(i);
    }

    /* renamed from: t */
    public final void mo69344t(C17884a1.C17886b bVar) {
        this.f38957d.mo69344t(bVar);
    }

    /* renamed from: u */
    public final void mo69345u(TextureView textureView) {
        mo69406Y();
        if (textureView == null) {
            mo69398P();
            return;
        }
        mo69400S();
        this.f38978y = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            Log.w("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f38958e);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            mo69404W((Object) null);
            mo69399R(0, 0);
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        mo69404W(surface);
        this.f38974u = surface;
        mo69399R(textureView.getWidth(), textureView.getHeight());
    }

    /* renamed from: v */
    public final C18887e mo69346v() {
        mo69406Y();
        return this.f38957d.mo69346v();
    }

    /* renamed from: w */
    public final void mo69347w(int i, long j) {
        mo69406Y();
        C18086u0 u0Var = this.f38965l;
        if (!u0Var.f39485h) {
            C18089v0.C18090a E = u0Var.mo69616E();
            u0Var.f39485h = true;
            u0Var.mo69621J(E, -1, new C18080r0(E));
        }
        this.f38957d.mo69347w(i, j);
    }

    /* renamed from: x */
    public final boolean mo69348x() {
        mo69406Y();
        return this.f38957d.f38907C.f39315l;
    }

    /* renamed from: y */
    public final void mo69349y(boolean z) {
        mo69406Y();
        this.f38957d.mo69349y(z);
    }

    /* renamed from: z */
    public final void mo69350z(C17884a1.C17886b bVar) {
        bVar.getClass();
        this.f38957d.mo69350z(bVar);
    }
}
