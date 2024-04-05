package androidx.navigation;

import android.support.p013v4.media.C0069a;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import java.util.Iterator;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2 extends Lambda implements C19846a<C2953d> {
    public final /* synthetic */ int $navGraphId;
    public final /* synthetic */ Fragment $this_navGraphViewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(Fragment fragment, int i) {
        super(0);
        this.$this_navGraphViewModels = fragment;
        this.$navGraphId = i;
    }

    public final C2953d invoke() {
        C2953d dVar;
        Fragment fragment = this.$this_navGraphViewModels;
        C19383o.m32798h(fragment, "$this$findNavController");
        NavController findNavController = NavHostFragment.findNavController(fragment);
        C19383o.m32793c(findNavController, "NavHostFragment.findNavController(this)");
        int i = this.$navGraphId;
        Iterator descendingIterator = findNavController.f6670h.descendingIterator();
        while (true) {
            if (!descendingIterator.hasNext()) {
                dVar = null;
                break;
            }
            dVar = (C2953d) descendingIterator.next();
            if (dVar.f6689c.f6728d == i) {
                break;
            }
        }
        if (dVar != null) {
            return dVar;
        }
        StringBuilder h = C0069a.m177h("No destination with ID ", i, " is on the NavController's back stack. The current destination is ");
        h.append(findNavController.mo10943c());
        throw new IllegalArgumentException(h.toString());
    }
}
