package com.google.android.exoplayer2.p526ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.C0342q0;
import com.etsy.android.R;
import com.etsy.android.uikit.view.draggable.C11942a;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.google.android.exoplayer2.p526ui.C14420c;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.C19382n;
import kotlin.reflect.C19421p;
import p513bj.C14049b0;
import p513bj.C14075p;
import p594jh.C17884a1;
import p594jh.C17912g;
import p594jh.C17915h;
import p594jh.C17919i;
import p594jh.C17939k1;
import p594jh.C17945l0;
import p594jh.C17988z0;

/* renamed from: com.google.android.exoplayer2.ui.PlayerControlView */
public class PlayerControlView extends FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    private static final int MAX_UPDATE_INTERVAL_MS = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private long[] adGroupTimesMs;
    private final float buttonAlphaDisabled;
    private final float buttonAlphaEnabled;
    private final C14394a componentListener;
    /* access modifiers changed from: private */
    public C17915h controlDispatcher;
    private long currentWindowOffset;
    private final TextView durationView;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;
    /* access modifiers changed from: private */
    public final View fastForwardButton;
    /* access modifiers changed from: private */
    public final StringBuilder formatBuilder;
    /* access modifiers changed from: private */
    public final Formatter formatter;
    private final Runnable hideAction;
    private long hideAtMs;
    private boolean isAttachedToWindow;
    private boolean multiWindowTimeBar;
    /* access modifiers changed from: private */
    public final View nextButton;
    /* access modifiers changed from: private */
    public final View pauseButton;
    private final C17939k1.C17941b period;
    /* access modifiers changed from: private */
    public final View playButton;
    private C17988z0 playbackPreparer;
    private boolean[] playedAdGroups;
    /* access modifiers changed from: private */
    public C17884a1 player;
    /* access modifiers changed from: private */
    public final TextView positionView;
    /* access modifiers changed from: private */
    public final View previousButton;
    private C14395b progressUpdateListener;
    private final String repeatAllButtonContentDescription;
    private final Drawable repeatAllButtonDrawable;
    private final String repeatOffButtonContentDescription;
    private final Drawable repeatOffButtonDrawable;
    private final String repeatOneButtonContentDescription;
    private final Drawable repeatOneButtonDrawable;
    /* access modifiers changed from: private */
    public final ImageView repeatToggleButton;
    /* access modifiers changed from: private */
    public int repeatToggleModes;
    /* access modifiers changed from: private */
    public final View rewindButton;
    /* access modifiers changed from: private */
    public boolean scrubbing;
    private boolean showFastForwardButton;
    private boolean showMultiWindowTimeBar;
    private boolean showNextButton;
    private boolean showPreviousButton;
    private boolean showRewindButton;
    private boolean showShuffleButton;
    private int showTimeoutMs;
    /* access modifiers changed from: private */
    public final ImageView shuffleButton;
    private final Drawable shuffleOffButtonDrawable;
    private final String shuffleOffContentDescription;
    private final Drawable shuffleOnButtonDrawable;
    private final String shuffleOnContentDescription;
    private final C14420c timeBar;
    private int timeBarMinUpdateIntervalMs;
    private final Runnable updateProgressAction;
    private final CopyOnWriteArrayList<C14396c> visibilityListeners;
    private final View vrButton;
    private final C17939k1.C17942c window;

    /* renamed from: com.google.android.exoplayer2.ui.PlayerControlView$a */
    public final class C14394a implements C17884a1.C17886b, C14420c.C14421a, View.OnClickListener {
        public C14394a() {
        }

        /* renamed from: a */
        public final void mo30962a(C14420c cVar, long j) {
            if (PlayerControlView.this.positionView != null) {
                PlayerControlView.this.positionView.setText(C14049b0.m21650w(PlayerControlView.this.formatBuilder, PlayerControlView.this.formatter, j));
            }
        }

        /* renamed from: b */
        public final void mo30963b(C14420c cVar, long j, boolean z) {
            boolean unused = PlayerControlView.this.scrubbing = false;
            if (!z && PlayerControlView.this.player != null) {
                PlayerControlView playerControlView = PlayerControlView.this;
                playerControlView.seekToTimeBarPosition(playerControlView.player, j);
            }
        }

        /* renamed from: c */
        public final void mo30964c(C14420c cVar, long j) {
            boolean unused = PlayerControlView.this.scrubbing = true;
            if (PlayerControlView.this.positionView != null) {
                PlayerControlView.this.positionView.setText(C14049b0.m21650w(PlayerControlView.this.formatBuilder, PlayerControlView.this.formatter, j));
            }
        }

        public final void onClick(View view) {
            C17884a1 access$500 = PlayerControlView.this.player;
            if (access$500 != null) {
                if (PlayerControlView.this.nextButton == view) {
                    PlayerControlView.this.controlDispatcher.mo69382k(access$500);
                } else if (PlayerControlView.this.previousButton == view) {
                    PlayerControlView.this.controlDispatcher.mo69376c(access$500);
                } else if (PlayerControlView.this.fastForwardButton == view) {
                    if (access$500.getPlaybackState() != 4) {
                        PlayerControlView.this.controlDispatcher.mo69380g(access$500);
                    }
                } else if (PlayerControlView.this.rewindButton == view) {
                    PlayerControlView.this.controlDispatcher.mo69374a(access$500);
                } else if (PlayerControlView.this.playButton == view) {
                    PlayerControlView.this.dispatchPlay(access$500);
                } else if (PlayerControlView.this.pauseButton == view) {
                    PlayerControlView.this.dispatchPause(access$500);
                } else if (PlayerControlView.this.repeatToggleButton == view) {
                    PlayerControlView.this.controlDispatcher.mo69381j(access$500, C19421p.m32922L(access$500.getRepeatMode(), PlayerControlView.this.repeatToggleModes));
                } else if (PlayerControlView.this.shuffleButton == view) {
                    PlayerControlView.this.controlDispatcher.mo69378e(access$500, !access$500.mo69312M());
                }
            }
        }

        public final void onEvents(C17884a1 a1Var, C17884a1.C17887c cVar) {
            if (cVar.mo69354b(5, 6)) {
                PlayerControlView.this.updatePlayPauseButton();
            }
            if (cVar.mo69354b(5, 6, 8)) {
                PlayerControlView.this.updateProgress();
            }
            if (cVar.mo69353a(9)) {
                PlayerControlView.this.updateRepeatModeButton();
            }
            if (cVar.mo69353a(10)) {
                PlayerControlView.this.updateShuffleButton();
            }
            if (cVar.mo69354b(9, 10, 12, 0)) {
                PlayerControlView.this.updateNavigation();
            }
            if (cVar.mo69354b(12, 0)) {
                PlayerControlView.this.updateTimeline();
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerControlView$b */
    public interface C14395b {
        /* renamed from: a */
        void mo47976a();
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerControlView$c */
    public interface C14396c {
        /* renamed from: a */
        void mo32480a(int i);
    }

    static {
        C17945l0.m30331a("goog.exo.ui");
    }

    public PlayerControlView(Context context) {
        this(context, (AttributeSet) null);
    }

    private static boolean canShowMultiWindowTimeBar(C17939k1 k1Var, C17939k1.C17942c cVar) {
        if (k1Var.mo47701o() > 100) {
            return false;
        }
        int o = k1Var.mo47701o();
        for (int i = 0; i < o; i++) {
            if (k1Var.mo69480m(i, cVar).f39120n == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void dispatchPause(C17884a1 a1Var) {
        this.controlDispatcher.mo32478h(a1Var, false);
    }

    /* access modifiers changed from: private */
    public void dispatchPlay(C17884a1 a1Var) {
        int playbackState = a1Var.getPlaybackState();
        if (playbackState == 1) {
            C17988z0 z0Var = this.playbackPreparer;
            if (z0Var != null) {
                z0Var.mo69556a();
            } else {
                this.controlDispatcher.mo69375b(a1Var);
            }
        } else if (playbackState == 4) {
            seekTo(a1Var, a1Var.mo69327j(), -9223372036854775807L);
        }
        this.controlDispatcher.mo32478h(a1Var, true);
    }

    private void dispatchPlayPause(C17884a1 a1Var) {
        int playbackState = a1Var.getPlaybackState();
        if (playbackState == 1 || playbackState == 4 || !a1Var.mo69348x()) {
            dispatchPlay(a1Var);
        } else {
            dispatchPause(a1Var);
        }
    }

    private void hideAfterTimeout() {
        removeCallbacks(this.hideAction);
        if (this.showTimeoutMs > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            int i = this.showTimeoutMs;
            this.hideAtMs = uptimeMillis + ((long) i);
            if (this.isAttachedToWindow) {
                postDelayed(this.hideAction, (long) i);
                return;
            }
            return;
        }
        this.hideAtMs = -9223372036854775807L;
    }

    @SuppressLint({"InlinedApi"})
    private static boolean isHandledMediaKey(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    private void requestPlayPauseFocus() {
        View view;
        View view2;
        boolean shouldShowPauseButton = shouldShowPauseButton();
        if (!shouldShowPauseButton && (view2 = this.playButton) != null) {
            view2.requestFocus();
        } else if (shouldShowPauseButton && (view = this.pauseButton) != null) {
            view.requestFocus();
        }
    }

    private boolean seekTo(C17884a1 a1Var, int i, long j) {
        this.controlDispatcher.mo32479i(a1Var, i, j);
        return true;
    }

    /* access modifiers changed from: private */
    public void seekToTimeBarPosition(C17884a1 a1Var, long j) {
        int i;
        C17939k1 r = a1Var.mo69338r();
        if (this.multiWindowTimeBar && !r.mo69481p()) {
            int o = r.mo47701o();
            i = 0;
            while (true) {
                long b = C17912g.m30088b(r.mo69480m(i, this.window).f39120n);
                if (j < b) {
                    break;
                } else if (i == o - 1) {
                    j = b;
                    break;
                } else {
                    j -= b;
                    i++;
                }
            }
        } else {
            i = a1Var.mo69327j();
        }
        if (!seekTo(a1Var, i, j)) {
            updateProgress();
        }
    }

    private boolean shouldShowPauseButton() {
        C17884a1 a1Var = this.player;
        return (a1Var == null || a1Var.getPlaybackState() == 4 || this.player.getPlaybackState() == 1 || !this.player.mo69348x()) ? false : true;
    }

    private void updateAll() {
        updatePlayPauseButton();
        updateNavigation();
        updateRepeatModeButton();
        updateShuffleButton();
        updateTimeline();
    }

    private void updateButton(boolean z, boolean z2, View view) {
        if (view != null) {
            view.setEnabled(z2);
            view.setAlpha(z2 ? this.buttonAlphaEnabled : this.buttonAlphaDisabled);
            view.setVisibility(z ? 0 : 8);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateNavigation() {
        /*
            r8 = this;
            boolean r0 = r8.isVisible()
            if (r0 == 0) goto L_0x009f
            boolean r0 = r8.isAttachedToWindow
            if (r0 != 0) goto L_0x000c
            goto L_0x009f
        L_0x000c:
            jh.a1 r0 = r8.player
            r1 = 0
            if (r0 == 0) goto L_0x0078
            jh.k1 r2 = r0.mo69338r()
            boolean r3 = r2.mo69481p()
            if (r3 != 0) goto L_0x0078
            boolean r3 = r0.mo69317d()
            if (r3 != 0) goto L_0x0078
            r3 = 4
            boolean r3 = r0.mo69332o(r3)
            int r4 = r0.mo69327j()
            jh.k1$c r5 = r8.window
            r2.mo69480m(r4, r5)
            r2 = 1
            if (r3 != 0) goto L_0x0044
            jh.k1$c r4 = r8.window
            boolean r4 = r4.mo69487a()
            if (r4 == 0) goto L_0x0044
            r4 = 6
            boolean r4 = r0.mo69332o(r4)
            if (r4 == 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r4 = r1
            goto L_0x0045
        L_0x0044:
            r4 = r2
        L_0x0045:
            if (r3 == 0) goto L_0x0051
            jh.h r5 = r8.controlDispatcher
            boolean r5 = r5.mo69379f()
            if (r5 == 0) goto L_0x0051
            r5 = r2
            goto L_0x0052
        L_0x0051:
            r5 = r1
        L_0x0052:
            if (r3 == 0) goto L_0x005e
            jh.h r6 = r8.controlDispatcher
            boolean r6 = r6.mo69383l()
            if (r6 == 0) goto L_0x005e
            r6 = r2
            goto L_0x005f
        L_0x005e:
            r6 = r1
        L_0x005f:
            jh.k1$c r7 = r8.window
            boolean r7 = r7.mo69487a()
            if (r7 == 0) goto L_0x006d
            jh.k1$c r7 = r8.window
            boolean r7 = r7.f39115i
            if (r7 != 0) goto L_0x0074
        L_0x006d:
            r7 = 5
            boolean r0 = r0.mo69332o(r7)
            if (r0 == 0) goto L_0x0075
        L_0x0074:
            r1 = r2
        L_0x0075:
            r0 = r1
            r1 = r4
            goto L_0x007c
        L_0x0078:
            r0 = r1
            r3 = r0
            r5 = r3
            r6 = r5
        L_0x007c:
            boolean r2 = r8.showPreviousButton
            android.view.View r4 = r8.previousButton
            r8.updateButton(r2, r1, r4)
            boolean r1 = r8.showRewindButton
            android.view.View r2 = r8.rewindButton
            r8.updateButton(r1, r5, r2)
            boolean r1 = r8.showFastForwardButton
            android.view.View r2 = r8.fastForwardButton
            r8.updateButton(r1, r6, r2)
            boolean r1 = r8.showNextButton
            android.view.View r2 = r8.nextButton
            r8.updateButton(r1, r0, r2)
            com.google.android.exoplayer2.ui.c r0 = r8.timeBar
            if (r0 == 0) goto L_0x009f
            r0.setEnabled(r3)
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p526ui.PlayerControlView.updateNavigation():void");
    }

    /* access modifiers changed from: private */
    public void updatePlayPauseButton() {
        boolean z;
        if (isVisible() && this.isAttachedToWindow) {
            boolean shouldShowPauseButton = shouldShowPauseButton();
            View view = this.playButton;
            int i = 8;
            boolean z2 = true;
            if (view != null) {
                z = (shouldShowPauseButton && view.isFocused()) | false;
                this.playButton.setVisibility(shouldShowPauseButton ? 8 : 0);
            } else {
                z = false;
            }
            View view2 = this.pauseButton;
            if (view2 != null) {
                if (shouldShowPauseButton || !view2.isFocused()) {
                    z2 = false;
                }
                z |= z2;
                View view3 = this.pauseButton;
                if (shouldShowPauseButton) {
                    i = 0;
                }
                view3.setVisibility(i);
            }
            if (z) {
                requestPlayPauseFocus();
            }
        }
    }

    /* access modifiers changed from: private */
    public void updateProgress() {
        long j;
        if (isVisible() && this.isAttachedToWindow) {
            C17884a1 a1Var = this.player;
            long j2 = 0;
            if (a1Var != null) {
                j2 = this.currentWindowOffset + a1Var.mo69304E();
                j = this.currentWindowOffset + a1Var.mo69313N();
            } else {
                j = 0;
            }
            TextView textView = this.positionView;
            if (textView != null && !this.scrubbing) {
                textView.setText(C14049b0.m21650w(this.formatBuilder, this.formatter, j2));
            }
            C14420c cVar = this.timeBar;
            if (cVar != null) {
                cVar.setPosition(j2);
                this.timeBar.setBufferedPosition(j);
            }
            C14395b bVar = this.progressUpdateListener;
            if (bVar != null) {
                bVar.mo47976a();
            }
            removeCallbacks(this.updateProgressAction);
            int playbackState = a1Var == null ? 1 : a1Var.getPlaybackState();
            long j3 = 1000;
            if (a1Var != null && a1Var.isPlaying()) {
                C14420c cVar2 = this.timeBar;
                long min = Math.min(cVar2 != null ? cVar2.getPreferredUpdateDelay() : 1000, 1000 - (j2 % 1000));
                float f = a1Var.mo69314a().f39326a;
                if (f > 0.0f) {
                    j3 = (long) (((float) min) / f);
                }
                postDelayed(this.updateProgressAction, C14049b0.m21637j(j3, (long) this.timeBarMinUpdateIntervalMs, 1000));
            } else if (playbackState != 4 && playbackState != 1) {
                postDelayed(this.updateProgressAction, 1000);
            }
        }
    }

    /* access modifiers changed from: private */
    public void updateRepeatModeButton() {
        ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.repeatToggleButton) != null) {
            if (this.repeatToggleModes == 0) {
                updateButton(false, false, imageView);
                return;
            }
            C17884a1 a1Var = this.player;
            if (a1Var == null) {
                updateButton(true, false, imageView);
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
                return;
            }
            updateButton(true, true, imageView);
            int repeatMode = a1Var.getRepeatMode();
            if (repeatMode == 0) {
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
            } else if (repeatMode == 1) {
                this.repeatToggleButton.setImageDrawable(this.repeatOneButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOneButtonContentDescription);
            } else if (repeatMode == 2) {
                this.repeatToggleButton.setImageDrawable(this.repeatAllButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatAllButtonContentDescription);
            }
            this.repeatToggleButton.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public void updateShuffleButton() {
        ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.shuffleButton) != null) {
            C17884a1 a1Var = this.player;
            if (!this.showShuffleButton) {
                updateButton(false, false, imageView);
            } else if (a1Var == null) {
                updateButton(true, false, imageView);
                this.shuffleButton.setImageDrawable(this.shuffleOffButtonDrawable);
                this.shuffleButton.setContentDescription(this.shuffleOffContentDescription);
            } else {
                updateButton(true, true, imageView);
                this.shuffleButton.setImageDrawable(a1Var.mo69312M() ? this.shuffleOnButtonDrawable : this.shuffleOffButtonDrawable);
                this.shuffleButton.setContentDescription(a1Var.mo69312M() ? this.shuffleOnContentDescription : this.shuffleOffContentDescription);
            }
        }
    }

    /* access modifiers changed from: private */
    public void updateTimeline() {
        int i;
        C17939k1.C17942c cVar;
        boolean z;
        long j;
        C17884a1 a1Var = this.player;
        if (a1Var != null) {
            boolean z2 = false;
            boolean z3 = true;
            this.multiWindowTimeBar = this.showMultiWindowTimeBar && canShowMultiWindowTimeBar(a1Var.mo69338r(), this.window);
            long j2 = 0;
            this.currentWindowOffset = 0;
            C17939k1 r = a1Var.mo69338r();
            if (!r.mo69481p()) {
                int j3 = a1Var.mo69327j();
                boolean z4 = this.multiWindowTimeBar;
                int i2 = z4 ? 0 : j3;
                int o = z4 ? r.mo47701o() - 1 : j3;
                i = 0;
                long j4 = 0;
                while (true) {
                    if (i2 > o) {
                        break;
                    }
                    if (i2 == j3) {
                        this.currentWindowOffset = C17912g.m30088b(j4);
                    }
                    r.mo69480m(i2, this.window);
                    C17939k1.C17942c cVar2 = this.window;
                    if (cVar2.f39120n == -9223372036854775807L) {
                        C14075p.m21694f(this.multiWindowTimeBar ^ z3);
                        break;
                    }
                    int i3 = cVar2.f39121o;
                    while (true) {
                        cVar = this.window;
                        if (i3 > cVar.f39122p) {
                            break;
                        }
                        r.mo47630f(i3, this.period, z2);
                        int i4 = this.period.f39104g.f31771b;
                        int i5 = z2;
                        while (i5 < i4) {
                            C17939k1.C17941b bVar = this.period;
                            long j5 = bVar.f39104g.f31772c[i5];
                            if (j5 == Long.MIN_VALUE) {
                                long j6 = bVar.f39101d;
                                if (j6 == -9223372036854775807L) {
                                    j = 0;
                                    z = true;
                                    i5++;
                                    j2 = j;
                                    z3 = z;
                                } else {
                                    j5 = j6;
                                }
                            }
                            long j7 = j5 + bVar.f39102e;
                            j = 0;
                            if (j7 >= 0) {
                                long[] jArr = this.adGroupTimesMs;
                                if (i == jArr.length) {
                                    int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                    this.adGroupTimesMs = Arrays.copyOf(jArr, length);
                                    this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, length);
                                }
                                this.adGroupTimesMs[i] = C17912g.m30088b(j4 + j7);
                                z = true;
                                this.playedAdGroups[i] = !this.period.f39104g.f31773d[i5].mo47666b();
                                i++;
                                i5++;
                                j2 = j;
                                z3 = z;
                            }
                            z = true;
                            i5++;
                            j2 = j;
                            z3 = z;
                        }
                        long j8 = j2;
                        i3++;
                        z3 = z3;
                        z2 = false;
                    }
                    j4 += cVar.f39120n;
                    i2++;
                    j2 = j2;
                    z3 = z3;
                    z2 = false;
                }
                j2 = j4;
            } else {
                i = 0;
            }
            long b = C17912g.m30088b(j2);
            TextView textView = this.durationView;
            if (textView != null) {
                textView.setText(C14049b0.m21650w(this.formatBuilder, this.formatter, b));
            }
            C14420c cVar3 = this.timeBar;
            if (cVar3 != null) {
                cVar3.setDuration(b);
                int length2 = this.extraAdGroupTimesMs.length;
                int i6 = i + length2;
                long[] jArr2 = this.adGroupTimesMs;
                if (i6 > jArr2.length) {
                    this.adGroupTimesMs = Arrays.copyOf(jArr2, i6);
                    this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, i6);
                }
                System.arraycopy(this.extraAdGroupTimesMs, 0, this.adGroupTimesMs, i, length2);
                System.arraycopy(this.extraPlayedAdGroups, 0, this.playedAdGroups, i, length2);
                this.timeBar.setAdGroupTimesMs(this.adGroupTimesMs, this.playedAdGroups, i6);
            }
            updateProgress();
        }
    }

    public void addVisibilityListener(C14396c cVar) {
        cVar.getClass();
        this.visibilityListeners.add(cVar);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C17884a1 a1Var = this.player;
        if (a1Var == null || !isHandledMediaKey(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (a1Var.getPlaybackState() == 4) {
                return true;
            }
            this.controlDispatcher.mo69380g(a1Var);
            return true;
        } else if (keyCode == 89) {
            this.controlDispatcher.mo69374a(a1Var);
            return true;
        } else if (keyEvent.getRepeatCount() != 0) {
            return true;
        } else {
            if (keyCode == 79 || keyCode == 85) {
                dispatchPlayPause(a1Var);
                return true;
            } else if (keyCode == 87) {
                this.controlDispatcher.mo69382k(a1Var);
                return true;
            } else if (keyCode == 88) {
                this.controlDispatcher.mo69376c(a1Var);
                return true;
            } else if (keyCode == 126) {
                dispatchPlay(a1Var);
                return true;
            } else if (keyCode != 127) {
                return true;
            } else {
                dispatchPause(a1Var);
                return true;
            }
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.hideAction);
        } else if (motionEvent.getAction() == 1) {
            hideAfterTimeout();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C17884a1 getPlayer() {
        return this.player;
    }

    public int getRepeatToggleModes() {
        return this.repeatToggleModes;
    }

    public boolean getShowShuffleButton() {
        return this.showShuffleButton;
    }

    public int getShowTimeoutMs() {
        return this.showTimeoutMs;
    }

    public boolean getShowVrButton() {
        View view = this.vrButton;
        return view != null && view.getVisibility() == 0;
    }

    public void hide() {
        if (isVisible()) {
            setVisibility(8);
            Iterator<C14396c> it = this.visibilityListeners.iterator();
            while (it.hasNext()) {
                it.next().mo32480a(getVisibility());
            }
            removeCallbacks(this.updateProgressAction);
            removeCallbacks(this.hideAction);
            this.hideAtMs = -9223372036854775807L;
        }
    }

    public boolean isVisible() {
        return getVisibility() == 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttachedToWindow = true;
        long j = this.hideAtMs;
        if (j != -9223372036854775807L) {
            long uptimeMillis = j - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                hide();
            } else {
                postDelayed(this.hideAction, uptimeMillis);
            }
        } else if (isVisible()) {
            hideAfterTimeout();
        }
        updateAll();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        removeCallbacks(this.updateProgressAction);
        removeCallbacks(this.hideAction);
    }

    public void removeVisibilityListener(C14396c cVar) {
        this.visibilityListeners.remove(cVar);
    }

    public void setControlDispatcher(C17915h hVar) {
        if (this.controlDispatcher != hVar) {
            this.controlDispatcher = hVar;
            updateNavigation();
        }
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        boolean z = false;
        if (jArr == null) {
            this.extraAdGroupTimesMs = new long[0];
            this.extraPlayedAdGroups = new boolean[0];
        } else {
            zArr.getClass();
            if (jArr.length == zArr.length) {
                z = true;
            }
            C14075p.m21691c(z);
            this.extraAdGroupTimesMs = jArr;
            this.extraPlayedAdGroups = zArr;
        }
        updateTimeline();
    }

    @Deprecated
    public void setFastForwardIncrementMs(int i) {
        C17915h hVar = this.controlDispatcher;
        if (hVar instanceof C17919i) {
            ((C17919i) hVar).f38943c = (long) i;
            updateNavigation();
        }
    }

    @Deprecated
    public void setPlaybackPreparer(C17988z0 z0Var) {
        this.playbackPreparer = z0Var;
    }

    public void setPlayer(C17884a1 a1Var) {
        boolean z = true;
        C14075p.m21694f(Looper.myLooper() == Looper.getMainLooper());
        if (!(a1Var == null || a1Var.mo69340s() == Looper.getMainLooper())) {
            z = false;
        }
        C14075p.m21691c(z);
        C17884a1 a1Var2 = this.player;
        if (a1Var2 != a1Var) {
            if (a1Var2 != null) {
                a1Var2.mo69344t(this.componentListener);
            }
            this.player = a1Var;
            if (a1Var != null) {
                a1Var.mo69350z(this.componentListener);
            }
            updateAll();
        }
    }

    public void setProgressUpdateListener(C14395b bVar) {
        this.progressUpdateListener = bVar;
    }

    public void setRepeatToggleModes(int i) {
        this.repeatToggleModes = i;
        C17884a1 a1Var = this.player;
        if (a1Var != null) {
            int repeatMode = a1Var.getRepeatMode();
            if (i == 0 && repeatMode != 0) {
                this.controlDispatcher.mo69381j(this.player, 0);
            } else if (i == 1 && repeatMode == 2) {
                this.controlDispatcher.mo69381j(this.player, 1);
            } else if (i == 2 && repeatMode == 1) {
                this.controlDispatcher.mo69381j(this.player, 2);
            }
        }
        updateRepeatModeButton();
    }

    @Deprecated
    public void setRewindIncrementMs(int i) {
        C17915h hVar = this.controlDispatcher;
        if (hVar instanceof C17919i) {
            ((C17919i) hVar).f38942b = (long) i;
            updateNavigation();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        this.showFastForwardButton = z;
        updateNavigation();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.showMultiWindowTimeBar = z;
        updateTimeline();
    }

    public void setShowNextButton(boolean z) {
        this.showNextButton = z;
        updateNavigation();
    }

    public void setShowPreviousButton(boolean z) {
        this.showPreviousButton = z;
        updateNavigation();
    }

    public void setShowRewindButton(boolean z) {
        this.showRewindButton = z;
        updateNavigation();
    }

    public void setShowShuffleButton(boolean z) {
        this.showShuffleButton = z;
        updateShuffleButton();
    }

    public void setShowTimeoutMs(int i) {
        this.showTimeoutMs = i;
        if (isVisible()) {
            hideAfterTimeout();
        }
    }

    public void setShowVrButton(boolean z) {
        View view = this.vrButton;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.timeBarMinUpdateIntervalMs = C14049b0.m21636i(i, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.vrButton;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            updateButton(getShowVrButton(), onClickListener != null, this.vrButton);
        }
    }

    public void show() {
        if (!isVisible()) {
            setVisibility(0);
            Iterator<C14396c> it = this.visibilityListeners.iterator();
            while (it.hasNext()) {
                it.next().mo32480a(getVisibility());
            }
            updateAll();
            requestPlayPauseFocus();
        }
        hideAfterTimeout();
    }

    public PlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static int getRepeatToggleModes(TypedArray typedArray, int i) {
        return typedArray.getInt(9, i);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        int i2 = 5000;
        this.showTimeoutMs = 5000;
        this.repeatToggleModes = 0;
        this.timeBarMinUpdateIntervalMs = 200;
        this.hideAtMs = -9223372036854775807L;
        this.showRewindButton = true;
        this.showFastForwardButton = true;
        this.showPreviousButton = true;
        this.showNextButton = true;
        this.showShuffleButton = false;
        int i3 = R.layout.exo_player_control_view;
        int i4 = 15000;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C19382n.f43264n, 0, 0);
            try {
                i2 = obtainStyledAttributes.getInt(10, 5000);
                i4 = obtainStyledAttributes.getInt(6, 15000);
                this.showTimeoutMs = obtainStyledAttributes.getInt(21, this.showTimeoutMs);
                i3 = obtainStyledAttributes.getResourceId(5, R.layout.exo_player_control_view);
                this.repeatToggleModes = getRepeatToggleModes(obtainStyledAttributes, this.repeatToggleModes);
                this.showRewindButton = obtainStyledAttributes.getBoolean(19, this.showRewindButton);
                this.showFastForwardButton = obtainStyledAttributes.getBoolean(16, this.showFastForwardButton);
                this.showPreviousButton = obtainStyledAttributes.getBoolean(18, this.showPreviousButton);
                this.showNextButton = obtainStyledAttributes.getBoolean(17, this.showNextButton);
                this.showShuffleButton = obtainStyledAttributes.getBoolean(20, this.showShuffleButton);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(22, this.timeBarMinUpdateIntervalMs));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.visibilityListeners = new CopyOnWriteArrayList<>();
        this.period = new C17939k1.C17941b();
        this.window = new C17939k1.C17942c();
        StringBuilder sb = new StringBuilder();
        this.formatBuilder = sb;
        this.formatter = new Formatter(sb, Locale.getDefault());
        this.adGroupTimesMs = new long[0];
        this.playedAdGroups = new boolean[0];
        this.extraAdGroupTimesMs = new long[0];
        this.extraPlayedAdGroups = new boolean[0];
        C14394a aVar = new C14394a();
        this.componentListener = aVar;
        this.controlDispatcher = new C17919i((long) i4, (long) i2);
        this.updateProgressAction = new C0342q0(this, 5);
        this.hideAction = new C11942a(this, 1);
        LayoutInflater.from(context).inflate(i3, this);
        setDescendantFocusability(PrimitiveArrayBuilder.MAX_CHUNK_SIZE);
        C14420c cVar = (C14420c) findViewById(R.id.exo_progress);
        View findViewById = findViewById(R.id.exo_progress_placeholder);
        if (cVar != null) {
            this.timeBar = cVar;
        } else if (findViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, (AttributeSet) null, 0, attributeSet2);
            defaultTimeBar.setId(R.id.exo_progress);
            defaultTimeBar.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            this.timeBar = defaultTimeBar;
        } else {
            this.timeBar = null;
        }
        this.durationView = (TextView) findViewById(R.id.exo_duration);
        this.positionView = (TextView) findViewById(R.id.exo_position);
        C14420c cVar2 = this.timeBar;
        if (cVar2 != null) {
            cVar2.addListener(aVar);
        }
        View findViewById2 = findViewById(R.id.exo_play);
        this.playButton = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(aVar);
        }
        View findViewById3 = findViewById(R.id.exo_pause);
        this.pauseButton = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(aVar);
        }
        View findViewById4 = findViewById(R.id.exo_prev);
        this.previousButton = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(aVar);
        }
        View findViewById5 = findViewById(R.id.exo_next);
        this.nextButton = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(aVar);
        }
        View findViewById6 = findViewById(R.id.exo_rew);
        this.rewindButton = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(aVar);
        }
        View findViewById7 = findViewById(R.id.exo_ffwd);
        this.fastForwardButton = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(aVar);
        }
        ImageView imageView = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.repeatToggleButton = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(aVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_shuffle);
        this.shuffleButton = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(aVar);
        }
        View findViewById8 = findViewById(R.id.exo_vr);
        this.vrButton = findViewById8;
        setShowVrButton(false);
        updateButton(false, false, findViewById8);
        Resources resources = context.getResources();
        this.buttonAlphaEnabled = ((float) resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled)) / 100.0f;
        this.buttonAlphaDisabled = ((float) resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled)) / 100.0f;
        this.repeatOffButtonDrawable = resources.getDrawable(R.drawable.exo_controls_repeat_off);
        this.repeatOneButtonDrawable = resources.getDrawable(R.drawable.exo_controls_repeat_one);
        this.repeatAllButtonDrawable = resources.getDrawable(R.drawable.exo_controls_repeat_all);
        this.shuffleOnButtonDrawable = resources.getDrawable(R.drawable.exo_controls_shuffle_on);
        this.shuffleOffButtonDrawable = resources.getDrawable(R.drawable.exo_controls_shuffle_off);
        this.repeatOffButtonContentDescription = resources.getString(R.string.exo_controls_repeat_off_description);
        this.repeatOneButtonContentDescription = resources.getString(R.string.exo_controls_repeat_one_description);
        this.repeatAllButtonContentDescription = resources.getString(R.string.exo_controls_repeat_all_description);
        this.shuffleOnContentDescription = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.shuffleOffContentDescription = resources.getString(R.string.exo_controls_shuffle_off_description);
    }
}
