package com.javarush.jira;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;

@SpringBootTest
@ActiveProfiles("test")
@Sql(scripts = {"classpath:db/changelog-test.sql", "classpath:db/data-test.sql"}, config = @SqlConfig(encoding = "UTF-8"))
abstract class BaseTests {
}
