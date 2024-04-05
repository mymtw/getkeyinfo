package androidx.compose.p015ui.node;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.common.collect.C16206p;
import java.util.Comparator;
import kotlin.jvm.internal.C19383o;
import p513bj.C14079t;

/* renamed from: androidx.compose.ui.node.f */
public final /* synthetic */ class C1739f implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ int f3907b;

    public /* synthetic */ C1739f(int i) {
        this.f3907b = i;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f3907b) {
            case 0:
                LayoutNode layoutNode = (LayoutNode) obj;
                LayoutNode layoutNode2 = (LayoutNode) obj2;
                float f = layoutNode.f3802F;
                float f2 = layoutNode2.f3802F;
                return (f > f2 ? 1 : (f == f2 ? 0 : -1)) == 0 ? C19383o.m32799i(layoutNode.f3838w, layoutNode2.f3838w) : Float.compare(f, f2);
            case 1:
                return C16206p.f36306a.mo57709b(((SlowMotionData.Segment) obj).startTimeMs, ((SlowMotionData.Segment) obj2).startTimeMs).mo57709b(((SlowMotionData.Segment) obj).endTimeMs, ((SlowMotionData.Segment) obj2).endTimeMs).mo57708a(((SlowMotionData.Segment) obj).speedDivisor, ((SlowMotionData.Segment) obj2).speedDivisor).mo57714g();
            case 2:
                return ((Format) obj2).bitrate - ((Format) obj).bitrate;
            default:
                return Float.compare(((C14079t.C14080a) obj).f31004c, ((C14079t.C14080a) obj2).f31004c);
        }
    }
}
