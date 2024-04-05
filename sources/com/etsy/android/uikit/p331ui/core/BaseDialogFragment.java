package com.etsy.android.uikit.p331ui.core;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.etsy.android.lib.util.C8914m;
import com.etsy.android.uikit.util.C11901e;
import p250u0.C8077a;
import p260v0.C8184a;
import p357gf.C12794c;
import p384kf.C12996a;
import p463v9.C13537b;
import p628nj.C18263b;

/* renamed from: com.etsy.android.uikit.ui.core.BaseDialogFragment */
public abstract class BaseDialogFragment extends DialogFragment implements C12794c {
    private static final float WINDOW_WIDTH_RATIO_LARGE_LANDSCAPE = 0.66f;
    private static final float WINDOW_WIDTH_RATIO_LARGE_PORTRAIT = 0.9f;
    private C12996a mBaseFragmentDelegate = new C12996a(this);

    /* renamed from: com.etsy.android.uikit.ui.core.BaseDialogFragment$a */
    public class C11883a extends Dialog {
        public C11883a(FragmentActivity fragmentActivity, int i) {
            super(fragmentActivity, i);
        }

        public final void setContentView(View view) {
            super.setContentView(view);
            getWindow().getAttributes().width = BaseDialogFragment.this.getDialogWidth();
        }
    }

    /* renamed from: com.etsy.android.uikit.ui.core.BaseDialogFragment$b */
    public class C11884b implements DialogInterface.OnKeyListener {
        public C11884b() {
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            return i == 4 && keyEvent.getAction() == 1 && BaseDialogFragment.this.handleBackPressed();
        }
    }

    public int getDialogWidth() {
        FragmentActivity activity = getActivity();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        if (C8914m.f19669c == 0.0f) {
            C8914m.m17348f(activity);
        }
        return (int) (((float) displayMetrics.widthPixels) * (displayMetrics.heightPixels < displayMetrics.widthPixels ? WINDOW_WIDTH_RATIO_LARGE_LANDSCAPE : 0.9f));
    }

    public C13537b getPostManager() {
        this.mBaseFragmentDelegate.getClass();
        return C18263b.f40057V.f29142h;
    }

    public void goBack() {
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    public boolean handleBackPressed() {
        this.mBaseFragmentDelegate.getClass();
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mBaseFragmentDelegate.mo45794a(bundle);
    }

    public View onCreateContentView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        C11883a aVar = new C11883a(getActivity(), getTheme());
        if (C8914m.m17345c(getActivity())) {
            aVar.getWindow().requestFeature(1);
            aVar.getWindow().clearFlags(2);
        }
        aVar.setOnKeyListener(new C11884b());
        aVar.setCanceledOnTouchOutside(false);
        aVar.getWindow().setSoftInputMode(16);
        return aVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.dialog_fragment_container, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.content_frame);
        View onCreateContentView = onCreateContentView(layoutInflater, viewGroup2, bundle);
        if (onCreateContentView != viewGroup2) {
            viewGroup2.addView(onCreateContentView);
        }
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        this.mBaseFragmentDelegate.getClass();
    }

    public void onDestroyView() {
        C11901e.m19622a(this.mBaseFragmentDelegate.f28614b.getView());
        super.onDestroyView();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            int i = C8077a.f17593c;
            activity.finishAfterTransition();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("HIDDEN", this.mBaseFragmentDelegate.f28614b.isHidden());
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.app_bar_toolbar);
        if (toolbar != null && (getActivity() instanceof AppCompatActivity)) {
            Context context = toolbar.getContext();
            Object obj = C8184a.f17966a;
            toolbar.setNavigationIcon(C8184a.C8187c.m16466b(context, R.drawable.clg_icon_core_close_v1));
            ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        }
    }
}
