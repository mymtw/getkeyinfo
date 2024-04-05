package p114g4;

import android.view.View;
import androidx.core.view.C2325q;
import androidx.core.view.C2348w0;
import com.braze.p044ui.inappmessage.views.C5697c;
import com.braze.support.BrazeLogger;

/* renamed from: g4.c */
public final /* synthetic */ class C6863c implements C2325q {

    /* renamed from: b */
    public final /* synthetic */ View f15187b;

    public /* synthetic */ C6863c(View view) {
        this.f15187b = view;
    }

    /* renamed from: b */
    public final C2348w0 mo1389b(View view, C2348w0 w0Var) {
        C5697c cVar = (C5697c) this.f15187b;
        if (!cVar.hasAppliedWindowInsets()) {
            BrazeLogger.m11291m(C6869i.f15195o, "Calling applyWindowInsets on in-app message view.");
            cVar.applyWindowInsets(w0Var);
        } else {
            BrazeLogger.m11285g(C6869i.f15195o, "Not reapplying window insets to in-app message view.");
        }
        return w0Var;
    }
}
