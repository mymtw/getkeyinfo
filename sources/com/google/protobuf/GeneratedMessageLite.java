package com.google.protobuf;

import com.google.protobuf.C16863a;
import com.google.protobuf.C16906j0;
import com.google.protobuf.C16925r;
import com.google.protobuf.C16935v;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.C16838a;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C16838a<MessageType, BuilderType>> extends C16863a<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    public int memoizedSerializedSize = -1;
    public C16876c1 unknownFields = C16876c1.f37186f;

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

        public SerializedForm(C16906j0 j0Var) {
            Class<?> cls = j0Var.getClass();
            this.messageClass = cls;
            this.messageClassName = cls.getName();
            this.asBytes = j0Var.mo59827c();
        }

        /* renamed from: of */
        public static SerializedForm m27972of(C16906j0 j0Var) {
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
                com.google.protobuf.j0 r5 = (com.google.protobuf.C16906j0) r5     // Catch:{ ClassNotFoundException -> 0x00cc, NoSuchFieldException -> 0x0055, SecurityException -> 0x003f, IllegalAccessException -> 0x0038, InvalidProtocolBufferException -> 0x0031 }
                com.google.protobuf.GeneratedMessageLite$a r5 = r5.mo59752i()     // Catch:{ ClassNotFoundException -> 0x00cc, NoSuchFieldException -> 0x0055, SecurityException -> 0x003f, IllegalAccessException -> 0x0038, InvalidProtocolBufferException -> 0x0031 }
                byte[] r6 = r7.asBytes     // Catch:{ ClassNotFoundException -> 0x00cc, NoSuchFieldException -> 0x0055, SecurityException -> 0x003f, IllegalAccessException -> 0x0038, InvalidProtocolBufferException -> 0x0031 }
                com.google.protobuf.GeneratedMessageLite$a r5 = r5.mo59828r(r6)     // Catch:{ ClassNotFoundException -> 0x00cc, NoSuchFieldException -> 0x0055, SecurityException -> 0x003f, IllegalAccessException -> 0x0038, InvalidProtocolBufferException -> 0x0031 }
                com.google.protobuf.GeneratedMessageLite r0 = r5.mo59760t()     // Catch:{ ClassNotFoundException -> 0x00cc, NoSuchFieldException -> 0x0055, SecurityException -> 0x003f, IllegalAccessException -> 0x0038, InvalidProtocolBufferException -> 0x0031 }
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
                com.google.protobuf.j0 r3 = (com.google.protobuf.C16906j0) r3     // Catch:{ ClassNotFoundException -> 0x00b8, NoSuchFieldException -> 0x00a2, SecurityException -> 0x008c, IllegalAccessException -> 0x0085, InvalidProtocolBufferException -> 0x007e }
                com.google.protobuf.GeneratedMessageLite$a r3 = r3.mo59752i()     // Catch:{ ClassNotFoundException -> 0x00b8, NoSuchFieldException -> 0x00a2, SecurityException -> 0x008c, IllegalAccessException -> 0x0085, InvalidProtocolBufferException -> 0x007e }
                byte[] r4 = r7.asBytes     // Catch:{ ClassNotFoundException -> 0x00b8, NoSuchFieldException -> 0x00a2, SecurityException -> 0x008c, IllegalAccessException -> 0x0085, InvalidProtocolBufferException -> 0x007e }
                com.google.protobuf.GeneratedMessageLite$a r3 = r3.mo59828r(r4)     // Catch:{ ClassNotFoundException -> 0x00b8, NoSuchFieldException -> 0x00a2, SecurityException -> 0x008c, IllegalAccessException -> 0x0085, InvalidProtocolBufferException -> 0x007e }
                com.google.protobuf.GeneratedMessageLite r0 = r3.mo59760t()     // Catch:{ ClassNotFoundException -> 0x00b8, NoSuchFieldException -> 0x00a2, SecurityException -> 0x008c, IllegalAccessException -> 0x0085, InvalidProtocolBufferException -> 0x007e }
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.GeneratedMessageLite.SerializedForm.readResolve():java.lang.Object");
        }
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$a */
    public static abstract class C16838a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C16838a<MessageType, BuilderType>> extends C16863a.C16864a<MessageType, BuilderType> {

        /* renamed from: b */
        public final MessageType f37157b;

        /* renamed from: c */
        public MessageType f37158c;

        /* renamed from: d */
        public boolean f37159d = false;

        public C16838a(MessageType messagetype) {
            this.f37157b = messagetype;
            this.f37158c = (GeneratedMessageLite) messagetype.mo59389t(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        /* renamed from: v */
        public static void m27973v(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
            C16932t0 t0Var = C16932t0.f37292c;
            t0Var.getClass();
            t0Var.mo60039a(generatedMessageLite.getClass()).mo59989a(generatedMessageLite, generatedMessageLite2);
        }

        public final Object clone() throws CloneNotSupportedException {
            MessageType messagetype = this.f37157b;
            messagetype.getClass();
            C16838a aVar = (C16838a) messagetype.mo59389t(MethodToInvoke.NEW_BUILDER);
            GeneratedMessageLite t = mo59760t();
            aVar.mo59761u();
            m27973v(aVar.f37158c, t);
            return aVar;
        }

        /* renamed from: d */
        public final GeneratedMessageLite mo59746d() {
            return this.f37157b;
        }

        /* renamed from: s */
        public final MessageType mo59759s() {
            MessageType t = mo59760t();
            if (t.mo59748f()) {
                return t;
            }
            throw new UninitializedMessageException((C16906j0) t);
        }

        /* renamed from: t */
        public final MessageType mo59760t() {
            if (this.f37159d) {
                return this.f37158c;
            }
            MessageType messagetype = this.f37158c;
            messagetype.getClass();
            C16932t0 t0Var = C16932t0.f37292c;
            t0Var.getClass();
            t0Var.mo60039a(messagetype.getClass()).mo59990b(messagetype);
            this.f37159d = true;
            return this.f37158c;
        }

        /* renamed from: u */
        public final void mo59761u() {
            if (this.f37159d) {
                MessageType messagetype = (GeneratedMessageLite) this.f37158c.mo59389t(MethodToInvoke.NEW_MUTABLE_INSTANCE);
                m27973v(messagetype, this.f37158c);
                this.f37158c = messagetype;
                this.f37159d = false;
            }
        }
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$b */
    public static class C16839b<T extends GeneratedMessageLite<T, ?>> extends C16869b<T> {
        public C16839b(T t) {
        }
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$c */
    public static abstract class C16840c<MessageType extends C16840c<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements C16909k0 {
        public C16925r<C16841d> extensions = C16925r.f37283d;

        /* renamed from: d */
        public final GeneratedMessageLite mo59746d() {
            return (GeneratedMessageLite) mo59389t(MethodToInvoke.GET_DEFAULT_INSTANCE);
        }

        /* renamed from: h */
        public final C16838a mo59750h() {
            C16838a aVar = (C16838a) mo59389t(MethodToInvoke.NEW_BUILDER);
            aVar.mo59761u();
            C16838a.m27973v(aVar.f37158c, this);
            return aVar;
        }

        /* renamed from: i */
        public final C16838a mo59752i() {
            return (C16838a) mo59389t(MethodToInvoke.NEW_BUILDER);
        }
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$d */
    public static final class C16841d implements C16925r.C16927b<C16841d> {
        /* renamed from: A */
        public final void mo59762A() {
        }

        /* renamed from: b */
        public final C16838a mo59763b(C16906j0.C16907a aVar, C16906j0 j0Var) {
            C16838a aVar2 = (C16838a) aVar;
            aVar2.mo59761u();
            C16838a.m27973v(aVar2.f37158c, (GeneratedMessageLite) j0Var);
            return aVar2;
        }

        public final int compareTo(Object obj) {
            ((C16841d) obj).getClass();
            return 0;
        }

        public final void getNumber() {
        }

        /* renamed from: x */
        public final void mo59766x() {
        }

        /* renamed from: y */
        public final void mo59767y() {
        }

        /* renamed from: z */
        public final WireFormat$JavaType mo59768z() {
            throw null;
        }
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$e */
    public static class C16842e<ContainingType extends C16906j0, Type> extends C16910l {
    }

    /* renamed from: u */
    public static <T extends GeneratedMessageLite<?, ?>> T m27958u(Class<T> cls) {
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
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) C16889f1.m28143a(cls);
            generatedMessageLite.getClass();
            t = (GeneratedMessageLite) generatedMessageLite.mo59389t(MethodToInvoke.GET_DEFAULT_INSTANCE);
            if (t != null) {
                defaultInstanceMap.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: v */
    static Object m27959v(Object obj, Method method, Object... objArr) {
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

    /* renamed from: w */
    public static <E> C16935v.C16942f<E> m27960w(C16935v.C16942f<E> fVar) {
        int size = fVar.size();
        return fVar.mo59843i(size == 0 ? 10 : size * 2);
    }

    /* renamed from: x */
    public static <T extends GeneratedMessageLite<?, ?>> void m27961x(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    /* renamed from: b */
    public final int mo59745b() {
        if (this.memoizedSerializedSize == -1) {
            C16932t0 t0Var = C16932t0.f37292c;
            t0Var.getClass();
            this.memoizedSerializedSize = t0Var.mo60039a(getClass()).mo59992d(this);
        }
        return this.memoizedSerializedSize;
    }

    /* renamed from: d */
    public GeneratedMessageLite mo59746d() {
        return (GeneratedMessageLite) mo59389t(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C16932t0 t0Var = C16932t0.f37292c;
        t0Var.getClass();
        return t0Var.mo60039a(getClass()).mo59994f(this, (GeneratedMessageLite) obj);
    }

    /* renamed from: f */
    public final boolean mo59748f() {
        byte byteValue = ((Byte) mo59389t(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        C16932t0 t0Var = C16932t0.f37292c;
        t0Var.getClass();
        boolean c = t0Var.mo60039a(getClass()).mo59991c(this);
        mo59389t(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED);
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo59749g() {
        return this.memoizedSerializedSize;
    }

    /* renamed from: h */
    public C16838a mo59750h() {
        C16838a aVar = (C16838a) mo59389t(MethodToInvoke.NEW_BUILDER);
        aVar.mo59761u();
        C16838a.m27973v(aVar.f37158c, this);
        return aVar;
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        C16932t0 t0Var = C16932t0.f37292c;
        t0Var.getClass();
        int e = t0Var.mo60039a(getClass()).mo59993e(this);
        this.memoizedHashCode = e;
        return e;
    }

    /* renamed from: i */
    public C16838a mo59752i() {
        return (C16838a) mo59389t(MethodToInvoke.NEW_BUILDER);
    }

    /* renamed from: m */
    public final void mo59753m(CodedOutputStream codedOutputStream) throws IOException {
        C16932t0 t0Var = C16932t0.f37292c;
        t0Var.getClass();
        C16947w0<?> a = t0Var.mo60039a(getClass());
        C16905j jVar = codedOutputStream.f37142a;
        if (jVar == null) {
            jVar = new C16905j(codedOutputStream);
        }
        a.mo59995g(this, jVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo59754r(int i) {
        this.memoizedSerializedSize = i;
    }

    /* renamed from: s */
    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C16838a<MessageType, BuilderType>> BuilderType mo59755s() {
        return (C16838a) mo59389t(MethodToInvoke.NEW_BUILDER);
    }

    /* renamed from: t */
    public abstract Object mo59389t(MethodToInvoke methodToInvoke);

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        C16911l0.m28297c(this, sb, 0);
        return sb.toString();
    }
}
