package org.openapitools.api

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import java.util.Optional

@javax.annotation.Generated(value = ["org.openapitools.codegen.languages.KotlinSpringServerCodegen"], comments = "Generator version: 7.4.0-SNAPSHOT")
@Controller
@RequestMapping("\${openapi.openAPIPetstore.base-path:/v2}")
class UserApiController(
        @org.springframework.beans.factory.annotation.Autowired(required = false) delegate: UserApiDelegate?
) : UserApi {
    private lateinit var delegate: UserApiDelegate

    init {
        this.delegate = Optional.ofNullable(delegate).orElse(object : UserApiDelegate {})
    }

    override fun getDelegate(): UserApiDelegate = delegate
}
