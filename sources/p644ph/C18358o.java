package p644ph;

import android.util.Log;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.flac.VorbisComment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p513bj.C14049b0;
import p513bj.C14076q;

/* renamed from: ph.o */
public final class C18358o {

    /* renamed from: a */
    public final int f40305a;

    /* renamed from: b */
    public final int f40306b;

    /* renamed from: c */
    public final int f40307c;

    /* renamed from: d */
    public final int f40308d;

    /* renamed from: e */
    public final int f40309e;

    /* renamed from: f */
    public final int f40310f;

    /* renamed from: g */
    public final int f40311g;

    /* renamed from: h */
    public final int f40312h;

    /* renamed from: i */
    public final int f40313i;

    /* renamed from: j */
    public final long f40314j;

    /* renamed from: k */
    public final C18359a f40315k;

    /* renamed from: l */
    public final Metadata f40316l;

    /* renamed from: ph.o$a */
    public static class C18359a {

        /* renamed from: a */
        public final long[] f40317a;

        /* renamed from: b */
        public final long[] f40318b;

        public C18359a(long[] jArr, long[] jArr2) {
            this.f40317a = jArr;
            this.f40318b = jArr2;
        }
    }

    public C18358o(int i, byte[] bArr) {
        C14076q qVar = new C14076q(bArr.length, bArr);
        qVar.mo46905l(i * 8);
        this.f40305a = qVar.mo46901h(16);
        this.f40306b = qVar.mo46901h(16);
        this.f40307c = qVar.mo46901h(24);
        this.f40308d = qVar.mo46901h(24);
        int h = qVar.mo46901h(20);
        this.f40309e = h;
        this.f40310f = m31031e(h);
        this.f40311g = qVar.mo46901h(3) + 1;
        int h2 = qVar.mo46901h(5) + 1;
        this.f40312h = h2;
        this.f40313i = m31030b(h2);
        int h3 = qVar.mo46901h(4);
        int h4 = qVar.mo46901h(32);
        int i2 = C14049b0.f30913a;
        this.f40314j = ((((long) h3) & UnsignedInteger.INT_MASK) << 32) | (((long) h4) & UnsignedInteger.INT_MASK);
        this.f40315k = null;
        this.f40316l = null;
    }

    /* renamed from: a */
    public static Metadata m31029a(List<String> list, List<PictureFrame> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            int i2 = C14049b0.f30913a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                Log.w("FlacStreamMetadata", str.length() != 0 ? "Failed to parse Vorbis comment: ".concat(str) : new String("Failed to parse Vorbis comment: "));
            } else {
                arrayList.add(new VorbisComment(split[0], split[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata((List<? extends Metadata.Entry>) arrayList);
    }

    /* renamed from: b */
    public static int m31030b(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    /* renamed from: e */
    public static int m31031e(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: c */
    public final long mo69888c() {
        long j = this.f40314j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f40309e);
    }

    /* renamed from: d */
    public final Format mo69889d(byte[] bArr, Metadata metadata) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.f40308d;
        if (i <= 0) {
            i = -1;
        }
        Metadata metadata2 = this.f40316l;
        if (metadata2 != null) {
            metadata = metadata2.copyWithAppendedEntriesFrom(metadata);
        }
        Format.C14176b bVar = new Format.C14176b();
        bVar.f31303k = "audio/flac";
        bVar.f31304l = i;
        bVar.f31316x = this.f40311g;
        bVar.f31317y = this.f40309e;
        bVar.f31305m = Collections.singletonList(bArr);
        bVar.f31301i = metadata;
        return bVar.mo47144a();
    }

    public C18358o(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, C18359a aVar, Metadata metadata) {
        this.f40305a = i;
        this.f40306b = i2;
        this.f40307c = i3;
        this.f40308d = i4;
        this.f40309e = i5;
        this.f40310f = m31031e(i5);
        this.f40311g = i6;
        this.f40312h = i7;
        this.f40313i = m31030b(i7);
        this.f40314j = j;
        this.f40315k = aVar;
        this.f40316l = metadata;
    }
}
