package com.etsy.android.p327ui.user.review;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.lifecycle.C2887s;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.stylekit.views.CollagePlayerView;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.google.android.exoplayer2.ExoPlaybackException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p594jh.C17884a1;

/* renamed from: com.etsy.android.ui.user.review.FullScreenVideoPlayerFragment */
public final class FullScreenVideoPlayerFragment extends TrackingBaseFragment {
    public static final int $stable = 8;
    public static final C11695a Companion = new C11695a();
    public static final String KEY_VIDEO_URI = "key_video_uri";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    /* renamed from: com.etsy.android.ui.user.review.FullScreenVideoPlayerFragment$a */
    public static final class C11695a {
    }

    /* renamed from: com.etsy.android.ui.user.review.FullScreenVideoPlayerFragment$b */
    public static final class C11696b implements C17884a1.C17888d {

        /* renamed from: b */
        public final /* synthetic */ FullScreenVideoPlayerFragment f25955b;

        /* renamed from: c */
        public final /* synthetic */ CollagePlayerView f25956c;

        /* renamed from: d */
        public final /* synthetic */ View f25957d;

        /* renamed from: e */
        public final /* synthetic */ CollagePlayerView f25958e;

        public C11696b(FullScreenVideoPlayerFragment fullScreenVideoPlayerFragment, CollagePlayerView collagePlayerView, View view, CollagePlayerView collagePlayerView2) {
            this.f25955b = fullScreenVideoPlayerFragment;
            this.f25956c = collagePlayerView;
            this.f25957d = view;
            this.f25958e = collagePlayerView2;
        }

        public final void onPlaybackStateChanged(int i) {
            if (i == 2) {
                ViewExtensions.m12860d(this.f25956c);
                ViewExtensions.m12869m(this.f25957d);
            } else if (i == 3) {
                this.f25955b.requireActivity().getWindow().addFlags(RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN);
                ViewExtensions.m12869m(this.f25956c);
                ViewExtensions.m12860d(this.f25957d);
                this.f25958e.resume();
            }
        }

        public final void onPlayerError(ExoPlaybackException exoPlaybackException) {
            C19383o.m32797g(exoPlaybackException, "error");
            exoPlaybackException.printStackTrace();
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.layout_full_screen_video_preview, viewGroup, false);
        C19383o.m32796f(inflate, "inflater.inflate(R.layou…review, container, false)");
        return inflate;
    }

    public void onDetach() {
        super.onDetach();
        requireActivity().getWindow().clearFlags(RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C19383o.m32797g(view, "view");
        super.onViewCreated(view, bundle);
        CollagePlayerView collagePlayerView = (CollagePlayerView) view.findViewById(R.id.video_player);
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.close_video_player_button);
        View findViewById = view.findViewById(R.id.loading_indicator);
        Bundle arguments = getArguments();
        Uri uri = arguments != null ? (Uri) arguments.getParcelable(KEY_VIDEO_URI) : null;
        if (uri != null) {
            C2887s viewLifecycleOwner = getViewLifecycleOwner();
            C19383o.m32796f(viewLifecycleOwner, "viewLifecycleOwner");
            collagePlayerView.setUpVideo(uri, viewLifecycleOwner);
            collagePlayerView.resume();
            collagePlayerView.setListener(new C11696b(this, collagePlayerView, findViewById, collagePlayerView));
        }
        C19383o.m32796f(imageButton, "closeButton");
        ViewExtensions.m12866j(imageButton, new FullScreenVideoPlayerFragment$onViewCreated$2(this));
    }
}
