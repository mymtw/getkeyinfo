package androidx.cursoradapter.widget;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: androidx.cursoradapter.widget.a */
public final class C2411a extends Filter {

    /* renamed from: a */
    public C2412a f5691a;

    /* renamed from: androidx.cursoradapter.widget.a$a */
    public interface C2412a {
        void changeCursor(Cursor cursor);

        CharSequence convertToString(Cursor cursor);

        Cursor getCursor();

        Cursor runQueryOnBackgroundThread(CharSequence charSequence);
    }

    public C2411a(C2412a aVar) {
        this.f5691a = aVar;
    }

    public final CharSequence convertResultToString(Object obj) {
        return this.f5691a.convertToString((Cursor) obj);
    }

    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor runQueryOnBackgroundThread = this.f5691a.runQueryOnBackgroundThread(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (runQueryOnBackgroundThread != null) {
            filterResults.count = runQueryOnBackgroundThread.getCount();
            filterResults.values = runQueryOnBackgroundThread;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor cursor = this.f5691a.getCursor();
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            this.f5691a.changeCursor((Cursor) obj);
        }
    }
}
