package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.w */
public final class C2631w {

    /* renamed from: a */
    public static final Charset f5973a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f5974b;

    /* renamed from: androidx.datastore.preferences.protobuf.w$a */
    public interface C2632a {
        int getNumber();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$b */
    public interface C2633b<T extends C2632a> {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$c */
    public interface C2634c {
        /* renamed from: a */
        boolean mo9451a(int i);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$d */
    public interface C2635d<E> extends List<E>, RandomAccess {
        /* renamed from: d */
        void mo9601d();

        /* renamed from: h */
        boolean mo9603h();

        /* renamed from: i */
        C2635d<E> mo9612i(int i);
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f5974b = bArr;
        ByteBuffer.wrap(bArr);
        C2592i.m5903f(bArr, 0, 0, false);
    }

    /* renamed from: a */
    public static int m6276a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: b */
    public static GeneratedMessageLite m6277b(Object obj, Object obj2) {
        GeneratedMessageLite.C2521a h = ((C2602k0) obj).mo9466h();
        C2602k0 k0Var = (C2602k0) obj2;
        h.getClass();
        if (h.f5796b.getClass().isInstance(k0Var)) {
            h.mo9476o();
            GeneratedMessageLite.C2521a.m5618p(h.f5797c, (GeneratedMessageLite) ((C2546a) k0Var));
            return h.mo9475m();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
