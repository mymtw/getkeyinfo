package com.etsy.android.qualtrics;

import android.app.AlertDialog;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C2857f;
import androidx.lifecycle.C2887s;
import com.etsy.android.R;
import kotlin.jvm.internal.C19383o;

public final class BOEQualtricsPromptDisplay$Companion$showPrompt$1 implements C2857f {

    /* renamed from: b */
    public boolean f19739b = true;

    /* renamed from: c */
    public final /* synthetic */ FragmentActivity f19740c;

    /* renamed from: d */
    public final /* synthetic */ C8949a f19741d;

    /* renamed from: e */
    public final /* synthetic */ String f19742e;

    public BOEQualtricsPromptDisplay$Companion$showPrompt$1(FragmentActivity fragmentActivity, C8949a aVar, String str) {
        this.f19740c = fragmentActivity;
        this.f19741d = aVar;
        this.f19742e = str;
    }

    public final void onPause(C2887s sVar) {
        this.f19740c.getLifecycle().mo10735c(this);
    }

    public final void onResume(C2887s sVar) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f19740c);
        View inflate = View.inflate(this.f19740c, R.layout.qualtrics_bottom_sheet, (ViewGroup) null);
        C19383o.m32796f(inflate, "inflate(fragmentActivity…trics_bottom_sheet, null)");
        builder.setView(inflate);
        AlertDialog create = builder.create();
        C19383o.m32796f(create, "alertDialogBuilder.create()");
        ((Button) inflate.findViewById(R.id.updated_qualtrics_action_button)).setOnClickListener(new C8947x819496f0(this.f19741d, this.f19742e, this.f19740c, this, create));
        ((ImageButton) inflate.findViewById(R.id.updated_qualtrics_action_dismiss)).setOnClickListener(new C8948x819496f1(create));
        if (this.f19739b) {
            create.show();
        }
    }
}
