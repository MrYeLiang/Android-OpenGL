package com.yeliang;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.SurfaceHolder;

/**
 * Author: yeliang
 * Date: 2019/8/10
 * Time: 3:07 PM
 * Description:
 */

public class PlayView extends GLSurfaceView implements Runnable, SurfaceHolder.Callback {

    public PlayView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    //用于在子线程中执行渲染
    @Override
    public void run() {
        execute(getHolder().getSurface());
    }

    public native void execute(Surface surface);

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        new Thread(this).start();
    }


    /*以下两个空方法必须实现 否则会报空指针异常*/
    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int w, int h) {
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
    }
}
