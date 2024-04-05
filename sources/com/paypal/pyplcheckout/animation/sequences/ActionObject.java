package com.paypal.pyplcheckout.animation.sequences;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.etsy.android.lib.models.ResponseConstants;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ActionObject {
    private Action action;
    private Duration duration;
    private Drawable imageResource;
    private String newText;
    private WeakReference<View> view;

    public ActionObject(Duration duration2, WeakReference<View> weakReference, Action action2, String str, Drawable drawable) {
        C19383o.m32797g(duration2, "duration");
        C19383o.m32797g(weakReference, "view");
        C19383o.m32797g(action2, ResponseConstants.ACTION);
        this.duration = duration2;
        this.view = weakReference;
        this.action = action2;
        this.newText = str;
        this.imageResource = drawable;
    }

    public static /* synthetic */ ActionObject copy$default(ActionObject actionObject, Duration duration2, WeakReference<View> weakReference, Action action2, String str, Drawable drawable, int i, Object obj) {
        if ((i & 1) != 0) {
            duration2 = actionObject.duration;
        }
        if ((i & 2) != 0) {
            weakReference = actionObject.view;
        }
        WeakReference<View> weakReference2 = weakReference;
        if ((i & 4) != 0) {
            action2 = actionObject.action;
        }
        Action action3 = action2;
        if ((i & 8) != 0) {
            str = actionObject.newText;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            drawable = actionObject.imageResource;
        }
        return actionObject.copy(duration2, weakReference2, action3, str2, drawable);
    }

    public final Duration component1() {
        return this.duration;
    }

    public final WeakReference<View> component2() {
        return this.view;
    }

    public final Action component3() {
        return this.action;
    }

    public final String component4() {
        return this.newText;
    }

    public final Drawable component5() {
        return this.imageResource;
    }

    public final ActionObject copy(Duration duration2, WeakReference<View> weakReference, Action action2, String str, Drawable drawable) {
        C19383o.m32797g(duration2, "duration");
        C19383o.m32797g(weakReference, "view");
        C19383o.m32797g(action2, ResponseConstants.ACTION);
        return new ActionObject(duration2, weakReference, action2, str, drawable);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionObject)) {
            return false;
        }
        ActionObject actionObject = (ActionObject) obj;
        return this.duration == actionObject.duration && C19383o.m32792b(this.view, actionObject.view) && this.action == actionObject.action && C19383o.m32792b(this.newText, actionObject.newText) && C19383o.m32792b(this.imageResource, actionObject.imageResource);
    }

    public final Action getAction() {
        return this.action;
    }

    public final Duration getDuration() {
        return this.duration;
    }

    public final Drawable getImageResource() {
        return this.imageResource;
    }

    public final String getNewText() {
        return this.newText;
    }

    public final WeakReference<View> getView() {
        return this.view;
    }

    public int hashCode() {
        int hashCode = (this.action.hashCode() + ((this.view.hashCode() + (this.duration.hashCode() * 31)) * 31)) * 31;
        String str = this.newText;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Drawable drawable = this.imageResource;
        if (drawable != null) {
            i = drawable.hashCode();
        }
        return hashCode2 + i;
    }

    public final void setAction(Action action2) {
        C19383o.m32797g(action2, "<set-?>");
        this.action = action2;
    }

    public final void setDuration(Duration duration2) {
        C19383o.m32797g(duration2, "<set-?>");
        this.duration = duration2;
    }

    public final void setImageResource(Drawable drawable) {
        this.imageResource = drawable;
    }

    public final void setNewText(String str) {
        this.newText = str;
    }

    public final void setView(WeakReference<View> weakReference) {
        C19383o.m32797g(weakReference, "<set-?>");
        this.view = weakReference;
    }

    public String toString() {
        Duration duration2 = this.duration;
        WeakReference<View> weakReference = this.view;
        Action action2 = this.action;
        String str = this.newText;
        Drawable drawable = this.imageResource;
        return "ActionObject(duration=" + duration2 + ", view=" + weakReference + ", action=" + action2 + ", newText=" + str + ", imageResource=" + drawable + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ActionObject(Duration duration2, WeakReference weakReference, Action action2, String str, Drawable drawable, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Duration.NONE : duration2, weakReference, action2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : drawable);
    }
}
