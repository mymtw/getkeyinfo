package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.C16506k0;
import com.google.crypto.tink.shaded.protobuf.C16511n;
import com.google.crypto.tink.shaded.protobuf.C16524r0;
import com.google.crypto.tink.shaded.protobuf.C16530u0;
import com.google.crypto.tink.shaded.protobuf.C16531v;
import com.google.crypto.tink.shaded.protobuf.C16536v0;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.util.List;

/* renamed from: com.google.crypto.tink.proto.a */
public final class C16415a extends GeneratedMessageLite<C16415a, C16417b> implements C16506k0 {
    /* access modifiers changed from: private */
    public static final C16415a DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile C16524r0<C16415a> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private C16531v.C16535d<C16418c> key_ = C16530u0.f36701e;
    private int primaryKeyId_;

    /* renamed from: com.google.crypto.tink.proto.a$a */
    public static /* synthetic */ class C16416a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36516a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36516a = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36516a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36516a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f36516a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f36516a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f36516a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f36516a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.proto.C16415a.C16416a.<clinit>():void");
        }
    }

    /* renamed from: com.google.crypto.tink.proto.a$b */
    public static final class C16417b extends GeneratedMessageLite.C16431a<C16415a, C16417b> implements C16506k0 {
        public C16417b() {
            super(C16415a.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.crypto.tink.proto.a$c */
    public static final class C16418c extends GeneratedMessageLite<C16418c, C16419a> implements C16506k0 {
        /* access modifiers changed from: private */
        public static final C16418c DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile C16524r0<C16418c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private KeyData keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        /* renamed from: com.google.crypto.tink.proto.a$c$a */
        public static final class C16419a extends GeneratedMessageLite.C16431a<C16418c, C16419a> implements C16506k0 {
            public C16419a() {
                super(C16418c.DEFAULT_INSTANCE);
            }
        }

        static {
            C16418c cVar = new C16418c();
            DEFAULT_INSTANCE = cVar;
            GeneratedMessageLite.m26634s(C16418c.class, cVar);
        }

        /* renamed from: D */
        public static C16419a m26545D() {
            return (C16419a) DEFAULT_INSTANCE.mo58534l();
        }

        /* renamed from: u */
        public static void m26547u(C16418c cVar, KeyData keyData) {
            cVar.getClass();
            cVar.keyData_ = keyData;
        }

        /* renamed from: v */
        public static void m26548v(C16418c cVar, OutputPrefixType outputPrefixType) {
            cVar.getClass();
            cVar.outputPrefixType_ = outputPrefixType.getNumber();
        }

        /* renamed from: w */
        public static void m26549w(C16418c cVar, KeyStatusType keyStatusType) {
            cVar.getClass();
            cVar.status_ = keyStatusType.getNumber();
        }

        /* renamed from: x */
        public static void m26550x(C16418c cVar, int i) {
            cVar.keyId_ = i;
        }

        /* renamed from: A */
        public final OutputPrefixType mo58435A() {
            OutputPrefixType forNumber = OutputPrefixType.forNumber(this.outputPrefixType_);
            return forNumber == null ? OutputPrefixType.UNRECOGNIZED : forNumber;
        }

        /* renamed from: B */
        public final KeyStatusType mo58436B() {
            KeyStatusType forNumber = KeyStatusType.forNumber(this.status_);
            return forNumber == null ? KeyStatusType.UNRECOGNIZED : forNumber;
        }

        /* renamed from: C */
        public final boolean mo58437C() {
            return this.keyData_ != null;
        }

        /* renamed from: m */
        public final Object mo58428m(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
            switch (C16416a.f36516a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C16418c();
                case 2:
                    return new C16419a();
                case 3:
                    return new C16536v0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C16524r0<C16418c> r0Var = PARSER;
                    if (r0Var == null) {
                        synchronized (C16418c.class) {
                            r0Var = PARSER;
                            if (r0Var == null) {
                                r0Var = new GeneratedMessageLite.C16432b<>(DEFAULT_INSTANCE);
                                PARSER = r0Var;
                            }
                        }
                    }
                    return r0Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* renamed from: y */
        public final KeyData mo58438y() {
            KeyData keyData = this.keyData_;
            return keyData == null ? KeyData.m26527x() : keyData;
        }

        /* renamed from: z */
        public final int mo58439z() {
            return this.keyId_;
        }
    }

    static {
        C16415a aVar = new C16415a();
        DEFAULT_INSTANCE = aVar;
        GeneratedMessageLite.m26634s(C16415a.class, aVar);
    }

    /* renamed from: A */
    public static C16417b m26535A() {
        return (C16417b) DEFAULT_INSTANCE.mo58534l();
    }

    /* renamed from: B */
    public static C16415a m26536B(byte[] bArr, C16511n nVar) throws InvalidProtocolBufferException {
        return (C16415a) GeneratedMessageLite.m26632q(DEFAULT_INSTANCE, bArr, nVar);
    }

    /* renamed from: u */
    public static void m26538u(C16415a aVar, int i) {
        aVar.primaryKeyId_ = i;
    }

    /* renamed from: v */
    public static void m26539v(C16415a aVar, C16418c cVar) {
        aVar.getClass();
        if (!aVar.key_.mo58674h()) {
            C16531v.C16535d<C16418c> dVar = aVar.key_;
            int size = dVar.size();
            aVar.key_ = dVar.mo58661i(size == 0 ? 10 : size * 2);
        }
        aVar.key_.add(cVar);
    }

    /* renamed from: m */
    public final Object mo58428m(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (C16416a.f36516a[methodToInvoke.ordinal()]) {
            case 1:
                return new C16415a();
            case 2:
                return new C16417b();
            case 3:
                return new C16536v0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", C16418c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C16524r0<C16415a> r0Var = PARSER;
                if (r0Var == null) {
                    synchronized (C16415a.class) {
                        r0Var = PARSER;
                        if (r0Var == null) {
                            r0Var = new GeneratedMessageLite.C16432b<>(DEFAULT_INSTANCE);
                            PARSER = r0Var;
                        }
                    }
                }
                return r0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: w */
    public final C16418c mo58431w(int i) {
        return this.key_.get(i);
    }

    /* renamed from: x */
    public final int mo58432x() {
        return this.key_.size();
    }

    /* renamed from: y */
    public final List<C16418c> mo58433y() {
        return this.key_;
    }

    /* renamed from: z */
    public final int mo58434z() {
        return this.primaryKeyId_;
    }
}
