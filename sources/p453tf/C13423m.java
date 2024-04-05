package p453tf;

import android.util.Log;
import androidx.appcompat.widget.C0326j;
import androidx.compose.foundation.layout.C0761x;
import androidx.core.widget.NestedScrollView;
import com.facebook.internal.FeatureManager;
import com.google.android.play.core.appupdate.C15562d;
import com.google.android.play.core.internal.C15704p;
import java.io.File;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.C19382n;
import p001a0.C0005b;
import p273w4.C8242k;
import p715xn.C18822c;
import p715xn.C18823d;

/* renamed from: tf.m */
public final class C13423m implements FeatureManager.C12256a, C8242k, C15704p, C18822c {

    /* renamed from: b */
    public static final C13423m f29408b = new C13423m();

    /* renamed from: a */
    public void mo45793a(C18823d dVar) {
        StringBuilder k = C0326j.m866k(0);
        while (true) {
            if (!dVar.mo70270c()) {
                break;
            }
            k.append(dVar.mo70269b());
            int i = dVar.f41678f + 1;
            dVar.f41678f = i;
            if (C0761x.m1745t0(i, 5, dVar.f41673a) != 5) {
                dVar.f41679g = 0;
                break;
            }
        }
        int length = k.length() - 1;
        int a = dVar.mo70268a() + length + 1;
        dVar.mo70271d(a);
        boolean z = dVar.f41680h.f41688b - a > 0;
        if (dVar.mo70270c() || z) {
            if (length <= 249) {
                k.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                k.setCharAt(0, (char) ((length / NestedScrollView.ANIMATED_SCROLL_GAP) + 249));
                k.insert(1, (char) (length % NestedScrollView.ANIMATED_SCROLL_GAP));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        int length2 = k.length();
        for (int i2 = 0; i2 < length2; i2++) {
            int a2 = (((dVar.mo70268a() + 1) * 149) % 255) + 1 + k.charAt(i2);
            if (a2 > 255) {
                a2 -= 256;
            }
            dVar.mo70272e((char) a2);
        }
    }

    /* renamed from: b */
    public Set mo17095b() {
        return Collections.emptySet();
    }

    /* renamed from: g */
    public boolean mo7680g(Object obj, File file, File file2) {
        try {
            return !((Boolean) C19382n.m32724N0(Class.forName("dalvik.system.DexFile"), file.getPath())).booleanValue();
        } catch (ClassNotFoundException unused) {
            Log.e("SplitCompat", "Unexpected missing dalvik.system.DexFile.");
            return false;
        }
    }

    /* renamed from: n */
    public void mo20n(boolean z) {
        if (z) {
            String str = C13418j.f29381a;
            if (C13442y.m21140c()) {
                FeatureManager.m20098a(C0005b.f12j, FeatureManager.Feature.CrashReport);
                FeatureManager.m20098a(C15562d.f35022g, FeatureManager.Feature.ErrorReport);
                FeatureManager.m20098a(C0761x.f1559c, FeatureManager.Feature.AnrReport);
            }
        }
    }
}
