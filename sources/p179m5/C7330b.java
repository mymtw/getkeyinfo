package p179m5;

import androidx.work.C3436p;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import p169l5.C7267c;

/* renamed from: m5.b */
public abstract class C7330b implements C7267c {

    /* renamed from: o */
    public static final long[] f16248o = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};

    /* renamed from: a */
    public byte[] f16249a = new byte[8];

    /* renamed from: b */
    public int f16250b = 0;

    /* renamed from: c */
    public long f16251c;

    /* renamed from: d */
    public long f16252d;

    /* renamed from: e */
    public long f16253e;

    /* renamed from: f */
    public long f16254f;

    /* renamed from: g */
    public long f16255g;

    /* renamed from: h */
    public long f16256h;

    /* renamed from: i */
    public long f16257i;

    /* renamed from: j */
    public long f16258j;

    /* renamed from: k */
    public long f16259k;

    /* renamed from: l */
    public long f16260l;

    /* renamed from: m */
    public long[] f16261m = new long[80];

    /* renamed from: n */
    public int f16262n;

    public C7330b() {
        mo19609h();
    }

    /* renamed from: d */
    public static long m14055d(long j) {
        return ((j >>> 39) | (j << 25)) ^ (((j << 36) | (j >>> 28)) ^ ((j << 30) | (j >>> 34)));
    }

    /* renamed from: f */
    public static long m14056f(long j) {
        return ((j >>> 41) | (j << 23)) ^ (((j << 50) | (j >>> 14)) ^ ((j << 46) | (j >>> 18)));
    }

    /* renamed from: g */
    public static long m14057g(long j, long j2, long j3) {
        return ((j & j3) ^ (j & j2)) ^ (j2 & j3);
    }

    /* renamed from: b */
    public final void mo19525b(byte[] bArr, int i) {
        int i2 = 0;
        while (this.f16250b != 0 && i > 0) {
            mo19608e(bArr[i2]);
            i2++;
            i--;
        }
        while (i > this.f16249a.length) {
            this.f16261m[this.f16262n] = (((long) C3436p.m8240b(i2 + 4, bArr)) & UnsignedInteger.INT_MASK) | ((((long) C3436p.m8240b(i2, bArr)) & UnsignedInteger.INT_MASK) << 32);
            int i3 = this.f16262n + 1;
            this.f16262n = i3;
            if (i3 == 16) {
                mo19611j();
            }
            byte[] bArr2 = this.f16249a;
            i2 += bArr2.length;
            i -= bArr2.length;
            this.f16251c += (long) bArr2.length;
        }
        while (i > 0) {
            mo19608e(bArr[i2]);
            i2++;
            i--;
        }
    }

    /* renamed from: e */
    public final void mo19608e(byte b) {
        byte[] bArr = this.f16249a;
        int i = this.f16250b;
        int i2 = i + 1;
        this.f16250b = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            this.f16261m[this.f16262n] = ((((long) C3436p.m8240b(0, bArr)) & UnsignedInteger.INT_MASK) << 32) | (UnsignedInteger.INT_MASK & ((long) C3436p.m8240b(4, bArr)));
            int i3 = this.f16262n + 1;
            this.f16262n = i3;
            if (i3 == 16) {
                mo19611j();
            }
            this.f16250b = 0;
        }
        this.f16251c++;
    }

    /* renamed from: h */
    public void mo19609h() {
        this.f16251c = 0;
        this.f16252d = 0;
        int i = 0;
        this.f16250b = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f16249a;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.f16262n = 0;
        while (true) {
            long[] jArr = this.f16261m;
            if (i != jArr.length) {
                jArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: i */
    public final void mo19610i() {
        long j = this.f16251c;
        if (j > 2305843009213693951L) {
            this.f16252d += j >>> 61;
            this.f16251c = j & 2305843009213693951L;
        }
        long j2 = this.f16251c << 3;
        long j3 = this.f16252d;
        byte b = Byte.MIN_VALUE;
        while (true) {
            mo19608e(b);
            if (this.f16250b == 0) {
                break;
            }
            b = 0;
        }
        if (this.f16262n > 14) {
            mo19611j();
        }
        long[] jArr = this.f16261m;
        jArr[14] = j3;
        jArr[15] = j2;
        mo19611j();
    }

    /* renamed from: j */
    public final void mo19611j() {
        long j = this.f16251c;
        if (j > 2305843009213693951L) {
            this.f16252d += j >>> 61;
            this.f16251c = j & 2305843009213693951L;
        }
        for (int i = 16; i <= 79; i++) {
            long[] jArr = this.f16261m;
            long j2 = jArr[i - 2];
            long j3 = ((j2 >>> 6) ^ (((j2 << 45) | (j2 >>> 19)) ^ ((j2 << 3) | (j2 >>> 61)))) + jArr[i - 7];
            long j4 = jArr[i - 15];
            jArr[i] = j3 + ((j4 >>> 7) ^ (((j4 << 63) | (j4 >>> 1)) ^ ((j4 << 56) | (j4 >>> 8)))) + jArr[i - 16];
        }
        long j5 = this.f16253e;
        long j6 = this.f16254f;
        long j7 = this.f16255g;
        long j8 = this.f16256h;
        long j9 = this.f16257i;
        long j10 = this.f16258j;
        long j11 = this.f16259k;
        long j12 = j5;
        long j13 = this.f16260l;
        long j14 = j10;
        long j15 = j11;
        long j16 = j7;
        long j17 = j9;
        int i2 = 0;
        long j18 = j6;
        int i3 = 0;
        while (i2 < 10) {
            int i4 = i3;
            long f = m14056f(j17) + (((~j17) & j15) ^ (j14 & j17));
            long[] jArr2 = f16248o;
            int i5 = i4 + 1;
            long j19 = f + jArr2[i4] + this.f16261m[i4] + j13;
            long j20 = j8 + j19;
            long d = m14055d(j12) + m14057g(j12, j18, j16) + j19;
            int i6 = i5 + 1;
            long f2 = m14056f(j20) + ((j17 & j20) ^ ((~j20) & j14)) + jArr2[i5] + this.f16261m[i5] + j15;
            long j21 = j16 + f2;
            long d2 = m14055d(d) + m14057g(d, j12, j18) + f2;
            int i7 = i6 + 1;
            long f3 = m14056f(j21) + ((j20 & j21) ^ ((~j21) & j17)) + jArr2[i6] + this.f16261m[i6] + j14;
            long j22 = j18 + f3;
            long d3 = m14055d(d2) + m14057g(d2, d, j12) + f3;
            int i8 = i7 + 1;
            long f4 = j17 + m14056f(j22) + ((j21 & j22) ^ ((~j22) & j20)) + jArr2[i7] + this.f16261m[i7];
            long j23 = j12 + f4;
            long d4 = m14055d(d3) + m14057g(d3, d2, d) + f4;
            long j24 = j23;
            int i9 = i8 + 1;
            long f5 = j20 + m14056f(j23) + ((j22 & j24) ^ ((~j24) & j21)) + jArr2[i8] + this.f16261m[i8];
            long j25 = d + f5;
            long d5 = m14055d(d4) + m14057g(d4, d3, d2) + f5;
            long j26 = j25;
            long j27 = j24;
            int i10 = i9 + 1;
            long f6 = j21 + m14056f(j25) + ((j24 & j26) ^ ((~j26) & j22)) + jArr2[i9] + this.f16261m[i9];
            long j28 = d2 + f6;
            j16 = m14055d(d5) + m14057g(d5, d4, d3) + f6;
            long j29 = j28;
            long j30 = d5;
            int i11 = i10 + 1;
            long f7 = j22 + m14056f(j28) + (((~j29) & j27) ^ (j25 & j29)) + jArr2[i10] + this.f16261m[i10];
            long j31 = d3 + f7;
            j18 = m14055d(j16) + m14057g(j16, j30, d4) + f7;
            long f8 = m14056f(j31) + ((j28 & j31) ^ ((~j31) & j25)) + jArr2[i11] + this.f16261m[i11] + j27;
            j8 = j30;
            i2++;
            i3 = i11 + 1;
            j15 = j28;
            j14 = j31;
            j17 = d4 + f8;
            j12 = m14055d(j18) + m14057g(j18, j16, j8) + f8;
            j13 = j25;
        }
        this.f16253e += j12;
        this.f16254f += j18;
        this.f16255g += j16;
        this.f16256h += j8;
        this.f16257i += j17;
        this.f16258j += j14;
        this.f16259k += j15;
        this.f16260l += j13;
        this.f16262n = 0;
        for (int i12 = 0; i12 < 16; i12++) {
            this.f16261m[i12] = 0;
        }
    }
}
