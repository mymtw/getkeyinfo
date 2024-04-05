package p150j4;

import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import java.security.MessageDigest;

/* renamed from: j4.d */
public final class C7111d<T> {

    /* renamed from: e */
    public static final C7112a f15815e = new C7112a();

    /* renamed from: a */
    public final T f15816a;

    /* renamed from: b */
    public final C7113b<T> f15817b;

    /* renamed from: c */
    public final String f15818c;

    /* renamed from: d */
    public volatile byte[] f15819d;

    /* renamed from: j4.d$a */
    public class C7112a implements C7113b<Object> {
        /* renamed from: a */
        public final void mo17025a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* renamed from: j4.d$b */
    public interface C7113b<T> {
        /* renamed from: a */
        void mo17025a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    public C7111d(String str, T t, C7113b<T> bVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f15818c = str;
            this.f15816a = t;
            this.f15817b = bVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    /* renamed from: a */
    public static C7111d m13779a(Object obj, String str) {
        return new C7111d(str, obj, f15815e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7111d) {
            return this.f15818c.equals(((C7111d) obj).f15818c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15818c.hashCode();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Option{key='");
        h.append(this.f15818c);
        h.append('\'');
        h.append('}');
        return h.toString();
    }
}
