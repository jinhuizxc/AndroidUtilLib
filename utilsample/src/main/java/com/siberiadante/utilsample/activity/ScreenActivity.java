//package com.siberiadante.utilsample.util;
//
//import android.os.Bundle;
//import android.support.v4.content.ContextCompat;
//import android.util.Log;
//import android.view.View;
//import android.widget.TextView;
//
//import com.sample.R;
//import com.sample.ui.activity.BaseActivity;
//import com.siberiadante.util.utils.SDScreenUtil;
//import com.siberiadante.util.utils.SDStatusBarUtil;
//
//public class ScreenActivity extends BaseActivity {
//
//    private static final String TAG = ScreenActivity.class.getSimpleName();
//    private TextView mTvScreen;
//
//    @Override
//    public void beforeSetContentView() {
//        super.beforeSetContentView();
//        SDStatusBarUtil.setStatusTranslucent(this);
//    }
//
//    @Override
//    public int setLayoutId() {
//        return R.layout.activity_screen_test;
//    }
//
//    @Override
//    public void initView(Bundle savedInstanceState) {
//        mTvScreen = (TextView) findViewById(R.id.tv_screen_content);
//
//        findViewById(R.id.btn_screen_set_bar_color).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                SDStatusBarUtil.setStatusBarColor(ScreenActivity.this, ContextCompat.getColor(ScreenActivity.this, R.color.blue));
//            }
//        });
//        findViewById(R.id.btn_screen_set_bar_text).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                SDStatusBarUtil.setStatusBarLightMode(ScreenActivity.this);
//            }
//        });
//    }
//
//
//    @Override
//    public void initData() {
//        int screenWidth = SDScreenUtil.getScreenWidthPx();
//        int screenHeight = SDScreenUtil.getScreenHeightPx();
//        int screenWidthDp = SDScreenUtil.getScreenWidthDp();
//        int screenHeightDp = SDScreenUtil.getScreenHeightDp();
//        float density = SDScreenUtil.getDensity(this);
//        Log.d(TAG, "initData: density=" + density);
//        Log.d(TAG, "initData:screenWidthPX= " + screenWidth + "px");
//        Log.d(TAG, "initData:screenHeightPX= " + screenHeight + "px");
//        Log.d(TAG, "initData:screenWidthDp= " + screenWidthDp + "dp");
//        Log.d(TAG, "initData:screenHeightDp= " + screenHeightDp + "dp");
//        final StringBuilder builder = new StringBuilder();
//        builder.append("屏幕宽高：\n");
//        builder.append("screenWidthPX=");
//        builder.append(screenWidth);
//        builder.append("\n");
//        builder.append("screenHeightPX=");
//        builder.append(screenHeight);
//        builder.append("\n");
//
//        builder.append("screenWidthDp=");
//        builder.append(screenWidthDp);
//        builder.append("\n");
//
//        builder.append("screenHeightDp=");
//        builder.append(screenHeightDp);
//        mTvScreen.setText(builder.toString());
//    }
//}