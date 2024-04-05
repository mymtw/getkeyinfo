package androidx.compose.animation;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.animation.g */
public final class C0471g {

    /* renamed from: a */
    public final C0473i f1211a;

    /* renamed from: b */
    public final C0475k f1212b;

    /* renamed from: c */
    public final ParcelableSnapshotMutableState f1213c = C0761x.m1751w0(Float.valueOf(0.0f), C1351n1.f2948a);

    /* renamed from: d */
    public C0484s f1214d;

    public C0471g(C0474j jVar, C0476l lVar) {
        AnimatedContentKt$SizeTransform$1 animatedContentKt$SizeTransform$1 = AnimatedContentKt$SizeTransform$1.INSTANCE;
        C19383o.m32797g(animatedContentKt$SizeTransform$1, "sizeAnimationSpec");
        C0485t tVar = new C0485t(true, animatedContentKt$SizeTransform$1);
        this.f1211a = jVar;
        this.f1212b = lVar;
        this.f1214d = tVar;
    }
}
