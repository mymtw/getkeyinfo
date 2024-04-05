package androidx.compose.p015ui.node;

import androidx.compose.p015ui.graphics.C1520f0;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.graphics.C1537o;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.C19394m;
import p174m0.C7282b;
import p288y.C8342b;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.node.o */
public interface C1749o {
    void destroy();

    void drawLayer(C1537o oVar);

    void invalidate();

    /* renamed from: isInLayer-k-4lQ0M  reason: not valid java name */
    boolean m34777isInLayerk4lQ0M(long j);

    void mapBounds(C8342b bVar, boolean z);

    /* renamed from: mapOffset-8S9VItk  reason: not valid java name */
    long m34778mapOffset8S9VItk(long j, boolean z);

    /* renamed from: move--gyyYBs  reason: not valid java name */
    void m34779movegyyYBs(long j);

    /* renamed from: resize-ozmzZPI  reason: not valid java name */
    void m34780resizeozmzZPI(long j);

    void reuseLayer(C19857l<? super C1537o, C19394m> lVar, C19846a<C19394m> aVar);

    void updateDisplayList();

    /* renamed from: updateLayerProperties-NHXXZp8  reason: not valid java name */
    void m34781updateLayerPropertiesNHXXZp8(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, C1530k0 k0Var, boolean z, C1520f0 f0Var, long j2, long j3, LayoutDirection layoutDirection, C7282b bVar);
}
