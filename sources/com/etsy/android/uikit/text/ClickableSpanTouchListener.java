package com.etsy.android.uikit.text;

import android.annotation.SuppressLint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class ClickableSpanTouchListener implements View.OnTouchListener {
    private URLSpan[] findURLSpansForEvent(MotionEvent motionEvent, TextView textView, Spanned spanned) {
        int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
        int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
        int scrollX = textView.getScrollX() + x;
        int scrollY = textView.getScrollY() + y;
        Layout layout = textView.getLayout();
        int lineForVertical = layout.getLineForVertical(scrollY);
        return (URLSpan[]) spanned.getSpans(layout.getOffsetForHorizontal(lineForVertical, (float) scrollX), layout.getLineEnd(lineForVertical), URLSpan.class);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        TextView textView = (TextView) view;
        CharSequence text = textView.getText();
        if (!(text instanceof Spanned)) {
            return false;
        }
        Spanned spanned = (Spanned) text;
        int action = motionEvent.getAction();
        if (action == 0) {
            return findURLSpansForEvent(motionEvent, textView, spanned).length > 0;
        }
        if (action != 1) {
            return false;
        }
        URLSpan[] findURLSpansForEvent = findURLSpansForEvent(motionEvent, textView, spanned);
        if (findURLSpansForEvent.length > 0) {
            findURLSpansForEvent[0].onClick(textView);
        }
        return findURLSpansForEvent.length > 0;
    }
}
