package com.google.crypto.tink.shaded.protobuf;

import androidx.preference.C3039b;
import com.google.crypto.tink.shaded.protobuf.C16452a;
import com.google.crypto.tink.shaded.protobuf.C16477e;
import com.google.crypto.tink.shaded.protobuf.C16503j0;
import com.google.crypto.tink.shaded.protobuf.C16521r;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.C16431a;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C16431a<MessageType, BuilderType>> extends C16452a<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    public int memoizedSerializedSize = -1;
    public C16476d1 unknownFields = C16476d1.f36589f;

    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final byte[] asBytes;
        private final Class<?> messageClass;
        private final String messageClassName;

        public SerializedForm(C16503j0 j0Var) {
            Class<?> cls = j0Var.getClass();
            this.messageClass = cls;
            this.messageClassName = cls.getName();
            this.asBytes = j0Var.mo58605c();
        }

        /* renamed from: of */
        public static SerializedForm m26645of(C16503j0 j0Var) {
            return new SerializedForm(j0Var);
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0055 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object readResolve() throws java.io.ObjectStreamException {
            /*
                r7 = this;
                java.lang.String r0 = "Unable to understand proto buffer"
                java.lang.String r1 = "Unable to call parsePartialFrom"
                java.lang.String r2 = "Unable to find proto buffer class: "
                r3 = 0
                r4 = 1
                java.lang.Class<?> r5 = r7.messageClass     // Catch:{ ClassNotFoundException -> 0x00cc, NoSuchFieldException -> 0x0055, SecurityException -> 0x003f, IllegalAccessException -> 0x0038, InvalidProtocolBufferException -> 0x0031 }
                if (r5 == 0) goto L_0x000d
                goto L_0x0013
            L_0x000d:
                java.lang.String r5 = r7.messageClassName     // Catch:{ ClassNotFoundException -> 0x00cc, NoSuchFieldException -> 0x0055, SecurityException -> 0x003f, IllegalAccessException -> 0x0038, InvalidProtocolBufferException -> 0x0031 }
                java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x00cc, NoSuchFieldException -> 0x0055, SecurityException -> 0x003f, IllegalAccessException -> 0x0038, InvalidProtocolBufferException -> 0x0031 }
            L_0x0013:
                java.lang.String r6 = "DEFAULT_INSTANCE"
                java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch:{ ClassNotFoundException -> 0x00cc, NoSuchFieldException -> 0x0055, SecurityException -> 0x003f, IllegalAccessException -> 0x0038, InvalidProtocolBufferException -> 0x0031 }
                r5.setAccessible(r4)     // Catch:{ ClassNotFoundException -> 0x00cc, NoSuchFieldException -> 0x0055, SecurityException -> 0x003f, IllegalAccessException -> 0x0038, InvalidProtocolBufferException -> 0x0031 }
                java.lang.Object r5 = r5.get(r3)     // Catch:{ ClassNotFoundException -> 0x00cc, NoSuchFieldException -> 0x0055, SecurityException -> 0x003f, IllegalAccessException -> 0x0038, InvalidProtocolBufferException -> 0x0031 }
                com.google.crypto.tink.shaded.protobuf.j0 r5 = (com.google.crypto.tink.shaded.protobuf.C16503j0) r5     // Catch:{ ClassNotFoundException -> 0x00cc, NoSuchFieldException -> 0x0055, SecurityException -> 0x003f, IllegalAccessException -> 0x0038, InvalidProtocolBufferException -> 0x0031 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$a r5 = r5.mo58532j()     // Catch:{ ClassNotFoundException -> 0x00cc, NoSuchFieldException -> 0x0055, SecurityException -> 0x003f, IllegalAccessException -> 0x0038, InvalidProtocolBufferException -> 0x0031 }
                byte[] r6 = r7.asBytes     // Catch:{ ClassNotFoundException -> 0x00cc, NoSuchFieldException -> 0x0055, SecurityException -> 0x003f, IllegalAccessException -> 0x0038, InvalidProtocolBufferException -> 0x0031 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$a r5 = r5.mo58606k(r6)     // Catch:{ ClassNotFoundException -> 0x00cc, NoSuchFieldException -> 0x0055, SecurityException -> 0x003f, IllegalAccessException -> 0x0038, InvalidProtocolBufferException -> 0x0031 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r5.mo58539m()     // Catch:{ ClassNotFoundException -> 0x00cc, NoSuchFieldException -> 0x0055, SecurityException -> 0x003f, IllegalAccessException -> 0x0038, InvalidProtocolBufferException -> 0x0031 }
                return r0
            L_0x0031:
                r1 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                r2.<init>(r0, r1)
                throw r2
            L_0x0038:
                r0 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                r2.<init>(r1, r0)
                throw r2
            L_0x003f:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Unable to call DEFAULT_INSTANCE in "
                java.lang.StringBuilder r2 = android.support.p013v4.media.C0072d.m201h(r2)
                java.lang.String r3 = r7.messageClassName
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2, r0)
                throw r1
            L_0x0055:
                java.lang.Class<?> r5 = r7.messageClass     // Catch:{ ClassNotFoundException -> 0x00b8, NoSuchFieldException -> 0x00a2, SecurityException -> 0x008c, IllegalAccessException -> 0x0085, InvalidProtocolBufferException -> 0x007e }
                if (r5 == 0) goto L_0x005a
                goto L_0x0060
            L_0x005a:
                java.lang.String r5 = r7.messageClassName     // Catch:{ ClassNotFoundException -> 0x00b8, NoSuchFieldException -> 0x00a2, SecurityException -> 0x008c, IllegalAccessException -> 0x0085, InvalidProtocolBufferException -> 0x007e }
                java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x00b8, NoSuchFieldException -> 0x00a2, SecurityException -> 0x008c, IllegalAccessException -> 0x0085, InvalidProtocolBufferException -> 0x007e }
            L_0x0060:
                java.lang.String r6 = "defaultInstance"
                java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch:{ ClassNotFoundException -> 0x00b8, NoSuchFieldException -> 0x00a2, SecurityException -> 0x008c, IllegalAccessException -> 0x0085, InvalidProtocolBufferException -> 0x007e }
                r5.setAccessible(r4)     // Catch:{ ClassNotFoundException -> 0x00b8, NoSuchFieldException -> 0x00a2, SecurityException -> 0x008c, IllegalAccessException -> 0x0085, InvalidProtocolBufferException -> 0x007e }
                java.lang.Object r3 = r5.get(r3)     // Catch:{ ClassNotFoundException -> 0x00b8, NoSuchFieldException -> 0x00a2, SecurityException -> 0x008c, IllegalAccessException -> 0x0085, InvalidProtocolBufferException -> 0x007e }
                com.google.crypto.tink.shaded.protobuf.j0 r3 = (com.google.crypto.tink.shaded.protobuf.C16503j0) r3     // Catch:{ ClassNotFoundException -> 0x00b8, NoSuchFieldException -> 0x00a2, SecurityException -> 0x008c, IllegalAccessException -> 0x0085, InvalidProtocolBufferException -> 0x007e }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$a r3 = r3.mo58532j()     // Catch:{ ClassNotFoundException -> 0x00b8, NoSuchFieldException -> 0x00a2, SecurityException -> 0x008c, IllegalAccessException -> 0x0085, InvalidProtocolBufferException -> 0x007e }
                byte[] r4 = r7.asBytes     // Catch:{ ClassNotFoundException -> 0x00b8, NoSuchFieldException -> 0x00a2, SecurityException -> 0x008c, IllegalAccessException -> 0x0085, InvalidProtocolBufferException -> 0x007e }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$a r3 = r3.mo58606k(r4)     // Catch:{ ClassNotFoundException -> 0x00b8, NoSuchFieldException -> 0x00a2, SecurityException -> 0x008c, IllegalAccessException -> 0x0085, InvalidProtocolBufferException -> 0x007e }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r3.mo58539m()     // Catch:{ ClassNotFoundException -> 0x00b8, NoSuchFieldException -> 0x00a2, SecurityException -> 0x008c, IllegalAccessException -> 0x0085, InvalidProtocolBufferException -> 0x007e }
                return r0
            L_0x007e:
                r1 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                r2.<init>(r0, r1)
                throw r2
            L_0x0085:
                r0 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                r2.<init>(r1, r0)
                throw r2
            L_0x008c:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Unable to call defaultInstance in "
                java.lang.StringBuilder r2 = android.support.p013v4.media.C0072d.m201h(r2)
                java.lang.String r3 = r7.messageClassName
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2, r0)
                throw r1
            L_0x00a2:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Unable to find defaultInstance in "
                java.lang.StringBuilder r2 = android.support.p013v4.media.C0072d.m201h(r2)
                java.lang.String r3 = r7.messageClassName
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2, r0)
                throw r1
            L_0x00b8:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = android.support.p013v4.media.C0072d.m201h(r2)
                java.lang.String r3 = r7.messageClassName
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2, r0)
                throw r1
            L_0x00cc:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = android.support.p013v4.media.C0072d.m201h(r2)
                java.lang.String r3 = r7.messageClassName
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.SerializedForm.readResolve():java.lang.Object");
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$a */
    public static abstract class C16431a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C16431a<MessageType, BuilderType>> extends C16452a.C16453a<MessageType, BuilderType> {

        /* renamed from: b */
        public final MessageType f36538b;

        /* renamed from: c */
        public MessageType f36539c;

        /* renamed from: d */
        public boolean f36540d = false;

        public C16431a(MessageType messagetype) {
            this.f36538b = messagetype;
            this.f36539c = (GeneratedMessageLite) messagetype.mo58428m(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        /* renamed from: p */
        public static void m26646p(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
            C16528t0 t0Var = C16528t0.f36696c;
            t0Var.getClass();
            t0Var.mo58955a(generatedMessageLite.getClass()).mo58899a(generatedMessageLite, generatedMessageLite2);
        }

        public final Object clone() throws CloneNotSupportedException {
            MessageType messagetype = this.f36538b;
            messagetype.getClass();
            C16431a aVar = (C16431a) messagetype.mo58428m(MethodToInvoke.NEW_BUILDER);
            GeneratedMessageLite m = mo58539m();
            aVar.mo58540o();
            m26646p(aVar.f36539c, m);
            return aVar;
        }

        /* renamed from: d */
        public final GeneratedMessageLite mo58525d() {
            return this.f36538b;
        }

        /* renamed from: l */
        public final MessageType mo58538l() {
            MessageType m = mo58539m();
            if (m.mo58528f()) {
                return m;
            }
            throw new UninitializedMessageException((C16503j0) m);
        }

        /* renamed from: m */
        public final MessageType mo58539m() {
            if (this.f36540d) {
                return this.f36539c;
            }
            MessageType messagetype = this.f36539c;
            messagetype.getClass();
            C16528t0 t0Var = C16528t0.f36696c;
            t0Var.getClass();
            t0Var.mo58955a(messagetype.getClass()).mo58900b(messagetype);
            this.f36540d = true;
            return this.f36539c;
        }

        /* renamed from: o */
        public final void mo58540o() {
            if (this.f36540d) {
                MessageType messagetype = (GeneratedMessageLite) this.f36539c.mo58428m(MethodToInvoke.NEW_MUTABLE_INSTANCE);
                m26646p(messagetype, this.f36539c);
                this.f36539c = messagetype;
                this.f36540d = false;
            }
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$b */
    public static class C16432b<T extends GeneratedMessageLite<T, ?>> extends C16466b<T> {
        public C16432b(T t) {
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$c */
    public static abstract class C16433c<MessageType extends C16433c<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements C16506k0 {
        public C16521r<C16434d> extensions = C16521r.f36687d;
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$d */
    public static final class C16434d implements C16521r.C16523b<C16434d> {
        /* renamed from: A */
        public final void mo58541A() {
        }

        public final int compareTo(Object obj) {
            ((C16434d) obj).getClass();
            return 0;
        }

        /* renamed from: d */
        public final C16431a mo58543d(C16503j0.C16504a aVar, C16503j0 j0Var) {
            C16431a aVar2 = (C16431a) aVar;
            aVar2.mo58540o();
            C16431a.m26646p(aVar2.f36539c, (GeneratedMessageLite) j0Var);
            return aVar2;
        }

        public final void getNumber() {
        }

        /* renamed from: x */
        public final void mo58545x() {
        }

        /* renamed from: y */
        public final void mo58546y() {
        }

        /* renamed from: z */
        public final WireFormat$JavaType mo58547z() {
            throw null;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$e */
    public static class C16435e<ContainingType extends C16503j0, Type> extends C3039b {
    }

    /* renamed from: n */
    public static <T extends GeneratedMessageLite<?, ?>> T m26629n(Class<T> cls) {
        T t = (GeneratedMessageLite) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (GeneratedMessageLite) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) C16488g1.m26835a(cls);
            generatedMessageLite.getClass();
            t = (GeneratedMessageLite) generatedMessageLite.mo58428m(MethodToInvoke.GET_DEFAULT_INSTANCE);
            if (t != null) {
                defaultInstanceMap.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: o */
    static Object m26630o(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: p */
    public static <T extends GeneratedMessageLite<T, ?>> T m26631p(T t, ByteString byteString, C16511n nVar) throws InvalidProtocolBufferException {
        T r;
        try {
            C16497i newCodedInput = byteString.newCodedInput();
            r = m26633r(t, newCodedInput, nVar);
            newCodedInput.mo58761a(0);
            if (r.mo58528f()) {
                return r;
            }
            throw new UninitializedMessageException((C16503j0) r).asInvalidProtocolBufferException().setUnfinishedMessage(r);
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(r);
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    /* renamed from: q */
    public static <T extends GeneratedMessageLite<T, ?>> T m26632q(T t, byte[] bArr, C16511n nVar) throws InvalidProtocolBufferException {
        int length = bArr.length;
        T t2 = (GeneratedMessageLite) t.mo58428m(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            C16528t0 t0Var = C16528t0.f36696c;
            t0Var.getClass();
            C16542x0<?> a = t0Var.mo58955a(t2.getClass());
            a.mo58906h(t2, bArr, 0, length + 0, new C16477e.C16478a(nVar));
            a.mo58900b(t2);
            if (t2.memoizedHashCode != 0) {
                throw new RuntimeException();
            } else if (t2.mo58528f()) {
                return t2;
            } else {
                throw new UninitializedMessageException((C16503j0) t2).asInvalidProtocolBufferException().setUnfinishedMessage(t2);
            }
        } catch (IOException e) {
            if (e.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e.getCause());
            }
            throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.truncatedMessage().setUnfinishedMessage(t2);
        }
    }

    /* renamed from: r */
    public static <T extends GeneratedMessageLite<T, ?>> T m26633r(T t, C16497i iVar, C16511n nVar) throws InvalidProtocolBufferException {
        T t2 = (GeneratedMessageLite) t.mo58428m(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            C16528t0 t0Var = C16528t0.f36696c;
            t0Var.getClass();
            C16542x0<?> a = t0Var.mo58955a(t2.getClass());
            C16502j jVar = iVar.f36622d;
            if (jVar == null) {
                jVar = new C16502j(iVar);
            }
            a.mo58907i(t2, jVar, nVar);
            a.mo58900b(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e.getCause());
            }
            throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(t2);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            throw e2;
        }
    }

    /* renamed from: s */
    public static <T extends GeneratedMessageLite<?, ?>> void m26634s(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    /* renamed from: b */
    public final int mo58524b() {
        if (this.memoizedSerializedSize == -1) {
            C16528t0 t0Var = C16528t0.f36696c;
            t0Var.getClass();
            this.memoizedSerializedSize = t0Var.mo58955a(getClass()).mo58902d(this);
        }
        return this.memoizedSerializedSize;
    }

    /* renamed from: d */
    public final GeneratedMessageLite mo58525d() {
        return (GeneratedMessageLite) mo58428m(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo58526e() {
        return this.memoizedSerializedSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((GeneratedMessageLite) mo58428m(MethodToInvoke.GET_DEFAULT_INSTANCE)).getClass().isInstance(obj)) {
            return false;
        }
        C16528t0 t0Var = C16528t0.f36696c;
        t0Var.getClass();
        return t0Var.mo58955a(getClass()).mo58904f(this, (GeneratedMessageLite) obj);
    }

    /* renamed from: f */
    public final boolean mo58528f() {
        byte byteValue = ((Byte) mo58428m(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        C16528t0 t0Var = C16528t0.f36696c;
        t0Var.getClass();
        boolean c = t0Var.mo58955a(getClass()).mo58901c(this);
        mo58428m(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED);
        return c;
    }

    /* renamed from: h */
    public final void mo58529h(CodedOutputStream codedOutputStream) throws IOException {
        C16528t0 t0Var = C16528t0.f36696c;
        t0Var.getClass();
        C16542x0<?> a = t0Var.mo58955a(getClass());
        C16505k kVar = codedOutputStream.f36531a;
        if (kVar == null) {
            kVar = new C16505k(codedOutputStream);
        }
        a.mo58905g(this, kVar);
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        C16528t0 t0Var = C16528t0.f36696c;
        t0Var.getClass();
        int e = t0Var.mo58955a(getClass()).mo58903e(this);
        this.memoizedHashCode = e;
        return e;
    }

    /* renamed from: i */
    public final C16431a mo58531i() {
        C16431a aVar = (C16431a) mo58428m(MethodToInvoke.NEW_BUILDER);
        aVar.mo58540o();
        C16431a.m26646p(aVar.f36539c, this);
        return aVar;
    }

    /* renamed from: j */
    public final C16431a mo58532j() {
        return (C16431a) mo58428m(MethodToInvoke.NEW_BUILDER);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo58533k(int i) {
        this.memoizedSerializedSize = i;
    }

    /* renamed from: l */
    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C16431a<MessageType, BuilderType>> BuilderType mo58534l() {
        return (C16431a) mo58428m(MethodToInvoke.NEW_BUILDER);
    }

    /* renamed from: m */
    public abstract Object mo58428m(MethodToInvoke methodToInvoke);

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        C16508l0.m27122c(this, sb, 0);
        return sb.toString();
    }
}
