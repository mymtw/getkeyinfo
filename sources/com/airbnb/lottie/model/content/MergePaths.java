package com.airbnb.lottie.model.content;

import android.support.p013v4.media.C0072d;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.C4845a;
import p113g3.C6841b;
import p113g3.C6850k;
import p167l3.C7236b;
import p206p3.C7656b;

public final class MergePaths implements C7236b {

    /* renamed from: a */
    public final MergePathsMode f10920a;

    /* renamed from: b */
    public final boolean f10921b;

    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static MergePathsMode forId(int i) {
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z) {
        this.f10920a = mergePathsMode;
        this.f10921b = z;
    }

    /* renamed from: a */
    public final C6841b mo14595a(LottieDrawable lottieDrawable, C4845a aVar) {
        if (lottieDrawable.enableMergePathsForKitKatAndAbove()) {
            return new C6850k(this);
        }
        C7656b.m14695b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("MergePaths{mode=");
        h.append(this.f10920a);
        h.append('}');
        return h.toString();
    }
}
