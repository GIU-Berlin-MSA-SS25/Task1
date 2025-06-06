// package com.scalable.app;
//
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertFalse;
// import static org.junit.jupiter.api.Assertions.assertNotNull;
// import static org.junit.jupiter.api.Assertions.assertNull;
// import static org.junit.jupiter.api.Assertions.assertTrue;
//
//
// import org.springframework.http.MediaType;
// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.test.web.servlet.MockMvc;
// import org.springframework.test.web.servlet.MvcResult;
// import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
// import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
// import com.fasterxml.jackson.databind.ObjectMapper;
// import com.scalable.app.model.Cart;
// import com.scalable.app.service.CartService;
//
// @SpringBootTest
// @AutoConfigureMockMvc
// class AppApplicationTests {
//    
// 	@Autowired
//     private MockMvc mockMvc;
//
// 	@Autowired
// 	private ObjectMapper objectMapper;
//
// 	@Autowired
// 	private CartService cartService;
//
// 	@Test
// 	void contextLoads() {
// 	}
//    
//
//
// 	 @Test
//     void testEditItemInCart_UpdatedCart() {
//         Cart result = cartService.editItemInCart(1, "item1", "newItem1");
//
//         assertNotNull(result, "Cart should not be null");
//         assertTrue(result.getItems().contains("newItem1"), "New item should be added");
//         assertFalse(result.getItems().contains("item1"), "Old item should be removed");
//     }
//
//     @Test
//     void testEditItemInCart_CartNotFound() {
//         Cart result = cartService.editItemInCart(4, "item1", "newItem");
//
//         assertNull(result, "Cart should be null if cartId doesn't exist");
//     }
//
// 	@Test
//     void testEditItemInCartEndpoint() throws Exception {
//          MvcResult result = mockMvc.perform(MockMvcRequestBuilders
//                     .post("/editItemInCart")
//                     .param("cartId","2")
//                     .param("item","item3")
//                     .param("newItem","newItem3")
//                     .contentType(MediaType.APPLICATION_JSON))
//             .andExpect(MockMvcResultMatchers.status().isOk())  // Check if the status is OK (200)
//             .andReturn();
//
// 		String responseContent = result.getResponse().getContentAsString();
//
// 		Cart responseCart = objectMapper.readValue(responseContent, Cart.class);
// 		assertNotNull(responseCart);
// 		assertEquals(2, responseCart.getId());
// 		assertTrue(responseCart.getItems().contains("newItem3"));
//     }
//
//	
//
// }
