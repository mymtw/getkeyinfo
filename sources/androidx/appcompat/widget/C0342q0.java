package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.emoji2.text.C2684j;
import com.etsy.android.R;
import com.etsy.android.p327ui.common.listingreview.redesign.ListingReviewViewRedesign;
import com.etsy.android.stylekit.views.CollagePlayerView;
import com.etsy.android.uikit.view.draggable.C11943b;
import com.etsy.android.uikit.view.draggable.DragEventHandler;
import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.exoplayer2.p526ui.DefaultTimeBar;
import com.google.android.exoplayer2.p526ui.PlayerControlView;
import java.util.Iterator;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p726zi.C18917l;

/* renamed from: androidx.appcompat.widget.q0 */
public final /* synthetic */ class C0342q0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f878b;

    /* renamed from: c */
    public final /* synthetic */ Object f879c;

    public /* synthetic */ C0342q0(Object obj, int i) {
        this.f878b = i;
        this.f879c = obj;
    }

    public final void run() {
        switch (this.f878b) {
            case 0:
                ((Toolbar) this.f879c).invalidateMenu();
                return;
            case 1:
                ((C2684j.C2686b) this.f879c).mo10084c();
                return;
            case 2:
                ((View) this.f879c).requestFocus();
                return;
            case 3:
                ListingReviewViewRedesign.m34932showBuyerVideosAlert$lambda2$lambda1((ListingReviewViewRedesign) this.f879c);
                return;
            case 4:
                DragEventHandler dragEventHandler = (DragEventHandler) this.f879c;
                C19383o.m32797g(dragEventHandler, "this$0");
                ImageView imageView = dragEventHandler.f26510g;
                if (imageView != null) {
                    dragEventHandler.f26504a.removeView(imageView);
                    C19394m mVar = C19394m.f43287a;
                }
                dragEventHandler.f26510g = null;
                dragEventHandler.f26507d = 0.0f;
                View view = dragEventHandler.f26505b;
                if (view instanceof PhotoView) {
                    ((PhotoView) view).setScale(1.0f, false);
                } else if (view instanceof CollagePlayerView) {
                    ((CollagePlayerView) view).resume();
                }
                dragEventHandler.f26505b.setVisibility(0);
                C11943b.C11947d dVar = C11943b.C11947d.f26549a;
                C19383o.m32797g(dVar, "<set-?>");
                dragEventHandler.f26508e = dVar;
                return;
            case 5:
                ((PlayerControlView) this.f879c).updateProgress();
                return;
            default:
                C18917l lVar = (C18917l) this.f879c;
                ViewGroup viewGroup = lVar.f42144e;
                if (viewGroup != null) {
                    viewGroup.setVisibility(lVar.f42137A ? 0 : 4);
                }
                View view2 = lVar.f42149j;
                if (view2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                    int dimensionPixelSize = lVar.f42140a.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
                    if (lVar.f42137A) {
                        dimensionPixelSize = 0;
                    }
                    marginLayoutParams.bottomMargin = dimensionPixelSize;
                    lVar.f42149j.setLayoutParams(marginLayoutParams);
                    View view3 = lVar.f42149j;
                    if (view3 instanceof DefaultTimeBar) {
                        DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view3;
                        if (lVar.f42137A) {
                            defaultTimeBar.hideScrubber(true);
                        } else {
                            int i = lVar.f42165z;
                            if (i == 1) {
                                defaultTimeBar.hideScrubber(false);
                            } else if (i != 3) {
                                defaultTimeBar.showScrubber();
                            }
                        }
                    }
                }
                Iterator it = lVar.f42164y.iterator();
                while (it.hasNext()) {
                    View view4 = (View) it.next();
                    view4.setVisibility((!lVar.f42137A || !C18917l.m32014j(view4)) ? 0 : 4);
                }
                return;
        }
    }
}
