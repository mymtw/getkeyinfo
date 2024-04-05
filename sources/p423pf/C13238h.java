package p423pf;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.vespa.VespaBottomSheetDialog;
import kotlin.jvm.internal.C19383o;
import p415of.C13171a;

/* renamed from: pf.h */
public final class C13238h extends C13171a<Object> {

    /* renamed from: d */
    public final /* synthetic */ VespaBottomSheetDialog f29081d;

    /* renamed from: e */
    public final /* synthetic */ C13236g f29082e;

    /* renamed from: f */
    public final /* synthetic */ View f29083f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13238h(Fragment fragment, VespaBottomSheetDialog vespaBottomSheetDialog, C13236g gVar, View view, C8703p pVar) {
        super(fragment, pVar);
        this.f29081d = vespaBottomSheetDialog;
        this.f29082e = gVar;
        this.f29083f = view;
    }

    /* renamed from: c */
    public final void mo31328c(Object obj) {
        this.f29081d.dismiss();
        C13236g gVar = this.f29082e;
        View view = this.f29083f;
        C19383o.m32795e(obj, "null cannot be cast to non-null type com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction");
        gVar.mo45936d(view, (ServerDrivenAction) obj);
    }
}
