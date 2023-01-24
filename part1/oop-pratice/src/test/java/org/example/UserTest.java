package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @DisplayName("패스워드 초기화한다.")
    @Test
    public void passwordTest() throws Exception{
        //given
        User user = new User();

        //when
        user.initPassword(new CorrectFixedPasswordGenerator()); //검증을 위해 생성
        user.initPassword(()->"abcdefgh"); //검증을 위해 생성

        //then
        assertThat(user.getPassword()).isNotNull();
    }


    @DisplayName("패스워드가 요구사항에 부합되지 않아 초기화가 되지 않는다")
    @Test
    public void passwordTest2() throws Exception{
        //given
        User user = new User();

        //when
        user.initPassword(new WrongFixedPasswordGenerator()); //검증을 위해 생성
        user.initPassword(()->"ab"); //검증을 위해 생성

        //then
        assertThat(user.getPassword()).isNull();
    }


}