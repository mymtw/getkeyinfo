package com.google.android.material.datepicker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import com.etsy.android.R;
import com.google.android.material.dialog.InsetDialogOnTouchListener;
import com.google.android.material.shape.MaterialShapeDrawable;
import p507al.C14024b;
import p672sk.C18520b;

public class MaterialStyledDatePickerDialog extends DatePickerDialog {
    private static final int DEF_STYLE_ATTR = 16843612;
    private static final int DEF_STYLE_RES = 2132017764;
    private final Drawable background;
    private final Rect backgroundInsets;

    public MaterialStyledDatePickerDialog(Context context) {
        this(context, 0);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(this.background);
        getWindow().getDecorView().setOnTouchListener(new InsetDialogOnTouchListener(this, this.backgroundInsets));
    }

    public MaterialStyledDatePickerDialog(Context context, int i) {
        this(context, i, (DatePickerDialog.OnDateSetListener) null, -1, -1, -1);
    }

    public MaterialStyledDatePickerDialog(Context context, DatePickerDialog.OnDateSetListener onDateSetListener, int i, int i2, int i3) {
        this(context, 0, onDateSetListener, i, i2, i3);
    }

    public MaterialStyledDatePickerDialog(Context context, int i, DatePickerDialog.OnDateSetListener onDateSetListener, int i2, int i3, int i4) {
        super(context, i, onDateSetListener, i2, i3, i4);
        Context context2 = getContext();
        int b = C14024b.m21581b(getContext(), R.attr.colorSurface, getClass().getCanonicalName());
        int i5 = DEF_STYLE_RES;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context2, (AttributeSet) null, DEF_STYLE_ATTR, i5);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(b));
        Rect a = C18520b.m31248a(DEF_STYLE_ATTR, context2, i5);
        this.backgroundInsets = a;
        this.background = new InsetDrawable(materialShapeDrawable, a.left, a.top, a.right, a.bottom);
    }
}
