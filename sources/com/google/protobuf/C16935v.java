package com.google.protobuf;

import com.google.firebase.perf.p530v1.C16672h;
import com.google.firebase.perf.p530v1.SessionVerbosity;
import com.google.protobuf.GeneratedMessageLite;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.v */
public final class C16935v {

    /* renamed from: a */
    public static final Charset f37301a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f37302b;

    /* renamed from: com.google.protobuf.v$a */
    public interface C16936a {
        int getNumber();
    }

    /* renamed from: com.google.protobuf.v$b */
    public interface C16937b<T extends C16936a> {
    }

    /* renamed from: com.google.protobuf.v$c */
    public interface C16938c {
        /* renamed from: a */
        boolean mo55639a(int i);
    }

    /* renamed from: com.google.protobuf.v$d */
    public interface C16939d extends C16942f<Integer> {
    }

    /* renamed from: com.google.protobuf.v$e */
    public static class C16940e<F, T> extends AbstractList<T> {

        /* renamed from: b */
        public final List<F> f37303b;

        /* renamed from: c */
        public final C16941a<F, T> f37304c;

        /* renamed from: com.google.protobuf.v$e$a */
        public interface C16941a<F, T> {
        }

        public C16940e(C16939d dVar, C16941a aVar) {
            this.f37303b = dVar;
            this.f37304c = aVar;
        }

        public final T get(int i) {
            C16941a<F, T> aVar = this.f37304c;
            F f = this.f37303b.get(i);
            ((C16672h.C16673a) aVar).getClass();
            T forNumber = SessionVerbosity.forNumber(((Integer) f).intValue());
            return forNumber == null ? SessionVerbosity.SESSION_VERBOSITY_NONE : forNumber;
        }

        public final int size() {
            return this.f37303b.size();
        }
    }

    /* renamed from: com.google.protobuf.v$f */
    public interface C16942f<E> extends List<E>, RandomAccess {
        /* renamed from: d */
        void mo59864d();

        /* renamed from: h */
        boolean mo59865h();

        /* renamed from: i */
        C16942f<E> mo59843i(int i);
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f37302b = bArr;
        ByteBuffer.wrap(bArr);
        C16900i.m28229c(bArr, 0, 0, false);
    }

    /* renamed from: a */
    public static int m28394a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: b */
    public static GeneratedMessageLite m28395b(Object obj, Object obj2) {
        GeneratedMessageLite.C16838a h = ((C16906j0) obj).mo59750h();
        C16906j0 j0Var = (C16906j0) obj2;
        h.getClass();
        if (h.f37157b.getClass().isInstance(j0Var)) {
            h.mo59761u();
            GeneratedMessageLite.C16838a.m27973v(h.f37158c, (GeneratedMessageLite) ((C16863a) j0Var));
            return h.mo59760t();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
