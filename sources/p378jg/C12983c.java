package p378jg;

import com.facebook.internal.instrument.InstrumentData;

/* renamed from: jg.c */
public final /* synthetic */ class C12983c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f28595a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f28596b;

    static {
        int[] iArr = new int[InstrumentData.Type.values().length];
        f28595a = iArr;
        InstrumentData.Type type = InstrumentData.Type.Analysis;
        iArr[type.ordinal()] = 1;
        InstrumentData.Type type2 = InstrumentData.Type.AnrReport;
        iArr[type2.ordinal()] = 2;
        InstrumentData.Type type3 = InstrumentData.Type.CrashReport;
        iArr[type3.ordinal()] = 3;
        InstrumentData.Type type4 = InstrumentData.Type.CrashShield;
        iArr[type4.ordinal()] = 4;
        InstrumentData.Type type5 = InstrumentData.Type.ThreadCheck;
        iArr[type5.ordinal()] = 5;
        int[] iArr2 = new int[InstrumentData.Type.values().length];
        f28596b = iArr2;
        iArr2[type.ordinal()] = 1;
        iArr2[type2.ordinal()] = 2;
        iArr2[type3.ordinal()] = 3;
        iArr2[type4.ordinal()] = 4;
        iArr2[type5.ordinal()] = 5;
    }
}
