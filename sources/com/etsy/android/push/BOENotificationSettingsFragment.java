package com.etsy.android.push;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.Group;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.util.C8901g0;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import com.google.android.material.snackbar.Snackbar;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p435rb.C13350a;
import p440s9.C13366a;

public final class BOENotificationSettingsFragment extends TrackingBaseFragment implements C13366a, C9731e0.C9733b {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final CompoundButton.OnCheckedChangeListener checkedChangedListener = new BOENotificationSettingsFragment$checkedChangedListener$1(this);
    private ViewGroup enableNotificationsView;
    private View errorView;
    private View loadingView;
    public BOENotificationSettingsPresenter presenter;
    private Group serverDrivenNotificationSettingsView;
    private ViewGroup serverDrivenSettingsSection;
    private TextView serverDrivenSettingsSectionHeader;

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

    public final void addViewToNotificationSubscriptionPanel(View view) {
        C19383o.m32797g(view, "settingsRow");
        ViewGroup viewGroup = this.serverDrivenSettingsSection;
        if (viewGroup != null) {
            viewGroup.addView(view);
        } else {
            C19383o.m32805o("serverDrivenSettingsSection");
            throw null;
        }
    }

    public final CompoundButton.OnCheckedChangeListener getCheckedChangedListener() {
        return this.checkedChangedListener;
    }

    public int getFragmentTitle() {
        return R.string.push_notifications;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final BOENotificationSettingsPresenter getPresenter() {
        BOENotificationSettingsPresenter bOENotificationSettingsPresenter = this.presenter;
        if (bOENotificationSettingsPresenter != null) {
            return bOENotificationSettingsPresenter;
        }
        C19383o.m32805o("presenter");
        throw null;
    }

    public String getTrackingName() {
        return "push_notifications";
    }

    public final void handleUpdateFailure(CompoundButton compoundButton) {
        C19383o.m32797g(compoundButton, "buttonView");
        SwitchCompat switchCompat = (SwitchCompat) compoundButton;
        View view = getView();
        if (view != null) {
            switchCompat.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            switchCompat.setChecked(!switchCompat.isChecked());
            switchCompat.setOnCheckedChangeListener(this.checkedChangedListener);
            Snackbar h = Snackbar.m25028h(view, view.getContext().getString(R.string.update_notification_setting_error_message), 0);
            h.f34654c.setBackgroundColor(C13350a.m21013d(view.getContext(), R.attr.clg_color_bg_error));
            h.mo54762i();
        }
    }

    public final void handleUpdateSuccess() {
        View view = getView();
        if (view != null) {
            C8901g0.m17336b(view, view.getContext().getString(R.string.update_notification_setting_success_message));
        }
    }

    public final View inflateSettingsRow() {
        LayoutInflater from = LayoutInflater.from(getContext());
        ViewGroup viewGroup = this.serverDrivenSettingsSection;
        if (viewGroup != null) {
            View inflate = from.inflate(R.layout.item_notification_settings_group, viewGroup, false);
            C19383o.m32796f(inflate, "from(context).inflate(R.…                   false)");
            return inflate;
        }
        C19383o.m32805o("serverDrivenSettingsSection");
        throw null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_notification_settings, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.loading_notification_settings);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.l…ng_notification_settings)");
        this.loadingView = findViewById;
        View findViewById2 = inflate.findViewById(R.id.error_view);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.error_view)");
        this.errorView = findViewById2;
        View findViewById3 = inflate.findViewById(R.id.server_driven_notification_settings_view);
        C19383o.m32796f(findViewById3, "view.findViewById(R.id.s…tification_settings_view)");
        this.serverDrivenNotificationSettingsView = (Group) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.server_driven_settings_section);
        C19383o.m32796f(findViewById4, "view.findViewById(R.id.s…_driven_settings_section)");
        this.serverDrivenSettingsSection = (ViewGroup) findViewById4;
        View findViewById5 = inflate.findViewById(R.id.server_driven_settings_section_header);
        C19383o.m32796f(findViewById5, "view.findViewById(R.id.s…_settings_section_header)");
        this.serverDrivenSettingsSectionHeader = (TextView) findViewById5;
        View findViewById6 = inflate.findViewById(R.id.enable_notifications_section);
        C19383o.m32796f(findViewById6, "view.findViewById(R.id.e…le_notifications_section)");
        this.enableNotificationsView = (ViewGroup) findViewById6;
        TextView textView = this.serverDrivenSettingsSectionHeader;
        if (textView != null) {
            textView.setText(R.string.notification_settings_section_header);
            View findViewById7 = inflate.findViewById(R.id.error_try_again);
            C19383o.m32796f(findViewById7, "view.findViewById<Button>(R.id.error_try_again)");
            ViewExtensions.m12866j(findViewById7, new BOENotificationSettingsFragment$onCreateView$1(this));
            View findViewById8 = inflate.findViewById(R.id.notifications_open_settings_button);
            C19383o.m32796f(findViewById8, "view.findViewById<Button…ons_open_settings_button)");
            ViewExtensions.m12866j(findViewById8, new BOENotificationSettingsFragment$onCreateView$2(this));
            BOENotificationSettingsPresenter presenter2 = getPresenter();
            presenter2.getClass();
            presenter2.f19707e = this;
            if (presenter2.f19706d.f19463j == null) {
                showErrorView();
            }
            return inflate;
        }
        C19383o.m32805o("serverDrivenSettingsSectionHeader");
        throw null;
    }

    public void onDestroyView() {
        super.onDestroyView();
        getPresenter().f19707e = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r1 = r1.requireContext();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r2 = this;
            super.onResume()
            com.etsy.android.push.BOENotificationSettingsPresenter r0 = r2.getPresenter()
            r0.mo30537a()
            com.etsy.android.push.BOENotificationSettingsFragment r1 = r0.f19707e
            if (r1 == 0) goto L_0x001d
            android.content.Context r1 = r1.requireContext()
            if (r1 == 0) goto L_0x001d
            androidx.core.app.NotificationManagerCompat r1 = androidx.core.app.NotificationManagerCompat.from(r1)
            boolean r1 = r1.areNotificationsEnabled()
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            r0.f19708f = r1
            com.etsy.android.push.BOENotificationSettingsFragment r0 = r0.f19707e
            if (r0 == 0) goto L_0x0029
            r1 = r1 ^ 1
            r0.showEnableNotificationsView(r1)
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.push.BOENotificationSettingsFragment.onResume():void");
    }

    public void onStop() {
        super.onStop();
        getPresenter().f19709g.mo19405d();
    }

    public final void resetNotificationSubscriptionPanel() {
        ViewGroup viewGroup = this.serverDrivenSettingsSection;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        } else {
            C19383o.m32805o("serverDrivenSettingsSection");
            throw null;
        }
    }

    public final void setPresenter(BOENotificationSettingsPresenter bOENotificationSettingsPresenter) {
        C19383o.m32797g(bOENotificationSettingsPresenter, "<set-?>");
        this.presenter = bOENotificationSettingsPresenter;
    }

    public final void showEnableNotificationsView(boolean z) {
        if (z) {
            ViewGroup viewGroup = this.enableNotificationsView;
            if (viewGroup != null) {
                ViewExtensions.m12869m(viewGroup);
                Group group = this.serverDrivenNotificationSettingsView;
                if (group != null) {
                    int[] referencedIds = group.getReferencedIds();
                    C19383o.m32796f(referencedIds, "referencedIds");
                    for (int findViewById : referencedIds) {
                        group.getRootView().findViewById(findViewById).setAlpha(0.5f);
                    }
                    return;
                }
                C19383o.m32805o("serverDrivenNotificationSettingsView");
                throw null;
            }
            C19383o.m32805o("enableNotificationsView");
            throw null;
        }
        ViewGroup viewGroup2 = this.enableNotificationsView;
        if (viewGroup2 != null) {
            ViewExtensions.m12860d(viewGroup2);
        } else {
            C19383o.m32805o("enableNotificationsView");
            throw null;
        }
    }

    public final void showErrorView() {
        View view = this.loadingView;
        if (view != null) {
            ViewExtensions.m12860d(view);
            View view2 = this.errorView;
            if (view2 != null) {
                ViewExtensions.m12869m(view2);
                TextView textView = this.serverDrivenSettingsSectionHeader;
                if (textView != null) {
                    ViewExtensions.m12860d(textView);
                    ViewGroup viewGroup = this.serverDrivenSettingsSection;
                    if (viewGroup != null) {
                        ViewExtensions.m12860d(viewGroup);
                        ViewGroup viewGroup2 = this.enableNotificationsView;
                        if (viewGroup2 != null) {
                            ViewExtensions.m12860d(viewGroup2);
                        } else {
                            C19383o.m32805o("enableNotificationsView");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("serverDrivenSettingsSection");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("serverDrivenSettingsSectionHeader");
                    throw null;
                }
            } else {
                C19383o.m32805o("errorView");
                throw null;
            }
        } else {
            C19383o.m32805o("loadingView");
            throw null;
        }
    }

    public final void showLoadingView() {
        View view = this.loadingView;
        if (view != null) {
            ViewExtensions.m12869m(view);
            View view2 = this.errorView;
            if (view2 != null) {
                ViewExtensions.m12860d(view2);
                ViewGroup viewGroup = this.serverDrivenSettingsSection;
                if (viewGroup != null) {
                    ViewExtensions.m12860d(viewGroup);
                    ViewGroup viewGroup2 = this.enableNotificationsView;
                    if (viewGroup2 != null) {
                        ViewExtensions.m12860d(viewGroup2);
                    } else {
                        C19383o.m32805o("enableNotificationsView");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("serverDrivenSettingsSection");
                    throw null;
                }
            } else {
                C19383o.m32805o("errorView");
                throw null;
            }
        } else {
            C19383o.m32805o("loadingView");
            throw null;
        }
    }

    public final void showNotificationSubscriptionPanel() {
        View view = this.loadingView;
        if (view != null) {
            ViewExtensions.m12860d(view);
            View view2 = this.errorView;
            if (view2 != null) {
                ViewExtensions.m12860d(view2);
                ViewGroup viewGroup = this.serverDrivenSettingsSection;
                if (viewGroup != null) {
                    ViewExtensions.m12869m(viewGroup);
                    TextView textView = this.serverDrivenSettingsSectionHeader;
                    if (textView != null) {
                        ViewExtensions.m12869m(textView);
                    } else {
                        C19383o.m32805o("serverDrivenSettingsSectionHeader");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("serverDrivenSettingsSection");
                    throw null;
                }
            } else {
                C19383o.m32805o("errorView");
                throw null;
            }
        } else {
            C19383o.m32805o("loadingView");
            throw null;
        }
    }
}
