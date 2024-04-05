package androidx.appcompat.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController;

/* renamed from: androidx.appcompat.app.b */
public final class C0152b extends ArrayAdapter<CharSequence> {

    /* renamed from: b */
    public final /* synthetic */ AlertController.RecycleListView f379b;

    /* renamed from: c */
    public final /* synthetic */ AlertController.C0130b f380c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0152b(AlertController.C0130b bVar, Context context, int i, CharSequence[] charSequenceArr, AlertController.RecycleListView recycleListView) {
        super(context, i, 16908308, charSequenceArr);
        this.f380c = bVar;
        this.f379b = recycleListView;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.f380c.f280v;
        if (zArr != null && zArr[i]) {
            this.f379b.setItemChecked(i, true);
        }
        return view2;
    }
}
