package com.bugsnag.android.repackaged.dslplatform.json;

import com.bugsnag.android.repackaged.dslplatform.json.C5858h;
import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import java.io.IOException;
import java.util.UUID;

/* renamed from: com.bugsnag.android.repackaged.dslplatform.json.n */
public abstract class C5904n {

    /* renamed from: a */
    public static final C5905a f12598a = new C5905a();

    /* renamed from: b */
    public static final C5906b f12599b = new C5906b();

    /* renamed from: c */
    public static final char[] f12600c = new char[256];

    /* renamed from: d */
    public static final byte[] f12601d = new byte[55];

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.n$a */
    public class C5905a implements JsonReader.C5834c<UUID> {
        /* renamed from: a */
        public final Object mo16650a(JsonReader jsonReader) throws IOException {
            int i;
            if (jsonReader.mo16645u()) {
                return null;
            }
            char[] q = jsonReader.mo16640q();
            int i2 = jsonReader.f12473b - jsonReader.f12472a;
            long j = 0;
            if (i2 == 37 && q[8] == '-' && q[13] == '-' && q[18] == '-' && q[23] == '-') {
                long j2 = 0;
                int i3 = 0;
                while (i3 < 8) {
                    try {
                        j2 = (j2 << 4) + ((long) C5904n.f12601d[q[i3] - '0']);
                        i3++;
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        return UUID.fromString(new String(q, 0, 36));
                    }
                }
                for (int i4 = 9; i4 < 13; i4++) {
                    j2 = (j2 << 4) + ((long) C5904n.f12601d[q[i4] - '0']);
                }
                for (int i5 = 14; i5 < 18; i5++) {
                    j2 = (j2 << 4) + ((long) C5904n.f12601d[q[i5] - '0']);
                }
                for (int i6 = 19; i6 < 23; i6++) {
                    j = (j << 4) + ((long) C5904n.f12601d[q[i6] - '0']);
                }
                for (int i7 = 24; i7 < 36; i7++) {
                    j = (j << 4) + ((long) C5904n.f12601d[q[i7] - '0']);
                }
                return new UUID(j2, j);
            } else if (i2 != 33) {
                return UUID.fromString(new String(q, 0, i2 - 1));
            } else {
                long j3 = 0;
                int i8 = 0;
                while (true) {
                    if (i8 >= 16) {
                        break;
                    }
                    try {
                        j3 = (j3 << 4) + ((long) C5904n.f12601d[q[i8] - '0']);
                        i8++;
                    } catch (ArrayIndexOutOfBoundsException unused2) {
                        return UUID.fromString(new String(q, 0, 32));
                    }
                }
                for (i = 16; i < 32; i++) {
                    j = (j << 4) + ((long) C5904n.f12601d[q[i] - '0']);
                }
                return new UUID(j3, j);
            }
        }
    }

    /* renamed from: com.bugsnag.android.repackaged.dslplatform.json.n$b */
    public class C5906b implements C5858h.C5859a<UUID> {
    }

    static {
        new UUID(0, 0);
        for (int i = 0; i < 256; i++) {
            int i2 = (i >> 4) & 15;
            int i3 = i & 15;
            f12600c[i] = (char) (((i2 < 10 ? i2 + 48 : (i2 + 97) - 10) << 8) + (i3 < 10 ? i3 + 48 : (i3 + 97) - 10));
        }
        for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
            int i4 = c - '0';
            f12601d[i4] = (byte) i4;
        }
        for (char c2 = 'a'; c2 <= 'f'; c2 = (char) (c2 + 1)) {
            f12601d[c2 - '0'] = (byte) ((c2 - 'a') + 10);
        }
        for (char c3 = 'A'; c3 <= 'F'; c3 = (char) (c3 + 1)) {
            f12601d[c3 - '0'] = (byte) ((c3 - 'A') + 10);
        }
    }
}
