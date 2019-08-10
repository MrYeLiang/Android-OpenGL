cmake_minimum_required(VERSION 3.4.1)

include_directories(include)

include_directories(
            ${ANDROID_NDK}/sources/android/native_app_glue)

add_library( Hello_Triangle

             SHARED

             src/main/cpp/esUtil_Android.c
             src/main/cpp/Hello_Triangle.c
             src/main/cpp/esShader.c
             src/main/cpp/esShapes.c
             src/main/cpp/esTransform.c
             src/main/cpp/esUtil.c)

add_library(app-glue
            STATIC
            ${ANDROID_NDK}/sources/android/native_app_glue/android_native_app_glue.c )

find_library( log-lib
              log )

target_link_libraries( Hello_Triangle
                       GLESv3
                       EGL
                       app-glue
                       android
                       ${log-lib} )