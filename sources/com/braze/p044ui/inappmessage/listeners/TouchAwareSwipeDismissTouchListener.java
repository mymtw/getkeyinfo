package com.braze.p044ui.inappmessage.listeners;

import android.view.MotionEvent;
import android.view.View;
import com.braze.enums.inappmessage.DismissType;
import com.braze.p044ui.inappmessage.listeners.SwipeDismissTouchListener;
import kotlin.jvm.internal.C19383o;
import p114g4.C6869i;
import p114g4.C6873k;

/* renamed from: com.braze.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener */
public final class TouchAwareSwipeDismissTouchListener extends SwipeDismissTouchListener {
    private C5670a touchListener;

    /* renamed from: com.braze.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener$a */
    public interface C5670a {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TouchAwareSwipeDismissTouchListener(View view, Object obj, SwipeDismissTouchListener.C5669c cVar) {
        super(view, obj, cVar);
        C19383o.m32797g(view, "view");
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        C5670a aVar;
        C19383o.m32797g(view, "view");
        C19383o.m32797g(motionEvent, "motionEvent");
        int action = motionEvent.getAction();
        if (action == 0) {
            C5670a aVar2 = this.touchListener;
            if (aVar2 != null) {
                C6869i iVar = ((C6873k) aVar2).f15214a;
                iVar.f15196a.removeCallbacks(iVar.f15204i);
            }
        } else if ((action == 1 || action == 3) && (aVar = this.touchListener) != null) {
            C6873k kVar = (C6873k) aVar;
            if (kVar.f15214a.f15197b.mo15952E() == DismissType.AUTO_DISMISS) {
                kVar.f15214a.mo18995a();
            }
        }
        return super.onTouch(view, motionEvent);
    }

    public final void setTouchListener(C5670a aVar) {
        C19383o.m32797g(aVar, "newTouchListener");
        this.touchListener = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TouchAwareSwipeDismissTouchListener(View view, SwipeDismissTouchListener.C5669c cVar) {
        this(view, (Object) null, cVar);
        C19383o.m32797g(view, "view");
    }
}
