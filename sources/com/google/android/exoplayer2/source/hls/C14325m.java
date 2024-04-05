package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.compose.material.ripple.C1242h;
import androidx.profileinstaller.C3068j;
import androidx.profileinstaller.C3069k;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.C14216b;
import com.google.android.exoplayer2.drm.C14219c;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.C14347j;
import com.google.android.exoplayer2.source.C14366o;
import com.google.android.exoplayer2.source.C14368p;
import com.google.android.exoplayer2.source.C14372q;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.hls.C14313f;
import com.google.android.exoplayer2.upstream.C14431b;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.common.collect.C16201n0;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p003a2.C0023f;
import p505aj.C13997e;
import p505aj.C14003j;
import p505aj.C14013s;
import p513bj.C14049b0;
import p513bj.C14065m;
import p513bj.C14075p;
import p513bj.C14077r;
import p547di.C17558a;
import p595ji.C17992d;
import p595ji.C17993e;
import p612li.C18186b;
import p644ph.C18348g;
import p644ph.C18351j;
import p644ph.C18364t;
import p644ph.C18368v;

/* renamed from: com.google.android.exoplayer2.source.hls.m */
public final class C14325m implements Loader.C14424a<C18186b>, Loader.C14428e, C14372q, C18351j, C14368p.C14371c {

    /* renamed from: Z */
    public static final Set<Integer> f31950Z = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{1, 2, 5})));

    /* renamed from: A */
    public int f31951A;

    /* renamed from: B */
    public int f31952B;

    /* renamed from: C */
    public boolean f31953C;

    /* renamed from: D */
    public boolean f31954D;

    /* renamed from: E */
    public int f31955E;

    /* renamed from: F */
    public Format f31956F;

    /* renamed from: G */
    public Format f31957G;

    /* renamed from: H */
    public boolean f31958H;

    /* renamed from: I */
    public TrackGroupArray f31959I;

    /* renamed from: J */
    public Set<TrackGroup> f31960J;

    /* renamed from: K */
    public int[] f31961K;

    /* renamed from: L */
    public int f31962L;

    /* renamed from: M */
    public boolean f31963M;

    /* renamed from: N */
    public boolean[] f31964N;

    /* renamed from: O */
    public boolean[] f31965O;

    /* renamed from: P */
    public long f31966P;

    /* renamed from: Q */
    public long f31967Q;

    /* renamed from: R */
    public boolean f31968R;

    /* renamed from: S */
    public boolean f31969S;

    /* renamed from: T */
    public boolean f31970T;

    /* renamed from: V */
    public boolean f31971V;

    /* renamed from: W */
    public long f31972W;

    /* renamed from: X */
    public DrmInitData f31973X;

    /* renamed from: Y */
    public C14321i f31974Y;

    /* renamed from: b */
    public final int f31975b;

    /* renamed from: c */
    public final C14326a f31976c;

    /* renamed from: d */
    public final C14313f f31977d;

    /* renamed from: e */
    public final C14003j f31978e;

    /* renamed from: f */
    public final Format f31979f;

    /* renamed from: g */
    public final C14219c f31980g;

    /* renamed from: h */
    public final C14216b.C14217a f31981h;

    /* renamed from: i */
    public final C14431b f31982i;

    /* renamed from: j */
    public final Loader f31983j = new Loader("Loader:HlsSampleStreamWrapper");

    /* renamed from: k */
    public final C14347j.C14348a f31984k;

    /* renamed from: l */
    public final int f31985l;

    /* renamed from: m */
    public final C14313f.C14315b f31986m = new C14313f.C14315b();

    /* renamed from: n */
    public final ArrayList<C14321i> f31987n;

    /* renamed from: o */
    public final List<C14321i> f31988o;

    /* renamed from: p */
    public final C1242h f31989p;

    /* renamed from: q */
    public final C3068j f31990q;

    /* renamed from: r */
    public final Handler f31991r;

    /* renamed from: s */
    public final ArrayList<C14324l> f31992s;

    /* renamed from: t */
    public final Map<String, DrmInitData> f31993t;

    /* renamed from: u */
    public C18186b f31994u;

    /* renamed from: v */
    public C14328c[] f31995v;

    /* renamed from: w */
    public int[] f31996w = new int[0];

    /* renamed from: x */
    public HashSet f31997x;

    /* renamed from: y */
    public SparseIntArray f31998y;

    /* renamed from: z */
    public C14327b f31999z;

    /* renamed from: com.google.android.exoplayer2.source.hls.m$a */
    public interface C14326a extends C14372q.C14373a<C14325m> {
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.m$b */
    public static class C14327b implements C18368v {

        /* renamed from: g */
        public static final Format f32000g;

        /* renamed from: h */
        public static final Format f32001h;

        /* renamed from: a */
        public final C17558a f32002a = new C17558a();

        /* renamed from: b */
        public final C18368v f32003b;

        /* renamed from: c */
        public final Format f32004c;

        /* renamed from: d */
        public Format f32005d;

        /* renamed from: e */
        public byte[] f32006e;

        /* renamed from: f */
        public int f32007f;

        static {
            Format.C14176b bVar = new Format.C14176b();
            bVar.f31303k = "application/id3";
            f32000g = bVar.mo47144a();
            Format.C14176b bVar2 = new Format.C14176b();
            bVar2.f31303k = "application/x-emsg";
            f32001h = bVar2.mo47144a();
        }

        public C14327b(C18368v vVar, int i) {
            this.f32003b = vVar;
            if (i == 1) {
                this.f32004c = f32000g;
            } else if (i == 3) {
                this.f32004c = f32001h;
            } else {
                throw new IllegalArgumentException(C0072d.m200g(33, "Unknown metadataType: ", i));
            }
            this.f32006e = new byte[0];
            this.f32007f = 0;
        }

        /* renamed from: a */
        public final void mo47752a(Format format) {
            this.f32005d = format;
            this.f32003b.mo47752a(this.f32004c);
        }

        /* renamed from: b */
        public final int mo47753b(C13997e eVar, int i, boolean z) throws IOException {
            int i2 = this.f32007f + i;
            byte[] bArr = this.f32006e;
            if (bArr.length < i2) {
                this.f32006e = Arrays.copyOf(bArr, (i2 / 2) + i2);
            }
            int read = eVar.read(this.f32006e, this.f32007f, i);
            if (read != -1) {
                this.f32007f += read;
                return read;
            } else if (z) {
                return -1;
            } else {
                throw new EOFException();
            }
        }

        /* renamed from: c */
        public final void mo47754c(long j, int i, int i2, int i3, C18368v.C18369a aVar) {
            this.f32005d.getClass();
            int i4 = this.f32007f - i3;
            C14077r rVar = new C14077r(Arrays.copyOfRange(this.f32006e, i4 - i2, i4));
            byte[] bArr = this.f32006e;
            System.arraycopy(bArr, i4, bArr, 0, i3);
            this.f32007f = i3;
            if (!C14049b0.m21628a(this.f32005d.sampleMimeType, this.f32004c.sampleMimeType)) {
                if ("application/x-emsg".equals(this.f32005d.sampleMimeType)) {
                    this.f32002a.getClass();
                    EventMessage u0 = C17558a.m29430u0(rVar);
                    Format wrappedMetadataFormat = u0.getWrappedMetadataFormat();
                    if (!(wrappedMetadataFormat != null && C14049b0.m21628a(this.f32004c.sampleMimeType, wrappedMetadataFormat.sampleMimeType))) {
                        Log.w("EmsgUnwrappingTrackOutput", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", new Object[]{this.f32004c.sampleMimeType, u0.getWrappedMetadataFormat()}));
                        return;
                    }
                    byte[] wrappedMetadataBytes = u0.getWrappedMetadataBytes();
                    wrappedMetadataBytes.getClass();
                    rVar = new C14077r(wrappedMetadataBytes);
                } else {
                    String valueOf = String.valueOf(this.f32005d.sampleMimeType);
                    Log.w("EmsgUnwrappingTrackOutput", valueOf.length() != 0 ? "Ignoring sample for unsupported format: ".concat(valueOf) : new String("Ignoring sample for unsupported format: "));
                    return;
                }
            }
            int i5 = rVar.f30988c - rVar.f30987b;
            this.f32003b.mo69899d(i5, rVar);
            this.f32003b.mo47754c(j, i, i5, i3, aVar);
        }

        /* renamed from: f */
        public final void mo47755f(C14077r rVar, int i) {
            int i2 = this.f32007f + i;
            byte[] bArr = this.f32006e;
            if (bArr.length < i2) {
                this.f32006e = Arrays.copyOf(bArr, (i2 / 2) + i2);
            }
            rVar.mo46911b(this.f32007f, i, this.f32006e);
            this.f32007f += i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.hls.m$c */
    public static final class C14328c extends C14368p {

        /* renamed from: I */
        public final Map<String, DrmInitData> f32008I;

        /* renamed from: J */
        public DrmInitData f32009J;

        public C14328c() {
            throw null;
        }

        public C14328c(C14003j jVar, Looper looper, C14219c cVar, C14216b.C14217a aVar, Map map) {
            super(jVar, looper, cVar, aVar);
            this.f32008I = map;
        }

        /* renamed from: c */
        public final void mo47754c(long j, int i, int i2, int i3, C18368v.C18369a aVar) {
            super.mo47754c(j, i, i2, i3, aVar);
        }

        /* renamed from: l */
        public final Format mo47756l(Format format) {
            DrmInitData drmInitData;
            DrmInitData drmInitData2 = this.f32009J;
            if (drmInitData2 == null) {
                drmInitData2 = format.drmInitData;
            }
            if (!(drmInitData2 == null || (drmInitData = this.f32008I.get(drmInitData2.schemeType)) == null)) {
                drmInitData2 = drmInitData;
            }
            Metadata metadata = format.metadata;
            if (metadata != null) {
                int length = metadata.length();
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    }
                    Metadata.Entry entry = metadata.get(i2);
                    if ((entry instanceof PrivFrame) && "com.apple.streaming.transportStreamTimestamp".equals(((PrivFrame) entry).owner)) {
                        break;
                    }
                    i2++;
                }
                if (i2 != -1) {
                    if (length != 1) {
                        Metadata.Entry[] entryArr = new Metadata.Entry[(length - 1)];
                        while (i < length) {
                            if (i != i2) {
                                entryArr[i < i2 ? i : i - 1] = metadata.get(i);
                            }
                            i++;
                        }
                        metadata = new Metadata(entryArr);
                    }
                }
                if (!(drmInitData2 == format.drmInitData && metadata == format.metadata)) {
                    Format.C14176b buildUpon = format.buildUpon();
                    buildUpon.f31306n = drmInitData2;
                    buildUpon.f31301i = metadata;
                    format = buildUpon.mo47144a();
                }
                return super.mo47756l(format);
            }
            metadata = null;
            Format.C14176b buildUpon2 = format.buildUpon();
            buildUpon2.f31306n = drmInitData2;
            buildUpon2.f31301i = metadata;
            format = buildUpon2.mo47144a();
            return super.mo47756l(format);
        }
    }

    public C14325m(int i, C14326a aVar, C14313f fVar, Map<String, DrmInitData> map, C14003j jVar, long j, Format format, C14219c cVar, C14216b.C14217a aVar2, C14431b bVar, C14347j.C14348a aVar3, int i2) {
        this.f31975b = i;
        this.f31976c = aVar;
        this.f31977d = fVar;
        this.f31993t = map;
        this.f31978e = jVar;
        this.f31979f = format;
        this.f31980g = cVar;
        this.f31981h = aVar2;
        this.f31982i = bVar;
        this.f31984k = aVar3;
        this.f31985l = i2;
        Set<Integer> set = f31950Z;
        this.f31997x = new HashSet(set.size());
        this.f31998y = new SparseIntArray(set.size());
        this.f31995v = new C14328c[0];
        this.f31965O = new boolean[0];
        this.f31964N = new boolean[0];
        ArrayList<C14321i> arrayList = new ArrayList<>();
        this.f31987n = arrayList;
        this.f31988o = Collections.unmodifiableList(arrayList);
        this.f31992s = new ArrayList<>();
        this.f31989p = new C1242h(this, 2);
        this.f31990q = new C3068j(this, 2);
        this.f31991r = C14049b0.m21639l((Handler.Callback) null);
        this.f31966P = j;
        this.f31967Q = j;
    }

    /* renamed from: B */
    public static int m22518B(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    /* renamed from: w */
    public static C18348g m22519w(int i, int i2) {
        Log.w("HlsSampleStreamWrapper", C0023f.m107h(54, "Unmapped track with id ", i, " of type ", i2));
        return new C18348g();
    }

    /* renamed from: y */
    public static Format m22520y(Format format, Format format2, boolean z) {
        String str;
        String str2;
        if (format == null) {
            return format2;
        }
        int h = C14065m.m21678h(format2.sampleMimeType);
        if (C14049b0.m21643p(h, format.codecs) == 1) {
            str2 = C14049b0.m21644q(h, format.codecs);
            str = C14065m.m21674d(str2);
        } else {
            str2 = C14065m.m21672b(format.codecs, format2.sampleMimeType);
            str = format2.sampleMimeType;
        }
        Format.C14176b buildUpon = format2.buildUpon();
        buildUpon.f31293a = format.f31288id;
        buildUpon.f31294b = format.label;
        buildUpon.f31295c = format.language;
        buildUpon.f31296d = format.selectionFlags;
        buildUpon.f31297e = format.roleFlags;
        buildUpon.f31298f = z ? format.averageBitrate : -1;
        buildUpon.f31299g = z ? format.peakBitrate : -1;
        buildUpon.f31300h = str2;
        buildUpon.f31308p = format.width;
        buildUpon.f31309q = format.height;
        if (str != null) {
            buildUpon.f31303k = str;
        }
        int i = format.channelCount;
        if (i != -1) {
            buildUpon.f31316x = i;
        }
        Metadata metadata = format.metadata;
        if (metadata != null) {
            Metadata metadata2 = format2.metadata;
            if (metadata2 != null) {
                metadata = metadata2.copyWithAppendedEntriesFrom(metadata);
            }
            buildUpon.f31301i = metadata;
        }
        return buildUpon.mo47144a();
    }

    /* renamed from: A */
    public final C14321i mo47737A() {
        ArrayList<C14321i> arrayList = this.f31987n;
        return arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: C */
    public final boolean mo47738C() {
        return this.f31967Q != -9223372036854775807L;
    }

    /* renamed from: D */
    public final void mo47739D() {
        if (!this.f31958H && this.f31961K == null && this.f31953C) {
            C14328c[] cVarArr = this.f31995v;
            int length = cVarArr.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                if (cVarArr[i].mo47849p() != null) {
                    i++;
                } else {
                    return;
                }
            }
            TrackGroupArray trackGroupArray = this.f31959I;
            if (trackGroupArray != null) {
                int i2 = trackGroupArray.length;
                int[] iArr = new int[i2];
                this.f31961K = iArr;
                Arrays.fill(iArr, -1);
                for (int i3 = 0; i3 < i2; i3++) {
                    int i4 = 0;
                    while (true) {
                        C14328c[] cVarArr2 = this.f31995v;
                        if (i4 >= cVarArr2.length) {
                            break;
                        }
                        Format p = cVarArr2[i4].mo47849p();
                        C14075p.m21696h(p);
                        Format format = this.f31959I.get(i3).getFormat(0);
                        String str = p.sampleMimeType;
                        String str2 = format.sampleMimeType;
                        int h = C14065m.m21678h(str);
                        if (h == 3 ? C14049b0.m21628a(str, str2) && ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || p.accessibilityChannel == format.accessibilityChannel) : h == C14065m.m21678h(str2)) {
                            this.f31961K[i3] = i4;
                            break;
                        }
                        i4++;
                    }
                }
                Iterator<C14324l> it = this.f31992s.iterator();
                while (it.hasNext()) {
                    it.next().mo47736a();
                }
                return;
            }
            int length2 = this.f31995v.length;
            int i5 = 0;
            int i6 = -1;
            int i7 = 7;
            while (true) {
                int i8 = 2;
                if (i5 >= length2) {
                    break;
                }
                Format p2 = this.f31995v[i5].mo47849p();
                C14075p.m21696h(p2);
                String str3 = p2.sampleMimeType;
                if (!C14065m.m21681k(str3)) {
                    i8 = C14065m.m21679i(str3) ? 1 : C14065m.m21680j(str3) ? 3 : 7;
                }
                if (m22518B(i8) > m22518B(i7)) {
                    i6 = i5;
                    i7 = i8;
                } else if (i8 == i7 && i6 != -1) {
                    i6 = -1;
                }
                i5++;
            }
            TrackGroup trackGroup = this.f31977d.f31874h;
            int i9 = trackGroup.length;
            this.f31962L = -1;
            this.f31961K = new int[length2];
            for (int i10 = 0; i10 < length2; i10++) {
                this.f31961K[i10] = i10;
            }
            TrackGroup[] trackGroupArr = new TrackGroup[length2];
            for (int i11 = 0; i11 < length2; i11++) {
                Format p3 = this.f31995v[i11].mo47849p();
                C14075p.m21696h(p3);
                if (i11 == i6) {
                    Format[] formatArr = new Format[i9];
                    if (i9 == 1) {
                        formatArr[0] = p3.withManifestFormatInfo(trackGroup.getFormat(0));
                    } else {
                        for (int i12 = 0; i12 < i9; i12++) {
                            formatArr[i12] = m22520y(trackGroup.getFormat(i12), p3, true);
                        }
                    }
                    trackGroupArr[i11] = new TrackGroup(formatArr);
                    this.f31962L = i11;
                } else {
                    trackGroupArr[i11] = new TrackGroup(m22520y((i7 != 2 || !C14065m.m21679i(p3.sampleMimeType)) ? null : this.f31979f, p3, false));
                }
            }
            this.f31959I = mo47750x(trackGroupArr);
            if (this.f31960J == null) {
                z = true;
            }
            C14075p.m21694f(z);
            this.f31960J = Collections.emptySet();
            this.f31954D = true;
            ((C14323k) this.f31976c).mo47735r();
        }
    }

    /* renamed from: E */
    public final void mo47740E() throws IOException {
        Loader loader = this.f31983j;
        IOException iOException = loader.f32493c;
        if (iOException == null) {
            Loader.C14426c<? extends Loader.C14427d> cVar = loader.f32492b;
            if (cVar != null) {
                int i = cVar.f32496b;
                IOException iOException2 = cVar.f32500f;
                if (iOException2 != null && cVar.f32501g > i) {
                    throw iOException2;
                }
            }
            C14313f fVar = this.f31977d;
            BehindLiveWindowException behindLiveWindowException = fVar.f31879m;
            if (behindLiveWindowException == null) {
                Uri uri = fVar.f31880n;
                if (uri != null && fVar.f31884r) {
                    fVar.f31873g.mo47767b(uri);
                    return;
                }
                return;
            }
            throw behindLiveWindowException;
        }
        throw iOException;
    }

    /* renamed from: F */
    public final void mo47741F(TrackGroup[] trackGroupArr, int... iArr) {
        this.f31959I = mo47750x(trackGroupArr);
        this.f31960J = new HashSet();
        for (int i : iArr) {
            this.f31960J.add(this.f31959I.get(i));
        }
        this.f31962L = 0;
        Handler handler = this.f31991r;
        C14326a aVar = this.f31976c;
        Objects.requireNonNull(aVar);
        handler.post(new C3069k(aVar, 3));
        this.f31954D = true;
    }

    /* renamed from: G */
    public final void mo47742G() {
        for (C14328c u : this.f31995v) {
            u.mo47854u(this.f31968R);
        }
        this.f31968R = false;
    }

    /* renamed from: H */
    public final boolean mo47743H(long j, boolean z) {
        boolean z2;
        this.f31966P = j;
        if (mo47738C()) {
            this.f31967Q = j;
            return true;
        }
        if (this.f31953C && !z) {
            int length = this.f31995v.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z2 = true;
                    break;
                } else if (this.f31995v[i].mo47855v(j, false) || (!this.f31965O[i] && this.f31963M)) {
                    i++;
                }
            }
            z2 = false;
            if (z2) {
                return false;
            }
        }
        this.f31967Q = j;
        this.f31970T = false;
        this.f31987n.clear();
        if (this.f31983j.mo48164b()) {
            if (this.f31953C) {
                for (C14328c i2 : this.f31995v) {
                    i2.mo47843i();
                }
            }
            this.f31983j.mo48163a();
        } else {
            this.f31983j.f32493c = null;
            mo47742G();
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo1409a() {
        return this.f31983j.mo48164b();
    }

    /* renamed from: b */
    public final long mo1410b() {
        if (mo47738C()) {
            return this.f31967Q;
        }
        if (this.f31970T) {
            return Long.MIN_VALUE;
        }
        return mo47737A().f39832h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03f4  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x041c  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0228  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1411c(long r53) {
        /*
            r52 = this;
            r0 = r52
            boolean r1 = r0.f31970T
            r2 = 0
            if (r1 != 0) goto L_0x052c
            com.google.android.exoplayer2.upstream.Loader r1 = r0.f31983j
            boolean r1 = r1.mo48164b()
            if (r1 != 0) goto L_0x052c
            com.google.android.exoplayer2.upstream.Loader r1 = r0.f31983j
            java.io.IOException r1 = r1.f32493c
            if (r1 == 0) goto L_0x0017
            r1 = 1
            goto L_0x0018
        L_0x0017:
            r1 = r2
        L_0x0018:
            if (r1 == 0) goto L_0x001c
            goto L_0x052c
        L_0x001c:
            boolean r1 = r52.mo47738C()
            if (r1 == 0) goto L_0x0037
            java.util.List r1 = java.util.Collections.emptyList()
            long r4 = r0.f31967Q
            com.google.android.exoplayer2.source.hls.m$c[] r6 = r0.f31995v
            int r7 = r6.length
            r8 = r2
        L_0x002c:
            if (r8 >= r7) goto L_0x004c
            r9 = r6[r8]
            long r10 = r0.f31967Q
            r9.f32302u = r10
            int r8 = r8 + 1
            goto L_0x002c
        L_0x0037:
            java.util.List<com.google.android.exoplayer2.source.hls.i> r1 = r0.f31988o
            com.google.android.exoplayer2.source.hls.i r4 = r52.mo47737A()
            boolean r5 = r4.f31905H
            if (r5 == 0) goto L_0x0044
            long r4 = r4.f39832h
            goto L_0x004c
        L_0x0044:
            long r5 = r0.f31966P
            long r7 = r4.f39831g
            long r4 = java.lang.Math.max(r5, r7)
        L_0x004c:
            r11 = r1
            com.google.android.exoplayer2.source.hls.f$b r1 = r0.f31986m
            r15 = 0
            r1.f31886a = r15
            r1.f31887b = r2
            r1.f31888c = r15
            com.google.android.exoplayer2.source.hls.f r1 = r0.f31977d
            boolean r6 = r0.f31954D
            if (r6 != 0) goto L_0x0066
            boolean r6 = r11.isEmpty()
            if (r6 != 0) goto L_0x0063
            goto L_0x0066
        L_0x0063:
            r20 = r2
            goto L_0x0068
        L_0x0066:
            r20 = 1
        L_0x0068:
            com.google.android.exoplayer2.source.hls.f$b r14 = r0.f31986m
            r1.getClass()
            boolean r6 = r11.isEmpty()
            if (r6 == 0) goto L_0x0075
            r13 = r15
            goto L_0x007c
        L_0x0075:
            java.lang.Object r6 = com.google.common.collect.C16201n0.m26211b(r11)
            com.google.android.exoplayer2.source.hls.i r6 = (com.google.android.exoplayer2.source.hls.C14321i) r6
            r13 = r6
        L_0x007c:
            r12 = -1
            if (r13 != 0) goto L_0x0081
            r9 = r12
            goto L_0x008a
        L_0x0081:
            com.google.android.exoplayer2.source.TrackGroup r6 = r1.f31874h
            com.google.android.exoplayer2.Format r7 = r13.f39828d
            int r6 = r6.indexOf(r7)
            r9 = r6
        L_0x008a:
            long r6 = r4 - r53
            long r2 = r1.f31883q
            r17 = r14
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x009b
            r8 = 1
            goto L_0x009c
        L_0x009b:
            r8 = 0
        L_0x009c:
            if (r8 == 0) goto L_0x00a1
            long r2 = r2 - r53
            goto L_0x00a2
        L_0x00a1:
            r2 = r14
        L_0x00a2:
            if (r13 == 0) goto L_0x00c4
            boolean r8 = r1.f31881o
            if (r8 != 0) goto L_0x00c4
            long r14 = r13.f39832h
            r10 = r9
            long r8 = r13.f39831g
            long r14 = r14 - r8
            long r6 = r6 - r14
            r8 = 0
            long r6 = java.lang.Math.max(r8, r6)
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r21 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r21 == 0) goto L_0x00c7
            long r2 = r2 - r14
            long r2 = java.lang.Math.max(r8, r2)
            goto L_0x00c7
        L_0x00c4:
            r10 = r9
            r18 = r14
        L_0x00c7:
            r7 = r6
            li.e[] r14 = r1.mo47717a(r13, r4)
            com.google.android.exoplayer2.trackselection.b r6 = r1.f31882p
            r15 = r10
            r9 = r2
            r2 = r12
            r12 = r14
            r6.mo47725i(r7, r9, r11, r12)
            com.google.android.exoplayer2.trackselection.b r3 = r1.f31882p
            int r9 = r3.mo47899m()
            if (r15 == r9) goto L_0x00df
            r3 = 1
            goto L_0x00e0
        L_0x00df:
            r3 = 0
        L_0x00e0:
            android.net.Uri[] r6 = r1.f31871e
            r6 = r6[r9]
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r7 = r1.f31873g
            boolean r7 = r7.mo47773j(r6)
            if (r7 != 0) goto L_0x00ff
            r7 = r17
            r7.f31888c = r6
            boolean r2 = r1.f31884r
            android.net.Uri r3 = r1.f31880n
            boolean r3 = r6.equals(r3)
            r2 = r2 & r3
            r1.f31884r = r2
            r1.f31880n = r6
            goto L_0x047c
        L_0x00ff:
            r7 = r17
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r8 = r1.f31873g
            r10 = 1
            com.google.android.exoplayer2.source.hls.playlist.c r8 = r8.mo47772i(r10, r6)
            r8.getClass()
            boolean r10 = r8.f39974c
            r1.f31881o = r10
            boolean r10 = r8.f32131n
            if (r10 == 0) goto L_0x0118
            r53 = r3
            r10 = r18
            goto L_0x0126
        L_0x0118:
            long r10 = r8.f32124g
            r53 = r3
            long r2 = r8.f32137t
            long r10 = r10 + r2
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r2 = r1.f31873g
            long r2 = r2.mo47768c()
            long r10 = r10 - r2
        L_0x0126:
            r1.f31883q = r10
            long r2 = r8.f32124g
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r10 = r1.f31873g
            long r10 = r10.mo47768c()
            long r2 = r2 - r10
            r12 = r1
            r10 = r13
            r14 = r53
            r22 = r15
            r11 = 0
            r15 = r8
            r16 = r2
            r18 = r4
            android.util.Pair r12 = r12.mo47719c(r13, r14, r15, r16, r18)
            java.lang.Object r13 = r12.first
            java.lang.Long r13 = (java.lang.Long) r13
            long r13 = r13.longValue()
            java.lang.Object r12 = r12.second
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r15 = r12
            long r11 = r8.f32127j
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0192
            if (r10 == 0) goto L_0x0192
            if (r53 == 0) goto L_0x0192
            android.net.Uri[] r2 = r1.f31871e
            r6 = r2[r22]
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r2 = r1.f31873g
            r3 = 1
            com.google.android.exoplayer2.source.hls.playlist.c r8 = r2.mo47772i(r3, r6)
            r8.getClass()
            long r2 = r8.f32124g
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r9 = r1.f31873g
            long r11 = r9.mo47768c()
            long r2 = r2 - r11
            r14 = 0
            r12 = r1
            r13 = r10
            r15 = r8
            r16 = r2
            r18 = r4
            android.util.Pair r4 = r12.mo47719c(r13, r14, r15, r16, r18)
            java.lang.Object r5 = r4.first
            java.lang.Long r5 = (java.lang.Long) r5
            long r13 = r5.longValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r15 = r4
            r9 = r22
        L_0x0192:
            long r4 = r8.f32127j
            int r11 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r11 >= 0) goto L_0x01a1
            com.google.android.exoplayer2.source.BehindLiveWindowException r2 = new com.google.android.exoplayer2.source.BehindLiveWindowException
            r2.<init>()
            r1.f31879m = r2
            goto L_0x047c
        L_0x01a1:
            long r4 = r13 - r4
            int r4 = (int) r4
            com.google.common.collect.ImmutableList r5 = r8.f32134q
            int r5 = r5.size()
            if (r4 != r5) goto L_0x01c7
            r5 = -1
            if (r15 == r5) goto L_0x01b0
            goto L_0x01b1
        L_0x01b0:
            r15 = 0
        L_0x01b1:
            com.google.common.collect.ImmutableList r4 = r8.f32135r
            int r4 = r4.size()
            if (r15 >= r4) goto L_0x0225
            com.google.android.exoplayer2.source.hls.f$e r4 = new com.google.android.exoplayer2.source.hls.f$e
            com.google.common.collect.ImmutableList r5 = r8.f32135r
            java.lang.Object r5 = r5.get(r15)
            com.google.android.exoplayer2.source.hls.playlist.c$d r5 = (com.google.android.exoplayer2.source.hls.playlist.C14338c.C14342d) r5
            r4.<init>(r5, r13, r15)
            goto L_0x01ed
        L_0x01c7:
            com.google.common.collect.ImmutableList r5 = r8.f32134q
            java.lang.Object r5 = r5.get(r4)
            com.google.android.exoplayer2.source.hls.playlist.c$c r5 = (com.google.android.exoplayer2.source.hls.playlist.C14338c.C14341c) r5
            r11 = -1
            if (r15 != r11) goto L_0x01d8
            com.google.android.exoplayer2.source.hls.f$e r15 = new com.google.android.exoplayer2.source.hls.f$e
            r15.<init>(r5, r13, r11)
            goto L_0x0226
        L_0x01d8:
            com.google.common.collect.ImmutableList r11 = r5.f32144n
            int r11 = r11.size()
            if (r15 >= r11) goto L_0x01ef
            com.google.android.exoplayer2.source.hls.f$e r4 = new com.google.android.exoplayer2.source.hls.f$e
            com.google.common.collect.ImmutableList r5 = r5.f32144n
            java.lang.Object r5 = r5.get(r15)
            com.google.android.exoplayer2.source.hls.playlist.c$d r5 = (com.google.android.exoplayer2.source.hls.playlist.C14338c.C14342d) r5
            r4.<init>(r5, r13, r15)
        L_0x01ed:
            r15 = r4
            goto L_0x0226
        L_0x01ef:
            r5 = 1
            int r4 = r4 + r5
            com.google.common.collect.ImmutableList r5 = r8.f32134q
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x020b
            com.google.android.exoplayer2.source.hls.f$e r15 = new com.google.android.exoplayer2.source.hls.f$e
            com.google.common.collect.ImmutableList r5 = r8.f32134q
            java.lang.Object r4 = r5.get(r4)
            com.google.android.exoplayer2.source.hls.playlist.c$d r4 = (com.google.android.exoplayer2.source.hls.playlist.C14338c.C14342d) r4
            r11 = 1
            long r13 = r13 + r11
            r5 = -1
            r15.<init>(r4, r13, r5)
            goto L_0x0226
        L_0x020b:
            r11 = 1
            com.google.common.collect.ImmutableList r4 = r8.f32135r
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0225
            com.google.android.exoplayer2.source.hls.f$e r15 = new com.google.android.exoplayer2.source.hls.f$e
            com.google.common.collect.ImmutableList r4 = r8.f32135r
            r5 = 0
            java.lang.Object r4 = r4.get(r5)
            com.google.android.exoplayer2.source.hls.playlist.c$d r4 = (com.google.android.exoplayer2.source.hls.playlist.C14338c.C14342d) r4
            long r13 = r13 + r11
            r15.<init>(r4, r13, r5)
            goto L_0x0226
        L_0x0225:
            r15 = 0
        L_0x0226:
            if (r15 != 0) goto L_0x0269
            boolean r4 = r8.f32131n
            if (r4 != 0) goto L_0x023d
            r7.f31888c = r6
            boolean r2 = r1.f31884r
            android.net.Uri r3 = r1.f31880n
            boolean r3 = r6.equals(r3)
            r2 = r2 & r3
            r1.f31884r = r2
            r1.f31880n = r6
            goto L_0x047c
        L_0x023d:
            if (r20 != 0) goto L_0x0264
            com.google.common.collect.ImmutableList r4 = r8.f32134q
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0248
            goto L_0x0264
        L_0x0248:
            com.google.android.exoplayer2.source.hls.f$e r15 = new com.google.android.exoplayer2.source.hls.f$e
            com.google.common.collect.ImmutableList r4 = r8.f32134q
            java.lang.Object r4 = com.google.common.collect.C16201n0.m26211b(r4)
            com.google.android.exoplayer2.source.hls.playlist.c$d r4 = (com.google.android.exoplayer2.source.hls.playlist.C14338c.C14342d) r4
            long r11 = r8.f32127j
            com.google.common.collect.ImmutableList r5 = r8.f32134q
            int r5 = r5.size()
            long r13 = (long) r5
            long r11 = r11 + r13
            r13 = 1
            long r11 = r11 - r13
            r5 = -1
            r15.<init>(r4, r11, r5)
            goto L_0x0269
        L_0x0264:
            r1 = 1
            r7.f31887b = r1
            goto L_0x047c
        L_0x0269:
            r4 = 0
            r1.f31884r = r4
            r4 = 0
            r1.f31880n = r4
            com.google.android.exoplayer2.source.hls.playlist.c$d r4 = r15.f31892a
            com.google.android.exoplayer2.source.hls.playlist.c$c r4 = r4.f32146c
            if (r4 == 0) goto L_0x0281
            java.lang.String r4 = r4.f32151h
            if (r4 != 0) goto L_0x027a
            goto L_0x0281
        L_0x027a:
            java.lang.String r5 = r8.f39972a
            android.net.Uri r4 = p513bj.C14087z.m21777d(r5, r4)
            goto L_0x0282
        L_0x0281:
            r4 = 0
        L_0x0282:
            com.google.android.exoplayer2.source.hls.f$a r5 = r1.mo47720d(r4, r9)
            r7.f31886a = r5
            if (r5 == 0) goto L_0x028c
            goto L_0x047c
        L_0x028c:
            com.google.android.exoplayer2.source.hls.playlist.c$d r5 = r15.f31892a
            if (r5 == 0) goto L_0x029c
            java.lang.String r5 = r5.f32151h
            if (r5 != 0) goto L_0x0295
            goto L_0x029c
        L_0x0295:
            java.lang.String r11 = r8.f39972a
            android.net.Uri r5 = p513bj.C14087z.m21777d(r11, r5)
            goto L_0x029d
        L_0x029c:
            r5 = 0
        L_0x029d:
            com.google.android.exoplayer2.source.hls.f$a r11 = r1.mo47720d(r5, r9)
            r7.f31886a = r11
            if (r11 == 0) goto L_0x02a7
            goto L_0x047c
        L_0x02a7:
            if (r10 != 0) goto L_0x02ac
            java.util.concurrent.atomic.AtomicInteger r11 = com.google.android.exoplayer2.source.hls.C14321i.f31897L
            goto L_0x02b8
        L_0x02ac:
            android.net.Uri r11 = r10.f31911m
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L_0x02be
            boolean r11 = r10.f31905H
            if (r11 == 0) goto L_0x02be
        L_0x02b8:
            r11 = r6
            r17 = r7
            r51 = 0
            goto L_0x02f0
        L_0x02be:
            com.google.android.exoplayer2.source.hls.playlist.c$d r11 = r15.f31892a
            long r12 = r11.f32149f
            long r12 = r12 + r2
            boolean r14 = r11 instanceof com.google.android.exoplayer2.source.hls.playlist.C14338c.C14339a
            if (r14 == 0) goto L_0x02da
            com.google.android.exoplayer2.source.hls.playlist.c$a r11 = (com.google.android.exoplayer2.source.hls.playlist.C14338c.C14339a) r11
            boolean r11 = r11.f32139m
            if (r11 != 0) goto L_0x02d8
            int r11 = r15.f31894c
            if (r11 != 0) goto L_0x02d6
            boolean r11 = r8.f39974c
            if (r11 == 0) goto L_0x02d6
            goto L_0x02d8
        L_0x02d6:
            r11 = 0
            goto L_0x02dc
        L_0x02d8:
            r11 = 1
            goto L_0x02dc
        L_0x02da:
            boolean r11 = r8.f39974c
        L_0x02dc:
            if (r11 == 0) goto L_0x02ea
            r11 = r6
            r17 = r7
            long r6 = r10.f39832h
            int r6 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x02e8
            goto L_0x02ed
        L_0x02e8:
            r6 = 0
            goto L_0x02ee
        L_0x02ea:
            r11 = r6
            r17 = r7
        L_0x02ed:
            r6 = 1
        L_0x02ee:
            r51 = r6
        L_0x02f0:
            if (r51 == 0) goto L_0x02f8
            boolean r6 = r15.f31895d
            if (r6 == 0) goto L_0x02f8
            goto L_0x047c
        L_0x02f8:
            com.google.android.exoplayer2.source.hls.h r6 = r1.f31867a
            aj.g r7 = r1.f31868b
            com.google.android.exoplayer2.Format[] r12 = r1.f31872f
            r26 = r12[r9]
            java.util.List<com.google.android.exoplayer2.Format> r9 = r1.f31875i
            com.google.android.exoplayer2.trackselection.b r12 = r1.f31882p
            int r33 = r12.mo47726o()
            com.google.android.exoplayer2.trackselection.b r12 = r1.f31882p
            java.lang.Object r34 = r12.mo47724f()
            boolean r12 = r1.f31877k
            t2.h r13 = r1.f31870d
            com.google.android.exoplayer2.source.hls.e r14 = r1.f31876j
            if (r5 != 0) goto L_0x031b
            r14.getClass()
            r5 = 0
            goto L_0x0323
        L_0x031b:
            java.util.LinkedHashMap<android.net.Uri, byte[]> r14 = r14.f31866a
            java.lang.Object r5 = r14.get(r5)
            byte[] r5 = (byte[]) r5
        L_0x0323:
            com.google.android.exoplayer2.source.hls.e r1 = r1.f31876j
            if (r4 != 0) goto L_0x032c
            r1.getClass()
            r1 = 0
            goto L_0x0334
        L_0x032c:
            java.util.LinkedHashMap<android.net.Uri, byte[]> r1 = r1.f31866a
            java.lang.Object r1 = r1.get(r4)
            byte[] r1 = (byte[]) r1
        L_0x0334:
            java.util.concurrent.atomic.AtomicInteger r4 = com.google.android.exoplayer2.source.hls.C14321i.f31897L
            com.google.android.exoplayer2.source.hls.playlist.c$d r4 = r15.f31892a
            r39 = 1
            java.util.Map r41 = java.util.Collections.emptyMap()
            java.lang.String r14 = r8.f39972a
            java.lang.String r0 = r4.f32145b
            android.net.Uri r0 = p513bj.C14087z.m21777d(r14, r0)
            r14 = r12
            r16 = r13
            long r12 = r4.f32153j
            r18 = r9
            r53 = r10
            long r9 = r4.f32154k
            r19 = r14
            boolean r14 = r15.f31895d
            if (r14 == 0) goto L_0x035c
            r14 = 8
            r47 = r14
            goto L_0x035e
        L_0x035c:
            r47 = 0
        L_0x035e:
            java.lang.String r14 = "The uri must be set."
            p513bj.C14075p.m21697i(r0, r14)
            aj.i r25 = new aj.i
            r37 = 0
            r40 = 0
            r46 = 0
            r48 = 0
            r35 = r25
            r36 = r0
            r42 = r12
            r44 = r9
            r35.<init>(r36, r37, r39, r40, r41, r42, r44, r46, r47, r48)
            if (r5 == 0) goto L_0x037d
            r27 = 1
            goto L_0x037f
        L_0x037d:
            r27 = 0
        L_0x037f:
            if (r27 == 0) goto L_0x038b
            java.lang.String r0 = r4.f32152i
            r0.getClass()
            byte[] r0 = com.google.android.exoplayer2.source.hls.C14321i.m22489d(r0)
            goto L_0x038c
        L_0x038b:
            r0 = 0
        L_0x038c:
            if (r5 == 0) goto L_0x0399
            r0.getClass()
            com.google.android.exoplayer2.source.hls.a r9 = new com.google.android.exoplayer2.source.hls.a
            r9.<init>(r7, r5, r0)
            r24 = r9
            goto L_0x039b
        L_0x0399:
            r24 = r7
        L_0x039b:
            com.google.android.exoplayer2.source.hls.playlist.c$c r0 = r4.f32146c
            if (r0 == 0) goto L_0x03de
            if (r1 == 0) goto L_0x03a3
            r5 = 1
            goto L_0x03a4
        L_0x03a3:
            r5 = 0
        L_0x03a4:
            if (r5 == 0) goto L_0x03b0
            java.lang.String r9 = r0.f32152i
            r9.getClass()
            byte[] r9 = com.google.android.exoplayer2.source.hls.C14321i.m22489d(r9)
            goto L_0x03b1
        L_0x03b0:
            r9 = 0
        L_0x03b1:
            java.lang.String r10 = r8.f39972a
            java.lang.String r12 = r0.f32145b
            android.net.Uri r36 = p513bj.C14087z.m21777d(r10, r12)
            aj.i r10 = new aj.i
            long r12 = r0.f32153j
            r20 = r5
            r14 = r6
            long r5 = r0.f32154k
            r35 = r10
            r37 = r12
            r39 = r5
            r35.<init>(r36, r37, r39)
            if (r1 == 0) goto L_0x03d6
            r9.getClass()
            com.google.android.exoplayer2.source.hls.a r0 = new com.google.android.exoplayer2.source.hls.a
            r0.<init>(r7, r1, r9)
            goto L_0x03d7
        L_0x03d6:
            r0 = r7
        L_0x03d7:
            r28 = r0
            r29 = r10
            r30 = r20
            goto L_0x03e5
        L_0x03de:
            r14 = r6
            r28 = 0
            r29 = 0
            r30 = 0
        L_0x03e5:
            long r0 = r4.f32149f
            long r35 = r2 + r0
            long r0 = r4.f32147d
            long r37 = r35 + r0
            int r0 = r8.f32126i
            int r1 = r4.f32148e
            int r0 = r0 + r1
            if (r53 == 0) goto L_0x041c
            r6 = r53
            android.net.Uri r1 = r6.f31911m
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L_0x0404
            boolean r1 = r6.f31905H
            if (r1 == 0) goto L_0x0404
            r1 = 1
            goto L_0x0405
        L_0x0404:
            r1 = 0
        L_0x0405:
            fi.a r2 = r6.f31923y
            bj.r r3 = r6.f31924z
            if (r1 == 0) goto L_0x0416
            boolean r1 = r6.f31907J
            if (r1 != 0) goto L_0x0416
            int r1 = r6.f31910l
            if (r1 != r0) goto L_0x0416
            com.google.android.exoplayer2.source.hls.j r1 = r6.f31900C
            goto L_0x0417
        L_0x0416:
            r1 = 0
        L_0x0417:
            r48 = r1
            r49 = r2
            goto L_0x042d
        L_0x041c:
            fi.a r1 = new fi.a
            r2 = 0
            r1.<init>(r2)
            bj.r r3 = new bj.r
            r5 = 10
            r3.<init>((int) r5)
            r49 = r1
            r48 = r2
        L_0x042d:
            r50 = r3
            com.google.android.exoplayer2.source.hls.i r1 = new com.google.android.exoplayer2.source.hls.i
            long r2 = r15.f31893b
            int r5 = r15.f31894c
            boolean r6 = r15.f31895d
            r7 = 1
            r42 = r6 ^ 1
            boolean r6 = r4.f32155l
            r7 = r16
            java.lang.Object r8 = r7.f17418a
            android.util.SparseArray r8 = (android.util.SparseArray) r8
            java.lang.Object r8 = r8.get(r0)
            bj.y r8 = (p513bj.C14086y) r8
            if (r8 != 0) goto L_0x045b
            bj.y r8 = new bj.y
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8.<init>(r9)
            java.lang.Object r7 = r7.f17418a
            android.util.SparseArray r7 = (android.util.SparseArray) r7
            r7.put(r0, r8)
        L_0x045b:
            r46 = r8
            com.google.android.exoplayer2.drm.DrmInitData r4 = r4.f32150g
            r47 = r4
            r22 = r1
            r23 = r14
            r31 = r11
            r32 = r18
            r39 = r2
            r41 = r5
            r43 = r0
            r44 = r6
            r45 = r19
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r39, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            r0 = r17
            r0.f31886a = r1
            r0 = r52
        L_0x047c:
            com.google.android.exoplayer2.source.hls.f$b r1 = r0.f31986m
            boolean r2 = r1.f31887b
            li.b r3 = r1.f31886a
            android.net.Uri r1 = r1.f31888c
            if (r2 == 0) goto L_0x0491
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f31967Q = r4
            r1 = 1
            r0.f31970T = r1
            return r1
        L_0x0491:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 != 0) goto L_0x04a5
            if (r1 == 0) goto L_0x04a3
            com.google.android.exoplayer2.source.hls.m$a r2 = r0.f31976c
            com.google.android.exoplayer2.source.hls.k r2 = (com.google.android.exoplayer2.source.hls.C14323k) r2
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r2 = r2.f31926c
            r2.mo47770e(r1)
        L_0x04a3:
            r1 = 0
            return r1
        L_0x04a5:
            boolean r1 = r3 instanceof com.google.android.exoplayer2.source.hls.C14321i
            if (r1 == 0) goto L_0x04f5
            r1 = r3
            com.google.android.exoplayer2.source.hls.i r1 = (com.google.android.exoplayer2.source.hls.C14321i) r1
            r0.f31974Y = r1
            com.google.android.exoplayer2.Format r2 = r1.f39828d
            r0.f31956F = r2
            r0.f31967Q = r4
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.i> r2 = r0.f31987n
            r2.add(r1)
            com.google.common.collect.ImmutableList$a r2 = com.google.common.collect.ImmutableList.builder()
            com.google.android.exoplayer2.source.hls.m$c[] r4 = r0.f31995v
            int r5 = r4.length
            r6 = 0
        L_0x04c1:
            if (r6 >= r5) goto L_0x04d4
            r7 = r4[r6]
            int r8 = r7.f32299r
            int r7 = r7.f32298q
            int r8 = r8 + r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r2.mo56633b(r7)
            int r6 = r6 + 1
            goto L_0x04c1
        L_0x04d4:
            com.google.common.collect.ImmutableList r2 = r2.mo56664e()
            r1.f31901D = r0
            r1.f31906I = r2
            com.google.android.exoplayer2.source.hls.m$c[] r2 = r0.f31995v
            int r4 = r2.length
            r5 = 0
        L_0x04e0:
            if (r5 >= r4) goto L_0x04f5
            r6 = r2[r5]
            r6.getClass()
            int r7 = r1.f31909k
            r6.f32277D = r7
            boolean r7 = r1.f31912n
            if (r7 == 0) goto L_0x04f2
            r7 = 1
            r6.f32281H = r7
        L_0x04f2:
            int r5 = r5 + 1
            goto L_0x04e0
        L_0x04f5:
            r0.f31994u = r3
            com.google.android.exoplayer2.upstream.Loader r1 = r0.f31983j
            com.google.android.exoplayer2.upstream.b r2 = r0.f31982i
            int r4 = r3.f39827c
            com.google.android.exoplayer2.upstream.a r2 = (com.google.android.exoplayer2.upstream.C14430a) r2
            int r2 = r2.mo48173b(r4)
            long r8 = r1.mo48166d(r3, r0, r2)
            com.google.android.exoplayer2.source.j$a r10 = r0.f31984k
            ji.d r11 = new ji.d
            long r5 = r3.f39825a
            aj.i r7 = r3.f39826b
            r4 = r11
            r4.<init>(r5, r7, r8)
            int r12 = r3.f39827c
            int r13 = r0.f31975b
            com.google.android.exoplayer2.Format r14 = r3.f39828d
            int r15 = r3.f39829e
            java.lang.Object r1 = r3.f39830f
            long r4 = r3.f39831g
            long r2 = r3.f39832h
            r16 = r1
            r17 = r4
            r19 = r2
            r10.mo47797k(r11, r12, r13, r14, r15, r16, r17, r19)
            r1 = 1
            return r1
        L_0x052c:
            r1 = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.C14325m.mo1411c(long):boolean");
    }

    /* renamed from: d */
    public final long mo1412d() {
        long j;
        if (this.f31970T) {
            return Long.MIN_VALUE;
        }
        if (mo47738C()) {
            return this.f31967Q;
        }
        long j2 = this.f31966P;
        C14321i A = mo47737A();
        if (!A.f31905H) {
            if (this.f31987n.size() > 1) {
                ArrayList<C14321i> arrayList = this.f31987n;
                A = arrayList.get(arrayList.size() - 2);
            } else {
                A = null;
            }
        }
        if (A != null) {
            j2 = Math.max(j2, A.f39832h);
        }
        if (this.f31953C) {
            for (C14328c cVar : this.f31995v) {
                synchronized (cVar) {
                    j = cVar.f32304w;
                }
                j2 = Math.max(j2, j);
            }
        }
        return j2;
    }

    /* renamed from: e */
    public final void mo1413e(long j) {
        if (!(this.f31983j.f32493c != null) && !mo47738C()) {
            if (this.f31983j.mo48164b()) {
                this.f31994u.getClass();
                C14313f fVar = this.f31977d;
                if (fVar.f31879m == null) {
                    fVar.f31882p.getClass();
                    return;
                }
                return;
            }
            int size = this.f31988o.size();
            while (size > 0) {
                int i = size - 1;
                if (this.f31977d.mo47718b(this.f31988o.get(i)) != 2) {
                    break;
                }
                size = i;
            }
            if (size < this.f31988o.size()) {
                mo47751z(size);
            }
            C14313f fVar2 = this.f31977d;
            List<C14321i> list = this.f31988o;
            int size2 = (fVar2.f31879m != null || fVar2.f31882p.length() < 2) ? list.size() : fVar2.f31882p.mo47894k(j, list);
            if (size2 < this.f31987n.size()) {
                mo47751z(size2);
            }
        }
    }

    /* renamed from: g */
    public final void mo47744g(Loader.C14427d dVar, long j, long j2, boolean z) {
        C18186b bVar = (C18186b) dVar;
        this.f31994u = null;
        long j3 = bVar.f39825a;
        C14013s sVar = bVar.f39833i;
        Uri uri = sVar.f30851c;
        C17992d dVar2 = new C17992d(sVar.f30852d, j2);
        this.f31982i.getClass();
        this.f31984k.mo47790d(dVar2, bVar.f39827c, this.f31975b, bVar.f39828d, bVar.f39829e, bVar.f39830f, bVar.f39831g, bVar.f39832h);
        if (!z) {
            if (mo47738C() || this.f31955E == 0) {
                mo47742G();
            }
            if (this.f31955E > 0) {
                ((C14323k) this.f31976c).mo47674l(this);
            }
        }
    }

    /* renamed from: h */
    public final void mo47745h(Loader.C14427d dVar, long j, long j2) {
        C18186b bVar = (C18186b) dVar;
        this.f31994u = null;
        C14313f fVar = this.f31977d;
        fVar.getClass();
        if (bVar instanceof C14313f.C14314a) {
            C14313f.C14314a aVar = (C14313f.C14314a) bVar;
            fVar.f31878l = aVar.f39834j;
            C14312e eVar = fVar.f31876j;
            Uri uri = aVar.f39826b.f30774a;
            byte[] bArr = aVar.f31885l;
            bArr.getClass();
            LinkedHashMap<Uri, byte[]> linkedHashMap = eVar.f31866a;
            uri.getClass();
            byte[] put = linkedHashMap.put(uri, bArr);
        }
        long j3 = bVar.f39825a;
        C14013s sVar = bVar.f39833i;
        Uri uri2 = sVar.f30851c;
        C17992d dVar2 = new C17992d(sVar.f30852d, j2);
        this.f31982i.getClass();
        this.f31984k.mo47792f(dVar2, bVar.f39827c, this.f31975b, bVar.f39828d, bVar.f39829e, bVar.f39830f, bVar.f39831g, bVar.f39832h);
        if (!this.f31954D) {
            mo1411c(this.f31966P);
        } else {
            ((C14323k) this.f31976c).mo47674l(this);
        }
    }

    /* renamed from: l */
    public final void mo4162l(C18364t tVar) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010e  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.exoplayer2.upstream.Loader.C14425b mo47746m(com.google.android.exoplayer2.upstream.Loader.C14427d r24, long r25, long r27, java.io.IOException r29, int r30) {
        /*
            r23 = this;
            r0 = r23
            r12 = r29
            r1 = r24
            li.b r1 = (p612li.C18186b) r1
            boolean r2 = r1 instanceof com.google.android.exoplayer2.source.hls.C14321i
            if (r2 == 0) goto L_0x0028
            r3 = r1
            com.google.android.exoplayer2.source.hls.i r3 = (com.google.android.exoplayer2.source.hls.C14321i) r3
            boolean r3 = r3.f31908K
            if (r3 != 0) goto L_0x0028
            boolean r3 = r12 instanceof com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException
            if (r3 == 0) goto L_0x0028
            r3 = r12
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException r3 = (com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException) r3
            int r3 = r3.responseCode
            r4 = 410(0x19a, float:5.75E-43)
            if (r3 == r4) goto L_0x0024
            r4 = 404(0x194, float:5.66E-43)
            if (r3 != r4) goto L_0x0028
        L_0x0024:
            com.google.android.exoplayer2.upstream.Loader$b r1 = com.google.android.exoplayer2.upstream.Loader.f32488d
            goto L_0x0120
        L_0x0028:
            aj.s r3 = r1.f39833i
            long r3 = r3.f30850b
            ji.d r5 = new ji.d
            aj.s r6 = r1.f39833i
            android.net.Uri r7 = r6.f30851c
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r6 = r6.f30852d
            r7 = r27
            r5.<init>(r6, r7)
            ji.e r6 = new ji.e
            int r14 = r1.f39827c
            int r15 = r0.f31975b
            com.google.android.exoplayer2.Format r7 = r1.f39828d
            int r8 = r1.f39829e
            java.lang.Object r9 = r1.f39830f
            long r10 = r1.f39831g
            long r19 = p594jh.C17912g.m30088b(r10)
            long r10 = r1.f39832h
            long r21 = p594jh.C17912g.m30088b(r10)
            r13 = r6
            r16 = r7
            r17 = r8
            r18 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19, r21)
            com.google.android.exoplayer2.upstream.b$a r7 = new com.google.android.exoplayer2.upstream.b$a
            r8 = r30
            r7.<init>(r5, r6, r12, r8)
            com.google.android.exoplayer2.upstream.b r6 = r0.f31982i
            com.google.android.exoplayer2.upstream.a r6 = (com.google.android.exoplayer2.upstream.C14430a) r6
            long r8 = r6.mo48172a(r7)
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            r13 = 0
            if (r6 == 0) goto L_0x008a
            com.google.android.exoplayer2.source.hls.f r6 = r0.f31977d
            com.google.android.exoplayer2.trackselection.b r14 = r6.f31882p
            com.google.android.exoplayer2.source.TrackGroup r6 = r6.f31874h
            com.google.android.exoplayer2.Format r15 = r1.f39828d
            int r6 = r6.indexOf(r15)
            int r6 = r14.mo70314g(r6)
            boolean r6 = r14.mo47898b(r6, r8)
            r14 = r6
            goto L_0x008b
        L_0x008a:
            r14 = r13
        L_0x008b:
            r6 = 1
            if (r14 == 0) goto L_0x00c5
            if (r2 == 0) goto L_0x00c2
            r7 = 0
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x00c2
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.i> r2 = r0.f31987n
            int r3 = r2.size()
            int r3 = r3 - r6
            java.lang.Object r2 = r2.remove(r3)
            com.google.android.exoplayer2.source.hls.i r2 = (com.google.android.exoplayer2.source.hls.C14321i) r2
            if (r2 != r1) goto L_0x00a7
            r2 = r6
            goto L_0x00a8
        L_0x00a7:
            r2 = r13
        L_0x00a8:
            p513bj.C14075p.m21694f(r2)
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.i> r2 = r0.f31987n
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00b8
            long r2 = r0.f31966P
            r0.f31967Q = r2
            goto L_0x00c2
        L_0x00b8:
            java.util.ArrayList<com.google.android.exoplayer2.source.hls.i> r2 = r0.f31987n
            java.lang.Object r2 = com.google.common.collect.C16201n0.m26211b(r2)
            com.google.android.exoplayer2.source.hls.i r2 = (com.google.android.exoplayer2.source.hls.C14321i) r2
            r2.f31907J = r6
        L_0x00c2:
            com.google.android.exoplayer2.upstream.Loader$b r2 = com.google.android.exoplayer2.upstream.Loader.f32489e
            goto L_0x00da
        L_0x00c5:
            com.google.android.exoplayer2.upstream.b r2 = r0.f31982i
            com.google.android.exoplayer2.upstream.a r2 = (com.google.android.exoplayer2.upstream.C14430a) r2
            long r2 = r2.mo48174c(r7)
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x00d8
            com.google.android.exoplayer2.upstream.Loader$b r4 = new com.google.android.exoplayer2.upstream.Loader$b
            r4.<init>(r13, r2)
            r15 = r4
            goto L_0x00db
        L_0x00d8:
            com.google.android.exoplayer2.upstream.Loader$b r2 = com.google.android.exoplayer2.upstream.Loader.f32490f
        L_0x00da:
            r15 = r2
        L_0x00db:
            int r2 = r15.f32494a
            if (r2 == 0) goto L_0x00e1
            if (r2 != r6) goto L_0x00e2
        L_0x00e1:
            r13 = r6
        L_0x00e2:
            r16 = r13 ^ 1
            com.google.android.exoplayer2.source.j$a r2 = r0.f31984k
            int r3 = r1.f39827c
            int r4 = r0.f31975b
            com.google.android.exoplayer2.Format r6 = r1.f39828d
            int r7 = r1.f39829e
            java.lang.Object r8 = r1.f39830f
            long r9 = r1.f39831g
            long r11 = r1.f39832h
            r1 = r2
            r2 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r10 = r11
            r12 = r29
            r13 = r16
            r1.mo47794h(r2, r3, r4, r5, r6, r7, r8, r10, r12, r13)
            if (r16 == 0) goto L_0x010c
            r1 = 0
            r0.f31994u = r1
            com.google.android.exoplayer2.upstream.b r1 = r0.f31982i
            r1.getClass()
        L_0x010c:
            if (r14 == 0) goto L_0x011f
            boolean r1 = r0.f31954D
            if (r1 != 0) goto L_0x0118
            long r1 = r0.f31966P
            r0.mo1411c(r1)
            goto L_0x011f
        L_0x0118:
            com.google.android.exoplayer2.source.hls.m$a r1 = r0.f31976c
            com.google.android.exoplayer2.source.hls.k r1 = (com.google.android.exoplayer2.source.hls.C14323k) r1
            r1.mo47674l(r0)
        L_0x011f:
            r1 = r15
        L_0x0120:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.C14325m.mo47746m(com.google.android.exoplayer2.upstream.Loader$d, long, long, java.io.IOException, int):com.google.android.exoplayer2.upstream.Loader$b");
    }

    /* renamed from: n */
    public final void mo47747n() {
        for (C14328c cVar : this.f31995v) {
            cVar.mo47854u(true);
            DrmSession drmSession = cVar.f32290i;
            if (drmSession != null) {
                drmSession.mo47274b(cVar.f32286e);
                cVar.f32290i = null;
                cVar.f32289h = null;
            }
        }
    }

    /* renamed from: p */
    public final void mo4163p() {
        this.f31971V = true;
        this.f31991r.post(this.f31990q);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0106 A[RETURN] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p644ph.C18368v mo4164r(int r11, int r12) {
        /*
            r10 = this;
            java.util.Set<java.lang.Integer> r0 = f31950Z
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            boolean r1 = r0.contains(r1)
            r2 = 0
            if (r1 == 0) goto L_0x0042
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            boolean r0 = r0.contains(r1)
            p513bj.C14075p.m21691c(r0)
            android.util.SparseIntArray r0 = r10.f31998y
            r1 = -1
            int r0 = r0.get(r12, r1)
            if (r0 != r1) goto L_0x0022
            goto L_0x0054
        L_0x0022:
            java.util.HashSet r1 = r10.f31997x
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            boolean r1 = r1.add(r3)
            if (r1 == 0) goto L_0x0032
            int[] r1 = r10.f31996w
            r1[r0] = r11
        L_0x0032:
            int[] r1 = r10.f31996w
            r1 = r1[r0]
            if (r1 != r11) goto L_0x003d
            com.google.android.exoplayer2.source.hls.m$c[] r1 = r10.f31995v
            r0 = r1[r0]
            goto L_0x0055
        L_0x003d:
            ph.g r0 = m22519w(r11, r12)
            goto L_0x0055
        L_0x0042:
            r0 = r2
        L_0x0043:
            com.google.android.exoplayer2.source.hls.m$c[] r1 = r10.f31995v
            int r3 = r1.length
            if (r0 >= r3) goto L_0x0054
            int[] r3 = r10.f31996w
            r3 = r3[r0]
            if (r3 != r11) goto L_0x0051
            r0 = r1[r0]
            goto L_0x0055
        L_0x0051:
            int r0 = r0 + 1
            goto L_0x0043
        L_0x0054:
            r0 = 0
        L_0x0055:
            if (r0 != 0) goto L_0x00f3
            boolean r0 = r10.f31971V
            if (r0 == 0) goto L_0x0060
            ph.g r11 = m22519w(r11, r12)
            return r11
        L_0x0060:
            com.google.android.exoplayer2.source.hls.m$c[] r0 = r10.f31995v
            int r0 = r0.length
            r1 = 1
            if (r12 == r1) goto L_0x0069
            r3 = 2
            if (r12 != r3) goto L_0x006a
        L_0x0069:
            r2 = r1
        L_0x006a:
            com.google.android.exoplayer2.source.hls.m$c r9 = new com.google.android.exoplayer2.source.hls.m$c
            aj.j r4 = r10.f31978e
            android.os.Handler r3 = r10.f31991r
            android.os.Looper r5 = r3.getLooper()
            com.google.android.exoplayer2.drm.c r6 = r10.f31980g
            com.google.android.exoplayer2.drm.b$a r7 = r10.f31981h
            java.util.Map<java.lang.String, com.google.android.exoplayer2.drm.DrmInitData> r8 = r10.f31993t
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            long r3 = r10.f31966P
            r9.f32302u = r3
            if (r2 == 0) goto L_0x008a
            com.google.android.exoplayer2.drm.DrmInitData r3 = r10.f31973X
            r9.f32009J = r3
            r9.f32274A = r1
        L_0x008a:
            long r3 = r10.f31972W
            long r5 = r9.f32280G
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0096
            r9.f32280G = r3
            r9.f32274A = r1
        L_0x0096:
            com.google.android.exoplayer2.source.hls.i r3 = r10.f31974Y
            if (r3 == 0) goto L_0x009e
            int r3 = r3.f31909k
            r9.f32277D = r3
        L_0x009e:
            r9.f32288g = r10
            int[] r3 = r10.f31996w
            int r4 = r0 + 1
            int[] r3 = java.util.Arrays.copyOf(r3, r4)
            r10.f31996w = r3
            r3[r0] = r11
            com.google.android.exoplayer2.source.hls.m$c[] r11 = r10.f31995v
            int r3 = p513bj.C14049b0.f30913a
            int r3 = r11.length
            int r3 = r3 + r1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r11, r3)
            int r11 = r11.length
            r1[r11] = r9
            com.google.android.exoplayer2.source.hls.m$c[] r1 = (com.google.android.exoplayer2.source.hls.C14325m.C14328c[]) r1
            r10.f31995v = r1
            boolean[] r11 = r10.f31965O
            boolean[] r11 = java.util.Arrays.copyOf(r11, r4)
            r10.f31965O = r11
            r11[r0] = r2
            boolean r11 = r10.f31963M
            r11 = r11 | r2
            r10.f31963M = r11
            java.util.HashSet r11 = r10.f31997x
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r11.add(r1)
            android.util.SparseIntArray r11 = r10.f31998y
            r11.append(r12, r0)
            int r11 = m22518B(r12)
            int r1 = r10.f31951A
            int r1 = m22518B(r1)
            if (r11 <= r1) goto L_0x00ea
            r10.f31952B = r0
            r10.f31951A = r12
        L_0x00ea:
            boolean[] r11 = r10.f31964N
            boolean[] r11 = java.util.Arrays.copyOf(r11, r4)
            r10.f31964N = r11
            r0 = r9
        L_0x00f3:
            r11 = 5
            if (r12 != r11) goto L_0x0106
            com.google.android.exoplayer2.source.hls.m$b r11 = r10.f31999z
            if (r11 != 0) goto L_0x0103
            com.google.android.exoplayer2.source.hls.m$b r11 = new com.google.android.exoplayer2.source.hls.m$b
            int r12 = r10.f31985l
            r11.<init>(r0, r12)
            r10.f31999z = r11
        L_0x0103:
            com.google.android.exoplayer2.source.hls.m$b r11 = r10.f31999z
            return r11
        L_0x0106:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.C14325m.mo4164r(int, int):ph.v");
    }

    /* renamed from: s */
    public final void mo47748s() {
        this.f31991r.post(this.f31989p);
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups"})
    /* renamed from: v */
    public final void mo47749v() {
        C14075p.m21694f(this.f31954D);
        this.f31959I.getClass();
        this.f31960J.getClass();
    }

    /* renamed from: x */
    public final TrackGroupArray mo47750x(TrackGroup[] trackGroupArr) {
        for (int i = 0; i < trackGroupArr.length; i++) {
            TrackGroup trackGroup = trackGroupArr[i];
            Format[] formatArr = new Format[trackGroup.length];
            for (int i2 = 0; i2 < trackGroup.length; i2++) {
                Format format = trackGroup.getFormat(i2);
                formatArr[i2] = format.copyWithExoMediaCryptoType(this.f31980g.mo47290c(format));
            }
            trackGroupArr[i] = new TrackGroup(formatArr);
        }
        return new TrackGroupArray(trackGroupArr);
    }

    /* renamed from: z */
    public final void mo47751z(int i) {
        boolean z;
        C14075p.m21694f(!this.f31983j.mo48164b());
        int i2 = i;
        while (true) {
            if (i2 >= this.f31987n.size()) {
                i2 = -1;
                break;
            }
            int i3 = i2;
            while (true) {
                if (i3 >= this.f31987n.size()) {
                    C14321i iVar = this.f31987n.get(i2);
                    int i4 = 0;
                    while (true) {
                        if (i4 >= this.f31995v.length) {
                            z = true;
                            break;
                        }
                        int e = iVar.mo47730e(i4);
                        C14328c cVar = this.f31995v[i4];
                        if (cVar.f32299r + cVar.f32301t > e) {
                            break;
                        }
                        i4++;
                    }
                } else if (this.f31987n.get(i3).f31912n) {
                    break;
                } else {
                    i3++;
                }
            }
            z = false;
            if (z) {
                break;
            }
            i2++;
        }
        if (i2 != -1) {
            long j = mo47737A().f39832h;
            C14321i iVar2 = this.f31987n.get(i2);
            ArrayList<C14321i> arrayList = this.f31987n;
            int size = arrayList.size();
            int i5 = C14049b0.f30913a;
            if (i2 < 0 || size > arrayList.size() || i2 > size) {
                throw new IllegalArgumentException();
            }
            if (i2 != size) {
                arrayList.subList(i2, size).clear();
            }
            for (int i6 = 0; i6 < this.f31995v.length; i6++) {
                int e2 = iVar2.mo47730e(i6);
                C14328c cVar2 = this.f31995v[i6];
                C14366o oVar = cVar2.f32282a;
                long j2 = cVar2.mo47844j(e2);
                oVar.f32268g = j2;
                if (j2 != 0) {
                    C14366o.C14367a aVar = oVar.f32265d;
                    if (j2 != aVar.f32269a) {
                        while (oVar.f32268g > aVar.f32270b) {
                            aVar = aVar.f32273e;
                        }
                        C14366o.C14367a aVar2 = aVar.f32273e;
                        oVar.mo47838a(aVar2);
                        C14366o.C14367a aVar3 = new C14366o.C14367a(aVar.f32270b, oVar.f32263b);
                        aVar.f32273e = aVar3;
                        if (oVar.f32268g == aVar.f32270b) {
                            aVar = aVar3;
                        }
                        oVar.f32267f = aVar;
                        if (oVar.f32266e == aVar2) {
                            oVar.f32266e = aVar3;
                        }
                    }
                }
                oVar.mo47838a(oVar.f32265d);
                C14366o.C14367a aVar4 = new C14366o.C14367a(oVar.f32268g, oVar.f32263b);
                oVar.f32265d = aVar4;
                oVar.f32266e = aVar4;
                oVar.f32267f = aVar4;
            }
            if (this.f31987n.isEmpty()) {
                this.f31967Q = this.f31966P;
            } else {
                ((C14321i) C16201n0.m26211b(this.f31987n)).f31907J = true;
            }
            this.f31970T = false;
            C14347j.C14348a aVar5 = this.f31984k;
            aVar5.mo47799m(new C17993e(1, this.f31951A, (Format) null, 3, (Object) null, aVar5.mo47787a(iVar2.f39831g), aVar5.mo47787a(j)));
        }
    }
}
