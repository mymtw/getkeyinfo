package com.google.crypto.tink;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.errorprone.annotations.Immutable;
import p551dm.C17589a0;

@Immutable
public final class KeyTemplate {

    /* renamed from: a */
    public final C17589a0 f36505a;

    public enum OutputPrefixType {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    /* renamed from: com.google.crypto.tink.KeyTemplate$a */
    public static /* synthetic */ class C16398a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36506a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f36507b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        static {
            /*
                com.google.crypto.tink.KeyTemplate$OutputPrefixType[] r0 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36507b = r0
                r1 = 1
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r2 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f36507b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r3 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.LEGACY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f36507b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r4 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f36507b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r5 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.CRUNCHY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.google.crypto.tink.proto.OutputPrefixType[] r4 = com.google.crypto.tink.proto.OutputPrefixType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f36506a = r4
                com.google.crypto.tink.proto.OutputPrefixType r5 = com.google.crypto.tink.proto.OutputPrefixType.TINK     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f36506a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.google.crypto.tink.proto.OutputPrefixType r4 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f36506a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f36506a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.KeyTemplate.C16398a.<clinit>():void");
        }
    }

    public KeyTemplate(C17589a0 a0Var) {
        this.f36505a = a0Var;
    }

    /* renamed from: a */
    public static KeyTemplate m26517a(String str, byte[] bArr, OutputPrefixType outputPrefixType) {
        com.google.crypto.tink.proto.OutputPrefixType outputPrefixType2;
        C17589a0.C17591b B = C17589a0.m29463B();
        B.mo58540o();
        C17589a0.m29465u((C17589a0) B.f36539c, str);
        ByteString copyFrom = ByteString.copyFrom(bArr);
        B.mo58540o();
        C17589a0.m29466v((C17589a0) B.f36539c, copyFrom);
        int i = C16398a.f36507b[outputPrefixType.ordinal()];
        if (i == 1) {
            outputPrefixType2 = com.google.crypto.tink.proto.OutputPrefixType.TINK;
        } else if (i == 2) {
            outputPrefixType2 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY;
        } else if (i == 3) {
            outputPrefixType2 = com.google.crypto.tink.proto.OutputPrefixType.RAW;
        } else if (i == 4) {
            outputPrefixType2 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY;
        } else {
            throw new IllegalArgumentException("Unknown output prefix type");
        }
        B.mo58540o();
        C17589a0.m29467w((C17589a0) B.f36539c, outputPrefixType2);
        return new KeyTemplate((C17589a0) B.mo58538l());
    }
}
