package com.alibaba.fastjson2

import com.alibaba.fastjson2.filter.Filter

/**
 * Parse JSON [String] into [T]
 *
 * E.g.
 * ```
 *   val text = "..."
 *   val data = text.to<User>()
 * ```
 *
 * @return [T]?
 * @since 2.0.3
 */
@Suppress("HasPlatformType")
inline fun <reified T> String.to() =
    JSON.parseObject(this, T::class.java)

/**
 * Parse JSON [ByteArray] into [T]
 *
 * E.g.
 * ```
 *   val text = "..."
 *   val data = text.to<User>()
 * ```
 *
 * @return [T]?
 * @since 2.0.3
 */
@Suppress("HasPlatformType")
inline fun <reified T> ByteArray.to() =
    JSON.parseObject(this, T::class.java)

/**
 * Verify the [String] is JSON `Object`
 *
 * E.g.
 * ```
 *   val text = ...
 *   val bool = text.isJSONObject()
 * ```
 *
 * @receiver [Boolean]
 * @since 2.0.3
 */
@Suppress(
    "HasPlatformType",
    "NOTHING_TO_INLINE"
)
inline fun String?.isJSONObject() = JSON.isValidObject(this)

/**
 * Verify the [ByteArray] is JSON `Object`
 *
 * E.g.
 * ```
 *   val text = ...
 *   val bool = text.isJSONObject()
 * ```
 *
 * @receiver [Boolean]
 * @since 2.0.3
 */
@Suppress(
    "HasPlatformType",
    "NOTHING_TO_INLINE"
)
inline fun ByteArray?.isJSONObject() = JSON.isValidObject(this)

/**
 * Verify the [String] is JSON `Array`
 *
 * E.g.
 * ```
 *   val text = ...
 *   val bool = text.isJSONArray()
 * ```
 *
 * @receiver [Boolean]
 * @since 2.0.3
 */
@Suppress(
    "HasPlatformType",
    "NOTHING_TO_INLINE"
)
inline fun String?.isJSONArray() = JSON.isValidArray(this)

/**
 * Verify the [ByteArray] is JSON `Array`
 *
 * E.g.
 * ```
 *   val text = ...
 *   val bool = text.isJSONArray()
 * ```
 *
 * @receiver Any?
 * @since 2.0.3
 */
@Suppress(
    "HasPlatformType",
    "NOTHING_TO_INLINE"
)
inline fun ByteArray?.isJSONArray() = JSON.isValidArray(this)

/**
 * Parse JSON [String] into [JSONArray] or [JSONObject]
 *
 * @return [JSONArray] or [JSONObject]
 * @since 2.0.3
 */
@Suppress(
    "HasPlatformType",
    "NOTHING_TO_INLINE"
)
inline fun String?.parse() =
    JSON.parse(this)

/**
 * Parse JSON [String] into [JSONObject]
 *
 * E.g.
 * ```
 *   val text = "..."
 *   val data = text.parseObject()
 * ```
 *
 * @return [JSONObject]?
 * @since 2.0.3
 */
@Suppress(
    "HasPlatformType",
    "NOTHING_TO_INLINE"
)
inline fun String?.parseObject() =
    JSON.parseObject(this)

/**
 * Parse JSON [String] into [T]
 *
 * E.g.
 * ```
 *   val text = "..."
 *   val data = text.parseObject<User>()
 * ```
 *
 * @return [T]?
 * @since 2.0.3
 */
@Suppress("HasPlatformType")
inline fun <reified T> String?.parseObject() =
    JSON.parseObject(
        this, T::class.java
    )

/**
 * Parse JSON [String] into [T]
 *
 * @param features features to be enabled in parsing
 * @return [T]?
 * @since 2.0.3
 */
@Suppress("HasPlatformType")
inline fun <reified T> String?.parseObject(
    vararg features: JSONReader.Feature
) = JSON.parseObject(
    this, T::class.java, *features
)

/**
 * Parse JSON [String] into [T]
 *
 * @param features features to be enabled in parsing
 * @return [T]?
 * @since 2.0.3
 */
@Suppress("HasPlatformType")
inline fun <reified T> String?.parseObject(
    filter: JSONReader.Filter,
    vararg features: JSONReader.Feature
) = JSON.parseObject(
    this, T::class.java, filter, *features
)

/**
 * Parse JSON [String] into [JSONArray]
 *
 * E.g.
 * ```
 *   val text = "..."
 *   val data = text.parseArray()
 * ```
 *
 * @return [JSONArray]?
 * @since 2.0.3
 */
@Suppress(
    "HasPlatformType",
    "NOTHING_TO_INLINE"
)
inline fun String?.parseArray() =
    JSON.parseArray(this)

/**
 * Parse JSON [String] into [List]
 *
 * E.g.
 * ```
 *   val text = "..."
 *   val list = text.parseArray<User>()
 * ```
 *
 * @return [List]?
 * @since 2.0.3
 */
@Suppress("HasPlatformType")
inline fun <reified T> String?.parseArray() =
    JSON.parseArray<T>(
        this, T::class.java
    )

/**
 * Parse JSON [String] into [List]
 *
 * @param features features to be enabled in parsing
 * @return [List]?
 * @since 2.0.3
 */
@Suppress("HasPlatformType")
inline fun <reified T> String?.parseArray(
    vararg features: JSONReader.Feature
) = JSON.parseArray<T>(
    this, T::class.java, *features
)

/**
 * Serialize [Any]? to JSON [String]
 *
 * E.g.
 * ```
 *   val obj = ...
 *   val text = obj.toJSONString()
 * ```
 *
 * @receiver [String]
 * @since 2.0.3
 */
@Suppress(
    "HasPlatformType",
    "NOTHING_TO_INLINE"
)
inline fun Any?.toJSONString() = JSON.toJSONString(this)

/**
 * Serialize [Any]? to JSON [String]
 *
 * @receiver [String]
 * @since 2.0.3
 */
@Suppress(
    "HasPlatformType",
    "NOTHING_TO_INLINE"
)
inline fun Any?.toJSONString(
    filter: Filter,
    vararg features: JSONWriter.Feature
) = JSON.toJSONString(
    this, filter, *features
)

/**
 * Serialize [Any]? to JSON [String]
 *
 * @receiver [String]
 * @since 2.0.3
 */
@Suppress(
    "HasPlatformType",
    "NOTHING_TO_INLINE"
)
inline fun Any?.toJSONString(
    filter: Array<out Filter>
) = JSON.toJSONString(
    this, filter
)

/**
 * Serialize [Any]? to JSON [String]
 *
 * @receiver [String]
 * @since 2.0.3
 */
@Suppress(
    "HasPlatformType",
    "NOTHING_TO_INLINE"
)
inline fun Any?.toJSONString(
    filter: Array<out Filter>,
    vararg features: JSONWriter.Feature
) = JSON.toJSONString(
    this, filter, *features
)

/**
 * Serialize [Any]? to JSON [String]
 *
 * @receiver [String]
 * @since 2.0.3
 */
@Suppress(
    "HasPlatformType",
    "NOTHING_TO_INLINE"
)
inline fun Any?.toJSONString(
    vararg features: JSONWriter.Feature
) = JSON.toJSONString(
    this, *features
)

/**
 * Serialize [Any]? to JSON [ByteArray]
 *
 * E.g.
 * ```
 *   val obj = ...
 *   val text = obj.toJSONByteArray()
 * ```
 *
 * @receiver [ByteArray]
 * @since 2.0.3
 */
@Suppress(
    "HasPlatformType",
    "NOTHING_TO_INLINE"
)
inline fun Any?.toJSONByteArray() = JSON.toJSONBytes(this)

/**
 * Serialize [Any]? to JSON [ByteArray]
 *
 * @receiver [ByteArray]
 * @since 2.0.3
 */
@Suppress(
    "HasPlatformType",
    "NOTHING_TO_INLINE"
)
inline fun Any?.toJSONByteArray(
    filter: Array<out Filter>
) = JSON.toJSONBytes(
    this, filter
)

/**
 * Serialize [Any]? to JSON [ByteArray]
 *
 * @receiver [ByteArray]
 * @since 2.0.3
 */
@Suppress(
    "HasPlatformType",
    "NOTHING_TO_INLINE"
)
inline fun Any?.toJSONByteArray(
    filter: Array<out Filter>,
    vararg features: JSONWriter.Feature
) = JSON.toJSONBytes(
    this, filter, *features
)
