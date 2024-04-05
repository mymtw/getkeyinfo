package p619mh;

import android.media.MediaCodec;
import p513bj.C14049b0;

/* renamed from: mh.b */
public final class C18220b {

    /* renamed from: a */
    public byte[] f39938a;

    /* renamed from: b */
    public byte[] f39939b;

    /* renamed from: c */
    public int f39940c;

    /* renamed from: d */
    public int[] f39941d;

    /* renamed from: e */
    public int[] f39942e;

    /* renamed from: f */
    public int f39943f;

    /* renamed from: g */
    public int f39944g;

    /* renamed from: h */
    public int f39945h;

    /* renamed from: i */
    public final MediaCodec.CryptoInfo f39946i;

    /* renamed from: j */
    public final C18221a f39947j;

    /* renamed from: mh.b$a */
    public static final class C18221a {

        /* renamed from: a */
        public final MediaCodec.CryptoInfo f39948a;

        /* renamed from: b */
        public final MediaCodec.CryptoInfo.Pattern f39949b = new MediaCodec.CryptoInfo.Pattern(0, 0);

        public C18221a(MediaCodec.CryptoInfo cryptoInfo) {
            this.f39948a = cryptoInfo;
        }
    }

    public C18220b() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f39946i = cryptoInfo;
        this.f39947j = C14049b0.f30913a >= 24 ? new C18221a(cryptoInfo) : null;
    }
}
