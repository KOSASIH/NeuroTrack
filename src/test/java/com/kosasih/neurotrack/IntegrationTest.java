package com.kosasih.neurotrack;

import com.kosasih.neurotrack.NeuroTrackApp;
import com.kosasih.neurotrack.config.AsyncSyncConfiguration;
import com.kosasih.neurotrack.config.EmbeddedElasticsearch;
import com.kosasih.neurotrack.config.EmbeddedKafka;
import com.kosasih.neurotrack.config.EmbeddedSQL;
import com.kosasih.neurotrack.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { NeuroTrackApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}
