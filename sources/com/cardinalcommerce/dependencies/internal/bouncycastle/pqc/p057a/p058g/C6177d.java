package com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.p057a.p058g;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;
import p003a2.C0023f;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.d */
public final class C6177d {

    /* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.a.g.d$a */
    public static class C6178a extends ObjectInputStream {

        /* renamed from: d */
        public static final HashSet f13428d;

        /* renamed from: b */
        public final Class f13429b;

        /* renamed from: c */
        public boolean f13430c = false;

        static {
            HashSet hashSet = new HashSet();
            f13428d = hashSet;
            C0023f.m115p(hashSet, "java.util.TreeMap", "java.lang.Integer", "java.lang.Number", "com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.crypto.xmss.BDS");
            C0023f.m115p(hashSet, "java.util.ArrayList", "com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.crypto.xmss.XMSSNode", "[B", "java.util.LinkedList");
            C0023f.m115p(hashSet, "java.util.Stack", "java.util.Vector", "[Ljava.lang.Object;", "com.cardinalcommerce.dependencies.internal.bouncycastle.pqc.crypto.xmss.BDSTreeHash");
        }

        public C6178a(ByteArrayInputStream byteArrayInputStream, Class cls) {
            super(byteArrayInputStream);
            this.f13429b = cls;
        }

        public final Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
            if (!this.f13430c) {
                if (objectStreamClass.getName().equals(this.f13429b.getName())) {
                    this.f13430c = true;
                } else {
                    throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
                }
            } else if (!f13428d.contains(objectStreamClass.getName())) {
                throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
            }
            return super.resolveClass(objectStreamClass);
        }
    }

    /* renamed from: a */
    public static long m12375a(int i, byte[] bArr) {
        if (bArr != null) {
            long j = 0;
            for (int i2 = 0; i2 < 0 + i; i2++) {
                j = (j << 8) | ((long) (bArr[i2] & 255));
            }
            return j;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: b */
    public static Object m12376b(byte[] bArr, Class cls) {
        C6178a aVar = new C6178a(new ByteArrayInputStream(bArr), cls);
        Object readObject = aVar.readObject();
        if (aVar.available() != 0) {
            throw new IOException("unexpected data found at end of ObjectInputStream");
        } else if (cls.isInstance(readObject)) {
            return readObject;
        } else {
            throw new IOException("unexpected class found in ObjectInputStream");
        }
    }

    /* renamed from: c */
    public static void m12377c(byte[] bArr, byte[] bArr2, int i) {
        if (bArr2 == null) {
            throw new NullPointerException("src == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        } else if (bArr2.length + i <= bArr.length) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                bArr[i + i2] = bArr2[i2];
            }
        } else {
            throw new IllegalArgumentException("src length + offset must not be greater than size of destination");
        }
    }

    /* renamed from: d */
    public static boolean m12378d(int i, long j) {
        if (j >= 0) {
            return j < (1 << i);
        }
        throw new IllegalStateException("index must not be negative");
    }

    /* renamed from: e */
    public static byte[] m12379e(int i, long j) {
        byte[] bArr = new byte[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            bArr[i2] = (byte) ((int) j);
            j >>>= 8;
        }
        return bArr;
    }

    /* renamed from: f */
    public static byte[] m12380f(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: g */
    public static byte[][] m12381g(byte[][] bArr) {
        boolean z = true;
        if (bArr != null) {
            int i = 0;
            while (true) {
                if (i >= bArr.length) {
                    z = false;
                    break;
                } else if (bArr[i] == null) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z) {
            byte[][] bArr2 = new byte[bArr.length][];
            for (int i2 = 0; i2 < bArr.length; i2++) {
                byte[] bArr3 = new byte[bArr[i2].length];
                bArr2[i2] = bArr3;
                byte[] bArr4 = bArr[i2];
                System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
            }
            return bArr2;
        }
        throw new NullPointerException("in has null pointers");
    }

    /* renamed from: h */
    public static byte[] m12382h(int i, int i2, byte[] bArr) {
        if (i < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        } else if (i2 < 0) {
            throw new IllegalArgumentException("length hast to be >= 0");
        } else if (i + i2 <= bArr.length) {
            byte[] bArr2 = new byte[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                bArr2[i3] = bArr[i + i3];
            }
            return bArr2;
        } else {
            throw new IllegalArgumentException("offset + length must not be greater then size of source array");
        }
    }
}
