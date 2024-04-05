package com.bugsnag.android.repackaged.dslplatform.json;

import com.bugsnag.android.repackaged.dslplatform.json.C5858h;
import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import java.io.IOException;

/* renamed from: com.bugsnag.android.repackaged.dslplatform.json.b */
public abstract class C5837b {

    /* renamed from: a */
    public static final C5838a f12500a = new C5838a();

    /* renamed from: b */
    public static final C5839b f12501b = new C5839b();

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.b$a */
    public class C5838a implements JsonReader.C5834c<byte[]> {
        /* renamed from: a */
        public final Object mo16650a(JsonReader jsonReader) throws IOException {
            if (jsonReader.mo16645u()) {
                return null;
            }
            if (jsonReader.f12481j != null) {
                byte[] bArr = jsonReader.f12479h;
                int i = jsonReader.f12473b;
                char[] cArr = C5836a.f12496a;
                while (true) {
                    if (i >= bArr.length) {
                        i = bArr.length;
                        break;
                    } else if (C5836a.f12498c[bArr[i] & 255] < 0) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i == jsonReader.f12479h.length) {
                    int k = jsonReader.mo16634k();
                    byte[] bArr2 = new byte[k];
                    for (int i2 = 0; i2 < k; i2++) {
                        bArr2[i2] = (byte) jsonReader.f12480i[i2];
                    }
                    return C5836a.m11627a(0, k, bArr2);
                }
            }
            if (jsonReader.f12475d == 34) {
                int i3 = jsonReader.f12473b;
                byte[] bArr3 = jsonReader.f12479h;
                char[] cArr2 = C5836a.f12496a;
                int i4 = i3;
                while (true) {
                    if (i4 >= bArr3.length) {
                        i4 = bArr3.length;
                        break;
                    } else if (C5836a.f12498c[bArr3[i4] & 255] < 0) {
                        break;
                    } else {
                        i4++;
                    }
                }
                byte[] bArr4 = jsonReader.f12479h;
                int i5 = i4 + 1;
                jsonReader.f12473b = i5;
                byte b = bArr4[i4];
                jsonReader.f12475d = b;
                if (b == 34) {
                    return C5836a.m11627a(i3, i5 - 1, bArr4);
                }
                throw jsonReader.mo16629f("Expecting '\"' for base64 end");
            }
            throw jsonReader.mo16629f("Expecting '\"' for base64 start");
        }
    }

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.b$b */
    public class C5839b implements C5858h.C5859a<byte[]> {
    }
}
