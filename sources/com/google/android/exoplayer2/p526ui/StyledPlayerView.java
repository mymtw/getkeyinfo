package com.google.android.exoplayer2.p526ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.etsy.android.R;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.p526ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.p526ui.StyledPlayerControlView;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C14391d;
import com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19382n;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p260v0.C8184a;
import p513bj.C14049b0;
import p513bj.C14054f;
import p513bj.C14075p;
import p594jh.C17884a1;
import p594jh.C17915h;
import p594jh.C17939k1;
import p594jh.C17988z0;
import p610kp.C18161c;
import p636oi.C18296a;
import p718yi.C18887e;

/* renamed from: com.google.android.exoplayer2.ui.StyledPlayerView */
public class StyledPlayerView extends FrameLayout {
    private static final int PICTURE_TYPE_FRONT_COVER = 3;
    private static final int PICTURE_TYPE_NOT_SET = -1;
    public static final int SHOW_BUFFERING_ALWAYS = 2;
    public static final int SHOW_BUFFERING_NEVER = 0;
    public static final int SHOW_BUFFERING_WHEN_PLAYING = 1;
    private static final int SURFACE_TYPE_NONE = 0;
    private static final int SURFACE_TYPE_SPHERICAL_GL_SURFACE_VIEW = 3;
    private static final int SURFACE_TYPE_SURFACE_VIEW = 1;
    private static final int SURFACE_TYPE_TEXTURE_VIEW = 2;
    private static final int SURFACE_TYPE_VIDEO_DECODER_GL_SURFACE_VIEW = 4;
    private final FrameLayout adOverlayFrameLayout;
    private final ImageView artworkView;
    private final View bufferingView;
    private final C14410a componentListener;
    /* access modifiers changed from: private */
    public final AspectRatioFrameLayout contentFrame;
    private final StyledPlayerControlView controller;
    private boolean controllerAutoShow;
    /* access modifiers changed from: private */
    public boolean controllerHideDuringAds;
    private boolean controllerHideOnTouch;
    private int controllerShowTimeoutMs;
    private StyledPlayerControlView.C14409l controllerVisibilityListener;
    private CharSequence customErrorMessage;
    private Drawable defaultArtwork;
    private C14054f<? super ExoPlaybackException> errorMessageProvider;
    private final TextView errorMessageView;
    private boolean isTouching;
    private boolean keepContentOnPlayerReset;
    private final FrameLayout overlayFrameLayout;
    /* access modifiers changed from: private */
    public C17884a1 player;
    private int showBuffering;
    /* access modifiers changed from: private */
    public final View shutterView;
    /* access modifiers changed from: private */
    public final SubtitleView subtitleView;
    /* access modifiers changed from: private */
    public final View surfaceView;
    /* access modifiers changed from: private */
    public final boolean surfaceViewIgnoresVideoAspectRatio;
    /* access modifiers changed from: private */
    public int textureViewRotation;
    private boolean useArtwork;
    private boolean useController;

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerView$a */
    public final class C14410a implements C17884a1.C17888d, View.OnLayoutChangeListener, View.OnClickListener, StyledPlayerControlView.C14409l {

        /* renamed from: b */
        public final C17939k1.C17941b f32441b = new C17939k1.C17941b();

        /* renamed from: c */
        public Object f32442c;

        public C14410a() {
        }

        /* renamed from: a */
        public final void mo48081a(int i) {
            StyledPlayerView.this.updateContentDescription();
        }

        public final void onClick(View view) {
            boolean unused = StyledPlayerView.this.toggleControllerVisibility();
        }

        public final void onCues(List<C18296a> list) {
            if (StyledPlayerView.this.subtitleView != null) {
                StyledPlayerView.this.subtitleView.onCues(list);
            }
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            StyledPlayerView.applyTextureViewRotation((TextureView) view, StyledPlayerView.this.textureViewRotation);
        }

        public final void onPlayWhenReadyChanged(boolean z, int i) {
            StyledPlayerView.this.updateBuffering();
            StyledPlayerView.this.updateControllerVisibility();
        }

        public final void onPlaybackStateChanged(int i) {
            StyledPlayerView.this.updateBuffering();
            StyledPlayerView.this.updateErrorMessage();
            StyledPlayerView.this.updateControllerVisibility();
        }

        public final void onPositionDiscontinuity(C17884a1.C17889e eVar, C17884a1.C17889e eVar2, int i) {
            if (StyledPlayerView.this.isPlayingAd() && StyledPlayerView.this.controllerHideDuringAds) {
                StyledPlayerView.this.hideController();
            }
        }

        public final void onRenderedFirstFrame() {
            if (StyledPlayerView.this.shutterView != null) {
                StyledPlayerView.this.shutterView.setVisibility(4);
            }
        }

        public final void onTracksChanged(TrackGroupArray trackGroupArray, C18887e eVar) {
            C17884a1 access$700 = StyledPlayerView.this.player;
            access$700.getClass();
            C17939k1 r = access$700.mo69338r();
            if (r.mo69481p()) {
                this.f32442c = null;
            } else if (!access$700.mo69337q().isEmpty()) {
                this.f32442c = r.mo47630f(access$700.mo69300A(), this.f32441b, true).f39099b;
            } else {
                Object obj = this.f32442c;
                if (obj != null) {
                    int b = r.mo47698b(obj);
                    if (b == -1 || access$700.mo69327j() != r.mo47630f(b, this.f32441b, false).f39100c) {
                        this.f32442c = null;
                    } else {
                        return;
                    }
                }
            }
            StyledPlayerView.this.updateForCurrentTrackSelections(false);
        }

        public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
            float f2 = (i2 == 0 || i == 0) ? 1.0f : (((float) i) * f) / ((float) i2);
            if (StyledPlayerView.this.surfaceView instanceof TextureView) {
                if (i3 == 90 || i3 == 270) {
                    f2 = 1.0f / f2;
                }
                if (StyledPlayerView.this.textureViewRotation != 0) {
                    StyledPlayerView.this.surfaceView.removeOnLayoutChangeListener(this);
                }
                int unused = StyledPlayerView.this.textureViewRotation = i3;
                if (StyledPlayerView.this.textureViewRotation != 0) {
                    StyledPlayerView.this.surfaceView.addOnLayoutChangeListener(this);
                }
                StyledPlayerView.applyTextureViewRotation((TextureView) StyledPlayerView.this.surfaceView, StyledPlayerView.this.textureViewRotation);
            }
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            AspectRatioFrameLayout access$400 = styledPlayerView.contentFrame;
            if (StyledPlayerView.this.surfaceViewIgnoresVideoAspectRatio) {
                f2 = 0.0f;
            }
            styledPlayerView.onContentAspectRatioChanged(access$400, f2);
        }
    }

    public StyledPlayerView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    public static void applyTextureViewRotation(TextureView textureView, int i) {
        Matrix matrix = new Matrix();
        float width = (float) textureView.getWidth();
        float height = (float) textureView.getHeight();
        if (!(width == 0.0f || height == 0.0f || i == 0)) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.postRotate((float) i, f, f2);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        }
        textureView.setTransform(matrix);
    }

    private void closeShutter() {
        View view = this.shutterView;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void configureEditModeLogo(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R.drawable.exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color));
    }

    private static void configureEditModeLogoV23(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R.drawable.exo_edit_mode_logo, (Resources.Theme) null));
        imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, (Resources.Theme) null));
    }

    private void hideArtwork() {
        ImageView imageView = this.artworkView;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            this.artworkView.setVisibility(4);
        }
    }

    @SuppressLint({"InlinedApi"})
    private boolean isDpadKey(int i) {
        return i == 19 || i == 270 || i == 22 || i == 271 || i == 20 || i == 269 || i == 21 || i == 268 || i == 23;
    }

    /* access modifiers changed from: private */
    public boolean isPlayingAd() {
        C17884a1 a1Var = this.player;
        return a1Var != null && a1Var.mo69317d() && this.player.mo69348x();
    }

    private void maybeShowController(boolean z) {
        if ((!isPlayingAd() || !this.controllerHideDuringAds) && useController()) {
            boolean z2 = this.controller.isFullyVisible() && this.controller.getShowTimeoutMs() <= 0;
            boolean shouldShowControllerIndefinitely = shouldShowControllerIndefinitely();
            if (z || z2 || shouldShowControllerIndefinitely) {
                showController(shouldShowControllerIndefinitely);
            }
        }
    }

    @RequiresNonNull({"artworkView"})
    private boolean setArtworkFromMetadata(Metadata metadata) {
        byte[] bArr;
        int i;
        int i2 = -1;
        int i3 = 0;
        boolean z = false;
        while (i3 < metadata.length()) {
            Metadata.Entry entry = metadata.get(i3);
            if (entry instanceof ApicFrame) {
                ApicFrame apicFrame = (ApicFrame) entry;
                bArr = apicFrame.pictureData;
                i = apicFrame.pictureType;
            } else if (entry instanceof PictureFrame) {
                PictureFrame pictureFrame = (PictureFrame) entry;
                bArr = pictureFrame.pictureData;
                i = pictureFrame.pictureType;
            } else {
                continue;
                i3++;
            }
            if (i2 == -1 || i == 3) {
                z = setDrawableArtwork(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                if (i == 3) {
                    break;
                }
                i2 = i;
                i3++;
            } else {
                i3++;
            }
        }
        return z;
    }

    @RequiresNonNull({"artworkView"})
    private boolean setDrawableArtwork(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                onContentAspectRatioChanged(this.contentFrame, ((float) intrinsicWidth) / ((float) intrinsicHeight));
                this.artworkView.setImageDrawable(drawable);
                this.artworkView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private static void setResizeModeRaw(AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
        aspectRatioFrameLayout.setResizeMode(i);
    }

    private boolean shouldShowControllerIndefinitely() {
        C17884a1 a1Var = this.player;
        if (a1Var == null) {
            return true;
        }
        int playbackState = a1Var.getPlaybackState();
        if (this.controllerAutoShow && !this.player.mo69338r().mo69481p()) {
            if (playbackState == 1 || playbackState == 4) {
                return true;
            }
            C17884a1 a1Var2 = this.player;
            a1Var2.getClass();
            if (!a1Var2.mo69348x()) {
                return true;
            }
        }
        return false;
    }

    public static void switchTargetView(C17884a1 a1Var, StyledPlayerView styledPlayerView, StyledPlayerView styledPlayerView2) {
        if (styledPlayerView != styledPlayerView2) {
            if (styledPlayerView2 != null) {
                styledPlayerView2.setPlayer(a1Var);
            }
            if (styledPlayerView != null) {
                styledPlayerView.setPlayer((C17884a1) null);
            }
        }
    }

    /* access modifiers changed from: private */
    public boolean toggleControllerVisibility() {
        if (useController() && this.player != null) {
            if (!this.controller.isFullyVisible()) {
                maybeShowController(true);
                return true;
            } else if (this.controllerHideOnTouch) {
                this.controller.hide();
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void updateBuffering() {
        int i;
        if (this.bufferingView != null) {
            C17884a1 a1Var = this.player;
            boolean z = true;
            int i2 = 0;
            if (a1Var == null || a1Var.getPlaybackState() != 2 || ((i = this.showBuffering) != 2 && (i != 1 || !this.player.mo69348x()))) {
                z = false;
            }
            View view = this.bufferingView;
            if (!z) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    /* access modifiers changed from: private */
    public void updateContentDescription() {
        StyledPlayerControlView styledPlayerControlView = this.controller;
        String str = null;
        if (styledPlayerControlView == null || !this.useController) {
            setContentDescription((CharSequence) null);
        } else if (styledPlayerControlView.isFullyVisible()) {
            if (this.controllerHideOnTouch) {
                str = getResources().getString(R.string.exo_controls_hide);
            }
            setContentDescription(str);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    /* access modifiers changed from: private */
    public void updateControllerVisibility() {
        if (!isPlayingAd() || !this.controllerHideDuringAds) {
            maybeShowController(false);
        } else {
            hideController();
        }
    }

    /* access modifiers changed from: private */
    public void updateErrorMessage() {
        C14054f<? super ExoPlaybackException> fVar;
        TextView textView = this.errorMessageView;
        if (textView != null) {
            CharSequence charSequence = this.customErrorMessage;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.errorMessageView.setVisibility(0);
                return;
            }
            C17884a1 a1Var = this.player;
            if ((a1Var != null ? a1Var.mo69328k() : null) == null || (fVar = this.errorMessageProvider) == null) {
                this.errorMessageView.setVisibility(8);
                return;
            }
            this.errorMessageView.setText((CharSequence) fVar.mo46873a().second);
            this.errorMessageView.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public void updateForCurrentTrackSelections(boolean z) {
        C17884a1 a1Var = this.player;
        if (a1Var != null && !a1Var.mo69337q().isEmpty()) {
            if (z && !this.keepContentOnPlayerReset) {
                closeShutter();
            }
            if (C14391d.m22799a(a1Var.mo69346v())) {
                hideArtwork();
                return;
            }
            closeShutter();
            if (useArtwork()) {
                for (Metadata artworkFromMetadata : a1Var.mo69319g()) {
                    if (setArtworkFromMetadata(artworkFromMetadata)) {
                        return;
                    }
                }
                if (setDrawableArtwork(this.defaultArtwork)) {
                    return;
                }
            }
            hideArtwork();
        } else if (!this.keepContentOnPlayerReset) {
            hideArtwork();
            closeShutter();
        }
    }

    @EnsuresNonNullIf(expression = {"artworkView"}, result = true)
    private boolean useArtwork() {
        if (!this.useArtwork) {
            return false;
        }
        C14075p.m21696h(this.artworkView);
        return true;
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    private boolean useController() {
        if (!this.useController) {
            return false;
        }
        C14075p.m21696h(this.controller);
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C17884a1 a1Var = this.player;
        if (a1Var != null && a1Var.mo69317d()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean isDpadKey = isDpadKey(keyEvent.getKeyCode());
        if (isDpadKey && useController() && !this.controller.isFullyVisible()) {
            maybeShowController(true);
        } else if (dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            maybeShowController(true);
        } else if (!isDpadKey || !useController()) {
            return false;
        } else {
            maybeShowController(true);
            return false;
        }
        return true;
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        return useController() && this.controller.dispatchMediaKeyEvent(keyEvent);
    }

    public List<C18161c> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        if (this.overlayFrameLayout != null) {
            arrayList.add(new C18161c(0));
        }
        if (this.controller != null) {
            arrayList.add(new C18161c());
        }
        return ImmutableList.copyOf(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.adOverlayFrameLayout;
        C14075p.m21697i(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public boolean getControllerAutoShow() {
        return this.controllerAutoShow;
    }

    public boolean getControllerHideOnTouch() {
        return this.controllerHideOnTouch;
    }

    public int getControllerShowTimeoutMs() {
        return this.controllerShowTimeoutMs;
    }

    public Drawable getDefaultArtwork() {
        return this.defaultArtwork;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.overlayFrameLayout;
    }

    public C17884a1 getPlayer() {
        return this.player;
    }

    public int getResizeMode() {
        C14075p.m21696h(this.contentFrame);
        return this.contentFrame.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.subtitleView;
    }

    public boolean getUseArtwork() {
        return this.useArtwork;
    }

    public boolean getUseController() {
        return this.useController;
    }

    public View getVideoSurfaceView() {
        return this.surfaceView;
    }

    public void hideController() {
        StyledPlayerControlView styledPlayerControlView = this.controller;
        if (styledPlayerControlView != null) {
            styledPlayerControlView.hide();
        }
    }

    public boolean isControllerFullyVisible() {
        StyledPlayerControlView styledPlayerControlView = this.controller;
        return styledPlayerControlView != null && styledPlayerControlView.isFullyVisible();
    }

    public void onContentAspectRatioChanged(AspectRatioFrameLayout aspectRatioFrameLayout, float f) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    public void onPause() {
        View view = this.surfaceView;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onPause();
        }
    }

    public void onResume() {
        View view = this.surfaceView;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onResume();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!useController() || this.player == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.isTouching = true;
            return true;
        } else if (action != 1 || !this.isTouching) {
            return false;
        } else {
            this.isTouching = false;
            return performClick();
        }
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!useController() || this.player == null) {
            return false;
        }
        maybeShowController(true);
        return true;
    }

    public boolean performClick() {
        super.performClick();
        return toggleControllerVisibility();
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.C14392a aVar) {
        C14075p.m21696h(this.contentFrame);
        this.contentFrame.setAspectRatioListener(aVar);
    }

    public void setControlDispatcher(C17915h hVar) {
        C14075p.m21696h(this.controller);
        this.controller.setControlDispatcher(hVar);
    }

    public void setControllerAutoShow(boolean z) {
        this.controllerAutoShow = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.controllerHideDuringAds = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        C14075p.m21696h(this.controller);
        this.controllerHideOnTouch = z;
        updateContentDescription();
    }

    public void setControllerOnFullScreenModeChangedListener(StyledPlayerControlView.C14400c cVar) {
        C14075p.m21696h(this.controller);
        this.controller.setOnFullScreenModeChangedListener(cVar);
    }

    public void setControllerShowTimeoutMs(int i) {
        C14075p.m21696h(this.controller);
        this.controllerShowTimeoutMs = i;
        if (this.controller.isFullyVisible()) {
            showController();
        }
    }

    public void setControllerVisibilityListener(StyledPlayerControlView.C14409l lVar) {
        C14075p.m21696h(this.controller);
        StyledPlayerControlView.C14409l lVar2 = this.controllerVisibilityListener;
        if (lVar2 != lVar) {
            if (lVar2 != null) {
                this.controller.removeVisibilityListener(lVar2);
            }
            this.controllerVisibilityListener = lVar;
            if (lVar != null) {
                this.controller.addVisibilityListener(lVar);
            }
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        C14075p.m21694f(this.errorMessageView != null);
        this.customErrorMessage = charSequence;
        updateErrorMessage();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.defaultArtwork != drawable) {
            this.defaultArtwork = drawable;
            updateForCurrentTrackSelections(false);
        }
    }

    public void setErrorMessageProvider(C14054f<? super ExoPlaybackException> fVar) {
        if (this.errorMessageProvider != fVar) {
            this.errorMessageProvider = fVar;
            updateErrorMessage();
        }
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        C14075p.m21696h(this.controller);
        this.controller.setExtraAdGroupMarkers(jArr, zArr);
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.keepContentOnPlayerReset != z) {
            this.keepContentOnPlayerReset = z;
            updateForCurrentTrackSelections(false);
        }
    }

    @Deprecated
    public void setPlaybackPreparer(C17988z0 z0Var) {
        C14075p.m21696h(this.controller);
        this.controller.setPlaybackPreparer(z0Var);
    }

    public void setPlayer(C17884a1 a1Var) {
        C14075p.m21694f(Looper.myLooper() == Looper.getMainLooper());
        C14075p.m21691c(a1Var == null || a1Var.mo69340s() == Looper.getMainLooper());
        C17884a1 a1Var2 = this.player;
        if (a1Var2 != a1Var) {
            if (a1Var2 != null) {
                a1Var2.mo69309J(this.componentListener);
                View view = this.surfaceView;
                if (view instanceof TextureView) {
                    a1Var2.mo69301B((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    a1Var2.mo69310K((SurfaceView) view);
                }
            }
            SubtitleView subtitleView2 = this.subtitleView;
            if (subtitleView2 != null) {
                subtitleView2.setCues((List<C18296a>) null);
            }
            this.player = a1Var;
            if (useController()) {
                this.controller.setPlayer(a1Var);
            }
            updateBuffering();
            updateErrorMessage();
            updateForCurrentTrackSelections(true);
            if (a1Var != null) {
                if (a1Var.mo69332o(21)) {
                    View view2 = this.surfaceView;
                    if (view2 instanceof TextureView) {
                        a1Var.mo69345u((TextureView) view2);
                    } else if (view2 instanceof SurfaceView) {
                        a1Var.mo69325i((SurfaceView) view2);
                    }
                }
                if (this.subtitleView != null && a1Var.mo69332o(22)) {
                    this.subtitleView.setCues(a1Var.mo69330m());
                }
                a1Var.mo69306G(this.componentListener);
                maybeShowController(false);
                return;
            }
            hideController();
        }
    }

    public void setRepeatToggleModes(int i) {
        C14075p.m21696h(this.controller);
        this.controller.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        C14075p.m21696h(this.contentFrame);
        this.contentFrame.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.showBuffering != i) {
            this.showBuffering = i;
            updateBuffering();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        C14075p.m21696h(this.controller);
        this.controller.setShowFastForwardButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        C14075p.m21696h(this.controller);
        this.controller.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        C14075p.m21696h(this.controller);
        this.controller.setShowNextButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        C14075p.m21696h(this.controller);
        this.controller.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        C14075p.m21696h(this.controller);
        this.controller.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        C14075p.m21696h(this.controller);
        this.controller.setShowShuffleButton(z);
    }

    public void setShowSubtitleButton(boolean z) {
        C14075p.m21696h(this.controller);
        this.controller.setShowSubtitleButton(z);
    }

    public void setShowVrButton(boolean z) {
        C14075p.m21696h(this.controller);
        this.controller.setShowVrButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.shutterView;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setUseArtwork(boolean z) {
        C14075p.m21694f(!z || this.artworkView != null);
        if (this.useArtwork != z) {
            this.useArtwork = z;
            updateForCurrentTrackSelections(false);
        }
    }

    public void setUseController(boolean z) {
        C14075p.m21694f(!z || this.controller != null);
        if (this.useController != z) {
            this.useController = z;
            if (useController()) {
                this.controller.setPlayer(this.player);
            } else {
                StyledPlayerControlView styledPlayerControlView = this.controller;
                if (styledPlayerControlView != null) {
                    styledPlayerControlView.hide();
                    this.controller.setPlayer((C17884a1) null);
                }
            }
            updateContentDescription();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.surfaceView;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public void showController() {
        showController(shouldShowControllerIndefinitely());
    }

    public StyledPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void showController(boolean z) {
        if (useController()) {
            this.controller.setShowTimeoutMs(z ? 0 : this.controllerShowTimeoutMs);
            this.controller.show();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StyledPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z5;
        boolean z6;
        int i6;
        boolean z7;
        boolean z8;
        boolean z9;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        C14410a aVar = new C14410a();
        this.componentListener = aVar;
        if (isInEditMode()) {
            this.contentFrame = null;
            this.shutterView = null;
            this.surfaceView = null;
            this.surfaceViewIgnoresVideoAspectRatio = false;
            this.artworkView = null;
            this.subtitleView = null;
            this.bufferingView = null;
            this.errorMessageView = null;
            this.controller = null;
            this.adOverlayFrameLayout = null;
            this.overlayFrameLayout = null;
            ImageView imageView = new ImageView(context2);
            if (C14049b0.f30913a >= 23) {
                configureEditModeLogoV23(getResources(), imageView);
            } else {
                configureEditModeLogo(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i7 = R.layout.exo_styled_player_view;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C19382n.f43267q, 0, 0);
            try {
                boolean hasValue = obtainStyledAttributes.hasValue(29);
                int color = obtainStyledAttributes.getColor(29, 0);
                int resourceId = obtainStyledAttributes.getResourceId(15, R.layout.exo_styled_player_view);
                boolean z10 = obtainStyledAttributes.getBoolean(34, true);
                int resourceId2 = obtainStyledAttributes.getResourceId(8, 0);
                boolean z11 = obtainStyledAttributes.getBoolean(35, true);
                int i8 = obtainStyledAttributes.getInt(30, 1);
                int i9 = obtainStyledAttributes.getInt(17, 0);
                int i10 = obtainStyledAttributes.getInt(27, 5000);
                boolean z12 = obtainStyledAttributes.getBoolean(11, true);
                int i11 = resourceId;
                boolean z13 = obtainStyledAttributes.getBoolean(3, true);
                int integer = obtainStyledAttributes.getInteger(24, 0);
                this.keepContentOnPlayerReset = obtainStyledAttributes.getBoolean(12, this.keepContentOnPlayerReset);
                boolean z14 = obtainStyledAttributes.getBoolean(10, true);
                obtainStyledAttributes.recycle();
                i4 = resourceId2;
                z3 = z10;
                z4 = hasValue;
                i2 = color;
                i3 = integer;
                int i12 = i8;
                z7 = z14;
                i7 = i11;
                z2 = i10;
                z6 = z12;
                i6 = i12;
                boolean z15 = z11;
                i5 = i9;
                z5 = z13;
                z = z15;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z2 = true;
            z7 = true;
            i6 = 1;
            z6 = true;
            z5 = true;
            z3 = true;
            z = true;
            i5 = 0;
            i4 = 0;
            i3 = 0;
            i2 = 0;
            z4 = false;
        }
        LayoutInflater.from(context).inflate(i7, this);
        setDescendantFocusability(PrimitiveArrayBuilder.MAX_CHUNK_SIZE);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.contentFrame = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            setResizeModeRaw(aspectRatioFrameLayout, i5);
        }
        View findViewById = findViewById(R.id.exo_shutter);
        this.shutterView = findViewById;
        if (findViewById != null && z4) {
            findViewById.setBackgroundColor(i2);
        }
        if (aspectRatioFrameLayout == null || i6 == 0) {
            this.surfaceView = null;
            z8 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i6 == 2) {
                this.surfaceView = new TextureView(context2);
            } else if (i6 == 3) {
                this.surfaceView = new SphericalGLSurfaceView(context2);
                z8 = true;
                this.surfaceView.setLayoutParams(layoutParams);
                this.surfaceView.setOnClickListener(aVar);
                this.surfaceView.setClickable(false);
                aspectRatioFrameLayout.addView(this.surfaceView, 0);
            } else if (i6 != 4) {
                this.surfaceView = new SurfaceView(context2);
            } else {
                this.surfaceView = new VideoDecoderGLSurfaceView(context2);
            }
            z8 = false;
            this.surfaceView.setLayoutParams(layoutParams);
            this.surfaceView.setOnClickListener(aVar);
            this.surfaceView.setClickable(false);
            aspectRatioFrameLayout.addView(this.surfaceView, 0);
        }
        this.surfaceViewIgnoresVideoAspectRatio = z8;
        this.adOverlayFrameLayout = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.overlayFrameLayout = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.artworkView = imageView2;
        this.useArtwork = z3 && imageView2 != null;
        if (i4 != 0) {
            Context context3 = getContext();
            Object obj = C8184a.f17966a;
            this.defaultArtwork = C8184a.C8187c.m16466b(context3, i4);
        }
        SubtitleView subtitleView2 = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.subtitleView = subtitleView2;
        if (subtitleView2 != null) {
            subtitleView2.setUserDefaultStyle();
            subtitleView2.setUserDefaultTextSize();
        }
        View findViewById2 = findViewById(R.id.exo_buffering);
        this.bufferingView = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.showBuffering = i3;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.errorMessageView = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        StyledPlayerControlView styledPlayerControlView = (StyledPlayerControlView) findViewById(R.id.exo_controller);
        View findViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (styledPlayerControlView != null) {
            this.controller = styledPlayerControlView;
            z9 = false;
        } else if (findViewById3 != null) {
            z9 = false;
            StyledPlayerControlView styledPlayerControlView2 = new StyledPlayerControlView(context2, (AttributeSet) null, 0, attributeSet2);
            this.controller = styledPlayerControlView2;
            styledPlayerControlView2.setId(R.id.exo_controller);
            styledPlayerControlView2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(styledPlayerControlView2, indexOfChild);
        } else {
            z9 = false;
            this.controller = null;
        }
        StyledPlayerControlView styledPlayerControlView3 = this.controller;
        this.controllerShowTimeoutMs = styledPlayerControlView3 != null ? z2 : z9 ? 1 : 0;
        this.controllerHideOnTouch = z6;
        this.controllerAutoShow = z5;
        this.controllerHideDuringAds = z7;
        this.useController = (!z || styledPlayerControlView3 == null) ? z9 : true;
        if (styledPlayerControlView3 != null) {
            styledPlayerControlView3.hideImmediately();
            this.controller.addVisibilityListener(aVar);
        }
        updateContentDescription();
    }
}
