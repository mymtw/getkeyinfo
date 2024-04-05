package androidx.compose.p015ui.platform;

import android.view.ActionMode;
import android.view.View;
import androidx.compose.p015ui.platform.actionmodecallback.FloatingTextActionModeCallback;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p110g0.C6828a;
import p288y.C8345d;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.platform.AndroidTextToolbar */
public final class AndroidTextToolbar implements C1822c1 {

    /* renamed from: a */
    public final View f3995a;

    /* renamed from: b */
    public ActionMode f3996b;

    /* renamed from: c */
    public final C6828a f3997c = new C6828a(new AndroidTextToolbar$textActionModeCallback$1(this));

    /* renamed from: d */
    public TextToolbarStatus f3998d = TextToolbarStatus.Hidden;

    public AndroidTextToolbar(View view) {
        C19383o.m32797g(view, "view");
        this.f3995a = view;
    }

    /* renamed from: a */
    public final void mo7105a(C8345d dVar, C19846a<C19394m> aVar, C19846a<C19394m> aVar2, C19846a<C19394m> aVar3, C19846a<C19394m> aVar4) {
        C6828a aVar5 = this.f3997c;
        aVar5.getClass();
        aVar5.f15029b = dVar;
        C6828a aVar6 = this.f3997c;
        aVar6.f15030c = aVar;
        aVar6.f15032e = aVar3;
        aVar6.f15031d = aVar2;
        aVar6.f15033f = aVar4;
        ActionMode actionMode = this.f3996b;
        if (actionMode == null) {
            this.f3998d = TextToolbarStatus.Shown;
            this.f3996b = C1825d1.f4086a.mo7204b(this.f3995a, new FloatingTextActionModeCallback(this.f3997c), 1);
            return;
        }
        actionMode.invalidate();
    }

    /* renamed from: b */
    public final void mo7106b() {
        this.f3998d = TextToolbarStatus.Hidden;
        ActionMode actionMode = this.f3996b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f3996b = null;
    }

    public final TextToolbarStatus getStatus() {
        return this.f3998d;
    }
}
