package com.etsy.android.uikit.p331ui.core;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.etsy.android.lib.logger.perf.C8709f;

/* renamed from: com.etsy.android.uikit.ui.core.VideoFragment */
public class VideoFragment extends TrackingBaseFragment {
    public View mActivityIndicator;
    public MediaController mMediaController;
    public String mVideoUrl;
    public VideoView mVideoView;

    /* renamed from: com.etsy.android.uikit.ui.core.VideoFragment$a */
    public class C11891a implements MediaPlayer.OnErrorListener {
        public C11891a() {
        }

        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            VideoFragment.this.onVideoError();
            return false;
        }
    }

    /* renamed from: com.etsy.android.uikit.ui.core.VideoFragment$b */
    public class C11892b implements MediaPlayer.OnPreparedListener {
        public C11892b() {
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            VideoFragment.this.mActivityIndicator.setVisibility(8);
            VideoFragment.this.mMediaController.show(5000);
            VideoFragment.this.mVideoView.start();
            VideoFragment.this.onVideoPrepared();
        }
    }

    /* renamed from: com.etsy.android.uikit.ui.core.VideoFragment$c */
    public class C11893c implements MediaPlayer.OnCompletionListener {
        public C11893c() {
        }

        public final void onCompletion(MediaPlayer mediaPlayer) {
            VideoFragment.this.onVideoCompleted();
        }
    }

    private void goBack() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = activity.getIntent();
            activity.finish();
            if (intent != null) {
                activity.overridePendingTransition(intent.getIntExtra("NAV_ANIM_BOTTOM_ENTER", 0), intent.getIntExtra("NAV_ANIM_TOP_EXIT", 0));
            }
        }
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.mMediaController = new MediaController(getActivity());
        if (arguments != null) {
            this.mVideoUrl = arguments.getString("video_url");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_listing_video, viewGroup, false);
        this.mVideoView = (VideoView) inflate.findViewById(R.id.listing_video_player);
        this.mActivityIndicator = inflate.findViewById(R.id.activity_indicator);
        this.mVideoView.setMediaController(this.mMediaController);
        return inflate;
    }

    public void onVideoCompleted() {
        goBack();
    }

    public void onVideoError() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(this.mVideoUrl), "video/mp4");
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(getActivity(), R.string.no_video_found, 0).show();
            goBack();
        }
    }

    public void onVideoPrepared() {
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        String str = this.mVideoUrl;
        if (str == null || str.equals("")) {
            Toast.makeText(getActivity(), R.string.no_video_found, 0).show();
            getActivity().onBackPressed();
            return;
        }
        this.mVideoView.setVideoURI(Uri.parse(this.mVideoUrl));
        this.mVideoView.setOnErrorListener(new C11891a());
        this.mVideoView.setOnPreparedListener(new C11892b());
        this.mVideoView.setOnCompletionListener(new C11893c());
    }
}
