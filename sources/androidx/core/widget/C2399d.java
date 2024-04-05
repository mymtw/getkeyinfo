package androidx.core.widget;

import android.view.View;
import android.widget.ImageView;
import androidx.core.view.C2290c1;
import androidx.core.view.C2364y;
import com.etsy.android.p327ui.conversation.details.C9477c;
import com.etsy.android.p327ui.favorites.CollectionTitleView;
import com.etsy.android.p327ui.listing.p329ui.buyitnow.NativeBuyItNowCheckoutContainerFragment;
import com.etsy.android.uikit.zoom.C12032d;
import com.etsy.android.uikit.zoom.C12033e;
import com.etsy.android.uikit.zoom.ZoomEventHandler;
import com.google.android.exoplayer2.drm.C14216b;
import com.google.android.exoplayer2.drm.DefaultDrmSession;
import com.google.android.exoplayer2.p526ui.DefaultTimeBar;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.paypal.pyplcheckout.home.view.customviews.PayPalTopBannerView;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C19766p0;
import p753kq.C19846a;

/* renamed from: androidx.core.widget.d */
public final /* synthetic */ class C2399d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f5681b;

    /* renamed from: c */
    public final /* synthetic */ Object f5682c;

    public /* synthetic */ C2399d(Object obj, int i) {
        this.f5681b = i;
        this.f5682c = obj;
    }

    public final void run() {
        C2290c1 h;
        switch (this.f5681b) {
            case 0:
                ((ContentLoadingProgressBar) this.f5682c).lambda$new$0();
                return;
            case 1:
                C19846a aVar = (C19846a) this.f5682c;
                C19383o.m32797g(aVar, "$tmp0");
                aVar.invoke();
                return;
            case 2:
                CollectionTitleView.m34969setInformation$lambda2((CollectionTitleView) this.f5682c);
                return;
            case 3:
                NativeBuyItNowCheckoutContainerFragment.m35011onViewCreated$lambda3((NativeBuyItNowCheckoutContainerFragment) this.f5682c);
                return;
            case 4:
                ZoomEventHandler zoomEventHandler = (ZoomEventHandler) this.f5682c;
                C19383o.m32797g(zoomEventHandler, "this$0");
                View view = (View) zoomEventHandler.f26817h.getValue();
                if (view != null) {
                    zoomEventHandler.f26810a.removeView(view);
                    C19394m mVar = C19394m.f43287a;
                }
                ImageView imageView = zoomEventHandler.f26814e;
                if (imageView != null) {
                    zoomEventHandler.f26810a.removeView(imageView);
                    C19394m mVar2 = C19394m.f43287a;
                }
                zoomEventHandler.f26814e = null;
                zoomEventHandler.f26811b.setVisibility(0);
                View view2 = zoomEventHandler.f26811b;
                C19383o.m32797g(view2, "<this>");
                view2.setPivotX(view2.getX() + ((float) (view2.getWidth() / 2)));
                view2.setPivotY(view2.getY() + ((float) (view2.getHeight() / 2)));
                zoomEventHandler.f26816g = C12033e.C12035b.f26826a;
                if (zoomEventHandler.f26812c.f26823b && (h = C2364y.m5193h(zoomEventHandler.f26810a)) != null) {
                    h.f5551a.mo8887c();
                }
                C12032d dVar = zoomEventHandler.f26813d;
                if (dVar != null) {
                    dVar.mo32488b(zoomEventHandler.f26811b);
                    return;
                }
                return;
            case 5:
                ((C9477c) this.f5682c).mo31972d();
                return;
            case 6:
                ((DefaultDrmSession) this.f5682c).mo47274b((C14216b.C14217a) null);
                return;
            case 7:
                ((DefaultTimeBar) this.f5682c).lambda$new$0();
                return;
            case 8:
                ((SphericalGLSurfaceView) this.f5682c).lambda$onDetachedFromWindow$0();
                return;
            case 9:
                PayPalTopBannerView.m35376releaseAnchors$lambda5((PayPalTopBannerView) this.f5682c);
                return;
            default:
                C19766p0 p0Var = (C19766p0) ((Ref$ObjectRef) this.f5682c).element;
                if (p0Var != null) {
                    p0Var.dispose();
                    return;
                }
                return;
        }
    }
}
