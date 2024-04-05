package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.v */
public final class C16531v {

    /* renamed from: a */
    public static final Charset f36704a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f36705b;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.v$a */
    public interface C16532a {
        int getNumber();
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.v$b */
    public interface C16533b<T extends C16532a> {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.v$c */
    public interface C16534c {
        /* renamed from: a */
        boolean mo58426a(int i);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.v$d */
    public interface C16535d<E> extends List<E>, RandomAccess {
        /* renamed from: d */
        void mo58673d();

        /* renamed from: h */
        boolean mo58674h();

        /* renamed from: i */
        C16535d<E> mo58661i(int i);
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f36705b = bArr;
        ByteBuffer.wrap(bArr);
        C16497i.m26921f(bArr, 0, 0, false);
    }

    /* renamed from: a */
    public static int m27233a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: b */
    public static GeneratedMessageLite m27234b(Object obj, Object obj2) {
        GeneratedMessageLite.C16431a i = ((C16503j0) obj).mo58531i();
        C16503j0 j0Var = (C16503j0) obj2;
        i.getClass();
        if (i.f36538b.getClass().isInstance(j0Var)) {
            i.mo58540o();
            GeneratedMessageLite.C16431a.m26646p(i.f36539c, (GeneratedMessageLite) ((C16452a) j0Var));
            return i.mo58539m();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
