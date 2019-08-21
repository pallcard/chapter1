package cn.wishhust.chapter1.service;

import cn.wishhust.chapter1.helper.DatabaseHelper;
import cn.wishhust.chapter1.model.Customer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 单元测试
 */
public class CustomerServiceTest {

    private final CustomerService customerService;

    public CustomerServiceTest() {
        this.customerService = new CustomerService();
    }

    @Before
    public void init() throws IOException {
        DatabaseHelper.executeSqlFile("sql/customer_init.sql");
    }

    @Test
    public void getCustomerList() {
        List<Customer> customerList = customerService.getCustomerList();
        Assert.assertNotNull(customerList);
    }

    @Test
    public void getCustomer() {
        long id = 1;
        Customer customer = customerService.getCustomer(id);
        Assert.assertNotNull(customer);
    }

    @Test
    public void createCustomer() {
        Map<String, Object> fieldMap = new HashMap<>();
        fieldMap.put("name", "customer10");
        fieldMap.put("contact", "wangwu");
        fieldMap.put("telephone", "18112314141");
        boolean customer = customerService.createCustomer(fieldMap);
        Assert.assertTrue(customer);
    }

    @Test
    public void updateCustomer() {
        long id = 1;
        Map<String, Object> fidldMap = new HashMap<>();
        fidldMap.put("contact", "xiaoming");
        boolean result = customerService.updateCustomer(id, fidldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void deleteCustomer() {
        long id = 1;
        boolean result = customerService.deleteCustomer(id);
        Assert.assertTrue(result);
    }
}