package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C2282c;
import androidx.core.view.C2364y;

/* renamed from: androidx.appcompat.widget.n */
public final class C0335n {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static boolean m886a(DragEvent dragEvent, TextView textView, Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            C2364y.m5197l(textView, (Build.VERSION.SDK_INT >= 31 ? new C2282c.C2283a(clipData, 3) : new C2282c.C2285c(clipData, 3)).build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    /* renamed from: b */
    public static boolean m887b(DragEvent dragEvent, View view, Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        C2364y.m5197l(view, (Build.VERSION.SDK_INT >= 31 ? new C2282c.C2283a(clipData, 3) : new C2282c.C2285c(clipData, 3)).build());
        return true;
    }
}
