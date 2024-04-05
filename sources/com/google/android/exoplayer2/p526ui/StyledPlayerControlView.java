package com.google.android.exoplayer2.p526ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.compose.p015ui.platform.C1858o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.braze.p044ui.inappmessage.views.C5698d;
import com.braze.p044ui.inappmessage.views.C5701g;
import com.etsy.android.R;
import com.etsy.android.p327ui.favorites.C9864p;
import com.etsy.android.stylekit.views.C9055f;
import com.etsy.android.stylekit.views.C9058i;
import com.etsy.android.stylekit.views.C9060k;
import com.facebook.login.LoginStatusClient;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p526ui.C14420c;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C14389c;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.C19382n;
import kotlin.reflect.C19421p;
import p280x0.C8292f;
import p513bj.C14049b0;
import p513bj.C14075p;
import p594jh.C17884a1;
import p594jh.C17912g;
import p594jh.C17915h;
import p594jh.C17919i;
import p594jh.C17939k1;
import p594jh.C17945l0;
import p594jh.C17950n;
import p594jh.C17986y0;
import p594jh.C17988z0;
import p718yi.C18886d;
import p718yi.C18888f;
import p726zi.C18908c;
import p726zi.C18909d;
import p726zi.C18910e;
import p726zi.C18917l;
import p726zi.C18929o;

/* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView */
public class StyledPlayerControlView extends FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    private static final int MAX_UPDATE_INTERVAL_MS = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private static final int SETTINGS_AUDIO_TRACK_SELECTION_POSITION = 1;
    private static final int SETTINGS_PLAYBACK_SPEED_POSITION = 0;
    private long[] adGroupTimesMs;
    /* access modifiers changed from: private */
    public View audioTrackButton;
    /* access modifiers changed from: private */
    public C14408k audioTrackSelectionAdapter;
    private final float buttonAlphaDisabled;
    private final float buttonAlphaEnabled;
    private final C14399b componentListener;
    /* access modifiers changed from: private */
    public C17915h controlDispatcher;
    /* access modifiers changed from: private */
    public C18917l controlViewLayoutManager;
    private long currentWindowOffset;
    private final TextView durationView;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;
    /* access modifiers changed from: private */
    public final View fastForwardButton;
    private final TextView fastForwardButtonTextView;
    private long fastForwardMs;
    /* access modifiers changed from: private */
    public final StringBuilder formatBuilder;
    /* access modifiers changed from: private */
    public final Formatter formatter;
    private ImageView fullScreenButton;
    private final String fullScreenEnterContentDescription;
    private final Drawable fullScreenEnterDrawable;
    private final String fullScreenExitContentDescription;
    private final Drawable fullScreenExitDrawable;
    private boolean isAttachedToWindow;
    private boolean isFullScreen;
    private ImageView minimalFullScreenButton;
    private boolean multiWindowTimeBar;
    /* access modifiers changed from: private */
    public boolean needToHideBars;
    /* access modifiers changed from: private */
    public final View nextButton;
    private C14400c onFullScreenModeChangedListener;
    private final C17939k1.C17941b period;
    /* access modifiers changed from: private */
    public final View playPauseButton;
    private C17988z0 playbackPreparer;
    /* access modifiers changed from: private */
    public C14401d playbackSpeedAdapter;
    /* access modifiers changed from: private */
    public View playbackSpeedButton;
    private boolean[] playedAdGroups;
    /* access modifiers changed from: private */
    public C17884a1 player;
    /* access modifiers changed from: private */
    public final TextView positionView;
    /* access modifiers changed from: private */
    public final View previousButton;
    private C14402e progressUpdateListener;
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
    private Resources resources;
    /* access modifiers changed from: private */
    public final View rewindButton;
    private final TextView rewindButtonTextView;
    private long rewindMs;
    /* access modifiers changed from: private */
    public boolean scrubbing;
    /* access modifiers changed from: private */
    public C14404g settingsAdapter;
    /* access modifiers changed from: private */
    public View settingsButton;
    private RecyclerView settingsView;
    /* access modifiers changed from: private */
    public PopupWindow settingsWindow;
    private int settingsWindowMargin;
    private boolean showMultiWindowTimeBar;
    private int showTimeoutMs;
    /* access modifiers changed from: private */
    public final ImageView shuffleButton;
    private final Drawable shuffleOffButtonDrawable;
    private final String shuffleOffContentDescription;
    private final Drawable shuffleOnButtonDrawable;
    private final String shuffleOnContentDescription;
    /* access modifiers changed from: private */
    public ImageView subtitleButton;
    /* access modifiers changed from: private */
    public final Drawable subtitleOffButtonDrawable;
    /* access modifiers changed from: private */
    public final String subtitleOffContentDescription;
    /* access modifiers changed from: private */
    public final Drawable subtitleOnButtonDrawable;
    /* access modifiers changed from: private */
    public final String subtitleOnContentDescription;
    /* access modifiers changed from: private */
    public C14408k textTrackSelectionAdapter;
    private final C14420c timeBar;
    private int timeBarMinUpdateIntervalMs;
    private C18929o trackNameProvider;
    /* access modifiers changed from: private */
    public DefaultTrackSelector trackSelector;
    private final Runnable updateProgressAction;
    private final CopyOnWriteArrayList<C14409l> visibilityListeners;
    private final View vrButton;
    private final C17939k1.C17942c window;

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$a */
    public final class C14398a extends C14408k {
        public C14398a() {
            super();
        }

        /* renamed from: j */
        public final void mo48073j(ArrayList arrayList, ArrayList arrayList2, C14389c.C14390a aVar) {
            boolean z;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    z = false;
                    break;
                }
                int intValue = ((Integer) arrayList.get(i2)).intValue();
                TrackGroupArray trackGroupArray = aVar.f32406c[intValue];
                if (StyledPlayerControlView.this.trackSelector != null && StyledPlayerControlView.this.trackSelector.mo47858d().hasSelectionOverride(intValue, trackGroupArray)) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (!arrayList2.isEmpty()) {
                if (z) {
                    while (true) {
                        if (i >= arrayList2.size()) {
                            break;
                        }
                        C14407j jVar = (C14407j) arrayList2.get(i);
                        if (jVar.f32436e) {
                            StyledPlayerControlView.this.settingsAdapter.f32426c[1] = jVar.f32435d;
                            break;
                        }
                        i++;
                    }
                } else {
                    StyledPlayerControlView.this.settingsAdapter.f32426c[1] = StyledPlayerControlView.this.getResources().getString(R.string.exo_track_selection_auto);
                }
            } else {
                StyledPlayerControlView.this.settingsAdapter.f32426c[1] = StyledPlayerControlView.this.getResources().getString(R.string.exo_track_selection_none);
            }
            this.f32437b = arrayList;
            this.f32438c = arrayList2;
            this.f32439d = aVar;
        }

        /* renamed from: l */
        public final void mo48074l(C14405h hVar) {
            boolean z;
            hVar.f32429b.setText(R.string.exo_track_selection_auto);
            DefaultTrackSelector access$4800 = StyledPlayerControlView.this.trackSelector;
            access$4800.getClass();
            DefaultTrackSelector.Parameters d = access$4800.mo47858d();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f32437b.size()) {
                    z = false;
                    break;
                }
                int intValue = this.f32437b.get(i2).intValue();
                C14389c.C14390a aVar = this.f32439d;
                aVar.getClass();
                if (d.hasSelectionOverride(intValue, aVar.f32406c[intValue])) {
                    z = true;
                    break;
                }
                i2++;
            }
            View view = hVar.f32430c;
            if (z) {
                i = 4;
            }
            view.setVisibility(i);
            hVar.itemView.setOnClickListener(new C9058i(this, 3));
        }

        /* renamed from: m */
        public final void mo48075m(String str) {
            StyledPlayerControlView.this.settingsAdapter.f32426c[1] = str;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$b */
    public final class C14399b implements C17884a1.C17886b, C14420c.C14421a, View.OnClickListener, PopupWindow.OnDismissListener {
        public C14399b() {
        }

        /* renamed from: a */
        public final void mo30962a(C14420c cVar, long j) {
            if (StyledPlayerControlView.this.positionView != null) {
                StyledPlayerControlView.this.positionView.setText(C14049b0.m21650w(StyledPlayerControlView.this.formatBuilder, StyledPlayerControlView.this.formatter, j));
            }
        }

        /* renamed from: b */
        public final void mo30963b(C14420c cVar, long j, boolean z) {
            boolean unused = StyledPlayerControlView.this.scrubbing = false;
            if (!z && StyledPlayerControlView.this.player != null) {
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                styledPlayerControlView.seekToTimeBarPosition(styledPlayerControlView.player, j);
            }
            StyledPlayerControlView.this.controlViewLayoutManager.mo70350g();
        }

        /* renamed from: c */
        public final void mo30964c(C14420c cVar, long j) {
            boolean unused = StyledPlayerControlView.this.scrubbing = true;
            if (StyledPlayerControlView.this.positionView != null) {
                StyledPlayerControlView.this.positionView.setText(C14049b0.m21650w(StyledPlayerControlView.this.formatBuilder, StyledPlayerControlView.this.formatter, j));
            }
            StyledPlayerControlView.this.controlViewLayoutManager.mo70349f();
        }

        public final void onClick(View view) {
            C17884a1 access$800 = StyledPlayerControlView.this.player;
            if (access$800 != null) {
                StyledPlayerControlView.this.controlViewLayoutManager.mo70350g();
                if (StyledPlayerControlView.this.nextButton == view) {
                    StyledPlayerControlView.this.controlDispatcher.mo69382k(access$800);
                } else if (StyledPlayerControlView.this.previousButton == view) {
                    StyledPlayerControlView.this.controlDispatcher.mo69376c(access$800);
                } else if (StyledPlayerControlView.this.fastForwardButton == view) {
                    if (access$800.getPlaybackState() != 4) {
                        StyledPlayerControlView.this.controlDispatcher.mo69380g(access$800);
                    }
                } else if (StyledPlayerControlView.this.rewindButton == view) {
                    StyledPlayerControlView.this.controlDispatcher.mo69374a(access$800);
                } else if (StyledPlayerControlView.this.playPauseButton == view) {
                    StyledPlayerControlView.this.dispatchPlayPause(access$800);
                } else if (StyledPlayerControlView.this.repeatToggleButton == view) {
                    StyledPlayerControlView.this.controlDispatcher.mo69381j(access$800, C19421p.m32922L(access$800.getRepeatMode(), StyledPlayerControlView.this.repeatToggleModes));
                } else if (StyledPlayerControlView.this.shuffleButton == view) {
                    StyledPlayerControlView.this.controlDispatcher.mo69378e(access$800, !access$800.mo69312M());
                } else if (StyledPlayerControlView.this.settingsButton == view) {
                    StyledPlayerControlView.this.controlViewLayoutManager.mo70349f();
                    StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                    styledPlayerControlView.displaySettingsWindow(styledPlayerControlView.settingsAdapter);
                } else if (StyledPlayerControlView.this.playbackSpeedButton == view) {
                    StyledPlayerControlView.this.controlViewLayoutManager.mo70349f();
                    StyledPlayerControlView styledPlayerControlView2 = StyledPlayerControlView.this;
                    styledPlayerControlView2.displaySettingsWindow(styledPlayerControlView2.playbackSpeedAdapter);
                } else if (StyledPlayerControlView.this.audioTrackButton == view) {
                    StyledPlayerControlView.this.controlViewLayoutManager.mo70349f();
                    StyledPlayerControlView styledPlayerControlView3 = StyledPlayerControlView.this;
                    styledPlayerControlView3.displaySettingsWindow(styledPlayerControlView3.audioTrackSelectionAdapter);
                } else if (StyledPlayerControlView.this.subtitleButton == view) {
                    StyledPlayerControlView.this.controlViewLayoutManager.mo70349f();
                    StyledPlayerControlView styledPlayerControlView4 = StyledPlayerControlView.this;
                    styledPlayerControlView4.displaySettingsWindow(styledPlayerControlView4.textTrackSelectionAdapter);
                }
            }
        }

        public final void onDismiss() {
            if (StyledPlayerControlView.this.needToHideBars) {
                StyledPlayerControlView.this.controlViewLayoutManager.mo70350g();
            }
        }

        public final void onEvents(C17884a1 a1Var, C17884a1.C17887c cVar) {
            if (cVar.mo69354b(5, 6)) {
                StyledPlayerControlView.this.updatePlayPauseButton();
            }
            if (cVar.mo69354b(5, 6, 8)) {
                StyledPlayerControlView.this.updateProgress();
            }
            if (cVar.mo69353a(9)) {
                StyledPlayerControlView.this.updateRepeatModeButton();
            }
            if (cVar.mo69353a(10)) {
                StyledPlayerControlView.this.updateShuffleButton();
            }
            if (cVar.mo69354b(9, 10, 12, 0)) {
                StyledPlayerControlView.this.updateNavigation();
            }
            if (cVar.mo69354b(12, 0)) {
                StyledPlayerControlView.this.updateTimeline();
            }
            if (cVar.mo69353a(13)) {
                StyledPlayerControlView.this.updatePlaybackSpeedList();
            }
            if (cVar.mo69353a(2)) {
                StyledPlayerControlView.this.updateTrackLists();
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$c */
    public interface C14400c {
        /* renamed from: a */
        void mo48078a();
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$d */
    public final class C14401d extends RecyclerView.Adapter<C14405h> {

        /* renamed from: b */
        public final String[] f32417b;

        /* renamed from: c */
        public final int[] f32418c;

        /* renamed from: d */
        public int f32419d;

        public C14401d(String[] strArr, int[] iArr) {
            this.f32417b = strArr;
            this.f32418c = iArr;
        }

        public final int getItemCount() {
            return this.f32417b.length;
        }

        public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
            C14405h hVar = (C14405h) b0Var;
            String[] strArr = this.f32417b;
            if (i < strArr.length) {
                hVar.f32429b.setText(strArr[i]);
            }
            hVar.f32430c.setVisibility(i == this.f32419d ? 0 : 4);
            hVar.itemView.setOnClickListener(new C9864p(this, i, 1));
        }

        public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C14405h(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, (ViewGroup) null));
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$e */
    public interface C14402e {
        /* renamed from: a */
        void mo48079a();
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$f */
    public final class C14403f extends RecyclerView.C3084b0 {

        /* renamed from: b */
        public final TextView f32421b;

        /* renamed from: c */
        public final TextView f32422c;

        /* renamed from: d */
        public final ImageView f32423d;

        public C14403f(View view) {
            super(view);
            this.f32421b = (TextView) view.findViewById(R.id.exo_main_text);
            this.f32422c = (TextView) view.findViewById(R.id.exo_sub_text);
            this.f32423d = (ImageView) view.findViewById(R.id.exo_icon);
            view.setOnClickListener(new C5701g(this, 4));
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$g */
    public class C14404g extends RecyclerView.Adapter<C14403f> {

        /* renamed from: b */
        public final String[] f32425b;

        /* renamed from: c */
        public final String[] f32426c;

        /* renamed from: d */
        public final Drawable[] f32427d;

        public C14404g(String[] strArr, Drawable[] drawableArr) {
            this.f32425b = strArr;
            this.f32426c = new String[strArr.length];
            this.f32427d = drawableArr;
        }

        public final int getItemCount() {
            return this.f32425b.length;
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final void onBindViewHolder(RecyclerView.C3084b0 b0Var, int i) {
            C14403f fVar = (C14403f) b0Var;
            fVar.f32421b.setText(this.f32425b[i]);
            String str = this.f32426c[i];
            if (str == null) {
                fVar.f32422c.setVisibility(8);
            } else {
                fVar.f32422c.setText(str);
            }
            Drawable drawable = this.f32427d[i];
            if (drawable == null) {
                fVar.f32423d.setVisibility(8);
            } else {
                fVar.f32423d.setImageDrawable(drawable);
            }
        }

        public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C14403f(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(R.layout.exo_styled_settings_list_item, (ViewGroup) null));
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$h */
    public static class C14405h extends RecyclerView.C3084b0 {

        /* renamed from: b */
        public final TextView f32429b;

        /* renamed from: c */
        public final View f32430c;

        public C14405h(View view) {
            super(view);
            this.f32429b = (TextView) view.findViewById(R.id.exo_text);
            this.f32430c = view.findViewById(R.id.exo_check);
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$i */
    public final class C14406i extends C14408k {
        public C14406i() {
            super();
        }

        /* renamed from: j */
        public final void mo48073j(ArrayList arrayList, ArrayList arrayList2, C14389c.C14390a aVar) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= arrayList2.size()) {
                    break;
                } else if (((C14407j) arrayList2.get(i)).f32436e) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (StyledPlayerControlView.this.subtitleButton != null) {
                ImageView access$3600 = StyledPlayerControlView.this.subtitleButton;
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                access$3600.setImageDrawable(z ? styledPlayerControlView.subtitleOnButtonDrawable : styledPlayerControlView.subtitleOffButtonDrawable);
                StyledPlayerControlView.this.subtitleButton.setContentDescription(z ? StyledPlayerControlView.this.subtitleOnContentDescription : StyledPlayerControlView.this.subtitleOffContentDescription);
            }
            this.f32437b = arrayList;
            this.f32438c = arrayList2;
            this.f32439d = aVar;
        }

        /* renamed from: k */
        public final void onBindViewHolder(C14405h hVar, int i) {
            super.onBindViewHolder(hVar, i);
            if (i > 0) {
                hVar.f32430c.setVisibility(this.f32438c.get(i + -1).f32436e ? 0 : 4);
            }
        }

        /* renamed from: l */
        public final void mo48074l(C14405h hVar) {
            boolean z;
            hVar.f32429b.setText(R.string.exo_track_selection_none);
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f32438c.size()) {
                    z = true;
                    break;
                } else if (this.f32438c.get(i2).f32436e) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            View view = hVar.f32430c;
            if (!z) {
                i = 4;
            }
            view.setVisibility(i);
            hVar.itemView.setOnClickListener(new C9060k(this, 4));
        }

        /* renamed from: m */
        public final void mo48075m(String str) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$j */
    public static final class C14407j {

        /* renamed from: a */
        public final int f32432a;

        /* renamed from: b */
        public final int f32433b;

        /* renamed from: c */
        public final int f32434c;

        /* renamed from: d */
        public final String f32435d;

        /* renamed from: e */
        public final boolean f32436e;

        public C14407j(int i, int i2, int i3, String str, boolean z) {
            this.f32432a = i;
            this.f32433b = i2;
            this.f32434c = i3;
            this.f32435d = str;
            this.f32436e = z;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$k */
    public abstract class C14408k extends RecyclerView.Adapter<C14405h> {

        /* renamed from: b */
        public List<Integer> f32437b = new ArrayList();

        /* renamed from: c */
        public List<C14407j> f32438c = new ArrayList();

        /* renamed from: d */
        public C14389c.C14390a f32439d = null;

        public C14408k() {
        }

        public final int getItemCount() {
            if (this.f32438c.isEmpty()) {
                return 0;
            }
            return this.f32438c.size() + 1;
        }

        /* renamed from: j */
        public abstract void mo48073j(ArrayList arrayList, ArrayList arrayList2, C14389c.C14390a aVar);

        /* renamed from: k */
        public void onBindViewHolder(C14405h hVar, int i) {
            if (StyledPlayerControlView.this.trackSelector != null && this.f32439d != null) {
                if (i == 0) {
                    mo48074l(hVar);
                    return;
                }
                boolean z = true;
                C14407j jVar = this.f32438c.get(i - 1);
                TrackGroupArray trackGroupArray = this.f32439d.f32406c[jVar.f32432a];
                DefaultTrackSelector access$4800 = StyledPlayerControlView.this.trackSelector;
                access$4800.getClass();
                if (!access$4800.mo47858d().hasSelectionOverride(jVar.f32432a, trackGroupArray) || !jVar.f32436e) {
                    z = false;
                }
                hVar.f32429b.setText(jVar.f32435d);
                hVar.f32430c.setVisibility(z ? 0 : 4);
                hVar.itemView.setOnClickListener(new C18910e(0, this, jVar));
            }
        }

        /* renamed from: l */
        public abstract void mo48074l(C14405h hVar);

        /* renamed from: m */
        public abstract void mo48075m(String str);

        public final RecyclerView.C3084b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C14405h(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, (ViewGroup) null));
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.StyledPlayerControlView$l */
    public interface C14409l {
        /* renamed from: a */
        void mo48081a(int i);
    }

    static {
        C17945l0.m30331a("goog.exo.ui");
    }

    public StyledPlayerControlView(Context context) {
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

    private void dispatchPause(C17884a1 a1Var) {
        this.controlDispatcher.mo32478h(a1Var, false);
    }

    private void dispatchPlay(C17884a1 a1Var) {
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

    /* access modifiers changed from: private */
    public void dispatchPlayPause(C17884a1 a1Var) {
        int playbackState = a1Var.getPlaybackState();
        if (playbackState == 1 || playbackState == 4 || !a1Var.mo69348x()) {
            dispatchPlay(a1Var);
        } else {
            dispatchPause(a1Var);
        }
    }

    /* access modifiers changed from: private */
    public void displaySettingsWindow(RecyclerView.Adapter<?> adapter) {
        this.settingsView.setAdapter(adapter);
        updateSettingsWindowSize();
        this.needToHideBars = false;
        this.settingsWindow.dismiss();
        this.needToHideBars = true;
        this.settingsWindow.showAsDropDown(this, (getWidth() - this.settingsWindow.getWidth()) - this.settingsWindowMargin, (-this.settingsWindow.getHeight()) - this.settingsWindowMargin);
    }

    private void gatherTrackInfosForAdapter(C14389c.C14390a aVar, int i, List<C14407j> list) {
        C14389c.C14390a aVar2 = aVar;
        TrackGroupArray trackGroupArray = aVar2.f32406c[i];
        C17884a1 a1Var = this.player;
        a1Var.getClass();
        C18886d dVar = a1Var.mo69346v().f42064b[i];
        for (int i2 = 0; i2 < trackGroupArray.length; i2++) {
            TrackGroup trackGroup = trackGroupArray.get(i2);
            for (int i3 = 0; i3 < trackGroup.length; i3++) {
                Format format = trackGroup.getFormat(i3);
                if ((aVar2.f32408e[i][i2][i3] & 7) == 4) {
                    list.add(new C14407j(i, i2, i3, this.trackNameProvider.mo70334a(format), (dVar == null || dVar.mo70317l(format) == -1) ? false : true));
                } else {
                    List<C14407j> list2 = list;
                }
            }
            List<C14407j> list3 = list;
        }
    }

    private void initTrackSelectionAdapter() {
        DefaultTrackSelector defaultTrackSelector;
        C14389c.C14390a aVar;
        C14408k kVar = this.textTrackSelectionAdapter;
        kVar.getClass();
        kVar.f32438c = Collections.emptyList();
        kVar.f32439d = null;
        C14408k kVar2 = this.audioTrackSelectionAdapter;
        kVar2.getClass();
        kVar2.f32438c = Collections.emptyList();
        kVar2.f32439d = null;
        if (this.player != null && (defaultTrackSelector = this.trackSelector) != null && (aVar = defaultTrackSelector.f32403c) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (int i = 0; i < aVar.f32404a; i++) {
                if (aVar.f32405b[i] == 3 && this.controlViewLayoutManager.mo70348c(this.subtitleButton)) {
                    gatherTrackInfosForAdapter(aVar, i, arrayList);
                    arrayList3.add(Integer.valueOf(i));
                } else if (aVar.f32405b[i] == 1) {
                    gatherTrackInfosForAdapter(aVar, i, arrayList2);
                    arrayList4.add(Integer.valueOf(i));
                }
            }
            this.textTrackSelectionAdapter.mo48073j(arrayList3, arrayList, aVar);
            this.audioTrackSelectionAdapter.mo48073j(arrayList4, arrayList2, aVar);
        }
    }

    private static void initializeFullScreenButton(View view, View.OnClickListener onClickListener) {
        if (view != null) {
            view.setVisibility(8);
            view.setOnClickListener(onClickListener);
        }
    }

    @SuppressLint({"InlinedApi"})
    private static boolean isHandledMediaKey(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    /* access modifiers changed from: private */
    public void onFullScreenButtonClicked(View view) {
        if (this.onFullScreenModeChangedListener != null) {
            boolean z = !this.isFullScreen;
            this.isFullScreen = z;
            updateFullScreenButtonForState(this.fullScreenButton, z);
            updateFullScreenButtonForState(this.minimalFullScreenButton, this.isFullScreen);
            C14400c cVar = this.onFullScreenModeChangedListener;
            if (cVar != null) {
                cVar.mo48078a();
            }
        }
    }

    /* access modifiers changed from: private */
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        int i10 = i8 - i6;
        if (!(i3 - i == i7 - i5 && i9 == i10) && this.settingsWindow.isShowing()) {
            updateSettingsWindowSize();
            this.settingsWindow.update(view, (getWidth() - this.settingsWindow.getWidth()) - this.settingsWindowMargin, (-this.settingsWindow.getHeight()) - this.settingsWindowMargin, -1, -1);
        }
    }

    /* access modifiers changed from: private */
    public void onSettingViewClicked(int i) {
        if (i == 0) {
            displaySettingsWindow(this.playbackSpeedAdapter);
        } else if (i == 1) {
            displaySettingsWindow(this.audioTrackSelectionAdapter);
        } else {
            this.settingsWindow.dismiss();
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

    /* access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        C17884a1 a1Var = this.player;
        if (a1Var != null) {
            this.controlDispatcher.mo69377d(a1Var, new C17986y0(f, a1Var.mo69314a().f39327b));
        }
    }

    private boolean shouldShowPauseButton() {
        C17884a1 a1Var = this.player;
        return (a1Var == null || a1Var.getPlaybackState() == 4 || this.player.getPlaybackState() == 1 || !this.player.mo69348x()) ? false : true;
    }

    private void updateButton(boolean z, View view) {
        if (view != null) {
            view.setEnabled(z);
            view.setAlpha(z ? this.buttonAlphaEnabled : this.buttonAlphaDisabled);
        }
    }

    private void updateFastForwardButton() {
        C17915h hVar = this.controlDispatcher;
        if (hVar instanceof C17919i) {
            this.fastForwardMs = ((C17919i) hVar).f38943c;
        }
        int i = (int) (this.fastForwardMs / 1000);
        TextView textView = this.fastForwardButtonTextView;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
        View view = this.fastForwardButton;
        if (view != null) {
            view.setContentDescription(this.resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, i, new Object[]{Integer.valueOf(i)}));
        }
    }

    private void updateFullScreenButtonForState(ImageView imageView, boolean z) {
        if (imageView != null) {
            if (z) {
                imageView.setImageDrawable(this.fullScreenExitDrawable);
                imageView.setContentDescription(this.fullScreenExitContentDescription);
                return;
            }
            imageView.setImageDrawable(this.fullScreenEnterDrawable);
            imageView.setContentDescription(this.fullScreenEnterContentDescription);
        }
    }

    private static void updateFullScreenButtonVisibility(View view, boolean z) {
        if (view != null) {
            if (z) {
                view.setVisibility(0);
            } else {
                view.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateNavigation() {
        /*
            r8 = this;
            boolean r0 = r8.isVisible()
            if (r0 == 0) goto L_0x00a1
            boolean r0 = r8.isAttachedToWindow
            if (r0 != 0) goto L_0x000c
            goto L_0x00a1
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
            r1 = r5
            goto L_0x007c
        L_0x0078:
            r0 = r1
            r3 = r0
            r4 = r3
            r6 = r4
        L_0x007c:
            if (r1 == 0) goto L_0x0081
            r8.updateRewindButton()
        L_0x0081:
            if (r6 == 0) goto L_0x0086
            r8.updateFastForwardButton()
        L_0x0086:
            android.view.View r2 = r8.previousButton
            r8.updateButton(r4, r2)
            android.view.View r2 = r8.rewindButton
            r8.updateButton(r1, r2)
            android.view.View r1 = r8.fastForwardButton
            r8.updateButton(r6, r1)
            android.view.View r1 = r8.nextButton
            r8.updateButton(r0, r1)
            com.google.android.exoplayer2.ui.c r0 = r8.timeBar
            if (r0 == 0) goto L_0x00a1
            r0.setEnabled(r3)
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p526ui.StyledPlayerControlView.updateNavigation():void");
    }

    /* access modifiers changed from: private */
    public void updatePlayPauseButton() {
        if (isVisible() && this.isAttachedToWindow && this.playPauseButton != null) {
            if (shouldShowPauseButton()) {
                ((ImageView) this.playPauseButton).setImageDrawable(this.resources.getDrawable(R.drawable.exo_styled_controls_pause));
                this.playPauseButton.setContentDescription(this.resources.getString(R.string.exo_controls_pause_description));
                return;
            }
            ((ImageView) this.playPauseButton).setImageDrawable(this.resources.getDrawable(R.drawable.exo_styled_controls_play));
            this.playPauseButton.setContentDescription(this.resources.getString(R.string.exo_controls_play_description));
        }
    }

    /* access modifiers changed from: private */
    public void updatePlaybackSpeedList() {
        C17884a1 a1Var = this.player;
        if (a1Var != null) {
            C14401d dVar = this.playbackSpeedAdapter;
            float f = a1Var.mo69314a().f39326a;
            dVar.getClass();
            int round = Math.round(f * 100.0f);
            int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int[] iArr = dVar.f32418c;
                if (i2 < iArr.length) {
                    int abs = Math.abs(round - iArr[i2]);
                    if (abs < i) {
                        i3 = i2;
                        i = abs;
                    }
                    i2++;
                } else {
                    dVar.f32419d = i3;
                    C14404g gVar = this.settingsAdapter;
                    C14401d dVar2 = this.playbackSpeedAdapter;
                    gVar.f32426c[0] = dVar2.f32417b[dVar2.f32419d];
                    return;
                }
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
            C14402e eVar = this.progressUpdateListener;
            if (eVar != null) {
                eVar.mo48079a();
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
                updateButton(false, imageView);
                return;
            }
            C17884a1 a1Var = this.player;
            if (a1Var == null) {
                updateButton(false, imageView);
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
                return;
            }
            updateButton(true, imageView);
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
        }
    }

    private void updateRewindButton() {
        C17915h hVar = this.controlDispatcher;
        if (hVar instanceof C17919i) {
            this.rewindMs = ((C17919i) hVar).f38942b;
        }
        int i = (int) (this.rewindMs / 1000);
        TextView textView = this.rewindButtonTextView;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
        View view = this.rewindButton;
        if (view != null) {
            view.setContentDescription(this.resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, i, new Object[]{Integer.valueOf(i)}));
        }
    }

    private void updateSettingsWindowSize() {
        this.settingsView.measure(0, 0);
        this.settingsWindow.setWidth(Math.min(this.settingsView.getMeasuredWidth(), getWidth() - (this.settingsWindowMargin * 2)));
        this.settingsWindow.setHeight(Math.min(getHeight() - (this.settingsWindowMargin * 2), this.settingsView.getMeasuredHeight()));
    }

    /* access modifiers changed from: private */
    public void updateShuffleButton() {
        ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.shuffleButton) != null) {
            C17884a1 a1Var = this.player;
            if (!this.controlViewLayoutManager.mo70348c(imageView)) {
                updateButton(false, this.shuffleButton);
            } else if (a1Var == null) {
                updateButton(false, this.shuffleButton);
                this.shuffleButton.setImageDrawable(this.shuffleOffButtonDrawable);
                this.shuffleButton.setContentDescription(this.shuffleOffContentDescription);
            } else {
                updateButton(true, this.shuffleButton);
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

    /* access modifiers changed from: private */
    public void updateTrackLists() {
        initTrackSelectionAdapter();
        updateButton(this.textTrackSelectionAdapter.getItemCount() > 0, this.subtitleButton);
    }

    public void addVisibilityListener(C14409l lVar) {
        lVar.getClass();
        this.visibilityListeners.add(lVar);
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

    public C17884a1 getPlayer() {
        return this.player;
    }

    public int getRepeatToggleModes() {
        return this.repeatToggleModes;
    }

    public boolean getShowShuffleButton() {
        return this.controlViewLayoutManager.mo70348c(this.shuffleButton);
    }

    public boolean getShowSubtitleButton() {
        return this.controlViewLayoutManager.mo70348c(this.subtitleButton);
    }

    public int getShowTimeoutMs() {
        return this.showTimeoutMs;
    }

    public boolean getShowVrButton() {
        return this.controlViewLayoutManager.mo70348c(this.vrButton);
    }

    public void hide() {
        C18917l lVar = this.controlViewLayoutManager;
        int i = lVar.f42165z;
        if (i != 3 && i != 2) {
            lVar.mo70349f();
            if (!lVar.f42139C) {
                lVar.mo70352i(2);
            } else if (lVar.f42165z == 1) {
                lVar.f42152m.start();
            } else {
                lVar.f42153n.start();
            }
        }
    }

    public void hideImmediately() {
        C18917l lVar = this.controlViewLayoutManager;
        int i = lVar.f42165z;
        if (i != 3 && i != 2) {
            lVar.mo70349f();
            lVar.mo70352i(2);
        }
    }

    public boolean isAnimationEnabled() {
        return this.controlViewLayoutManager.f42139C;
    }

    public boolean isFullyVisible() {
        C18917l lVar = this.controlViewLayoutManager;
        return lVar.f42165z == 0 && lVar.f42140a.isVisible();
    }

    public boolean isVisible() {
        return getVisibility() == 0;
    }

    public void notifyOnVisibilityChange() {
        Iterator<C14409l> it = this.visibilityListeners.iterator();
        while (it.hasNext()) {
            it.next().mo48081a(getVisibility());
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C18917l lVar = this.controlViewLayoutManager;
        lVar.f42140a.addOnLayoutChangeListener(lVar.f42163x);
        this.isAttachedToWindow = true;
        if (isFullyVisible()) {
            this.controlViewLayoutManager.mo70350g();
        }
        updateAll();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C18917l lVar = this.controlViewLayoutManager;
        lVar.f42140a.removeOnLayoutChangeListener(lVar.f42163x);
        this.isAttachedToWindow = false;
        removeCallbacks(this.updateProgressAction);
        this.controlViewLayoutManager.mo70349f();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.controlViewLayoutManager.f42141b;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public void removeVisibilityListener(C14409l lVar) {
        this.visibilityListeners.remove(lVar);
    }

    public void requestPlayPauseFocus() {
        View view = this.playPauseButton;
        if (view != null) {
            view.requestFocus();
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.controlViewLayoutManager.f42139C = z;
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

    public void setOnFullScreenModeChangedListener(C14400c cVar) {
        this.onFullScreenModeChangedListener = cVar;
        boolean z = true;
        updateFullScreenButtonVisibility(this.fullScreenButton, cVar != null);
        ImageView imageView = this.minimalFullScreenButton;
        if (cVar == null) {
            z = false;
        }
        updateFullScreenButtonVisibility(imageView, z);
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
            if (a1Var instanceof C17950n) {
                C18888f f = ((C17950n) a1Var).mo69393f();
                if (f instanceof DefaultTrackSelector) {
                    this.trackSelector = (DefaultTrackSelector) f;
                }
            } else {
                this.trackSelector = null;
            }
            updateAll();
        }
    }

    public void setProgressUpdateListener(C14402e eVar) {
        this.progressUpdateListener = eVar;
    }

    public void setRepeatToggleModes(int i) {
        this.repeatToggleModes = i;
        C17884a1 a1Var = this.player;
        boolean z = false;
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
        C18917l lVar = this.controlViewLayoutManager;
        ImageView imageView = this.repeatToggleButton;
        if (i != 0) {
            z = true;
        }
        lVar.mo70351h(imageView, z);
        updateRepeatModeButton();
    }

    public void setShowFastForwardButton(boolean z) {
        this.controlViewLayoutManager.mo70351h(this.fastForwardButton, z);
        updateNavigation();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.showMultiWindowTimeBar = z;
        updateTimeline();
    }

    public void setShowNextButton(boolean z) {
        this.controlViewLayoutManager.mo70351h(this.nextButton, z);
        updateNavigation();
    }

    public void setShowPreviousButton(boolean z) {
        this.controlViewLayoutManager.mo70351h(this.previousButton, z);
        updateNavigation();
    }

    public void setShowRewindButton(boolean z) {
        this.controlViewLayoutManager.mo70351h(this.rewindButton, z);
        updateNavigation();
    }

    public void setShowShuffleButton(boolean z) {
        this.controlViewLayoutManager.mo70351h(this.shuffleButton, z);
        updateShuffleButton();
    }

    public void setShowSubtitleButton(boolean z) {
        this.controlViewLayoutManager.mo70351h(this.subtitleButton, z);
    }

    public void setShowTimeoutMs(int i) {
        this.showTimeoutMs = i;
        if (isFullyVisible()) {
            this.controlViewLayoutManager.mo70350g();
        }
    }

    public void setShowVrButton(boolean z) {
        this.controlViewLayoutManager.mo70351h(this.vrButton, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.timeBarMinUpdateIntervalMs = C14049b0.m21636i(i, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.vrButton;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            updateButton(onClickListener != null, this.vrButton);
        }
    }

    public void show() {
        C18917l lVar = this.controlViewLayoutManager;
        if (!lVar.f42140a.isVisible()) {
            lVar.f42140a.setVisibility(0);
            lVar.f42140a.updateAll();
            lVar.f42140a.requestPlayPauseFocus();
        }
        lVar.mo70353k();
    }

    public void updateAll() {
        updatePlayPauseButton();
        updateNavigation();
        updateRepeatModeButton();
        updateShuffleButton();
        updateTrackLists();
        updatePlaybackSpeedList();
        updateTimeline();
    }

    public StyledPlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static int getRepeatToggleModes(TypedArray typedArray, int i) {
        return typedArray.getInt(10, i);
    }

    public StyledPlayerControlView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StyledPlayerControlView(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        C14399b bVar;
        boolean z11;
        boolean z12;
        AttributeSet attributeSet3 = attributeSet2;
        this.rewindMs = LoginStatusClient.DEFAULT_TOAST_DURATION_MS;
        this.fastForwardMs = 15000;
        this.showTimeoutMs = 5000;
        this.repeatToggleModes = 0;
        this.timeBarMinUpdateIntervalMs = 200;
        int i2 = R.layout.exo_styled_player_control_view;
        if (attributeSet3 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet3, C19382n.f43266p, 0, 0);
            try {
                this.rewindMs = (long) obtainStyledAttributes.getInt(11, (int) this.rewindMs);
                this.fastForwardMs = (long) obtainStyledAttributes.getInt(7, (int) this.fastForwardMs);
                i2 = obtainStyledAttributes.getResourceId(6, R.layout.exo_styled_player_control_view);
                this.showTimeoutMs = obtainStyledAttributes.getInt(23, this.showTimeoutMs);
                this.repeatToggleModes = getRepeatToggleModes(obtainStyledAttributes, this.repeatToggleModes);
                boolean z13 = obtainStyledAttributes.getBoolean(20, true);
                boolean z14 = obtainStyledAttributes.getBoolean(17, true);
                boolean z15 = obtainStyledAttributes.getBoolean(19, true);
                boolean z16 = obtainStyledAttributes.getBoolean(18, true);
                boolean z17 = obtainStyledAttributes.getBoolean(21, false);
                boolean z18 = obtainStyledAttributes.getBoolean(22, false);
                boolean z19 = obtainStyledAttributes.getBoolean(24, false);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(25, this.timeBarMinUpdateIntervalMs));
                boolean z20 = obtainStyledAttributes.getBoolean(2, true);
                obtainStyledAttributes.recycle();
                z5 = z20;
                boolean z21 = z16;
                z4 = z13;
                z8 = z19;
                z = z21;
                boolean z22 = z17;
                z3 = z14;
                z7 = z18;
                z2 = z15;
                z6 = z22;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z8 = false;
            z7 = false;
            z6 = false;
            z5 = true;
            z4 = true;
            z3 = true;
            z2 = true;
            z = true;
        }
        LayoutInflater.from(context).inflate(i2, this);
        setDescendantFocusability(PrimitiveArrayBuilder.MAX_CHUNK_SIZE);
        C14399b bVar2 = new C14399b();
        this.componentListener = bVar2;
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
        boolean z23 = z4;
        this.controlDispatcher = new C17919i(this.fastForwardMs, this.rewindMs);
        this.updateProgressAction = new C1858o(this, 5);
        this.durationView = (TextView) findViewById(R.id.exo_duration);
        this.positionView = (TextView) findViewById(R.id.exo_position);
        ImageView imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.subtitleButton = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(bVar2);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.fullScreenButton = imageView2;
        initializeFullScreenButton(imageView2, new C9055f(this, 6));
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.minimalFullScreenButton = imageView3;
        initializeFullScreenButton(imageView3, new C5698d(this, 2));
        View findViewById = findViewById(R.id.exo_settings);
        this.settingsButton = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(bVar2);
        }
        View findViewById2 = findViewById(R.id.exo_playback_speed);
        this.playbackSpeedButton = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(bVar2);
        }
        View findViewById3 = findViewById(R.id.exo_audio_track);
        this.audioTrackButton = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(bVar2);
        }
        C14420c cVar = (C14420c) findViewById(R.id.exo_progress);
        View findViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (cVar != null) {
            this.timeBar = cVar;
            bVar = bVar2;
            z10 = z8;
            z9 = z7;
            z11 = z6;
        } else if (findViewById4 != null) {
            bVar = bVar2;
            z10 = z8;
            z9 = z7;
            z11 = z6;
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, (AttributeSet) null, 0, attributeSet2, 2132017729);
            defaultTimeBar.setId(R.id.exo_progress);
            defaultTimeBar.setLayoutParams(findViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById4.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById4);
            viewGroup.removeView(findViewById4);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            this.timeBar = defaultTimeBar;
        } else {
            bVar = bVar2;
            z10 = z8;
            z9 = z7;
            z11 = z6;
            this.timeBar = null;
        }
        C14420c cVar2 = this.timeBar;
        C14399b bVar3 = bVar;
        if (cVar2 != null) {
            cVar2.addListener(bVar3);
        }
        View findViewById5 = findViewById(R.id.exo_play_pause);
        this.playPauseButton = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(bVar3);
        }
        View findViewById6 = findViewById(R.id.exo_prev);
        this.previousButton = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(bVar3);
        }
        View findViewById7 = findViewById(R.id.exo_next);
        this.nextButton = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(bVar3);
        }
        Typeface a = C8292f.m16582a(context, R.font.roboto_medium_numbers);
        View findViewById8 = findViewById(R.id.exo_rew);
        TextView textView = findViewById8 == null ? (TextView) findViewById(R.id.exo_rew_with_amount) : null;
        this.rewindButtonTextView = textView;
        if (textView != null) {
            textView.setTypeface(a);
        }
        findViewById8 = findViewById8 == null ? textView : findViewById8;
        this.rewindButton = findViewById8;
        if (findViewById8 != null) {
            findViewById8.setOnClickListener(bVar3);
        }
        View findViewById9 = findViewById(R.id.exo_ffwd);
        TextView textView2 = findViewById9 == null ? (TextView) findViewById(R.id.exo_ffwd_with_amount) : null;
        this.fastForwardButtonTextView = textView2;
        if (textView2 != null) {
            textView2.setTypeface(a);
        }
        findViewById9 = findViewById9 == null ? textView2 : findViewById9;
        this.fastForwardButton = findViewById9;
        if (findViewById9 != null) {
            findViewById9.setOnClickListener(bVar3);
        }
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.repeatToggleButton = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(bVar3);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_shuffle);
        this.shuffleButton = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(bVar3);
        }
        Resources resources2 = context.getResources();
        this.resources = resources2;
        this.buttonAlphaEnabled = ((float) resources2.getInteger(R.integer.exo_media_button_opacity_percentage_enabled)) / 100.0f;
        this.buttonAlphaDisabled = ((float) this.resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled)) / 100.0f;
        View findViewById10 = findViewById(R.id.exo_vr);
        this.vrButton = findViewById10;
        if (findViewById10 != null) {
            updateButton(false, findViewById10);
        }
        C18917l lVar = new C18917l(this);
        this.controlViewLayoutManager = lVar;
        lVar.f42139C = z5;
        String[] strArr = new String[2];
        ImageView imageView6 = imageView4;
        strArr[0] = this.resources.getString(R.string.exo_controls_playback_speed);
        String[] strArr2 = strArr;
        strArr2[1] = this.resources.getString(R.string.exo_track_selection_title_audio);
        View view = findViewById10;
        this.settingsAdapter = new C14404g(strArr2, new Drawable[]{this.resources.getDrawable(R.drawable.exo_styled_controls_speed), this.resources.getDrawable(R.drawable.exo_styled_controls_audiotrack)});
        this.settingsWindowMargin = this.resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.settingsView = recyclerView;
        recyclerView.setAdapter(this.settingsAdapter);
        RecyclerView recyclerView2 = this.settingsView;
        getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        PopupWindow popupWindow = new PopupWindow(this.settingsView, -2, -2, true);
        this.settingsWindow = popupWindow;
        if (C14049b0.f30913a < 23) {
            z12 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z12 = false;
        }
        this.settingsWindow.setOnDismissListener(bVar3);
        this.needToHideBars = true;
        this.trackNameProvider = new C18908c(getResources());
        this.subtitleOnButtonDrawable = this.resources.getDrawable(R.drawable.exo_styled_controls_subtitle_on);
        this.subtitleOffButtonDrawable = this.resources.getDrawable(R.drawable.exo_styled_controls_subtitle_off);
        this.subtitleOnContentDescription = this.resources.getString(R.string.exo_controls_cc_enabled_description);
        this.subtitleOffContentDescription = this.resources.getString(R.string.exo_controls_cc_disabled_description);
        this.textTrackSelectionAdapter = new C14406i();
        this.audioTrackSelectionAdapter = new C14398a();
        this.playbackSpeedAdapter = new C14401d(this.resources.getStringArray(R.array.exo_playback_speeds), this.resources.getIntArray(R.array.exo_speed_multiplied_by_100));
        this.fullScreenExitDrawable = this.resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_exit);
        this.fullScreenEnterDrawable = this.resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_enter);
        this.repeatOffButtonDrawable = this.resources.getDrawable(R.drawable.exo_styled_controls_repeat_off);
        this.repeatOneButtonDrawable = this.resources.getDrawable(R.drawable.exo_styled_controls_repeat_one);
        this.repeatAllButtonDrawable = this.resources.getDrawable(R.drawable.exo_styled_controls_repeat_all);
        this.shuffleOnButtonDrawable = this.resources.getDrawable(R.drawable.exo_styled_controls_shuffle_on);
        this.shuffleOffButtonDrawable = this.resources.getDrawable(R.drawable.exo_styled_controls_shuffle_off);
        this.fullScreenExitContentDescription = this.resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.fullScreenEnterContentDescription = this.resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.repeatOffButtonContentDescription = this.resources.getString(R.string.exo_controls_repeat_off_description);
        this.repeatOneButtonContentDescription = this.resources.getString(R.string.exo_controls_repeat_one_description);
        this.repeatAllButtonContentDescription = this.resources.getString(R.string.exo_controls_repeat_all_description);
        this.shuffleOnContentDescription = this.resources.getString(R.string.exo_controls_shuffle_on_description);
        this.shuffleOffContentDescription = this.resources.getString(R.string.exo_controls_shuffle_off_description);
        this.controlViewLayoutManager.mo70351h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        this.controlViewLayoutManager.mo70351h(findViewById9, z3);
        this.controlViewLayoutManager.mo70351h(findViewById8, z23);
        this.controlViewLayoutManager.mo70351h(findViewById6, z2);
        this.controlViewLayoutManager.mo70351h(findViewById7, z);
        this.controlViewLayoutManager.mo70351h(imageView5, z11);
        this.controlViewLayoutManager.mo70351h(this.subtitleButton, z9);
        this.controlViewLayoutManager.mo70351h(view, z10);
        this.controlViewLayoutManager.mo70351h(imageView6, this.repeatToggleModes != 0 ? true : z12);
        addOnLayoutChangeListener(new C18909d(this));
    }
}
