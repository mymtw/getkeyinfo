package p423pf;

import android.view.View;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.vespa.BaseActionableItem;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.lib.models.interfaces.IServerDrivenAction;
import com.etsy.android.vespa.PositionList;
import kotlin.jvm.internal.C19383o;
import p415of.C13171a;
import p415of.C13182k;

/* renamed from: pf.g */
public class C13236g extends C13171a<BaseActionableItem> {

    /* renamed from: d */
    public final C13182k f29080d;

    /* renamed from: pf.g$a */
    public static final class C13237a {
        /* renamed from: a */
        public static PositionList m20892a(View view) {
            C19383o.m32797g(view, "viewHolderRoot");
            PositionList positionList = new PositionList();
            if (view.getParent() instanceof RecyclerView) {
                ViewParent parent = view.getParent();
                C19383o.m32795e(parent, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                RecyclerView recyclerView = (RecyclerView) parent;
                positionList.setChildPosition(recyclerView.getChildAdapterPosition(view));
                View rootView = view.getRootView();
                ViewParent viewParent = recyclerView;
                while (!(viewParent.getParent() instanceof RecyclerView)) {
                    ViewParent parent2 = viewParent.getParent();
                    

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C13236g(Fragment fragment, C8703p pVar, C13182k kVar) {
                        super(fragment, pVar);
                        C19383o.m32797g(pVar, "viewTracker");
                        this.f29080d = kVar;
                    }

                    /* renamed from: c */
                    public final /* bridge */ /* synthetic */ void mo31328c(Object obj) {
                        BaseActionableItem baseActionableItem = (BaseActionableItem) obj;
                    }

                    /* renamed from: d */
                    public final void mo45936d(View view, IServerDrivenAction iServerDrivenAction) {
                        C19383o.m32797g(view, "viewHolderRoot");
                        C19383o.m32797g(iServerDrivenAction, ResponseConstants.ACTION);
                        C13182k kVar = this.f29080d;
                        if (kVar != null) {
                            kVar.performAction(C13237a.m20892a(view), iServerDrivenAction);
                        }
                    }

                    /* renamed from: e */
                    public final void mo45937e(View view, ServerDrivenAction serverDrivenAction, int i) {
                        C13182k kVar = this.f29080d;
                        if (kVar != null) {
                            kVar.performActionWithToast(C13237a.m20892a(view), serverDrivenAction, i);
                        }
                    }
                }
