package com.etsy.android.stylekit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C2885q;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import com.appboy.Constants;
import com.braze.p044ui.inappmessage.views.C5701g;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.p526ui.C14420c;
import com.google.android.exoplayer2.p526ui.DefaultTimeBar;
import com.google.android.exoplayer2.p526ui.PlayerView;
import com.google.android.exoplayer2.p526ui.SubtitleView;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$BooleanRef;
import p388lb.C13006a;
import p513bj.C14075p;
import p513bj.C14083w;
import p520cj.C14166q;
import p594jh.C17884a1;
import p594jh.C17916h0;
import p594jh.C17918h1;
import p594jh.C17921i1;
import p594jh.C17939k1;
import p594jh.C17954o0;
import p594jh.C17963p0;
import p594jh.C17986y0;
import p611lh.C18167d;
import p627nh.C18260a;
import p718yi.C18887e;

public final class CollagePlayerView extends PlayerView implements C17884a1.C17888d, C2885q {
    public static final int $stable = 8;
    private ImageButton captionsDisableButton;
    private ImageButton captionsEnableButton;
    private CountDirection countDirection;
    /* access modifiers changed from: private */
    public TextView countdownText;
    private final StringBuilder formatBuilder;
    private final Formatter formatter;
    private C17884a1.C17888d listener;
    private ImageButton muteButton;
    /* access modifiers changed from: private */
    public boolean mutedByUser;
    private final C9041c progressRunnable;
    /* access modifiers changed from: private */
    public TextView progressTextFullControls;
    /* access modifiers changed from: private */
    public boolean showProgressText;
    private ImageButton unmuteButton;
    private Uri videoUri;

    public enum CountDirection {
        UP,
        DOWN
    }

    /* renamed from: com.etsy.android.stylekit.views.CollagePlayerView$a */
    public /* synthetic */ class C9039a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19911a;

        static {
            int[] iArr = new int[CountDirection.values().length];
            iArr[CountDirection.UP.ordinal()] = 1;
            iArr[CountDirection.DOWN.ordinal()] = 2;
            f19911a = iArr;
        }
    }

    /* renamed from: com.etsy.android.stylekit.views.CollagePlayerView$b */
    public static final class C9040b implements C14420c.C14421a {

        /* renamed from: b */
        public final /* synthetic */ C17921i1 f19912b;

        /* renamed from: c */
        public final /* synthetic */ CollagePlayerView f19913c;

        /* renamed from: d */
        public final /* synthetic */ Ref$BooleanRef f19914d;

        public C9040b(C17921i1 i1Var, CollagePlayerView collagePlayerView, Ref$BooleanRef ref$BooleanRef) {
            this.f19912b = i1Var;
            this.f19913c = collagePlayerView;
            this.f19914d = ref$BooleanRef;
        }

        /* renamed from: a */
        public final void mo30962a(C14420c cVar, long j) {
            C19383o.m32797g(cVar, "timeBar");
            this.f19912b.mo69329l(false);
            if (!this.f19913c.mutedByUser) {
                this.f19912b.mo69316c(0.0f);
            }
            this.f19912b.seekTo(j);
            CollagePlayerView collagePlayerView = this.f19913c;
            collagePlayerView.updateProgressText(collagePlayerView.progressTextFullControls, j);
        }

        /* renamed from: b */
        public final void mo30963b(C14420c cVar, long j, boolean z) {
            C19383o.m32797g(cVar, "timeBar");
            this.f19912b.seekTo(j);
            if (!this.f19913c.mutedByUser) {
                this.f19912b.mo69316c(1.0f);
            }
            if (!this.f19914d.element) {
                this.f19912b.mo69329l(true);
            }
        }

        /* renamed from: c */
        public final void mo30964c(C14420c cVar, long j) {
            C19383o.m32797g(cVar, "timeBar");
            this.f19914d.element = !this.f19913c.isPlaying();
        }
    }

    /* renamed from: com.etsy.android.stylekit.views.CollagePlayerView$c */
    public static final class C9041c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ CollagePlayerView f19915b;

        public C9041c(CollagePlayerView collagePlayerView) {
            this.f19915b = collagePlayerView;
        }

        public final void run() {
            if (this.f19915b.showProgressText) {
                TextView access$getCountdownText$p = this.f19915b.countdownText;
                if (access$getCountdownText$p != null) {
                    CollagePlayerView collagePlayerView = this.f19915b;
                    collagePlayerView.updateProgressText(access$getCountdownText$p, collagePlayerView.currentPosition());
                    TextView access$getCountdownText$p2 = collagePlayerView.countdownText;
                    if (access$getCountdownText$p2 != null) {
                        access$getCountdownText$p2.setVisibility(0);
                    }
                    Handler handler = collagePlayerView.getHandler();
                    if (handler != null) {
                        handler.postDelayed(this, 1000);
                    }
                }
                TextView access$getProgressTextFullControls$p = this.f19915b.progressTextFullControls;
                if (access$getProgressTextFullControls$p != null) {
                    CollagePlayerView collagePlayerView2 = this.f19915b;
                    access$getProgressTextFullControls$p.setVisibility(0);
                    collagePlayerView2.updateProgressText(access$getProgressTextFullControls$p, collagePlayerView2.currentPosition());
                    Handler handler2 = collagePlayerView2.getHandler();
                    if (handler2 != null) {
                        handler2.postDelayed(this, 1000);
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollagePlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        StringBuilder sb = new StringBuilder();
        this.formatBuilder = sb;
        this.formatter = new Formatter(sb, Locale.getDefault());
        this.showProgressText = true;
        CountDirection countDirection2 = CountDirection.UP;
        this.countDirection = countDirection2;
        this.progressRunnable = new C9041c(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C13006a.f28648o);
            C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr…leable.CollagePlayerView)");
            int integer = obtainStyledAttributes.getInteger(0, 0);
            if (integer != 0 && integer == 1) {
                countDirection2 = CountDirection.DOWN;
            }
            this.countDirection = countDirection2;
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: com.google.android.exoplayer2.drm.c$a} */
    /* JADX WARNING: type inference failed for: r4v8, types: [com.google.android.exoplayer2.drm.c] */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r0v6, types: [com.google.android.exoplayer2.drm.DefaultDrmSessionManager] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.exoplayer2.source.C14363n createVideoSource(android.net.Uri r11) {
        /*
            r10 = this;
            aj.n r2 = new aj.n
            android.content.Context r0 = r10.getContext()
            android.content.Context r1 = r10.getContext()
            android.content.Context r3 = r10.getContext()
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()
            java.lang.String r3 = r3.name
            int r4 = p513bj.C14049b0.f30913a
            java.lang.String r4 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x0026 }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0026 }
            r5 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x0026 }
            java.lang.String r1 = r1.versionName     // Catch:{ NameNotFoundException -> 0x0026 }
            goto L_0x0028
        L_0x0026:
            java.lang.String r1 = "?"
        L_0x0028:
            java.lang.String r4 = android.os.Build.VERSION.RELEASE
            r5 = 38
            int r5 = androidx.compose.animation.C0391c.m1055a(r3, r5)
            int r5 = androidx.compose.animation.C0391c.m1055a(r1, r5)
            int r5 = androidx.compose.animation.C0391c.m1055a(r4, r5)
            java.lang.String r6 = "/"
            java.lang.String r7 = " (Linux;Android "
            java.lang.StringBuilder r1 = p003a2.C0015b.m92k(r5, r3, r6, r1, r7)
            java.lang.String r3 = ") "
            java.lang.String r5 = "ExoPlayerLib/2.14.1"
            java.lang.String r1 = android.support.p013v4.media.C0070b.m184f(r1, r4, r3, r5)
            r2.<init>(r0, r1)
            r0 = 0
            if (r11 == 0) goto L_0x005b
            jh.o0$b r1 = new jh.o0$b
            r1.<init>()
            r1.f39146b = r11
            jh.o0 r11 = r1.mo69497a()
            r1 = r11
            goto L_0x005c
        L_0x005b:
            r1 = r0
        L_0x005c:
            if (r1 == 0) goto L_0x00ac
            ph.f r11 = new ph.f
            r11.<init>()
            be.a r3 = new be.a
            r3.<init>(r11)
            java.lang.Object r11 = new java.lang.Object
            r11.<init>()
            com.google.android.exoplayer2.upstream.a r5 = new com.google.android.exoplayer2.upstream.a
            r5.<init>()
            r6 = 1048576(0x100000, float:1.469368E-39)
            jh.o0$f r4 = r1.f39138b
            r4.getClass()
            jh.o0$f r4 = r1.f39138b
            java.lang.Object r4 = r4.f39196h
            com.google.android.exoplayer2.source.n r7 = new com.google.android.exoplayer2.source.n
            jh.o0$f r4 = r1.f39138b
            r4.getClass()
            jh.o0$f r4 = r1.f39138b
            jh.o0$d r4 = r4.f39191c
            if (r4 == 0) goto L_0x00a5
            int r8 = p513bj.C14049b0.f30913a
            r9 = 18
            if (r8 >= r9) goto L_0x0091
            goto L_0x00a5
        L_0x0091:
            monitor-enter(r11)
            boolean r8 = p513bj.C14049b0.m21628a(r4, r0)     // Catch:{ all -> 0x00a2 }
            if (r8 != 0) goto L_0x009c
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager r0 = com.google.android.exoplayer2.drm.C14215a.m22150a(r4)     // Catch:{ all -> 0x00a2 }
        L_0x009c:
            r0.getClass()     // Catch:{ all -> 0x00a2 }
            monitor-exit(r11)     // Catch:{ all -> 0x00a2 }
            r4 = r0
            goto L_0x00a8
        L_0x00a2:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00a2 }
            throw r0
        L_0x00a5:
            com.google.android.exoplayer2.drm.c$a r11 = com.google.android.exoplayer2.drm.C14219c.f31569a
            r4 = r11
        L_0x00a8:
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
        L_0x00ac:
            kotlin.jvm.internal.C19383o.m32794d(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.stylekit.views.CollagePlayerView.createVideoSource(android.net.Uri):com.google.android.exoplayer2.source.n");
    }

    private final String getStringForTime(StringBuilder sb, Formatter formatter2, long j) {
        long abs = ((j == -9223372036854775807L ? 0 : Math.abs(j)) + ((long) 500)) / ((long) 1000);
        long j2 = (long) 60;
        long j3 = abs % j2;
        long j4 = (abs / j2) % j2;
        long j5 = abs / ((long) 3600);
        sb.setLength(0);
        if (j5 > 0) {
            String formatter3 = formatter2.format("%d:%02d:%02d", new Object[]{Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)}).toString();
            C19383o.m32796f(formatter3, "formatter.format(\"%d:%02…utes, seconds).toString()");
            return formatter3;
        } else if (j4 < 10) {
            String formatter4 = formatter2.format("%01d:%02d", new Object[]{Long.valueOf(j4), Long.valueOf(j3)}).toString();
            C19383o.m32796f(formatter4, "formatter.format(\"%01d:%…utes, seconds).toString()");
            return formatter4;
        } else {
            String formatter5 = formatter2.format("%02d:%02d", new Object[]{Long.valueOf(j4), Long.valueOf(j3)}).toString();
            C19383o.m32796f(formatter5, "formatter.format(\"%02d:%…utes, seconds).toString()");
            return formatter5;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onFinishInflate$lambda-1  reason: not valid java name */
    public static final void m34889onFinishInflate$lambda1(CollagePlayerView collagePlayerView, View view) {
        C19383o.m32797g(collagePlayerView, "this$0");
        collagePlayerView.mute();
    }

    /* access modifiers changed from: private */
    /* renamed from: onFinishInflate$lambda-2  reason: not valid java name */
    public static final void m34890onFinishInflate$lambda2(CollagePlayerView collagePlayerView, View view) {
        C19383o.m32797g(collagePlayerView, "this$0");
        collagePlayerView.unmute();
    }

    /* access modifiers changed from: private */
    /* renamed from: onFinishInflate$lambda-3  reason: not valid java name */
    public static final void m34891onFinishInflate$lambda3(CollagePlayerView collagePlayerView, View view) {
        C19383o.m32797g(collagePlayerView, "this$0");
        collagePlayerView.enableCaptions();
    }

    /* access modifiers changed from: private */
    /* renamed from: onFinishInflate$lambda-4  reason: not valid java name */
    public static final void m34892onFinishInflate$lambda4(CollagePlayerView collagePlayerView, View view) {
        C19383o.m32797g(collagePlayerView, "this$0");
        collagePlayerView.disableCaptions();
    }

    private final void onScrubProgressChanged(C17921i1 i1Var) {
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        C17918h1 h1Var = C17918h1.f38937c;
        i1Var.mo69406Y();
        C17916h0 h0Var = i1Var.f38957d;
        if (h1Var == null) {
            h0Var.getClass();
            h1Var = C17918h1.f38938d;
        }
        if (!h0Var.f38933y.equals(h1Var)) {
            h0Var.f38933y = h1Var;
            ((C14083w) h0Var.f38916h.f39058h).mo46949a(5, h1Var).mo46951a();
        }
        DefaultTimeBar defaultTimeBar = (DefaultTimeBar) findViewById(R.id.exo_progress);
        if (defaultTimeBar != null) {
            defaultTimeBar.addListener(new C9040b(i1Var, this, ref$BooleanRef));
        }
    }

    private final void release() {
        C17884a1 player = getPlayer();
        if (player != null) {
            player.mo69309J(this);
        }
        C17884a1 player2 = getPlayer();
        if (player2 != null) {
            player2.release();
        }
        setPlayer((C17884a1) null);
    }

    public static /* synthetic */ void showExpandButton$default(CollagePlayerView collagePlayerView, boolean z, View.OnClickListener onClickListener, int i, Object obj) {
        if ((i & 2) != 0) {
            onClickListener = null;
        }
        collagePlayerView.showExpandButton(z, onClickListener);
    }

    /* access modifiers changed from: private */
    public final void updateProgressText(TextView textView, long j) {
        int i = C9039a.f19911a[this.countDirection.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C17884a1 player = getPlayer();
                long duration = (player != null ? player.getDuration() : 0) - j;
                if (textView != null) {
                    textView.setText(getStringForTime(this.formatBuilder, this.formatter, duration));
                }
            }
        } else if (textView != null) {
            textView.setText(getStringForTime(this.formatBuilder, this.formatter, j));
        }
    }

    public final boolean areCaptionsEnabled() {
        SubtitleView subtitleView = getSubtitleView();
        return subtitleView != null && subtitleView.getVisibility() == 0;
    }

    public final Bitmap bitmap() {
        if (!(getVideoSurfaceView() instanceof TextureView)) {
            return null;
        }
        View videoSurfaceView = getVideoSurfaceView();
        C19383o.m32795e(videoSurfaceView, "null cannot be cast to non-null type android.view.TextureView");
        return ((TextureView) videoSurfaceView).getBitmap();
    }

    public final void cleanUp() {
        setListener((C17884a1.C17888d) null);
        stop();
        release();
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.progressRunnable);
        }
    }

    public final long currentPosition() {
        C17884a1 player = getPlayer();
        if (player != null) {
            return player.getCurrentPosition();
        }
        return 0;
    }

    public final void disableCaptions() {
        SubtitleView subtitleView = getSubtitleView();
        if (subtitleView != null) {
            subtitleView.setVisibility(8);
        }
        ImageButton imageButton = this.captionsEnableButton;
        if (imageButton != null) {
            imageButton.setVisibility(0);
        }
        ImageButton imageButton2 = this.captionsDisableButton;
        if (imageButton2 != null) {
            imageButton2.setVisibility(8);
        }
    }

    public final void enableCaptions() {
        SubtitleView subtitleView = getSubtitleView();
        if (subtitleView != null) {
            subtitleView.setVisibility(0);
        }
        ImageButton imageButton = this.captionsEnableButton;
        if (imageButton != null) {
            imageButton.setVisibility(8);
        }
        ImageButton imageButton2 = this.captionsDisableButton;
        if (imageButton2 != null) {
            imageButton2.setVisibility(0);
        }
    }

    public final View getControlsView() {
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.video_controls_compact);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) findViewById(R.id.video_controls_full);
        return constraintLayout2 != null ? constraintLayout2 : constraintLayout;
    }

    public final Uri getVideoURI() {
        return this.videoUri;
    }

    public final boolean isMuted() {
        C17884a1 player = getPlayer();
        return C19383o.m32791a(player != null ? Float.valueOf(player.mo69302C()) : null);
    }

    public final boolean isPlaying() {
        C17884a1 player = getPlayer();
        if (player != null) {
            return player.isPlaying();
        }
        return false;
    }

    public final void mute() {
        this.mutedByUser = true;
        C17884a1 player = getPlayer();
        if (player != null) {
            player.mo69316c(0.0f);
        }
        ImageButton imageButton = this.muteButton;
        if (imageButton != null) {
            imageButton.setVisibility(8);
        }
        ImageButton imageButton2 = this.unmuteButton;
        if (imageButton2 != null) {
            imageButton2.setVisibility(0);
        }
    }

    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(C18167d dVar) {
    }

    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i) {
    }

    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(C17884a1.C17885a aVar) {
    }

    public /* bridge */ /* synthetic */ void onCues(List list) {
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.progressRunnable);
        }
    }

    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(C18260a aVar) {
    }

    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
    }

    public /* bridge */ /* synthetic */ void onEvents(C17884a1 a1Var, C17884a1.C17887c cVar) {
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.countdownText = (TextView) findViewById(R.id.video_position_countdown);
        this.progressTextFullControls = (TextView) findViewById(R.id.clg_position);
        if (this.countdownText != null) {
            this.countDirection = CountDirection.DOWN;
        }
        this.muteButton = (ImageButton) findViewById(R.id.clg_mute);
        this.unmuteButton = (ImageButton) findViewById(R.id.clg_unmute);
        ImageButton imageButton = this.muteButton;
        if (imageButton != null) {
            imageButton.setOnClickListener(new C9058i(this, 0));
        }
        ImageButton imageButton2 = this.unmuteButton;
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(new C9059j(this, 0));
        }
        this.captionsEnableButton = (ImageButton) findViewById(R.id.clg_captions_enable);
        this.captionsDisableButton = (ImageButton) findViewById(R.id.clg_captions_disable);
        ImageButton imageButton3 = this.captionsEnableButton;
        if (imageButton3 != null) {
            imageButton3.setOnClickListener(new C5701g(this, 1));
        }
        ImageButton imageButton4 = this.captionsDisableButton;
        if (imageButton4 != null) {
            imageButton4.setOnClickListener(new C9060k(this, 0));
        }
    }

    public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
    }

    public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z) {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
    }

    public /* bridge */ /* synthetic */ void onMediaItemTransition(C17954o0 o0Var, int i) {
    }

    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(C17963p0 p0Var) {
    }

    public /* bridge */ /* synthetic */ void onMetadata(Metadata metadata) {
    }

    public void onPlayWhenReadyChanged(boolean z, int i) {
        C17884a1.C17888d dVar = this.listener;
        if (dVar != null) {
            dVar.onPlayWhenReadyChanged(z, i);
        }
    }

    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(C17986y0 y0Var) {
    }

    public void onPlaybackStateChanged(int i) {
        C17884a1.C17888d dVar = this.listener;
        if (dVar != null) {
            dVar.onPlaybackStateChanged(i);
        }
        if (i == 3) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.removeCallbacks(this.progressRunnable);
            }
            Handler handler2 = getHandler();
            if (handler2 != null) {
                handler2.postDelayed(this.progressRunnable, 1000);
            }
        }
    }

    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
    }

    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        C19383o.m32797g(exoPlaybackException, "error");
        C17884a1.C17888d dVar = this.listener;
        if (dVar != null) {
            dVar.onPlayerError(exoPlaybackException);
        }
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i) {
    }

    public void onPositionDiscontinuity(C17884a1.C17889e eVar, C17884a1.C17889e eVar2, int i) {
        C19383o.m32797g(eVar, "oldPosition");
        C19383o.m32797g(eVar2, "newPosition");
        C17884a1.C17888d dVar = this.listener;
        if (dVar != null) {
            dVar.onPositionDiscontinuity(eVar, eVar2, i);
        }
    }

    public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
    }

    public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i) {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void onSeekProcessed() {
    }

    public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
    }

    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
    }

    public void onStateChanged(C2887s sVar, Lifecycle.Event event) {
        C19383o.m32797g(sVar, "source");
        C19383o.m32797g(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            cleanUp();
        }
    }

    public /* bridge */ /* synthetic */ void onStaticMetadataChanged(List list) {
    }

    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
    }

    public /* bridge */ /* synthetic */ void onTimelineChanged(C17939k1 k1Var, int i) {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void onTimelineChanged(C17939k1 k1Var, Object obj, int i) {
    }

    public /* bridge */ /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, C18887e eVar) {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(int i, int i2, int i3, float f) {
    }

    public /* bridge */ /* synthetic */ void onVideoSizeChanged(C14166q qVar) {
    }

    public /* bridge */ /* synthetic */ void onVolumeChanged(float f) {
    }

    public final void pause() {
        C17884a1 player = getPlayer();
        if (player != null) {
            player.mo69329l(false);
        }
        C17884a1 player2 = getPlayer();
        if (player2 != null) {
            player2.pause();
        }
    }

    public final void resume() {
        C17884a1 player = getPlayer();
        if (player != null) {
            player.mo69329l(true);
        }
        C17884a1 player2 = getPlayer();
        if (player2 != null) {
            player2.play();
        }
    }

    public final void seekTo(long j) {
        C17884a1 player = getPlayer();
        if (player != null) {
            player.seekTo(j);
        }
    }

    public final void setCountDirection(CountDirection countDirection2) {
        C19383o.m32797g(countDirection2, "direction");
        this.countDirection = countDirection2;
    }

    public final void setListener(C17884a1.C17888d dVar) {
        this.listener = dVar;
    }

    public final void setRepeating(boolean z) {
        C17884a1 player = getPlayer();
        if (player != null) {
            player.setRepeatMode(z ? 1 : 0);
        }
    }

    public final void setUpVideo(Uri uri, C2887s sVar) {
        C19383o.m32797g(uri, "videoUri");
        C19383o.m32797g(sVar, "viewLifecycleOwner");
        sVar.getLifecycle().mo10733a(this);
        setVideoURI(uri);
    }

    public final void setVideoURI(Uri uri) {
        C19383o.m32797g(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        C17884a1 player = getPlayer();
        if (player != null) {
            player.stop();
        }
        C17884a1 player2 = getPlayer();
        if (player2 != null) {
            player2.release();
        }
        this.videoUri = uri;
        C17921i1.C17922a aVar = new C17921i1.C17922a(getContext());
        C14075p.m21694f(!aVar.f38996q);
        aVar.f38996q = true;
        C17921i1 i1Var = new C17921i1(aVar);
        setKeepContentOnPlayerReset(true);
        C17954o0.C17956b bVar = new C17954o0.C17956b();
        bVar.f39146b = uri;
        i1Var.mo69402U(Collections.singletonList(bVar.mo69497a()));
        i1Var.prepare();
        i1Var.mo69306G(this);
        onScrubProgressChanged(i1Var);
        setPlayer(i1Var);
    }

    public final void showCaptionsButton(boolean z) {
        int i = 8;
        if (z) {
            ImageButton imageButton = this.captionsEnableButton;
            if (imageButton != null) {
                imageButton.setVisibility(areCaptionsEnabled() ? 8 : 0);
            }
            ImageButton imageButton2 = this.captionsDisableButton;
            if (imageButton2 != null) {
                if (areCaptionsEnabled()) {
                    i = 0;
                }
                imageButton2.setVisibility(i);
                return;
            }
            return;
        }
        ImageButton imageButton3 = this.captionsDisableButton;
        if (imageButton3 != null) {
            imageButton3.setVisibility(8);
        }
        ImageButton imageButton4 = this.captionsEnableButton;
        if (imageButton4 != null) {
            imageButton4.setVisibility(8);
        }
    }

    public final void showExpandButton(boolean z, View.OnClickListener onClickListener) {
        View findViewById = findViewById(R.id.clg_fullscreen);
        if (findViewById != null) {
            findViewById.setOnClickListener(onClickListener);
        }
        if (z) {
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        } else if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    public final void showMuteButton(boolean z) {
        if (z) {
            C17884a1 player = getPlayer();
            if (C19383o.m32791a(player != null ? Float.valueOf(player.mo69302C()) : null)) {
                ImageButton imageButton = this.unmuteButton;
                if (imageButton != null) {
                    imageButton.setVisibility(0);
                    return;
                }
                return;
            }
            ImageButton imageButton2 = this.muteButton;
            if (imageButton2 != null) {
                imageButton2.setVisibility(0);
                return;
            }
            return;
        }
        ImageButton imageButton3 = this.muteButton;
        if (imageButton3 != null) {
            imageButton3.setVisibility(8);
        }
        ImageButton imageButton4 = this.unmuteButton;
        if (imageButton4 != null) {
            imageButton4.setVisibility(8);
        }
    }

    public final void showProgressText(boolean z) {
        this.showProgressText = z;
        if (z) {
            TextView textView = this.countdownText;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = this.progressTextFullControls;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            this.progressRunnable.run();
            return;
        }
        TextView textView3 = this.countdownText;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        TextView textView4 = this.progressTextFullControls;
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
    }

    public final void stop() {
        C17884a1 player = getPlayer();
        if (player != null) {
            player.mo69329l(false);
        }
        C17884a1 player2 = getPlayer();
        if (player2 != null) {
            player2.stop();
        }
    }

    public final void unmute() {
        this.mutedByUser = false;
        C17884a1 player = getPlayer();
        if (player != null) {
            player.mo69316c(1.0f);
        }
        ImageButton imageButton = this.muteButton;
        if (imageButton != null) {
            imageButton.setVisibility(0);
        }
        ImageButton imageButton2 = this.unmuteButton;
        if (imageButton2 != null) {
            imageButton2.setVisibility(8);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollagePlayerView(Context context) {
        this(context, (AttributeSet) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollagePlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }
}
