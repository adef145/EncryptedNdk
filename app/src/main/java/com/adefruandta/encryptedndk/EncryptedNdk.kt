package com.adefruandta.encryptedndk

import android.util.Base64
import javax.crypto.Cipher
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec

object EncryptedNdk {
    init {
        System.loadLibrary("encryptedndk");
    }

    external fun apiTokenNative(): String

    fun apiToken(): String = decrypt(apiTokenNative())

    private const val algorithm = "AES/CBC/PKCS5Padding"
    private val cipher = Cipher.getInstance(algorithm)
    private val iv = ByteArray(16)
    private val ivSpec = IvParameterSpec(iv)
    private val keySpec = SecretKeySpec("1234567890123456".toByteArray(), "AES")
    private fun decrypt(
        text: String
    ): String {
        cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec)
        val plainText = cipher.doFinal(Base64.decode(text, Base64.DEFAULT))
        return String(plainText)
    }
}