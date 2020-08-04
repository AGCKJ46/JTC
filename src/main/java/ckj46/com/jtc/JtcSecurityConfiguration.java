package ckj46.com.jtc;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class JtcSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/api/secured/**")
                .authenticated()
                .and()
                .formLogin()
                .and()
                .httpBasic();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("ag")
                .password("{bcrypt}$2y$06$day85wGo9n/ob8a/1HdQyuaMYi7J5upoT2sFeuHUtI.eCVFlN5rOq")
                .roles("USER")
                .and()
                .withUser("admin")
                .password("{bcrypt}$2y$06$day85wGo9n/ob8a/1HdQyuaMYi7J5upoT2sFeuHUtI.eCVFlN5rOq")
                .roles("ADMIN");
    }


}
