package p167l3;

import android.graphics.PointF;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import java.util.ArrayList;
import java.util.List;
import p149j3.C7100a;

/* renamed from: l3.g */
public final class C7241g {

    /* renamed from: a */
    public final ArrayList f16077a;

    /* renamed from: b */
    public PointF f16078b;

    /* renamed from: c */
    public boolean f16079c;

    public C7241g(PointF pointF, boolean z, List<C7100a> list) {
        this.f16078b = pointF;
        this.f16079c = z;
        this.f16077a = new ArrayList(list);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ShapeData{numCurves=");
        h.append(this.f16077a.size());
        h.append("closed=");
        return C0391c.m1058d(h, this.f16079c, '}');
    }

    public C7241g() {
        this.f16077a = new ArrayList();
    }
}
