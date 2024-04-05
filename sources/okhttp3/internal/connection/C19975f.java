package okhttp3.internal.connection;

import java.net.Proxy;

/* renamed from: okhttp3.internal.connection.f */
public final /* synthetic */ class C19975f {

    /* renamed from: a */
    public static final /* synthetic */ int[] f44176a;

    static {
        int[] iArr = new int[Proxy.Type.values().length];
        f44176a = iArr;
        iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        iArr[Proxy.Type.HTTP.ordinal()] = 2;
    }
}
