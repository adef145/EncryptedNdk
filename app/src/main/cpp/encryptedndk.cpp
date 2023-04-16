// Write C++ code here.
//
// Do not forget to dynamically load the C++ library into your application.
//
// For instance,
//
// In MainActivity.java:
//    static {
//       System.loadLibrary("encryptedndk");
//    }
//
// Or, in MainActivity.kt:
//    companion object {
//      init {
//         System.loadLibrary("encryptedndk")
//      }
//    }

#include <jni.h>

extern "C" JNIEXPORT jstring JNICALL
// remember
Java_com_adefruandta_encryptedndk_EncryptedNdk_apiTokenNative(JNIEnv *env, jobject object) {
    return env->NewStringUTF(API_TOKEN);
}



