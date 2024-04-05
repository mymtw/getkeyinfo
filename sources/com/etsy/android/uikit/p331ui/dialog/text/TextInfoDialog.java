package com.etsy.android.uikit.p331ui.dialog.text;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.etsy.android.uikit.util.EtsyLinkify;

/* renamed from: com.etsy.android.uikit.ui.dialog.text.TextInfoDialog */
public class TextInfoDialog extends TrackingBaseFragment {
    private String mContent;
    private TextView mText;

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public String getTrackingName() {
        return "popup_help";
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mContent = getArguments().getString("text");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_text_info, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.text);
        this.mText = textView;
        textView.setText(this.mContent);
        EtsyLinkify.m19610d(getActivity(), this.mText);
        return inflate;
    }
}
