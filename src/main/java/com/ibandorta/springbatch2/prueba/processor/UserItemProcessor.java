package com.ibandorta.springbatch2.prueba.processor;

import com.ibandorta.springbatch2.prueba.model.User;
import org.springframework.batch.item.ItemProcessor;

public class UserItemProcessor implements ItemProcessor<User,User> {

    @Override
    public User process(User user) throws Exception {
        user.setName(user.getName().toUpperCase());
        return user;
    }


}
