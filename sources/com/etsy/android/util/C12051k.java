package com.etsy.android.util;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.C19322o;
import kotlin.collections.C19327t;
import org.apache.commons.codec.net.URLCodec;
import p753kq.C19857l;

/* renamed from: com.etsy.android.util.k */
public final class C12051k {

    /* renamed from: a */
    public static final byte[] f26867a = {57, 56, Framer.STDOUT_FRAME_PREFIX, 100, 101, 101, Framer.STDOUT_FRAME_PREFIX, 57, 102, 54, 51, 102, 98, Framer.STDERR_FRAME_PREFIX, 48, 98, 99, Framer.STDOUT_FRAME_PREFIX, 102, 52, 48, 54, 98, 101, 52, 48, 52, Framer.STDERR_FRAME_PREFIX, 56, Framer.STDOUT_FRAME_PREFIX, Framer.STDOUT_FRAME_PREFIX, 56, 52, 97, 101, 101, 102, 102, 56, 57, Framer.STDOUT_FRAME_PREFIX, 102, 51, 97, 99, 98, 100, 100, 101, Framer.STDOUT_FRAME_PREFIX, 55, 99, 51, 102, 48, 57, Framer.STDOUT_FRAME_PREFIX, 56, 102, 51, 97, 102, 97, 57, 100, 102, 57, 98, 97, 56, 48, 48, Framer.STDERR_FRAME_PREFIX, 99, 102, Framer.STDERR_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 101, 97, 57, 100, Framer.STDERR_FRAME_PREFIX, 48, 57, 101, 57, 55, 52, 97, 55, 98, 99, 53, 102, 57, 51, 97, 54, 55, 52, 98, 55, 57, 101, 52, 54, 51, 55, 102, 48, 102, Framer.STDOUT_FRAME_PREFIX, 97, 98, Framer.STDERR_FRAME_PREFIX, 57, 98, 102, 48, 100, 52, 101, 102, 100, 52, 54, 56, Framer.STDERR_FRAME_PREFIX, 57, 57, 57, 54, 99, 55, 99, 97, 102, 56, 101, Framer.STDERR_FRAME_PREFIX, 55, 52, 52, 54, 48, 57, 102, 100, 56, 52, 52, 99, 97, Framer.STDOUT_FRAME_PREFIX, 97, 102, 53, 102, 51, 99, 98, 98, 101, 97, 99, 99, Framer.STDERR_FRAME_PREFIX, 100, 48, 100, 97, 99, 48, 99, 51, 48};

    /* renamed from: b */
    public static final String f26868b;

    /* renamed from: c */
    public static final String f26869c;

    /* renamed from: d */
    public static final String f26870d;

    /* renamed from: e */
    public static final String f26871e;

    /* renamed from: f */
    public static final String f26872f;

    /* renamed from: g */
    public static final String f26873g;

    /* renamed from: h */
    public static final String f26874h;

    /* renamed from: i */
    public static final String f26875i;

    /* renamed from: j */
    public static final String f26876j;

    /* renamed from: com.etsy.android.util.k$a */
    public static final class C12052a {
        /* renamed from: a */
        public static final String m19867a(C12052a aVar, byte[] bArr) {
            byte[] bArr2 = C12051k.f26867a;
            int min = Math.min(176, bArr.length);
            ArrayList arrayList = new ArrayList(min);
            for (int i = 0; i < min; i++) {
                arrayList.add(new Pair(Byte.valueOf(bArr2[i]), Byte.valueOf(bArr[i])));
            }
            ArrayList arrayList2 = new ArrayList(C19322o.m32624F0(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                arrayList2.add(Byte.valueOf((byte) (((Number) pair.getSecond()).byteValue() ^ ((Number) pair.getFirst()).byteValue())));
            }
            ArrayList arrayList3 = new ArrayList(C19322o.m32624F0(arrayList2));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Character.valueOf((char) ((Number) it2.next()).byteValue()));
            }
            return C19327t.m32644Z0(arrayList3, "", (String) null, (String) null, (C19857l) null, 62);
        }
    }

    static {
        C12052a aVar = new C12052a();
        f26868b = C12052a.m19867a(aVar, new byte[]{94, 94, 7, 82, 80, 13, 91, 9, 13, 70, 64, 2, 9, 66, 92, 14, 4, 84, 13, 5, 1, 76, 16, 31});
        f26869c = C12052a.m19867a(aVar, new byte[]{78, 79, 75, 22, 84, 9, 4, 85, 13, 88});
        C12052a.m19867a(aVar, new byte[]{12, 11, 85, 93, 80, 80, 82, 15, 86, 1, 1, 84, 91, 83, 6, 86, 85, 83, 86, 4, 0, 6, 82, 84});
        C12052a.m19867a(aVar, new byte[]{93, Framer.STDIN_REQUEST_FRAME_PREFIX, 118, 92, 19, 51, 99, 108, 31, 4, 0, 54, 8, 65, 3, 35, Framer.STDERR_FRAME_PREFIX, 125, 39, 68, 105, 113, 53, 23, 115, 6, 12, 122, 77, 68, 92, 114});
        f26870d = C12052a.m19867a(aVar, new byte[]{0, 15, 6, 81, 92, 85, 8, 9, 3, 82, 85, 3, 85, 84, 8, 85, 81, 3, 0, 5, 82, 87, 3, 4, 2, 3, 80, 81, 93, 83, 9, 89});
        f26871e = C12052a.m19867a(aVar, new byte[]{88, 72, 65, 73, 84, 4, 87, 88, 4, 84, 82, 0, 86, 7, 9, 91, 82, 3, 86, 80});
        f26872f = C12052a.m19867a(aVar, new byte[]{123, 119, 71, 52, Framer.STDOUT_FRAME_PREFIX, 39, 119, 114, 86, 108, 106, 44, 24, 122, 8, 7, 11, 118, 34, 7, 7, Byte.MAX_VALUE, URLCodec.ESCAPE_CHAR, 13, 6, 65, 3, 115, 82, 97, 105, 110, 101, Framer.STDIN_FRAME_PREFIX, 16, 2, 7, 22, 86, 91, 26, 81, 90, 14, 53, 20, 47, Framer.ENTER_FRAME_PREFIX, 93, 67, 118, 38, 2, 4, 102, Framer.STDIN_REQUEST_FRAME_PREFIX, 4, 98, Framer.STDIN_FRAME_PREFIX, 86, 84, 80, 82, 91, 60, 42, 114, 87, 47, 75, 125, 96, 96, 58, 10, 72, 25, 20, 12, 75, 54, 2, 123, 15, 21, 93, 110, 9});
        f26873g = C12052a.m19867a(aVar, new byte[]{126, 126, 90, 54, 39, 10, 107, 123, Framer.STDIN_REQUEST_FRAME_PREFIX, 94, 96, 36, 4, Framer.EXIT_FRAME_PREFIX, 6, 22, 1, 85, 43, 1, 69, Framer.STDIN_REQUEST_FRAME_PREFIX});
        C12052a.m19867a(aVar, new byte[]{11, 1, 7, 93, 80, 83, 6, 1, 85, 5, 10, 85});
        C12052a.m19867a(aVar, new byte[]{122, 94, 102, 30, 87, Framer.STDIN_FRAME_PREFIX, 6, 117, 3, 116, 10, 94, 4, 99, 98, 46, 6, 101, Framer.ENTER_FRAME_PREFIX, 78, 96, 103, 24, 10, 102, 6, 64, 96, 87, 72, 86, 116});
        f26874h = C12052a.m19867a(aVar, new byte[]{99, 118, 110, 7, Framer.STDOUT_FRAME_PREFIX, 47, 118, 124, 28, 102, 65, 87, 24, 99, 64, 53, 0, 69});
        f26875i = C12052a.m19867a(aVar, new byte[]{115, 125, 67, 16, Framer.STDIN_FRAME_PREFIX, 92, 123, 117, 62, 92, 4, 14, 39, 97, 72, 13, 4, 90, 94, 70});
        f26876j = C12052a.m19867a(aVar, new byte[]{8, 8, 85, 86, 1, 0, 8, Framer.STDIN_REQUEST_FRAME_PREFIX, 75, 80, 11, 94, 87, 31, 4, 90, 1, 8, 75, 86, 6, 87, 85, 72, 7, 81, 2, 83, 11, 84, 87, 11, 1, 86, 1, 1});
    }
}
