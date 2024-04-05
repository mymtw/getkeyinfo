package okio;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.session.C0087d;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.play.core.appupdate.C15562d;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import p568fn.C17782b;
import p756lr.C19893f;
import p756lr.C19915y;

public final class SegmentedByteString extends ByteString {

    /* renamed from: d */
    public final transient byte[][] f44390d;

    /* renamed from: e */
    public final transient int[] f44391e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(ByteString.EMPTY.getData$okio());
        C19383o.m32797g(bArr, ResponseConstants.SEGMENTS);
        C19383o.m32797g(iArr, "directory");
        this.f44390d = bArr;
        this.f44391e = iArr;
    }

    private final Object writeReplace() {
        return mo73064e();
    }

    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
        C19383o.m32796f(asReadOnlyBuffer, "ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer()");
        return asReadOnlyBuffer;
    }

    public String base64() {
        return mo73064e().base64();
    }

    public String base64Url() {
        return mo73064e().base64Url();
    }

    public ByteString digest$okio(String str) {
        C19383o.m32797g(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        int length = getSegments$okio().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = getDirectory$okio()[length + i];
            int i4 = getDirectory$okio()[i];
            instance.update(getSegments$okio()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = instance.digest();
        C19383o.m32796f(digest, "digestBytes");
        return new ByteString(digest);
    }

    /* renamed from: e */
    public final ByteString mo73064e() {
        return new ByteString(toByteArray());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == size() && rangeEquals(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    public final int[] getDirectory$okio() {
        return this.f44391e;
    }

    public final byte[][] getSegments$okio() {
        return this.f44390d;
    }

    public int getSize$okio() {
        return getDirectory$okio()[getSegments$okio().length - 1];
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = getSegments$okio().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = getDirectory$okio()[length + i];
            int i5 = getDirectory$okio()[i];
            byte[] bArr = getSegments$okio()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        setHashCode$okio(i2);
        return i2;
    }

    public String hex() {
        return mo73064e().hex();
    }

    public ByteString hmac$okio(String str, ByteString byteString) {
        C19383o.m32797g(str, "algorithm");
        C19383o.m32797g(byteString, "key");
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(byteString.toByteArray(), str));
            int length = getSegments$okio().length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = getDirectory$okio()[length + i];
                int i4 = getDirectory$okio()[i];
                instance.update(getSegments$okio()[i], i3, i4 - i2);
                i++;
                i2 = i4;
            }
            byte[] doFinal = instance.doFinal();
            C19383o.m32796f(doFinal, "mac.doFinal()");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public int indexOf(byte[] bArr, int i) {
        C19383o.m32797g(bArr, "other");
        return mo73064e().indexOf(bArr, i);
    }

    public byte[] internalArray$okio() {
        return toByteArray();
    }

    public byte internalGet$okio(int i) {
        C17782b.m29843I((long) getDirectory$okio()[getSegments$okio().length - 1], (long) i, 1);
        int W = C15562d.m25185W(this, i);
        return getSegments$okio()[W][(i - (W == 0 ? 0 : getDirectory$okio()[W - 1])) + getDirectory$okio()[getSegments$okio().length + W]];
    }

    public int lastIndexOf(byte[] bArr, int i) {
        C19383o.m32797g(bArr, "other");
        return mo73064e().lastIndexOf(bArr, i);
    }

    public boolean rangeEquals(int i, ByteString byteString, int i2, int i3) {
        int i4;
        C19383o.m32797g(byteString, "other");
        if (i < 0 || i > size() - i3) {
            return false;
        }
        int i5 = i3 + i;
        int W = C15562d.m25185W(this, i);
        while (i < i5) {
            if (W == 0) {
                i4 = 0;
            } else {
                i4 = getDirectory$okio()[W - 1];
            }
            int i6 = getDirectory$okio()[getSegments$okio().length + W];
            int min = Math.min(i5, (getDirectory$okio()[W] - i4) + i4) - i;
            if (!byteString.rangeEquals(i2, getSegments$okio()[W], (i - i4) + i6, min)) {
                return false;
            }
            i2 += min;
            i += min;
            W++;
        }
        return true;
    }

    public String string(Charset charset) {
        C19383o.m32797g(charset, "charset");
        return mo73064e().string(charset);
    }

    public ByteString substring(int i, int i2) {
        int i3 = 0;
        if (i >= 0) {
            if (i2 <= size()) {
                int i4 = i2 - i;
                if (!(i4 >= 0)) {
                    throw new IllegalArgumentException(C0087d.m235e("endIndex=", i2, " < beginIndex=", i).toString());
                } else if (i == 0 && i2 == size()) {
                    return this;
                } else {
                    if (i == i2) {
                        return ByteString.EMPTY;
                    }
                    int W = C15562d.m25185W(this, i);
                    int W2 = C15562d.m25185W(this, i2 - 1);
                    byte[][] bArr = (byte[][]) C19318k.m32608Z0(W, W2 + 1, getSegments$okio());
                    int[] iArr = new int[(bArr.length * 2)];
                    if (W <= W2) {
                        int i5 = 0;
                        int i6 = W;
                        while (true) {
                            iArr[i5] = Math.min(getDirectory$okio()[i6] - i, i4);
                            int i7 = i5 + 1;
                            iArr[i5 + bArr.length] = getDirectory$okio()[getSegments$okio().length + i6];
                            if (i6 == W2) {
                                break;
                            }
                            i6++;
                            i5 = i7;
                        }
                    }
                    if (W != 0) {
                        i3 = getDirectory$okio()[W - 1];
                    }
                    int length = bArr.length;
                    iArr[length] = (i - i3) + iArr[length];
                    return new SegmentedByteString(bArr, iArr);
                }
            } else {
                StringBuilder h = C0069a.m177h("endIndex=", i2, " > length(");
                h.append(size());
                h.append(')');
                throw new IllegalArgumentException(h.toString().toString());
            }
        } else {
            throw new IllegalArgumentException(C0069a.m175f("beginIndex=", i, " < 0").toString());
        }
    }

    public ByteString toAsciiLowercase() {
        return mo73064e().toAsciiLowercase();
    }

    public ByteString toAsciiUppercase() {
        return mo73064e().toAsciiUppercase();
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        int length = getSegments$okio().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = getDirectory$okio()[length + i];
            int i5 = getDirectory$okio()[i];
            int i6 = i5 - i2;
            C19318k.m32601S0(getSegments$okio()[i], i3, i4, bArr, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public String toString() {
        return mo73064e().toString();
    }

    public void write(OutputStream outputStream) throws IOException {
        C19383o.m32797g(outputStream, "out");
        int length = getSegments$okio().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = getDirectory$okio()[length + i];
            int i4 = getDirectory$okio()[i];
            outputStream.write(getSegments$okio()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
    }

    public void write$okio(C19893f fVar, int i, int i2) {
        C19383o.m32797g(fVar, "buffer");
        int i3 = i + i2;
        int W = C15562d.m25185W(this, i);
        while (i < i3) {
            int i4 = W == 0 ? 0 : getDirectory$okio()[W - 1];
            int i5 = getDirectory$okio()[getSegments$okio().length + W];
            int min = Math.min(i3, (getDirectory$okio()[W] - i4) + i4) - i;
            int i6 = (i - i4) + i5;
            C19915y yVar = new C19915y(getSegments$okio()[W], i6, i6 + min, true);
            C19915y yVar2 = fVar.f43875b;
            if (yVar2 == null) {
                yVar.f43926g = yVar;
                yVar.f43925f = yVar;
                fVar.f43875b = yVar;
            } else {
                C19915y yVar3 = yVar2.f43926g;
                C19383o.m32794d(yVar3);
                yVar3.mo72807b(yVar);
            }
            i += min;
            W++;
        }
        fVar.f43876c += (long) i2;
    }

    public boolean rangeEquals(int i, byte[] bArr, int i2, int i3) {
        int i4;
        C19383o.m32797g(bArr, "other");
        if (i < 0 || i > size() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int W = C15562d.m25185W(this, i);
        while (i < i5) {
            if (W == 0) {
                i4 = 0;
            } else {
                i4 = getDirectory$okio()[W - 1];
            }
            int i6 = getDirectory$okio()[getSegments$okio().length + W];
            int min = Math.min(i5, (getDirectory$okio()[W] - i4) + i4) - i;
            if (!C17782b.m29890v(getSegments$okio()[W], (i - i4) + i6, i2, bArr, min)) {
                return false;
            }
            i2 += min;
            i += min;
            W++;
        }
        return true;
    }
}
