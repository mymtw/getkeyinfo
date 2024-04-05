package com.etsy.android.uikit.util;

import android.content.Context;
import androidx.appcompat.app.AlertDialog;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.etsy.android.uikit.util.n */
public final class C11912n {

    /* renamed from: a */
    public final Context f26471a;

    /* renamed from: b */
    public AlertDialog f26472b;

    /* renamed from: c */
    public final ArrayList<C11913a> f26473c = new ArrayList<>();

    /* renamed from: com.etsy.android.uikit.util.n$a */
    public interface C11913a {
        /* renamed from: a */
        void mo38474a();
    }

    public C11912n(Context context) {
        this.f26471a = context;
    }

    /* renamed from: a */
    public final void mo38473a() {
        AlertDialog alertDialog = this.f26472b;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.f26472b.dismiss();
        }
        Iterator<C11913a> it = this.f26473c.iterator();
        while (it.hasNext()) {
            it.next().mo38474a();
        }
    }
}
