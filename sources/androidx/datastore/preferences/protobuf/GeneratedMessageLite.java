package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2546a;
import androidx.datastore.preferences.protobuf.C2602k0;
import androidx.datastore.preferences.protobuf.C2621s;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite.C2521a;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C2521a<MessageType, BuilderType>> extends C2546a<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    public int memoizedSerializedSize = -1;
    public C2575e1 unknownFields = C2575e1.f5860f;

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

        public SerializedForm(C2602k0 k0Var) {
            Class<?> cls = k0Var.getClass();
            this.messageClass = cls;
            this.messageClassName = cls.getName();
            this.asBytes = k0Var.mo9542c();
        }

        /* renamed from: of */
        public static SerializedForm m5617of(C2602k0 k0Var) {
            return new SerializedForm(k0Var);
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
                androidx.datastore.preferences.protobuf.k0 r5 = (androidx.datastore.preferences.protobuf.C2602k0) r5     // Catch:{ ClassNotFoundException -> 0x00cc, NoSuchFieldException -> 0x0055, SecurityException -> 0x003f, IllegalAccessException -> 0x0038, InvalidProtocolBufferException -> 0x0031 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$a r5 = r5.mo9468i()     // Catch:{ ClassNotFoundException -> 0x00cc, NoSuchFieldException -> 0x0055, SecurityException -> 0x003f, IllegalAccessException -> 0x0038, InvalidProtocolBufferException -> 0x0031 }
                byte[] r6 = r7.asBytes     // Catch:{ ClassNotFoundException -> 0x00cc, NoSuchFieldException -> 0x0055, SecurityException -> 0x003f, IllegalAccessException -> 0x0038, InvalidProtocolBufferException -> 0x0031 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$a r5 = r5.mo9545k(r6)     // Catch:{ ClassNotFoundException -> 0x00cc, NoSuchFieldException -> 0x0055, SecurityException -> 0x003f, IllegalAccessException -> 0x0038, InvalidProtocolBufferException -> 0x0031 }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite r0 = r5.mo9475m()     // Catch:{ ClassNotFoundException -> 0x00cc, NoSuchFieldException -> 0x0055, SecurityException -> 0x003f, IllegalAccessException -> 0x0038, InvalidProtocolBufferException -> 0x0031 }
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
                androidx.datastore.preferences.protobuf.k0 r3 = (androidx.datastore.preferences.protobuf.C2602k0) r3     // Catch:{ ClassNotFoundException -> 0x00b8, NoSuchFieldException -> 0x00a2, SecurityException -> 0x008c, IllegalAccessException -> 0x0085, InvalidProtocolBufferException -> 0x007e }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$a r3 = r3.mo9468i()     // Catch:{ ClassNotFoundException -> 0x00b8, NoSuchFieldException -> 0x00a2, SecurityException -> 0x008c, IllegalAccessException -> 0x0085, InvalidProtocolBufferException -> 0x007e }
                byte[] r4 = r7.asBytes     // Catch:{ ClassNotFoundException -> 0x00b8, NoSuchFieldException -> 0x00a2, SecurityException -> 0x008c, IllegalAccessException -> 0x0085, InvalidProtocolBufferException -> 0x007e }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite$a r3 = r3.mo9545k(r4)     // Catch:{ ClassNotFoundException -> 0x00b8, NoSuchFieldException -> 0x00a2, SecurityException -> 0x008c, IllegalAccessException -> 0x0085, InvalidProtocolBufferException -> 0x007e }
                androidx.datastore.preferences.protobuf.GeneratedMessageLite r0 = r3.mo9475m()     // Catch:{ ClassNotFoundException -> 0x00b8, NoSuchFieldException -> 0x00a2, SecurityException -> 0x008c, IllegalAccessException -> 0x0085, InvalidProtocolBufferException -> 0x007e }
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.GeneratedMessageLite.SerializedForm.readResolve():java.lang.Object");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$a */
    public static abstract class C2521a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C2521a<MessageType, BuilderType>> extends C2546a.C2547a<MessageType, BuilderType> {

        /* renamed from: b */
        public final MessageType f5796b;

        /* renamed from: c */
        public MessageType f5797c;

        /* renamed from: d */
        public boolean f5798d = false;

        public C2521a(MessageType messagetype) {
            this.f5796b = messagetype;
            this.f5797c = (GeneratedMessageLite) messagetype.mo9344m(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        /* renamed from: p */
        public static void m5618p(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
            C2628u0 u0Var = C2628u0.f5965c;
            u0Var.getClass();
            u0Var.mo9895a(generatedMessageLite.getClass()).mo9839a(generatedMessageLite, generatedMessageLite2);
        }

        public final Object clone() throws CloneNotSupportedException {
            MessageType messagetype = this.f5796b;
            messagetype.getClass();
            C2521a aVar = (C2521a) messagetype.mo9344m(MethodToInvoke.NEW_BUILDER);
            GeneratedMessageLite m = mo9475m();
            aVar.mo9476o();
            m5618p(aVar.f5797c, m);
            return aVar;
        }

        /* renamed from: d */
        public final GeneratedMessageLite mo9462d() {
            return this.f5796b;
        }

        /* renamed from: l */
        public final MessageType mo9474l() {
            MessageType m = mo9475m();
            if (m.mo9465f()) {
                return m;
            }
            throw new UninitializedMessageException((C2602k0) m);
        }

        /* renamed from: m */
        public final MessageType mo9475m() {
            if (this.f5798d) {
                return this.f5797c;
            }
            MessageType messagetype = this.f5797c;
            messagetype.getClass();
            C2628u0 u0Var = C2628u0.f5965c;
            u0Var.getClass();
            u0Var.mo9895a(messagetype.getClass()).mo9840b(messagetype);
            this.f5798d = true;
            return this.f5797c;
        }

        /* renamed from: o */
        public final void mo9476o() {
            if (this.f5798d) {
                MessageType messagetype = (GeneratedMessageLite) this.f5797c.mo9344m(MethodToInvoke.NEW_MUTABLE_INSTANCE);
                m5618p(messagetype, this.f5797c);
                this.f5797c = messagetype;
                this.f5798d = false;
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$b */
    public static class C2522b<T extends GeneratedMessageLite<T, ?>> extends C2550b<T> {
        public C2522b(T t) {
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$c */
    public static abstract class C2523c<MessageType extends C2523c<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements C2605l0 {
        public C2621s<C2524d> extensions = C2621s.f5956d;

        /* renamed from: d */
        public final GeneratedMessageLite mo9462d() {
            return (GeneratedMessageLite) mo9344m(MethodToInvoke.GET_DEFAULT_INSTANCE);
        }

        /* renamed from: h */
        public final C2521a mo9466h() {
            C2521a aVar = (C2521a) mo9344m(MethodToInvoke.NEW_BUILDER);
            aVar.mo9476o();
            C2521a.m5618p(aVar.f5797c, this);
            return aVar;
        }

        /* renamed from: i */
        public final C2521a mo9468i() {
            return (C2521a) mo9344m(MethodToInvoke.NEW_BUILDER);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$d */
    public static final class C2524d implements C2621s.C2623b<C2524d> {
        /* renamed from: A */
        public final void mo9477A() {
        }

        /* renamed from: P */
        public final C2521a mo9478P(C2602k0.C2603a aVar, C2602k0 k0Var) {
            C2521a aVar2 = (C2521a) aVar;
            aVar2.mo9476o();
            C2521a.m5618p(aVar2.f5797c, (GeneratedMessageLite) k0Var);
            return aVar2;
        }

        public final int compareTo(Object obj) {
            ((C2524d) obj).getClass();
            return 0;
        }

        public final void getNumber() {
        }

        /* renamed from: x */
        public final void mo9481x() {
        }

        /* renamed from: y */
        public final void mo9482y() {
        }

        /* renamed from: z */
        public final WireFormat$JavaType mo9483z() {
            throw null;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$e */
    public static class C2525e<ContainingType extends C2602k0, Type> extends C2606m {
    }

    /* renamed from: n */
    public static <T extends GeneratedMessageLite<?, ?>> T m5604n(Class<T> cls) {
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
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) C2586h1.m5822a(cls);
            generatedMessageLite.getClass();
            t = (GeneratedMessageLite) generatedMessageLite.mo9344m(MethodToInvoke.GET_DEFAULT_INSTANCE);
            if (t != null) {
                defaultInstanceMap.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: o */
    static Object m5605o(Object obj, Method method, Object... objArr) {
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
    public static <T extends GeneratedMessageLite<T, ?>> T m5606p(T t, C2592i iVar, C2611o oVar) throws InvalidProtocolBufferException {
        T t2 = (GeneratedMessageLite) t.mo9344m(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            C2628u0 u0Var = C2628u0.f5965c;
            u0Var.getClass();
            C2642y0<?> a = u0Var.mo9895a(t2.getClass());
            C2598j jVar = iVar.f5889d;
            if (jVar == null) {
                jVar = new C2598j(iVar);
            }
            a.mo9845g(t2, jVar, oVar);
            a.mo9840b(t2);
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

    /* renamed from: q */
    public static <T extends GeneratedMessageLite<?, ?>> void m5607q(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    /* renamed from: b */
    public final int mo9461b() {
        if (this.memoizedSerializedSize == -1) {
            C2628u0 u0Var = C2628u0.f5965c;
            u0Var.getClass();
            this.memoizedSerializedSize = u0Var.mo9895a(getClass()).mo9842d(this);
        }
        return this.memoizedSerializedSize;
    }

    /* renamed from: d */
    public GeneratedMessageLite mo9462d() {
        return (GeneratedMessageLite) mo9344m(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo9463e() {
        return this.memoizedSerializedSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((GeneratedMessageLite) mo9344m(MethodToInvoke.GET_DEFAULT_INSTANCE)).getClass().isInstance(obj)) {
            return false;
        }
        C2628u0 u0Var = C2628u0.f5965c;
        u0Var.getClass();
        return u0Var.mo9895a(getClass()).mo9844f(this, (GeneratedMessageLite) obj);
    }

    /* renamed from: f */
    public final boolean mo9465f() {
        byte byteValue = ((Byte) mo9344m(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        C2628u0 u0Var = C2628u0.f5965c;
        u0Var.getClass();
        boolean c = u0Var.mo9895a(getClass()).mo9841c(this);
        mo9344m(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED);
        return c;
    }

    /* renamed from: h */
    public C2521a mo9466h() {
        C2521a aVar = (C2521a) mo9344m(MethodToInvoke.NEW_BUILDER);
        aVar.mo9476o();
        C2521a.m5618p(aVar.f5797c, this);
        return aVar;
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        C2628u0 u0Var = C2628u0.f5965c;
        u0Var.getClass();
        int e = u0Var.mo9895a(getClass()).mo9843e(this);
        this.memoizedHashCode = e;
        return e;
    }

    /* renamed from: i */
    public C2521a mo9468i() {
        return (C2521a) mo9344m(MethodToInvoke.NEW_BUILDER);
    }

    /* renamed from: j */
    public final void mo9469j(CodedOutputStream codedOutputStream) throws IOException {
        C2628u0 u0Var = C2628u0.f5965c;
        u0Var.getClass();
        C2642y0<?> a = u0Var.mo9895a(getClass());
        C2601k kVar = codedOutputStream.f5783a;
        if (kVar == null) {
            kVar = new C2601k(codedOutputStream);
        }
        a.mo9846h(this, kVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo9470l(int i) {
        this.memoizedSerializedSize = i;
    }

    /* renamed from: m */
    public abstract Object mo9344m(MethodToInvoke methodToInvoke);

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        C2607m0.m6163c(this, sb, 0);
        return sb.toString();
    }
}
