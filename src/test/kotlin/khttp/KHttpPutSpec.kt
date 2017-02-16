/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.github.markhu.khttp

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertEquals

class KHttpPutSpec : Spek({
    given("a put request") {
        val url = "https://httpbin.org/put"
        val request = put(url)
        on("accessing the json") {
            val json = request.jsonObject
            it("should have the same url") {
                assertEquals(url, json.getString("url"))
            }
        }
    }
})
