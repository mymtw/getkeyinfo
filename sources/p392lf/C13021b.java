package p392lf;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: lf.b */
public final class C13021b extends AlertDialog.C0133a {

    /* renamed from: c */
    public final String f28674c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13021b(Context context, String str) {
        super(context);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "message");
        this.f28674c = str;
    }

    public final AlertDialog create() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.loading_dialog, (ViewGroup) null, false);
        ((TextView) inflate.findViewById(R.id.loading_dialog_message)).setText(this.f28674c);
        setView(inflate);
        this.f286a.f271m = false;
        AlertDialog create = super.create();
        C19383o.m32796f(create, "super.create()");
        return create;
    }
}
