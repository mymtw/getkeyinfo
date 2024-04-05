package p558el;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.C2273a;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import p088e1.C6689b;

/* renamed from: el.f */
public final class C17719f extends C2273a {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f38523a;

    public C17719f(BaseTransientBottomBar baseTransientBottomBar) {
        this.f38523a = baseTransientBottomBar;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
        super.onInitializeAccessibilityNodeInfo(view, bVar);
        bVar.mo18850a(1048576);
        bVar.f14759a.setDismissable(true);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i != 1048576) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        this.f38523a.mo54733a();
        return true;
    }
}
