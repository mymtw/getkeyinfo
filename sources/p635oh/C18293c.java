package p635oh;

import java.util.UUID;
import p513bj.C14049b0;

/* renamed from: oh.c */
public final class C18293c implements C18292b {

    /* renamed from: d */
    public static final boolean f40140d;

    /* renamed from: a */
    public final UUID f40141a;

    /* renamed from: b */
    public final byte[] f40142b;

    /* renamed from: c */
    public final boolean f40143c;

    static {
        boolean z;
        if ("Amazon".equals(C14049b0.f30915c)) {
            String str = C14049b0.f30916d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                f40140d = z;
            }
        }
        z = false;
        f40140d = z;
    }

    public C18293c(UUID uuid, byte[] bArr, boolean z) {
        this.f40141a = uuid;
        this.f40142b = bArr;
        this.f40143c = z;
    }
}
