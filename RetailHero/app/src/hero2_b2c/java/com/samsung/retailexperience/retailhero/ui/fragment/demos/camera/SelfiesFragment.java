package com.samsung.retailexperience.retailhero.ui.fragment.demos.camera;

import android.hardware.Camera;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.samsung.retailexperience.retailhero.R;
import com.samsung.retailexperience.retailhero.annotation.OnChapter;
import com.samsung.retailexperience.retailhero.gson.models.FragmentModel;
import com.samsung.retailexperience.retailhero.gson.models.VideoModel;
import com.samsung.retailexperience.retailhero.ui.activity.MainActivity;
import com.samsung.retailexperience.retailhero.ui.fragment.BaseCameraFragment;
import com.samsung.retailexperience.retailhero.ui.fragment.BaseVideoFragment;
import com.samsung.retailexperience.retailhero.ui.fragment.camera_app.BottomMenuBarFragment;
import com.samsung.retailexperience.retailhero.ui.fragment.camera_app.TopMenuBarFragment;
import com.samsung.retailexperience.retailhero.util.AppConst;
import com.samsung.retailexperience.retailhero.util.AppConsts;
import com.samsung.retailexperience.retailhero.view.CameraSurfaceView;

/**
 * Created by smheo on 1/15/2016.
 */
public class SelfiesFragment extends BaseCameraFragment {

    private static final String TAG = SelfiesFragment.class.getSimpleName();

    public static SelfiesFragment newInstance(FragmentModel<VideoModel> fragmentModel) {
        SelfiesFragment fragment = new SelfiesFragment();

        Bundle args = new Bundle();
        args.putSerializable(AppConsts.ARG_FRAGMENT_MODEL, fragmentModel);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(View view) {

    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onBackPressed() {
        changeFragment(AppConst.UIState.valueOf(getFragmentModel().getActionBackKey()),
                AppConsts.TransactionDir.TRANSACTION_DIR_BACKWARD);
    }

    /**
     * Chapter callback methods
     */
    @OnChapter(chapterIndex = 0)
    public void onChaper_0() {
        Log.i(TAG, "onChaper_0");

    }

    @OnChapter(chapterIndex = 1)
    public void onChaper_1() {
        Log.i(TAG, "onChaper_1");

    }
}