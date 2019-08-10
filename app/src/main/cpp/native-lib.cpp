#include <jni.h>

#include <android/log.h>

#define LOGI(...) __android_log_print(ANDROID_LOG_INFO,"--opengl--", __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR,"--opengl--", __VA_ARGS__)


extern "C"
JNIEXPORT void JNICALL
Java_com_yeliang_PlayView_execute(JNIEnv *env, jobject instance, jobject surfaceView) {
    LOGI("enter execute!");
}