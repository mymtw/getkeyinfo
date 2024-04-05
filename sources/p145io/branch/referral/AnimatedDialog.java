package p145io.branch.referral;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: io.branch.referral.AnimatedDialog */
public class AnimatedDialog extends Dialog {
    private boolean isClosing_;
    private final boolean isFullWidthStyle_;

    /* renamed from: io.branch.referral.AnimatedDialog$a */
    public class C7009a implements DialogInterface.OnKeyListener {
        public C7009a() {
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i != 4) {
                return true;
            }
            AnimatedDialog.this.slideClose();
            return true;
        }
    }

    /* renamed from: io.branch.referral.AnimatedDialog$b */
    public class C7010b implements Animation.AnimationListener {
        public C7010b() {
        }

        public final void onAnimationEnd(Animation animation) {
            AnimatedDialog.this.dismiss();
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }
    }

    public AnimatedDialog(Context context, boolean z) {
        super(context);
        this.isClosing_ = false;
        this.isFullWidthStyle_ = z;
        init(context);
    }

    private void init(Context context) {
        setDialogWindowAttributes();
        setOnKeyListener(new C7009a());
    }

    /* access modifiers changed from: private */
    public void slideClose() {
        if (!this.isClosing_) {
            this.isClosing_ = true;
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            translateAnimation.setDuration(500);
            translateAnimation.setInterpolator(new DecelerateInterpolator());
            ((ViewGroup) getWindow().getDecorView()).getChildAt(0).startAnimation(translateAnimation);
            translateAnimation.setAnimationListener(new C7010b());
        }
    }

    private void slideOpen() {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(500);
        translateAnimation.setInterpolator(new AccelerateInterpolator());
        ((ViewGroup) getWindow().getDecorView()).getChildAt(0).startAnimation(translateAnimation);
        super.show();
    }

    public void cancel() {
        slideClose();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.isFullWidthStyle_) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            getWindow().setAttributes(attributes);
        }
    }

    public void setContentView(int i) {
        setDialogWindowAttributes();
        super.setContentView(i);
    }

    public void setDialogWindowAttributes() {
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().addFlags(2);
        getWindow().addFlags(RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.gravity = 80;
        layoutParams.dimAmount = 0.8f;
        getWindow().setAttributes(layoutParams);
        getWindow().setWindowAnimations(17432578);
        setCanceledOnTouchOutside(true);
    }

    public void show() {
        slideOpen();
    }

    public AnimatedDialog(Context context, int i) {
        super(context, i);
        this.isClosing_ = false;
        this.isFullWidthStyle_ = false;
        init(context);
    }
}
