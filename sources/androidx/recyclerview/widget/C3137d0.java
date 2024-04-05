package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C2273a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import p088e1.C6689b;
import p088e1.C6693c;

/* renamed from: androidx.recyclerview.widget.d0 */
public class C3137d0 extends C2273a {

    /* renamed from: a */
    public final RecyclerView f7210a;

    /* renamed from: b */
    public final C3138a f7211b;

    /* renamed from: androidx.recyclerview.widget.d0$a */
    public static class C3138a extends C2273a {

        /* renamed from: a */
        public final C3137d0 f7212a;

        /* renamed from: b */
        public WeakHashMap f7213b = new WeakHashMap();

        public C3138a(C3137d0 d0Var) {
            this.f7212a = d0Var;
        }

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C2273a aVar = (C2273a) this.f7213b.get(view);
            return aVar != null ? aVar.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public final C6693c getAccessibilityNodeProvider(View view) {
            C2273a aVar = (C2273a) this.f7213b.get(view);
            return aVar != null ? aVar.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C2273a aVar = (C2273a) this.f7213b.get(view);
            if (aVar != null) {
                aVar.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
            if (this.f7212a.f7210a.hasPendingAdapterUpdates() || this.f7212a.f7210a.getLayoutManager() == null) {
                super.onInitializeAccessibilityNodeInfo(view, bVar);
                return;
            }
            this.f7212a.f7210a.getLayoutManager().mo11660a0(view, bVar);
            C2273a aVar = (C2273a) this.f7213b.get(view);
            if (aVar != null) {
                aVar.onInitializeAccessibilityNodeInfo(view, bVar);
            } else {
                super.onInitializeAccessibilityNodeInfo(view, bVar);
            }
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C2273a aVar = (C2273a) this.f7213b.get(view);
            if (aVar != null) {
                aVar.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C2273a aVar = (C2273a) this.f7213b.get(viewGroup);
            return aVar != null ? aVar.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (this.f7212a.f7210a.hasPendingAdapterUpdates() || this.f7212a.f7210a.getLayoutManager() == null) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            C2273a aVar = (C2273a) this.f7213b.get(view);
            if (aVar != null) {
                if (aVar.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            RecyclerView.C3111u uVar = this.f7212a.f7210a.getLayoutManager().f7072b.mRecycler;
            return false;
        }

        public final void sendAccessibilityEvent(View view, int i) {
            C2273a aVar = (C2273a) this.f7213b.get(view);
            if (aVar != null) {
                aVar.sendAccessibilityEvent(view, i);
            } else {
                super.sendAccessibilityEvent(view, i);
            }
        }

        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            C2273a aVar = (C2273a) this.f7213b.get(view);
            if (aVar != null) {
                aVar.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public C3137d0(RecyclerView recyclerView) {
        this.f7210a = recyclerView;
        C2273a a = mo11207a();
        if (a == null || !(a instanceof C3138a)) {
            this.f7211b = new C3138a(this);
        } else {
            this.f7211b = (C3138a) a;
        }
    }

    /* renamed from: a */
    public C2273a mo11207a() {
        return this.f7211b;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.f7210a.hasPendingAdapterUpdates()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo11288Y(accessibilityEvent);
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
        super.onInitializeAccessibilityNodeInfo(view, bVar);
        if (!this.f7210a.hasPendingAdapterUpdates() && this.f7210a.getLayoutManager() != null) {
            RecyclerView.C3100o layoutManager = this.f7210a.getLayoutManager();
            RecyclerView recyclerView = layoutManager.f7072b;
            layoutManager.mo11659Z(recyclerView.mRecycler, recyclerView.mState, bVar);
        }
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (this.f7210a.hasPendingAdapterUpdates() || this.f7210a.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.C3100o layoutManager = this.f7210a.getLayoutManager();
        RecyclerView recyclerView = layoutManager.f7072b;
        return layoutManager.mo11665m0(recyclerView.mRecycler, recyclerView.mState, i, bundle);
    }
}
