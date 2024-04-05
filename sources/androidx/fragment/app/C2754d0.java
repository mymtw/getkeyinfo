package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import p186n2.C7395f;

/* renamed from: androidx.fragment.app.d0 */
public final class C2754d0 {

    /* renamed from: a */
    public static final C2759f0 f6276a = new C2759f0();

    /* renamed from: b */
    public static final C2769j0 f6277b;

    static {
        C2769j0 j0Var;
        try {
            j0Var = C7395f.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            j0Var = null;
        }
        f6277b = j0Var;
    }

    /* renamed from: a */
    public static void m6617a(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }
}
