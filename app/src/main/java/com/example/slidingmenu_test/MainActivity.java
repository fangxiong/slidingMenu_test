package com.example.slidingmenu_test;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;

public class MainActivity extends Activity {

SlidingMenu slidingMenu;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
slidingMenu = new SlidingMenu(this);
slidingMenu.setMode(SlidingMenu.LEFT);
slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);//设置滑动的屏幕范围，该设置为全屏区域都可以滑动
slidingMenu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
slidingMenu.setMenu(R.layout.slidingmenu);
    // 设置渐入渐出效果的值
slidingMenu.setFadeDegree(0.35f);
slidingMenu.setBehindScrollScale(1.0f);

slidingMenu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
 }

@Override
 public boolean onKeyDown(int key, KeyEvent event){
 switch (key) {
case KeyEvent.KEYCODE_MENU:
   slidingMenu.toggle(true);
  break;

default:
 break;
}
return false;
 }
}

