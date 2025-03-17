package org.example.springfromscratch.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record MovieInfoResponse(MovieInfoResult movieInfoResult) {
    @JsonIgnoreProperties(ignoreUnknown = true)
    public record MovieInfoResult(MovieInfo movieInfo) {}
    @JsonIgnoreProperties(ignoreUnknown = true)
    public record MovieInfo(
            String showTm,
            List<Nation> nations,
            List<Genre> genres,
            List<Director> directors,
            List<Actor> actors
    ) {}

    @JsonIgnoreProperties(ignoreUnknown = true)
    public record Nation(String nationNm) {}
    @JsonIgnoreProperties(ignoreUnknown = true)
    public record Genre(String genreNm) {}
    @JsonIgnoreProperties(ignoreUnknown = true)
    public record Director(String peopleNm) {}
    @JsonIgnoreProperties(ignoreUnknown = true)
    public record Actor(String peopleNm) {}
}
