package br.ufpa.eas.tap.config;

import java.time.Duration;

import org.ehcache.config.builders.*;
import org.ehcache.jsr107.Eh107Configuration;

import io.github.jhipster.config.jcache.BeanClassLoaderAwareJCacheRegionFactory;
import io.github.jhipster.config.JHipsterProperties;

import org.springframework.boot.autoconfigure.cache.JCacheManagerCustomizer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.*;

@Configuration
@EnableCaching
public class CacheConfiguration {

    private final javax.cache.configuration.Configuration<Object, Object> jcacheConfiguration;

    public CacheConfiguration(JHipsterProperties jHipsterProperties) {
        BeanClassLoaderAwareJCacheRegionFactory.setBeanClassLoader(this.getClass().getClassLoader());
        JHipsterProperties.Cache.Ehcache ehcache =
            jHipsterProperties.getCache().getEhcache();

        jcacheConfiguration = Eh107Configuration.fromEhcacheCacheConfiguration(
            CacheConfigurationBuilder.newCacheConfigurationBuilder(Object.class, Object.class,
                ResourcePoolsBuilder.heap(ehcache.getMaxEntries()))
                .withExpiry(ExpiryPolicyBuilder.timeToLiveExpiration(Duration.ofSeconds(ehcache.getTimeToLiveSeconds())))
                .build());
    }

    @Bean
    public JCacheManagerCustomizer cacheManagerCustomizer() {
        return cm -> {
            cm.createCache(br.ufpa.eas.tap.repository.UserRepository.USERS_BY_LOGIN_CACHE, jcacheConfiguration);
            cm.createCache(br.ufpa.eas.tap.repository.UserRepository.USERS_BY_EMAIL_CACHE, jcacheConfiguration);
            cm.createCache(br.ufpa.eas.tap.domain.User.class.getName(), jcacheConfiguration);
            cm.createCache(br.ufpa.eas.tap.domain.Authority.class.getName(), jcacheConfiguration);
            cm.createCache(br.ufpa.eas.tap.domain.User.class.getName() + ".authorities", jcacheConfiguration);
            cm.createCache(br.ufpa.eas.tap.domain.Orgao.class.getName(), jcacheConfiguration);
            cm.createCache(br.ufpa.eas.tap.domain.Orgao.class.getName() + ".operacoes", jcacheConfiguration);
            cm.createCache(br.ufpa.eas.tap.domain.Funcionario.class.getName(), jcacheConfiguration);
            cm.createCache(br.ufpa.eas.tap.domain.Cargo.class.getName(), jcacheConfiguration);
            cm.createCache(br.ufpa.eas.tap.domain.Cargo.class.getName() + ".funcionarios", jcacheConfiguration);
            cm.createCache(br.ufpa.eas.tap.domain.Departamento.class.getName(), jcacheConfiguration);
            cm.createCache(br.ufpa.eas.tap.domain.Departamento.class.getName() + ".agentes", jcacheConfiguration);
            cm.createCache(br.ufpa.eas.tap.domain.Equipamento.class.getName(), jcacheConfiguration);
            cm.createCache(br.ufpa.eas.tap.domain.Operacao.class.getName(), jcacheConfiguration);
            cm.createCache(br.ufpa.eas.tap.domain.Operacao.class.getName() + ".fiscalizacoes", jcacheConfiguration);
            cm.createCache(br.ufpa.eas.tap.domain.Operacao.class.getName() + ".locais", jcacheConfiguration);
            cm.createCache(br.ufpa.eas.tap.domain.Operacao.class.getName() + ".equipamentos", jcacheConfiguration);
            cm.createCache(br.ufpa.eas.tap.domain.Operacao.class.getName() + ".departamentos", jcacheConfiguration);
            cm.createCache(br.ufpa.eas.tap.domain.Operacao.class.getName() + ".veiculos", jcacheConfiguration);
            cm.createCache(br.ufpa.eas.tap.domain.Fiscalizacao.class.getName(), jcacheConfiguration);
            cm.createCache(br.ufpa.eas.tap.domain.Fiscalizacao.class.getName() + ".documentacoes", jcacheConfiguration);
            cm.createCache(br.ufpa.eas.tap.domain.Fiscalizacao.class.getName() + ".locais", jcacheConfiguration);
            cm.createCache(br.ufpa.eas.tap.domain.Fiscalizacao.class.getName() + ".condutores", jcacheConfiguration);
            cm.createCache(br.ufpa.eas.tap.domain.Fiscalizacao.class.getName() + ".veiculos", jcacheConfiguration);
            cm.createCache(br.ufpa.eas.tap.domain.Municipio.class.getName(), jcacheConfiguration);
            cm.createCache(br.ufpa.eas.tap.domain.Municipio.class.getName() + ".locais", jcacheConfiguration);
            cm.createCache(br.ufpa.eas.tap.domain.Localizacao.class.getName(), jcacheConfiguration);
            cm.createCache(br.ufpa.eas.tap.domain.Documentacao.class.getName(), jcacheConfiguration);
            cm.createCache(br.ufpa.eas.tap.domain.Condutor.class.getName(), jcacheConfiguration);
            cm.createCache(br.ufpa.eas.tap.domain.Veiculo.class.getName(), jcacheConfiguration);
            // jhipster-needle-ehcache-add-entry
        };
    }
}
