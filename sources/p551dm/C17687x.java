package p551dm;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.C16506k0;
import com.google.crypto.tink.shaded.protobuf.C16511n;
import com.google.crypto.tink.shaded.protobuf.C16524r0;
import com.google.crypto.tink.shaded.protobuf.C16536v0;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

/* renamed from: dm.x */
public final class C17687x extends GeneratedMessageLite<C17687x, C17689b> implements C16506k0 {
    /* access modifiers changed from: private */
    public static final C17687x DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile C16524r0<C17687x> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.EMPTY;
    private C17693z params_;
    private int version_;

    /* renamed from: dm.x$a */
    public static /* synthetic */ class C17688a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38488a;

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
                f38488a = r0
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f38488a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f38488a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f38488a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f38488a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f38488a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f38488a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p551dm.C17687x.C17688a.<clinit>():void");
        }
    }

    /* renamed from: dm.x$b */
    public static final class C17689b extends GeneratedMessageLite.C16431a<C17687x, C17689b> implements C16506k0 {
        public C17689b() {
            super(C17687x.DEFAULT_INSTANCE);
        }
    }

    static {
        C17687x xVar = new C17687x();
        DEFAULT_INSTANCE = xVar;
        GeneratedMessageLite.m26634s(C17687x.class, xVar);
    }

    /* renamed from: B */
    public static C17689b m29679B() {
        return (C17689b) DEFAULT_INSTANCE.mo58534l();
    }

    /* renamed from: C */
    public static C17687x m29680C(ByteString byteString, C16511n nVar) throws InvalidProtocolBufferException {
        return (C17687x) GeneratedMessageLite.m26631p(DEFAULT_INSTANCE, byteString, nVar);
    }

    /* renamed from: u */
    public static void m29682u(C17687x xVar) {
        xVar.version_ = 0;
    }

    /* renamed from: v */
    public static void m29683v(C17687x xVar, C17693z zVar) {
        xVar.getClass();
        zVar.getClass();
        xVar.params_ = zVar;
    }

    /* renamed from: w */
    public static void m29684w(C17687x xVar, ByteString byteString) {
        xVar.getClass();
        byteString.getClass();
        xVar.keyValue_ = byteString;
    }

    /* renamed from: x */
    public static C17687x m29685x() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: A */
    public final int mo68967A() {
        return this.version_;
    }

    /* renamed from: m */
    public final Object mo58428m(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (C17688a.f38488a[methodToInvoke.ordinal()]) {
            case 1:
                return new C17687x();
            case 2:
                return new C17689b();
            case 3:
                return new C16536v0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C16524r0<C17687x> r0Var = PARSER;
                if (r0Var == null) {
                    synchronized (C17687x.class) {
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
    public final ByteString mo68968y() {
        return this.keyValue_;
    }

    /* renamed from: z */
    public final C17693z mo68969z() {
        C17693z zVar = this.params_;
        return zVar == null ? C17693z.m29697u() : zVar;
    }
}
