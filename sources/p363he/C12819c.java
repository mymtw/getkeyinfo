package p363he;

import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.etsy.android.p327ui.dialog.EtsyDialogFragment;

/* renamed from: he.c */
public interface C12819c extends C12822e {

    /* renamed from: he.c$a */
    public static final class C12820a {
        /* renamed from: a */
        public static EtsyDialogFragment m20462a(C12819c cVar) {
            EtsyDialogFragment newInstance = EtsyDialogFragment.newInstance(cVar.mo45602h());
            newInstance.setTitle(cVar.getTitle());
            String c = cVar.mo45595c();
            cVar.mo45597e();
            newInstance.setOkButton(c, (View.OnClickListener) null, true);
            newInstance.setOnDismissListener(cVar.mo45598f());
            newInstance.setCancelable(false);
            newInstance.setArguments(cVar.getNavigationParams().mo45608a());
            return newInstance;
        }

        /* renamed from: b */
        public static C12824f m20463b(C12819c cVar) {
            C12824f fVar = new C12824f();
            cVar.mo45603i();
            fVar.f28304a.put("USE_DIM", Boolean.FALSE);
            fVar.f28304a.put("new_sign_in_flow", Boolean.valueOf(cVar.mo45604j()));
            return fVar;
        }
    }

    /* renamed from: c */
    String mo45595c();

    /* renamed from: d */
    String mo45596d();

    /* renamed from: e */
    void mo45597e();

    /* renamed from: f */
    DialogInterface.OnDismissListener mo45598f();

    /* renamed from: g */
    EtsyDialogFragment mo45599g();

    C12824f getNavigationParams();

    String getTitle();

    /* renamed from: h */
    Fragment mo45602h();

    /* renamed from: i */
    void mo45603i();

    /* renamed from: j */
    boolean mo45604j();
}
