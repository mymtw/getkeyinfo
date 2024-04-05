package com.etsy.android.p327ui.dialog;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.etsy.android.uikit.view.FullImageView;
import p114g4.C6867g;
import p356ge.C12788a;
import p392lf.C13020a;

/* renamed from: com.etsy.android.ui.dialog.GiftWrapDescriptionFragment */
public class GiftWrapDescriptionFragment extends TrackingBaseFragment implements C13020a {
    private void buildView(View view, String str, Image image) {
        FullImageView fullImageView = (FullImageView) view.findViewById(R.id.gift_wrap_photo);
        if (image != null) {
            fullImageView.setImageInfo(image);
        } else {
            fullImageView.setVisibility(8);
        }
        TextView textView = (TextView) view.findViewById(R.id.gift_wrap_description);
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
        String string = getArguments().getString(ResponseConstants.SHOP_NAME);
        ((TextView) view.findViewById(R.id.gift_wrap_description_title)).setText(getContext().getString(R.string.listing_gift_wrap_dialog_title, new Object[]{string}));
        view.findViewById(R.id.gift_wrap_description_container).setOnClickListener(new C6867g(this, 2));
        view.setElevation(view.getContext().getResources().getDimension(R.dimen.clg_elevation_12));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$buildView$0(View view) {
        dismiss();
    }

    public void dismiss() {
        C12788a.m20426e(getActivity());
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_gift_wrap_description_sa, viewGroup, false);
        buildView(inflate, getArguments().getString("gift_info_description"), (Image) getArguments().get("gift_info_preview"));
        return inflate;
    }
}
