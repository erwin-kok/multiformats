// Copyright (c) 2022 Erwin Kok. BSD-3-Clause license. See LICENSE file for more details.
//
// GENERATED FILE -- DO NOT EDIT!!
//
package org.erwinkok.multiformat.multicodec

import org.erwinkok.result.Err
import org.erwinkok.result.Ok
import org.erwinkok.result.Result
import java.util.TreeMap

enum class Multicodec(val typeName: String, val code: Int, val tag: MulticodecTag) {
    IDENTITY("identity", 0x00, MulticodecTag.Multihash),
    CIDV1("cidv1", 0x01, MulticodecTag.Cid),
    CIDV2("cidv2", 0x02, MulticodecTag.Cid),
    CIDV3("cidv3", 0x03, MulticodecTag.Cid),
    IP4("ip4", 0x04, MulticodecTag.Multiaddr),
    TCP("tcp", 0x06, MulticodecTag.Multiaddr),
    SHA1("sha1", 0x11, MulticodecTag.Multihash),
    SHA2_256("sha2-256", 0x12, MulticodecTag.Multihash),
    SHA2_512("sha2-512", 0x13, MulticodecTag.Multihash),
    SHA3_512("sha3-512", 0x14, MulticodecTag.Multihash),
    SHA3_384("sha3-384", 0x15, MulticodecTag.Multihash),
    SHA3_256("sha3-256", 0x16, MulticodecTag.Multihash),
    SHA3_224("sha3-224", 0x17, MulticodecTag.Multihash),
    SHAKE_128("shake-128", 0x18, MulticodecTag.Multihash),
    SHAKE_256("shake-256", 0x19, MulticodecTag.Multihash),
    KECCAK_224("keccak-224", 0x1a, MulticodecTag.Multihash),
    KECCAK_256("keccak-256", 0x1b, MulticodecTag.Multihash),
    KECCAK_384("keccak-384", 0x1c, MulticodecTag.Multihash),
    KECCAK_512("keccak-512", 0x1d, MulticodecTag.Multihash),
    BLAKE3("blake3", 0x1e, MulticodecTag.Multihash),
    SHA2_384("sha2-384", 0x20, MulticodecTag.Multihash),
    DCCP("dccp", 0x21, MulticodecTag.Multiaddr),
    MURMUR3_X64_64("murmur3-x64-64", 0x22, MulticodecTag.Hash),
    MURMUR3_32("murmur3-32", 0x23, MulticodecTag.Hash),
    IP6("ip6", 0x29, MulticodecTag.Multiaddr),
    IP6ZONE("ip6zone", 0x2a, MulticodecTag.Multiaddr),
    IPCIDR("ipcidr", 0x2b, MulticodecTag.Multiaddr),
    PATH("path", 0x2f, MulticodecTag.Namespace),
    MULTICODEC("multicodec", 0x30, MulticodecTag.Multiformat),
    MULTIHASH("multihash", 0x31, MulticodecTag.Multiformat),
    MULTIADDR("multiaddr", 0x32, MulticodecTag.Multiformat),
    MULTIBASE("multibase", 0x33, MulticodecTag.Multiformat),
    VARSIG("varsig", 0x34, MulticodecTag.Multiformat),
    DNS("dns", 0x35, MulticodecTag.Multiaddr),
    DNS4("dns4", 0x36, MulticodecTag.Multiaddr),
    DNS6("dns6", 0x37, MulticodecTag.Multiaddr),
    DNSADDR("dnsaddr", 0x38, MulticodecTag.Multiaddr),
    PROTOBUF("protobuf", 0x50, MulticodecTag.Serialization),
    CBOR("cbor", 0x51, MulticodecTag.Ipld),
    RAW("raw", 0x55, MulticodecTag.Ipld),
    DBL_SHA2_256("dbl-sha2-256", 0x56, MulticodecTag.Multihash),
    RLP("rlp", 0x60, MulticodecTag.Serialization),
    BENCODE("bencode", 0x63, MulticodecTag.Serialization),
    DAG_PB("dag-pb", 0x70, MulticodecTag.Ipld),
    DAG_CBOR("dag-cbor", 0x71, MulticodecTag.Ipld),
    LIBP2P_KEY("libp2p-key", 0x72, MulticodecTag.Ipld),
    GIT_RAW("git-raw", 0x78, MulticodecTag.Ipld),
    TORRENT_INFO("torrent-info", 0x7b, MulticodecTag.Ipld),
    TORRENT_FILE("torrent-file", 0x7c, MulticodecTag.Ipld),
    LEOFCOIN_BLOCK("leofcoin-block", 0x81, MulticodecTag.Ipld),
    LEOFCOIN_TX("leofcoin-tx", 0x82, MulticodecTag.Ipld),
    LEOFCOIN_PR("leofcoin-pr", 0x83, MulticodecTag.Ipld),
    SCTP("sctp", 0x84, MulticodecTag.Multiaddr),
    DAG_JOSE("dag-jose", 0x85, MulticodecTag.Ipld),
    DAG_COSE("dag-cose", 0x86, MulticodecTag.Ipld),
    ETH_BLOCK("eth-block", 0x90, MulticodecTag.Ipld),
    ETH_BLOCK_LIST("eth-block-list", 0x91, MulticodecTag.Ipld),
    ETH_TX_TRIE("eth-tx-trie", 0x92, MulticodecTag.Ipld),
    ETH_TX("eth-tx", 0x93, MulticodecTag.Ipld),
    ETH_TX_RECEIPT_TRIE("eth-tx-receipt-trie", 0x94, MulticodecTag.Ipld),
    ETH_TX_RECEIPT("eth-tx-receipt", 0x95, MulticodecTag.Ipld),
    ETH_STATE_TRIE("eth-state-trie", 0x96, MulticodecTag.Ipld),
    ETH_ACCOUNT_SNAPSHOT("eth-account-snapshot", 0x97, MulticodecTag.Ipld),
    ETH_STORAGE_TRIE("eth-storage-trie", 0x98, MulticodecTag.Ipld),
    ETH_RECEIPT_LOG_TRIE("eth-receipt-log-trie", 0x99, MulticodecTag.Ipld),
    ETH_RECIEPT_LOG("eth-reciept-log", 0x9a, MulticodecTag.Ipld),
    AES_128("aes-128", 0xa0, MulticodecTag.Key),
    AES_192("aes-192", 0xa1, MulticodecTag.Key),
    AES_256("aes-256", 0xa2, MulticodecTag.Key),
    CHACHA_128("chacha-128", 0xa3, MulticodecTag.Key),
    CHACHA_256("chacha-256", 0xa4, MulticodecTag.Key),
    BITCOIN_BLOCK("bitcoin-block", 0xb0, MulticodecTag.Ipld),
    BITCOIN_TX("bitcoin-tx", 0xb1, MulticodecTag.Ipld),
    BITCOIN_WITNESS_COMMITMENT("bitcoin-witness-commitment", 0xb2, MulticodecTag.Ipld),
    ZCASH_BLOCK("zcash-block", 0xc0, MulticodecTag.Ipld),
    ZCASH_TX("zcash-tx", 0xc1, MulticodecTag.Ipld),
    CAIP_50("caip-50", 0xca, MulticodecTag.Multiformat),
    STREAMID("streamid", 0xce, MulticodecTag.Namespace),
    STELLAR_BLOCK("stellar-block", 0xd0, MulticodecTag.Ipld),
    STELLAR_TX("stellar-tx", 0xd1, MulticodecTag.Ipld),
    MD4("md4", 0xd4, MulticodecTag.Multihash),
    MD5("md5", 0xd5, MulticodecTag.Multihash),
    DECRED_BLOCK("decred-block", 0xe0, MulticodecTag.Ipld),
    DECRED_TX("decred-tx", 0xe1, MulticodecTag.Ipld),
    IPLD("ipld", 0xe2, MulticodecTag.Namespace),
    IPFS("ipfs", 0xe3, MulticodecTag.Namespace),
    SWARM("swarm", 0xe4, MulticodecTag.Namespace),
    IPNS("ipns", 0xe5, MulticodecTag.Namespace),
    ZERONET("zeronet", 0xe6, MulticodecTag.Namespace),
    SECP256K1_PUB("secp256k1-pub", 0xe7, MulticodecTag.Key),
    DNSLINK("dnslink", 0xe8, MulticodecTag.Namespace),
    BLS12_381_G1_PUB("bls12_381-g1-pub", 0xea, MulticodecTag.Key),
    BLS12_381_G2_PUB("bls12_381-g2-pub", 0xeb, MulticodecTag.Key),
    X25519_PUB("x25519-pub", 0xec, MulticodecTag.Key),
    ED25519_PUB("ed25519-pub", 0xed, MulticodecTag.Key),
    BLS12_381_G1G2_PUB("bls12_381-g1g2-pub", 0xee, MulticodecTag.Key),
    SR25519_PUB("sr25519-pub", 0xef, MulticodecTag.Key),
    DASH_BLOCK("dash-block", 0xf0, MulticodecTag.Ipld),
    DASH_TX("dash-tx", 0xf1, MulticodecTag.Ipld),
    SWARM_MANIFEST("swarm-manifest", 0xfa, MulticodecTag.Ipld),
    SWARM_FEED("swarm-feed", 0xfb, MulticodecTag.Ipld),
    BEESON("beeson", 0xfc, MulticodecTag.Ipld),
    UDP("udp", 0x111, MulticodecTag.Multiaddr),
    P2P_WEBRTC_STAR("p2p-webrtc-star", 0x113, MulticodecTag.Multiaddr),
    P2P_WEBRTC_DIRECT("p2p-webrtc-direct", 0x114, MulticodecTag.Multiaddr),
    P2P_STARDUST("p2p-stardust", 0x115, MulticodecTag.Multiaddr),
    WEBRTC_DIRECT("webrtc-direct", 0x118, MulticodecTag.Multiaddr),
    WEBRTC("webrtc", 0x119, MulticodecTag.Multiaddr),
    P2P_CIRCUIT("p2p-circuit", 0x122, MulticodecTag.Multiaddr),
    DAG_JSON("dag-json", 0x129, MulticodecTag.Ipld),
    UDT("udt", 0x12d, MulticodecTag.Multiaddr),
    UTP("utp", 0x12e, MulticodecTag.Multiaddr),
    CRC32("crc32", 0x132, MulticodecTag.Hash),
    CRC64_ECMA("crc64-ecma", 0x164, MulticodecTag.Hash),
    UNIX("unix", 0x190, MulticodecTag.Multiaddr),
    THREAD("thread", 0x196, MulticodecTag.Multiaddr),
    P2P("p2p", 0x1a5, MulticodecTag.Multiaddr),
    HTTPS("https", 0x1bb, MulticodecTag.Multiaddr),
    ONION("onion", 0x1bc, MulticodecTag.Multiaddr),
    ONION3("onion3", 0x1bd, MulticodecTag.Multiaddr),
    GARLIC64("garlic64", 0x1be, MulticodecTag.Multiaddr),
    GARLIC32("garlic32", 0x1bf, MulticodecTag.Multiaddr),
    TLS("tls", 0x1c0, MulticodecTag.Multiaddr),
    SNI("sni", 0x1c1, MulticodecTag.Multiaddr),
    NOISE("noise", 0x1c6, MulticodecTag.Multiaddr),
    QUIC("quic", 0x1cc, MulticodecTag.Multiaddr),
    QUIC_V1("quic-v1", 0x1cd, MulticodecTag.Multiaddr),
    WEBTRANSPORT("webtransport", 0x1d1, MulticodecTag.Multiaddr),
    CERTHASH("certhash", 0x1d2, MulticodecTag.Multiaddr),
    WS("ws", 0x1dd, MulticodecTag.Multiaddr),
    WSS("wss", 0x1de, MulticodecTag.Multiaddr),
    P2P_WEBSOCKET_STAR("p2p-websocket-star", 0x1df, MulticodecTag.Multiaddr),
    HTTP("http", 0x1e0, MulticodecTag.Multiaddr),
    SWHID_1_SNP("swhid-1-snp", 0x1f0, MulticodecTag.Ipld),
    JSON("json", 0x200, MulticodecTag.Ipld),
    MESSAGEPACK("messagepack", 0x201, MulticodecTag.Serialization),
    CAR("car", 0x202, MulticodecTag.Serialization),
    IPNS_RECORD("ipns-record", 0x300, MulticodecTag.Serialization),
    LIBP2P_PEER_RECORD("libp2p-peer-record", 0x301, MulticodecTag.Libp2p),
    LIBP2P_RELAY_RSVP("libp2p-relay-rsvp", 0x302, MulticodecTag.Libp2p),
    MEMORYTRANSPORT("memorytransport", 0x309, MulticodecTag.Libp2p),
    CAR_INDEX_SORTED("car-index-sorted", 0x400, MulticodecTag.Serialization),
    CAR_MULTIHASH_INDEX_SORTED("car-multihash-index-sorted", 0x401, MulticodecTag.Serialization),
    TRANSPORT_BITSWAP("transport-bitswap", 0x900, MulticodecTag.Transport),
    TRANSPORT_GRAPHSYNC_FILECOINV1("transport-graphsync-filecoinv1", 0x910, MulticodecTag.Transport),
    TRANSPORT_IPFS_GATEWAY_HTTP("transport-ipfs-gateway-http", 0x920, MulticodecTag.Transport),
    MULTIDID("multidid", 0xd1d, MulticodecTag.Multiformat),
    SHA2_256_TRUNC254_PADDED("sha2-256-trunc254-padded", 0x1012, MulticodecTag.Multihash),
    SHA2_224("sha2-224", 0x1013, MulticodecTag.Multihash),
    SHA2_512_224("sha2-512-224", 0x1014, MulticodecTag.Multihash),
    SHA2_512_256("sha2-512-256", 0x1015, MulticodecTag.Multihash),
    MURMUR3_X64_128("murmur3-x64-128", 0x1022, MulticodecTag.Hash),
    RIPEMD_128("ripemd-128", 0x1052, MulticodecTag.Multihash),
    RIPEMD_160("ripemd-160", 0x1053, MulticodecTag.Multihash),
    RIPEMD_256("ripemd-256", 0x1054, MulticodecTag.Multihash),
    RIPEMD_320("ripemd-320", 0x1055, MulticodecTag.Multihash),
    X11("x11", 0x1100, MulticodecTag.Multihash),
    P256_PUB("p256-pub", 0x1200, MulticodecTag.Key),
    P384_PUB("p384-pub", 0x1201, MulticodecTag.Key),
    P521_PUB("p521-pub", 0x1202, MulticodecTag.Key),
    ED448_PUB("ed448-pub", 0x1203, MulticodecTag.Key),
    X448_PUB("x448-pub", 0x1204, MulticodecTag.Key),
    RSA_PUB("rsa-pub", 0x1205, MulticodecTag.Key),
    SM2_PUB("sm2-pub", 0x1206, MulticodecTag.Key),
    ED25519_PRIV("ed25519-priv", 0x1300, MulticodecTag.Key),
    SECP256K1_PRIV("secp256k1-priv", 0x1301, MulticodecTag.Key),
    X25519_PRIV("x25519-priv", 0x1302, MulticodecTag.Key),
    SR25519_PRIV("sr25519-priv", 0x1303, MulticodecTag.Key),
    RSA_PRIV("rsa-priv", 0x1305, MulticodecTag.Key),
    P256_PRIV("p256-priv", 0x1306, MulticodecTag.Key),
    P384_PRIV("p384-priv", 0x1307, MulticodecTag.Key),
    P521_PRIV("p521-priv", 0x1308, MulticodecTag.Key),
    KANGAROOTWELVE("kangarootwelve", 0x1d01, MulticodecTag.Multihash),
    AES_GCM_256("aes-gcm-256", 0x2000, MulticodecTag.Encryption),
    SILVERPINE("silverpine", 0x3f42, MulticodecTag.Multiaddr),
    SM3_256("sm3-256", 0x534d, MulticodecTag.Multihash),
    BLAKE2B_8("blake2b-8", 0xb201, MulticodecTag.Multihash),
    BLAKE2B_16("blake2b-16", 0xb202, MulticodecTag.Multihash),
    BLAKE2B_24("blake2b-24", 0xb203, MulticodecTag.Multihash),
    BLAKE2B_32("blake2b-32", 0xb204, MulticodecTag.Multihash),
    BLAKE2B_40("blake2b-40", 0xb205, MulticodecTag.Multihash),
    BLAKE2B_48("blake2b-48", 0xb206, MulticodecTag.Multihash),
    BLAKE2B_56("blake2b-56", 0xb207, MulticodecTag.Multihash),
    BLAKE2B_64("blake2b-64", 0xb208, MulticodecTag.Multihash),
    BLAKE2B_72("blake2b-72", 0xb209, MulticodecTag.Multihash),
    BLAKE2B_80("blake2b-80", 0xb20a, MulticodecTag.Multihash),
    BLAKE2B_88("blake2b-88", 0xb20b, MulticodecTag.Multihash),
    BLAKE2B_96("blake2b-96", 0xb20c, MulticodecTag.Multihash),
    BLAKE2B_104("blake2b-104", 0xb20d, MulticodecTag.Multihash),
    BLAKE2B_112("blake2b-112", 0xb20e, MulticodecTag.Multihash),
    BLAKE2B_120("blake2b-120", 0xb20f, MulticodecTag.Multihash),
    BLAKE2B_128("blake2b-128", 0xb210, MulticodecTag.Multihash),
    BLAKE2B_136("blake2b-136", 0xb211, MulticodecTag.Multihash),
    BLAKE2B_144("blake2b-144", 0xb212, MulticodecTag.Multihash),
    BLAKE2B_152("blake2b-152", 0xb213, MulticodecTag.Multihash),
    BLAKE2B_160("blake2b-160", 0xb214, MulticodecTag.Multihash),
    BLAKE2B_168("blake2b-168", 0xb215, MulticodecTag.Multihash),
    BLAKE2B_176("blake2b-176", 0xb216, MulticodecTag.Multihash),
    BLAKE2B_184("blake2b-184", 0xb217, MulticodecTag.Multihash),
    BLAKE2B_192("blake2b-192", 0xb218, MulticodecTag.Multihash),
    BLAKE2B_200("blake2b-200", 0xb219, MulticodecTag.Multihash),
    BLAKE2B_208("blake2b-208", 0xb21a, MulticodecTag.Multihash),
    BLAKE2B_216("blake2b-216", 0xb21b, MulticodecTag.Multihash),
    BLAKE2B_224("blake2b-224", 0xb21c, MulticodecTag.Multihash),
    BLAKE2B_232("blake2b-232", 0xb21d, MulticodecTag.Multihash),
    BLAKE2B_240("blake2b-240", 0xb21e, MulticodecTag.Multihash),
    BLAKE2B_248("blake2b-248", 0xb21f, MulticodecTag.Multihash),
    BLAKE2B_256("blake2b-256", 0xb220, MulticodecTag.Multihash),
    BLAKE2B_264("blake2b-264", 0xb221, MulticodecTag.Multihash),
    BLAKE2B_272("blake2b-272", 0xb222, MulticodecTag.Multihash),
    BLAKE2B_280("blake2b-280", 0xb223, MulticodecTag.Multihash),
    BLAKE2B_288("blake2b-288", 0xb224, MulticodecTag.Multihash),
    BLAKE2B_296("blake2b-296", 0xb225, MulticodecTag.Multihash),
    BLAKE2B_304("blake2b-304", 0xb226, MulticodecTag.Multihash),
    BLAKE2B_312("blake2b-312", 0xb227, MulticodecTag.Multihash),
    BLAKE2B_320("blake2b-320", 0xb228, MulticodecTag.Multihash),
    BLAKE2B_328("blake2b-328", 0xb229, MulticodecTag.Multihash),
    BLAKE2B_336("blake2b-336", 0xb22a, MulticodecTag.Multihash),
    BLAKE2B_344("blake2b-344", 0xb22b, MulticodecTag.Multihash),
    BLAKE2B_352("blake2b-352", 0xb22c, MulticodecTag.Multihash),
    BLAKE2B_360("blake2b-360", 0xb22d, MulticodecTag.Multihash),
    BLAKE2B_368("blake2b-368", 0xb22e, MulticodecTag.Multihash),
    BLAKE2B_376("blake2b-376", 0xb22f, MulticodecTag.Multihash),
    BLAKE2B_384("blake2b-384", 0xb230, MulticodecTag.Multihash),
    BLAKE2B_392("blake2b-392", 0xb231, MulticodecTag.Multihash),
    BLAKE2B_400("blake2b-400", 0xb232, MulticodecTag.Multihash),
    BLAKE2B_408("blake2b-408", 0xb233, MulticodecTag.Multihash),
    BLAKE2B_416("blake2b-416", 0xb234, MulticodecTag.Multihash),
    BLAKE2B_424("blake2b-424", 0xb235, MulticodecTag.Multihash),
    BLAKE2B_432("blake2b-432", 0xb236, MulticodecTag.Multihash),
    BLAKE2B_440("blake2b-440", 0xb237, MulticodecTag.Multihash),
    BLAKE2B_448("blake2b-448", 0xb238, MulticodecTag.Multihash),
    BLAKE2B_456("blake2b-456", 0xb239, MulticodecTag.Multihash),
    BLAKE2B_464("blake2b-464", 0xb23a, MulticodecTag.Multihash),
    BLAKE2B_472("blake2b-472", 0xb23b, MulticodecTag.Multihash),
    BLAKE2B_480("blake2b-480", 0xb23c, MulticodecTag.Multihash),
    BLAKE2B_488("blake2b-488", 0xb23d, MulticodecTag.Multihash),
    BLAKE2B_496("blake2b-496", 0xb23e, MulticodecTag.Multihash),
    BLAKE2B_504("blake2b-504", 0xb23f, MulticodecTag.Multihash),
    BLAKE2B_512("blake2b-512", 0xb240, MulticodecTag.Multihash),
    BLAKE2S_8("blake2s-8", 0xb241, MulticodecTag.Multihash),
    BLAKE2S_16("blake2s-16", 0xb242, MulticodecTag.Multihash),
    BLAKE2S_24("blake2s-24", 0xb243, MulticodecTag.Multihash),
    BLAKE2S_32("blake2s-32", 0xb244, MulticodecTag.Multihash),
    BLAKE2S_40("blake2s-40", 0xb245, MulticodecTag.Multihash),
    BLAKE2S_48("blake2s-48", 0xb246, MulticodecTag.Multihash),
    BLAKE2S_56("blake2s-56", 0xb247, MulticodecTag.Multihash),
    BLAKE2S_64("blake2s-64", 0xb248, MulticodecTag.Multihash),
    BLAKE2S_72("blake2s-72", 0xb249, MulticodecTag.Multihash),
    BLAKE2S_80("blake2s-80", 0xb24a, MulticodecTag.Multihash),
    BLAKE2S_88("blake2s-88", 0xb24b, MulticodecTag.Multihash),
    BLAKE2S_96("blake2s-96", 0xb24c, MulticodecTag.Multihash),
    BLAKE2S_104("blake2s-104", 0xb24d, MulticodecTag.Multihash),
    BLAKE2S_112("blake2s-112", 0xb24e, MulticodecTag.Multihash),
    BLAKE2S_120("blake2s-120", 0xb24f, MulticodecTag.Multihash),
    BLAKE2S_128("blake2s-128", 0xb250, MulticodecTag.Multihash),
    BLAKE2S_136("blake2s-136", 0xb251, MulticodecTag.Multihash),
    BLAKE2S_144("blake2s-144", 0xb252, MulticodecTag.Multihash),
    BLAKE2S_152("blake2s-152", 0xb253, MulticodecTag.Multihash),
    BLAKE2S_160("blake2s-160", 0xb254, MulticodecTag.Multihash),
    BLAKE2S_168("blake2s-168", 0xb255, MulticodecTag.Multihash),
    BLAKE2S_176("blake2s-176", 0xb256, MulticodecTag.Multihash),
    BLAKE2S_184("blake2s-184", 0xb257, MulticodecTag.Multihash),
    BLAKE2S_192("blake2s-192", 0xb258, MulticodecTag.Multihash),
    BLAKE2S_200("blake2s-200", 0xb259, MulticodecTag.Multihash),
    BLAKE2S_208("blake2s-208", 0xb25a, MulticodecTag.Multihash),
    BLAKE2S_216("blake2s-216", 0xb25b, MulticodecTag.Multihash),
    BLAKE2S_224("blake2s-224", 0xb25c, MulticodecTag.Multihash),
    BLAKE2S_232("blake2s-232", 0xb25d, MulticodecTag.Multihash),
    BLAKE2S_240("blake2s-240", 0xb25e, MulticodecTag.Multihash),
    BLAKE2S_248("blake2s-248", 0xb25f, MulticodecTag.Multihash),
    BLAKE2S_256("blake2s-256", 0xb260, MulticodecTag.Multihash),
    SKEIN256_8("skein256-8", 0xb301, MulticodecTag.Multihash),
    SKEIN256_16("skein256-16", 0xb302, MulticodecTag.Multihash),
    SKEIN256_24("skein256-24", 0xb303, MulticodecTag.Multihash),
    SKEIN256_32("skein256-32", 0xb304, MulticodecTag.Multihash),
    SKEIN256_40("skein256-40", 0xb305, MulticodecTag.Multihash),
    SKEIN256_48("skein256-48", 0xb306, MulticodecTag.Multihash),
    SKEIN256_56("skein256-56", 0xb307, MulticodecTag.Multihash),
    SKEIN256_64("skein256-64", 0xb308, MulticodecTag.Multihash),
    SKEIN256_72("skein256-72", 0xb309, MulticodecTag.Multihash),
    SKEIN256_80("skein256-80", 0xb30a, MulticodecTag.Multihash),
    SKEIN256_88("skein256-88", 0xb30b, MulticodecTag.Multihash),
    SKEIN256_96("skein256-96", 0xb30c, MulticodecTag.Multihash),
    SKEIN256_104("skein256-104", 0xb30d, MulticodecTag.Multihash),
    SKEIN256_112("skein256-112", 0xb30e, MulticodecTag.Multihash),
    SKEIN256_120("skein256-120", 0xb30f, MulticodecTag.Multihash),
    SKEIN256_128("skein256-128", 0xb310, MulticodecTag.Multihash),
    SKEIN256_136("skein256-136", 0xb311, MulticodecTag.Multihash),
    SKEIN256_144("skein256-144", 0xb312, MulticodecTag.Multihash),
    SKEIN256_152("skein256-152", 0xb313, MulticodecTag.Multihash),
    SKEIN256_160("skein256-160", 0xb314, MulticodecTag.Multihash),
    SKEIN256_168("skein256-168", 0xb315, MulticodecTag.Multihash),
    SKEIN256_176("skein256-176", 0xb316, MulticodecTag.Multihash),
    SKEIN256_184("skein256-184", 0xb317, MulticodecTag.Multihash),
    SKEIN256_192("skein256-192", 0xb318, MulticodecTag.Multihash),
    SKEIN256_200("skein256-200", 0xb319, MulticodecTag.Multihash),
    SKEIN256_208("skein256-208", 0xb31a, MulticodecTag.Multihash),
    SKEIN256_216("skein256-216", 0xb31b, MulticodecTag.Multihash),
    SKEIN256_224("skein256-224", 0xb31c, MulticodecTag.Multihash),
    SKEIN256_232("skein256-232", 0xb31d, MulticodecTag.Multihash),
    SKEIN256_240("skein256-240", 0xb31e, MulticodecTag.Multihash),
    SKEIN256_248("skein256-248", 0xb31f, MulticodecTag.Multihash),
    SKEIN256_256("skein256-256", 0xb320, MulticodecTag.Multihash),
    SKEIN512_8("skein512-8", 0xb321, MulticodecTag.Multihash),
    SKEIN512_16("skein512-16", 0xb322, MulticodecTag.Multihash),
    SKEIN512_24("skein512-24", 0xb323, MulticodecTag.Multihash),
    SKEIN512_32("skein512-32", 0xb324, MulticodecTag.Multihash),
    SKEIN512_40("skein512-40", 0xb325, MulticodecTag.Multihash),
    SKEIN512_48("skein512-48", 0xb326, MulticodecTag.Multihash),
    SKEIN512_56("skein512-56", 0xb327, MulticodecTag.Multihash),
    SKEIN512_64("skein512-64", 0xb328, MulticodecTag.Multihash),
    SKEIN512_72("skein512-72", 0xb329, MulticodecTag.Multihash),
    SKEIN512_80("skein512-80", 0xb32a, MulticodecTag.Multihash),
    SKEIN512_88("skein512-88", 0xb32b, MulticodecTag.Multihash),
    SKEIN512_96("skein512-96", 0xb32c, MulticodecTag.Multihash),
    SKEIN512_104("skein512-104", 0xb32d, MulticodecTag.Multihash),
    SKEIN512_112("skein512-112", 0xb32e, MulticodecTag.Multihash),
    SKEIN512_120("skein512-120", 0xb32f, MulticodecTag.Multihash),
    SKEIN512_128("skein512-128", 0xb330, MulticodecTag.Multihash),
    SKEIN512_136("skein512-136", 0xb331, MulticodecTag.Multihash),
    SKEIN512_144("skein512-144", 0xb332, MulticodecTag.Multihash),
    SKEIN512_152("skein512-152", 0xb333, MulticodecTag.Multihash),
    SKEIN512_160("skein512-160", 0xb334, MulticodecTag.Multihash),
    SKEIN512_168("skein512-168", 0xb335, MulticodecTag.Multihash),
    SKEIN512_176("skein512-176", 0xb336, MulticodecTag.Multihash),
    SKEIN512_184("skein512-184", 0xb337, MulticodecTag.Multihash),
    SKEIN512_192("skein512-192", 0xb338, MulticodecTag.Multihash),
    SKEIN512_200("skein512-200", 0xb339, MulticodecTag.Multihash),
    SKEIN512_208("skein512-208", 0xb33a, MulticodecTag.Multihash),
    SKEIN512_216("skein512-216", 0xb33b, MulticodecTag.Multihash),
    SKEIN512_224("skein512-224", 0xb33c, MulticodecTag.Multihash),
    SKEIN512_232("skein512-232", 0xb33d, MulticodecTag.Multihash),
    SKEIN512_240("skein512-240", 0xb33e, MulticodecTag.Multihash),
    SKEIN512_248("skein512-248", 0xb33f, MulticodecTag.Multihash),
    SKEIN512_256("skein512-256", 0xb340, MulticodecTag.Multihash),
    SKEIN512_264("skein512-264", 0xb341, MulticodecTag.Multihash),
    SKEIN512_272("skein512-272", 0xb342, MulticodecTag.Multihash),
    SKEIN512_280("skein512-280", 0xb343, MulticodecTag.Multihash),
    SKEIN512_288("skein512-288", 0xb344, MulticodecTag.Multihash),
    SKEIN512_296("skein512-296", 0xb345, MulticodecTag.Multihash),
    SKEIN512_304("skein512-304", 0xb346, MulticodecTag.Multihash),
    SKEIN512_312("skein512-312", 0xb347, MulticodecTag.Multihash),
    SKEIN512_320("skein512-320", 0xb348, MulticodecTag.Multihash),
    SKEIN512_328("skein512-328", 0xb349, MulticodecTag.Multihash),
    SKEIN512_336("skein512-336", 0xb34a, MulticodecTag.Multihash),
    SKEIN512_344("skein512-344", 0xb34b, MulticodecTag.Multihash),
    SKEIN512_352("skein512-352", 0xb34c, MulticodecTag.Multihash),
    SKEIN512_360("skein512-360", 0xb34d, MulticodecTag.Multihash),
    SKEIN512_368("skein512-368", 0xb34e, MulticodecTag.Multihash),
    SKEIN512_376("skein512-376", 0xb34f, MulticodecTag.Multihash),
    SKEIN512_384("skein512-384", 0xb350, MulticodecTag.Multihash),
    SKEIN512_392("skein512-392", 0xb351, MulticodecTag.Multihash),
    SKEIN512_400("skein512-400", 0xb352, MulticodecTag.Multihash),
    SKEIN512_408("skein512-408", 0xb353, MulticodecTag.Multihash),
    SKEIN512_416("skein512-416", 0xb354, MulticodecTag.Multihash),
    SKEIN512_424("skein512-424", 0xb355, MulticodecTag.Multihash),
    SKEIN512_432("skein512-432", 0xb356, MulticodecTag.Multihash),
    SKEIN512_440("skein512-440", 0xb357, MulticodecTag.Multihash),
    SKEIN512_448("skein512-448", 0xb358, MulticodecTag.Multihash),
    SKEIN512_456("skein512-456", 0xb359, MulticodecTag.Multihash),
    SKEIN512_464("skein512-464", 0xb35a, MulticodecTag.Multihash),
    SKEIN512_472("skein512-472", 0xb35b, MulticodecTag.Multihash),
    SKEIN512_480("skein512-480", 0xb35c, MulticodecTag.Multihash),
    SKEIN512_488("skein512-488", 0xb35d, MulticodecTag.Multihash),
    SKEIN512_496("skein512-496", 0xb35e, MulticodecTag.Multihash),
    SKEIN512_504("skein512-504", 0xb35f, MulticodecTag.Multihash),
    SKEIN512_512("skein512-512", 0xb360, MulticodecTag.Multihash),
    SKEIN1024_8("skein1024-8", 0xb361, MulticodecTag.Multihash),
    SKEIN1024_16("skein1024-16", 0xb362, MulticodecTag.Multihash),
    SKEIN1024_24("skein1024-24", 0xb363, MulticodecTag.Multihash),
    SKEIN1024_32("skein1024-32", 0xb364, MulticodecTag.Multihash),
    SKEIN1024_40("skein1024-40", 0xb365, MulticodecTag.Multihash),
    SKEIN1024_48("skein1024-48", 0xb366, MulticodecTag.Multihash),
    SKEIN1024_56("skein1024-56", 0xb367, MulticodecTag.Multihash),
    SKEIN1024_64("skein1024-64", 0xb368, MulticodecTag.Multihash),
    SKEIN1024_72("skein1024-72", 0xb369, MulticodecTag.Multihash),
    SKEIN1024_80("skein1024-80", 0xb36a, MulticodecTag.Multihash),
    SKEIN1024_88("skein1024-88", 0xb36b, MulticodecTag.Multihash),
    SKEIN1024_96("skein1024-96", 0xb36c, MulticodecTag.Multihash),
    SKEIN1024_104("skein1024-104", 0xb36d, MulticodecTag.Multihash),
    SKEIN1024_112("skein1024-112", 0xb36e, MulticodecTag.Multihash),
    SKEIN1024_120("skein1024-120", 0xb36f, MulticodecTag.Multihash),
    SKEIN1024_128("skein1024-128", 0xb370, MulticodecTag.Multihash),
    SKEIN1024_136("skein1024-136", 0xb371, MulticodecTag.Multihash),
    SKEIN1024_144("skein1024-144", 0xb372, MulticodecTag.Multihash),
    SKEIN1024_152("skein1024-152", 0xb373, MulticodecTag.Multihash),
    SKEIN1024_160("skein1024-160", 0xb374, MulticodecTag.Multihash),
    SKEIN1024_168("skein1024-168", 0xb375, MulticodecTag.Multihash),
    SKEIN1024_176("skein1024-176", 0xb376, MulticodecTag.Multihash),
    SKEIN1024_184("skein1024-184", 0xb377, MulticodecTag.Multihash),
    SKEIN1024_192("skein1024-192", 0xb378, MulticodecTag.Multihash),
    SKEIN1024_200("skein1024-200", 0xb379, MulticodecTag.Multihash),
    SKEIN1024_208("skein1024-208", 0xb37a, MulticodecTag.Multihash),
    SKEIN1024_216("skein1024-216", 0xb37b, MulticodecTag.Multihash),
    SKEIN1024_224("skein1024-224", 0xb37c, MulticodecTag.Multihash),
    SKEIN1024_232("skein1024-232", 0xb37d, MulticodecTag.Multihash),
    SKEIN1024_240("skein1024-240", 0xb37e, MulticodecTag.Multihash),
    SKEIN1024_248("skein1024-248", 0xb37f, MulticodecTag.Multihash),
    SKEIN1024_256("skein1024-256", 0xb380, MulticodecTag.Multihash),
    SKEIN1024_264("skein1024-264", 0xb381, MulticodecTag.Multihash),
    SKEIN1024_272("skein1024-272", 0xb382, MulticodecTag.Multihash),
    SKEIN1024_280("skein1024-280", 0xb383, MulticodecTag.Multihash),
    SKEIN1024_288("skein1024-288", 0xb384, MulticodecTag.Multihash),
    SKEIN1024_296("skein1024-296", 0xb385, MulticodecTag.Multihash),
    SKEIN1024_304("skein1024-304", 0xb386, MulticodecTag.Multihash),
    SKEIN1024_312("skein1024-312", 0xb387, MulticodecTag.Multihash),
    SKEIN1024_320("skein1024-320", 0xb388, MulticodecTag.Multihash),
    SKEIN1024_328("skein1024-328", 0xb389, MulticodecTag.Multihash),
    SKEIN1024_336("skein1024-336", 0xb38a, MulticodecTag.Multihash),
    SKEIN1024_344("skein1024-344", 0xb38b, MulticodecTag.Multihash),
    SKEIN1024_352("skein1024-352", 0xb38c, MulticodecTag.Multihash),
    SKEIN1024_360("skein1024-360", 0xb38d, MulticodecTag.Multihash),
    SKEIN1024_368("skein1024-368", 0xb38e, MulticodecTag.Multihash),
    SKEIN1024_376("skein1024-376", 0xb38f, MulticodecTag.Multihash),
    SKEIN1024_384("skein1024-384", 0xb390, MulticodecTag.Multihash),
    SKEIN1024_392("skein1024-392", 0xb391, MulticodecTag.Multihash),
    SKEIN1024_400("skein1024-400", 0xb392, MulticodecTag.Multihash),
    SKEIN1024_408("skein1024-408", 0xb393, MulticodecTag.Multihash),
    SKEIN1024_416("skein1024-416", 0xb394, MulticodecTag.Multihash),
    SKEIN1024_424("skein1024-424", 0xb395, MulticodecTag.Multihash),
    SKEIN1024_432("skein1024-432", 0xb396, MulticodecTag.Multihash),
    SKEIN1024_440("skein1024-440", 0xb397, MulticodecTag.Multihash),
    SKEIN1024_448("skein1024-448", 0xb398, MulticodecTag.Multihash),
    SKEIN1024_456("skein1024-456", 0xb399, MulticodecTag.Multihash),
    SKEIN1024_464("skein1024-464", 0xb39a, MulticodecTag.Multihash),
    SKEIN1024_472("skein1024-472", 0xb39b, MulticodecTag.Multihash),
    SKEIN1024_480("skein1024-480", 0xb39c, MulticodecTag.Multihash),
    SKEIN1024_488("skein1024-488", 0xb39d, MulticodecTag.Multihash),
    SKEIN1024_496("skein1024-496", 0xb39e, MulticodecTag.Multihash),
    SKEIN1024_504("skein1024-504", 0xb39f, MulticodecTag.Multihash),
    SKEIN1024_512("skein1024-512", 0xb3a0, MulticodecTag.Multihash),
    SKEIN1024_520("skein1024-520", 0xb3a1, MulticodecTag.Multihash),
    SKEIN1024_528("skein1024-528", 0xb3a2, MulticodecTag.Multihash),
    SKEIN1024_536("skein1024-536", 0xb3a3, MulticodecTag.Multihash),
    SKEIN1024_544("skein1024-544", 0xb3a4, MulticodecTag.Multihash),
    SKEIN1024_552("skein1024-552", 0xb3a5, MulticodecTag.Multihash),
    SKEIN1024_560("skein1024-560", 0xb3a6, MulticodecTag.Multihash),
    SKEIN1024_568("skein1024-568", 0xb3a7, MulticodecTag.Multihash),
    SKEIN1024_576("skein1024-576", 0xb3a8, MulticodecTag.Multihash),
    SKEIN1024_584("skein1024-584", 0xb3a9, MulticodecTag.Multihash),
    SKEIN1024_592("skein1024-592", 0xb3aa, MulticodecTag.Multihash),
    SKEIN1024_600("skein1024-600", 0xb3ab, MulticodecTag.Multihash),
    SKEIN1024_608("skein1024-608", 0xb3ac, MulticodecTag.Multihash),
    SKEIN1024_616("skein1024-616", 0xb3ad, MulticodecTag.Multihash),
    SKEIN1024_624("skein1024-624", 0xb3ae, MulticodecTag.Multihash),
    SKEIN1024_632("skein1024-632", 0xb3af, MulticodecTag.Multihash),
    SKEIN1024_640("skein1024-640", 0xb3b0, MulticodecTag.Multihash),
    SKEIN1024_648("skein1024-648", 0xb3b1, MulticodecTag.Multihash),
    SKEIN1024_656("skein1024-656", 0xb3b2, MulticodecTag.Multihash),
    SKEIN1024_664("skein1024-664", 0xb3b3, MulticodecTag.Multihash),
    SKEIN1024_672("skein1024-672", 0xb3b4, MulticodecTag.Multihash),
    SKEIN1024_680("skein1024-680", 0xb3b5, MulticodecTag.Multihash),
    SKEIN1024_688("skein1024-688", 0xb3b6, MulticodecTag.Multihash),
    SKEIN1024_696("skein1024-696", 0xb3b7, MulticodecTag.Multihash),
    SKEIN1024_704("skein1024-704", 0xb3b8, MulticodecTag.Multihash),
    SKEIN1024_712("skein1024-712", 0xb3b9, MulticodecTag.Multihash),
    SKEIN1024_720("skein1024-720", 0xb3ba, MulticodecTag.Multihash),
    SKEIN1024_728("skein1024-728", 0xb3bb, MulticodecTag.Multihash),
    SKEIN1024_736("skein1024-736", 0xb3bc, MulticodecTag.Multihash),
    SKEIN1024_744("skein1024-744", 0xb3bd, MulticodecTag.Multihash),
    SKEIN1024_752("skein1024-752", 0xb3be, MulticodecTag.Multihash),
    SKEIN1024_760("skein1024-760", 0xb3bf, MulticodecTag.Multihash),
    SKEIN1024_768("skein1024-768", 0xb3c0, MulticodecTag.Multihash),
    SKEIN1024_776("skein1024-776", 0xb3c1, MulticodecTag.Multihash),
    SKEIN1024_784("skein1024-784", 0xb3c2, MulticodecTag.Multihash),
    SKEIN1024_792("skein1024-792", 0xb3c3, MulticodecTag.Multihash),
    SKEIN1024_800("skein1024-800", 0xb3c4, MulticodecTag.Multihash),
    SKEIN1024_808("skein1024-808", 0xb3c5, MulticodecTag.Multihash),
    SKEIN1024_816("skein1024-816", 0xb3c6, MulticodecTag.Multihash),
    SKEIN1024_824("skein1024-824", 0xb3c7, MulticodecTag.Multihash),
    SKEIN1024_832("skein1024-832", 0xb3c8, MulticodecTag.Multihash),
    SKEIN1024_840("skein1024-840", 0xb3c9, MulticodecTag.Multihash),
    SKEIN1024_848("skein1024-848", 0xb3ca, MulticodecTag.Multihash),
    SKEIN1024_856("skein1024-856", 0xb3cb, MulticodecTag.Multihash),
    SKEIN1024_864("skein1024-864", 0xb3cc, MulticodecTag.Multihash),
    SKEIN1024_872("skein1024-872", 0xb3cd, MulticodecTag.Multihash),
    SKEIN1024_880("skein1024-880", 0xb3ce, MulticodecTag.Multihash),
    SKEIN1024_888("skein1024-888", 0xb3cf, MulticodecTag.Multihash),
    SKEIN1024_896("skein1024-896", 0xb3d0, MulticodecTag.Multihash),
    SKEIN1024_904("skein1024-904", 0xb3d1, MulticodecTag.Multihash),
    SKEIN1024_912("skein1024-912", 0xb3d2, MulticodecTag.Multihash),
    SKEIN1024_920("skein1024-920", 0xb3d3, MulticodecTag.Multihash),
    SKEIN1024_928("skein1024-928", 0xb3d4, MulticodecTag.Multihash),
    SKEIN1024_936("skein1024-936", 0xb3d5, MulticodecTag.Multihash),
    SKEIN1024_944("skein1024-944", 0xb3d6, MulticodecTag.Multihash),
    SKEIN1024_952("skein1024-952", 0xb3d7, MulticodecTag.Multihash),
    SKEIN1024_960("skein1024-960", 0xb3d8, MulticodecTag.Multihash),
    SKEIN1024_968("skein1024-968", 0xb3d9, MulticodecTag.Multihash),
    SKEIN1024_976("skein1024-976", 0xb3da, MulticodecTag.Multihash),
    SKEIN1024_984("skein1024-984", 0xb3db, MulticodecTag.Multihash),
    SKEIN1024_992("skein1024-992", 0xb3dc, MulticodecTag.Multihash),
    SKEIN1024_1000("skein1024-1000", 0xb3dd, MulticodecTag.Multihash),
    SKEIN1024_1008("skein1024-1008", 0xb3de, MulticodecTag.Multihash),
    SKEIN1024_1016("skein1024-1016", 0xb3df, MulticodecTag.Multihash),
    SKEIN1024_1024("skein1024-1024", 0xb3e0, MulticodecTag.Multihash),
    XXH_32("xxh-32", 0xb3e1, MulticodecTag.Hash),
    XXH_64("xxh-64", 0xb3e2, MulticodecTag.Hash),
    XXH3_64("xxh3-64", 0xb3e3, MulticodecTag.Hash),
    XXH3_128("xxh3-128", 0xb3e4, MulticodecTag.Hash),
    POSEIDON_BLS12_381_A2_FC1("poseidon-bls12_381-a2-fc1", 0xb401, MulticodecTag.Multihash),
    POSEIDON_BLS12_381_A2_FC1_SC("poseidon-bls12_381-a2-fc1-sc", 0xb402, MulticodecTag.Multihash),
    URDCA_2015_CANON("urdca-2015-canon", 0xb403, MulticodecTag.Ipld),
    SSZ("ssz", 0xb501, MulticodecTag.Serialization),
    SSZ_SHA2_256_BMT("ssz-sha2-256-bmt", 0xb502, MulticodecTag.Multihash),
    JSON_JCS("json-jcs", 0xb601, MulticodecTag.Ipld),
    ISCC("iscc", 0xcc01, MulticodecTag.Softhash),
    ZEROXCERT_IMPRINT_256("zeroxcert-imprint-256", 0xce11, MulticodecTag.Zeroxcert),
    NONSTANDARD_SIG("nonstandard-sig", 0xd000, MulticodecTag.Varsig),
    ES256K("es256k", 0xd0e7, MulticodecTag.Varsig),
    BLS_12381_G1_SIG("bls-12381-g1-sig", 0xd0ea, MulticodecTag.Varsig),
    BLS_12381_G2_SIG("bls-12381-g2-sig", 0xd0eb, MulticodecTag.Varsig),
    EDDSA("eddsa", 0xd0ed, MulticodecTag.Varsig),
    EIP_191("eip-191", 0xd191, MulticodecTag.Varsig),
    JWK_JCS_PUB("jwk_jcs-pub", 0xeb51, MulticodecTag.Key),
    FIL_COMMITMENT_UNSEALED("fil-commitment-unsealed", 0xf101, MulticodecTag.Filecoin),
    FIL_COMMITMENT_SEALED("fil-commitment-sealed", 0xf102, MulticodecTag.Filecoin),
    PLAINTEXTV2("plaintextv2", 0x706c61, MulticodecTag.Multiaddr),
    HOLOCHAIN_ADR_V0("holochain-adr-v0", 0x807124, MulticodecTag.Holochain),
    HOLOCHAIN_ADR_V1("holochain-adr-v1", 0x817124, MulticodecTag.Holochain),
    HOLOCHAIN_KEY_V0("holochain-key-v0", 0x947124, MulticodecTag.Holochain),
    HOLOCHAIN_KEY_V1("holochain-key-v1", 0x957124, MulticodecTag.Holochain),
    HOLOCHAIN_SIG_V0("holochain-sig-v0", 0xa27124, MulticodecTag.Holochain),
    HOLOCHAIN_SIG_V1("holochain-sig-v1", 0xa37124, MulticodecTag.Holochain),
    SKYNET_NS("skynet-ns", 0xb19910, MulticodecTag.Namespace),
    ARWEAVE_NS("arweave-ns", 0xb29910, MulticodecTag.Namespace),
    SUBSPACE_NS("subspace-ns", 0xb39910, MulticodecTag.Namespace),
    KUMANDRA_NS("kumandra-ns", 0xb49910, MulticodecTag.Namespace),
    ES256("es256", 0xd01200, MulticodecTag.Varsig),
    ES284("es284", 0xd01201, MulticodecTag.Varsig),
    ES512("es512", 0xd01202, MulticodecTag.Varsig),
    RS256("rs256", 0xd01205, MulticodecTag.Varsig);

    override fun toString(): String {
        return typeName
    }

    companion object {
        private val codeToName: MutableMap<Int, String> = TreeMap()
        private val nameToType: MutableMap<String, Multicodec> = TreeMap()
        private val codeToType: MutableMap<Int, Multicodec> = TreeMap()

        init {
            for (type in values()) {
                codeToName[type.code] = type.typeName
                nameToType[type.typeName] = type
                codeToType[type.code] = type
            }
        }

        fun codeToName(code: Int): Result<String> {
            val name = codeToName[code] ?: return Err("Unknown Multicodec code: $code")
            return Ok(name)
        }

        fun nameToType(name: String): Result<Multicodec> {
            val type = nameToType[name] ?: return Err("Unknown Multicodec name: $name")
            return Ok(type)
        }

        fun codeToType(code: Int): Result<Multicodec> {
            val type = codeToType[code] ?: return Err("Unknown Multicodec code: $code")
            return Ok(type)
        }
    }
}
