package com.leyou.search.client;

import com.leyou.LeyouSearchApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest(classes= LeyouSearchApplication.class)
@RunWith(SpringRunner.class)
public class CategoryClientTest {

    @Autowired
    private CategoryClient categoryClient;

    @Test
    public void testQueryCategories(){
        List<String> names = this.categoryClient.queryNamesByIds(Arrays.asList(1l, 2l, 3l));
        names.forEach(System.out::println);
    }
}