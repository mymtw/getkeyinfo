package androidx.compose.p015ui.node;

import androidx.compose.p015ui.focus.C1469d;
import androidx.compose.p015ui.graphics.C1537o;
import androidx.compose.p015ui.input.pointer.C1642n;
import androidx.compose.p015ui.platform.C1822c1;
import androidx.compose.p015ui.platform.C1827e0;
import androidx.compose.p015ui.platform.C1835h;
import androidx.compose.p015ui.platform.C1843j1;
import androidx.compose.p015ui.platform.C1863p1;
import androidx.compose.p015ui.text.font.C1950f;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.text.input.C2002t;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.C19394m;
import p020b0.C3449a;
import p031c0.C4351b;
import p174m0.C7282b;
import p279x.C8278b;
import p279x.C8282f;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.node.p */
public interface C1750p {

    /* renamed from: androidx.compose.ui.node.p$a */
    public interface C1751a {
        /* renamed from: h */
        void mo6757h();
    }

    /* renamed from: calculateLocalPosition-MK-Hz9U  reason: not valid java name */
    long m34782calculateLocalPositionMKHz9U(long j);

    /* renamed from: calculatePositionInWindow-MK-Hz9U  reason: not valid java name */
    long m34783calculatePositionInWindowMKHz9U(long j);

    C1749o createLayer(C19857l<? super C1537o, C19394m> lVar, C19846a<C19394m> aVar);

    void forceMeasureTheSubtree(LayoutNode layoutNode);

    C1835h getAccessibilityManager();

    C8278b getAutofill();

    C8282f getAutofillTree();

    C1827e0 getClipboardManager();

    C7282b getDensity();

    C1469d getFocusManager();

    C1952g.C1953a getFontFamilyResolver();

    C1950f.C1951a getFontLoader();

    C3449a getHapticFeedBack();

    C4351b getInputModeManager();

    LayoutDirection getLayoutDirection();

    C1642n getPointerIconService();

    C1741h getSharedDrawScope();

    boolean getShowLayoutBounds();

    OwnerSnapshotObserver getSnapshotObserver();

    C2002t getTextInputService();

    C1822c1 getTextToolbar();

    C1843j1 getViewConfiguration();

    C1863p1 getWindowInfo();

    void measureAndLayout(boolean z);

    /* renamed from: measureAndLayout-0kLqBqw  reason: not valid java name */
    void m34784measureAndLayout0kLqBqw(LayoutNode layoutNode, long j);

    void onAttach(LayoutNode layoutNode);

    void onDetach(LayoutNode layoutNode);

    void onEndApplyChanges();

    void onLayoutChange(LayoutNode layoutNode);

    void onRequestMeasure(LayoutNode layoutNode, boolean z);

    void onRequestRelayout(LayoutNode layoutNode, boolean z);

    void onSemanticsChange();

    void registerOnEndApplyChangesListener(C19846a<C19394m> aVar);

    void registerOnLayoutCompletedListener(C1751a aVar);

    boolean requestFocus();

    void setShowLayoutBounds(boolean z);
}
