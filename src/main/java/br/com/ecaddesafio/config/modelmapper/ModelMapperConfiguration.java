package br.com.ecaddesafio.config.modelmapper;

import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@ConditionalOnClass(ModelMapper.class)
@Configuration
public class ModelMapperConfiguration {

    @Bean
    @ConditionalOnMissingBean(ModelMapperFactoryBean.class)
    public ModelMapperFactoryBean modelMapperFactoryBean() {

        return new ModelMapperFactoryBean();
    }
}
