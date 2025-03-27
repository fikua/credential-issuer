package org.fikua.issuer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

@Profile("test")
@SpringBootTest
class IssuerApplicationTests {

	@Test
	void contextLoads() {
		IssuerApplication.main(new String[]{});
	}

}
