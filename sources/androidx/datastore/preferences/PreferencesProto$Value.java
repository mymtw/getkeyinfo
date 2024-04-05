package androidx.datastore.preferences;

import androidx.datastore.preferences.C2501e;
import androidx.datastore.preferences.protobuf.C2605l0;
import androidx.datastore.preferences.protobuf.C2624s0;
import androidx.datastore.preferences.protobuf.C2636w0;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import com.google.android.material.shadow.ShadowDrawableWrapper;

public final class PreferencesProto$Value extends GeneratedMessageLite<PreferencesProto$Value, C2488a> implements C2605l0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final PreferencesProto$Value DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile C2624s0<PreferencesProto$Value> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    public enum ValueCase {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        VALUE_NOT_SET(0);
        
        private final int value;

        private ValueCase(int i) {
            this.value = i;
        }

        public static ValueCase forNumber(int i) {
            switch (i) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ValueCase valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: androidx.datastore.preferences.PreferencesProto$Value$a */
    public static final class C2488a extends GeneratedMessageLite.C2521a<PreferencesProto$Value, C2488a> implements C2605l0 {
        public C2488a() {
            super(PreferencesProto$Value.DEFAULT_INSTANCE);
        }
    }

    static {
        PreferencesProto$Value preferencesProto$Value = new PreferencesProto$Value();
        DEFAULT_INSTANCE = preferencesProto$Value;
        GeneratedMessageLite.m5607q(PreferencesProto$Value.class, preferencesProto$Value);
    }

    /* renamed from: A */
    public static PreferencesProto$Value m5448A() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: I */
    public static C2488a m5449I() {
        PreferencesProto$Value preferencesProto$Value = DEFAULT_INSTANCE;
        preferencesProto$Value.getClass();
        return (C2488a) ((GeneratedMessageLite.C2521a) preferencesProto$Value.mo9344m(GeneratedMessageLite.MethodToInvoke.NEW_BUILDER));
    }

    /* renamed from: r */
    public static void m5450r(PreferencesProto$Value preferencesProto$Value, long j) {
        preferencesProto$Value.valueCase_ = 4;
        preferencesProto$Value.value_ = Long.valueOf(j);
    }

    /* renamed from: s */
    public static void m5451s(PreferencesProto$Value preferencesProto$Value, String str) {
        preferencesProto$Value.getClass();
        str.getClass();
        preferencesProto$Value.valueCase_ = 5;
        preferencesProto$Value.value_ = str;
    }

    /* renamed from: t */
    public static void m5452t(PreferencesProto$Value preferencesProto$Value, C2501e.C2502a aVar) {
        preferencesProto$Value.getClass();
        preferencesProto$Value.value_ = aVar.mo9474l();
        preferencesProto$Value.valueCase_ = 6;
    }

    /* renamed from: u */
    public static void m5453u(PreferencesProto$Value preferencesProto$Value, double d) {
        preferencesProto$Value.valueCase_ = 7;
        preferencesProto$Value.value_ = Double.valueOf(d);
    }

    /* renamed from: w */
    public static void m5455w(PreferencesProto$Value preferencesProto$Value, boolean z) {
        preferencesProto$Value.valueCase_ = 1;
        preferencesProto$Value.value_ = Boolean.valueOf(z);
    }

    /* renamed from: x */
    public static void m5456x(PreferencesProto$Value preferencesProto$Value, float f) {
        preferencesProto$Value.valueCase_ = 2;
        preferencesProto$Value.value_ = Float.valueOf(f);
    }

    /* renamed from: y */
    public static void m5457y(PreferencesProto$Value preferencesProto$Value, int i) {
        preferencesProto$Value.valueCase_ = 3;
        preferencesProto$Value.value_ = Integer.valueOf(i);
    }

    /* renamed from: B */
    public final double mo9337B() {
        return this.valueCase_ == 7 ? ((Double) this.value_).doubleValue() : ShadowDrawableWrapper.COS_45;
    }

    /* renamed from: C */
    public final float mo9338C() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    /* renamed from: D */
    public final int mo9339D() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    /* renamed from: E */
    public final long mo9340E() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0;
    }

    /* renamed from: F */
    public final String mo9341F() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    /* renamed from: G */
    public final C2501e mo9342G() {
        return this.valueCase_ == 6 ? (C2501e) this.value_ : C2501e.m5488t();
    }

    /* renamed from: H */
    public final ValueCase mo9343H() {
        return ValueCase.forNumber(this.valueCase_);
    }

    /* renamed from: m */
    public final Object mo9344m(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (C2491c.f5760a[methodToInvoke.ordinal()]) {
            case 1:
                return new PreferencesProto$Value();
            case 2:
                return new C2488a();
            case 3:
                return new C2636w0(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", C2501e.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C2624s0<PreferencesProto$Value> s0Var = PARSER;
                if (s0Var == null) {
                    synchronized (PreferencesProto$Value.class) {
                        s0Var = PARSER;
                        if (s0Var == null) {
                            s0Var = new GeneratedMessageLite.C2522b<>(DEFAULT_INSTANCE);
                            PARSER = s0Var;
                        }
                    }
                }
                return s0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: z */
    public final boolean mo9345z() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }
}
