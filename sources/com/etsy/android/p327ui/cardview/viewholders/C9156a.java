package com.etsy.android.p327ui.cardview.viewholders;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.vespa.BaseActionableItem;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import com.etsy.android.vespa.VespaBottomSheetDialog;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p423pf.C13236g;
import p423pf.C13238h;

/* renamed from: com.etsy.android.ui.cardview.viewholders.a */
public final class C9156a extends TrackingOnClickListener {

    /* renamed from: b */
    public final /* synthetic */ BaseActionableItem f20140b;

    /* renamed from: c */
    public final /* synthetic */ C9159b f20141c;

    public C9156a(C9159b bVar, BaseActionableItem baseActionableItem) {
        this.f20141c = bVar;
        this.f20140b = baseActionableItem;
    }

    public final void onViewClick(View view) {
        C9159b bVar = this.f20141c;
        C13236g gVar = bVar.f20144c;
        View view2 = bVar.itemView;
        List<ServerDrivenAction> actions = this.f20140b.getActions();
        gVar.getClass();
        C19383o.m32797g(view2, "viewHolderRoot");
        C19383o.m32797g(actions, ResponseConstants.ACTIONS);
        Fragment a = gVar.mo45889a();
        if (a != null) {
            VespaBottomSheetDialog vespaBottomSheetDialog = new VespaBottomSheetDialog(a, gVar.f28980b);
            vespaBottomSheetDialog.addItems(actions);
            vespaBottomSheetDialog.registerItemClickHandler(actions.get(0).getViewType(), new C13238h(a, vespaBottomSheetDialog, gVar, view2, gVar.f28980b));
            vespaBottomSheetDialog.show();
        }
    }
}
