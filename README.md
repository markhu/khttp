# khttp
Thanks to: [![Documentation status](https://readthedocs.org/projects/khttp/badge/?version=latest)](http://khttp.readthedocs.org/en/latest/?badge=latest)

Now available for your JVM: `khttp` is a simple library for HTTP requests in Kotlin. It functions similarly to Python's `requests` module.

```kotlin
import com.khttp.get

fun main(args: Array<out String>) {
    // Get our IP
    println(get("http://httpbin.org/ip").jsonObject.getString("origin"))
    // Get our IP in a simpler way
    println(get("http://icanhazip.com").text)
}
```

