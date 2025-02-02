// package com.scalable.app;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertFalse;
// import static org.junit.jupiter.api.Assertions.assertNotNull;
// import static org.junit.jupiter.api.Assertions.assertNull;
// import static org.junit.jupiter.api.Assertions.assertTrue;

// import java.util.HashMap;
// import java.util.Map;

// import org.springframework.http.MediaType;
// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
// import org.springframework.test.web.servlet.MockMvc;
// import org.springframework.test.web.servlet.MvcResult;
// import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
// import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

// import com.fasterxml.jackson.databind.ObjectMapper;
// import com.scalable.components.Cart;
// import com.scalable.services.CartService;

// @WebMvcTest
// class AppApplicationTests {
// 	@Autowired
//     private MockMvc mockMvc;

// 	@Autowired
// 	private ObjectMapper objectMapper;
// 	@Autowired
// 	private CartService cartService;

// 	@Test
// 	void contextLoads() {
// 	}

// 	 @Test
//     void testEditItemInCart_ItemExists() {
//         // Test case where the item exists and is edited successfully
//         Cart result = cartService.editItemInCart(1, "item1", "newItem");

//         assertNotNull(result, "Cart should not be null");
//         assertTrue(result.getItems().contains("newItem"), "New item should be added");
//         assertFalse(result.getItems().contains("item1"), "Old item should be removed");
//     }

//     @Test
//     void testEditItemInCart_ItemNotFound() {
//         // Test case where the cart doesn't exist
//         Cart result = cartService.editItemInCart(4, "item1", "newItem");

//         assertNull(result, "Cart should be null if cartId doesn't exist");
//     }

// 	@Test
//     void testEditItemInCart_CartNotFound() throws Exception {
//         Map<String, Object> requestBody = new HashMap<>();
//         requestBody.put("cartId", 1); // Non-existing cartId
//         requestBody.put("item", "item1");
//         requestBody.put("newItem", "newItem");


//          MvcResult result = mockMvc.perform(MockMvcRequestBuilders
//                     .post("/editItemInCart")
//                     .content(objectMapper.writeValueAsString(requestBody))
//                     .contentType(MediaType.APPLICATION_JSON))
//             .andExpect(MockMvcResultMatchers.status().isOk())  // Check if the status is OK (200)
//             .andReturn();

// 		String responseContent = result.getResponse().getContentAsString();

// 		Cart responseCart = objectMapper.readValue(responseContent, Cart.class);
// 		assertNotNull(responseCart);
// 		assertEquals(1, responseCart.getId());
// 		assertTrue(responseCart.getItems().contains("newItem"));
//     }

	

// }
