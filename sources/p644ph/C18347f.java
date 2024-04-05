package p644ph;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.C19421p;
import p653qh.C18449a;
import p661rh.C18476b;
import p669sh.C18505a;
import p677th.C18544a;
import p685uh.C18577d;
import p693vh.C18639d;
import p701wh.C18680e;
import p701wh.C18685h;
import p709xh.C18761c;
import p717yh.C18836a;
import p717yh.C18841c;
import p717yh.C18844d0;
import p717yh.C18847e;
import p717yh.C18879x;
import p725zh.C18898a;

/* renamed from: ph.f */
public final class C18347f implements C18353k {

    /* renamed from: b */
    public static final int[] f40298b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* renamed from: c */
    public static final Constructor<? extends C18349h> f40299c;

    static {
        Constructor<? extends U> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke((Object) null, new Object[0]))) {
                constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(C18349h.class).getConstructor(new Class[]{Integer.TYPE});
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        f40299c = constructor;
    }

    /* renamed from: b */
    public static void m30997b(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new C18836a());
                return;
            case 1:
                arrayList.add(new C18841c());
                return;
            case 2:
                arrayList.add(new C18847e(0));
                return;
            case 3:
                arrayList.add(new C18449a());
                return;
            case 4:
                Constructor<? extends C18349h> constructor = f40299c;
                if (constructor != null) {
                    try {
                        arrayList.add((C18349h) constructor.newInstance(new Object[]{0}));
                        return;
                    } catch (Exception e) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
                    }
                } else {
                    arrayList.add(new C18476b());
                    return;
                }
            case 5:
                arrayList.add(new C18505a());
                return;
            case 6:
                arrayList.add(new C18577d());
                return;
            case 7:
                arrayList.add(new C18639d(0));
                return;
            case 8:
                arrayList.add(new C18680e());
                arrayList.add(new C18685h(0));
                return;
            case 9:
                arrayList.add(new C18761c());
                return;
            case 10:
                arrayList.add(new C18879x());
                return;
            case 11:
                arrayList.add(new C18844d0());
                return;
            case 12:
                arrayList.add(new C18898a());
                return;
            case 14:
                arrayList.add(new C18544a());
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final synchronized C18349h[] mo69887a(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        arrayList = new ArrayList(14);
        int O = C19421p.m32925O(map);
        if (O != -1) {
            m30997b(O, arrayList);
        }
        int P = C19421p.m32926P(uri);
        if (!(P == -1 || P == O)) {
            m30997b(P, arrayList);
        }
        int[] iArr = f40298b;
        for (int i = 0; i < 14; i++) {
            int i2 = iArr[i];
            if (!(i2 == O || i2 == P)) {
                m30997b(i2, arrayList);
            }
        }
        return (C18349h[]) arrayList.toArray(new C18349h[arrayList.size()]);
    }

    /* renamed from: d */
    public final synchronized C18349h[] mo38d() {
        return mo69887a(Uri.EMPTY, new HashMap());
    }
}
