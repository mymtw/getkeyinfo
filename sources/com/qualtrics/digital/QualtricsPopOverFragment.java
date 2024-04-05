package com.qualtrics.digital;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.google.gson.C16708i;

public class QualtricsPopOverFragment extends Fragment {
    private static final String CREATIVE_DEFINITION_KEY = "CREATIVE_DEFINITION";
    private static final int DIALOG_WIDTH = 260;
    private static final String WIDTH_KEY = "WIDTH";
    public C17290a mButtonPressListener;

    /* renamed from: com.qualtrics.digital.QualtricsPopOverFragment$a */
    public interface C17290a {
    }

    private boolean areButtonsMultiline(int i, TextView textView, C17312r rVar) {
        new Paint().setTextSize(textView.getTextSize());
        rVar.getClass();
        throw null;
    }

    private void buildCloseButton(LinearLayout linearLayout, C17312r rVar) {
        rVar.getClass();
        throw null;
    }

    private void buildDialogLayout(LinearLayout linearLayout, int i, C17312r rVar) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, -2);
        layoutParams.addRule(13);
        layoutParams.topMargin = convertDpToPixel(40.0f);
        layoutParams.bottomMargin = convertDpToPixel(40.0f);
        linearLayout.setPadding(0, convertDpToPixel(16.0f), 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(1);
        linearLayout.setOrientation(1);
        new GradientDrawable().setShape(0);
        rVar.getClass();
        throw null;
    }

    private void buildMessageSection(LinearLayout linearLayout, TextView textView, TextView textView2) {
        if (!textView.getText().equals("")) {
            linearLayout.addView(textView);
        }
        if (!textView2.getText().equals("")) {
            linearLayout.addView(textView2);
        }
    }

    private TextView configureButton(TextView textView, C17296c cVar, C17294b bVar, boolean z, boolean z2, LinearLayout linearLayout) {
        throw null;
    }

    private LinearLayout getButtonLayout(boolean z, int i) {
        LinearLayout linearLayout = new LinearLayout(getActivity());
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int convertDpToPixel = convertDpToPixel(25.0f);
        layoutParams.topMargin = (convertDpToPixel / 2) + i;
        if (!z) {
            layoutParams.bottomMargin = convertDpToPixel;
        }
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        return linearLayout;
    }

    private RelativeLayout getDialogContainer(C17312r rVar) {
        new RelativeLayout(getActivity()).setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        rVar.getClass();
        throw null;
    }

    private int getDialogWidth(int i) {
        int convertDpToPixel = convertDpToPixel(260.0f);
        return i < convertDpToPixel - convertDpToPixel(40.0f) ? i - convertDpToPixel(40.0f) : convertDpToPixel;
    }

    private TextView getMessageDescription(int i, TextView textView, C17312r rVar) {
        TextView textView2 = new TextView(getActivity());
        textView2.setContentDescription("popOverDescription");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = convertDpToPixel(20.0f);
        layoutParams.rightMargin = convertDpToPixel(20.0f);
        int i2 = i / 2;
        layoutParams.topMargin = i2;
        layoutParams.bottomMargin = i2;
        textView2.setLayoutParams(layoutParams);
        rVar.getClass();
        throw null;
    }

    private TextView getMessageTitle(C17312r rVar) {
        TextView textView = new TextView(getActivity());
        textView.setContentDescription("popOverTitle");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.leftMargin = convertDpToPixel(20.0f);
        layoutParams.rightMargin = convertDpToPixel(20.0f);
        layoutParams.gravity = 17;
        textView.setLayoutParams(layoutParams);
        rVar.getClass();
        throw null;
    }

    public static QualtricsPopOverFragment newInstance(String str, int i) {
        QualtricsPopOverFragment qualtricsPopOverFragment = new QualtricsPopOverFragment();
        Bundle bundle = new Bundle(2);
        bundle.putString(CREATIVE_DEFINITION_KEY, str);
        bundle.putInt(WIDTH_KEY, i);
        qualtricsPopOverFragment.setArguments(bundle);
        return qualtricsPopOverFragment;
    }

    private void setButtonPressListener(Context context) {
        try {
            this.mButtonPressListener = (C17290a) context;
        } catch (ClassCastException unused) {
            throw new ClassCastException(context.toString() + " must implement OnCreativeButtonPressListener");
        }
    }

    private boolean shouldShowCloseButton(C17296c cVar) {
        throw null;
    }

    public int convertDpToPixel(float f) {
        return (int) ((((float) getResources().getDisplayMetrics().densityDpi) / 160.0f) * f);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        setButtonPressListener(activity);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string = getArguments().getString(CREATIVE_DEFINITION_KEY);
        if (string == null) {
            Log.e("Qualtrics", "Error getting creative definition in pop over fragment. Display aborted.");
            return null;
        }
        int i = getArguments().getInt(WIDTH_KEY);
        C17312r rVar = (C17312r) new C16708i().mo59458e(C17312r.class, string);
        getDialogContainer(rVar);
        new LinearLayout(getActivity());
        getDialogWidth(i);
        convertDpToPixel(16.0f);
        new ShapeDrawable(new RectShape()).getPaint().setColor(0);
        rVar.getClass();
        throw null;
    }

    public void onResume() {
        super.onResume();
        ActionBar supportActionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo1179h();
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        setButtonPressListener(context);
    }
}
