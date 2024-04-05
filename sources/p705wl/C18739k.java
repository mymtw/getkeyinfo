package p705wl;

import androidx.compose.foundation.layout.C0761x;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: wl.k */
public final class C18739k<P> {

    /* renamed from: a */
    public final ConcurrentHashMap f41509a = new ConcurrentHashMap();

    /* renamed from: b */
    public C18740a<P> f41510b;

    /* renamed from: c */
    public final Class<P> f41511c;

    /* renamed from: wl.k$a */
    public static final class C18740a<P> {

        /* renamed from: a */
        public final P f41512a;

        /* renamed from: b */
        public final byte[] f41513b;

        /* renamed from: c */
        public final KeyStatusType f41514c;

        /* renamed from: d */
        public final OutputPrefixType f41515d;

        public C18740a(Object obj, byte[] bArr, KeyStatusType keyStatusType, OutputPrefixType outputPrefixType) {
            this.f41512a = obj;
            this.f41513b = Arrays.copyOf(bArr, bArr.length);
            this.f41514c = keyStatusType;
            this.f41515d = outputPrefixType;
        }

        /* renamed from: a */
        public final byte[] mo70229a() {
            byte[] bArr = this.f41513b;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }
    }

    /* renamed from: wl.k$b */
    public static class C18741b implements Comparable<C18741b> {

        /* renamed from: b */
        public final byte[] f41516b;

        public C18741b(byte[] bArr) {
            this.f41516b = Arrays.copyOf(bArr, bArr.length);
        }

        public final int compareTo(Object obj) {
            C18741b bVar = (C18741b) obj;
            byte[] bArr = this.f41516b;
            int length = bArr.length;
            byte[] bArr2 = bVar.f41516b;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            int i = 0;
            while (true) {
                byte[] bArr3 = this.f41516b;
                if (i >= bArr3.length) {
                    return 0;
                }
                byte b = bArr3[i];
                byte b2 = bVar.f41516b[i];
                if (b != b2) {
                    return b - b2;
                }
                i++;
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C18741b)) {
                return false;
            }
            return Arrays.equals(this.f41516b, ((C18741b) obj).f41516b);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f41516b);
        }

        public final String toString() {
            return C0761x.m1693T(this.f41516b);
        }
    }

    public C18739k(Class<P> cls) {
        this.f41511c = cls;
    }

    /* renamed from: a */
    public final List<C18740a<P>> mo70228a(byte[] bArr) {
        List<C18740a<P>> list = (List) this.f41509a.get(new C18741b(bArr));
        return list != null ? list : Collections.emptyList();
    }
}
