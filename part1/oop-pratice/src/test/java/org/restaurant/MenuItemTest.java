package org.restaurant;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MenuItemTest {

    @Test
    public void creatTest() throws Exception{
        Assertions.assertThatCode(() -> new MenuItem("만두", 5000))
                .doesNotThrowAnyException();
    }
}
