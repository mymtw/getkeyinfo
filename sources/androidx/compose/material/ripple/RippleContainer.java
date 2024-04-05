package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p568fn.C17782b;

public final class RippleContainer extends ViewGroup {
    private final int MaxRippleHosts = 5;
    private int nextHostIndex;
    private final C1241g rippleHostMap;
    private final List<RippleHostView> rippleHosts;
    private final List<RippleHostView> unusedRippleHosts;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RippleContainer(Context context) {
        super(context);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        ArrayList arrayList = new ArrayList();
        this.rippleHosts = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.unusedRippleHosts = arrayList2;
        this.rippleHostMap = new C1241g();
        setClipChildren(false);
        RippleHostView rippleHostView = new RippleHostView(context);
        addView(rippleHostView);
        arrayList.add(rippleHostView);
        arrayList2.add(rippleHostView);
        this.nextHostIndex = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void disposeRippleIfNeeded(C1235a aVar) {
        C19383o.m32797g(aVar, "<this>");
        aVar.f2582h.setValue(null);
        C1241g gVar = this.rippleHostMap;
        gVar.getClass();
        RippleHostView rippleHostView = (RippleHostView) gVar.f2596a.get(aVar);
        if (rippleHostView != null) {
            rippleHostView.disposeRipple();
            this.rippleHostMap.mo5334a(aVar);
            this.unusedRippleHosts.add(rippleHostView);
        }
    }

    public final RippleHostView getRippleHostView(C1235a aVar) {
        C19383o.m32797g(aVar, "<this>");
        C1241g gVar = this.rippleHostMap;
        gVar.getClass();
        RippleHostView rippleHostView = (RippleHostView) gVar.f2596a.get(aVar);
        if (rippleHostView != null) {
            return rippleHostView;
        }
        List<RippleHostView> list = this.unusedRippleHosts;
        C19383o.m32797g(list, "<this>");
        RippleHostView remove = list.isEmpty() ? null : list.remove(0);
        if (remove == null) {
            if (this.nextHostIndex > C17782b.m29859Y(this.rippleHosts)) {
                Context context = getContext();
                C19383o.m32796f(context, ResponseConstants.CONTEXT);
                remove = new RippleHostView(context);
                addView(remove);
                this.rippleHosts.add(remove);
            } else {
                remove = this.rippleHosts.get(this.nextHostIndex);
                C1241g gVar2 = this.rippleHostMap;
                gVar2.getClass();
                C19383o.m32797g(remove, "rippleHostView");
                C1235a aVar2 = (C1235a) gVar2.f2597b.get(remove);
                if (aVar2 != null) {
                    aVar2.f2582h.setValue(null);
                    this.rippleHostMap.mo5334a(aVar2);
                    remove.disposeRipple();
                }
            }
            int i = this.nextHostIndex;
            if (i < this.MaxRippleHosts - 1) {
                this.nextHostIndex = i + 1;
            } else {
                this.nextHostIndex = 0;
            }
        }
        C1241g gVar3 = this.rippleHostMap;
        gVar3.getClass();
        gVar3.f2596a.put(aVar, remove);
        gVar3.f2597b.put(remove, aVar);
        return remove;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
