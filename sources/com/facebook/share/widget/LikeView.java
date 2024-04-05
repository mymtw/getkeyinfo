package com.facebook.share.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.fragment.app.Fragment;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.FacebookException;
import com.facebook.share.internal.C12348b;
import com.facebook.share.internal.C12376k;
import com.facebook.share.internal.LikeBoxCountView;
import com.facebook.share.internal.LikeButton;
import p251u1.C8115a;
import p365hg.C12869i0;
import p365hg.C12903s;
import p401mg.C13080a;

@Deprecated
public class LikeView extends FrameLayout {
    private static final int NO_FOREGROUND_COLOR = -1;
    private AuxiliaryViewPosition auxiliaryViewPosition = AuxiliaryViewPosition.DEFAULT;
    private BroadcastReceiver broadcastReceiver;
    private LinearLayout containerView;
    /* access modifiers changed from: private */
    public C12428c creationCallback;
    private int edgePadding;
    private boolean explicitlyDisabled = true;
    private int foregroundColor = -1;
    private HorizontalAlignment horizontalAlignment = HorizontalAlignment.DEFAULT;
    private int internalPadding;
    private C12348b likeActionController;
    private LikeBoxCountView likeBoxCountView;
    private LikeButton likeButton;
    private Style likeViewStyle = Style.DEFAULT;
    /* access modifiers changed from: private */
    public String objectId;
    /* access modifiers changed from: private */
    public ObjectType objectType;
    /* access modifiers changed from: private */
    public C12430e onErrorListener;
    private C12903s parentFragment;
    private TextView socialSentenceView;

    @Deprecated
    public enum AuxiliaryViewPosition {
        BOTTOM("bottom", 0),
        INLINE("inline", 1),
        TOP("top", 2);
        
        public static AuxiliaryViewPosition DEFAULT;
        private int intValue;
        private String stringValue;

        /* access modifiers changed from: public */
        static {
            AuxiliaryViewPosition auxiliaryViewPosition;
            DEFAULT = auxiliaryViewPosition;
        }

        private AuxiliaryViewPosition(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }

        public static AuxiliaryViewPosition fromInt(int i) {
            for (AuxiliaryViewPosition auxiliaryViewPosition : values()) {
                if (auxiliaryViewPosition.getValue() == i) {
                    return auxiliaryViewPosition;
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        public int getValue() {
            return this.intValue;
        }

        public String toString() {
            return this.stringValue;
        }
    }

    @Deprecated
    public enum HorizontalAlignment {
        CENTER("center", 0),
        LEFT("left", 1),
        RIGHT("right", 2);
        
        public static HorizontalAlignment DEFAULT;
        private int intValue;
        private String stringValue;

        /* access modifiers changed from: public */
        static {
            HorizontalAlignment horizontalAlignment;
            DEFAULT = horizontalAlignment;
        }

        private HorizontalAlignment(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }

        public static HorizontalAlignment fromInt(int i) {
            for (HorizontalAlignment horizontalAlignment : values()) {
                if (horizontalAlignment.getValue() == i) {
                    return horizontalAlignment;
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        public int getValue() {
            return this.intValue;
        }

        public String toString() {
            return this.stringValue;
        }
    }

    @Deprecated
    public enum ObjectType {
        UNKNOWN("unknown", 0),
        OPEN_GRAPH("open_graph", 1),
        PAGE("page", 2);
        
        public static ObjectType DEFAULT;
        private int intValue;
        private String stringValue;

        /* access modifiers changed from: public */
        static {
            ObjectType objectType;
            DEFAULT = objectType;
        }

        private ObjectType(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }

        public static ObjectType fromInt(int i) {
            for (ObjectType objectType : values()) {
                if (objectType.getValue() == i) {
                    return objectType;
                }
            }
            return null;
        }

        public int getValue() {
            return this.intValue;
        }

        public String toString() {
            return this.stringValue;
        }
    }

    @Deprecated
    public enum Style {
        STANDARD("standard", 0),
        BUTTON("button", 1),
        BOX_COUNT("box_count", 2);
        
        public static Style DEFAULT;
        private int intValue;
        private String stringValue;

        /* access modifiers changed from: public */
        static {
            Style style;
            DEFAULT = style;
        }

        private Style(String str, int i) {
            this.stringValue = str;
            this.intValue = i;
        }

        public static Style fromInt(int i) {
            for (Style style : values()) {
                if (style.getValue() == i) {
                    return style;
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        public int getValue() {
            return this.intValue;
        }

        public String toString() {
            return this.stringValue;
        }
    }

    /* renamed from: com.facebook.share.widget.LikeView$a */
    public class C12426a implements View.OnClickListener {
        public C12426a() {
        }

        public final void onClick(View view) {
            if (!C13080a.m20762b(this)) {
                try {
                    LikeView.this.toggleLike();
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    /* renamed from: com.facebook.share.widget.LikeView$b */
    public static /* synthetic */ class C12427b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27593a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.facebook.share.widget.LikeView$AuxiliaryViewPosition[] r0 = com.facebook.share.widget.LikeView.AuxiliaryViewPosition.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27593a = r0
                com.facebook.share.widget.LikeView$AuxiliaryViewPosition r1 = com.facebook.share.widget.LikeView.AuxiliaryViewPosition.TOP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27593a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.share.widget.LikeView$AuxiliaryViewPosition r1 = com.facebook.share.widget.LikeView.AuxiliaryViewPosition.BOTTOM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27593a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.share.widget.LikeView$AuxiliaryViewPosition r1 = com.facebook.share.widget.LikeView.AuxiliaryViewPosition.INLINE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.widget.LikeView.C12427b.<clinit>():void");
        }
    }

    /* renamed from: com.facebook.share.widget.LikeView$c */
    public class C12428c implements C12348b.C12354e {

        /* renamed from: a */
        public boolean f27594a;

        public C12428c() {
        }

        /* renamed from: a */
        public final void mo39764a(C12348b bVar, FacebookException facebookException) {
            if (!this.f27594a) {
                if (bVar != null) {
                    facebookException = new FacebookException("Cannot use LikeView. The device may not be supported.");
                    LikeView.this.associateWithLikeActionController(bVar);
                    LikeView.this.updateLikeStateAndLayout();
                }
                if (!(facebookException == null || LikeView.this.onErrorListener == null)) {
                    LikeView.this.onErrorListener.mo39943a();
                }
                C12428c unused = LikeView.this.creationCallback = null;
            }
        }
    }

    /* renamed from: com.facebook.share.widget.LikeView$d */
    public class C12429d extends BroadcastReceiver {
        public C12429d() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0028 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onReceive(android.content.Context r3, android.content.Intent r4) {
            /*
                r2 = this;
                java.lang.String r3 = r4.getAction()
                android.os.Bundle r4 = r4.getExtras()
                if (r4 == 0) goto L_0x0025
                java.lang.String r0 = "com.facebook.sdk.LikeActionController.OBJECT_ID"
                java.lang.String r0 = r4.getString(r0)
                boolean r1 = p365hg.C12869i0.m20546B(r0)
                if (r1 != 0) goto L_0x0025
                com.facebook.share.widget.LikeView r1 = com.facebook.share.widget.LikeView.this
                java.lang.String r1 = r1.objectId
                boolean r0 = p365hg.C12869i0.m20562a(r1, r0)
                if (r0 == 0) goto L_0x0023
                goto L_0x0025
            L_0x0023:
                r0 = 0
                goto L_0x0026
            L_0x0025:
                r0 = 1
            L_0x0026:
                if (r0 != 0) goto L_0x0029
                return
            L_0x0029:
                java.lang.String r0 = "com.facebook.sdk.LikeActionController.UPDATED"
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L_0x0037
                com.facebook.share.widget.LikeView r3 = com.facebook.share.widget.LikeView.this
                r3.updateLikeStateAndLayout()
                goto L_0x0070
            L_0x0037:
                java.lang.String r0 = "com.facebook.sdk.LikeActionController.DID_ERROR"
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L_0x0054
                com.facebook.share.widget.LikeView r3 = com.facebook.share.widget.LikeView.this
                com.facebook.share.widget.LikeView$e r3 = r3.onErrorListener
                if (r3 == 0) goto L_0x0070
                com.facebook.share.widget.LikeView r3 = com.facebook.share.widget.LikeView.this
                com.facebook.share.widget.LikeView$e r3 = r3.onErrorListener
                p365hg.C12851e0.m20508h(r4)
                r3.mo39943a()
                goto L_0x0070
            L_0x0054:
                java.lang.String r4 = "com.facebook.sdk.LikeActionController.DID_RESET"
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto L_0x0070
                com.facebook.share.widget.LikeView r3 = com.facebook.share.widget.LikeView.this
                java.lang.String r4 = r3.objectId
                com.facebook.share.widget.LikeView r0 = com.facebook.share.widget.LikeView.this
                com.facebook.share.widget.LikeView$ObjectType r0 = r0.objectType
                r3.setObjectIdAndTypeForced(r4, r0)
                com.facebook.share.widget.LikeView r3 = com.facebook.share.widget.LikeView.this
                r3.updateLikeStateAndLayout()
            L_0x0070:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.widget.LikeView.C12429d.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* renamed from: com.facebook.share.widget.LikeView$e */
    public interface C12430e {
        /* renamed from: a */
        void mo39943a();
    }

    @Deprecated
    public LikeView(Context context) {
        super(context);
        initialize(context);
    }

    /* access modifiers changed from: private */
    public void associateWithLikeActionController(C12348b bVar) {
        this.likeActionController = bVar;
        this.broadcastReceiver = new C12429d();
        C8115a a = C8115a.m16322a(getContext());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.LikeActionController.UPDATED");
        intentFilter.addAction("com.facebook.sdk.LikeActionController.DID_ERROR");
        intentFilter.addAction("com.facebook.sdk.LikeActionController.DID_RESET");
        a.mo20708b(this.broadcastReceiver, intentFilter);
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.app.Activity getActivity() {
        /*
            r3 = this;
            android.content.Context r0 = r3.getContext()
        L_0x0004:
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 != 0) goto L_0x0013
            boolean r2 = r0 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L_0x0013
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L_0x0004
        L_0x0013:
            if (r1 == 0) goto L_0x0018
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
        L_0x0018:
            com.facebook.FacebookException r0 = new com.facebook.FacebookException
            java.lang.String r1 = "Unable to get Activity."
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.widget.LikeView.getActivity():android.app.Activity");
    }

    private Bundle getAnalyticsParameters() {
        Bundle bundle = new Bundle();
        bundle.putString("style", this.likeViewStyle.toString());
        bundle.putString("auxiliary_position", this.auxiliaryViewPosition.toString());
        bundle.putString("horizontal_alignment", this.horizontalAlignment.toString());
        bundle.putString(ResponseConstants.OBJECT_ID, C12869i0.m20567f(this.objectId, ""));
        bundle.putString(ResponseConstants.OBJECT_TYPE, this.objectType.toString());
        return bundle;
    }

    private void initialize(Context context) {
        this.edgePadding = getResources().getDimensionPixelSize(R.dimen.com_facebook_likeview_edge_padding);
        this.internalPadding = getResources().getDimensionPixelSize(R.dimen.com_facebook_likeview_internal_padding);
        if (this.foregroundColor == -1) {
            this.foregroundColor = getResources().getColor(R.color.com_facebook_likeview_text_color);
        }
        setBackgroundColor(0);
        this.containerView = new LinearLayout(context);
        this.containerView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        initializeLikeButton(context);
        initializeSocialSentenceView(context);
        initializeLikeCountView(context);
        this.containerView.addView(this.likeButton);
        this.containerView.addView(this.socialSentenceView);
        this.containerView.addView(this.likeBoxCountView);
        addView(this.containerView);
        setObjectIdAndTypeForced(this.objectId, this.objectType);
        updateLikeStateAndLayout();
    }

    private void initializeLikeButton(Context context) {
        C12348b bVar = this.likeActionController;
        LikeButton likeButton2 = new LikeButton(context, bVar != null && bVar.f27514c);
        this.likeButton = likeButton2;
        likeButton2.setOnClickListener(new C12426a());
        this.likeButton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
    }

    private void initializeLikeCountView(Context context) {
        this.likeBoxCountView = new LikeBoxCountView(context);
        this.likeBoxCountView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
    }

    private void initializeSocialSentenceView(Context context) {
        TextView textView = new TextView(context);
        this.socialSentenceView = textView;
        textView.setTextSize(0, getResources().getDimension(R.dimen.com_facebook_likeview_text_size));
        this.socialSentenceView.setMaxLines(2);
        this.socialSentenceView.setTextColor(this.foregroundColor);
        this.socialSentenceView.setGravity(17);
        this.socialSentenceView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
    }

    private void parseAttributes(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        if (attributeSet != null && getContext() != null && (obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1993m.f4486A)) != null) {
            this.objectId = C12869i0.m20567f(obtainStyledAttributes.getString(3), (String) null);
            this.objectType = ObjectType.fromInt(obtainStyledAttributes.getInt(4, ObjectType.DEFAULT.getValue()));
            Style fromInt = Style.fromInt(obtainStyledAttributes.getInt(5, Style.DEFAULT.getValue()));
            this.likeViewStyle = fromInt;
            if (fromInt != null) {
                AuxiliaryViewPosition fromInt2 = AuxiliaryViewPosition.fromInt(obtainStyledAttributes.getInt(0, AuxiliaryViewPosition.DEFAULT.getValue()));
                this.auxiliaryViewPosition = fromInt2;
                if (fromInt2 != null) {
                    HorizontalAlignment fromInt3 = HorizontalAlignment.fromInt(obtainStyledAttributes.getInt(2, HorizontalAlignment.DEFAULT.getValue()));
                    this.horizontalAlignment = fromInt3;
                    if (fromInt3 != null) {
                        this.foregroundColor = obtainStyledAttributes.getColor(1, -1);
                        obtainStyledAttributes.recycle();
                        return;
                    }
                    throw new IllegalArgumentException("Unsupported value for LikeView 'horizontal_alignment'");
                }
                throw new IllegalArgumentException("Unsupported value for LikeView 'auxiliary_view_position'");
            }
            throw new IllegalArgumentException("Unsupported value for LikeView 'style'");
        }
    }

    /* access modifiers changed from: private */
    public void setObjectIdAndTypeForced(String str, ObjectType objectType2) {
        tearDownObjectAssociations();
        this.objectId = str;
        this.objectType = objectType2;
        if (!C12869i0.m20546B(str)) {
            this.creationCallback = new C12428c();
            if (!isInEditMode()) {
                C12348b.m20170i(str, objectType2, this.creationCallback);
            }
        }
    }

    private void tearDownObjectAssociations() {
        if (this.broadcastReceiver != null) {
            C8115a.m16322a(getContext()).mo20710d(this.broadcastReceiver);
            this.broadcastReceiver = null;
        }
        C12428c cVar = this.creationCallback;
        if (cVar != null) {
            cVar.f27594a = true;
            this.creationCallback = null;
        }
        this.likeActionController = null;
    }

    /* access modifiers changed from: private */
    public void toggleLike() {
        if (this.likeActionController != null) {
            if (this.parentFragment == null) {
                getActivity();
            }
            C12348b bVar = this.likeActionController;
            Bundle analyticsParameters = getAnalyticsParameters();
            boolean z = !bVar.f27514c;
            if (bVar.mo39752d()) {
                bVar.mo39758n(z, bVar.f27515d, bVar.f27516e, bVar.f27517f, bVar.f27518g, bVar.f27519h);
                if (bVar.f27523l) {
                    bVar.mo39754g().mo46174a(analyticsParameters, "fb_like_control_did_undo_quickly");
                } else if (!bVar.mo39757l(analyticsParameters, z)) {
                    bVar.mo39758n(!z, bVar.f27515d, bVar.f27516e, bVar.f27517f, bVar.f27518g, bVar.f27519h);
                    int i = C12376k.f27581e;
                    bVar.mo39755j(analyticsParameters, "present_dialog");
                    C12869i0.m20551G("b", "Cannot show the Like Dialog on this device.");
                    C12348b.m20167c((C12348b) null, "com.facebook.sdk.LikeActionController.UPDATED", (Bundle) null);
                }
            } else {
                int i2 = C12376k.f27581e;
                bVar.mo39755j(analyticsParameters, "present_dialog");
                C12869i0.m20551G("b", "Cannot show the Like Dialog on this device.");
                C12348b.m20167c((C12348b) null, "com.facebook.sdk.LikeActionController.UPDATED", (Bundle) null);
            }
        }
    }

    private void updateBoxCountCaretPosition() {
        int i = C12427b.f27593a[this.auxiliaryViewPosition.ordinal()];
        if (i == 1) {
            this.likeBoxCountView.setCaretPosition(LikeBoxCountView.LikeBoxCountViewCaretPosition.BOTTOM);
        } else if (i == 2) {
            this.likeBoxCountView.setCaretPosition(LikeBoxCountView.LikeBoxCountViewCaretPosition.TOP);
        } else if (i == 3) {
            this.likeBoxCountView.setCaretPosition(this.horizontalAlignment == HorizontalAlignment.RIGHT ? LikeBoxCountView.LikeBoxCountViewCaretPosition.RIGHT : LikeBoxCountView.LikeBoxCountViewCaretPosition.LEFT);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateLayout() {
        /*
            r7 = this;
            android.widget.LinearLayout r0 = r7.containerView
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            com.facebook.share.internal.LikeButton r1 = r7.likeButton
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            com.facebook.share.widget.LikeView$HorizontalAlignment r2 = r7.horizontalAlignment
            com.facebook.share.widget.LikeView$HorizontalAlignment r3 = com.facebook.share.widget.LikeView.HorizontalAlignment.LEFT
            r4 = 3
            r5 = 1
            if (r2 != r3) goto L_0x001a
            r2 = r4
            goto L_0x0021
        L_0x001a:
            com.facebook.share.widget.LikeView$HorizontalAlignment r3 = com.facebook.share.widget.LikeView.HorizontalAlignment.CENTER
            if (r2 != r3) goto L_0x0020
            r2 = r5
            goto L_0x0021
        L_0x0020:
            r2 = 5
        L_0x0021:
            r3 = r2 | 48
            r0.gravity = r3
            r1.gravity = r2
            android.widget.TextView r0 = r7.socialSentenceView
            r1 = 8
            r0.setVisibility(r1)
            com.facebook.share.internal.LikeBoxCountView r0 = r7.likeBoxCountView
            r0.setVisibility(r1)
            com.facebook.share.widget.LikeView$Style r0 = r7.likeViewStyle
            com.facebook.share.widget.LikeView$Style r1 = com.facebook.share.widget.LikeView.Style.STANDARD
            if (r0 != r1) goto L_0x004f
            com.facebook.share.internal.b r0 = r7.likeActionController
            if (r0 == 0) goto L_0x004f
            boolean r1 = r0.f27514c
            if (r1 == 0) goto L_0x0044
            java.lang.String r0 = r0.f27517f
            goto L_0x0046
        L_0x0044:
            java.lang.String r0 = r0.f27518g
        L_0x0046:
            boolean r0 = p365hg.C12869i0.m20546B(r0)
            if (r0 != 0) goto L_0x004f
            android.widget.TextView r0 = r7.socialSentenceView
            goto L_0x006d
        L_0x004f:
            com.facebook.share.widget.LikeView$Style r0 = r7.likeViewStyle
            com.facebook.share.widget.LikeView$Style r1 = com.facebook.share.widget.LikeView.Style.BOX_COUNT
            if (r0 != r1) goto L_0x00e5
            com.facebook.share.internal.b r0 = r7.likeActionController
            if (r0 == 0) goto L_0x00e5
            boolean r1 = r0.f27514c
            if (r1 == 0) goto L_0x0060
            java.lang.String r0 = r0.f27515d
            goto L_0x0062
        L_0x0060:
            java.lang.String r0 = r0.f27516e
        L_0x0062:
            boolean r0 = p365hg.C12869i0.m20546B(r0)
            if (r0 != 0) goto L_0x00e5
            r7.updateBoxCountCaretPosition()
            com.facebook.share.internal.LikeBoxCountView r0 = r7.likeBoxCountView
        L_0x006d:
            r1 = 0
            r0.setVisibility(r1)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
            r3.gravity = r2
            android.widget.LinearLayout r2 = r7.containerView
            com.facebook.share.widget.LikeView$AuxiliaryViewPosition r3 = r7.auxiliaryViewPosition
            com.facebook.share.widget.LikeView$AuxiliaryViewPosition r6 = com.facebook.share.widget.LikeView.AuxiliaryViewPosition.INLINE
            if (r3 != r6) goto L_0x0082
            goto L_0x0083
        L_0x0082:
            r1 = r5
        L_0x0083:
            r2.setOrientation(r1)
            com.facebook.share.widget.LikeView$AuxiliaryViewPosition r1 = r7.auxiliaryViewPosition
            com.facebook.share.widget.LikeView$AuxiliaryViewPosition r2 = com.facebook.share.widget.LikeView.AuxiliaryViewPosition.TOP
            if (r1 == r2) goto L_0x00a0
            if (r1 != r6) goto L_0x0095
            com.facebook.share.widget.LikeView$HorizontalAlignment r1 = r7.horizontalAlignment
            com.facebook.share.widget.LikeView$HorizontalAlignment r2 = com.facebook.share.widget.LikeView.HorizontalAlignment.RIGHT
            if (r1 != r2) goto L_0x0095
            goto L_0x00a0
        L_0x0095:
            android.widget.LinearLayout r1 = r7.containerView
            r1.removeView(r0)
            android.widget.LinearLayout r1 = r7.containerView
            r1.addView(r0)
            goto L_0x00ae
        L_0x00a0:
            android.widget.LinearLayout r1 = r7.containerView
            com.facebook.share.internal.LikeButton r2 = r7.likeButton
            r1.removeView(r2)
            android.widget.LinearLayout r1 = r7.containerView
            com.facebook.share.internal.LikeButton r2 = r7.likeButton
            r1.addView(r2)
        L_0x00ae:
            int[] r1 = com.facebook.share.widget.LikeView.C12427b.f27593a
            com.facebook.share.widget.LikeView$AuxiliaryViewPosition r2 = r7.auxiliaryViewPosition
            int r2 = r2.ordinal()
            r1 = r1[r2]
            if (r1 == r5) goto L_0x00de
            r2 = 2
            if (r1 == r2) goto L_0x00d6
            if (r1 == r4) goto L_0x00c0
            goto L_0x00e5
        L_0x00c0:
            com.facebook.share.widget.LikeView$HorizontalAlignment r1 = r7.horizontalAlignment
            com.facebook.share.widget.LikeView$HorizontalAlignment r2 = com.facebook.share.widget.LikeView.HorizontalAlignment.RIGHT
            if (r1 != r2) goto L_0x00ce
            int r1 = r7.edgePadding
            int r2 = r7.internalPadding
            r0.setPadding(r1, r1, r2, r1)
            goto L_0x00e5
        L_0x00ce:
            int r1 = r7.internalPadding
            int r2 = r7.edgePadding
            r0.setPadding(r1, r2, r2, r2)
            goto L_0x00e5
        L_0x00d6:
            int r1 = r7.edgePadding
            int r2 = r7.internalPadding
            r0.setPadding(r1, r2, r1, r1)
            goto L_0x00e5
        L_0x00de:
            int r1 = r7.edgePadding
            int r2 = r7.internalPadding
            r0.setPadding(r1, r1, r1, r2)
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.widget.LikeView.updateLayout():void");
    }

    /* access modifiers changed from: private */
    public void updateLikeStateAndLayout() {
        boolean z = !this.explicitlyDisabled;
        C12348b bVar = this.likeActionController;
        if (bVar == null) {
            this.likeButton.setSelected(false);
            this.socialSentenceView.setText((CharSequence) null);
            this.likeBoxCountView.setText((String) null);
        } else {
            this.likeButton.setSelected(bVar.f27514c);
            TextView textView = this.socialSentenceView;
            C12348b bVar2 = this.likeActionController;
            textView.setText(bVar2.f27514c ? bVar2.f27517f : bVar2.f27518g);
            LikeBoxCountView likeBoxCountView2 = this.likeBoxCountView;
            C12348b bVar3 = this.likeActionController;
            likeBoxCountView2.setText(bVar3.f27514c ? bVar3.f27515d : bVar3.f27516e);
            this.likeActionController.getClass();
            z &= false;
        }
        super.setEnabled(z);
        this.likeButton.setEnabled(z);
        updateLayout();
    }

    @Deprecated
    public C12430e getOnErrorListener() {
        return this.onErrorListener;
    }

    public void onDetachedFromWindow() {
        setObjectIdAndType((String) null, ObjectType.UNKNOWN);
        super.onDetachedFromWindow();
    }

    @Deprecated
    public void setAuxiliaryViewPosition(AuxiliaryViewPosition auxiliaryViewPosition2) {
        if (auxiliaryViewPosition2 == null) {
            auxiliaryViewPosition2 = AuxiliaryViewPosition.DEFAULT;
        }
        if (this.auxiliaryViewPosition != auxiliaryViewPosition2) {
            this.auxiliaryViewPosition = auxiliaryViewPosition2;
            updateLayout();
        }
    }

    @Deprecated
    public void setEnabled(boolean z) {
        this.explicitlyDisabled = true;
        updateLikeStateAndLayout();
    }

    @Deprecated
    public void setForegroundColor(int i) {
        if (this.foregroundColor != i) {
            this.socialSentenceView.setTextColor(i);
        }
    }

    @Deprecated
    public void setFragment(Fragment fragment) {
        this.parentFragment = new C12903s(fragment);
    }

    @Deprecated
    public void setHorizontalAlignment(HorizontalAlignment horizontalAlignment2) {
        if (horizontalAlignment2 == null) {
            horizontalAlignment2 = HorizontalAlignment.DEFAULT;
        }
        if (this.horizontalAlignment != horizontalAlignment2) {
            this.horizontalAlignment = horizontalAlignment2;
            updateLayout();
        }
    }

    @Deprecated
    public void setLikeViewStyle(Style style) {
        if (style == null) {
            style = Style.DEFAULT;
        }
        if (this.likeViewStyle != style) {
            this.likeViewStyle = style;
            updateLayout();
        }
    }

    @Deprecated
    public void setObjectIdAndType(String str, ObjectType objectType2) {
        String f = C12869i0.m20567f(str, (String) null);
        if (objectType2 == null) {
            objectType2 = ObjectType.DEFAULT;
        }
        if (!C12869i0.m20562a(f, this.objectId) || objectType2 != this.objectType) {
            setObjectIdAndTypeForced(f, objectType2);
            updateLikeStateAndLayout();
        }
    }

    @Deprecated
    public void setOnErrorListener(C12430e eVar) {
        this.onErrorListener = eVar;
    }

    @Deprecated
    public void setFragment(android.app.Fragment fragment) {
        this.parentFragment = new C12903s(fragment);
    }

    @Deprecated
    public LikeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        parseAttributes(attributeSet);
        initialize(context);
    }
}
