package com.etsy.android.uikit.p331ui.core;

import android.os.Bundle;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.R;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.logger.perf.C8709f;

/* renamed from: com.etsy.android.uikit.ui.core.TextDialogFragment */
public class TextDialogFragment extends TrackingBaseDialogFragment {
    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        if (!getArguments().containsKey("text")) {
            RuntimeException runtimeException = new RuntimeException("No text to show in dialog");
            if (!C0326j.m869n(BuildTarget.Companion)) {
                goBack();
                return;
            }
            throw runtimeException;
        }
    }

    public View onCreateContentView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_text, viewGroup, true);
        TextView textView = (TextView) inflate.findViewById(R.id.text);
        CharSequence charSequence = getArguments().getCharSequence("text");
        if ((charSequence instanceof Spannable) && ((URLSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), URLSpan.class)).length != 0) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        textView.setText(charSequence);
        return inflate;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        goBack();
        return true;
    }
}
