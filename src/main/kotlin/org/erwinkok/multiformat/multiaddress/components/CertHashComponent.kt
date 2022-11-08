package org.erwinkok.multiformat.multiaddress.components

import org.erwinkok.multiformat.multiaddress.Protocol
import org.erwinkok.multiformat.multibase.Multibase
import org.erwinkok.multiformat.multihash.Multihash
import org.erwinkok.result.Err
import org.erwinkok.result.Ok
import org.erwinkok.result.Result
import org.erwinkok.result.flatMap
import org.erwinkok.result.onFailure

class CertHashComponent private constructor(addressBytes: ByteArray) : Component(Protocol.CERTHASH, addressBytes) {
    override val value: String
        get() = Multibase.BASE64_URL.encode(addressBytes)

    companion object {
        fun fromBytes(bytes: ByteArray): Result<CertHashComponent> {
            Multihash.fromBytes(bytes)
                .onFailure { return Err(it) }
            return Ok(CertHashComponent(bytes))
        }

        fun fromString(string: String): Result<CertHashComponent> {
            return Multibase.decode(string)
                .flatMap { fromBytes(it) }
        }
    }
}
