package androidx.datastore.preferences.core;

import androidx.datastore.core.C2483j;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.SingleProcessDataStore;
import androidx.datastore.preferences.C2498d;
import androidx.datastore.preferences.C2501e;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.core.C2493b;
import androidx.datastore.preferences.protobuf.C2631w;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19294b0;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.datastore.preferences.core.c */
public final class C2496c implements C2483j<C2493b> {

    /* renamed from: a */
    public static final C2496c f5765a = new C2496c();

    /* renamed from: androidx.datastore.preferences.core.c$a */
    public /* synthetic */ class C2497a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5766a;

        static {
            int[] iArr = new int[PreferencesProto$Value.ValueCase.values().length];
            iArr[PreferencesProto$Value.ValueCase.BOOLEAN.ordinal()] = 1;
            iArr[PreferencesProto$Value.ValueCase.FLOAT.ordinal()] = 2;
            iArr[PreferencesProto$Value.ValueCase.DOUBLE.ordinal()] = 3;
            iArr[PreferencesProto$Value.ValueCase.INTEGER.ordinal()] = 4;
            iArr[PreferencesProto$Value.ValueCase.LONG.ordinal()] = 5;
            iArr[PreferencesProto$Value.ValueCase.STRING.ordinal()] = 6;
            iArr[PreferencesProto$Value.ValueCase.STRING_SET.ordinal()] = 7;
            iArr[PreferencesProto$Value.ValueCase.VALUE_NOT_SET.ordinal()] = 8;
            f5766a = iArr;
        }
    }

    /* renamed from: a */
    public final MutablePreferences mo9330a() {
        return new MutablePreferences(true, 1);
    }

    /* renamed from: b */
    public final MutablePreferences mo9331b(FileInputStream fileInputStream) throws IOException, CorruptionException {
        try {
            C2498d v = C2498d.m5483v(fileInputStream);
            MutablePreferences mutablePreferences = new MutablePreferences(false, 1);
            C2493b.C2495b[] bVarArr = (C2493b.C2495b[]) Arrays.copyOf(new C2493b.C2495b[0], 0);
            C19383o.m32797g(bVarArr, "pairs");
            mutablePreferences.mo9352c();
            if (bVarArr.length <= 0) {
                Map<String, PreferencesProto$Value> t = v.mo9363t();
                C19383o.m32796f(t, "preferencesProto.preferencesMap");
                for (Map.Entry next : t.entrySet()) {
                    String str = (String) next.getKey();
                    PreferencesProto$Value preferencesProto$Value = (PreferencesProto$Value) next.getValue();
                    C19383o.m32796f(str, "name");
                    C19383o.m32796f(preferencesProto$Value, "value");
                    PreferencesProto$Value.ValueCase H = preferencesProto$Value.mo9343H();
                    switch (H == null ? -1 : C2497a.f5766a[H.ordinal()]) {
                        case -1:
                            throw new CorruptionException("Value case is null.", (Throwable) null, 2, (DefaultConstructorMarker) null);
                        case 1:
                            mutablePreferences.mo9353d(new C2493b.C2494a(str), Boolean.valueOf(preferencesProto$Value.mo9345z()));
                            break;
                        case 2:
                            mutablePreferences.mo9353d(new C2493b.C2494a(str), Float.valueOf(preferencesProto$Value.mo9338C()));
                            break;
                        case 3:
                            mutablePreferences.mo9353d(new C2493b.C2494a(str), Double.valueOf(preferencesProto$Value.mo9337B()));
                            break;
                        case 4:
                            mutablePreferences.mo9353d(new C2493b.C2494a(str), Integer.valueOf(preferencesProto$Value.mo9339D()));
                            break;
                        case 5:
                            mutablePreferences.mo9353d(new C2493b.C2494a(str), Long.valueOf(preferencesProto$Value.mo9340E()));
                            break;
                        case 6:
                            C2493b.C2494a aVar = new C2493b.C2494a(str);
                            String F = preferencesProto$Value.mo9341F();
                            C19383o.m32796f(F, "value.string");
                            mutablePreferences.mo9353d(aVar, F);
                            break;
                        case 7:
                            C2493b.C2494a aVar2 = new C2493b.C2494a(str);
                            C2631w.C2635d u = preferencesProto$Value.mo9342G().mo9364u();
                            C19383o.m32796f(u, "value.stringSet.stringsList");
                            mutablePreferences.mo9353d(aVar2, C19327t.m32664t1(u));
                            break;
                        case 8:
                            throw new CorruptionException("Value not set.", (Throwable) null, 2, (DefaultConstructorMarker) null);
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                return new MutablePreferences((Map<C2493b.C2494a<?>, Object>) C19294b0.m32558A0(mutablePreferences.mo9350a()), true);
            }
            bVarArr[0].getClass();
            mutablePreferences.mo9353d((C2493b.C2494a<?>) null, (Object) null);
            throw null;
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Unable to parse preferences proto.", e);
        }
    }

    /* renamed from: c */
    public final C19394m mo9332c(Object obj, SingleProcessDataStore.C2470b bVar) {
        GeneratedMessageLite generatedMessageLite;
        Map<C2493b.C2494a<?>, Object> a = ((C2493b) obj).mo9350a();
        C2498d.C2499a u = C2498d.m5482u();
        for (Map.Entry next : a.entrySet()) {
            Object value = next.getValue();
            String str = ((C2493b.C2494a) next.getKey()).f5764a;
            if (value instanceof Boolean) {
                PreferencesProto$Value.C2488a I = PreferencesProto$Value.m5449I();
                boolean booleanValue = ((Boolean) value).booleanValue();
                I.mo9476o();
                PreferencesProto$Value.m5455w((PreferencesProto$Value) I.f5797c, booleanValue);
                generatedMessageLite = I.mo9474l();
            } else if (value instanceof Float) {
                PreferencesProto$Value.C2488a I2 = PreferencesProto$Value.m5449I();
                float floatValue = ((Number) value).floatValue();
                I2.mo9476o();
                PreferencesProto$Value.m5456x((PreferencesProto$Value) I2.f5797c, floatValue);
                generatedMessageLite = I2.mo9474l();
            } else if (value instanceof Double) {
                PreferencesProto$Value.C2488a I3 = PreferencesProto$Value.m5449I();
                double doubleValue = ((Number) value).doubleValue();
                I3.mo9476o();
                PreferencesProto$Value.m5453u((PreferencesProto$Value) I3.f5797c, doubleValue);
                generatedMessageLite = I3.mo9474l();
            } else if (value instanceof Integer) {
                PreferencesProto$Value.C2488a I4 = PreferencesProto$Value.m5449I();
                int intValue = ((Number) value).intValue();
                I4.mo9476o();
                PreferencesProto$Value.m5457y((PreferencesProto$Value) I4.f5797c, intValue);
                generatedMessageLite = I4.mo9474l();
            } else if (value instanceof Long) {
                PreferencesProto$Value.C2488a I5 = PreferencesProto$Value.m5449I();
                long longValue = ((Number) value).longValue();
                I5.mo9476o();
                PreferencesProto$Value.m5450r((PreferencesProto$Value) I5.f5797c, longValue);
                generatedMessageLite = I5.mo9474l();
            } else if (value instanceof String) {
                PreferencesProto$Value.C2488a I6 = PreferencesProto$Value.m5449I();
                I6.mo9476o();
                PreferencesProto$Value.m5451s((PreferencesProto$Value) I6.f5797c, (String) value);
                generatedMessageLite = I6.mo9474l();
            } else if (value instanceof Set) {
                PreferencesProto$Value.C2488a I7 = PreferencesProto$Value.m5449I();
                C2501e.C2502a v = C2501e.m5489v();
                v.mo9476o();
                C2501e.m5487s((C2501e) v.f5797c, (Set) value);
                I7.mo9476o();
                PreferencesProto$Value.m5452t((PreferencesProto$Value) I7.f5797c, v);
                generatedMessageLite = I7.mo9474l();
            } else {
                throw new IllegalStateException(C19383o.m32802l(value.getClass().getName(), "PreferencesSerializer does not support type: "));
            }
            u.getClass();
            str.getClass();
            u.mo9476o();
            C2498d.m5481s((C2498d) u.f5797c).put(str, (PreferencesProto$Value) generatedMessageLite);
        }
        C2498d dVar = (C2498d) u.mo9474l();
        int b = dVar.mo9461b();
        Logger logger = CodedOutputStream.f5781b;
        if (b > 4096) {
            b = 4096;
        }
        CodedOutputStream.C2515c cVar = new CodedOutputStream.C2515c(bVar, b);
        dVar.mo9469j(cVar);
        if (cVar.f5786f > 0) {
            cVar.mo9447b0();
        }
        return C19394m.f43287a;
    }
}
