package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* renamed from: androidx.appcompat.app.c */
public final class C0153c implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ AlertController f381b;

    /* renamed from: c */
    public final /* synthetic */ AlertController.C0130b f382c;

    public C0153c(AlertController.C0130b bVar, AlertController alertController) {
        this.f382c = bVar;
        this.f381b = alertController;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f382c.f277s.onClick(this.f381b.f233b, i);
        if (!this.f382c.f282x) {
            this.f381b.f233b.dismiss();
        }
    }
}
