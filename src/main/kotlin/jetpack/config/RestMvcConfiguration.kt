package jetpack.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.core.mapping.RepositoryDetectionStrategy.RepositoryDetectionStrategies.ANNOTATED
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter

@Configuration
open class RestMvcConfiguration {

    @Bean
    open fun repositoryRestConfigurer(): RepositoryRestConfigurer {

        return object : RepositoryRestConfigurerAdapter() {

            override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration) {
                config.setBasePath("/api")
                config.setRepositoryDetectionStrategy(ANNOTATED);
            }
        }

    }
}