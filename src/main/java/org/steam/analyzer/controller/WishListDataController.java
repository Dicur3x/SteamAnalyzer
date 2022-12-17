package org.steam.analyzer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.steam.analyzer.service.WishlistDataService;

@RestController
@RequestMapping("/api/wishlist/")
@RequiredArgsConstructor
public class WishListDataController {

    private final WishlistDataService wishlistDataService;

    @GetMapping("{id}")
    public ResponseEntity<String> getWishListByUserId(@PathVariable("id") String userId) {
        return ResponseEntity.ok(wishlistDataService.getWishListByUserId(userId));
    }
}
