package cn.edu.hqu.javaee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import cn.edu.hqu.javaee.domain.cd.CompactDisc;
import cn.edu.hqu.javaee.domain.cd.impl.CDPlayer;

@Configuration
public class CDPlayerConfig {
	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc) {
		//直接注入
		return new CDPlayer(compactDisc);
	}
}
