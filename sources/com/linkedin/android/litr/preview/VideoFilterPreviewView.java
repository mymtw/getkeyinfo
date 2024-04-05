package com.linkedin.android.litr.preview;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import com.linkedin.android.litr.preview.VideoPreviewRenderer;
import p609ko.C18157a;
import p609ko.C18158b;

public class VideoFilterPreviewView extends GLSurfaceView {

    /* renamed from: com.linkedin.android.litr.preview.VideoFilterPreviewView$a */
    public class C17044a implements VideoPreviewRenderer.C17048d {
        public C17044a() {
        }
    }

    public VideoFilterPreviewView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        super.setRenderer(renderer);
        if (renderer instanceof VideoPreviewRenderer) {
            ((VideoPreviewRenderer) renderer).setPreviewRenderListener(new C17044a());
        }
    }

    public VideoFilterPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setEGLContextFactory(new C18158b());
        setEGLConfigChooser(new C18157a());
    }
}
