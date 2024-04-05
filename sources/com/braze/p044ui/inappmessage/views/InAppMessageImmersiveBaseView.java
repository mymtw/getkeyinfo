package com.braze.p044ui.inappmessage.views;

import android.animation.StateListAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0342q0;
import com.appboy.p043ui.C4940R;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.models.inappmessage.MessageButton;
import com.braze.p044ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.p044ui.support.ViewUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p114g4.C6861b;

/* renamed from: com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView */
public abstract class InAppMessageImmersiveBaseView extends InAppMessageBaseView implements C5696b {
    private static final String TAG = BrazeLogger.m11287i(InAppMessageImmersiveBaseView.class);

    public InAppMessageImmersiveBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setLargerCloseButtonClickArea$1(View view) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C4940R.dimen.com_braze_inappmessage_close_button_click_area_width);
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(C4940R.dimen.com_braze_inappmessage_close_button_click_area_height);
        int width = (dimensionPixelSize - rect.width()) / 2;
        int height = (dimensionPixelSize2 - rect.height()) / 2;
        rect.top -= height;
        rect.bottom += height;
        rect.left -= width;
        rect.right += width;
        ((View) view.getParent()).setTouchDelegate(new TouchDelegate(rect, view));
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (isInTouchMode() || keyEvent.getKeyCode() != 4 || !C6861b.m13319e().f15219a) {
            return super.dispatchKeyEvent(keyEvent);
        }
        InAppMessageViewUtils.m11461a();
        return true;
    }

    public abstract View getFrameView();

    public abstract List<View> getMessageButtonViews(int i);

    public abstract /* synthetic */ View getMessageCloseButtonView();

    public abstract TextView getMessageHeaderTextView();

    public abstract TextView getMessageTextView();

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !C6861b.m13319e().f15219a) {
            return super.onKeyDown(i, keyEvent);
        }
        InAppMessageViewUtils.m11461a();
        return true;
    }

    public void resetMessageMargins(boolean z) {
        super.resetMessageMargins(z);
        if (StringUtils.m11343d(getMessageTextView().getText().toString())) {
            ViewUtils.m11483i(getMessageTextView());
        }
        if (StringUtils.m11343d(getMessageHeaderTextView().getText().toString())) {
            ViewUtils.m11483i(getMessageHeaderTextView());
        }
        TextView messageTextView = getMessageTextView();
        if (getMessageHeaderTextView() == null && messageTextView != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(messageTextView.getLayoutParams().width, messageTextView.getLayoutParams().height);
            layoutParams.setMargins(0, 0, 0, 0);
            messageTextView.setLayoutParams(layoutParams);
        }
    }

    public void setFrameColor(Integer num) {
        View frameView = getFrameView();
        C19383o.m32797g(frameView, "view");
        if (num != null) {
            frameView.setBackgroundColor(num.intValue());
        }
    }

    public void setLargerCloseButtonClickArea(View view) {
        if (view == null || view.getParent() == null) {
            BrazeLogger.m11292n(TAG, "Cannot increase click area for view if view and/or parent are null.");
        } else if (view.getParent() instanceof View) {
            ((View) view.getParent()).post(new C5699e(0, this, view));
        }
    }

    public void setMessageButtons(List<MessageButton> list) {
        List<View> messageButtonViews = getMessageButtonViews(list.size());
        C19383o.m32797g(messageButtonViews, "buttonViews");
        int size = messageButtonViews.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            View view = messageButtonViews.get(i);
            MessageButton messageButton = list.get(i);
            int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(C4940R.dimen.com_braze_inappmessage_button_border_stroke);
            int dimensionPixelSize2 = view.getContext().getResources().getDimensionPixelSize(C4940R.dimen.com_braze_inappmessage_button_border_stroke_focused);
            if (list.size() <= i) {
                view.setVisibility(8);
            } else if (view instanceof Button) {
                Button button = (Button) view;
                C19383o.m32797g(messageButton, "messageButton");
                button.setText(messageButton.f11834g);
                button.setContentDescription(messageButton.f11834g);
                button.setTextColor(messageButton.f11837j);
                StateListDrawable stateListDrawable = new StateListDrawable();
                button.setStateListAnimator((StateListAnimator) null);
                Context context = button.getContext();
                C19383o.m32796f(context, "button.context");
                Drawable N = C19543e0.m33297N(context, messageButton, dimensionPixelSize, dimensionPixelSize2, false);
                Context context2 = button.getContext();
                C19383o.m32796f(context2, "button.context");
                stateListDrawable.addState(new int[]{16842908}, C19543e0.m33297N(context2, messageButton, dimensionPixelSize, dimensionPixelSize2, true));
                stateListDrawable.addState(new int[]{16842910}, N);
                button.setBackground(stateListDrawable);
            }
            i = i2;
        }
    }

    public void setMessageCloseButtonColor(int i) {
        InAppMessageViewUtils.m11465e(i, getMessageCloseButtonView());
    }

    public void setMessageHeaderText(String str) {
        getMessageHeaderTextView().setText(str);
    }

    public void setMessageHeaderTextAlignment(TextAlign textAlign) {
        InAppMessageViewUtils.m11464d(getMessageHeaderTextView(), textAlign);
    }

    public void setMessageHeaderTextColor(int i) {
        TextView messageHeaderTextView = getMessageHeaderTextView();
        C19383o.m32797g(messageHeaderTextView, "textView");
        messageHeaderTextView.setTextColor(i);
    }

    public void setupDirectionalNavigation(int i) {
        List<View> messageButtonViews = getMessageButtonViews(i);
        View messageCloseButtonView = getMessageCloseButtonView();
        int id = messageCloseButtonView.getId();
        if (i == 0) {
            messageCloseButtonView.setNextFocusUpId(id);
            messageCloseButtonView.setNextFocusDownId(id);
            messageCloseButtonView.setNextFocusRightId(id);
            messageCloseButtonView.setNextFocusLeftId(id);
        } else if (i == 1) {
            View view = messageButtonViews.get(0);
            int id2 = view.getId();
            view.setNextFocusLeftId(id);
            view.setNextFocusRightId(id);
            view.setNextFocusUpId(id);
            view.setNextFocusDownId(id);
            messageCloseButtonView.setNextFocusUpId(id2);
            messageCloseButtonView.setNextFocusDownId(id2);
            messageCloseButtonView.setNextFocusRightId(id2);
            messageCloseButtonView.setNextFocusLeftId(id2);
            messageCloseButtonView = view;
            id = id2;
        } else if (i != 2) {
            String str = TAG;
            BrazeLogger.m11292n(str, "Cannot setup directional navigation. Got unsupported number of buttons: " + i);
        } else {
            View view2 = messageButtonViews.get(1);
            View view3 = messageButtonViews.get(0);
            int id3 = view2.getId();
            int id4 = view3.getId();
            view2.setNextFocusLeftId(id4);
            view2.setNextFocusRightId(id4);
            view2.setNextFocusUpId(id);
            view2.setNextFocusDownId(id);
            view3.setNextFocusLeftId(id3);
            view3.setNextFocusRightId(id3);
            view3.setNextFocusUpId(id);
            view3.setNextFocusDownId(id);
            messageCloseButtonView.setNextFocusUpId(id3);
            messageCloseButtonView.setNextFocusDownId(id3);
            messageCloseButtonView.setNextFocusRightId(id3);
            messageCloseButtonView.setNextFocusLeftId(id4);
            messageCloseButtonView = view2;
            id = id3;
        }
        setNextFocusUpId(id);
        setNextFocusDownId(id);
        setNextFocusRightId(id);
        setNextFocusLeftId(id);
        messageCloseButtonView.setFocusedByDefault(true);
        messageCloseButtonView.post(new C0342q0(messageCloseButtonView, 2));
    }
}
