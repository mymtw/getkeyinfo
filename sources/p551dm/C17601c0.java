package p551dm;

import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.C16506k0;
import com.google.crypto.tink.shaded.protobuf.C16524r0;
import com.google.crypto.tink.shaded.protobuf.C16530u0;
import com.google.crypto.tink.shaded.protobuf.C16531v;
import com.google.crypto.tink.shaded.protobuf.C16536v0;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* renamed from: dm.c0 */
public final class C17601c0 extends GeneratedMessageLite<C17601c0, C17603b> implements C16506k0 {
    /* access modifiers changed from: private */
    public static final C17601c0 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile C16524r0<C17601c0> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private C16531v.C16535d<C17604c> keyInfo_ = C16530u0.f36701e;
    private int primaryKeyId_;

    /* renamed from: dm.c0$a */
    public static /* synthetic */ class C17602a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38460a;

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
                f38460a = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f38460a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f38460a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f38460a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f38460a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f38460a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f38460a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p551dm.C17601c0.C17602a.<clinit>():void");
        }
    }

    /* renamed from: dm.c0$b */
    public static final class C17603b extends GeneratedMessageLite.C16431a<C17601c0, C17603b> implements C16506k0 {
        public C17603b() {
            super(C17601c0.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: dm.c0$c */
    public static final class C17604c extends GeneratedMessageLite<C17604c, C17605a> implements C16506k0 {
        /* access modifiers changed from: private */
        public static final C17604c DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile C16524r0<C17604c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        /* renamed from: dm.c0$c$a */
        public static final class C17605a extends GeneratedMessageLite.C16431a<C17604c, C17605a> implements C16506k0 {
            public C17605a() {
                super(C17604c.DEFAULT_INSTANCE);
            }
        }

        static {
            C17604c cVar = new C17604c();
            DEFAULT_INSTANCE = cVar;
            GeneratedMessageLite.m26634s(C17604c.class, cVar);
        }

        /* renamed from: u */
        public static void m29491u(C17604c cVar, String str) {
            cVar.getClass();
            str.getClass();
            cVar.typeUrl_ = str;
        }

        /* renamed from: v */
        public static void m29492v(C17604c cVar, OutputPrefixType outputPrefixType) {
            cVar.getClass();
            cVar.outputPrefixType_ = outputPrefixType.getNumber();
        }

        /* renamed from: w */
        public static void m29493w(C17604c cVar, KeyStatusType keyStatusType) {
            cVar.getClass();
            cVar.status_ = keyStatusType.getNumber();
        }

        /* renamed from: x */
        public static void m29494x(C17604c cVar, int i) {
            cVar.keyId_ = i;
        }

        /* renamed from: z */
        public static C17605a m29495z() {
            return (C17605a) DEFAULT_INSTANCE.mo58534l();
        }

        /* renamed from: m */
        public final Object mo58428m(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
            switch (C17602a.f38460a[methodToInvoke.ordinal()]) {
                case 1:
                    return new C17604c();
                case 2:
                    return new C17605a();
                case 3:
                    return new C16536v0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C16524r0<C17604c> r0Var = PARSER;
                    if (r0Var == null) {
                        synchronized (C17604c.class) {
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
        public final int mo68920y() {
            return this.keyId_;
        }
    }

    static {
        C17601c0 c0Var = new C17601c0();
        DEFAULT_INSTANCE = c0Var;
        GeneratedMessageLite.m26634s(C17601c0.class, c0Var);
    }

    /* renamed from: u */
    public static void m29485u(C17601c0 c0Var, int i) {
        c0Var.primaryKeyId_ = i;
    }

    /* renamed from: v */
    public static void m29486v(C17601c0 c0Var, C17604c cVar) {
        c0Var.getClass();
        if (!c0Var.keyInfo_.mo58674h()) {
            C16531v.C16535d<C17604c> dVar = c0Var.keyInfo_;
            int size = dVar.size();
            c0Var.keyInfo_ = dVar.mo58661i(size == 0 ? 10 : size * 2);
        }
        c0Var.keyInfo_.add(cVar);
    }

    /* renamed from: x */
    public static C17603b m29487x() {
        return (C17603b) DEFAULT_INSTANCE.mo58534l();
    }

    /* renamed from: m */
    public final Object mo58428m(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (C17602a.f38460a[methodToInvoke.ordinal()]) {
            case 1:
                return new C17601c0();
            case 2:
                return new C17603b();
            case 3:
                return new C16536v0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", C17604c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C16524r0<C17601c0> r0Var = PARSER;
                if (r0Var == null) {
                    synchronized (C17601c0.class) {
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
    public final C17604c mo68919w() {
        return this.keyInfo_.get(0);
    }
}
