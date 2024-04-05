package com.facebook.login.widget;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.Profile;
import kotlin.jvm.internal.C19383o;
import p365hg.C12845c0;
import p365hg.C12869i0;
import p365hg.C12904t;
import p365hg.C12910u;
import p365hg.C12913v;
import p401mg.C13080a;
import p453tf.C13434t;
import p772tq.C20203a;

public class ProfilePictureView extends FrameLayout {
    private static final String BITMAP_HEIGHT_KEY = "ProfilePictureView_height";
    private static final String BITMAP_KEY = "ProfilePictureView_bitmap";
    private static final String BITMAP_WIDTH_KEY = "ProfilePictureView_width";
    public static final int CUSTOM = -1;
    private static final boolean IS_CROPPED_DEFAULT_VALUE = true;
    private static final String IS_CROPPED_KEY = "ProfilePictureView_isCropped";
    public static final int LARGE = -4;
    private static final int MIN_SIZE = 1;
    public static final int NORMAL = -3;
    private static final String PENDING_REFRESH_KEY = "ProfilePictureView_refresh";
    private static final String PRESET_SIZE_KEY = "ProfilePictureView_presetSize";
    private static final String PROFILE_ID_KEY = "ProfilePictureView_profileId";
    public static final int SMALL = -2;
    private static final String SUPER_STATE_KEY = "ProfilePictureView_superState";
    public static final String TAG = "ProfilePictureView";
    private Bitmap customizedDefaultProfilePicture = null;
    private ImageView image;
    private Bitmap imageContents;
    private boolean isCropped = true;
    private C12910u lastRequest;
    private C12332c onErrorListener;
    private int presetSizeType = -1;
    private String profileId;
    private C13434t profileTracker;
    private int queryHeight = 0;
    private int queryWidth = 0;

    /* renamed from: com.facebook.login.widget.ProfilePictureView$a */
    public class C12330a extends C13434t {
        public C12330a() {
        }
    }

    /* renamed from: com.facebook.login.widget.ProfilePictureView$b */
    public class C12331b implements C12910u.C12911a {
        public C12331b() {
        }
    }

    /* renamed from: com.facebook.login.widget.ProfilePictureView$c */
    public interface C12332c {
        /* renamed from: a */
        void mo39702a();
    }

    static {
        Class<ProfilePictureView> cls = ProfilePictureView.class;
    }

    public ProfilePictureView(Context context) {
        super(context);
        initialize(context);
    }

    private int getPresetSizeInPixels(boolean z) {
        if (C13080a.m20762b(this)) {
            return 0;
        }
        try {
            int i = this.presetSizeType;
            int i2 = R.dimen.com_facebook_profilepictureview_preset_size_normal;
            if (i == -4) {
                i2 = R.dimen.com_facebook_profilepictureview_preset_size_large;
            } else if (i != -3) {
                if (i == -2) {
                    i2 = R.dimen.com_facebook_profilepictureview_preset_size_small;
                } else if (i != -1 || !z) {
                    return 0;
                }
            }
            return getResources().getDimensionPixelSize(i2);
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return 0;
        }
    }

    private void initialize(Context context) {
        if (!C13080a.m20762b(this)) {
            try {
                removeAllViews();
                this.image = new ImageView(context);
                this.image.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.image.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                addView(this.image);
                this.profileTracker = new C12330a();
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    private void parseAttributes(AttributeSet attributeSet) {
        if (!C13080a.m20762b(this)) {
            try {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C20203a.f44776f);
                setPresetSize(obtainStyledAttributes.getInt(1, -1));
                this.isCropped = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    /* access modifiers changed from: private */
    public void processResponse(C12913v vVar) {
        if (!C13080a.m20762b(this)) {
            try {
                if (vVar.f28475a == this.lastRequest) {
                    this.lastRequest = null;
                    Bitmap bitmap = vVar.f28478d;
                    Exception exc = vVar.f28476b;
                    if (exc != null) {
                        C12332c cVar = this.onErrorListener;
                        if (cVar != null) {
                            new FacebookException("Error in downloading profile picture for profileId: " + getProfileId(), (Throwable) exc);
                            cVar.mo39702a();
                            return;
                        }
                        C12845c0.f28334f.mo45625a(LoggingBehavior.REQUESTS, 6, TAG, exc.toString());
                    } else if (bitmap != null) {
                        setImageBitmap(bitmap);
                        if (vVar.f28477c) {
                            sendImageRequest(false);
                        }
                    }
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    /* access modifiers changed from: private */
    public void refreshImage(boolean z) {
        if (!C13080a.m20762b(this)) {
            try {
                boolean updateImageQueryParameters = updateImageQueryParameters();
                String str = this.profileId;
                if (!(str == null || str.length() == 0)) {
                    if (this.queryWidth != 0 || this.queryHeight != 0) {
                        if (updateImageQueryParameters || z) {
                            sendImageRequest(true);
                            return;
                        }
                        return;
                    }
                }
                setBlankProfilePicture();
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    private void sendImageRequest(boolean z) {
        Uri profilePictureUri;
        if (!C13080a.m20762b(this)) {
            try {
                Uri a = C12910u.C12912b.m20623a(this.profileId, this.queryWidth, this.queryHeight, AccessToken.isCurrentAccessTokenActive() ? AccessToken.getCurrentAccessToken().getToken() : "");
                Profile currentProfile = Profile.getCurrentProfile();
                if (!(!AccessToken.isLoggedInWithInstagram() || currentProfile == null || (profilePictureUri = currentProfile.getProfilePictureUri(this.queryWidth, this.queryHeight)) == null)) {
                    a = profilePictureUri;
                }
                C19383o.m32797g(getContext(), ResponseConstants.CONTEXT);
                C12910u uVar = new C12910u(a, new C12331b(), z, this);
                C12910u uVar2 = this.lastRequest;
                if (uVar2 != null) {
                    C12904t.m20618c(uVar2);
                }
                this.lastRequest = uVar;
                C12904t.m20619d(uVar);
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    private void setBlankProfilePicture() {
        if (!C13080a.m20762b(this)) {
            try {
                C12910u uVar = this.lastRequest;
                if (uVar != null) {
                    C12904t.m20618c(uVar);
                }
                if (this.customizedDefaultProfilePicture == null) {
                    setImageBitmap(BitmapFactory.decodeResource(getResources(), isCropped() ? R.drawable.com_facebook_profile_picture_blank_square : R.drawable.com_facebook_profile_picture_blank_portrait));
                    return;
                }
                updateImageQueryParameters();
                setImageBitmap(Bitmap.createScaledBitmap(this.customizedDefaultProfilePicture, this.queryWidth, this.queryHeight, false));
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    private void setImageBitmap(Bitmap bitmap) {
        if (!C13080a.m20762b(this)) {
            try {
                ImageView imageView = this.image;
                if (imageView != null && bitmap != null) {
                    this.imageContents = bitmap;
                    imageView.setImageBitmap(bitmap);
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    private boolean updateImageQueryParameters() {
        if (C13080a.m20762b(this)) {
            return false;
        }
        try {
            int height = getHeight();
            int width = getWidth();
            boolean z = true;
            if (width >= 1) {
                if (height >= 1) {
                    int presetSizeInPixels = getPresetSizeInPixels(false);
                    if (presetSizeInPixels != 0) {
                        height = presetSizeInPixels;
                        width = height;
                    }
                    if (width <= height) {
                        height = isCropped() ? width : 0;
                    } else {
                        width = isCropped() ? height : 0;
                    }
                    if (width == this.queryWidth) {
                        if (height == this.queryHeight) {
                            z = false;
                        }
                    }
                    this.queryWidth = width;
                    this.queryHeight = height;
                    return z;
                }
            }
            return false;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return false;
        }
    }

    public final C12332c getOnErrorListener() {
        return this.onErrorListener;
    }

    public final int getPresetSize() {
        return this.presetSizeType;
    }

    public final String getProfileId() {
        return this.profileId;
    }

    public final boolean getShouldUpdateOnProfileChange() {
        return this.profileTracker.f29424c;
    }

    public final boolean isCropped() {
        return this.isCropped;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.lastRequest = null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        refreshImage(false);
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        boolean z2 = true;
        if (View.MeasureSpec.getMode(i2) == 1073741824 || layoutParams.height != -2) {
            z = false;
        } else {
            size = getPresetSizeInPixels(true);
            i2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            z = true;
        }
        if (View.MeasureSpec.getMode(i) == 1073741824 || layoutParams.width != -2) {
            z2 = z;
        } else {
            size2 = getPresetSizeInPixels(true);
            i = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
        }
        if (z2) {
            setMeasuredDimension(size2, size);
            measureChildren(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable.getClass() != Bundle.class) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable(SUPER_STATE_KEY));
        this.profileId = bundle.getString(PROFILE_ID_KEY);
        this.presetSizeType = bundle.getInt(PRESET_SIZE_KEY);
        this.isCropped = bundle.getBoolean(IS_CROPPED_KEY);
        this.queryWidth = bundle.getInt(BITMAP_WIDTH_KEY);
        this.queryHeight = bundle.getInt(BITMAP_HEIGHT_KEY);
        refreshImage(true);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable(SUPER_STATE_KEY, onSaveInstanceState);
        bundle.putString(PROFILE_ID_KEY, this.profileId);
        bundle.putInt(PRESET_SIZE_KEY, this.presetSizeType);
        bundle.putBoolean(IS_CROPPED_KEY, this.isCropped);
        bundle.putInt(BITMAP_WIDTH_KEY, this.queryWidth);
        bundle.putInt(BITMAP_HEIGHT_KEY, this.queryHeight);
        bundle.putBoolean(PENDING_REFRESH_KEY, this.lastRequest != null);
        return bundle;
    }

    public final void setCropped(boolean z) {
        this.isCropped = z;
        refreshImage(false);
    }

    public final void setDefaultProfilePicture(Bitmap bitmap) {
        this.customizedDefaultProfilePicture = bitmap;
    }

    public final void setOnErrorListener(C12332c cVar) {
        this.onErrorListener = cVar;
    }

    public final void setPresetSize(int i) {
        if (i == -4 || i == -3 || i == -2 || i == -1) {
            this.presetSizeType = i;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Must use a predefined preset size");
    }

    public final void setProfileId(String str) {
        boolean z;
        if (C12869i0.m20546B(this.profileId) || !this.profileId.equalsIgnoreCase(str)) {
            setBlankProfilePicture();
            z = true;
        } else {
            z = false;
        }
        this.profileId = str;
        refreshImage(z);
    }

    public final void setShouldUpdateOnProfileChange(boolean z) {
        if (z) {
            C13434t tVar = this.profileTracker;
            if (!tVar.f29424c) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
                tVar.f29423b.mo20708b(tVar.f29422a, intentFilter);
                tVar.f29424c = true;
                return;
            }
            return;
        }
        C13434t tVar2 = this.profileTracker;
        if (tVar2.f29424c) {
            tVar2.f29423b.mo20710d(tVar2.f29422a);
            tVar2.f29424c = false;
        }
    }

    public ProfilePictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(context);
        parseAttributes(attributeSet);
    }

    public ProfilePictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize(context);
        parseAttributes(attributeSet);
    }
}
