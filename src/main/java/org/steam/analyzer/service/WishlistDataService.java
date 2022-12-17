package org.steam.analyzer.service;


import io.netty.handler.codec.http.HttpMethod;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.SneakyThrows;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.URI;

@Getter
@Setter
@RequiredArgsConstructor
@Service
public class WishlistDataService {

    @SneakyThrows
    public String getWishListByUserId(final String userId) {
        String uri = "https://store.steampowered.com/wishlist/profiles/" + userId + "/wishlistdata/";

        WebClient client = WebClient.create();
        return client.get()
                .uri(new URI(uri))
//                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
//                .body(BodyInserters.fromFormData())
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

}
