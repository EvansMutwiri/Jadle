package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {
    Restaurant testRestaurant = new Restaurant("Chizen", "Moi Avenue", "00100", "+254790", "chizenx.com", "sales@chizenx.com");
    Restaurant testRestaurantTwo = new Restaurant("ChickInn", "Moi Avenue", "00100", "+254799");
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void getName(){
        assertEquals("Chizen" , testRestaurant.getName());
        assertEquals("ChickInn", testRestaurantTwo.getName());
    }

    @Test
    public void getAddress(){
        assertEquals("Moi Avenue" , testRestaurant.getAddress());
        assertEquals("Moi Avenue", testRestaurantTwo.getAddress());
    }

    @Test
    public void getZipcode(){
        assertEquals("00100" , testRestaurant.getZipcode());
        assertEquals("00100", testRestaurantTwo.getZipcode());
    }

    @Test
    public void getPhone(){
        assertEquals("+254790" , testRestaurant.getPhone());
        assertEquals("+254799", testRestaurantTwo.getPhone());
    }

    @Test
    public void getWebsite(){
        assertEquals("chizenx.com" , testRestaurant.getWebsite());
    }

    @Test
    public void getEmail(){
        assertEquals("sales@chizenx.com" , testRestaurant.getEmail());
    }

    @Test
    public void setName(){
        testRestaurant.setName("KFC");
        testRestaurantTwo.setName("Sub");
        assertEquals("KFC" , testRestaurant.getName());
        assertEquals("Sub", testRestaurantTwo.getName());
    }

    @Test
    public void setAddress(){
        testRestaurant.setAddress("Kimathi");
        testRestaurantTwo.setAddress("Mall Way");
        assertEquals("Kimathi" , testRestaurant.getAddress());
        assertEquals("Mall Way", testRestaurantTwo.getAddress());
    }

    @Test
    public void setZipcode(){
        testRestaurant.setZipcode("00200");
        testRestaurantTwo.setZipcode("00300");
        assertEquals("00200" , testRestaurant.getZipcode());
        assertEquals("00300", testRestaurantTwo.getZipcode());
    }

    @Test
    public void setPhone(){
        testRestaurantTwo.setPhone("+2547200");
        testRestaurant.setPhone("+2547100");
        assertEquals("+2547100" , testRestaurant.getPhone());
        assertEquals("+2547200", testRestaurantTwo.getPhone());
    }

    @Test
    public void setWebsite(){
        testRestaurant.setWebsite("kfc.eat");
        assertEquals("kfc.eat" , testRestaurant.getWebsite());
    }

    @Test
    public void setEmail(){
        testRestaurant.setEmail("sales@kfc.eat");
        assertEquals("sales@kfc.eat" , testRestaurant.getEmail());
    }
}