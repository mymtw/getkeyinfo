package p468ve;

import android.view.View;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.apiv3.Button;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.p327ui.cardview.clickhandlers.C9144y;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p356ge.C12790b;
import p363he.C12821d;
import p628nj.C18263b;

/* renamed from: ve.b */
public final /* synthetic */ class C13785b implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ Button f30318b;

    /* renamed from: c */
    public final /* synthetic */ C13786c f30319c;

    /* renamed from: d */
    public final /* synthetic */ View f30320d;

    /* renamed from: e */
    public final /* synthetic */ String f30321e;

    public /* synthetic */ C13785b(Button button, C13786c cVar, View view, String str) {
        this.f30318b = button;
        this.f30319c = cVar;
        this.f30320d = view;
        this.f30321e = str;
    }

    public final void onClick(View view) {
        Button button = this.f30318b;
        C13786c cVar = this.f30319c;
        View view2 = this.f30320d;
        String str = this.f30321e;
        C19383o.m32797g(button, "$buttonModel");
        C19383o.m32797g(cVar, "this$0");
        C19383o.m32797g(view2, "$this_addButtons");
        C19383o.m32797g(str, "$analyticsName");
        if (button.getAction() != null) {
            C9144y yVar = cVar.f30325e;
            View rootView = view2.getRootView();
            C19383o.m32796f(rootView, "rootView");
            ServerDrivenAction action = button.getAction();
            C19383o.m32794d(action);
            yVar.f20088e.mo45936d(rootView, action);
        } else if (C18263b.m30839d0(button.getLink())) {
            C9144y yVar2 = cVar.f30325e;
            String link = button.getLink();
            C19383o.m32794d(link);
            yVar2.getClass();
            if (str.length() > 0) {
                C8703p pVar = yVar2.f20087d;
                pVar.mo21333d(str + "_clicked", (Map<? extends AnalyticsProperty, Object>) null);
            }
            C12790b.m20430b(yVar2.mo45889a(), new C12821d(link));
        }
    }
}
