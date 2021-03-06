package com.imstuding.www.handwyu.ToolUtil;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.imstuding.www.handwyu.R;

/**
 * Created by yangkui on 2018/10/7.
 */

public class MainTitle  extends FrameLayout {
    private final TextView titleText;

    public MainTitle(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.main_title, this);
        titleText = findViewById(R.id.main_title_text);
    }
    /**
     * 设置标题
     * @param text
     */
    public void setTitleText(String text) {
        titleText.setText(text);
    }

}
