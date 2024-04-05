package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.etsy.android.R;
import java.lang.ref.WeakReference;
import p628nj.C18263b;

public final class AlertController {

    /* renamed from: A */
    public NestedScrollView f213A;

    /* renamed from: B */
    public int f214B = 0;

    /* renamed from: C */
    public Drawable f215C;

    /* renamed from: D */
    public ImageView f216D;

    /* renamed from: E */
    public TextView f217E;

    /* renamed from: F */
    public TextView f218F;

    /* renamed from: G */
    public View f219G;

    /* renamed from: H */
    public ListAdapter f220H;

    /* renamed from: I */
    public int f221I = -1;

    /* renamed from: J */
    public int f222J;

    /* renamed from: K */
    public int f223K;

    /* renamed from: L */
    public int f224L;

    /* renamed from: M */
    public int f225M;

    /* renamed from: N */
    public int f226N;

    /* renamed from: O */
    public int f227O;

    /* renamed from: P */
    public boolean f228P;

    /* renamed from: Q */
    public int f229Q = 0;

    /* renamed from: R */
    public C0131c f230R;

    /* renamed from: S */
    public final C0129a f231S = new C0129a();

    /* renamed from: a */
    public final Context f232a;

    /* renamed from: b */
    public final AppCompatDialog f233b;

    /* renamed from: c */
    public final Window f234c;

    /* renamed from: d */
    public final int f235d;

    /* renamed from: e */
    public CharSequence f236e;

    /* renamed from: f */
    public CharSequence f237f;

    /* renamed from: g */
    public RecycleListView f238g;

    /* renamed from: h */
    public View f239h;

    /* renamed from: i */
    public int f240i;

    /* renamed from: j */
    public int f241j;

    /* renamed from: k */
    public int f242k;

    /* renamed from: l */
    public int f243l;

    /* renamed from: m */
    public int f244m;

    /* renamed from: n */
    public boolean f245n = false;

    /* renamed from: o */
    public Button f246o;

    /* renamed from: p */
    public CharSequence f247p;

    /* renamed from: q */
    public Message f248q;

    /* renamed from: r */
    public Drawable f249r;

    /* renamed from: s */
    public Button f250s;

    /* renamed from: t */
    public CharSequence f251t;

    /* renamed from: u */
    public Message f252u;

    /* renamed from: v */
    public Drawable f253v;

    /* renamed from: w */
    public Button f254w;

    /* renamed from: x */
    public CharSequence f255x;

    /* renamed from: y */
    public Message f256y;

    /* renamed from: z */
    public Drawable f257z;

    public static class RecycleListView extends ListView {
        private final int mPaddingBottomNoButtons;
        private final int mPaddingTopNoTitle;

        public RecycleListView(Context context) {
            this(context, (AttributeSet) null);
        }

        public void setHasDecor(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.mPaddingTopNoTitle, getPaddingRight(), z2 ? getPaddingBottom() : this.mPaddingBottomNoButtons);
            }
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C18263b.f40038B);
            this.mPaddingBottomNoButtons = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.mPaddingTopNoTitle = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    public class C0129a implements View.OnClickListener {
        public C0129a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r3 = r0.f256y;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f246o
                if (r3 != r1) goto L_0x000f
                android.os.Message r1 = r0.f248q
                if (r1 == 0) goto L_0x000f
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x002a
            L_0x000f:
                android.widget.Button r1 = r0.f250s
                if (r3 != r1) goto L_0x001c
                android.os.Message r1 = r0.f252u
                if (r1 == 0) goto L_0x001c
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x002a
            L_0x001c:
                android.widget.Button r1 = r0.f254w
                if (r3 != r1) goto L_0x0029
                android.os.Message r3 = r0.f256y
                if (r3 == 0) goto L_0x0029
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r3 == 0) goto L_0x002f
                r3.sendToTarget()
            L_0x002f:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                androidx.appcompat.app.AlertController$c r0 = r3.f230R
                r1 = 1
                androidx.appcompat.app.AppCompatDialog r3 = r3.f233b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0129a.onClick(android.view.View):void");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    public static class C0130b {

        /* renamed from: a */
        public final Context f259a;

        /* renamed from: b */
        public final LayoutInflater f260b;

        /* renamed from: c */
        public Drawable f261c;

        /* renamed from: d */
        public CharSequence f262d;

        /* renamed from: e */
        public View f263e;

        /* renamed from: f */
        public CharSequence f264f;

        /* renamed from: g */
        public CharSequence f265g;

        /* renamed from: h */
        public DialogInterface.OnClickListener f266h;

        /* renamed from: i */
        public CharSequence f267i;

        /* renamed from: j */
        public DialogInterface.OnClickListener f268j;

        /* renamed from: k */
        public CharSequence f269k;

        /* renamed from: l */
        public DialogInterface.OnClickListener f270l;

        /* renamed from: m */
        public boolean f271m;

        /* renamed from: n */
        public DialogInterface.OnCancelListener f272n;

        /* renamed from: o */
        public DialogInterface.OnDismissListener f273o;

        /* renamed from: p */
        public DialogInterface.OnKeyListener f274p;

        /* renamed from: q */
        public CharSequence[] f275q;

        /* renamed from: r */
        public ListAdapter f276r;

        /* renamed from: s */
        public DialogInterface.OnClickListener f277s;

        /* renamed from: t */
        public int f278t;

        /* renamed from: u */
        public View f279u;

        /* renamed from: v */
        public boolean[] f280v;

        /* renamed from: w */
        public boolean f281w;

        /* renamed from: x */
        public boolean f282x;

        /* renamed from: y */
        public int f283y = -1;

        /* renamed from: z */
        public DialogInterface.OnMultiChoiceClickListener f284z;

        public C0130b(ContextThemeWrapper contextThemeWrapper) {
            this.f259a = contextThemeWrapper;
            this.f271m = true;
            this.f260b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    public static final class C0131c extends Handler {

        /* renamed from: a */
        public WeakReference<DialogInterface> f285a;

        public C0131c(DialogInterface dialogInterface) {
            this.f285a = new WeakReference<>(dialogInterface);
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f285a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    public static class C0132d extends ArrayAdapter<CharSequence> {
        public C0132d(Context context, int i, CharSequence[] charSequenceArr) {
            super(context, i, 16908308, charSequenceArr);
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, AppCompatDialog appCompatDialog, Window window) {
        this.f232a = context;
        this.f233b = appCompatDialog;
        this.f234c = window;
        this.f230R = new C0131c(appCompatDialog);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C18263b.f40075l, R.attr.alertDialogStyle, 0);
        this.f222J = obtainStyledAttributes.getResourceId(0, 0);
        this.f223K = obtainStyledAttributes.getResourceId(2, 0);
        this.f224L = obtainStyledAttributes.getResourceId(4, 0);
        this.f225M = obtainStyledAttributes.getResourceId(5, 0);
        this.f226N = obtainStyledAttributes.getResourceId(7, 0);
        this.f227O = obtainStyledAttributes.getResourceId(3, 0);
        this.f228P = obtainStyledAttributes.getBoolean(6, true);
        this.f235d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        appCompatDialog.supportRequestWindowFeature(1);
    }

    /* renamed from: a */
    public static boolean m406a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m406a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static void m407b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: c */
    public static ViewGroup m408c(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: d */
    public final void mo1204d(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f230R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f255x = charSequence;
            this.f256y = message;
            this.f257z = drawable;
        } else if (i == -2) {
            this.f251t = charSequence;
            this.f252u = message;
            this.f253v = drawable;
        } else if (i == -1) {
            this.f247p = charSequence;
            this.f248q = message;
            this.f249r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: e */
    public final void mo1205e(int i) {
        this.f215C = null;
        this.f214B = i;
        ImageView imageView = this.f216D;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f216D.setImageResource(this.f214B);
            return;
        }
        imageView.setVisibility(8);
    }
}
