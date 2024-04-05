package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.support.p013v4.media.C0072d;
import android.view.View;
import com.etsy.android.lib.conversation.MessageDraft;
import p003a2.C0015b;

/* renamed from: androidx.constraintlayout.motion.widget.a */
public final class C2114a {
    /* renamed from: a */
    public static String m4565a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder h = C0072d.m201h(".(");
        h.append(stackTraceElement.getFileName());
        h.append(MessageDraft.IMAGE_DELIMITER);
        h.append(stackTraceElement.getLineNumber());
        h.append(")");
        return h.toString();
    }

    /* renamed from: b */
    public static String m4566b(Context context, int i) {
        if (i == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return C0015b.m88g("?", i);
        }
    }

    /* renamed from: c */
    public static String m4567c(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    /* renamed from: d */
    public static String m4568d(MotionLayout motionLayout, int i) {
        return i == -1 ? "UNDEFINED" : motionLayout.getContext().getResources().getResourceEntryName(i);
    }
}
