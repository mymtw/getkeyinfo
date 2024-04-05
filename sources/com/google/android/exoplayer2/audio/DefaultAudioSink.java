package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.support.p013v4.media.session.PlaybackStateCompat;
import android.util.Log;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.C14189a;
import com.google.android.exoplayer2.audio.C14191b;
import com.google.android.exoplayer2.audio.C14196f;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import p003a2.C0023f;
import p513bj.C14049b0;
import p513bj.C14065m;
import p513bj.C14075p;
import p594jh.C17904d1;
import p594jh.C17986y0;
import p611lh.C18167d;
import p611lh.C18168e;
import p611lh.C18175l;
import p611lh.C18176m;
import p611lh.C18177n;
import p611lh.C18179o;
import p611lh.C18180p;
import p611lh.C18184s;

public final class DefaultAudioSink implements AudioSink {

    /* renamed from: A */
    public long f31325A;

    /* renamed from: B */
    public long f31326B;

    /* renamed from: C */
    public long f31327C;

    /* renamed from: D */
    public int f31328D;

    /* renamed from: E */
    public boolean f31329E;

    /* renamed from: F */
    public boolean f31330F;

    /* renamed from: G */
    public long f31331G;

    /* renamed from: H */
    public float f31332H;

    /* renamed from: I */
    public AudioProcessor[] f31333I;

    /* renamed from: J */
    public ByteBuffer[] f31334J;

    /* renamed from: K */
    public ByteBuffer f31335K;

    /* renamed from: L */
    public int f31336L;

    /* renamed from: M */
    public ByteBuffer f31337M;

    /* renamed from: N */
    public byte[] f31338N;

    /* renamed from: O */
    public int f31339O;

    /* renamed from: P */
    public int f31340P;

    /* renamed from: Q */
    public boolean f31341Q;

    /* renamed from: R */
    public boolean f31342R;

    /* renamed from: S */
    public boolean f31343S;

    /* renamed from: T */
    public boolean f31344T;

    /* renamed from: U */
    public int f31345U;

    /* renamed from: V */
    public C18179o f31346V;

    /* renamed from: W */
    public boolean f31347W;

    /* renamed from: X */
    public long f31348X;

    /* renamed from: Y */
    public boolean f31349Y;

    /* renamed from: Z */
    public boolean f31350Z;

    /* renamed from: a */
    public final C18168e f31351a;

    /* renamed from: b */
    public final C14181b f31352b;

    /* renamed from: c */
    public final boolean f31353c = false;

    /* renamed from: d */
    public final C14194d f31354d;

    /* renamed from: e */
    public final C14201j f31355e;

    /* renamed from: f */
    public final AudioProcessor[] f31356f;

    /* renamed from: g */
    public final AudioProcessor[] f31357g;

    /* renamed from: h */
    public final ConditionVariable f31358h = new ConditionVariable(true);

    /* renamed from: i */
    public final C14191b f31359i = new C14191b(new C14186g());

    /* renamed from: j */
    public final ArrayDeque<C14184e> f31360j;

    /* renamed from: k */
    public final boolean f31361k = false;

    /* renamed from: l */
    public final int f31362l = 0;

    /* renamed from: m */
    public C14187h f31363m;

    /* renamed from: n */
    public final C14185f<AudioSink.InitializationException> f31364n;

    /* renamed from: o */
    public final C14185f<AudioSink.WriteException> f31365o;

    /* renamed from: p */
    public AudioSink.C14179a f31366p;

    /* renamed from: q */
    public C14182c f31367q;

    /* renamed from: r */
    public C14182c f31368r;

    /* renamed from: s */
    public AudioTrack f31369s;

    /* renamed from: t */
    public C18167d f31370t;

    /* renamed from: u */
    public C14184e f31371u;

    /* renamed from: v */
    public C14184e f31372v;

    /* renamed from: w */
    public C17986y0 f31373w;

    /* renamed from: x */
    public ByteBuffer f31374x;

    /* renamed from: y */
    public int f31375y;

    /* renamed from: z */
    public long f31376z;

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        public InvalidAudioTrackTimestampException(String str, C14180a aVar) {
            super(str);
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$a */
    public class C14180a extends Thread {

        /* renamed from: b */
        public final /* synthetic */ AudioTrack f31377b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14180a(AudioTrack audioTrack) {
            super("ExoPlayer:AudioTrackReleaseThread");
            this.f31377b = audioTrack;
        }

        public final void run() {
            try {
                this.f31377b.flush();
                this.f31377b.release();
            } finally {
                DefaultAudioSink.this.f31358h.open();
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$b */
    public interface C14181b {
        /* renamed from: a */
        long mo47224a(long j);

        /* renamed from: b */
        long mo47225b();

        /* renamed from: c */
        boolean mo47226c(boolean z);

        /* renamed from: d */
        C17986y0 mo47227d(C17986y0 y0Var);
    }

    /* renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$c */
    public static final class C14182c {

        /* renamed from: a */
        public final Format f31379a;

        /* renamed from: b */
        public final int f31380b;

        /* renamed from: c */
        public final int f31381c;

        /* renamed from: d */
        public final int f31382d;

        /* renamed from: e */
        public final int f31383e;

        /* renamed from: f */
        public final int f31384f;

        /* renamed from: g */
        public final int f31385g;

        /* renamed from: h */
        public final int f31386h;

        /* renamed from: i */
        public final AudioProcessor[] f31387i;

        public C14182c(Format format, int i, int i2, int i3, int i4, int i5, int i6, boolean z, AudioProcessor[] audioProcessorArr) {
            int i7;
            this.f31379a = format;
            this.f31380b = i;
            this.f31381c = i2;
            this.f31382d = i3;
            this.f31383e = i4;
            this.f31384f = i5;
            this.f31385g = i6;
            this.f31387i = audioProcessorArr;
            boolean z2 = true;
            if (i2 == 0) {
                float f = z ? 8.0f : 1.0f;
                int minBufferSize = AudioTrack.getMinBufferSize(i4, i5, i6);
                C14075p.m21694f(minBufferSize == -2 ? false : z2);
                i7 = C14049b0.m21636i(minBufferSize * 4, ((int) ((250000 * ((long) i4)) / 1000000)) * i3, Math.max(minBufferSize, ((int) ((750000 * ((long) i4)) / 1000000)) * i3));
                if (f != 1.0f) {
                    i7 = Math.round(((float) i7) * f);
                }
            } else if (i2 == 1) {
                i7 = mo47230d(50000000);
            } else if (i2 == 2) {
                i7 = mo47230d(250000);
            } else {
                throw new IllegalStateException();
            }
            this.f31386h = i7;
        }

        /* renamed from: c */
        public static AudioAttributes m22028c(C18167d dVar, boolean z) {
            return z ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : dVar.mo69707a();
        }

        /* renamed from: a */
        public final AudioTrack mo47228a(boolean z, C18167d dVar, int i) throws AudioSink.InitializationException {
            try {
                AudioTrack b = mo47229b(z, dVar, i);
                int state = b.getState();
                if (state == 1) {
                    return b;
                }
                try {
                    b.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.f31383e, this.f31384f, this.f31386h, this.f31379a, this.f31381c == 1, (Exception) null);
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                throw new AudioSink.InitializationException(0, this.f31383e, this.f31384f, this.f31386h, this.f31379a, this.f31381c == 1, e);
            }
        }

        /* renamed from: b */
        public final AudioTrack mo47229b(boolean z, C18167d dVar, int i) {
            int i2 = C14049b0.f30913a;
            if (i2 >= 29) {
                AudioFormat s = DefaultAudioSink.m21989s(this.f31383e, this.f31384f, this.f31385g);
                AudioAttributes c = m22028c(dVar, z);
                boolean z2 = true;
                AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(c).setAudioFormat(s).setTransferMode(1).setBufferSizeInBytes(this.f31386h).setSessionId(i);
                if (this.f31381c != 1) {
                    z2 = false;
                }
                return sessionId.setOffloadedPlayback(z2).build();
            } else if (i2 >= 21) {
                return new AudioTrack(m22028c(dVar, z), DefaultAudioSink.m21989s(this.f31383e, this.f31384f, this.f31385g), this.f31386h, 1, i);
            } else {
                int v = C14049b0.m21649v(dVar.f39741c);
                return i == 0 ? new AudioTrack(v, this.f31383e, this.f31384f, this.f31385g, this.f31386h, 1) : new AudioTrack(v, this.f31383e, this.f31384f, this.f31385g, this.f31386h, 1, i);
            }
        }

        /* renamed from: d */
        public final int mo47230d(long j) {
            int i;
            int i2 = this.f31385g;
            switch (i2) {
                case 5:
                    i = 80000;
                    break;
                case 6:
                case 18:
                    i = 768000;
                    break;
                case 7:
                    i = 192000;
                    break;
                case 8:
                    i = 2250000;
                    break;
                case 9:
                    i = 40000;
                    break;
                case 10:
                    i = 100000;
                    break;
                case 11:
                    i = 16000;
                    break;
                case 12:
                    i = 7000;
                    break;
                case 14:
                    i = 3062500;
                    break;
                case 15:
                    i = 8000;
                    break;
                case 16:
                    i = 256000;
                    break;
                case 17:
                    i = 336000;
                    break;
                default:
                    throw new IllegalArgumentException();
            }
            if (i2 == 5) {
                i *= 2;
            }
            return (int) ((j * ((long) i)) / 1000000);
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$d */
    public static class C14183d implements C14181b {

        /* renamed from: a */
        public final AudioProcessor[] f31388a;

        /* renamed from: b */
        public final C14199h f31389b;

        /* renamed from: c */
        public final C14200i f31390c;

        public C14183d(AudioProcessor... audioProcessorArr) {
            C14199h hVar = new C14199h();
            C14200i iVar = new C14200i();
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[(audioProcessorArr.length + 2)];
            this.f31388a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f31389b = hVar;
            this.f31390c = iVar;
            audioProcessorArr2[audioProcessorArr.length] = hVar;
            audioProcessorArr2[audioProcessorArr.length + 1] = iVar;
        }

        /* renamed from: a */
        public final long mo47224a(long j) {
            C14200i iVar = this.f31390c;
            if (iVar.f31483o < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                return (long) (((double) iVar.f31471c) * ((double) j));
            }
            long j2 = iVar.f31482n;
            C18184s sVar = iVar.f31478j;
            sVar.getClass();
            long j3 = j2 - ((long) ((sVar.f39810k * sVar.f39801b) * 2));
            int i = iVar.f31476h.f31321a;
            int i2 = iVar.f31475g.f31321a;
            if (i == i2) {
                return C14049b0.m21625F(j, j3, iVar.f31483o);
            }
            return C14049b0.m21625F(j, j3 * ((long) i), iVar.f31483o * ((long) i2));
        }

        /* renamed from: b */
        public final long mo47225b() {
            return this.f31389b.f31469t;
        }

        /* renamed from: c */
        public final boolean mo47226c(boolean z) {
            this.f31389b.f31462m = z;
            return z;
        }

        /* renamed from: d */
        public final C17986y0 mo47227d(C17986y0 y0Var) {
            C14200i iVar = this.f31390c;
            float f = y0Var.f39326a;
            if (iVar.f31471c != f) {
                iVar.f31471c = f;
                iVar.f31477i = true;
            }
            float f2 = y0Var.f39327b;
            if (iVar.f31472d != f2) {
                iVar.f31472d = f2;
                iVar.f31477i = true;
            }
            return y0Var;
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$e */
    public static final class C14184e {

        /* renamed from: a */
        public final C17986y0 f31391a;

        /* renamed from: b */
        public final boolean f31392b;

        /* renamed from: c */
        public final long f31393c;

        /* renamed from: d */
        public final long f31394d;

        public C14184e(C17986y0 y0Var, boolean z, long j, long j2) {
            this.f31391a = y0Var;
            this.f31392b = z;
            this.f31393c = j;
            this.f31394d = j2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$f */
    public static final class C14185f<T extends Exception> {

        /* renamed from: a */
        public T f31395a;

        /* renamed from: b */
        public long f31396b;

        /* renamed from: a */
        public final void mo47231a(T t) throws Exception {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f31395a == null) {
                this.f31395a = t;
                this.f31396b = 100 + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f31396b) {
                T t2 = this.f31395a;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.f31395a;
                this.f31395a = null;
                throw t3;
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$g */
    public final class C14186g implements C14191b.C14192a {
        public C14186g() {
        }

        /* renamed from: a */
        public final void mo47232a(int i, long j) {
            if (DefaultAudioSink.this.f31366p != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
                long j2 = elapsedRealtime - defaultAudioSink.f31348X;
                C14189a.C14190a aVar = C14196f.this.f31447H1;
                Handler handler = aVar.f31402a;
                if (handler != null) {
                    handler.post(new C18176m(aVar, i, j, j2));
                }
            }
        }

        /* renamed from: b */
        public final void mo47233b(long j) {
            StringBuilder sb = new StringBuilder(61);
            sb.append("Ignoring impossibly large audio latency: ");
            sb.append(j);
            Log.w("DefaultAudioSink", sb.toString());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = ((com.google.android.exoplayer2.audio.C14196f.C14197a) r0).f31457a.f31447H1;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo47234c(long r4) {
            /*
                r3 = this;
                com.google.android.exoplayer2.audio.DefaultAudioSink r0 = com.google.android.exoplayer2.audio.DefaultAudioSink.this
                com.google.android.exoplayer2.audio.AudioSink$a r0 = r0.f31366p
                if (r0 == 0) goto L_0x0018
                com.google.android.exoplayer2.audio.f$a r0 = (com.google.android.exoplayer2.audio.C14196f.C14197a) r0
                com.google.android.exoplayer2.audio.f r0 = com.google.android.exoplayer2.audio.C14196f.this
                com.google.android.exoplayer2.audio.a$a r0 = r0.f31447H1
                android.os.Handler r1 = r0.f31402a
                if (r1 == 0) goto L_0x0018
                lh.g r2 = new lh.g
                r2.<init>(r0, r4)
                r1.post(r2)
            L_0x0018:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.C14186g.mo47234c(long):void");
        }

        /* renamed from: d */
        public final void mo47235d(long j, long j2, long j3, long j4) {
            long v = DefaultAudioSink.this.mo47219v();
            long w = DefaultAudioSink.this.mo47220w();
            StringBuilder sb = new StringBuilder(182);
            sb.append("Spurious audio timestamp (frame position mismatch): ");
            sb.append(j);
            sb.append(", ");
            sb.append(j2);
            sb.append(", ");
            sb.append(j3);
            sb.append(", ");
            sb.append(j4);
            sb.append(", ");
            sb.append(v);
            sb.append(", ");
            sb.append(w);
            Log.w("DefaultAudioSink", sb.toString());
        }

        /* renamed from: e */
        public final void mo47236e(long j, long j2, long j3, long j4) {
            long v = DefaultAudioSink.this.mo47219v();
            long w = DefaultAudioSink.this.mo47220w();
            StringBuilder sb = new StringBuilder(180);
            sb.append("Spurious audio timestamp (system clock mismatch): ");
            sb.append(j);
            sb.append(", ");
            sb.append(j2);
            sb.append(", ");
            sb.append(j3);
            sb.append(", ");
            sb.append(j4);
            sb.append(", ");
            sb.append(v);
            sb.append(", ");
            sb.append(w);
            Log.w("DefaultAudioSink", sb.toString());
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$h */
    public final class C14187h {

        /* renamed from: a */
        public final Handler f31398a = new Handler();

        /* renamed from: b */
        public final C14188a f31399b = new C14188a();

        /* renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$h$a */
        public class C14188a extends AudioTrack$StreamEventCallback {
            public C14188a() {
            }

            public final void onDataRequest(AudioTrack audioTrack, int i) {
                C17904d1.C17905a aVar;
                C14075p.m21694f(audioTrack == DefaultAudioSink.this.f31369s);
                DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
                AudioSink.C14179a aVar2 = defaultAudioSink.f31366p;
                if (aVar2 != null && defaultAudioSink.f31343S && (aVar = C14196f.this.f31456Q1) != null) {
                    aVar.mo69370a();
                }
            }

            public final void onTearDown(AudioTrack audioTrack) {
                C17904d1.C17905a aVar;
                C14075p.m21694f(audioTrack == DefaultAudioSink.this.f31369s);
                DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
                AudioSink.C14179a aVar2 = defaultAudioSink.f31366p;
                if (aVar2 != null && defaultAudioSink.f31343S && (aVar = C14196f.this.f31456Q1) != null) {
                    aVar.mo69370a();
                }
            }
        }

        public C14187h() {
        }
    }

    public DefaultAudioSink(C18168e eVar, C14183d dVar) {
        this.f31351a = eVar;
        this.f31352b = dVar;
        int i = C14049b0.f30913a;
        C14194d dVar2 = new C14194d();
        this.f31354d = dVar2;
        C14201j jVar = new C14201j();
        this.f31355e = jVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C14193c[]{new C14198g(), dVar2, jVar});
        Collections.addAll(arrayList, dVar.f31388a);
        this.f31356f = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[0]);
        this.f31357g = new AudioProcessor[]{new C14195e()};
        this.f31332H = 1.0f;
        this.f31370t = C18167d.f39738f;
        this.f31345U = 0;
        this.f31346V = new C18179o();
        C17986y0 y0Var = C17986y0.f39325d;
        this.f31372v = new C14184e(y0Var, false, 0, 0);
        this.f31373w = y0Var;
        this.f31340P = -1;
        this.f31333I = new AudioProcessor[0];
        this.f31334J = new ByteBuffer[0];
        this.f31360j = new ArrayDeque<>();
        this.f31364n = new C14185f<>();
        this.f31365o = new C14185f<>();
    }

    /* renamed from: s */
    public static AudioFormat m21989s(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00c5, code lost:
        if (r8 != 5) goto L_0x00c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00e0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e1  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m21990t(com.google.android.exoplayer2.Format r13, p611lh.C18168e r14) {
        /*
            r0 = 0
            if (r14 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = r13.sampleMimeType
            r1.getClass()
            java.lang.String r2 = r13.codecs
            int r1 = p513bj.C14065m.m21673c(r1, r2)
            r2 = 5
            r3 = 7
            r4 = 6
            r5 = 8
            r6 = 18
            r7 = 1
            r8 = 0
            if (r1 == r2) goto L_0x002d
            if (r1 == r4) goto L_0x002d
            if (r1 == r6) goto L_0x002d
            r9 = 17
            if (r1 == r9) goto L_0x002d
            if (r1 == r3) goto L_0x002d
            if (r1 == r5) goto L_0x002d
            r9 = 14
            if (r1 != r9) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r9 = r8
            goto L_0x002e
        L_0x002d:
            r9 = r7
        L_0x002e:
            if (r9 != 0) goto L_0x0031
            return r0
        L_0x0031:
            if (r1 != r6) goto L_0x0042
            int[] r9 = r14.f39746a
            int r9 = java.util.Arrays.binarySearch(r9, r6)
            if (r9 < 0) goto L_0x003d
            r9 = r7
            goto L_0x003e
        L_0x003d:
            r9 = r8
        L_0x003e:
            if (r9 != 0) goto L_0x0042
            r1 = r4
            goto L_0x0052
        L_0x0042:
            if (r1 != r5) goto L_0x0052
            int[] r9 = r14.f39746a
            int r9 = java.util.Arrays.binarySearch(r9, r5)
            if (r9 < 0) goto L_0x004e
            r9 = r7
            goto L_0x004f
        L_0x004e:
            r9 = r8
        L_0x004f:
            if (r9 != 0) goto L_0x0052
            r1 = r3
        L_0x0052:
            int[] r9 = r14.f39746a
            int r9 = java.util.Arrays.binarySearch(r9, r1)
            if (r9 < 0) goto L_0x005c
            r9 = r7
            goto L_0x005d
        L_0x005c:
            r9 = r8
        L_0x005d:
            if (r9 != 0) goto L_0x0060
            return r0
        L_0x0060:
            r9 = 3
            if (r1 != r6) goto L_0x00af
            int r14 = p513bj.C14049b0.f30913a
            r10 = 29
            if (r14 < r10) goto L_0x00ad
            int r13 = r13.sampleRate
            android.media.AudioAttributes$Builder r14 = new android.media.AudioAttributes$Builder
            r14.<init>()
            android.media.AudioAttributes$Builder r14 = r14.setUsage(r7)
            android.media.AudioAttributes$Builder r14 = r14.setContentType(r9)
            android.media.AudioAttributes r14 = r14.build()
            r10 = r5
        L_0x007d:
            if (r10 <= 0) goto L_0x00a3
            android.media.AudioFormat$Builder r11 = new android.media.AudioFormat$Builder
            r11.<init>()
            android.media.AudioFormat$Builder r11 = r11.setEncoding(r6)
            android.media.AudioFormat$Builder r11 = r11.setSampleRate(r13)
            int r12 = p513bj.C14049b0.m21642o(r10)
            android.media.AudioFormat$Builder r11 = r11.setChannelMask(r12)
            android.media.AudioFormat r11 = r11.build()
            boolean r11 = android.media.AudioTrack.isDirectPlaybackSupported(r11, r14)
            if (r11 == 0) goto L_0x00a0
            r8 = r10
            goto L_0x00a3
        L_0x00a0:
            int r10 = r10 + -1
            goto L_0x007d
        L_0x00a3:
            if (r8 != 0) goto L_0x00b6
            java.lang.String r13 = "DefaultAudioSink"
            java.lang.String r14 = "E-AC3 JOC encoding supported but no channel count supported"
            android.util.Log.w(r13, r14)
            return r0
        L_0x00ad:
            r8 = r4
            goto L_0x00b6
        L_0x00af:
            int r8 = r13.channelCount
            int r13 = r14.f39747b
            if (r8 <= r13) goto L_0x00b6
            return r0
        L_0x00b6:
            int r13 = p513bj.C14049b0.f30913a
            r14 = 28
            if (r13 > r14) goto L_0x00c8
            if (r8 != r3) goto L_0x00c0
            r4 = r5
            goto L_0x00c9
        L_0x00c0:
            if (r8 == r9) goto L_0x00c9
            r14 = 4
            if (r8 == r14) goto L_0x00c9
            if (r8 != r2) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            r4 = r8
        L_0x00c9:
            r14 = 26
            if (r13 > r14) goto L_0x00da
            java.lang.String r13 = p513bj.C14049b0.f30914b
            java.lang.String r14 = "fugu"
            boolean r13 = r14.equals(r13)
            if (r13 == 0) goto L_0x00da
            if (r4 != r7) goto L_0x00da
            r4 = 2
        L_0x00da:
            int r13 = p513bj.C14049b0.m21642o(r4)
            if (r13 != 0) goto L_0x00e1
            return r0
        L_0x00e1:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            android.util.Pair r13 = android.util.Pair.create(r14, r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.m21990t(com.google.android.exoplayer2.Format, lh.e):android.util.Pair");
    }

    /* renamed from: z */
    public static boolean m21991z(AudioTrack audioTrack) {
        return C14049b0.f30913a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* renamed from: A */
    public final void mo47207A() {
        if (!this.f31342R) {
            this.f31342R = true;
            C14191b bVar = this.f31359i;
            long w = mo47220w();
            bVar.f31435z = bVar.mo47250a();
            bVar.f31433x = SystemClock.elapsedRealtime() * 1000;
            bVar.f31404A = w;
            this.f31369s.stop();
            this.f31375y = 0;
        }
    }

    /* renamed from: B */
    public final void mo47208B(long j) throws AudioSink.WriteException {
        ByteBuffer byteBuffer;
        int length = this.f31333I.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f31334J[i - 1];
            } else {
                byteBuffer = this.f31335K;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.f31319a;
                }
            }
            if (i == length) {
                mo47215I(byteBuffer, j);
            } else {
                AudioProcessor audioProcessor = this.f31333I[i];
                if (i > this.f31340P) {
                    audioProcessor.mo47177b(byteBuffer);
                }
                ByteBuffer a = audioProcessor.mo47176a();
                this.f31334J[i] = a;
                if (a.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: C */
    public final void mo47209C() {
        this.f31376z = 0;
        this.f31325A = 0;
        this.f31326B = 0;
        this.f31327C = 0;
        int i = 0;
        this.f31350Z = false;
        this.f31328D = 0;
        this.f31372v = new C14184e(mo47218u().f31391a, mo47218u().f31392b, 0, 0);
        this.f31331G = 0;
        this.f31371u = null;
        this.f31360j.clear();
        this.f31335K = null;
        this.f31336L = 0;
        this.f31337M = null;
        this.f31342R = false;
        this.f31341Q = false;
        this.f31340P = -1;
        this.f31374x = null;
        this.f31375y = 0;
        this.f31355e.f31491o = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.f31333I;
            if (i < audioProcessorArr.length) {
                AudioProcessor audioProcessor = audioProcessorArr[i];
                audioProcessor.flush();
                this.f31334J[i] = audioProcessor.mo47176a();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: D */
    public final void mo47210D(C17986y0 y0Var, boolean z) {
        C14184e u = mo47218u();
        if (!y0Var.equals(u.f31391a) || z != u.f31392b) {
            C14184e eVar = new C14184e(y0Var, z, -9223372036854775807L, -9223372036854775807L);
            if (mo47222y()) {
                this.f31371u = eVar;
            } else {
                this.f31372v = eVar;
            }
        }
    }

    /* renamed from: E */
    public final void mo47211E(C17986y0 y0Var) {
        if (mo47222y()) {
            try {
                this.f31369s.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(y0Var.f39326a).setPitch(y0Var.f39327b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                C14075p.m21700l("DefaultAudioSink", "Failed to set playback params", e);
            }
            y0Var = new C17986y0(this.f31369s.getPlaybackParams().getSpeed(), this.f31369s.getPlaybackParams().getPitch());
            C14191b bVar = this.f31359i;
            bVar.f31419j = y0Var.f39326a;
            C18177n nVar = bVar.f31415f;
            if (nVar != null) {
                nVar.mo69720a();
            }
        }
        this.f31373w = y0Var;
    }

    /* renamed from: F */
    public final void mo47212F() {
        if (mo47222y()) {
            if (C14049b0.f30913a >= 21) {
                this.f31369s.setVolume(this.f31332H);
                return;
            }
            AudioTrack audioTrack = this.f31369s;
            float f = this.f31332H;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo47213G() {
        /*
            r4 = this;
            boolean r0 = r4.f31347W
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0037
            com.google.android.exoplayer2.audio.DefaultAudioSink$c r0 = r4.f31368r
            com.google.android.exoplayer2.Format r0 = r0.f31379a
            java.lang.String r0 = r0.sampleMimeType
            java.lang.String r3 = "audio/raw"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0037
            com.google.android.exoplayer2.audio.DefaultAudioSink$c r0 = r4.f31368r
            com.google.android.exoplayer2.Format r0 = r0.f31379a
            int r0 = r0.pcmEncoding
            boolean r3 = r4.f31353c
            if (r3 == 0) goto L_0x0033
            int r3 = p513bj.C14049b0.f30913a
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            if (r0 == r3) goto L_0x002e
            r3 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == r3) goto L_0x002e
            r3 = 4
            if (r0 != r3) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r0 = r2
            goto L_0x002f
        L_0x002e:
            r0 = r1
        L_0x002f:
            if (r0 == 0) goto L_0x0033
            r0 = r1
            goto L_0x0034
        L_0x0033:
            r0 = r2
        L_0x0034:
            if (r0 != 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r1 = r2
        L_0x0038:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.mo47213G():boolean");
    }

    /* renamed from: H */
    public final boolean mo47214H(Format format, C18167d dVar) {
        int o;
        int i = C14049b0.f30913a;
        if (i < 29 || this.f31362l == 0) {
            return false;
        }
        String str = format.sampleMimeType;
        str.getClass();
        int c = C14065m.m21673c(str, format.codecs);
        if (c == 0 || (o = C14049b0.m21642o(format.channelCount)) == 0 || !AudioManager.isOffloadedPlaybackSupported(m21989s(format.sampleRate, o, c), dVar.mo69707a())) {
            return false;
        }
        boolean z = (format.encoderDelay == 0 && format.encoderPadding == 0) ? false : true;
        boolean z2 = this.f31362l == 1;
        if (z && z2) {
            if (!(i >= 30 && C14049b0.f30916d.startsWith("Pixel"))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e0, code lost:
        if (r15 < r14) goto L_0x00e2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013a  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47215I(java.nio.ByteBuffer r13, long r14) throws com.google.android.exoplayer2.audio.AudioSink.WriteException {
        /*
            r12 = this;
            boolean r0 = r13.hasRemaining()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.nio.ByteBuffer r0 = r12.f31337M
            r1 = 21
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0018
            if (r0 != r13) goto L_0x0013
            r0 = r3
            goto L_0x0014
        L_0x0013:
            r0 = r2
        L_0x0014:
            p513bj.C14075p.m21691c(r0)
            goto L_0x003b
        L_0x0018:
            r12.f31337M = r13
            int r0 = p513bj.C14049b0.f30913a
            if (r0 >= r1) goto L_0x003b
            int r0 = r13.remaining()
            byte[] r4 = r12.f31338N
            if (r4 == 0) goto L_0x0029
            int r4 = r4.length
            if (r4 >= r0) goto L_0x002d
        L_0x0029:
            byte[] r4 = new byte[r0]
            r12.f31338N = r4
        L_0x002d:
            int r4 = r13.position()
            byte[] r5 = r12.f31338N
            r13.get(r5, r2, r0)
            r13.position(r4)
            r12.f31339O = r2
        L_0x003b:
            int r0 = r13.remaining()
            int r4 = p513bj.C14049b0.f30913a
            if (r4 >= r1) goto L_0x0075
            com.google.android.exoplayer2.audio.b r14 = r12.f31359i
            long r5 = r12.f31326B
            long r7 = r14.mo47250a()
            int r15 = r14.f31413d
            long r9 = (long) r15
            long r7 = r7 * r9
            long r5 = r5 - r7
            int r15 = (int) r5
            int r14 = r14.f31414e
            int r14 = r14 - r15
            if (r14 <= 0) goto L_0x00e2
            int r14 = java.lang.Math.min(r0, r14)
            android.media.AudioTrack r15 = r12.f31369s
            byte[] r1 = r12.f31338N
            int r5 = r12.f31339O
            int r14 = r15.write(r1, r5, r14)
            if (r14 <= 0) goto L_0x00f9
            int r15 = r12.f31339O
            int r15 = r15 + r14
            r12.f31339O = r15
            int r15 = r13.position()
            int r15 = r15 + r14
            r13.position(r15)
            goto L_0x00f9
        L_0x0075:
            boolean r1 = r12.f31347W
            if (r1 == 0) goto L_0x00f3
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0084
            r1 = r3
            goto L_0x0085
        L_0x0084:
            r1 = r2
        L_0x0085:
            p513bj.C14075p.m21694f(r1)
            android.media.AudioTrack r6 = r12.f31369s
            r7 = 1000(0x3e8, double:4.94E-321)
            r1 = 26
            if (r4 < r1) goto L_0x009a
            r9 = 1
            long r10 = r14 * r7
            r7 = r13
            r8 = r0
            int r14 = r6.write(r7, r8, r9, r10)
            goto L_0x00f9
        L_0x009a:
            java.nio.ByteBuffer r1 = r12.f31374x
            if (r1 != 0) goto L_0x00b3
            r1 = 16
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r12.f31374x = r1
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            r1.order(r5)
            java.nio.ByteBuffer r1 = r12.f31374x
            r5 = 1431633921(0x55550001, float:1.46372496E13)
            r1.putInt(r5)
        L_0x00b3:
            int r1 = r12.f31375y
            if (r1 != 0) goto L_0x00cc
            java.nio.ByteBuffer r1 = r12.f31374x
            r5 = 4
            r1.putInt(r5, r0)
            java.nio.ByteBuffer r1 = r12.f31374x
            r5 = 8
            long r14 = r14 * r7
            r1.putLong(r5, r14)
            java.nio.ByteBuffer r14 = r12.f31374x
            r14.position(r2)
            r12.f31375y = r0
        L_0x00cc:
            java.nio.ByteBuffer r14 = r12.f31374x
            int r14 = r14.remaining()
            if (r14 <= 0) goto L_0x00e4
            java.nio.ByteBuffer r15 = r12.f31374x
            int r15 = r6.write(r15, r14, r3)
            if (r15 >= 0) goto L_0x00e0
            r12.f31375y = r2
            r14 = r15
            goto L_0x00f9
        L_0x00e0:
            if (r15 >= r14) goto L_0x00e4
        L_0x00e2:
            r14 = r2
            goto L_0x00f9
        L_0x00e4:
            int r14 = r6.write(r13, r0, r3)
            if (r14 >= 0) goto L_0x00ed
            r12.f31375y = r2
            goto L_0x00f9
        L_0x00ed:
            int r15 = r12.f31375y
            int r15 = r15 - r14
            r12.f31375y = r15
            goto L_0x00f9
        L_0x00f3:
            android.media.AudioTrack r14 = r12.f31369s
            int r14 = r14.write(r13, r0, r3)
        L_0x00f9:
            long r5 = android.os.SystemClock.elapsedRealtime()
            r12.f31348X = r5
            if (r14 >= 0) goto L_0x013a
            r13 = 24
            if (r4 < r13) goto L_0x0108
            r13 = -6
            if (r14 == r13) goto L_0x010c
        L_0x0108:
            r13 = -32
            if (r14 != r13) goto L_0x010e
        L_0x010c:
            r13 = r3
            goto L_0x010f
        L_0x010e:
            r13 = r2
        L_0x010f:
            if (r13 == 0) goto L_0x011d
            com.google.android.exoplayer2.audio.DefaultAudioSink$c r15 = r12.f31368r
            int r15 = r15.f31381c
            if (r15 != r3) goto L_0x0118
            r2 = r3
        L_0x0118:
            if (r2 != 0) goto L_0x011b
            goto L_0x011d
        L_0x011b:
            r12.f31349Y = r3
        L_0x011d:
            com.google.android.exoplayer2.audio.AudioSink$WriteException r15 = new com.google.android.exoplayer2.audio.AudioSink$WriteException
            com.google.android.exoplayer2.audio.DefaultAudioSink$c r0 = r12.f31368r
            com.google.android.exoplayer2.Format r0 = r0.f31379a
            r15.<init>(r14, r0, r13)
            com.google.android.exoplayer2.audio.AudioSink$a r13 = r12.f31366p
            if (r13 == 0) goto L_0x012f
            com.google.android.exoplayer2.audio.f$a r13 = (com.google.android.exoplayer2.audio.C14196f.C14197a) r13
            r13.mo47263a(r15)
        L_0x012f:
            boolean r13 = r15.isRecoverable
            if (r13 != 0) goto L_0x0139
            com.google.android.exoplayer2.audio.DefaultAudioSink$f<com.google.android.exoplayer2.audio.AudioSink$WriteException> r13 = r12.f31365o
            r13.mo47231a(r15)
            return
        L_0x0139:
            throw r15
        L_0x013a:
            com.google.android.exoplayer2.audio.DefaultAudioSink$f<com.google.android.exoplayer2.audio.AudioSink$WriteException> r15 = r12.f31365o
            r1 = 0
            r15.f31395a = r1
            android.media.AudioTrack r15 = r12.f31369s
            boolean r15 = m21991z(r15)
            if (r15 == 0) goto L_0x017f
            long r4 = r12.f31327C
            r6 = 0
            int r15 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r15 <= 0) goto L_0x0151
            r12.f31350Z = r2
        L_0x0151:
            boolean r15 = r12.f31343S
            if (r15 == 0) goto L_0x017f
            com.google.android.exoplayer2.audio.AudioSink$a r15 = r12.f31366p
            if (r15 == 0) goto L_0x017f
            if (r14 >= r0) goto L_0x017f
            boolean r15 = r12.f31350Z
            if (r15 != 0) goto L_0x017f
            com.google.android.exoplayer2.audio.b r15 = r12.f31359i
            long r6 = r15.mo47250a()
            long r4 = r4 - r6
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r6
            int r15 = r15.f31416g
            long r6 = (long) r15
            long r4 = r4 / r6
            long r4 = p594jh.C17912g.m30088b(r4)
            com.google.android.exoplayer2.audio.AudioSink$a r15 = r12.f31366p
            com.google.android.exoplayer2.audio.f$a r15 = (com.google.android.exoplayer2.audio.C14196f.C14197a) r15
            com.google.android.exoplayer2.audio.f r15 = com.google.android.exoplayer2.audio.C14196f.this
            jh.d1$a r15 = r15.f31456Q1
            if (r15 == 0) goto L_0x017f
            r15.mo69371b(r4)
        L_0x017f:
            com.google.android.exoplayer2.audio.DefaultAudioSink$c r15 = r12.f31368r
            int r15 = r15.f31381c
            if (r15 != 0) goto L_0x018b
            long r4 = r12.f31326B
            long r6 = (long) r14
            long r4 = r4 + r6
            r12.f31326B = r4
        L_0x018b:
            if (r14 != r0) goto L_0x01a4
            if (r15 == 0) goto L_0x01a2
            java.nio.ByteBuffer r14 = r12.f31335K
            if (r13 != r14) goto L_0x0194
            r2 = r3
        L_0x0194:
            p513bj.C14075p.m21694f(r2)
            long r13 = r12.f31327C
            int r15 = r12.f31328D
            int r0 = r12.f31336L
            int r15 = r15 * r0
            long r2 = (long) r15
            long r13 = r13 + r2
            r12.f31327C = r13
        L_0x01a2:
            r12.f31337M = r1
        L_0x01a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.mo47215I(java.nio.ByteBuffer, long):void");
    }

    /* renamed from: a */
    public final C17986y0 mo47185a() {
        return this.f31361k ? this.f31373w : mo47218u().f31391a;
    }

    /* renamed from: b */
    public final void mo47186b(C17986y0 y0Var) {
        C17986y0 y0Var2 = new C17986y0(C14049b0.m21635h(y0Var.f39326a, 0.1f, 8.0f), C14049b0.m21635h(y0Var.f39327b, 0.1f, 8.0f));
        if (!this.f31361k || C14049b0.f30913a < 23) {
            mo47210D(y0Var2, mo47218u().f31392b);
        } else {
            mo47211E(y0Var2);
        }
    }

    /* renamed from: c */
    public final void mo47187c(float f) {
        if (this.f31332H != f) {
            this.f31332H = f;
            mo47212F();
        }
    }

    /* renamed from: d */
    public final boolean mo47188d() {
        return mo47222y() && this.f31359i.mo47251b(mo47220w());
    }

    /* renamed from: e */
    public final void mo47189e(int i) {
        if (this.f31345U != i) {
            this.f31345U = i;
            this.f31344T = i != 0;
            flush();
        }
    }

    /* renamed from: f */
    public final void mo47190f(C18167d dVar) {
        if (!this.f31370t.equals(dVar)) {
            this.f31370t = dVar;
            if (!this.f31347W) {
                flush();
            }
        }
    }

    public final void flush() {
        if (mo47222y()) {
            mo47209C();
            AudioTrack audioTrack = this.f31359i.f31412c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f31369s.pause();
            }
            if (m21991z(this.f31369s)) {
                C14187h hVar = this.f31363m;
                hVar.getClass();
                this.f31369s.unregisterStreamEventCallback(hVar.f31399b);
                hVar.f31398a.removeCallbacksAndMessages((Object) null);
            }
            AudioTrack audioTrack2 = this.f31369s;
            this.f31369s = null;
            if (C14049b0.f30913a < 21 && !this.f31344T) {
                this.f31345U = 0;
            }
            C14182c cVar = this.f31367q;
            if (cVar != null) {
                this.f31368r = cVar;
                this.f31367q = null;
            }
            C14191b bVar = this.f31359i;
            bVar.f31421l = 0;
            bVar.f31432w = 0;
            bVar.f31431v = 0;
            bVar.f31422m = 0;
            bVar.f31406C = 0;
            bVar.f31409F = 0;
            bVar.f31420k = false;
            bVar.f31412c = null;
            bVar.f31415f = null;
            this.f31358h.close();
            new C14180a(audioTrack2).start();
        }
        this.f31365o.f31395a = null;
        this.f31364n.f31395a = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if ((r4 == 536870912 || r4 == 805306368 || r4 == 4) != false) goto L_0x0037;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47192g(com.google.android.exoplayer2.Format r12, int[] r13) throws com.google.android.exoplayer2.audio.AudioSink.ConfigurationException {
        /*
            r11 = this;
            java.lang.String r0 = r12.sampleMimeType
            java.lang.String r1 = "audio/raw"
            boolean r0 = r1.equals(r0)
            r1 = 0
            r3 = 1
            r4 = -1
            if (r0 == 0) goto L_0x00a2
            int r0 = r12.pcmEncoding
            boolean r0 = p513bj.C14049b0.m21621B(r0)
            p513bj.C14075p.m21691c(r0)
            int r0 = r12.pcmEncoding
            int r4 = r12.channelCount
            int r0 = p513bj.C14049b0.m21647t(r0, r4)
            int r4 = r12.pcmEncoding
            boolean r5 = r11.f31353c
            if (r5 == 0) goto L_0x0036
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            if (r4 == r5) goto L_0x0032
            r5 = 805306368(0x30000000, float:4.656613E-10)
            if (r4 == r5) goto L_0x0032
            r5 = 4
            if (r4 != r5) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r4 = r1
            goto L_0x0033
        L_0x0032:
            r4 = r3
        L_0x0033:
            if (r4 == 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r3 = r1
        L_0x0037:
            if (r3 == 0) goto L_0x003c
            com.google.android.exoplayer2.audio.AudioProcessor[] r3 = r11.f31357g
            goto L_0x003e
        L_0x003c:
            com.google.android.exoplayer2.audio.AudioProcessor[] r3 = r11.f31356f
        L_0x003e:
            com.google.android.exoplayer2.audio.j r4 = r11.f31355e
            int r5 = r12.encoderDelay
            int r6 = r12.encoderPadding
            r4.f31485i = r5
            r4.f31486j = r6
            int r4 = p513bj.C14049b0.f30913a
            r5 = 21
            if (r4 >= r5) goto L_0x0061
            int r4 = r12.channelCount
            r5 = 8
            if (r4 != r5) goto L_0x0061
            if (r13 != 0) goto L_0x0061
            r4 = 6
            int[] r5 = new int[r4]
            r6 = r1
        L_0x005a:
            if (r6 >= r4) goto L_0x0062
            r5[r6] = r6
            int r6 = r6 + 1
            goto L_0x005a
        L_0x0061:
            r5 = r13
        L_0x0062:
            com.google.android.exoplayer2.audio.d r4 = r11.f31354d
            r4.f31443i = r5
            com.google.android.exoplayer2.audio.AudioProcessor$a r4 = new com.google.android.exoplayer2.audio.AudioProcessor$a
            int r5 = r12.sampleRate
            int r6 = r12.channelCount
            int r7 = r12.pcmEncoding
            r4.<init>(r5, r6, r7)
            int r5 = r3.length
            r6 = r1
        L_0x0073:
            if (r6 >= r5) goto L_0x008c
            r7 = r3[r6]
            com.google.android.exoplayer2.audio.AudioProcessor$a r8 = r7.mo47178c(r4)     // Catch:{ UnhandledAudioFormatException -> 0x0085 }
            boolean r7 = r7.isActive()     // Catch:{ UnhandledAudioFormatException -> 0x0085 }
            if (r7 == 0) goto L_0x0082
            r4 = r8
        L_0x0082:
            int r6 = r6 + 1
            goto L_0x0073
        L_0x0085:
            r0 = move-exception
            com.google.android.exoplayer2.audio.AudioSink$ConfigurationException r1 = new com.google.android.exoplayer2.audio.AudioSink$ConfigurationException
            r1.<init>((java.lang.Throwable) r0, (com.google.android.exoplayer2.Format) r12)
            throw r1
        L_0x008c:
            int r5 = r4.f31323c
            int r6 = r4.f31321a
            int r7 = r4.f31322b
            int r7 = p513bj.C14049b0.m21642o(r7)
            int r4 = r4.f31322b
            int r4 = p513bj.C14049b0.m21647t(r5, r4)
            r10 = r3
            r8 = r5
            r3 = r0
            r5 = r4
            r4 = r1
            goto L_0x00e3
        L_0x00a2:
            com.google.android.exoplayer2.audio.AudioProcessor[] r0 = new com.google.android.exoplayer2.audio.AudioProcessor[r1]
            int r5 = r12.sampleRate
            lh.d r6 = r11.f31370t
            boolean r6 = r11.mo47214H(r12, r6)
            if (r6 == 0) goto L_0x00c6
            java.lang.String r6 = r12.sampleMimeType
            r6.getClass()
            java.lang.String r7 = r12.codecs
            int r6 = p513bj.C14065m.m21673c(r6, r7)
            int r7 = r12.channelCount
            int r7 = p513bj.C14049b0.m21642o(r7)
            r10 = r0
            r8 = r6
        L_0x00c1:
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r5
            goto L_0x00e3
        L_0x00c6:
            r3 = 2
            lh.e r6 = r11.f31351a
            android.util.Pair r6 = m21990t(r12, r6)
            if (r6 == 0) goto L_0x014e
            java.lang.Object r7 = r6.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r6 = r6.second
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r10 = r0
            r8 = r7
            r7 = r6
            goto L_0x00c1
        L_0x00e3:
            java.lang.String r0 = ") for: "
            if (r8 == 0) goto L_0x0127
            if (r7 == 0) goto L_0x0100
            r11.f31349Y = r1
            com.google.android.exoplayer2.audio.DefaultAudioSink$c r0 = new com.google.android.exoplayer2.audio.DefaultAudioSink$c
            boolean r9 = r11.f31361k
            r1 = r0
            r2 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r1 = r11.mo47222y()
            if (r1 == 0) goto L_0x00fd
            r11.f31367q = r0
            goto L_0x00ff
        L_0x00fd:
            r11.f31368r = r0
        L_0x00ff:
            return
        L_0x0100:
            com.google.android.exoplayer2.audio.AudioSink$ConfigurationException r1 = new com.google.android.exoplayer2.audio.AudioSink$ConfigurationException
            java.lang.String r3 = java.lang.String.valueOf(r12)
            int r5 = r3.length()
            int r5 = r5 + 54
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Invalid output channel config (mode="
            r6.append(r5)
            r6.append(r4)
            r6.append(r0)
            r6.append(r3)
            java.lang.String r0 = r6.toString()
            r1.<init>((java.lang.String) r0, (com.google.android.exoplayer2.Format) r12)
            throw r1
        L_0x0127:
            com.google.android.exoplayer2.audio.AudioSink$ConfigurationException r1 = new com.google.android.exoplayer2.audio.AudioSink$ConfigurationException
            java.lang.String r3 = java.lang.String.valueOf(r12)
            int r5 = r3.length()
            int r5 = r5 + 48
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Invalid output encoding (mode="
            r6.append(r5)
            r6.append(r4)
            r6.append(r0)
            r6.append(r3)
            java.lang.String r0 = r6.toString()
            r1.<init>((java.lang.String) r0, (com.google.android.exoplayer2.Format) r12)
            throw r1
        L_0x014e:
            com.google.android.exoplayer2.audio.AudioSink$ConfigurationException r0 = new com.google.android.exoplayer2.audio.AudioSink$ConfigurationException
            java.lang.String r1 = java.lang.String.valueOf(r12)
            int r3 = r1.length()
            int r3 = r3 + 37
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Unable to configure passthrough for: "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.<init>((java.lang.String) r1, (com.google.android.exoplayer2.Format) r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.mo47192g(com.google.android.exoplayer2.Format, int[]):void");
    }

    /* renamed from: h */
    public final void mo47193h() {
        if (this.f31347W) {
            this.f31347W = false;
            flush();
        }
    }

    /* renamed from: i */
    public final void mo47194i(C18179o oVar) {
        if (!this.f31346V.equals(oVar)) {
            int i = oVar.f39780a;
            float f = oVar.f39781b;
            AudioTrack audioTrack = this.f31369s;
            if (audioTrack != null) {
                if (this.f31346V.f39780a != i) {
                    audioTrack.attachAuxEffect(i);
                }
                if (i != 0) {
                    this.f31369s.setAuxEffectSendLevel(f);
                }
            }
            this.f31346V = oVar;
        }
    }

    public final boolean isEnded() {
        return !mo47222y() || (this.f31341Q && !mo47188d());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0288, code lost:
        r8 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0289, code lost:
        r1.f31328D = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x028b, code lost:
        if (r8 != 0) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x028d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e5, code lost:
        if (r5.mo47250a() == 0) goto L_0x00e7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0107 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0108  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo47196j(java.nio.ByteBuffer r18, long r19, int r21) throws com.google.android.exoplayer2.audio.AudioSink.InitializationException, com.google.android.exoplayer2.audio.AudioSink.WriteException {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r4 = r21
            java.nio.ByteBuffer r5 = r1.f31335K
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x0013
            if (r0 != r5) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r5 = r7
            goto L_0x0014
        L_0x0013:
            r5 = r6
        L_0x0014:
            p513bj.C14075p.m21691c(r5)
            com.google.android.exoplayer2.audio.DefaultAudioSink$c r5 = r1.f31367q
            r8 = 0
            if (r5 == 0) goto L_0x0080
            boolean r5 = r17.mo47217r()
            if (r5 != 0) goto L_0x0023
            return r7
        L_0x0023:
            com.google.android.exoplayer2.audio.DefaultAudioSink$c r5 = r1.f31367q
            com.google.android.exoplayer2.audio.DefaultAudioSink$c r9 = r1.f31368r
            r5.getClass()
            int r10 = r9.f31381c
            int r11 = r5.f31381c
            if (r10 != r11) goto L_0x004a
            int r10 = r9.f31385g
            int r11 = r5.f31385g
            if (r10 != r11) goto L_0x004a
            int r10 = r9.f31383e
            int r11 = r5.f31383e
            if (r10 != r11) goto L_0x004a
            int r10 = r9.f31384f
            int r11 = r5.f31384f
            if (r10 != r11) goto L_0x004a
            int r9 = r9.f31382d
            int r5 = r5.f31382d
            if (r9 != r5) goto L_0x004a
            r5 = r6
            goto L_0x004b
        L_0x004a:
            r5 = r7
        L_0x004b:
            if (r5 != 0) goto L_0x005b
            r17.mo47207A()
            boolean r5 = r17.mo47188d()
            if (r5 == 0) goto L_0x0057
            return r7
        L_0x0057:
            r17.flush()
            goto L_0x007d
        L_0x005b:
            com.google.android.exoplayer2.audio.DefaultAudioSink$c r5 = r1.f31367q
            r1.f31368r = r5
            r1.f31367q = r8
            android.media.AudioTrack r5 = r1.f31369s
            boolean r5 = m21991z(r5)
            if (r5 == 0) goto L_0x007d
            android.media.AudioTrack r5 = r1.f31369s
            r5.setOffloadEndOfStream()
            android.media.AudioTrack r5 = r1.f31369s
            com.google.android.exoplayer2.audio.DefaultAudioSink$c r9 = r1.f31368r
            com.google.android.exoplayer2.Format r9 = r9.f31379a
            int r10 = r9.encoderDelay
            int r9 = r9.encoderPadding
            r5.setOffloadDelayPadding(r10, r9)
            r1.f31350Z = r6
        L_0x007d:
            r1.mo47216q(r2)
        L_0x0080:
            boolean r5 = r17.mo47222y()
            if (r5 != 0) goto L_0x0097
            r17.mo47221x()     // Catch:{ InitializationException -> 0x008a }
            goto L_0x0097
        L_0x008a:
            r0 = move-exception
            r2 = r0
            boolean r0 = r2.isRecoverable
            if (r0 != 0) goto L_0x0096
            com.google.android.exoplayer2.audio.DefaultAudioSink$f<com.google.android.exoplayer2.audio.AudioSink$InitializationException> r0 = r1.f31364n
            r0.mo47231a(r2)
            return r7
        L_0x0096:
            throw r2
        L_0x0097:
            com.google.android.exoplayer2.audio.DefaultAudioSink$f<com.google.android.exoplayer2.audio.AudioSink$InitializationException> r5 = r1.f31364n
            r5.f31395a = r8
            boolean r5 = r1.f31330F
            r8 = 0
            if (r5 == 0) goto L_0x00c4
            long r10 = java.lang.Math.max(r8, r2)
            r1.f31331G = r10
            r1.f31329E = r7
            r1.f31330F = r7
            boolean r5 = r1.f31361k
            if (r5 == 0) goto L_0x00ba
            int r5 = p513bj.C14049b0.f30913a
            r10 = 23
            if (r5 < r10) goto L_0x00ba
            jh.y0 r5 = r1.f31373w
            r1.mo47211E(r5)
        L_0x00ba:
            r1.mo47216q(r2)
            boolean r5 = r1.f31343S
            if (r5 == 0) goto L_0x00c4
            r17.play()
        L_0x00c4:
            com.google.android.exoplayer2.audio.b r5 = r1.f31359i
            long r10 = r17.mo47220w()
            android.media.AudioTrack r12 = r5.f31412c
            r12.getClass()
            int r12 = r12.getPlayState()
            boolean r13 = r5.f31417h
            r14 = 2
            if (r13 == 0) goto L_0x00e9
            if (r12 != r14) goto L_0x00dd
            r5.f31425p = r7
            goto L_0x00e7
        L_0x00dd:
            if (r12 != r6) goto L_0x00e9
            long r15 = r5.mo47250a()
            int r8 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r8 != 0) goto L_0x00e9
        L_0x00e7:
            r5 = r7
            goto L_0x0105
        L_0x00e9:
            boolean r8 = r5.f31425p
            boolean r9 = r5.mo47251b(r10)
            r5.f31425p = r9
            if (r8 == 0) goto L_0x0104
            if (r9 != 0) goto L_0x0104
            if (r12 == r6) goto L_0x0104
            com.google.android.exoplayer2.audio.b$a r8 = r5.f31410a
            int r9 = r5.f31414e
            long r10 = r5.f31418i
            long r10 = p594jh.C17912g.m30088b(r10)
            r8.mo47232a(r9, r10)
        L_0x0104:
            r5 = r6
        L_0x0105:
            if (r5 != 0) goto L_0x0108
            return r7
        L_0x0108:
            java.nio.ByteBuffer r5 = r1.f31335K
            if (r5 != 0) goto L_0x031b
            java.nio.ByteOrder r5 = r18.order()
            java.nio.ByteOrder r8 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r5 != r8) goto L_0x0116
            r5 = r6
            goto L_0x0117
        L_0x0116:
            r5 = r7
        L_0x0117:
            p513bj.C14075p.m21691c(r5)
            boolean r5 = r18.hasRemaining()
            if (r5 != 0) goto L_0x0121
            return r6
        L_0x0121:
            com.google.android.exoplayer2.audio.DefaultAudioSink$c r5 = r1.f31368r
            int r8 = r5.f31381c
            if (r8 == 0) goto L_0x028e
            int r8 = r1.f31328D
            if (r8 != 0) goto L_0x028e
            int r5 = r5.f31385g
            r8 = 1024(0x400, float:1.435E-42)
            r9 = -2
            r10 = -1
            r11 = 16
            switch(r5) {
                case 5: goto L_0x0249;
                case 6: goto L_0x0249;
                case 7: goto L_0x01ee;
                case 8: goto L_0x01ee;
                case 9: goto L_0x01c9;
                case 10: goto L_0x0289;
                case 11: goto L_0x01c5;
                case 12: goto L_0x01c5;
                case 13: goto L_0x0136;
                case 14: goto L_0x0161;
                case 15: goto L_0x015d;
                case 16: goto L_0x0289;
                case 17: goto L_0x0144;
                case 18: goto L_0x0249;
                default: goto L_0x0136;
            }
        L_0x0136:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r2 = 38
            java.lang.String r3 = "Unexpected audio encoding: "
            java.lang.String r2 = android.support.p013v4.media.C0072d.m200g(r2, r3, r5)
            r0.<init>(r2)
            throw r0
        L_0x0144:
            byte[] r5 = new byte[r11]
            int r8 = r18.position()
            r0.get(r5)
            r0.position(r8)
            bj.q r8 = new bj.q
            r8.<init>((int) r11, (byte[]) r5)
            lh.c$a r5 = p611lh.C18165c.m30680b(r8)
            int r8 = r5.f39737c
            goto L_0x0289
        L_0x015d:
            r8 = 512(0x200, float:7.175E-43)
            goto L_0x0289
        L_0x0161:
            int r5 = r18.position()
            int r8 = r18.limit()
            int r8 = r8 + -10
            r9 = r5
        L_0x016c:
            if (r9 > r8) goto L_0x018f
            int r12 = r9 + 4
            int r13 = p513bj.C14049b0.f30913a
            int r12 = r0.getInt(r12)
            java.nio.ByteOrder r13 = r18.order()
            java.nio.ByteOrder r14 = java.nio.ByteOrder.BIG_ENDIAN
            if (r13 != r14) goto L_0x017f
            goto L_0x0183
        L_0x017f:
            int r12 = java.lang.Integer.reverseBytes(r12)
        L_0x0183:
            r12 = r12 & -2
            r13 = -126718022(0xfffffffff8726fba, float:-1.966878E34)
            if (r12 != r13) goto L_0x018c
            int r9 = r9 - r5
            goto L_0x0190
        L_0x018c:
            int r9 = r9 + 1
            goto L_0x016c
        L_0x018f:
            r9 = r10
        L_0x0190:
            if (r9 != r10) goto L_0x0195
            r8 = r7
            goto L_0x0289
        L_0x0195:
            int r5 = r18.position()
            int r5 = r5 + r9
            int r5 = r5 + 7
            byte r5 = r0.get(r5)
            r5 = r5 & 255(0xff, float:3.57E-43)
            r8 = 187(0xbb, float:2.62E-43)
            if (r5 != r8) goto L_0x01a8
            r5 = r6
            goto L_0x01a9
        L_0x01a8:
            r5 = r7
        L_0x01a9:
            r8 = 40
            int r10 = r18.position()
            int r10 = r10 + r9
            if (r5 == 0) goto L_0x01b5
            r5 = 9
            goto L_0x01b7
        L_0x01b5:
            r5 = 8
        L_0x01b7:
            int r10 = r10 + r5
            byte r5 = r0.get(r10)
            int r5 = r5 >> 4
            r5 = r5 & 7
            int r5 = r8 << r5
            int r5 = r5 * r11
            goto L_0x0288
        L_0x01c5:
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0289
        L_0x01c9:
            int r5 = r18.position()
            int r8 = p513bj.C14049b0.f30913a
            int r5 = r0.getInt(r5)
            java.nio.ByteOrder r8 = r18.order()
            java.nio.ByteOrder r9 = java.nio.ByteOrder.BIG_ENDIAN
            if (r8 != r9) goto L_0x01dc
            goto L_0x01e0
        L_0x01dc:
            int r5 = java.lang.Integer.reverseBytes(r5)
        L_0x01e0:
            int r8 = p611lh.C18182r.m30685b(r5)
            if (r8 == r10) goto L_0x01e8
            goto L_0x0289
        L_0x01e8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x01ee:
            int r5 = r18.position()
            byte r8 = r0.get(r5)
            if (r8 == r9) goto L_0x0232
            if (r8 == r10) goto L_0x021f
            r9 = 31
            if (r8 == r9) goto L_0x020e
            int r8 = r5 + 4
            byte r8 = r0.get(r8)
            r8 = r8 & r6
            int r8 = r8 << 6
            int r5 = r5 + 5
            byte r5 = r0.get(r5)
            goto L_0x0241
        L_0x020e:
            int r8 = r5 + 5
            byte r8 = r0.get(r8)
            r8 = r8 & 7
            int r8 = r8 << 4
            int r5 = r5 + 6
            byte r5 = r0.get(r5)
            goto L_0x022f
        L_0x021f:
            int r8 = r5 + 4
            byte r8 = r0.get(r8)
            r8 = r8 & 7
            int r8 = r8 << 4
            int r5 = r5 + 7
            byte r5 = r0.get(r5)
        L_0x022f:
            r5 = r5 & 60
            goto L_0x0243
        L_0x0232:
            int r8 = r5 + 5
            byte r8 = r0.get(r8)
            r8 = r8 & r6
            int r8 = r8 << 6
            int r5 = r5 + 4
            byte r5 = r0.get(r5)
        L_0x0241:
            r5 = r5 & 252(0xfc, float:3.53E-43)
        L_0x0243:
            int r5 = r5 >> r14
            r5 = r5 | r8
            int r5 = r5 + r6
            int r8 = r5 * 32
            goto L_0x0289
        L_0x0249:
            int r5 = r18.position()
            int r5 = r5 + 5
            byte r5 = r0.get(r5)
            r5 = r5 & 248(0xf8, float:3.48E-43)
            r8 = 3
            int r5 = r5 >> r8
            r9 = 10
            if (r5 <= r9) goto L_0x025d
            r5 = r6
            goto L_0x025e
        L_0x025d:
            r5 = r7
        L_0x025e:
            if (r5 == 0) goto L_0x0286
            int r5 = r18.position()
            int r5 = r5 + 4
            byte r5 = r0.get(r5)
            r5 = r5 & 192(0xc0, float:2.69E-43)
            int r5 = r5 >> 6
            if (r5 != r8) goto L_0x0271
            goto L_0x027f
        L_0x0271:
            int r5 = r18.position()
            int r5 = r5 + 4
            byte r5 = r0.get(r5)
            r5 = r5 & 48
            int r8 = r5 >> 4
        L_0x027f:
            int[] r5 = p611lh.C18164b.f39728a
            r5 = r5[r8]
            int r5 = r5 * 256
            goto L_0x0288
        L_0x0286:
            r5 = 1536(0x600, float:2.152E-42)
        L_0x0288:
            r8 = r5
        L_0x0289:
            r1.f31328D = r8
            if (r8 != 0) goto L_0x028e
            return r6
        L_0x028e:
            com.google.android.exoplayer2.audio.DefaultAudioSink$e r5 = r1.f31371u
            if (r5 == 0) goto L_0x029f
            boolean r5 = r17.mo47217r()
            if (r5 != 0) goto L_0x0299
            return r7
        L_0x0299:
            r1.mo47216q(r2)
            r5 = 0
            r1.f31371u = r5
        L_0x029f:
            long r8 = r1.f31331G
            com.google.android.exoplayer2.audio.DefaultAudioSink$c r5 = r1.f31368r
            long r10 = r17.mo47219v()
            com.google.android.exoplayer2.audio.j r12 = r1.f31355e
            long r12 = r12.f31491o
            long r10 = r10 - r12
            r12 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r10 * r12
            com.google.android.exoplayer2.Format r5 = r5.f31379a
            int r5 = r5.sampleRate
            long r12 = (long) r5
            long r10 = r10 / r12
            long r10 = r10 + r8
            boolean r5 = r1.f31329E
            if (r5 != 0) goto L_0x02d6
            long r8 = r10 - r2
            long r8 = java.lang.Math.abs(r8)
            r12 = 200000(0x30d40, double:9.8813E-319)
            int r5 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x02d6
            com.google.android.exoplayer2.audio.AudioSink$a r5 = r1.f31366p
            com.google.android.exoplayer2.audio.AudioSink$UnexpectedDiscontinuityException r8 = new com.google.android.exoplayer2.audio.AudioSink$UnexpectedDiscontinuityException
            r8.<init>(r2, r10)
            com.google.android.exoplayer2.audio.f$a r5 = (com.google.android.exoplayer2.audio.C14196f.C14197a) r5
            r5.mo47263a(r8)
            r1.f31329E = r6
        L_0x02d6:
            boolean r5 = r1.f31329E
            if (r5 == 0) goto L_0x02fd
            boolean r5 = r17.mo47217r()
            if (r5 != 0) goto L_0x02e1
            return r7
        L_0x02e1:
            long r8 = r2 - r10
            long r10 = r1.f31331G
            long r10 = r10 + r8
            r1.f31331G = r10
            r1.f31329E = r7
            r1.mo47216q(r2)
            com.google.android.exoplayer2.audio.AudioSink$a r5 = r1.f31366p
            if (r5 == 0) goto L_0x02fd
            r10 = 0
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x02fd
            com.google.android.exoplayer2.audio.f$a r5 = (com.google.android.exoplayer2.audio.C14196f.C14197a) r5
            com.google.android.exoplayer2.audio.f r5 = com.google.android.exoplayer2.audio.C14196f.this
            r5.f31454O1 = r6
        L_0x02fd:
            com.google.android.exoplayer2.audio.DefaultAudioSink$c r5 = r1.f31368r
            int r5 = r5.f31381c
            if (r5 != 0) goto L_0x030e
            long r8 = r1.f31376z
            int r5 = r18.remaining()
            long r10 = (long) r5
            long r8 = r8 + r10
            r1.f31376z = r8
            goto L_0x0317
        L_0x030e:
            long r8 = r1.f31325A
            int r5 = r1.f31328D
            int r5 = r5 * r4
            long r10 = (long) r5
            long r8 = r8 + r10
            r1.f31325A = r8
        L_0x0317:
            r1.f31335K = r0
            r1.f31336L = r4
        L_0x031b:
            r1.mo47208B(r2)
            java.nio.ByteBuffer r0 = r1.f31335K
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L_0x032c
            r0 = 0
            r1.f31335K = r0
            r1.f31336L = r7
            return r6
        L_0x032c:
            com.google.android.exoplayer2.audio.b r0 = r1.f31359i
            long r2 = r17.mo47220w()
            long r4 = r0.f31434y
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0352
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0352
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r0.f31434y
            long r2 = r2 - r4
            r4 = 200(0xc8, double:9.9E-322)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0352
            r0 = r6
            goto L_0x0353
        L_0x0352:
            r0 = r7
        L_0x0353:
            if (r0 == 0) goto L_0x0360
            java.lang.String r0 = "DefaultAudioSink"
            java.lang.String r2 = "Resetting stalled audio track"
            android.util.Log.w(r0, r2)
            r17.flush()
            return r6
        L_0x0360:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.mo47196j(java.nio.ByteBuffer, long, int):boolean");
    }

    /* renamed from: k */
    public final int mo47197k(Format format) {
        boolean z = true;
        if ("audio/raw".equals(format.sampleMimeType)) {
            if (!C14049b0.m21621B(format.pcmEncoding)) {
                C0023f.m112m(33, "Invalid PCM encoding: ", format.pcmEncoding, "DefaultAudioSink");
                return 0;
            }
            int i = format.pcmEncoding;
            return (i == 2 || (this.f31353c && i == 4)) ? 2 : 1;
        } else if (!this.f31349Y && mo47214H(format, this.f31370t)) {
            return 2;
        } else {
            if (m21990t(format, this.f31351a) == null) {
                z = false;
            }
            return z ? 2 : 0;
        }
    }

    /* renamed from: l */
    public final void mo47198l() throws AudioSink.WriteException {
        if (!this.f31341Q && mo47222y() && mo47217r()) {
            mo47207A();
            this.f31341Q = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x029d A[LOOP:1: B:124:0x0287->B:128:0x029d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b2 A[Catch:{ Exception -> 0x01bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01d7  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo47199m(boolean r31) {
        /*
            r30 = this;
            r0 = r30
            boolean r1 = r30.mo47222y()
            if (r1 == 0) goto L_0x02fd
            boolean r1 = r0.f31330F
            if (r1 == 0) goto L_0x000e
            goto L_0x02fd
        L_0x000e:
            com.google.android.exoplayer2.audio.b r1 = r0.f31359i
            android.media.AudioTrack r2 = r1.f31412c
            r2.getClass()
            int r2 = r2.getPlayState()
            r3 = 2
            r4 = 3
            r10 = 1
            r11 = 0
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r15 = 1000(0x3e8, double:4.94E-321)
            if (r2 != r4) goto L_0x01c5
            long r17 = r1.mo47250a()
            long r17 = r17 * r13
            int r2 = r1.f31416g
            long r6 = (long) r2
            long r26 = r17 / r6
            int r2 = (r26 > r11 ? 1 : (r26 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0036
            goto L_0x01c5
        L_0x0036:
            long r6 = java.lang.System.nanoTime()
            long r6 = r6 / r15
            long r8 = r1.f31422m
            long r8 = r6 - r8
            r19 = 30000(0x7530, double:1.4822E-319)
            int r2 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r2 < 0) goto L_0x0075
            long[] r2 = r1.f31411b
            int r8 = r1.f31431v
            long r19 = r26 - r6
            r2[r8] = r19
            int r8 = r8 + r10
            r2 = 10
            int r8 = r8 % r2
            r1.f31431v = r8
            int r8 = r1.f31432w
            if (r8 >= r2) goto L_0x005a
            int r8 = r8 + r10
            r1.f31432w = r8
        L_0x005a:
            r1.f31422m = r6
            r1.f31421l = r11
            r2 = 0
        L_0x005f:
            int r8 = r1.f31432w
            if (r2 >= r8) goto L_0x0075
            long r11 = r1.f31421l
            long[] r9 = r1.f31411b
            r19 = r9[r2]
            long r8 = (long) r8
            long r19 = r19 / r8
            long r8 = r19 + r11
            r1.f31421l = r8
            int r2 = r2 + 1
            r11 = 0
            goto L_0x005f
        L_0x0075:
            boolean r2 = r1.f31417h
            if (r2 == 0) goto L_0x007b
            goto L_0x01c5
        L_0x007b:
            lh.n r2 = r1.f31415f
            r2.getClass()
            lh.n$a r8 = r2.f39769a
            r9 = 4
            if (r8 == 0) goto L_0x0117
            long r13 = r2.f39773e
            long r13 = r6 - r13
            long r11 = r2.f39772d
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0091
            goto L_0x0117
        L_0x0091:
            r2.f39773e = r6
            android.media.AudioTrack r11 = r8.f39775a
            android.media.AudioTimestamp r12 = r8.f39776b
            boolean r11 = r11.getTimestamp(r12)
            if (r11 == 0) goto L_0x00bc
            android.media.AudioTimestamp r12 = r8.f39776b
            long r12 = r12.framePosition
            r28 = r6
            long r5 = r8.f39778d
            int r5 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x00b1
            long r5 = r8.f39777c
            r19 = 1
            long r5 = r5 + r19
            r8.f39777c = r5
        L_0x00b1:
            r8.f39778d = r12
            long r5 = r8.f39777c
            r7 = 32
            long r5 = r5 << r7
            long r12 = r12 + r5
            r8.f39779e = r12
            goto L_0x00be
        L_0x00bc:
            r28 = r6
        L_0x00be:
            int r5 = r2.f39770b
            if (r5 == 0) goto L_0x00f1
            if (r5 == r10) goto L_0x00dd
            if (r5 == r3) goto L_0x00d7
            if (r5 == r4) goto L_0x00d1
            if (r5 != r9) goto L_0x00cb
            goto L_0x011a
        L_0x00cb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00d1:
            if (r11 == 0) goto L_0x011a
            r2.mo69720a()
            goto L_0x011a
        L_0x00d7:
            if (r11 != 0) goto L_0x011a
            r2.mo69720a()
            goto L_0x011a
        L_0x00dd:
            if (r11 == 0) goto L_0x00ed
            lh.n$a r4 = r2.f39769a
            long r4 = r4.f39779e
            long r6 = r2.f39774f
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x011a
            r2.mo69721b(r3)
            goto L_0x011a
        L_0x00ed:
            r2.mo69720a()
            goto L_0x011a
        L_0x00f1:
            if (r11 == 0) goto L_0x0108
            lh.n$a r4 = r2.f39769a
            android.media.AudioTimestamp r5 = r4.f39776b
            long r5 = r5.nanoTime
            long r5 = r5 / r15
            long r7 = r2.f39771c
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L_0x0119
            long r4 = r4.f39779e
            r2.f39774f = r4
            r2.mo69721b(r10)
            goto L_0x011a
        L_0x0108:
            long r5 = r2.f39771c
            long r6 = r28 - r5
            r12 = 500000(0x7a120, double:2.47033E-318)
            int r5 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x011a
            r2.mo69721b(r4)
            goto L_0x011a
        L_0x0117:
            r28 = r6
        L_0x0119:
            r11 = 0
        L_0x011a:
            r4 = 5000000(0x4c4b40, double:2.470328E-317)
            if (r11 != 0) goto L_0x0120
            goto L_0x0178
        L_0x0120:
            lh.n$a r6 = r2.f39769a
            if (r6 == 0) goto L_0x012c
            android.media.AudioTimestamp r7 = r6.f39776b
            long r7 = r7.nanoTime
            long r7 = r7 / r15
            r22 = r7
            goto L_0x0131
        L_0x012c:
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0131:
            if (r6 == 0) goto L_0x0138
            long r6 = r6.f39779e
            r20 = r6
            goto L_0x013a
        L_0x0138:
            r20 = -1
        L_0x013a:
            long r6 = r22 - r28
            long r6 = java.lang.Math.abs(r6)
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0151
            com.google.android.exoplayer2.audio.b$a r6 = r1.f31410a
            r19 = r6
            r24 = r28
            r19.mo47236e(r20, r22, r24, r26)
            r2.mo69721b(r9)
            goto L_0x0178
        L_0x0151:
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r11 = r20 * r6
            int r6 = r1.f31416g
            long r6 = (long) r6
            long r11 = r11 / r6
            long r11 = r11 - r26
            long r6 = java.lang.Math.abs(r11)
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0171
            com.google.android.exoplayer2.audio.b$a r6 = r1.f31410a
            r19 = r6
            r24 = r28
            r19.mo47235d(r20, r22, r24, r26)
            r2.mo69721b(r9)
            goto L_0x0178
        L_0x0171:
            int r6 = r2.f39770b
            if (r6 != r9) goto L_0x0178
            r2.mo69720a()
        L_0x0178:
            boolean r2 = r1.f31426q
            if (r2 == 0) goto L_0x01c5
            java.lang.reflect.Method r2 = r1.f31423n
            if (r2 == 0) goto L_0x01c5
            long r6 = r1.f31427r
            long r6 = r28 - r6
            r8 = 500000(0x7a120, double:2.47033E-318)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x01c5
            android.media.AudioTrack r6 = r1.f31412c     // Catch:{ Exception -> 0x01bc }
            r6.getClass()     // Catch:{ Exception -> 0x01bc }
            r7 = 0
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x01bd }
            java.lang.Object r2 = r2.invoke(r6, r8)     // Catch:{ Exception -> 0x01bd }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x01bd }
            int r6 = p513bj.C14049b0.f30913a     // Catch:{ Exception -> 0x01bd }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x01bd }
            long r8 = (long) r2     // Catch:{ Exception -> 0x01bd }
            long r8 = r8 * r15
            long r11 = r1.f31418i     // Catch:{ Exception -> 0x01bd }
            long r8 = r8 - r11
            r1.f31424o = r8     // Catch:{ Exception -> 0x01bd }
            r11 = 0
            long r8 = java.lang.Math.max(r8, r11)     // Catch:{ Exception -> 0x01bd }
            r1.f31424o = r8     // Catch:{ Exception -> 0x01bd }
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x01c0
            com.google.android.exoplayer2.audio.b$a r2 = r1.f31410a     // Catch:{ Exception -> 0x01bd }
            r2.mo47233b(r8)     // Catch:{ Exception -> 0x01bd }
            r4 = 0
            r1.f31424o = r4     // Catch:{ Exception -> 0x01bd }
            goto L_0x01c0
        L_0x01bc:
            r7 = 0
        L_0x01bd:
            r2 = 0
            r1.f31423n = r2
        L_0x01c0:
            r4 = r28
            r1.f31427r = r4
            goto L_0x01c6
        L_0x01c5:
            r7 = 0
        L_0x01c6:
            long r4 = java.lang.System.nanoTime()
            long r4 = r4 / r15
            lh.n r2 = r1.f31415f
            r2.getClass()
            int r6 = r2.f39770b
            if (r6 != r3) goto L_0x01d5
            r7 = r10
        L_0x01d5:
            if (r7 == 0) goto L_0x01ff
            lh.n$a r2 = r2.f39769a
            if (r2 == 0) goto L_0x01de
            long r8 = r2.f39779e
            goto L_0x01e0
        L_0x01de:
            r8 = -1
        L_0x01e0:
            r11 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r8 * r11
            int r3 = r1.f31416g
            long r11 = (long) r3
            long r8 = r8 / r11
            if (r2 == 0) goto L_0x01f0
            android.media.AudioTimestamp r2 = r2.f39776b
            long r2 = r2.nanoTime
            long r2 = r2 / r15
            goto L_0x01f5
        L_0x01f0:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x01f5:
            long r2 = r4 - r2
            float r6 = r1.f31419j
            long r2 = p513bj.C14049b0.m21645r(r2, r6)
            long r2 = r2 + r8
            goto L_0x021e
        L_0x01ff:
            int r2 = r1.f31432w
            if (r2 != 0) goto L_0x0210
            long r2 = r1.mo47250a()
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r8
            int r6 = r1.f31416g
            long r8 = (long) r6
            long r2 = r2 / r8
            goto L_0x0213
        L_0x0210:
            long r2 = r1.f31421l
            long r2 = r2 + r4
        L_0x0213:
            if (r31 != 0) goto L_0x021e
            long r8 = r1.f31424o
            long r2 = r2 - r8
            r8 = 0
            long r2 = java.lang.Math.max(r8, r2)
        L_0x021e:
            boolean r6 = r1.f31407D
            if (r6 == r7) goto L_0x022a
            long r8 = r1.f31406C
            r1.f31409F = r8
            long r8 = r1.f31405B
            r1.f31408E = r8
        L_0x022a:
            long r8 = r1.f31409F
            long r8 = r4 - r8
            r11 = 1000000(0xf4240, double:4.940656E-318)
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0249
            long r13 = r1.f31408E
            float r6 = r1.f31419j
            long r17 = p513bj.C14049b0.m21645r(r8, r6)
            long r17 = r17 + r13
            long r8 = r8 * r15
            long r8 = r8 / r11
            long r2 = r2 * r8
            long r8 = r15 - r8
            long r8 = r8 * r17
            long r8 = r8 + r2
            long r2 = r8 / r15
        L_0x0249:
            boolean r6 = r1.f31420k
            if (r6 != 0) goto L_0x026f
            long r8 = r1.f31405B
            int r6 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x026f
            r1.f31420k = r10
            long r8 = r2 - r8
            long r8 = p594jh.C17912g.m30088b(r8)
            float r6 = r1.f31419j
            long r8 = p513bj.C14049b0.m21648u(r8, r6)
            long r10 = java.lang.System.currentTimeMillis()
            long r8 = p594jh.C17912g.m30088b(r8)
            long r10 = r10 - r8
            com.google.android.exoplayer2.audio.b$a r6 = r1.f31410a
            r6.mo47234c(r10)
        L_0x026f:
            r1.f31406C = r4
            r1.f31405B = r2
            r1.f31407D = r7
            com.google.android.exoplayer2.audio.DefaultAudioSink$c r1 = r0.f31368r
            long r4 = r30.mo47220w()
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r6
            int r1 = r1.f31383e
            long r6 = (long) r1
            long r4 = r4 / r6
            long r1 = java.lang.Math.min(r2, r4)
        L_0x0287:
            java.util.ArrayDeque<com.google.android.exoplayer2.audio.DefaultAudioSink$e> r3 = r0.f31360j
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x02a8
            java.util.ArrayDeque<com.google.android.exoplayer2.audio.DefaultAudioSink$e> r3 = r0.f31360j
            java.lang.Object r3 = r3.getFirst()
            com.google.android.exoplayer2.audio.DefaultAudioSink$e r3 = (com.google.android.exoplayer2.audio.DefaultAudioSink.C14184e) r3
            long r3 = r3.f31394d
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x02a8
            java.util.ArrayDeque<com.google.android.exoplayer2.audio.DefaultAudioSink$e> r3 = r0.f31360j
            java.lang.Object r3 = r3.remove()
            com.google.android.exoplayer2.audio.DefaultAudioSink$e r3 = (com.google.android.exoplayer2.audio.DefaultAudioSink.C14184e) r3
            r0.f31372v = r3
            goto L_0x0287
        L_0x02a8:
            com.google.android.exoplayer2.audio.DefaultAudioSink$e r3 = r0.f31372v
            long r4 = r3.f31394d
            long r4 = r1 - r4
            jh.y0 r3 = r3.f31391a
            jh.y0 r6 = p594jh.C17986y0.f39325d
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x02be
            com.google.android.exoplayer2.audio.DefaultAudioSink$e r1 = r0.f31372v
            long r1 = r1.f31393c
            long r1 = r1 + r4
            goto L_0x02eb
        L_0x02be:
            java.util.ArrayDeque<com.google.android.exoplayer2.audio.DefaultAudioSink$e> r3 = r0.f31360j
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x02d2
            com.google.android.exoplayer2.audio.DefaultAudioSink$b r1 = r0.f31352b
            long r1 = r1.mo47224a(r4)
            com.google.android.exoplayer2.audio.DefaultAudioSink$e r3 = r0.f31372v
            long r3 = r3.f31393c
            long r1 = r1 + r3
            goto L_0x02eb
        L_0x02d2:
            java.util.ArrayDeque<com.google.android.exoplayer2.audio.DefaultAudioSink$e> r3 = r0.f31360j
            java.lang.Object r3 = r3.getFirst()
            com.google.android.exoplayer2.audio.DefaultAudioSink$e r3 = (com.google.android.exoplayer2.audio.DefaultAudioSink.C14184e) r3
            long r4 = r3.f31394d
            long r4 = r4 - r1
            com.google.android.exoplayer2.audio.DefaultAudioSink$e r1 = r0.f31372v
            jh.y0 r1 = r1.f31391a
            float r1 = r1.f39326a
            long r1 = p513bj.C14049b0.m21645r(r4, r1)
            long r3 = r3.f31393c
            long r1 = r3 - r1
        L_0x02eb:
            com.google.android.exoplayer2.audio.DefaultAudioSink$c r3 = r0.f31368r
            com.google.android.exoplayer2.audio.DefaultAudioSink$b r4 = r0.f31352b
            long r4 = r4.mo47225b()
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r6
            int r3 = r3.f31383e
            long r6 = (long) r3
            long r4 = r4 / r6
            long r4 = r4 + r1
            return r4
        L_0x02fd:
            r1 = -9223372036854775808
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.mo47199m(boolean):long");
    }

    /* renamed from: n */
    public final void mo47200n() {
        this.f31329E = true;
    }

    /* renamed from: o */
    public final void mo47201o() {
        C14075p.m21694f(C14049b0.f30913a >= 21);
        C14075p.m21694f(this.f31344T);
        if (!this.f31347W) {
            this.f31347W = true;
            flush();
        }
    }

    /* renamed from: p */
    public final void mo47202p(boolean z) {
        mo47210D(mo47218u().f31391a, z);
    }

    public final void pause() {
        boolean z = false;
        this.f31343S = false;
        if (mo47222y()) {
            C14191b bVar = this.f31359i;
            bVar.f31421l = 0;
            bVar.f31432w = 0;
            bVar.f31431v = 0;
            bVar.f31422m = 0;
            bVar.f31406C = 0;
            bVar.f31409F = 0;
            bVar.f31420k = false;
            if (bVar.f31433x == -9223372036854775807L) {
                C18177n nVar = bVar.f31415f;
                nVar.getClass();
                nVar.mo69720a();
                z = true;
            }
            if (z) {
                this.f31369s.pause();
            }
        }
    }

    public final void play() {
        this.f31343S = true;
        if (mo47222y()) {
            C18177n nVar = this.f31359i.f31415f;
            nVar.getClass();
            nVar.mo69720a();
            this.f31369s.play();
        }
    }

    /* renamed from: q */
    public final void mo47216q(long j) {
        C14189a.C14190a aVar;
        Handler handler;
        C17986y0 d = mo47213G() ? this.f31352b.mo47227d(mo47218u().f31391a) : C17986y0.f39325d;
        int i = 0;
        boolean c = mo47213G() ? this.f31352b.mo47226c(mo47218u().f31392b) : false;
        this.f31360j.add(new C14184e(d, c, Math.max(0, j), (mo47220w() * 1000000) / ((long) this.f31368r.f31383e)));
        AudioProcessor[] audioProcessorArr = this.f31368r.f31387i;
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : audioProcessorArr) {
            if (audioProcessor.isActive()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.f31333I = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.f31334J = new ByteBuffer[size];
        while (true) {
            AudioProcessor[] audioProcessorArr2 = this.f31333I;
            if (i >= audioProcessorArr2.length) {
                break;
            }
            AudioProcessor audioProcessor2 = audioProcessorArr2[i];
            audioProcessor2.flush();
            this.f31334J[i] = audioProcessor2.mo47176a();
            i++;
        }
        AudioSink.C14179a aVar2 = this.f31366p;
        if (aVar2 != null && (handler = aVar.f31402a) != null) {
            handler.post(new C18175l((aVar = C14196f.this.f31447H1), c));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo47217r() throws com.google.android.exoplayer2.audio.AudioSink.WriteException {
        /*
            r9 = this;
            int r0 = r9.f31340P
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x000b
            r9.f31340P = r3
        L_0x0009:
            r0 = r2
            goto L_0x000c
        L_0x000b:
            r0 = r3
        L_0x000c:
            int r4 = r9.f31340P
            com.google.android.exoplayer2.audio.AudioProcessor[] r5 = r9.f31333I
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x002f
            r4 = r5[r4]
            if (r0 == 0) goto L_0x001f
            r4.mo47179d()
        L_0x001f:
            r9.mo47208B(r7)
            boolean r0 = r4.isEnded()
            if (r0 != 0) goto L_0x0029
            return r3
        L_0x0029:
            int r0 = r9.f31340P
            int r0 = r0 + r2
            r9.f31340P = r0
            goto L_0x0009
        L_0x002f:
            java.nio.ByteBuffer r0 = r9.f31337M
            if (r0 == 0) goto L_0x003b
            r9.mo47215I(r0, r7)
            java.nio.ByteBuffer r0 = r9.f31337M
            if (r0 == 0) goto L_0x003b
            return r3
        L_0x003b:
            r9.f31340P = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.mo47217r():boolean");
    }

    public final void reset() {
        flush();
        for (AudioProcessor reset : this.f31356f) {
            reset.reset();
        }
        for (AudioProcessor reset2 : this.f31357g) {
            reset2.reset();
        }
        this.f31343S = false;
        this.f31349Y = false;
    }

    public final boolean supportsFormat(Format format) {
        return mo47197k(format) != 0;
    }

    /* renamed from: u */
    public final C14184e mo47218u() {
        C14184e eVar = this.f31371u;
        return eVar != null ? eVar : !this.f31360j.isEmpty() ? this.f31360j.getLast() : this.f31372v;
    }

    /* renamed from: v */
    public final long mo47219v() {
        C14182c cVar = this.f31368r;
        return cVar.f31381c == 0 ? this.f31376z / ((long) cVar.f31380b) : this.f31325A;
    }

    /* renamed from: w */
    public final long mo47220w() {
        C14182c cVar = this.f31368r;
        return cVar.f31381c == 0 ? this.f31326B / ((long) cVar.f31382d) : this.f31327C;
    }

    /* renamed from: x */
    public final void mo47221x() throws AudioSink.InitializationException {
        this.f31358h.block();
        boolean z = false;
        try {
            C14182c cVar = this.f31368r;
            cVar.getClass();
            AudioTrack a = cVar.mo47228a(this.f31347W, this.f31370t, this.f31345U);
            this.f31369s = a;
            if (m21991z(a)) {
                AudioTrack audioTrack = this.f31369s;
                if (this.f31363m == null) {
                    this.f31363m = new C14187h();
                }
                C14187h hVar = this.f31363m;
                Handler handler = hVar.f31398a;
                Objects.requireNonNull(handler);
                audioTrack.registerStreamEventCallback(new C18180p(handler), hVar.f31399b);
                AudioTrack audioTrack2 = this.f31369s;
                Format format = this.f31368r.f31379a;
                audioTrack2.setOffloadDelayPadding(format.encoderDelay, format.encoderPadding);
            }
            this.f31345U = this.f31369s.getAudioSessionId();
            C14191b bVar = this.f31359i;
            AudioTrack audioTrack3 = this.f31369s;
            C14182c cVar2 = this.f31368r;
            bVar.mo47252c(audioTrack3, cVar2.f31381c == 2, cVar2.f31385g, cVar2.f31382d, cVar2.f31386h);
            mo47212F();
            int i = this.f31346V.f39780a;
            if (i != 0) {
                this.f31369s.attachAuxEffect(i);
                this.f31369s.setAuxEffectSendLevel(this.f31346V.f39781b);
            }
            this.f31330F = true;
        } catch (AudioSink.InitializationException e) {
            if (this.f31368r.f31381c == 1) {
                z = true;
            }
            if (z) {
                this.f31349Y = true;
            }
            AudioSink.C14179a aVar = this.f31366p;
            if (aVar != null) {
                ((C14196f.C14197a) aVar).mo47263a(e);
            }
            throw e;
        }
    }

    /* renamed from: y */
    public final boolean mo47222y() {
        return this.f31369s != null;
    }
}
