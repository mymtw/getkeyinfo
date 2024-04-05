package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* renamed from: androidx.appcompat.app.d */
public final class C0154d implements AdapterView.OnItemClickListener {

    /* renamed from: b */
    public final /* synthetic */ AlertController.RecycleListView f383b;

    /* renamed from: c */
    public final /* synthetic */ AlertController f384c;

    /* renamed from: d */
    public final /* synthetic */ AlertController.C0130b f385d;

    public C0154d(AlertController.C0130b bVar, AlertController.RecycleListView recycleListView, AlertController alertController) {
        this.f385d = bVar;
        this.f383b = recycleListView;
        this.f384c = alertController;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        boolean[] zArr = this.f385d.f280v;
        if (zArr != null) {
            zArr[i] = this.f383b.isItemChecked(i);
        }
        this.f385d.f284z.onClick(this.f384c.f233b, i, this.f383b.isItemChecked(i));
    }
}
