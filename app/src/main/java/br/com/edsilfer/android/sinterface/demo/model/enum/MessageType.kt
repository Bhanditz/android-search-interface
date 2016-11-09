package br.com.edsilfer.android.sinterface.demo.model.enum

/**
 * Created by efernandes on 10/24/16.
 */

enum class MessageType(value: String) {

    MESSAGE("message"), NOTIFICATION("notification"), UNKOWN("unknown");

    private var mValue: String = value

    override fun toString(): String {
        return mValue
    }

    fun fromString(value: String): MessageType {
        for (v in values()) {
            if (v.equals(value)) {
                return v
            }
        }
        return UNKOWN
    }
}
